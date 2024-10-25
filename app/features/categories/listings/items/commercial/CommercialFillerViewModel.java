package com.forsale.app.features.categories.listings.items.commercial;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.FillerType;
import g00.l;
import kotlin.jvm.internal.o;
import qc.b;
import t9.r0;
import wz.p;
/* compiled from: CommercialFillerViewModel.kt */
/* loaded from: classes2.dex */
public final class CommercialFillerViewModel extends b<p> {

    /* renamed from: c  reason: collision with root package name */
    private final ListingsResponse.UISettings f30591c;

    /* renamed from: d  reason: collision with root package name */
    private final l<FillerType, p> f30592d;

    /* renamed from: e  reason: collision with root package name */
    private final OneShotEventHandler<String> f30593e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CommercialFillerViewModel(ListingsResponse.UISettings settings, l<? super FillerType, p> analytics) {
        super(r0.I5, null);
        o.i(settings, "settings");
        o.i(analytics, "analytics");
        this.f30591c = settings;
        this.f30592d = analytics;
        this.f30593e = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<String> e() {
        return this.f30593e;
    }

    public final ListingsResponse.UISettings f() {
        return this.f30591c;
    }

    public final void g() {
        h(new l<String, p>() { // from class: com.forsale.app.features.categories.listings.items.commercial.CommercialFillerViewModel$onClickEvent$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String it2) {
                o.i(it2, "it");
                CommercialFillerViewModel.this.e().i(it2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        });
    }

    public final void h(l<? super String, p> onClicked) {
        ListingsResponse.UISettings.FillersSettings.Commercial commercial2;
        String phone;
        boolean z11;
        o.i(onClicked, "onClicked");
        ListingsResponse.UISettings.FillersSettings fillersSettings = this.f30591c.getFillersSettings();
        if (fillersSettings != null && (commercial2 = fillersSettings.getCommercial()) != null && (phone = commercial2.getPhone()) != null) {
            if (phone.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                phone = null;
            }
            if (phone != null) {
                onClicked.invoke(phone);
                this.f30592d.invoke(FillerType.COMMERCIAL);
            }
        }
    }
}

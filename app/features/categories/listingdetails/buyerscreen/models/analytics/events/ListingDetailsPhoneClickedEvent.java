package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.h;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsPhoneClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsPhoneClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f26363a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsModel f26364b;

    /* renamed from: c  reason: collision with root package name */
    private final ItemArgs f26365c;

    /* renamed from: d  reason: collision with root package name */
    private final h f26366d;

    public ListingDetailsPhoneClickedEvent(String phoneNumber, DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(phoneNumber, "phoneNumber");
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26363a = phoneNumber;
        this.f26364b = detailsModel;
        this.f26365c = itemArgs;
        this.f26366d = h.f54765a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsPhoneClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                String str;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsPhoneClickedEvent.this.f26364b;
                itemArgs = ListingDetailsPhoneClickedEvent.this.f26365c;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                str = ListingDetailsPhoneClickedEvent.this.f26363a;
                invoke.c("PhoneNumber", str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    /* renamed from: e */
    public h getKey() {
        return this.f26366d;
    }
}

package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.f;
import g00.l;
import kotlin.jvm.internal.o;
import u9.b;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsMapClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsMapClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26354a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26355b;

    /* renamed from: c  reason: collision with root package name */
    private final b f26356c;

    public ListingDetailsMapClickedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26354a = detailsModel;
        this.f26355b = itemArgs;
        this.f26356c = f.f54763a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsMapClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsMapClickedEvent.this.f26354a;
                itemArgs = ListingDetailsMapClickedEvent.this.f26355b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    public b getKey() {
        return this.f26356c;
    }
}

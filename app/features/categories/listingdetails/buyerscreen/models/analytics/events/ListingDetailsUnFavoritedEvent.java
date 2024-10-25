package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.o;
import g00.l;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsUnFavoritedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsUnFavoritedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26385a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26386b;

    /* renamed from: c  reason: collision with root package name */
    private final o f26387c;

    public ListingDetailsUnFavoritedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        kotlin.jvm.internal.o.i(detailsModel, "detailsModel");
        kotlin.jvm.internal.o.i(itemArgs, "itemArgs");
        this.f26385a = detailsModel;
        this.f26386b = itemArgs;
        this.f26387c = o.f54772a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsUnFavoritedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                kotlin.jvm.internal.o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsUnFavoritedEvent.this.f26385a;
                itemArgs = ListingDetailsUnFavoritedEvent.this.f26386b;
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
    /* renamed from: d */
    public o getKey() {
        return this.f26387c;
    }
}

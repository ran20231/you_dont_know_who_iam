package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.p;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import zz.a;
/* compiled from: ListingDetailsVisitedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsVisitedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26389a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26390b;

    /* renamed from: c  reason: collision with root package name */
    private final p f26391c;

    public ListingDetailsVisitedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26389a = detailsModel;
        this.f26390b = itemArgs;
        this.f26391c = p.f54773a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsVisitedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsVisitedEvent.this.f26389a;
                itemArgs = ListingDetailsVisitedEvent.this.f26390b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return wz.p.f75480a;
            }
        });
    }

    @Override // u9.c
    /* renamed from: d */
    public p getKey() {
        return this.f26391c;
    }
}

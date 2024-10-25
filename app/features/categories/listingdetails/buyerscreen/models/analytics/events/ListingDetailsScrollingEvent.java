package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.j;
import eb.s;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsScrollingEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsScrollingEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26372a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26373b;

    /* renamed from: c  reason: collision with root package name */
    private final s f26374c;

    /* renamed from: d  reason: collision with root package name */
    private final j f26375d;

    public ListingDetailsScrollingEvent(DetailsModel detailsModel, ItemArgs itemArgs, s scrollingAnalyticsDataModel) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        o.i(scrollingAnalyticsDataModel, "scrollingAnalyticsDataModel");
        this.f26372a = detailsModel;
        this.f26373b = itemArgs;
        this.f26374c = scrollingAnalyticsDataModel;
        this.f26375d = j.f54767a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsScrollingEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                s sVar;
                s sVar2;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsScrollingEvent.this.f26372a;
                itemArgs = ListingDetailsScrollingEvent.this.f26373b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                String key = ListingDetailsScrollingNewParams.LISTING_MAX_VISITED_SECTION_NAME.getKey();
                sVar = ListingDetailsScrollingEvent.this.f26374c;
                invoke.c(key, sVar.b());
                String key2 = ListingDetailsScrollingNewParams.LISTING_MAX_VISITED_SECTION_NUMBER.getKey();
                sVar2 = ListingDetailsScrollingEvent.this.f26374c;
                invoke.c(key2, Integer.valueOf(sVar2.c()));
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
    public j getKey() {
        return this.f26375d;
    }
}

package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.a;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
/* compiled from: ListingDetailsCallClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsCallClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26326a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26327b;

    /* renamed from: c  reason: collision with root package name */
    private final a f26328c;

    public ListingDetailsCallClickedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26326a = detailsModel;
        this.f26327b = itemArgs;
        this.f26328c = a.f54758a;
    }

    @Override // u9.c
    public Object a(zz.a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsCallClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsCallClickedEvent.this.f26326a;
                itemArgs = ListingDetailsCallClickedEvent.this.f26327b;
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
    public a getKey() {
        return this.f26328c;
    }
}

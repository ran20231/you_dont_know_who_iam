package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.i;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsReportAbuseEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsReportAbuseEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26368a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26369b;

    /* renamed from: c  reason: collision with root package name */
    private final i f26370c;

    public ListingDetailsReportAbuseEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26368a = detailsModel;
        this.f26369b = itemArgs;
        this.f26370c = i.f54766a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsReportAbuseEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsReportAbuseEvent.this.f26368a;
                itemArgs = ListingDetailsReportAbuseEvent.this.f26369b;
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
    public i getKey() {
        return this.f26370c;
    }
}

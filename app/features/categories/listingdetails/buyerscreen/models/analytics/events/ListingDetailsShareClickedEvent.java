package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.m;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: ListingDetailsShareClickedEvent.kt */
/* loaded from: classes2.dex */
public final class ListingDetailsShareClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26377a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26378b;

    /* renamed from: c  reason: collision with root package name */
    private final m f26379c;

    public ListingDetailsShareClickedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26377a = detailsModel;
        this.f26378b = itemArgs;
        this.f26379c = m.f54770a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsShareClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                DetailsModel detailsModel2;
                o.i(invoke, "$this$invoke");
                detailsModel = ListingDetailsShareClickedEvent.this.f26377a;
                itemArgs = ListingDetailsShareClickedEvent.this.f26378b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                detailsModel2 = ListingDetailsShareClickedEvent.this.f26377a;
                List<String> l11 = detailsModel2.d().l();
                if (l11 != null) {
                    invoke.c("SellerPhoneNumbers", l11);
                }
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
    public m getKey() {
        return this.f26379c;
    }
}

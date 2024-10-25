package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.DetailsSource;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.t;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: SellerProfileVisitedEvent.kt */
/* loaded from: classes2.dex */
public final class SellerProfileVisitedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26402a;

    /* renamed from: b  reason: collision with root package name */
    private final ItemArgs f26403b;

    /* renamed from: c  reason: collision with root package name */
    private final t f26404c;

    public SellerProfileVisitedEvent(DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26402a = detailsModel;
        this.f26403b = itemArgs;
        this.f26404c = t.f54779a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.SellerProfileVisitedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                ItemArgs itemArgs2;
                DetailsModel detailsModel2;
                String firstName;
                o.i(invoke, "$this$invoke");
                detailsModel = SellerProfileVisitedEvent.this.f26402a;
                itemArgs = SellerProfileVisitedEvent.this.f26403b;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                DetailsSource.a aVar2 = DetailsSource.Companion;
                itemArgs2 = SellerProfileVisitedEvent.this.f26403b;
                invoke.c("ProfileVisitSource", aVar2.a(itemArgs2.c()).getValue());
                detailsModel2 = SellerProfileVisitedEvent.this.f26402a;
                BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel2.d().F();
                if (F != null && (firstName = F.getFirstName()) != null) {
                    invoke.c("SellerName", firstName);
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
    public t getKey() {
        return this.f26404c;
    }
}

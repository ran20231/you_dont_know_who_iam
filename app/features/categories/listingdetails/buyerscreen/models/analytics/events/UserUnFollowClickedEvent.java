package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.DetailsSource;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import eb.v;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: UserUnFollowClickedEvent.kt */
/* loaded from: classes2.dex */
public final class UserUnFollowClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f26411a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsModel f26412b;

    /* renamed from: c  reason: collision with root package name */
    private final ItemArgs f26413c;

    /* renamed from: d  reason: collision with root package name */
    private final v f26414d;

    public UserUnFollowClickedEvent(String followerPhoneNumber, DetailsModel detailsModel, ItemArgs itemArgs) {
        o.i(followerPhoneNumber, "followerPhoneNumber");
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        this.f26411a = followerPhoneNumber;
        this.f26412b = detailsModel;
        this.f26413c = itemArgs;
        this.f26414d = v.f54781a;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.UserUnFollowClickedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                DetailsModel detailsModel;
                ItemArgs itemArgs;
                ItemArgs itemArgs2;
                String str;
                DetailsModel detailsModel2;
                String phone;
                o.i(invoke, "$this$invoke");
                detailsModel = UserUnFollowClickedEvent.this.f26412b;
                itemArgs = UserUnFollowClickedEvent.this.f26413c;
                com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.m(invoke, detailsModel, itemArgs);
                db.a.a(invoke);
                DetailsSource.a aVar2 = DetailsSource.Companion;
                itemArgs2 = UserUnFollowClickedEvent.this.f26413c;
                invoke.c("FollowSource", aVar2.a(itemArgs2.c()).getValue());
                str = UserUnFollowClickedEvent.this.f26411a;
                invoke.c("FollowerPhoneNumber", str);
                detailsModel2 = UserUnFollowClickedEvent.this.f26412b;
                BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel2.d().F();
                if (F != null && (phone = F.getPhone()) != null) {
                    invoke.c("FollowingPhoneNumber", phone);
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
    /* renamed from: e */
    public v getKey() {
        return this.f26414d;
    }
}

package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: BuyerUiState.kt */
/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final DetailsModel f26466a;

    /* renamed from: b  reason: collision with root package name */
    private final cb.a f26467b;

    /* renamed from: c  reason: collision with root package name */
    private final FollowState f26468c;

    /* renamed from: d  reason: collision with root package name */
    private final ShareText f26469d;

    public q(DetailsModel buyerDetailsModel, cb.a aVar, FollowState followState, ShareText shareText) {
        kotlin.jvm.internal.o.i(buyerDetailsModel, "buyerDetailsModel");
        kotlin.jvm.internal.o.i(followState, "followState");
        this.f26466a = buyerDetailsModel;
        this.f26467b = aVar;
        this.f26468c = followState;
        this.f26469d = shareText;
    }

    public static /* synthetic */ q b(q qVar, DetailsModel detailsModel, cb.a aVar, FollowState followState, ShareText shareText, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            detailsModel = qVar.f26466a;
        }
        if ((i11 & 2) != 0) {
            aVar = qVar.f26467b;
        }
        if ((i11 & 4) != 0) {
            followState = qVar.f26468c;
        }
        if ((i11 & 8) != 0) {
            shareText = qVar.f26469d;
        }
        return qVar.a(detailsModel, aVar, followState, shareText);
    }

    public final q a(DetailsModel buyerDetailsModel, cb.a aVar, FollowState followState, ShareText shareText) {
        kotlin.jvm.internal.o.i(buyerDetailsModel, "buyerDetailsModel");
        kotlin.jvm.internal.o.i(followState, "followState");
        return new q(buyerDetailsModel, aVar, followState, shareText);
    }

    public final DetailsModel c() {
        return this.f26466a;
    }

    public final cb.a d() {
        return this.f26467b;
    }

    public final FollowState e() {
        return this.f26468c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (kotlin.jvm.internal.o.d(this.f26466a, qVar.f26466a) && kotlin.jvm.internal.o.d(this.f26467b, qVar.f26467b) && this.f26468c == qVar.f26468c && kotlin.jvm.internal.o.d(this.f26469d, qVar.f26469d)) {
            return true;
        }
        return false;
    }

    public final ShareText f() {
        return this.f26469d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f26466a.hashCode() * 31;
        cb.a aVar = this.f26467b;
        int i11 = 0;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f26468c.hashCode()) * 31;
        ShareText shareText = this.f26469d;
        if (shareText != null) {
            i11 = shareText.hashCode();
        }
        return hashCode3 + i11;
    }

    public String toString() {
        DetailsModel detailsModel = this.f26466a;
        cb.a aVar = this.f26467b;
        FollowState followState = this.f26468c;
        ShareText shareText = this.f26469d;
        return "BuyerListingDetailsUiModel(buyerDetailsModel=" + detailsModel + ", categoryBreadCrumbs=" + aVar + ", followState=" + followState + ", shareText=" + shareText + ")";
    }

    public /* synthetic */ q(DetailsModel detailsModel, cb.a aVar, FollowState followState, ShareText shareText, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(detailsModel, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? FollowState.IS_NOT_FOLLOWING : followState, (i11 & 8) != 0 ? null : shareText);
    }
}

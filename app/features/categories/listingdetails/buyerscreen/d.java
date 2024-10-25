package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.user.profile.UserProfileData;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileData f25862a;

    public d(UserProfileData userProfileData) {
        kotlin.jvm.internal.o.i(userProfileData, "userProfileData");
        this.f25862a = userProfileData;
    }

    public final UserProfileData a() {
        return this.f25862a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && kotlin.jvm.internal.o.d(this.f25862a, ((d) obj).f25862a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f25862a.hashCode();
    }

    public String toString() {
        UserProfileData userProfileData = this.f25862a;
        return "OpenSellerDetails(userProfileData=" + userProfileData + ")";
    }
}

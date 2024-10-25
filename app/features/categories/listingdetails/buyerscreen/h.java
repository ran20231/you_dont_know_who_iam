package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private final SignInIntention f25873a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsModel f25874b;

    public h(SignInIntention signInIntention, DetailsModel listing) {
        kotlin.jvm.internal.o.i(signInIntention, "signInIntention");
        kotlin.jvm.internal.o.i(listing, "listing");
        this.f25873a = signInIntention;
        this.f25874b = listing;
    }

    public final DetailsModel a() {
        return this.f25874b;
    }

    public final SignInIntention b() {
        return this.f25873a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f25873a == hVar.f25873a && kotlin.jvm.internal.o.d(this.f25874b, hVar.f25874b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25873a.hashCode() * 31) + this.f25874b.hashCode();
    }

    public String toString() {
        SignInIntention signInIntention = this.f25873a;
        DetailsModel detailsModel = this.f25874b;
        return "OpenLoginScreenForChat(signInIntention=" + signInIntention + ", listing=" + detailsModel + ")";
    }
}

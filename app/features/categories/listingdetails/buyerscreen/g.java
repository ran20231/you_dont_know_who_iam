package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.auth.login.SignInIntention;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f25871a;

    /* renamed from: b  reason: collision with root package name */
    private final SignInIntention f25872b;

    public g(boolean z11, SignInIntention signInIntention) {
        kotlin.jvm.internal.o.i(signInIntention, "signInIntention");
        this.f25871a = z11;
        this.f25872b = signInIntention;
    }

    public final SignInIntention a() {
        return this.f25872b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f25871a == gVar.f25871a && this.f25872b == gVar.f25872b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f25871a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f25872b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f25871a;
        SignInIntention signInIntention = this.f25872b;
        return "OpenLoggedInScreen(isLoggedIn=" + z11 + ", signInIntention=" + signInIntention + ")";
    }
}

package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.auth.login.SignInIntention;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final SignInIntention f25875a;

    /* renamed from: b  reason: collision with root package name */
    private final com.forsale.app.ui.bottomsheets.listingdetailschat.b f25876b;

    public i(SignInIntention signInIntention, com.forsale.app.ui.bottomsheets.listingdetailschat.b chatModel) {
        kotlin.jvm.internal.o.i(signInIntention, "signInIntention");
        kotlin.jvm.internal.o.i(chatModel, "chatModel");
        this.f25875a = signInIntention;
        this.f25876b = chatModel;
    }

    public final com.forsale.app.ui.bottomsheets.listingdetailschat.b a() {
        return this.f25876b;
    }

    public final SignInIntention b() {
        return this.f25875a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f25875a == iVar.f25875a && kotlin.jvm.internal.o.d(this.f25876b, iVar.f25876b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f25875a.hashCode() * 31) + this.f25876b.hashCode();
    }

    public String toString() {
        SignInIntention signInIntention = this.f25875a;
        com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar = this.f25876b;
        return "OpenLoginScreenForChatBottomSheet(signInIntention=" + signInIntention + ", chatModel=" + bVar + ")";
    }
}

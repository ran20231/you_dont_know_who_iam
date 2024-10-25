package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.ShareText;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private final ShareText f25858a;

    public b(ShareText shareText) {
        kotlin.jvm.internal.o.i(shareText, "shareText");
        this.f25858a = shareText;
    }

    public final ShareText a() {
        return this.f25858a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && kotlin.jvm.internal.o.d(this.f25858a, ((b) obj).f25858a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f25858a.hashCode();
    }

    public String toString() {
        ShareText shareText = this.f25858a;
        return "Share(shareText=" + shareText + ")";
    }
}

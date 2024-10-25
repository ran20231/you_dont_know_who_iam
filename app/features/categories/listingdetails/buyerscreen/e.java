package com.forsale.app.features.categories.listingdetails.buyerscreen;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f25863a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f25864b;

    public e(int i11, boolean z11) {
        this.f25863a = i11;
        this.f25864b = z11;
    }

    public final boolean a() {
        return this.f25864b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f25863a == eVar.f25863a && this.f25864b == eVar.f25864b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f25863a) * 31;
        boolean z11 = this.f25864b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        int i11 = this.f25863a;
        boolean z11 = this.f25864b;
        return "ReportAd(listingId=" + i11 + ", isExpanded=" + z11 + ")";
    }
}

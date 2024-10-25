package com.forsale.app.features.categories.listingdetails.buyerscreen;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class a implements j {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f25856a;

    /* renamed from: b  reason: collision with root package name */
    private final FavouriteState f25857b;

    public a(boolean z11, FavouriteState favouriteState) {
        kotlin.jvm.internal.o.i(favouriteState, "favouriteState");
        this.f25856a = z11;
        this.f25857b = favouriteState;
    }

    public final FavouriteState a() {
        return this.f25857b;
    }

    public final boolean b() {
        return this.f25856a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f25856a == aVar.f25856a && this.f25857b == aVar.f25857b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f25856a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f25857b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f25856a;
        FavouriteState favouriteState = this.f25857b;
        return "Favourite(isFavourite=" + z11 + ", favouriteState=" + favouriteState + ")";
    }
}

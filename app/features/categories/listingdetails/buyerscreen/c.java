package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import java.util.List;
/* compiled from: BuyerEvents.kt */
/* loaded from: classes2.dex */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    private final int f25859a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemBrief f25860b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Integer> f25861c;

    public c(int i11, ListingItemBrief listingItemBrief, List<Integer> list) {
        kotlin.jvm.internal.o.i(listingItemBrief, "listingItemBrief");
        this.f25859a = i11;
        this.f25860b = listingItemBrief;
        this.f25861c = list;
    }

    public final int a() {
        return this.f25859a;
    }

    public final ListingItemBrief b() {
        return this.f25860b;
    }

    public final List<Integer> c() {
        return this.f25861c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f25859a == cVar.f25859a && kotlin.jvm.internal.o.d(this.f25860b, cVar.f25860b) && kotlin.jvm.internal.o.d(this.f25861c, cVar.f25861c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((Integer.hashCode(this.f25859a) * 31) + this.f25860b.hashCode()) * 31;
        List<Integer> list = this.f25861c;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i11 = this.f25859a;
        ListingItemBrief listingItemBrief = this.f25860b;
        List<Integer> list = this.f25861c;
        return "OpenNewListingDetailsFromRecommendedList(advId=" + i11 + ", listingItemBrief=" + listingItemBrief + ", swipingIds=" + list + ")";
    }
}

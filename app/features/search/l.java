package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class l implements y {

    /* renamed from: a  reason: collision with root package name */
    private final SearchItemModel f37011a;

    public l(SearchItemModel item) {
        kotlin.jvm.internal.o.i(item, "item");
        this.f37011a = item;
    }

    public final SearchItemModel a() {
        return this.f37011a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && kotlin.jvm.internal.o.d(this.f37011a, ((l) obj).f37011a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37011a.hashCode();
    }

    public String toString() {
        SearchItemModel searchItemModel = this.f37011a;
        return "OnItemClicked(item=" + searchItemModel + ")";
    }
}

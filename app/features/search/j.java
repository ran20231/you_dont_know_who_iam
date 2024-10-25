package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class j implements y {

    /* renamed from: a  reason: collision with root package name */
    private final SearchItemModel f37009a;

    public j(SearchItemModel item) {
        kotlin.jvm.internal.o.i(item, "item");
        this.f37009a = item;
    }

    public final SearchItemModel a() {
        return this.f37009a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && kotlin.jvm.internal.o.d(this.f37009a, ((j) obj).f37009a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37009a.hashCode();
    }

    public String toString() {
        SearchItemModel searchItemModel = this.f37009a;
        return "OnDeleteHistoryItem(item=" + searchItemModel + ")";
    }
}

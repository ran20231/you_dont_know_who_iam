package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class h implements y {

    /* renamed from: a  reason: collision with root package name */
    private final SearchItemModel f37006a;

    public h(SearchItemModel item) {
        kotlin.jvm.internal.o.i(item, "item");
        this.f37006a = item;
    }

    public final SearchItemModel a() {
        return this.f37006a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && kotlin.jvm.internal.o.d(this.f37006a, ((h) obj).f37006a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37006a.hashCode();
    }

    public String toString() {
        SearchItemModel searchItemModel = this.f37006a;
        return "OnItemClicked(item=" + searchItemModel + ")";
    }
}

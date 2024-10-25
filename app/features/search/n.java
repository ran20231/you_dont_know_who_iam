package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class n implements y {

    /* renamed from: a  reason: collision with root package name */
    private final String f37013a;

    public n(String searchQuery) {
        kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
        this.f37013a = searchQuery;
    }

    public final String a() {
        return this.f37013a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n) && kotlin.jvm.internal.o.d(this.f37013a, ((n) obj).f37013a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37013a.hashCode();
    }

    public String toString() {
        String str = this.f37013a;
        return "OnLoadMatchedCategories(searchQuery=" + str + ")";
    }
}

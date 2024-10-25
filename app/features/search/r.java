package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class r implements y {

    /* renamed from: a  reason: collision with root package name */
    private final String f37019a;

    public r(String searchQuery) {
        kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
        this.f37019a = searchQuery;
    }

    public final String a() {
        return this.f37019a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof r) && kotlin.jvm.internal.o.d(this.f37019a, ((r) obj).f37019a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37019a.hashCode();
    }

    public String toString() {
        String str = this.f37019a;
        return "OnQueryChange(searchQuery=" + str + ")";
    }
}

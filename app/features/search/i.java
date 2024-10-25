package com.forsale.app.features.search;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class i implements y {

    /* renamed from: a  reason: collision with root package name */
    private final String f37008a;

    public i(String searchableQuery) {
        kotlin.jvm.internal.o.i(searchableQuery, "searchableQuery");
        this.f37008a = searchableQuery;
    }

    public final String a() {
        return this.f37008a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && kotlin.jvm.internal.o.d(this.f37008a, ((i) obj).f37008a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37008a.hashCode();
    }

    public String toString() {
        String str = this.f37008a;
        return "OnLoadSuggestions(searchableQuery=" + str + ")";
    }
}

package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.search.SearchAnalyticsData;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class o implements y {

    /* renamed from: a  reason: collision with root package name */
    private final String f37014a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryEntity f37015b;

    /* renamed from: c  reason: collision with root package name */
    private final SearchAnalyticsData.SearchSource f37016c;

    public o(String searchQuery, CategoryEntity category, SearchAnalyticsData.SearchSource searchSource) {
        kotlin.jvm.internal.o.i(searchQuery, "searchQuery");
        kotlin.jvm.internal.o.i(category, "category");
        this.f37014a = searchQuery;
        this.f37015b = category;
        this.f37016c = searchSource;
    }

    public final CategoryEntity a() {
        return this.f37015b;
    }

    public final String b() {
        return this.f37014a;
    }

    public final SearchAnalyticsData.SearchSource c() {
        return this.f37016c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (kotlin.jvm.internal.o.d(this.f37014a, oVar.f37014a) && kotlin.jvm.internal.o.d(this.f37015b, oVar.f37015b) && this.f37016c == oVar.f37016c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f37014a.hashCode() * 31) + this.f37015b.hashCode()) * 31;
        SearchAnalyticsData.SearchSource searchSource = this.f37016c;
        if (searchSource == null) {
            hashCode = 0;
        } else {
            hashCode = searchSource.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.f37014a;
        CategoryEntity categoryEntity = this.f37015b;
        SearchAnalyticsData.SearchSource searchSource = this.f37016c;
        return "OnMatchedCategoriesItemClicked(searchQuery=" + str + ", category=" + categoryEntity + ", searchSource=" + searchSource + ")";
    }
}

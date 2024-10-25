package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CategoryListingsViewModel.kt */
/* loaded from: classes2.dex */
public final class c implements CategoryListingsViewModel.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<bc.a> f28695a;

    public c(List<bc.a> districtViewModels) {
        o.i(districtViewModels, "districtViewModels");
        this.f28695a = districtViewModels;
    }

    public final List<bc.a> a() {
        return this.f28695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof c) && o.d(this.f28695a, ((c) obj).f28695a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28695a.hashCode();
    }

    public String toString() {
        List<bc.a> list = this.f28695a;
        return "DistrictFilters(districtViewModels=" + list + ")";
    }
}

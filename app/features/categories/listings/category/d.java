package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: CategoryListingsViewModel.kt */
/* loaded from: classes2.dex */
public final class d implements CategoryListingsViewModel.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<FilterViewModel<?, ?, ?>> f28696a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends FilterViewModel<?, ?, ?>> filtersViewModels) {
        o.i(filtersViewModels, "filtersViewModels");
        this.f28696a = filtersViewModels;
    }

    public final List<FilterViewModel<?, ?, ?>> a() {
        return this.f28696a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d) && o.d(this.f28696a, ((d) obj).f28696a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f28696a.hashCode();
    }

    public String toString() {
        List<FilterViewModel<?, ?, ?>> list = this.f28696a;
        return "FullFiltration(filtersViewModels=" + list + ")";
    }
}

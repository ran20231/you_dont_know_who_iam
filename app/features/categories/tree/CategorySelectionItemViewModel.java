package com.forsale.app.features.categories.tree;

import androidx.databinding.ObservableBoolean;
import com.forsale.app.datalayer.database.CategoryEntity;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: CategorySelectionItemViewModel.kt */
/* loaded from: classes2.dex */
public final class CategorySelectionItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f31107a;

    /* renamed from: b  reason: collision with root package name */
    private final CategoryEntity f31108b;

    /* renamed from: c  reason: collision with root package name */
    private final int f31109c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f31110d;

    /* renamed from: e  reason: collision with root package name */
    private final MutableSharedFlow<CategoryEntity> f31111e;

    /* renamed from: f  reason: collision with root package name */
    private final ObservableBoolean f31112f;

    public CategorySelectionItemViewModel(CoroutineScope coroutineScope, CategoryEntity category, int i11, boolean z11, MutableSharedFlow<CategoryEntity> categoryClicked) {
        o.i(coroutineScope, "coroutineScope");
        o.i(category, "category");
        o.i(categoryClicked, "categoryClicked");
        this.f31107a = coroutineScope;
        this.f31108b = category;
        this.f31109c = i11;
        this.f31110d = z11;
        this.f31111e = categoryClicked;
        this.f31112f = new ObservableBoolean(!z11);
    }

    public final CategoryEntity a() {
        return this.f31108b;
    }

    public final MutableSharedFlow<CategoryEntity> b() {
        return this.f31111e;
    }

    public final int c() {
        return this.f31109c;
    }

    public final ObservableBoolean d() {
        return this.f31112f;
    }

    public final boolean e() {
        return this.f31110d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategorySelectionItemViewModel)) {
            return false;
        }
        CategorySelectionItemViewModel categorySelectionItemViewModel = (CategorySelectionItemViewModel) obj;
        if (o.d(this.f31107a, categorySelectionItemViewModel.f31107a) && o.d(this.f31108b, categorySelectionItemViewModel.f31108b) && this.f31109c == categorySelectionItemViewModel.f31109c && this.f31110d == categorySelectionItemViewModel.f31110d && o.d(this.f31111e, categorySelectionItemViewModel.f31111e)) {
            return true;
        }
        return false;
    }

    public final void f(CategoryEntity category) {
        o.i(category, "category");
        BuildersKt__Builders_commonKt.launch$default(this.f31107a, null, null, new CategorySelectionItemViewModel$setSelectedCategory$1(this, category, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f31107a.hashCode() * 31) + this.f31108b.hashCode()) * 31) + Integer.hashCode(this.f31109c)) * 31;
        boolean z11 = this.f31110d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.f31111e.hashCode();
    }

    public String toString() {
        CoroutineScope coroutineScope = this.f31107a;
        CategoryEntity categoryEntity = this.f31108b;
        int i11 = this.f31109c;
        boolean z11 = this.f31110d;
        MutableSharedFlow<CategoryEntity> mutableSharedFlow = this.f31111e;
        return "CategorySelectionItemViewModel(coroutineScope=" + coroutineScope + ", category=" + categoryEntity + ", categoryDepth=" + i11 + ", isSelectable=" + z11 + ", categoryClicked=" + mutableSharedFlow + ")";
    }
}

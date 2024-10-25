package com.forsale.app.features.categories.home;

import androidx.lifecycle.k0;
import androidx.lifecycle.r0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.CategoryWithSubCategories;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.SubCategoriesPosition;
import g00.a;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import wz.h;
import wz.p;
/* compiled from: BaseCategoryViewModel.kt */
/* loaded from: classes2.dex */
public class BaseCategoryViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final OneShotEventHandler<List<CategoryWithSubCategories>> f23258k0;

    /* renamed from: l0  reason: collision with root package name */
    private final OneShotEventHandler<CategoryEntity> f23259l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<CategoryEntity> f23260m0;

    /* renamed from: n0  reason: collision with root package name */
    private final OneShotEventHandler<p> f23261n0;

    /* renamed from: o0  reason: collision with root package name */
    private final h f23262o0;

    /* renamed from: p0  reason: collision with root package name */
    private final h f23263p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCategoryViewModel(BaseRepository baseRepository, final k0 savedStateHandle) {
        super(baseRepository);
        h a11;
        h a12;
        o.i(baseRepository, "baseRepository");
        o.i(savedStateHandle, "savedStateHandle");
        this.f23258k0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f23259l0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f23260m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f23261n0 = new OneShotEventHandler<>(null, 0, 3, null);
        a11 = d.a(new a<SubCategoryAnalyticsSource>() { // from class: com.forsale.app.features.categories.home.BaseCategoryViewModel$subCategorySource$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final SubCategoryAnalyticsSource invoke() {
                return com.forsale.app.features.categories.normal.a.f31075e.b(k0.this).a();
            }
        });
        this.f23262o0 = a11;
        a12 = d.a(new a<CategoryEntity>() { // from class: com.forsale.app.features.categories.home.BaseCategoryViewModel$categoryParent$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final CategoryEntity invoke() {
                return com.forsale.app.features.categories.normal.a.f31075e.b(k0.this).b();
            }
        });
        this.f23263p0 = a12;
    }

    private final void D0(SubCategoriesPosition subCategoriesPosition) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BaseCategoryViewModel$logAnalytics$1(this, subCategoriesPosition, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryEntity y0() {
        return (CategoryEntity) this.f23263p0.getValue();
    }

    public final OneShotEventHandler<CategoryEntity> A0() {
        return this.f23259l0;
    }

    public final SubCategoryAnalyticsSource B0() {
        return (SubCategoryAnalyticsSource) this.f23262o0.getValue();
    }

    public final void C0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new BaseCategoryViewModel$loadCategories$1(this, null), 3, null);
    }

    public final void E0(SubCategoriesPosition subCategoriesPosition) {
        D0(subCategoriesPosition);
    }

    public final void w0(CategoryEntity categoryEntity) {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new BaseCategoryViewModel$decideNextDestination$1(categoryEntity, this, null), 3, null);
    }

    public final OneShotEventHandler<List<CategoryWithSubCategories>> x0() {
        return this.f23258k0;
    }

    public final OneShotEventHandler<CategoryEntity> z0() {
        return this.f23260m0;
    }
}

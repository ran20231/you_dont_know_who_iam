package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.arch.FiltersMediator;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$listingsStateChanged$1", f = "CategoryListingsViewModel.kt", l = {816, 817}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$listingsStateChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28529a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28530b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel.c f28531c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$listingsStateChanged$1(CategoryListingsViewModel categoryListingsViewModel, CategoryListingsViewModel.c cVar, zz.a<? super CategoryListingsViewModel$listingsStateChanged$1> aVar) {
        super(2, aVar);
        this.f28530b = categoryListingsViewModel;
        this.f28531c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$listingsStateChanged$1(this.f28530b, this.f28531c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Deferred deferred;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28529a;
        boolean z11 = true;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            deferred = this.f28530b.J1;
            this.f28529a = 1;
            obj = deferred.await(this);
            if (obj == f11) {
                return f11;
            }
        }
        FiltersMediator filtersMediator = (FiltersMediator) obj;
        if (filtersMediator != null) {
            CategoryListingsViewModel.c cVar = this.f28531c;
            if (!(cVar instanceof CategoryListingsViewModel.c.e) && !(cVar instanceof CategoryListingsViewModel.c.a.C0308a)) {
                z11 = false;
            }
            this.f28529a = 2;
            if (filtersMediator.n(z11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$listingsStateChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

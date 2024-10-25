package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.category.CategoryListingsViewModel;
import g00.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import wz.p;
import ya.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$isUpButtonVisible$1", f = "CategoryListingsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$isUpButtonVisible$1 extends SuspendLambda implements r<ya.a, Boolean, CategoryListingsViewModel.c, zz.a<? super Boolean>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28518a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f28519b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f28520c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f28521d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28522e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$isUpButtonVisible$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$isUpButtonVisible$1> aVar) {
        super(4, aVar);
        this.f28522e = categoryListingsViewModel;
    }

    public final Object b(ya.a aVar, boolean z11, CategoryListingsViewModel.c cVar, zz.a<? super Boolean> aVar2) {
        CategoryListingsViewModel$isUpButtonVisible$1 categoryListingsViewModel$isUpButtonVisible$1 = new CategoryListingsViewModel$isUpButtonVisible$1(this.f28522e, aVar2);
        categoryListingsViewModel$isUpButtonVisible$1.f28519b = aVar;
        categoryListingsViewModel$isUpButtonVisible$1.f28520c = z11;
        categoryListingsViewModel$isUpButtonVisible$1.f28521d = cVar;
        return categoryListingsViewModel$isUpButtonVisible$1.invokeSuspend(p.f75480a);
    }

    @Override // g00.r
    public /* bridge */ /* synthetic */ Object d(ya.a aVar, Boolean bool, CategoryListingsViewModel.c cVar, zz.a<? super Boolean> aVar2) {
        return b(aVar, bool.booleanValue(), cVar, aVar2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28518a == 0) {
            kotlin.f.b(obj);
            ya.a aVar = (ya.a) this.f28519b;
            boolean z11 = this.f28520c;
            boolean z12 = false;
            if ((((CategoryListingsViewModel.c) this.f28521d) instanceof CategoryListingsViewModel.c.a) && !z11 && o.d(this.f28522e.n2().getValue(), a.C0943a.f76378a) && o.d(aVar, a.c.f76380a)) {
                z12 = true;
            }
            return kotlin.coroutines.jvm.internal.a.a(z12);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

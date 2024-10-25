package com.forsale.app.features.categories.listings.category;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$setFirstVisibleItem$1", f = "CategoryListingsViewModel.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$setFirstVisibleItem$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28605a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28606b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f28607c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$setFirstVisibleItem$1(CategoryListingsViewModel categoryListingsViewModel, int i11, zz.a<? super CategoryListingsViewModel$setFirstVisibleItem$1> aVar) {
        super(2, aVar);
        this.f28606b = categoryListingsViewModel;
        this.f28607c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$setFirstVisibleItem$1(this.f28606b, this.f28607c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28605a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f28606b.f28363h1;
            Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.f28607c);
            this.f28605a = 1;
            if (mutableStateFlow.emit(d11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$setFirstVisibleItem$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

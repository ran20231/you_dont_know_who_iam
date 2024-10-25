package com.forsale.app.features.categories.listings.category;

import g00.p;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$fetchInterstitial$1", f = "CategoryListingsViewModel.kt", l = {222}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$fetchInterstitial$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28476a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28477b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$fetchInterstitial$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$fetchInterstitial$1> aVar) {
        super(2, aVar);
        this.f28477b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$fetchInterstitial$1(this.f28477b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AtomicBoolean atomicBoolean;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28476a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            atomicBoolean = this.f28477b.f28365j1;
            if (!atomicBoolean.get()) {
                mutableSharedFlow = this.f28477b.f28368l1;
                final CategoryListingsViewModel categoryListingsViewModel = this.f28477b;
                g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$fetchInterstitial$1.1
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        AtomicBoolean atomicBoolean2;
                        atomicBoolean2 = CategoryListingsViewModel.this.f28365j1;
                        atomicBoolean2.set(true);
                        CategoryListingsViewModel.this.T1();
                    }
                };
                this.f28476a = 1;
                if (mutableSharedFlow.emit(aVar, this) == f11) {
                    return f11;
                }
            } else {
                return wz.p.f75480a;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$fetchInterstitial$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.ListingsIntention;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$setSearchBarTitle$1", f = "CategoryListingsViewModel.kt", l = {872, 874}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$setSearchBarTitle$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28611a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28612b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$setSearchBarTitle$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$setSearchBarTitle$1> aVar) {
        super(2, aVar);
        this.f28612b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$setSearchBarTitle$1(this.f28612b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28611a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (this.f28612b.q2().getValue() == ListingsIntention.SEARCH) {
                mutableStateFlow2 = this.f28612b.f28355c1;
                String H2 = this.f28612b.H2();
                this.f28611a = 1;
                if (mutableStateFlow2.emit(H2, this) == f11) {
                    return f11;
                }
            } else if (this.f28612b.z2() != null) {
                mutableStateFlow = this.f28612b.f28355c1;
                String name = this.f28612b.z2().getName();
                this.f28611a = 2;
                if (mutableStateFlow.emit(name, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$setSearchBarTitle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

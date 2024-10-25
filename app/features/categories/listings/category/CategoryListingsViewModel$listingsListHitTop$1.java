package com.forsale.app.features.categories.listings.category;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$listingsListHitTop$1", f = "CategoryListingsViewModel.kt", l = {810}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$listingsListHitTop$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28526a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28527b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f28528c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$listingsListHitTop$1(CategoryListingsViewModel categoryListingsViewModel, boolean z11, zz.a<? super CategoryListingsViewModel$listingsListHitTop$1> aVar) {
        super(2, aVar);
        this.f28527b = categoryListingsViewModel;
        this.f28528c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$listingsListHitTop$1(this.f28527b, this.f28528c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28526a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableStateFlow<Boolean> i22 = this.f28527b.i2();
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(this.f28528c);
            this.f28526a = 1;
            if (i22.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$listingsListHitTop$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

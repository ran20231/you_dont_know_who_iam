package com.forsale.app.features.categories.listings.category;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.ContinueBrowsingRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$saveLastContinueBrowsingData$1", f = "CategoryListingsViewModel.kt", l = {1028}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$saveLastContinueBrowsingData$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28601a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28602b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$saveLastContinueBrowsingData$1(CategoryListingsViewModel categoryListingsViewModel, zz.a<? super CategoryListingsViewModel$saveLastContinueBrowsingData$1> aVar) {
        super(2, aVar);
        this.f28602b = categoryListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$saveLastContinueBrowsingData$1(this.f28602b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean U2;
        ContinueBrowsingRepository continueBrowsingRepository;
        CategoryListingsDecorator c22;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28601a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            CategoryListingsViewModel categoryListingsViewModel = this.f28602b;
            U2 = categoryListingsViewModel.U2(categoryListingsViewModel.q2().getValue());
            if (!U2 && this.f28602b.z2() != null) {
                continueBrowsingRepository = this.f28602b.D0;
                CategoryEntity z22 = this.f28602b.z2();
                c22 = this.f28602b.c2();
                oa.g gVar = new oa.g(z22, c22.A0());
                this.f28601a = 1;
                if (continueBrowsingRepository.b(gVar, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$saveLastContinueBrowsingData$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

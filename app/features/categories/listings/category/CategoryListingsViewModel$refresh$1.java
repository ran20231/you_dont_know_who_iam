package com.forsale.app.features.categories.listings.category;

import com.forsale.app.features.categories.listings.PagedListingsDecorator;
import com.forsale.app.features.categories.listings.dataSource.ListingsDataSourceFactory;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsViewModel$refresh$1", f = "CategoryListingsViewModel.kt", l = {624}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsViewModel$refresh$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsViewModel f28596b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PagedListingsDecorator f28597c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsViewModel$refresh$1(CategoryListingsViewModel categoryListingsViewModel, PagedListingsDecorator pagedListingsDecorator, zz.a<? super CategoryListingsViewModel$refresh$1> aVar) {
        super(2, aVar);
        this.f28596b = categoryListingsViewModel;
        this.f28597c = pagedListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsViewModel$refresh$1(this.f28596b, this.f28597c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingsDataSourceFactory p22;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28595a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            p22 = this.f28596b.p2();
            PagedListingsDecorator pagedListingsDecorator = this.f28597c;
            this.f28595a = 1;
            if (p22.g(pagedListingsDecorator, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsViewModel$refresh$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

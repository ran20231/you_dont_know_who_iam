package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2", f = "CategoryListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28194b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<ListingItemBrief> f28195c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2(CategoryListingsDecorator categoryListingsDecorator, List<ListingItemBrief> list, zz.a<? super CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2> aVar) {
        super(2, aVar);
        this.f28194b = categoryListingsDecorator;
        this.f28195c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2(this.f28194b, this.f28195c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28193a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f28194b.T;
            b0Var.setValue(this.f28195c);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsDecorator$formPinnedAndPinnedShuffledListings$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
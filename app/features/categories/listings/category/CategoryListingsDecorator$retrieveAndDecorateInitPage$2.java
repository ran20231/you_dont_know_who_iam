package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$retrieveAndDecorateInitPage$2", f = "CategoryListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$retrieveAndDecorateInitPage$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28270a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28271b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingsResponse f28272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$retrieveAndDecorateInitPage$2(CategoryListingsDecorator categoryListingsDecorator, ListingsResponse listingsResponse, zz.a<? super CategoryListingsDecorator$retrieveAndDecorateInitPage$2> aVar) {
        super(2, aVar);
        this.f28271b = categoryListingsDecorator;
        this.f28272c = listingsResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsDecorator$retrieveAndDecorateInitPage$2(this.f28271b, this.f28272c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        b0 b0Var2;
        b0 b0Var3;
        b0 b0Var4;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28270a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f28271b.f28106r;
            if (b0Var.getValue() == 0) {
                b0Var4 = this.f28271b.f28106r;
                b0Var4.setValue(this.f28272c.getUiSettings());
            }
            b0Var2 = this.f28271b.f28105q;
            b0Var2.setValue(kotlin.coroutines.jvm.internal.a.d(this.f28272c.getTotalPages()));
            b0Var3 = this.f28271b.V;
            b0Var3.setValue(kotlin.coroutines.jvm.internal.a.d(1));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsDecorator$retrieveAndDecorateInitPage$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

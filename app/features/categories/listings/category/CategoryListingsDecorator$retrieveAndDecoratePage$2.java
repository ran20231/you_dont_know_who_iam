package com.forsale.app.features.categories.listings.category;

import androidx.lifecycle.b0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CategoryListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.category.CategoryListingsDecorator$retrieveAndDecoratePage$2", f = "CategoryListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CategoryListingsDecorator$retrieveAndDecoratePage$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28282a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ CategoryListingsDecorator f28283b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f28284c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryListingsDecorator$retrieveAndDecoratePage$2(CategoryListingsDecorator categoryListingsDecorator, int i11, zz.a<? super CategoryListingsDecorator$retrieveAndDecoratePage$2> aVar) {
        super(2, aVar);
        this.f28283b = categoryListingsDecorator;
        this.f28284c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CategoryListingsDecorator$retrieveAndDecoratePage$2(this.f28283b, this.f28284c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f28282a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f28283b.V;
            b0Var.setValue(kotlin.coroutines.jvm.internal.a.d(this.f28284c));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CategoryListingsDecorator$retrieveAndDecoratePage$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.categories.listings.generalListings;

import androidx.lifecycle.b0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsDecorator.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsDecorator$retrieveAndDecorateInitPage$2", f = "GeneralListingsDecorator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsDecorator$retrieveAndDecorateInitPage$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30440a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsDecorator f30441b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsDecorator$retrieveAndDecorateInitPage$2(GeneralListingsDecorator generalListingsDecorator, zz.a<? super GeneralListingsDecorator$retrieveAndDecorateInitPage$2> aVar) {
        super(2, aVar);
        this.f30441b = generalListingsDecorator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsDecorator$retrieveAndDecorateInitPage$2(this.f30441b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f30440a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f30441b.I;
            b0Var.setValue(kotlin.coroutines.jvm.internal.a.d(1));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsDecorator$retrieveAndDecorateInitPage$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

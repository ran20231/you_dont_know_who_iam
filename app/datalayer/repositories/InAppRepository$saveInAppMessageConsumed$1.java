package com.forsale.app.datalayer.repositories;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.InAppRepository$saveInAppMessageConsumed$1", f = "InAppRepository.kt", l = {161}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InAppRepository$saveInAppMessageConsumed$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ int $isConsumed;
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$saveInAppMessageConsumed$1(InAppRepository inAppRepository, int i11, zz.a<? super InAppRepository$saveInAppMessageConsumed$1> aVar) {
        super(2, aVar);
        this.this$0 = inAppRepository;
        this.$isConsumed = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new InAppRepository$saveInAppMessageConsumed$1(this.this$0, this.$isConsumed, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            bVar = this.this$0.pref;
            kj.d f12 = bVar.f();
            int i12 = this.$isConsumed;
            this.label = 1;
            if (f12.c(i12, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((InAppRepository$saveInAppMessageConsumed$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

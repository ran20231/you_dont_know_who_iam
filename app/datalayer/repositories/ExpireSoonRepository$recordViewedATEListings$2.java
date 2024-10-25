package com.forsale.app.datalayer.repositories;

import androidx.lifecycle.b0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$recordViewedATEListings$2", f = "ExpireSoonRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$recordViewedATEListings$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$recordViewedATEListings$2(ExpireSoonRepository expireSoonRepository, zz.a<? super ExpireSoonRepository$recordViewedATEListings$2> aVar) {
        super(2, aVar);
        this.this$0 = expireSoonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$recordViewedATEListings$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            b0Var = this.this$0.activeAboutToExpireListing;
            b0Var.setValue(null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonRepository$recordViewedATEListings$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.datalayer.repositories;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExpireSoonRepository$setATEListingViewed$1", f = "ExpireSoonRepository.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExpireSoonRepository$setATEListingViewed$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ExpireSoonRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonRepository$setATEListingViewed$1(ExpireSoonRepository expireSoonRepository, zz.a<? super ExpireSoonRepository$setATEListingViewed$1> aVar) {
        super(2, aVar);
        this.this$0 = expireSoonRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExpireSoonRepository$setATEListingViewed$1(this.this$0, aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        r4 = kotlin.collections.CollectionsKt___CollectionsKt.X0(r4);
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r3.L$0
            java.util.List r0 = (java.util.List) r0
            kotlin.f.b(r4)     // Catch: java.lang.Throwable -> L41
            goto L59
        L13:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L1b:
            kotlin.f.b(r4)
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r4 = r3.this$0     // Catch: java.lang.Throwable -> L41
            androidx.lifecycle.b0 r4 = com.forsale.app.datalayer.repositories.ExpireSoonRepository.access$getViewedAds$p(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L41
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L59
            java.lang.Iterable r4 = (java.lang.Iterable) r4     // Catch: java.lang.Throwable -> L41
            java.util.List r4 = kotlin.collections.p.X0(r4)     // Catch: java.lang.Throwable -> L41
            if (r4 == 0) goto L59
            com.forsale.app.datalayer.repositories.ExpireSoonRepository r1 = r3.this$0     // Catch: java.lang.Throwable -> L41
            r3.L$0 = r4     // Catch: java.lang.Throwable -> L41
            r3.label = r2     // Catch: java.lang.Throwable -> L41
            java.lang.Object r4 = r1.recordViewedATEListings(r4, r3)     // Catch: java.lang.Throwable -> L41
            if (r4 != r0) goto L59
            return r0
        L41:
            r4 = move-exception
            boolean r0 = r4 instanceof com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor.ConnectivityException
            if (r0 == 0) goto L49
            wz.p r4 = wz.p.f75480a
            return r4
        L49:
            dj.i$a r0 = dj.i.f54287a
            dj.i r0 = r0.invoke()
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.String r2 = "Failure in reporting set about to expire viewed"
            r1.<init>(r2, r4)
            r0.f(r1)
        L59:
            wz.p r4 = wz.p.f75480a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ExpireSoonRepository$setATEListingViewed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ExpireSoonRepository$setATEListingViewed$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

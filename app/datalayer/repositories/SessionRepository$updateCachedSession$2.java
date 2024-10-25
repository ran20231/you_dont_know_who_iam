package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SessionRepository$updateCachedSession$2", f = "SessionRepository.kt", l = {104, 105, FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SessionRepository$updateCachedSession$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ SessionEntity $session;
    Object L$0;
    int label;
    final /* synthetic */ SessionRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionRepository$updateCachedSession$2(SessionRepository sessionRepository, SessionEntity sessionEntity, zz.a<? super SessionRepository$updateCachedSession$2> aVar) {
        super(2, aVar);
        this.this$0 = sessionRepository;
        this.$session = sessionEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SessionRepository$updateCachedSession$2(this.this$0, this.$session, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r6.L$0
            wz.p r0 = (wz.p) r0
            kotlin.f.b(r7)
            goto L67
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            java.lang.Object r1 = r6.L$0
            wz.p r1 = (wz.p) r1
            kotlin.f.b(r7)
            goto L52
        L29:
            kotlin.f.b(r7)
            goto L41
        L2d:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.SessionRepository r7 = r6.this$0
            com.forsale.app.datalayer.repositories.SessionDao r7 = com.forsale.app.datalayer.repositories.SessionRepository.access$getSessionDao$p(r7)
            com.forsale.app.datalayer.network.entities.SessionEntity r1 = r6.$session
            r6.label = r4
            java.lang.Object r7 = r7.insertSession(r1, r6)
            if (r7 != r0) goto L41
            return r0
        L41:
            wz.p r7 = wz.p.f75480a
            com.forsale.app.datalayer.repositories.SessionRepository r1 = r6.this$0
            com.forsale.app.datalayer.network.entities.SessionEntity r5 = r6.$session
            r6.L$0 = r7
            r6.label = r3
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.SessionRepository.access$preLoadGreetingImgIfPossible(r1, r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            wz.p r7 = wz.p.f75480a
            com.forsale.app.datalayer.repositories.SessionRepository r1 = r6.this$0
            com.forsale.app.datalayer.network.entities.SessionEntity r3 = r6.$session
            java.lang.Integer r3 = r3.getRankedVerticalId()
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.SessionRepository.access$updateHomeId(r1, r3, r6)
            if (r7 != r0) goto L67
            return r0
        L67:
            wz.p r7 = wz.p.f75480a
            com.forsale.app.datalayer.repositories.SessionRepository r7 = r6.this$0
            java.util.concurrent.atomic.AtomicBoolean r0 = com.forsale.app.datalayer.repositories.SessionRepository.access$isSessionFetched$p(r7)
            boolean r0 = r0.get()
            if (r0 != 0) goto L7c
            java.util.concurrent.atomic.AtomicBoolean r7 = com.forsale.app.datalayer.repositories.SessionRepository.access$isSessionFetched$p(r7)
            r7.set(r4)
        L7c:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SessionRepository$updateCachedSession$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SessionRepository$updateCachedSession$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

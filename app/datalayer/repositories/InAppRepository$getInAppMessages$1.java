package com.forsale.app.datalayer.repositories;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessages$1", f = "InAppRepository.kt", l = {42, 40, 47}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class InAppRepository$getInAppMessages$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InAppRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$getInAppMessages$1(InAppRepository inAppRepository, zz.a<? super InAppRepository$getInAppMessages$1> aVar) {
        super(2, aVar);
        this.this$0 = inAppRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new InAppRepository$getInAppMessages$1(this.this$0, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[RETURN] */
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
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r7)
            goto L62
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            kotlin.f.b(r7)
            goto L52
        L21:
            java.lang.Object r1 = r6.L$0
            com.forsale.app.datalayer.network.services.MessagingService r1 = (com.forsale.app.datalayer.network.services.MessagingService) r1
            kotlin.f.b(r7)
            goto L3f
        L29:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.InAppRepository r7 = r6.this$0
            com.forsale.app.datalayer.network.services.MessagingService r1 = com.forsale.app.datalayer.repositories.InAppRepository.access$getMessagingService$p(r7)
            com.forsale.app.datalayer.repositories.InAppRepository r7 = r6.this$0
            r6.L$0 = r1
            r6.label = r4
            java.lang.Object r7 = r7.deviceId(r6)
            if (r7 != r0) goto L3f
            return r0
        L3f:
            java.lang.String r7 = (java.lang.String) r7
            com.forsale.app.datalayer.network.requestsbodies.InAppMessagesBody r4 = new com.forsale.app.datalayer.network.requestsbodies.InAppMessagesBody
            r5 = 0
            r4.<init>(r7, r5)
            r6.L$0 = r5
            r6.label = r3
            java.lang.Object r7 = r1.getInAppMessages(r4, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            com.forsale.app.datalayer.repositories.InAppRepository r1 = r6.this$0
            r3 = r7
            java.util.List r3 = (java.util.List) r3
            r6.L$0 = r7
            r6.label = r2
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.InAppRepository.access$saveInAppMessagesData(r1, r3, r6)
            if (r7 != r0) goto L62
            return r0
        L62:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.InAppRepository$getInAppMessages$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((InAppRepository$getInAppMessages$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

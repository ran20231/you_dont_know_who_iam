package com.forsale.app.features.more.blockreason;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BlockReasonViewModel.kt */
@d(c = "com.forsale.app.features.more.blockreason.BlockReasonViewModel$loadBlockingReason$1", f = "BlockReasonViewModel.kt", l = {41, 41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BlockReasonViewModel$loadBlockingReason$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31701a;

    /* renamed from: b  reason: collision with root package name */
    int f31702b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BlockReasonViewModel f31703c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockReasonViewModel$loadBlockingReason$1(BlockReasonViewModel blockReasonViewModel, a<? super BlockReasonViewModel$loadBlockingReason$1> aVar) {
        super(2, aVar);
        this.f31703c = blockReasonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new BlockReasonViewModel$loadBlockingReason$1(this.f31703c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f31702b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L4b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.f31701a
            com.forsale.app.datalayer.network.services.UserService r1 = (com.forsale.app.datalayer.network.services.UserService) r1
            kotlin.f.b(r5)
            goto L38
        L22:
            kotlin.f.b(r5)
            com.forsale.app.features.more.blockreason.BlockReasonViewModel r5 = r4.f31703c
            com.forsale.app.datalayer.network.services.UserService r1 = com.forsale.app.features.more.blockreason.BlockReasonViewModel.x0(r5)
            com.forsale.app.features.more.blockreason.BlockReasonViewModel r5 = r4.f31703c
            r4.f31701a = r1
            r4.f31702b = r3
            java.lang.Object r5 = com.forsale.app.features.more.blockreason.BlockReasonViewModel.v0(r5, r4)
            if (r5 != r0) goto L38
            return r0
        L38:
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.datalayer.network.requestsbodies.BlockingReasonBody r3 = new com.forsale.app.datalayer.network.requestsbodies.BlockingReasonBody
            r3.<init>(r5)
            r5 = 0
            r4.f31701a = r5
            r4.f31702b = r2
            java.lang.Object r5 = r1.getBlockingReason(r3, r4)
            if (r5 != r0) goto L4b
            return r0
        L4b:
            com.forsale.app.datalayer.network.entities.BlockingReasonEntity r5 = (com.forsale.app.datalayer.network.entities.BlockingReasonEntity) r5
            java.lang.String r5 = r5.getBlockReason()
            if (r5 == 0) goto L7c
            com.forsale.app.features.more.blockreason.BlockReasonViewModel r0 = r4.f31703c
            com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r0 = com.forsale.app.features.more.blockreason.BlockReasonViewModel.w0(r0)
            int r1 = t9.y0.G0
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r0 = r0.getString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            if (r5 == 0) goto L7c
            com.forsale.app.features.more.blockreason.BlockReasonViewModel r0 = r4.f31703c
            androidx.databinding.ObservableField r0 = r0.z0()
            r0.k(r5)
        L7c:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.blockreason.BlockReasonViewModel$loadBlockingReason$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((BlockReasonViewModel$loadBlockingReason$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

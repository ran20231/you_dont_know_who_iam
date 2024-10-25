package com.forsale.app.utils.facades;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZendeskSupport.kt */
@d(c = "com.forsale.app.utils.facades.ZendeskSupport$loadUserdata$1", f = "ZendeskSupport.kt", l = {184, 185, 186, 186}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ZendeskSupport$loadUserdata$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f40137a;

    /* renamed from: b  reason: collision with root package name */
    Object f40138b;

    /* renamed from: c  reason: collision with root package name */
    int f40139c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ZendeskSupport f40140d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSupport$loadUserdata$1(ZendeskSupport zendeskSupport, a<? super ZendeskSupport$loadUserdata$1> aVar) {
        super(2, aVar);
        this.f40140d = zendeskSupport;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ZendeskSupport$loadUserdata$1(this.f40140d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r8.f40139c
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 == r6) goto L36
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            kotlin.f.b(r9)
            goto L94
        L1a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L22:
            java.lang.Object r1 = r8.f40137a
            kotlinx.coroutines.flow.MutableStateFlow r1 = (kotlinx.coroutines.flow.MutableStateFlow) r1
            kotlin.f.b(r9)
            goto L89
        L2a:
            java.lang.Object r1 = r8.f40138b
            com.forsale.app.datalayer.database.UserEntity r1 = (com.forsale.app.datalayer.database.UserEntity) r1
            java.lang.Object r5 = r8.f40137a
            com.forsale.app.utils.facades.ZendeskSupport r5 = (com.forsale.app.utils.facades.ZendeskSupport) r5
            kotlin.f.b(r9)
            goto L65
        L36:
            kotlin.f.b(r9)
            goto L4c
        L3a:
            kotlin.f.b(r9)
            com.forsale.app.utils.facades.ZendeskSupport r9 = r8.f40140d
            com.forsale.app.utils.facades.user.UserProfileInteractor r9 = com.forsale.app.utils.facades.ZendeskSupport.b(r9)
            r8.f40139c = r6
            java.lang.Object r9 = r9.i(r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            r1 = r9
            com.forsale.app.datalayer.database.UserEntity r1 = (com.forsale.app.datalayer.database.UserEntity) r1
            if (r1 == 0) goto L94
            com.forsale.app.utils.facades.ZendeskSupport r9 = r8.f40140d
            kotlinx.coroutines.flow.MutableStateFlow r6 = com.forsale.app.utils.facades.ZendeskSupport.c(r9)
            r8.f40137a = r9
            r8.f40138b = r1
            r8.f40139c = r5
            java.lang.Object r5 = r6.emit(r1, r8)
            if (r5 != r0) goto L64
            return r0
        L64:
            r5 = r9
        L65:
            kotlinx.coroutines.flow.MutableStateFlow r9 = com.forsale.app.utils.facades.ZendeskSupport.d(r5)
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = com.forsale.app.utils.facades.ZendeskSupport.b(r5)
            java.lang.Integer r1 = r1.isBlock()
            if (r1 == 0) goto L78
            int r1 = r1.intValue()
            goto L79
        L78:
            r1 = 0
        L79:
            r8.f40137a = r9
            r8.f40138b = r2
            r8.f40139c = r4
            java.lang.Object r1 = r5.q(r1, r8)
            if (r1 != r0) goto L86
            return r0
        L86:
            r7 = r1
            r1 = r9
            r9 = r7
        L89:
            r8.f40137a = r2
            r8.f40139c = r3
            java.lang.Object r9 = r1.emit(r9, r8)
            if (r9 != r0) goto L94
            return r0
        L94:
            wz.p r9 = wz.p.f75480a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.facades.ZendeskSupport$loadUserdata$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((ZendeskSupport$loadUserdata$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.more.forsaleweb;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleWebViewModel.kt */
@d(c = "com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$logOutFromAllSessions$1", f = "ForSaleWebViewModel.kt", l = {62, 62, 66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ForSaleWebViewModel$logOutFromAllSessions$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31887a;

    /* renamed from: b  reason: collision with root package name */
    int f31888b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ForSaleWebViewModel f31889c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleWebViewModel$logOutFromAllSessions$1(ForSaleWebViewModel forSaleWebViewModel, zz.a<? super ForSaleWebViewModel$logOutFromAllSessions$1> aVar) {
        super(2, aVar);
        this.f31889c = forSaleWebViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForSaleWebViewModel$logOutFromAllSessions$1(this.f31889c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f31888b
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2a
            if (r1 == r5) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.f.b(r8)
            goto L7f
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            kotlin.f.b(r8)
            goto L5a
        L22:
            java.lang.Object r1 = r7.f31887a
            com.forsale.app.datalayer.network.services.QRServices r1 = (com.forsale.app.datalayer.network.services.QRServices) r1
            kotlin.f.b(r8)
            goto L48
        L2a:
            kotlin.f.b(r8)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r8 = r7.f31889c
            com.forsale.app.datalayer.network.services.QRServices r1 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.x0(r8)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r8 = r7.f31889c
            jj.b r8 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.w0(r8)
            kj.b r8 = r8.c()
            r7.f31887a = r1
            r7.f31888b = r5
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L48
            return r0
        L48:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.datalayer.network.requestsbodies.LogoutAllSessionsAsyncBody r6 = new com.forsale.app.datalayer.network.requestsbodies.LogoutAllSessionsAsyncBody
            r6.<init>(r8)
            r7.f31887a = r4
            r7.f31888b = r3
            java.lang.Object r8 = r1.logoutAllSessionsAsync(r6, r7)
            if (r8 != r0) goto L5a
            return r0
        L5a:
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r1 = r7.f31889c
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L6c
            com.forsale.app.utils.OneShotEventHandler r8 = r1.B0()
            com.forsale.app.utils.OneShotEventHandler.d(r8, r4, r5, r4)
            goto L7f
        L6c:
            kotlinx.coroutines.flow.MutableSharedFlow r8 = r1.T()
            int r1 = t9.y0.f70381b4
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            r7.f31888b = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L7f
            return r0
        L7f:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$logOutFromAllSessions$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForSaleWebViewModel$logOutFromAllSessions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

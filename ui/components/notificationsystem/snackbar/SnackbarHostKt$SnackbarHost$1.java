package com.forsale.ui.components.notificationsystem.snackbar;

import androidx.compose.ui.platform.h;
import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SnackbarHost.kt */
@d(c = "com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt$SnackbarHost$1", f = "SnackbarHost.kt", l = {114, 116}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42715a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ak.a f42716b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h f42717c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f42718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(ak.a aVar, h hVar, k0<Boolean> k0Var, a<? super SnackbarHostKt$SnackbarHost$1> aVar2) {
        super(2, aVar2);
        this.f42716b = aVar;
        this.f42717c = hVar;
        this.f42718d = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.f42716b, this.f42717c, this.f42718d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f42715a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r7)
            goto L56
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            kotlin.f.b(r7)
            goto L3d
        L1e:
            kotlin.f.b(r7)
            ak.a r7 = r6.f42716b
            if (r7 == 0) goto L56
            com.forsale.designSystem.notificationsystem.SnackbarDuration r7 = r7.getDuration()
            androidx.compose.ui.platform.h r1 = r6.f42717c
            long r4 = com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt.e(r7, r1)
            j0.k0<java.lang.Boolean> r7 = r6.f42718d
            com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt.d(r7, r3)
            r6.f42715a = r3
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r4, r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            j0.k0<java.lang.Boolean> r7 = r6.f42718d
            r1 = 0
            com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt.d(r7, r1)
            ak.a r7 = r6.f42716b
            com.forsale.designSystem.notificationsystem.SnackBarAnimationDuration r1 = r7.e()
            int r1 = r1.getValue()
            r6.f42715a = r2
            java.lang.Object r7 = r7.c(r1, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.notificationsystem.snackbar.SnackbarHostKt$SnackbarHost$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

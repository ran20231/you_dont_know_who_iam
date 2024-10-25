package com.forsale.app.features.more.forsaleweb;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleWebViewModel.kt */
@d(c = "com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$getAllSessions$2", f = "ForSaleWebViewModel.kt", l = {43, 43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ForSaleWebViewModel$getAllSessions$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31884a;

    /* renamed from: b  reason: collision with root package name */
    int f31885b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ForSaleWebViewModel f31886c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleWebViewModel$getAllSessions$2(ForSaleWebViewModel forSaleWebViewModel, zz.a<? super ForSaleWebViewModel$getAllSessions$2> aVar) {
        super(2, aVar);
        this.f31886c = forSaleWebViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForSaleWebViewModel$getAllSessions$2(this.f31886c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r4.f31885b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.f.b(r5)
            goto L53
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            java.lang.Object r1 = r4.f31884a
            com.forsale.app.datalayer.network.services.QRServices r1 = (com.forsale.app.datalayer.network.services.QRServices) r1
            kotlin.f.b(r5)
            goto L40
        L22:
            kotlin.f.b(r5)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r5 = r4.f31886c
            com.forsale.app.datalayer.network.services.QRServices r1 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.x0(r5)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r5 = r4.f31886c
            jj.b r5 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.w0(r5)
            kj.b r5 = r5.c()
            r4.f31884a = r1
            r4.f31885b = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L40
            return r0
        L40:
            java.lang.String r5 = (java.lang.String) r5
            com.forsale.app.datalayer.network.requestsbodies.GetAllQRSessionsBody r3 = new com.forsale.app.datalayer.network.requestsbodies.GetAllQRSessionsBody
            r3.<init>(r5)
            r5 = 0
            r4.f31884a = r5
            r4.f31885b = r2
            java.lang.Object r5 = r1.getAllSessionsAsync(r3, r4)
            if (r5 != r0) goto L53
            return r0
        L53:
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L60
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r0 = r4.f31886c
            androidx.lifecycle.b0 r0 = r0.A0()
            r0.postValue(r5)
        L60:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$getAllSessions$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForSaleWebViewModel$getAllSessions$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

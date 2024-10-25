package com.forsale.app.features.more.forsaleweb;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ForSaleWebViewModel.kt */
@d(c = "com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$verifyQRCode$2", f = "ForSaleWebViewModel.kt", l = {52, 52, 53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ForSaleWebViewModel$verifyQRCode$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31890a;

    /* renamed from: b  reason: collision with root package name */
    Object f31891b;

    /* renamed from: c  reason: collision with root package name */
    int f31892c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ForSaleWebViewModel f31893d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f31894e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForSaleWebViewModel$verifyQRCode$2(ForSaleWebViewModel forSaleWebViewModel, String str, zz.a<? super ForSaleWebViewModel$verifyQRCode$2> aVar) {
        super(2, aVar);
        this.f31893d = forSaleWebViewModel;
        this.f31894e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForSaleWebViewModel$verifyQRCode$2(this.f31893d, this.f31894e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f31892c
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r0 = r6.f31891b
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r0 = (com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel) r0
            kotlin.f.b(r7)
            goto L7b
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            kotlin.f.b(r7)
            goto L60
        L25:
            java.lang.Object r1 = r6.f31890a
            com.forsale.app.datalayer.network.services.QRServices r1 = (com.forsale.app.datalayer.network.services.QRServices) r1
            kotlin.f.b(r7)
            goto L4b
        L2d:
            kotlin.f.b(r7)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r7 = r6.f31893d
            com.forsale.app.datalayer.network.services.QRServices r1 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.x0(r7)
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r7 = r6.f31893d
            jj.b r7 = com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.w0(r7)
            kj.b r7 = r7.c()
            r6.f31890a = r1
            r6.f31892c = r4
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r4 = r6.f31894e
            com.forsale.app.datalayer.network.requestsbodies.VerifyQRCodeBody r5 = new com.forsale.app.datalayer.network.requestsbodies.VerifyQRCodeBody
            r5.<init>(r7, r4)
            r7 = 0
            r6.f31890a = r7
            r6.f31892c = r3
            java.lang.Object r7 = r1.verifyQRCodeAsync(r5, r6)
            if (r7 != r0) goto L60
            return r0
        L60:
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel r1 = r6.f31893d
            r3 = r7
            com.forsale.app.datalayer.network.responses.VerifyQRCodeResponse r3 = (com.forsale.app.datalayer.network.responses.VerifyQRCodeResponse) r3
            kotlinx.coroutines.flow.MutableSharedFlow r4 = r1.f0()
            java.lang.String r3 = r3.getMessage()
            r6.f31890a = r7
            r6.f31891b = r1
            r6.f31892c = r2
            java.lang.Object r7 = r4.emit(r3, r6)
            if (r7 != r0) goto L7a
            return r0
        L7a:
            r0 = r1
        L7b:
            com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel.v0(r0)
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel$verifyQRCode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForSaleWebViewModel$verifyQRCode$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

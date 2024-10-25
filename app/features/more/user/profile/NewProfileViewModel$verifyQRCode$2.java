package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$verifyQRCode$2", f = "NewProfileViewModel.kt", l = {278, 278, 279}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$verifyQRCode$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33660a;

    /* renamed from: b  reason: collision with root package name */
    int f33661b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33662c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f33663d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$verifyQRCode$2(NewProfileViewModel newProfileViewModel, String str, zz.a<? super NewProfileViewModel$verifyQRCode$2> aVar) {
        super(2, aVar);
        this.f33662c = newProfileViewModel;
        this.f33663d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$verifyQRCode$2(this.f33662c, this.f33663d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f33661b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r8)
            goto L7d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.f.b(r8)
            goto L54
        L21:
            java.lang.Object r1 = r7.f33660a
            com.forsale.app.datalayer.network.services.QRServices r1 = (com.forsale.app.datalayer.network.services.QRServices) r1
            kotlin.f.b(r8)
            goto L3f
        L29:
            kotlin.f.b(r8)
            com.forsale.app.features.more.user.profile.NewProfileViewModel r8 = r7.f33662c
            com.forsale.app.datalayer.network.services.QRServices r1 = com.forsale.app.features.more.user.profile.NewProfileViewModel.l(r8)
            com.forsale.app.features.more.user.profile.NewProfileViewModel r8 = r7.f33662c
            r7.f33660a = r1
            r7.f33661b = r4
            java.lang.Object r8 = com.forsale.app.features.more.user.profile.NewProfileViewModel.e(r8, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r4 = r7.f33663d
            com.forsale.app.datalayer.network.requestsbodies.VerifyQRCodeBody r5 = new com.forsale.app.datalayer.network.requestsbodies.VerifyQRCodeBody
            r5.<init>(r8, r4)
            r8 = 0
            r7.f33660a = r8
            r7.f33661b = r3
            java.lang.Object r8 = r1.verifyQRCodeAsync(r5, r7)
            if (r8 != r0) goto L54
            return r0
        L54:
            com.forsale.app.features.more.user.profile.NewProfileViewModel r1 = r7.f33662c
            r3 = r8
            com.forsale.app.datalayer.network.responses.VerifyQRCodeResponse r3 = (com.forsale.app.datalayer.network.responses.VerifyQRCodeResponse) r3
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.forsale.app.features.more.user.profile.NewProfileViewModel.s(r1)
            lf.a r4 = new lf.a
            com.forsale.app.feedback.a$a r5 = new com.forsale.app.feedback.a$a
            int r6 = gk.b.f56934a
            r5.<init>(r6)
            rj.a$a r6 = new rj.a$a
            java.lang.String r3 = r3.getMessage()
            r6.<init>(r3)
            r4.<init>(r5, r6)
            r7.f33660a = r8
            r7.f33661b = r2
            java.lang.Object r8 = r1.emit(r4, r7)
            if (r8 != r0) goto L7d
            return r0
        L7d:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$verifyQRCode$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$verifyQRCode$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

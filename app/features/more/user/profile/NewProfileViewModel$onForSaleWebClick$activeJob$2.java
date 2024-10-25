package com.forsale.app.features.more.user.profile;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onForSaleWebClick$activeJob$2", f = "NewProfileViewModel.kt", l = {264, 264, 266, 268}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onForSaleWebClick$activeJob$2 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33596a;

    /* renamed from: b  reason: collision with root package name */
    Object f33597b;

    /* renamed from: c  reason: collision with root package name */
    int f33598c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33599d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onForSaleWebClick$activeJob$2(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onForSaleWebClick$activeJob$2> aVar) {
        super(2, aVar);
        this.f33599d = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onForSaleWebClick$activeJob$2(this.f33599d, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r7.f33598c
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L32
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L26
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            java.lang.Object r0 = r7.f33597b
            com.forsale.app.features.more.user.profile.NewProfileViewModel r0 = (com.forsale.app.features.more.user.profile.NewProfileViewModel) r0
            kotlin.f.b(r8)
            goto L9a
        L26:
            kotlin.f.b(r8)
            goto L5b
        L2a:
            java.lang.Object r1 = r7.f33596a
            com.forsale.app.datalayer.network.services.QRServices r1 = (com.forsale.app.datalayer.network.services.QRServices) r1
            kotlin.f.b(r8)
            goto L48
        L32:
            kotlin.f.b(r8)
            com.forsale.app.features.more.user.profile.NewProfileViewModel r8 = r7.f33599d
            com.forsale.app.datalayer.network.services.QRServices r1 = com.forsale.app.features.more.user.profile.NewProfileViewModel.l(r8)
            com.forsale.app.features.more.user.profile.NewProfileViewModel r8 = r7.f33599d
            r7.f33596a = r1
            r7.f33598c = r5
            java.lang.Object r8 = com.forsale.app.features.more.user.profile.NewProfileViewModel.e(r8, r7)
            if (r8 != r0) goto L48
            return r0
        L48:
            java.lang.String r8 = (java.lang.String) r8
            com.forsale.app.datalayer.network.requestsbodies.GetAllQRSessionsBody r6 = new com.forsale.app.datalayer.network.requestsbodies.GetAllQRSessionsBody
            r6.<init>(r8)
            r8 = 0
            r7.f33596a = r8
            r7.f33598c = r4
            java.lang.Object r8 = r1.getAllSessionsAsync(r6, r7)
            if (r8 != r0) goto L5b
            return r0
        L5b:
            com.forsale.app.features.more.user.profile.NewProfileViewModel r1 = r7.f33599d
            r4 = r8
            java.util.List r4 = (java.util.List) r4
            r6 = r4
            java.util.Collection r6 = (java.util.Collection) r6
            if (r6 == 0) goto L6d
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L6c
            goto L6d
        L6c:
            r5 = 0
        L6d:
            if (r5 == 0) goto L84
            kotlinx.coroutines.flow.MutableSharedFlow r2 = com.forsale.app.features.more.user.profile.NewProfileViewModel.r(r1)
            com.forsale.app.features.more.user.profile.s r4 = com.forsale.app.features.more.user.profile.s.f33708a
            r7.f33596a = r8
            r7.f33597b = r1
            r7.f33598c = r3
            java.lang.Object r8 = r2.emit(r4, r7)
            if (r8 != r0) goto L82
            return r0
        L82:
            r0 = r1
            goto L9a
        L84:
            kotlinx.coroutines.flow.MutableSharedFlow r3 = com.forsale.app.features.more.user.profile.NewProfileViewModel.r(r1)
            com.forsale.app.features.more.user.profile.t r5 = new com.forsale.app.features.more.user.profile.t
            r5.<init>(r4)
            r7.f33596a = r8
            r7.f33597b = r1
            r7.f33598c = r2
            java.lang.Object r8 = r3.emit(r5, r7)
            if (r8 != r0) goto L82
            return r0
        L9a:
            com.forsale.app.features.more.user.profile.f r8 = com.forsale.app.features.more.user.profile.NewProfileViewModel.k(r0)
            r8.h()
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.user.profile.NewProfileViewModel$onForSaleWebClick$activeJob$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onForSaleWebClick$activeJob$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

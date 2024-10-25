package com.forsale.app.features.auth.login;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignInViewModel.kt */
@d(c = "com.forsale.app.features.auth.login.SignInViewModel$login$1", f = "SignInViewModel.kt", l = {89, 90, 97, FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SignInViewModel$login$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f22792a;

    /* renamed from: b  reason: collision with root package name */
    int f22793b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SignInViewModel f22794c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f22795d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f22796e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInViewModel$login$1(SignInViewModel signInViewModel, String str, String str2, a<? super SignInViewModel$login$1> aVar) {
        super(2, aVar);
        this.f22794c = signInViewModel;
        this.f22795d = str;
        this.f22796e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new SignInViewModel$login$1(this.f22794c, this.f22795d, this.f22796e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f22793b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L3a
            if (r1 == r5) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r12.f22792a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.f.b(r13)
            goto Lc7
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> Laf
            goto Ldb
        L2a:
            java.lang.Object r1 = r12.f22792a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> Laf
            goto L8d
        L32:
            java.lang.Object r1 = r12.f22792a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> Laf
            goto L70
        L3a:
            kotlin.f.b(r13)
            com.forsale.app.features.auth.login.SignInViewModel r13 = r12.f22794c
            com.forsale.app.features.auth.login.SignInViewModel.f(r13)
            java.lang.String r13 = r12.f22795d
            com.forsale.app.features.auth.login.SignInViewModel r1 = r12.f22794c
            java.lang.String r1 = r1.E()
            java.lang.String r13 = ka.b.a(r13, r1)
            com.forsale.app.features.auth.login.SignInViewModel r1 = r12.f22794c
            java.lang.String r6 = r12.f22796e
            java.lang.String r7 = r12.f22795d
            boolean r1 = com.forsale.app.features.auth.login.SignInViewModel.e(r1, r6, r7)
            if (r1 == 0) goto Ldb
            com.forsale.app.features.auth.login.SignInViewModel r1 = r12.f22794c     // Catch: java.lang.Exception -> Laf
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.auth.login.SignInViewModel.l(r1)     // Catch: java.lang.Exception -> Laf
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r5)     // Catch: java.lang.Exception -> Laf
            r12.f22792a = r13     // Catch: java.lang.Exception -> Laf
            r12.f22793b = r5     // Catch: java.lang.Exception -> Laf
            java.lang.Object r1 = r1.emit(r6, r12)     // Catch: java.lang.Exception -> Laf
            if (r1 != r0) goto L6f
            return r0
        L6f:
            r1 = r13
        L70:
            com.forsale.app.features.auth.login.SignInViewModel r13 = r12.f22794c     // Catch: java.lang.Exception -> Laf
            com.forsale.app.features.auth.interactors.SignInInteractor r13 = com.forsale.app.features.auth.login.SignInViewModel.k(r13)     // Catch: java.lang.Exception -> Laf
            com.forsale.app.datalayer.network.requestsbodies.LoginBody r11 = new com.forsale.app.datalayer.network.requestsbodies.LoginBody     // Catch: java.lang.Exception -> Laf
            r7 = 0
            java.lang.String r8 = r12.f22796e     // Catch: java.lang.Exception -> Laf
            r9 = 2
            r10 = 0
            r5 = r11
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Laf
            r12.f22792a = r1     // Catch: java.lang.Exception -> Laf
            r12.f22793b = r4     // Catch: java.lang.Exception -> Laf
            java.lang.Object r13 = r13.a(r11, r12)     // Catch: java.lang.Exception -> Laf
            if (r13 != r0) goto L8d
            return r0
        L8d:
            com.forsale.app.features.auth.login.SignInViewModel r4 = r12.f22794c     // Catch: java.lang.Exception -> Laf
            r5 = r13
            com.forsale.app.datalayer.network.responses.AuthResponse r5 = (com.forsale.app.datalayer.network.responses.AuthResponse) r5     // Catch: java.lang.Exception -> Laf
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r6 = r5.getData()     // Catch: java.lang.Exception -> Laf
            com.forsale.app.datalayer.database.UserEntity r6 = r6.getUser()     // Catch: java.lang.Exception -> Laf
            if (r6 == 0) goto Ldb
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Exception -> Laf
            if (r5 != 0) goto La4
            java.lang.String r5 = "Login Successfully"
        La4:
            r12.f22792a = r13     // Catch: java.lang.Exception -> Laf
            r12.f22793b = r3     // Catch: java.lang.Exception -> Laf
            java.lang.Object r13 = com.forsale.app.features.auth.login.SignInViewModel.r(r4, r1, r5, r12)     // Catch: java.lang.Exception -> Laf
            if (r13 != r0) goto Ldb
            return r0
        Laf:
            r13 = move-exception
            com.forsale.app.features.auth.login.SignInViewModel r1 = r12.f22794c
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.auth.login.SignInViewModel.l(r1)
            r3 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)
            r12.f22792a = r13
            r12.f22793b = r2
            java.lang.Object r1 = r1.emit(r3, r12)
            if (r1 != r0) goto Lc6
            return r0
        Lc6:
            r0 = r13
        Lc7:
            com.forsale.app.features.auth.login.SignInViewModel r13 = r12.f22794c
            com.forsale.app.features.auth.utils.AuthErrorHandler r13 = com.forsale.app.features.auth.login.SignInViewModel.j(r13)
            com.forsale.app.features.auth.login.SignInViewModel$login$1$2 r1 = new com.forsale.app.features.auth.login.SignInViewModel$login$1$2
            com.forsale.app.features.auth.login.SignInViewModel r2 = r12.f22794c
            r1.<init>()
            bj.a r13 = r13.a(r1)
            r13.b(r0)
        Ldb:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.login.SignInViewModel$login$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((SignInViewModel$login$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

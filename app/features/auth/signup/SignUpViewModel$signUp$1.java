package com.forsale.app.features.auth.signup;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SignUpViewModel.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpViewModel$signUp$1", f = "SignUpViewModel.kt", l = {77, 78, 82, 84}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SignUpViewModel$signUp$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f22905a;

    /* renamed from: b  reason: collision with root package name */
    int f22906b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22907c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ja.a f22908d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ boolean f22909e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpViewModel$signUp$1(SignUpViewModel signUpViewModel, ja.a aVar, boolean z11, zz.a<? super SignUpViewModel$signUp$1> aVar2) {
        super(2, aVar2);
        this.f22907c = signUpViewModel;
        this.f22908d = aVar;
        this.f22909e = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpViewModel$signUp$1(this.f22907c, this.f22908d, this.f22909e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r12.f22906b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L39
            if (r1 == r5) goto L30
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r12.f22905a
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.f.b(r13)
            goto Lad
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> L2e
            goto Lc1
        L2a:
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> L2e
            goto L8b
        L2e:
            r13 = move-exception
            goto L96
        L30:
            java.lang.Object r1 = r12.f22905a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.f.b(r13)     // Catch: java.lang.Exception -> L2e
        L37:
            r7 = r1
            goto L6b
        L39:
            kotlin.f.b(r13)
            com.forsale.app.features.auth.signup.SignUpViewModel r13 = r12.f22907c
            ja.a r1 = r12.f22908d
            boolean r13 = com.forsale.app.features.auth.signup.SignUpViewModel.e(r13, r1)
            if (r13 == 0) goto Lc1
            ja.a r13 = r12.f22908d
            java.lang.String r13 = r13.f()
            com.forsale.app.features.auth.signup.SignUpViewModel r1 = r12.f22907c
            java.lang.String r1 = r1.F()
            java.lang.String r1 = ka.b.a(r13, r1)
            com.forsale.app.features.auth.signup.SignUpViewModel r13 = r12.f22907c     // Catch: java.lang.Exception -> L2e
            kotlinx.coroutines.flow.MutableStateFlow r13 = com.forsale.app.features.auth.signup.SignUpViewModel.l(r13)     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r5)     // Catch: java.lang.Exception -> L2e
            r12.f22905a = r1     // Catch: java.lang.Exception -> L2e
            r12.f22906b = r5     // Catch: java.lang.Exception -> L2e
            java.lang.Object r13 = r13.emit(r6, r12)     // Catch: java.lang.Exception -> L2e
            if (r13 != r0) goto L37
            return r0
        L6b:
            com.forsale.app.features.auth.signup.SignUpViewModel r13 = r12.f22907c     // Catch: java.lang.Exception -> L2e
            ga.d r13 = com.forsale.app.features.auth.signup.SignUpViewModel.j(r13)     // Catch: java.lang.Exception -> L2e
            ja.a r5 = r12.f22908d     // Catch: java.lang.Exception -> L2e
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 13
            r11 = 0
            ja.a r1 = ja.a.b(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> L2e
            boolean r5 = r12.f22909e     // Catch: java.lang.Exception -> L2e
            r6 = 0
            r12.f22905a = r6     // Catch: java.lang.Exception -> L2e
            r12.f22906b = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r13 = r13.a(r1, r5, r12)     // Catch: java.lang.Exception -> L2e
            if (r13 != r0) goto L8b
            return r0
        L8b:
            com.forsale.app.features.auth.signup.SignUpViewModel r13 = r12.f22907c     // Catch: java.lang.Exception -> L2e
            r12.f22906b = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r13 = com.forsale.app.features.auth.signup.SignUpViewModel.s(r13, r12)     // Catch: java.lang.Exception -> L2e
            if (r13 != r0) goto Lc1
            return r0
        L96:
            com.forsale.app.features.auth.signup.SignUpViewModel r1 = r12.f22907c
            kotlinx.coroutines.flow.MutableStateFlow r1 = com.forsale.app.features.auth.signup.SignUpViewModel.l(r1)
            r3 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.a.a(r3)
            r12.f22905a = r13
            r12.f22906b = r2
            java.lang.Object r1 = r1.emit(r3, r12)
            if (r1 != r0) goto Lac
            return r0
        Lac:
            r0 = r13
        Lad:
            com.forsale.app.features.auth.signup.SignUpViewModel r13 = r12.f22907c
            com.forsale.app.features.auth.utils.AuthErrorHandler r13 = com.forsale.app.features.auth.signup.SignUpViewModel.g(r13)
            com.forsale.app.features.auth.signup.SignUpViewModel$signUp$1$1 r1 = new com.forsale.app.features.auth.signup.SignUpViewModel$signUp$1$1
            com.forsale.app.features.auth.signup.SignUpViewModel r2 = r12.f22907c
            r1.<init>()
            bj.a r13 = r13.a(r1)
            r13.b(r0)
        Lc1:
            wz.p r13 = wz.p.f75480a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.signup.SignUpViewModel$signUp$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpViewModel$signUp$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

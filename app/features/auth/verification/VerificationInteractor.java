package com.forsale.app.features.auth.verification;

import com.forsale.app.datalayer.network.requestsbodies.ForgotPasswordBody;
import com.forsale.app.datalayer.network.requestsbodies.VerifyRegisterBody;
import com.forsale.app.datalayer.network.requestsbodies.VerifyResetPasswordBody;
import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.datalayer.network.responses.VerifyRegisterResponse;
import com.forsale.app.datalayer.network.responses.VerifyResetPassword;
import com.forsale.app.datalayer.repositories.AuthRepository;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import java.util.Locale;
import ka.b;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: VerificationInteractor.kt */
/* loaded from: classes2.dex */
public final class VerificationInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AuthRepository f22933a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileInteractor f22934b;

    public VerificationInteractor(AuthRepository authRepository, UserProfileInteractor userProfileInteractor) {
        o.i(authRepository, "authRepository");
        o.i(userProfileInteractor, "userProfileInteractor");
        this.f22933a = authRepository;
        this.f22934b = userProfileInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, ja.a r16, int r17, zz.a<? super com.forsale.app.datalayer.network.responses.AuthResponse> r18) {
        /*
            r14 = this;
            r0 = r14
            r1 = r18
            boolean r2 = r1 instanceof com.forsale.app.features.auth.verification.VerificationInteractor$register$1
            if (r2 == 0) goto L16
            r2 = r1
            com.forsale.app.features.auth.verification.VerificationInteractor$register$1 r2 = (com.forsale.app.features.auth.verification.VerificationInteractor$register$1) r2
            int r3 = r2.f22939e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f22939e = r3
            goto L1b
        L16:
            com.forsale.app.features.auth.verification.VerificationInteractor$register$1 r2 = new com.forsale.app.features.auth.verification.VerificationInteractor$register$1
            r2.<init>(r14, r1)
        L1b:
            r6 = r2
            java.lang.Object r1 = r6.f22937c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.f()
            int r3 = r6.f22939e
            r4 = 3
            r5 = 2
            r7 = 1
            if (r3 == 0) goto L51
            if (r3 == r7) goto L49
            if (r3 == r5) goto L3e
            if (r3 != r4) goto L36
            java.lang.Object r2 = r6.f22935a
            kotlin.f.b(r1)
            goto Lc2
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3e:
            java.lang.Object r3 = r6.f22936b
            java.lang.Object r5 = r6.f22935a
            com.forsale.app.features.auth.verification.VerificationInteractor r5 = (com.forsale.app.features.auth.verification.VerificationInteractor) r5
            kotlin.f.b(r1)
            r1 = r3
            goto L9e
        L49:
            java.lang.Object r3 = r6.f22935a
            com.forsale.app.features.auth.verification.VerificationInteractor r3 = (com.forsale.app.features.auth.verification.VerificationInteractor) r3
            kotlin.f.b(r1)
            goto L7f
        L51:
            kotlin.f.b(r1)
            com.forsale.app.datalayer.repositories.AuthRepository r1 = r0.f22933a
            com.forsale.app.datalayer.network.requestsbodies.RegisterBody r3 = new com.forsale.app.datalayer.network.requestsbodies.RegisterBody
            java.lang.String r8 = r16.f()
            r9 = r15
            java.lang.String r9 = ka.b.a(r8, r15)
            java.lang.String r10 = r16.c()
            java.lang.String r11 = r16.d()
            java.lang.String r12 = r16.e()
            r8 = r3
            r13 = r17
            r8.<init>(r9, r10, r11, r12, r13)
            r6.f22935a = r0
            r6.f22939e = r7
            java.lang.Object r1 = r1.register(r3, r6)
            if (r1 != r2) goto L7e
            return r2
        L7e:
            r3 = r0
        L7f:
            r7 = r1
            com.forsale.app.datalayer.network.responses.AuthResponse r7 = (com.forsale.app.datalayer.network.responses.AuthResponse) r7
            com.forsale.app.datalayer.repositories.AuthRepository r8 = r3.f22933a
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r7 = r7.getData()
            com.forsale.app.datalayer.network.responses.AuthResponse$Token r7 = r7.getToken()
            java.lang.String r7 = r7.getAccessToken()
            r6.f22935a = r3
            r6.f22936b = r1
            r6.f22939e = r5
            java.lang.Object r5 = r8.saveUserToken(r7, r6)
            if (r5 != r2) goto L9d
            return r2
        L9d:
            r5 = r3
        L9e:
            r3 = r1
            com.forsale.app.datalayer.network.responses.AuthResponse r3 = (com.forsale.app.datalayer.network.responses.AuthResponse) r3
            com.forsale.app.utils.facades.user.UserProfileInteractor r5 = r5.f22934b
            com.forsale.app.datalayer.network.responses.AuthResponse$Data r3 = r3.getData()
            com.forsale.app.datalayer.database.UserEntity r7 = r3.getUser()
            r8 = 0
            r9 = 2
            r10 = 0
            r6.f22935a = r1
            r3 = 0
            r6.f22936b = r3
            r6.f22939e = r4
            r3 = r5
            r4 = r7
            r5 = r8
            r7 = r9
            r8 = r10
            java.lang.Object r3 = com.forsale.app.utils.facades.user.UserProfileInteractor.v(r3, r4, r5, r6, r7, r8)
            if (r3 != r2) goto Lc1
            return r2
        Lc1:
            r2 = r1
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.auth.verification.VerificationInteractor.a(java.lang.String, ja.a, int, zz.a):java.lang.Object");
    }

    public final Object b(String str, String str2, ResendOTPMethods resendOTPMethods, a<? super RequestCompleted> aVar) {
        AuthRepository authRepository = this.f22933a;
        String a11 = b.a(str2, str);
        String lowerCase = resendOTPMethods.getMethod().toLowerCase(Locale.ROOT);
        o.h(lowerCase, "toLowerCase(...)");
        return authRepository.forgotPassword(new ForgotPasswordBody(a11, lowerCase), aVar);
    }

    public final Object c(String str, ja.a aVar, ResendOTPMethods resendOTPMethods, a<? super VerifyRegisterResponse> aVar2) {
        AuthRepository authRepository = this.f22933a;
        String a11 = b.a(aVar.f(), str);
        String c11 = aVar.c();
        String d11 = aVar.d();
        String e11 = aVar.e();
        String lowerCase = resendOTPMethods.getMethod().toLowerCase(Locale.ROOT);
        o.h(lowerCase, "toLowerCase(...)");
        return authRepository.verifyRegister(new VerifyRegisterBody(a11, c11, d11, e11, lowerCase), aVar2);
    }

    public final Object d(String str, String str2, int i11, a<? super VerifyResetPassword> aVar) {
        return this.f22933a.verifyResetPassword(new VerifyResetPasswordBody(b.a(str2, str), i11), aVar);
    }
}

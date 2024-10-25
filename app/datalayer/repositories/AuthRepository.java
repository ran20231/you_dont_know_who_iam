package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.requestsbodies.ChangePasswordBody;
import com.forsale.app.datalayer.network.requestsbodies.ForgotPasswordBody;
import com.forsale.app.datalayer.network.requestsbodies.LoginBody;
import com.forsale.app.datalayer.network.requestsbodies.RegisterBody;
import com.forsale.app.datalayer.network.requestsbodies.ResetPasswordBody;
import com.forsale.app.datalayer.network.requestsbodies.VerifyRegisterBody;
import com.forsale.app.datalayer.network.requestsbodies.VerifyResetPasswordBody;
import com.forsale.app.datalayer.network.responses.AuthResponse;
import com.forsale.app.datalayer.network.responses.RequestCompleted;
import com.forsale.app.datalayer.network.responses.VerifyRegisterResponse;
import com.forsale.app.datalayer.network.responses.VerifyResetPassword;
import com.forsale.app.datalayer.network.services.AuthService;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: AuthRepository.kt */
/* loaded from: classes2.dex */
public final class AuthRepository {
    public static final int $stable = 8;
    private final AuthService authService;
    private final jj.b preferences;

    public AuthRepository(AuthService authService, jj.b preferences) {
        o.i(authService, "authService");
        o.i(preferences, "preferences");
        this.authService = authService;
        this.preferences = preferences;
    }

    public final Object changePassword(ChangePasswordBody changePasswordBody, zz.a<? super RequestCompleted> aVar) {
        return this.authService.changePassword(changePasswordBody, aVar);
    }

    public final Object forgotPassword(ForgotPasswordBody forgotPasswordBody, zz.a<? super RequestCompleted> aVar) {
        return this.authService.forgotPassword(forgotPasswordBody, aVar);
    }

    public final Object getUserToken(zz.a<? super AuthResponse> aVar) {
        return this.authService.getToken(aVar);
    }

    public final Object login(LoginBody loginBody, zz.a<? super AuthResponse> aVar) {
        return this.authService.login(loginBody, aVar);
    }

    public final Object logout(zz.a<? super RequestCompleted> aVar) {
        return this.authService.logout(aVar);
    }

    public final Object logoutFromAllDevices(zz.a<? super RequestCompleted> aVar) {
        return this.authService.logoutFromAllDevices(aVar);
    }

    public final Object register(RegisterBody registerBody, zz.a<? super AuthResponse> aVar) {
        return this.authService.register(registerBody, aVar);
    }

    public final Object resetPassword(ResetPasswordBody resetPasswordBody, zz.a<? super RequestCompleted> aVar) {
        return this.authService.resetPassword(resetPasswordBody, aVar);
    }

    public final Object saveUserToken(String str, zz.a<? super p> aVar) {
        Object f11;
        Object h11 = this.preferences.l().h(str, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }

    public final Object verifyRegister(VerifyRegisterBody verifyRegisterBody, zz.a<? super VerifyRegisterResponse> aVar) {
        return this.authService.verifyRegister(verifyRegisterBody, aVar);
    }

    public final Object verifyResetPassword(VerifyResetPasswordBody verifyResetPasswordBody, zz.a<? super VerifyResetPassword> aVar) {
        return this.authService.verifyResetPassword(verifyResetPasswordBody, aVar);
    }
}

package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.errorhandling.ForSaleDataResult;
import com.forsale.app.datalayer.network.requestsbodies.ChangePasswordBody;
import com.forsale.app.datalayer.network.requestsbodies.EditUserBody;
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
import i10.a;
import i10.f;
import i10.o;
import i10.p;
/* compiled from: AuthService.kt */
/* loaded from: classes2.dex */
public interface AuthService {
    @p("users/auth/change-password")
    Object changePassword(@a ChangePasswordBody changePasswordBody, zz.a<? super RequestCompleted> aVar);

    @p("users/auth/user")
    Object editUser(@a EditUserBody editUserBody, zz.a<? super AuthResponse> aVar);

    @o("users/auth/forget-password")
    Object forgotPassword(@a ForgotPasswordBody forgotPasswordBody, zz.a<? super RequestCompleted> aVar);

    @f("users/auth/token")
    Object getToken(zz.a<? super AuthResponse> aVar);

    @f("users/auth/user")
    Object getUser(zz.a<? super ForSaleDataResult<AuthResponse>> aVar);

    @o("users/auth/login")
    Object login(@a LoginBody loginBody, zz.a<? super AuthResponse> aVar);

    @o("users/auth/logout")
    Object logout(zz.a<? super RequestCompleted> aVar);

    @o("users/auth/logoutAllDevices")
    Object logoutFromAllDevices(zz.a<? super RequestCompleted> aVar);

    @o("users/auth/register")
    Object register(@a RegisterBody registerBody, zz.a<? super AuthResponse> aVar);

    @o("users/auth/reset-password")
    Object resetPassword(@a ResetPasswordBody resetPasswordBody, zz.a<? super RequestCompleted> aVar);

    @o("users/auth/verify-register")
    Object verifyRegister(@a VerifyRegisterBody verifyRegisterBody, zz.a<? super VerifyRegisterResponse> aVar);

    @o("users/auth/verify-reset-password")
    Object verifyResetPassword(@a VerifyResetPasswordBody verifyResetPasswordBody, zz.a<? super VerifyResetPassword> aVar);
}

package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ChangePasswordBody.kt */
/* loaded from: classes2.dex */
public final class ChangePasswordBody {
    public static final int $stable = 0;
    @c("new_password")
    private final String newPassword;
    @c("password")
    private final String password;
    @c("new_password_confirmation")
    private final String passwordConfirmation;

    public ChangePasswordBody(String password, String newPassword, String passwordConfirmation) {
        o.i(password, "password");
        o.i(newPassword, "newPassword");
        o.i(passwordConfirmation, "passwordConfirmation");
        this.password = password;
        this.newPassword = newPassword;
        this.passwordConfirmation = passwordConfirmation;
    }

    public static /* synthetic */ ChangePasswordBody copy$default(ChangePasswordBody changePasswordBody, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changePasswordBody.password;
        }
        if ((i11 & 2) != 0) {
            str2 = changePasswordBody.newPassword;
        }
        if ((i11 & 4) != 0) {
            str3 = changePasswordBody.passwordConfirmation;
        }
        return changePasswordBody.copy(str, str2, str3);
    }

    public final String component1() {
        return this.password;
    }

    public final String component2() {
        return this.newPassword;
    }

    public final String component3() {
        return this.passwordConfirmation;
    }

    public final ChangePasswordBody copy(String password, String newPassword, String passwordConfirmation) {
        o.i(password, "password");
        o.i(newPassword, "newPassword");
        o.i(passwordConfirmation, "passwordConfirmation");
        return new ChangePasswordBody(password, newPassword, passwordConfirmation);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangePasswordBody)) {
            return false;
        }
        ChangePasswordBody changePasswordBody = (ChangePasswordBody) obj;
        if (o.d(this.password, changePasswordBody.password) && o.d(this.newPassword, changePasswordBody.newPassword) && o.d(this.passwordConfirmation, changePasswordBody.passwordConfirmation)) {
            return true;
        }
        return false;
    }

    public final String getNewPassword() {
        return this.newPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPasswordConfirmation() {
        return this.passwordConfirmation;
    }

    public int hashCode() {
        return (((this.password.hashCode() * 31) + this.newPassword.hashCode()) * 31) + this.passwordConfirmation.hashCode();
    }

    public String toString() {
        String str = this.password;
        String str2 = this.newPassword;
        String str3 = this.passwordConfirmation;
        return "ChangePasswordBody(password=" + str + ", newPassword=" + str2 + ", passwordConfirmation=" + str3 + ")";
    }
}

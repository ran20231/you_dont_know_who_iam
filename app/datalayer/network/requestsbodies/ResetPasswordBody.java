package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ResetPasswordBody.kt */
/* loaded from: classes2.dex */
public final class ResetPasswordBody {
    public static final int $stable = 0;
    @c("otp")
    private final int otp;
    @c("password")
    private final String password;
    @c("password_confirmation")
    private final String passwordConfirmation;
    @c("phone")
    private final String phone;

    public ResetPasswordBody(String phone, String password, String passwordConfirmation, int i11) {
        o.i(phone, "phone");
        o.i(password, "password");
        o.i(passwordConfirmation, "passwordConfirmation");
        this.phone = phone;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
        this.otp = i11;
    }

    public static /* synthetic */ ResetPasswordBody copy$default(ResetPasswordBody resetPasswordBody, String str, String str2, String str3, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = resetPasswordBody.phone;
        }
        if ((i12 & 2) != 0) {
            str2 = resetPasswordBody.password;
        }
        if ((i12 & 4) != 0) {
            str3 = resetPasswordBody.passwordConfirmation;
        }
        if ((i12 & 8) != 0) {
            i11 = resetPasswordBody.otp;
        }
        return resetPasswordBody.copy(str, str2, str3, i11);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.password;
    }

    public final String component3() {
        return this.passwordConfirmation;
    }

    public final int component4() {
        return this.otp;
    }

    public final ResetPasswordBody copy(String phone, String password, String passwordConfirmation, int i11) {
        o.i(phone, "phone");
        o.i(password, "password");
        o.i(passwordConfirmation, "passwordConfirmation");
        return new ResetPasswordBody(phone, password, passwordConfirmation, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResetPasswordBody)) {
            return false;
        }
        ResetPasswordBody resetPasswordBody = (ResetPasswordBody) obj;
        if (o.d(this.phone, resetPasswordBody.phone) && o.d(this.password, resetPasswordBody.password) && o.d(this.passwordConfirmation, resetPasswordBody.passwordConfirmation) && this.otp == resetPasswordBody.otp) {
            return true;
        }
        return false;
    }

    public final int getOtp() {
        return this.otp;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPasswordConfirmation() {
        return this.passwordConfirmation;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (((((this.phone.hashCode() * 31) + this.password.hashCode()) * 31) + this.passwordConfirmation.hashCode()) * 31) + Integer.hashCode(this.otp);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.password;
        String str3 = this.passwordConfirmation;
        int i11 = this.otp;
        return "ResetPasswordBody(phone=" + str + ", password=" + str2 + ", passwordConfirmation=" + str3 + ", otp=" + i11 + ")";
    }
}

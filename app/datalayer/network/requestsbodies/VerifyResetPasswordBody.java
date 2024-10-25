package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: VerifyResetPasswordBody.kt */
/* loaded from: classes2.dex */
public final class VerifyResetPasswordBody {
    public static final int $stable = 0;
    @c("otp")
    private final int otp;
    @c("phone")
    private final String phone;

    public VerifyResetPasswordBody(String phone, int i11) {
        o.i(phone, "phone");
        this.phone = phone;
        this.otp = i11;
    }

    public static /* synthetic */ VerifyResetPasswordBody copy$default(VerifyResetPasswordBody verifyResetPasswordBody, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verifyResetPasswordBody.phone;
        }
        if ((i12 & 2) != 0) {
            i11 = verifyResetPasswordBody.otp;
        }
        return verifyResetPasswordBody.copy(str, i11);
    }

    public final String component1() {
        return this.phone;
    }

    public final int component2() {
        return this.otp;
    }

    public final VerifyResetPasswordBody copy(String phone, int i11) {
        o.i(phone, "phone");
        return new VerifyResetPasswordBody(phone, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyResetPasswordBody)) {
            return false;
        }
        VerifyResetPasswordBody verifyResetPasswordBody = (VerifyResetPasswordBody) obj;
        if (o.d(this.phone, verifyResetPasswordBody.phone) && this.otp == verifyResetPasswordBody.otp) {
            return true;
        }
        return false;
    }

    public final int getOtp() {
        return this.otp;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (this.phone.hashCode() * 31) + Integer.hashCode(this.otp);
    }

    public String toString() {
        String str = this.phone;
        int i11 = this.otp;
        return "VerifyResetPasswordBody(phone=" + str + ", otp=" + i11 + ")";
    }
}

package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RegisterBody.kt */
/* loaded from: classes2.dex */
public final class RegisterBody {
    public static final int $stable = 0;
    @c("email")
    private final String email;
    @c("name")
    private final String name;
    @c("otp")
    private final int otp;
    @c("password")
    private final String password;
    @c("phone")
    private final String phone;

    public RegisterBody(String phone, String email, String name, String password, int i11) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(name, "name");
        o.i(password, "password");
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.password = password;
        this.otp = i11;
    }

    public static /* synthetic */ RegisterBody copy$default(RegisterBody registerBody, String str, String str2, String str3, String str4, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = registerBody.phone;
        }
        if ((i12 & 2) != 0) {
            str2 = registerBody.email;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = registerBody.name;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            str4 = registerBody.password;
        }
        String str7 = str4;
        if ((i12 & 16) != 0) {
            i11 = registerBody.otp;
        }
        return registerBody.copy(str, str5, str6, str7, i11);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.password;
    }

    public final int component5() {
        return this.otp;
    }

    public final RegisterBody copy(String phone, String email, String name, String password, int i11) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(name, "name");
        o.i(password, "password");
        return new RegisterBody(phone, email, name, password, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterBody)) {
            return false;
        }
        RegisterBody registerBody = (RegisterBody) obj;
        if (o.d(this.phone, registerBody.phone) && o.d(this.email, registerBody.email) && o.d(this.name, registerBody.name) && o.d(this.password, registerBody.password) && this.otp == registerBody.otp) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOtp() {
        return this.otp;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        return (((((((this.phone.hashCode() * 31) + this.email.hashCode()) * 31) + this.name.hashCode()) * 31) + this.password.hashCode()) * 31) + Integer.hashCode(this.otp);
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.email;
        String str3 = this.name;
        String str4 = this.password;
        int i11 = this.otp;
        return "RegisterBody(phone=" + str + ", email=" + str2 + ", name=" + str3 + ", password=" + str4 + ", otp=" + i11 + ")";
    }
}

package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: VerifyRegisterBody.kt */
/* loaded from: classes2.dex */
public final class VerifyRegisterBody {
    public static final int $stable = 0;
    @c("email")
    private final String email;
    @c("method")
    private final String method;
    @c("name")
    private final String name;
    @c("password")
    private final String password;
    @c("phone")
    private final String phone;

    public VerifyRegisterBody(String phone, String email, String name, String password, String str) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(name, "name");
        o.i(password, "password");
        this.phone = phone;
        this.email = email;
        this.name = name;
        this.password = password;
        this.method = str;
    }

    public static /* synthetic */ VerifyRegisterBody copy$default(VerifyRegisterBody verifyRegisterBody, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verifyRegisterBody.phone;
        }
        if ((i11 & 2) != 0) {
            str2 = verifyRegisterBody.email;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            str3 = verifyRegisterBody.name;
        }
        String str7 = str3;
        if ((i11 & 8) != 0) {
            str4 = verifyRegisterBody.password;
        }
        String str8 = str4;
        if ((i11 & 16) != 0) {
            str5 = verifyRegisterBody.method;
        }
        return verifyRegisterBody.copy(str, str6, str7, str8, str5);
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

    public final String component5() {
        return this.method;
    }

    public final VerifyRegisterBody copy(String phone, String email, String name, String password, String str) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(name, "name");
        o.i(password, "password");
        return new VerifyRegisterBody(phone, email, name, password, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyRegisterBody)) {
            return false;
        }
        VerifyRegisterBody verifyRegisterBody = (VerifyRegisterBody) obj;
        if (o.d(this.phone, verifyRegisterBody.phone) && o.d(this.email, verifyRegisterBody.email) && o.d(this.name, verifyRegisterBody.name) && o.d(this.password, verifyRegisterBody.password) && o.d(this.method, verifyRegisterBody.method)) {
            return true;
        }
        return false;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.phone.hashCode() * 31) + this.email.hashCode()) * 31) + this.name.hashCode()) * 31) + this.password.hashCode()) * 31;
        String str = this.method;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.email;
        String str3 = this.name;
        String str4 = this.password;
        String str5 = this.method;
        return "VerifyRegisterBody(phone=" + str + ", email=" + str2 + ", name=" + str3 + ", password=" + str4 + ", method=" + str5 + ")";
    }

    public /* synthetic */ VerifyRegisterBody(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i11 & 16) != 0 ? null : str5);
    }
}

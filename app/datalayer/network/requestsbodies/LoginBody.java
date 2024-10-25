package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LoginBody.kt */
/* loaded from: classes2.dex */
public final class LoginBody {
    public static final int $stable = 0;
    @c("password")
    private final String password;
    @c("phone")
    private final String phone;
    @c("region_id")
    private final Integer regionId;

    public LoginBody(String phone, Integer num, String password) {
        o.i(phone, "phone");
        o.i(password, "password");
        this.phone = phone;
        this.regionId = num;
        this.password = password;
    }

    public static /* synthetic */ LoginBody copy$default(LoginBody loginBody, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = loginBody.phone;
        }
        if ((i11 & 2) != 0) {
            num = loginBody.regionId;
        }
        if ((i11 & 4) != 0) {
            str2 = loginBody.password;
        }
        return loginBody.copy(str, num, str2);
    }

    public final String component1() {
        return this.phone;
    }

    public final Integer component2() {
        return this.regionId;
    }

    public final String component3() {
        return this.password;
    }

    public final LoginBody copy(String phone, Integer num, String password) {
        o.i(phone, "phone");
        o.i(password, "password");
        return new LoginBody(phone, num, password);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginBody)) {
            return false;
        }
        LoginBody loginBody = (LoginBody) obj;
        if (o.d(this.phone, loginBody.phone) && o.d(this.regionId, loginBody.regionId) && o.d(this.password, loginBody.password)) {
            return true;
        }
        return false;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final Integer getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.phone.hashCode() * 31;
        Integer num = this.regionId;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.password.hashCode();
    }

    public String toString() {
        String str = this.phone;
        Integer num = this.regionId;
        String str2 = this.password;
        return "LoginBody(phone=" + str + ", regionId=" + num + ", password=" + str2 + ")";
    }

    public /* synthetic */ LoginBody(String str, Integer num, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : num, str2);
    }
}

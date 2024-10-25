package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SetPasswordBody.kt */
/* loaded from: classes2.dex */
public final class SetPasswordBody {
    public static final int $stable = 0;
    @c("old_password")
    private final String oldPassword;
    @c("password")
    private final String password;
    @c("phone")
    private final String phone;
    @c("region_id")
    private final int regionId;
    @c("type")
    private final PasswordType type;

    public SetPasswordBody(String phone, int i11, String password, String str, PasswordType passwordType) {
        o.i(phone, "phone");
        o.i(password, "password");
        this.phone = phone;
        this.regionId = i11;
        this.password = password;
        this.oldPassword = str;
        this.type = passwordType;
    }

    public static /* synthetic */ SetPasswordBody copy$default(SetPasswordBody setPasswordBody, String str, int i11, String str2, String str3, PasswordType passwordType, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = setPasswordBody.phone;
        }
        if ((i12 & 2) != 0) {
            i11 = setPasswordBody.regionId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str2 = setPasswordBody.password;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            str3 = setPasswordBody.oldPassword;
        }
        String str5 = str3;
        if ((i12 & 16) != 0) {
            passwordType = setPasswordBody.type;
        }
        return setPasswordBody.copy(str, i13, str4, str5, passwordType);
    }

    public final String component1() {
        return this.phone;
    }

    public final int component2() {
        return this.regionId;
    }

    public final String component3() {
        return this.password;
    }

    public final String component4() {
        return this.oldPassword;
    }

    public final PasswordType component5() {
        return this.type;
    }

    public final SetPasswordBody copy(String phone, int i11, String password, String str, PasswordType passwordType) {
        o.i(phone, "phone");
        o.i(password, "password");
        return new SetPasswordBody(phone, i11, password, str, passwordType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetPasswordBody)) {
            return false;
        }
        SetPasswordBody setPasswordBody = (SetPasswordBody) obj;
        if (o.d(this.phone, setPasswordBody.phone) && this.regionId == setPasswordBody.regionId && o.d(this.password, setPasswordBody.password) && o.d(this.oldPassword, setPasswordBody.oldPassword) && this.type == setPasswordBody.type) {
            return true;
        }
        return false;
    }

    public final String getOldPassword() {
        return this.oldPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final PasswordType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.phone.hashCode() * 31) + Integer.hashCode(this.regionId)) * 31) + this.password.hashCode()) * 31;
        String str = this.oldPassword;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        PasswordType passwordType = this.type;
        if (passwordType != null) {
            i11 = passwordType.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.phone;
        int i11 = this.regionId;
        String str2 = this.password;
        String str3 = this.oldPassword;
        PasswordType passwordType = this.type;
        return "SetPasswordBody(phone=" + str + ", regionId=" + i11 + ", password=" + str2 + ", oldPassword=" + str3 + ", type=" + passwordType + ")";
    }
}

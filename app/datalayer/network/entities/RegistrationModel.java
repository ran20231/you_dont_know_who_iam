package com.forsale.app.datalayer.network.entities;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: RegistrationModel.kt */
/* loaded from: classes2.dex */
public final class RegistrationModel {
    public static final int $stable = 0;
    private final String deviceId;
    private final String email;
    private final String phone;
    private final String regionCode;
    private final int regionId;

    public RegistrationModel() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ RegistrationModel copy$default(RegistrationModel registrationModel, String str, String str2, String str3, int i11, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = registrationModel.phone;
        }
        if ((i12 & 2) != 0) {
            str2 = registrationModel.email;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = registrationModel.deviceId;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            i11 = registrationModel.regionId;
        }
        int i13 = i11;
        if ((i12 & 16) != 0) {
            str4 = registrationModel.regionCode;
        }
        return registrationModel.copy(str, str5, str6, i13, str4);
    }

    public final String component1() {
        return this.phone;
    }

    public final String component2() {
        return this.email;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final int component4() {
        return this.regionId;
    }

    public final String component5() {
        return this.regionCode;
    }

    public final RegistrationModel copy(String phone, String email, String deviceId, int i11, String regionCode) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(deviceId, "deviceId");
        o.i(regionCode, "regionCode");
        return new RegistrationModel(phone, email, deviceId, i11, regionCode);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegistrationModel)) {
            return false;
        }
        RegistrationModel registrationModel = (RegistrationModel) obj;
        if (o.d(this.phone, registrationModel.phone) && o.d(this.email, registrationModel.email) && o.d(this.deviceId, registrationModel.deviceId) && this.regionId == registrationModel.regionId && o.d(this.regionCode, registrationModel.regionCode)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((((((this.phone.hashCode() * 31) + this.email.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + this.regionCode.hashCode();
    }

    public String toString() {
        String str = this.phone;
        String str2 = this.email;
        String str3 = this.deviceId;
        int i11 = this.regionId;
        String str4 = this.regionCode;
        return "RegistrationModel(phone=" + str + ", email=" + str2 + ", deviceId=" + str3 + ", regionId=" + i11 + ", regionCode=" + str4 + ")";
    }

    public RegistrationModel(String phone, String email, String deviceId, int i11, String regionCode) {
        o.i(phone, "phone");
        o.i(email, "email");
        o.i(deviceId, "deviceId");
        o.i(regionCode, "regionCode");
        this.phone = phone;
        this.email = email;
        this.deviceId = deviceId;
        this.regionId = i11;
        this.regionCode = regionCode;
    }

    public /* synthetic */ RegistrationModel(String str, String str2, String str3, int i11, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) != 0 ? 1 : i11, (i12 & 16) != 0 ? "" : str4);
    }
}

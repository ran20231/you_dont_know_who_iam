package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SessionBody.kt */
/* loaded from: classes2.dex */
public final class SessionBody {
    public static final int $stable = 0;
    @c("app_version")
    private final String appVersion;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("device_info")
    private final String deviceInfo;
    @c("device_type")
    private final String deviceType;
    @c("is_push_disabled")
    private final int isPushDisabled;
    @c("is_rooted")
    private final int isRooted;
    @c("os")

    /* renamed from: os  reason: collision with root package name */
    private final String f22343os;
    @c("os_version")
    private final String osVersion;
    @c("push_token")
    private final String pushToken;

    public SessionBody(String appVersion, String deviceId, String deviceInfo, String deviceType, int i11, int i12, String os2, String osVersion, String pushToken) {
        o.i(appVersion, "appVersion");
        o.i(deviceId, "deviceId");
        o.i(deviceInfo, "deviceInfo");
        o.i(deviceType, "deviceType");
        o.i(os2, "os");
        o.i(osVersion, "osVersion");
        o.i(pushToken, "pushToken");
        this.appVersion = appVersion;
        this.deviceId = deviceId;
        this.deviceInfo = deviceInfo;
        this.deviceType = deviceType;
        this.isPushDisabled = i11;
        this.isRooted = i12;
        this.f22343os = os2;
        this.osVersion = osVersion;
        this.pushToken = pushToken;
    }

    public static /* synthetic */ SessionBody copy$default(SessionBody sessionBody, String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, Object obj) {
        String str8;
        String str9;
        String str10;
        String str11;
        int i14;
        int i15;
        String str12;
        String str13;
        String str14;
        if ((i13 & 1) != 0) {
            str8 = sessionBody.appVersion;
        } else {
            str8 = str;
        }
        if ((i13 & 2) != 0) {
            str9 = sessionBody.deviceId;
        } else {
            str9 = str2;
        }
        if ((i13 & 4) != 0) {
            str10 = sessionBody.deviceInfo;
        } else {
            str10 = str3;
        }
        if ((i13 & 8) != 0) {
            str11 = sessionBody.deviceType;
        } else {
            str11 = str4;
        }
        if ((i13 & 16) != 0) {
            i14 = sessionBody.isPushDisabled;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            i15 = sessionBody.isRooted;
        } else {
            i15 = i12;
        }
        if ((i13 & 64) != 0) {
            str12 = sessionBody.f22343os;
        } else {
            str12 = str5;
        }
        if ((i13 & 128) != 0) {
            str13 = sessionBody.osVersion;
        } else {
            str13 = str6;
        }
        if ((i13 & 256) != 0) {
            str14 = sessionBody.pushToken;
        } else {
            str14 = str7;
        }
        return sessionBody.copy(str8, str9, str10, str11, i14, i15, str12, str13, str14);
    }

    public final String component1() {
        return this.appVersion;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final String component3() {
        return this.deviceInfo;
    }

    public final String component4() {
        return this.deviceType;
    }

    public final int component5() {
        return this.isPushDisabled;
    }

    public final int component6() {
        return this.isRooted;
    }

    public final String component7() {
        return this.f22343os;
    }

    public final String component8() {
        return this.osVersion;
    }

    public final String component9() {
        return this.pushToken;
    }

    public final SessionBody copy(String appVersion, String deviceId, String deviceInfo, String deviceType, int i11, int i12, String os2, String osVersion, String pushToken) {
        o.i(appVersion, "appVersion");
        o.i(deviceId, "deviceId");
        o.i(deviceInfo, "deviceInfo");
        o.i(deviceType, "deviceType");
        o.i(os2, "os");
        o.i(osVersion, "osVersion");
        o.i(pushToken, "pushToken");
        return new SessionBody(appVersion, deviceId, deviceInfo, deviceType, i11, i12, os2, osVersion, pushToken);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionBody)) {
            return false;
        }
        SessionBody sessionBody = (SessionBody) obj;
        if (o.d(this.appVersion, sessionBody.appVersion) && o.d(this.deviceId, sessionBody.deviceId) && o.d(this.deviceInfo, sessionBody.deviceInfo) && o.d(this.deviceType, sessionBody.deviceType) && this.isPushDisabled == sessionBody.isPushDisabled && this.isRooted == sessionBody.isRooted && o.d(this.f22343os, sessionBody.f22343os) && o.d(this.osVersion, sessionBody.osVersion) && o.d(this.pushToken, sessionBody.pushToken)) {
            return true;
        }
        return false;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getOs() {
        return this.f22343os;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getPushToken() {
        return this.pushToken;
    }

    public int hashCode() {
        return (((((((((((((((this.appVersion.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + Integer.hashCode(this.isPushDisabled)) * 31) + Integer.hashCode(this.isRooted)) * 31) + this.f22343os.hashCode()) * 31) + this.osVersion.hashCode()) * 31) + this.pushToken.hashCode();
    }

    public final int isPushDisabled() {
        return this.isPushDisabled;
    }

    public final int isRooted() {
        return this.isRooted;
    }

    public String toString() {
        String str = this.appVersion;
        String str2 = this.deviceId;
        String str3 = this.deviceInfo;
        String str4 = this.deviceType;
        int i11 = this.isPushDisabled;
        int i12 = this.isRooted;
        String str5 = this.f22343os;
        String str6 = this.osVersion;
        String str7 = this.pushToken;
        return "SessionBody(appVersion=" + str + ", deviceId=" + str2 + ", deviceInfo=" + str3 + ", deviceType=" + str4 + ", isPushDisabled=" + i11 + ", isRooted=" + i12 + ", os=" + str5 + ", osVersion=" + str6 + ", pushToken=" + str7 + ")";
    }

    public /* synthetic */ SessionBody(String str, String str2, String str3, String str4, int i11, int i12, String str5, String str6, String str7, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i11, i12, str5, str6, (i13 & 256) != 0 ? "" : str7);
    }
}

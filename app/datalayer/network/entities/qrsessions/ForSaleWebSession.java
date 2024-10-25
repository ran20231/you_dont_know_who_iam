package com.forsale.app.datalayer.network.entities.qrsessions;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: QRRequestModels.kt */
/* loaded from: classes2.dex */
public final class ForSaleWebSession implements Parcelable {
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final int f22337id;

    /* renamed from: ip  reason: collision with root package name */
    private final String f22338ip;

    /* renamed from: os  reason: collision with root package name */
    private final String f22339os;
    @c("sess_start_time")
    private final String sessionStartTime;
    private final String token;
    private final BrowserType type;
    public static final Parcelable.Creator<ForSaleWebSession> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: QRRequestModels.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<ForSaleWebSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForSaleWebSession createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ForSaleWebSession(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), BrowserType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ForSaleWebSession[] newArray(int i11) {
            return new ForSaleWebSession[i11];
        }
    }

    public ForSaleWebSession(int i11, String str, String deviceId, String str2, String str3, BrowserType type, String str4) {
        o.i(deviceId, "deviceId");
        o.i(type, "type");
        this.f22337id = i11;
        this.token = str;
        this.deviceId = deviceId;
        this.sessionStartTime = str2;
        this.f22338ip = str3;
        this.type = type;
        this.f22339os = str4;
    }

    public static /* synthetic */ ForSaleWebSession copy$default(ForSaleWebSession forSaleWebSession, int i11, String str, String str2, String str3, String str4, BrowserType browserType, String str5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = forSaleWebSession.f22337id;
        }
        if ((i12 & 2) != 0) {
            str = forSaleWebSession.token;
        }
        String str6 = str;
        if ((i12 & 4) != 0) {
            str2 = forSaleWebSession.deviceId;
        }
        String str7 = str2;
        if ((i12 & 8) != 0) {
            str3 = forSaleWebSession.sessionStartTime;
        }
        String str8 = str3;
        if ((i12 & 16) != 0) {
            str4 = forSaleWebSession.f22338ip;
        }
        String str9 = str4;
        if ((i12 & 32) != 0) {
            browserType = forSaleWebSession.type;
        }
        BrowserType browserType2 = browserType;
        if ((i12 & 64) != 0) {
            str5 = forSaleWebSession.f22339os;
        }
        return forSaleWebSession.copy(i11, str6, str7, str8, str9, browserType2, str5);
    }

    public final int component1() {
        return this.f22337id;
    }

    public final String component2() {
        return this.token;
    }

    public final String component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.sessionStartTime;
    }

    public final String component5() {
        return this.f22338ip;
    }

    public final BrowserType component6() {
        return this.type;
    }

    public final String component7() {
        return this.f22339os;
    }

    public final ForSaleWebSession copy(int i11, String str, String deviceId, String str2, String str3, BrowserType type, String str4) {
        o.i(deviceId, "deviceId");
        o.i(type, "type");
        return new ForSaleWebSession(i11, str, deviceId, str2, str3, type, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForSaleWebSession)) {
            return false;
        }
        ForSaleWebSession forSaleWebSession = (ForSaleWebSession) obj;
        if (this.f22337id == forSaleWebSession.f22337id && o.d(this.token, forSaleWebSession.token) && o.d(this.deviceId, forSaleWebSession.deviceId) && o.d(this.sessionStartTime, forSaleWebSession.sessionStartTime) && o.d(this.f22338ip, forSaleWebSession.f22338ip) && this.type == forSaleWebSession.type && o.d(this.f22339os, forSaleWebSession.f22339os)) {
            return true;
        }
        return false;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getId() {
        return this.f22337id;
    }

    public final String getIp() {
        return this.f22338ip;
    }

    public final String getOs() {
        return this.f22339os;
    }

    public final String getSessionStartTime() {
        return this.sessionStartTime;
    }

    public final String getToken() {
        return this.token;
    }

    public final BrowserType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Integer.hashCode(this.f22337id) * 31;
        String str = this.token;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.deviceId.hashCode()) * 31;
        String str2 = this.sessionStartTime;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i12 = (hashCode5 + hashCode2) * 31;
        String str3 = this.f22338ip;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode6 = (((i12 + hashCode3) * 31) + this.type.hashCode()) * 31;
        String str4 = this.f22339os;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return hashCode6 + i11;
    }

    public String toString() {
        int i11 = this.f22337id;
        String str = this.token;
        String str2 = this.deviceId;
        String str3 = this.sessionStartTime;
        String str4 = this.f22338ip;
        BrowserType browserType = this.type;
        String str5 = this.f22339os;
        return "ForSaleWebSession(id=" + i11 + ", token=" + str + ", deviceId=" + str2 + ", sessionStartTime=" + str3 + ", ip=" + str4 + ", type=" + browserType + ", os=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f22337id);
        out.writeString(this.token);
        out.writeString(this.deviceId);
        out.writeString(this.sessionStartTime);
        out.writeString(this.f22338ip);
        out.writeString(this.type.name());
        out.writeString(this.f22339os);
    }
}

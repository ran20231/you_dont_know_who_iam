package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.NotificationTypes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ForeSaleFCMMessage.kt */
/* loaded from: classes2.dex */
public final class ForeSaleFCMMessage implements Parcelable {
    public static final String ALERT = "alert";
    public static final String ID = "id";
    public static final String MID = "mid";
    public static final String TYPE = "type";
    public static final String UNIVERSAL_LINK = "universal_link";
    public static final String URL = "url";
    @c(ALERT)
    private final String alert;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final String f22330id;
    private Boolean isInAppMessage;
    @c(MID)
    private final String messageId;
    private final String title;
    @c("type")
    private final NotificationTypes type;
    @c("universal_link")
    private final String universalLink;
    private final String url;
    public static final CREATOR CREATOR = new CREATOR(null);
    public static final int $stable = 8;

    /* compiled from: ForeSaleFCMMessage.kt */
    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<ForeSaleFCMMessage> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForeSaleFCMMessage createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new ForeSaleFCMMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ForeSaleFCMMessage[] newArray(int i11) {
            return new ForeSaleFCMMessage[i11];
        }
    }

    public ForeSaleFCMMessage(String str, String str2, String str3, NotificationTypes notificationTypes, String str4, String str5, String str6) {
        this.title = str;
        this.alert = str2;
        this.f22330id = str3;
        this.type = notificationTypes;
        this.messageId = str4;
        this.url = str5;
        this.universalLink = str6;
        this.isInAppMessage = Boolean.FALSE;
    }

    public static /* synthetic */ ForeSaleFCMMessage copy$default(ForeSaleFCMMessage foreSaleFCMMessage, String str, String str2, String str3, NotificationTypes notificationTypes, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = foreSaleFCMMessage.title;
        }
        if ((i11 & 2) != 0) {
            str2 = foreSaleFCMMessage.alert;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = foreSaleFCMMessage.f22330id;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            notificationTypes = foreSaleFCMMessage.type;
        }
        NotificationTypes notificationTypes2 = notificationTypes;
        if ((i11 & 16) != 0) {
            str4 = foreSaleFCMMessage.messageId;
        }
        String str9 = str4;
        if ((i11 & 32) != 0) {
            str5 = foreSaleFCMMessage.url;
        }
        String str10 = str5;
        if ((i11 & 64) != 0) {
            str6 = foreSaleFCMMessage.universalLink;
        }
        return foreSaleFCMMessage.copy(str, str7, str8, notificationTypes2, str9, str10, str6);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.alert;
    }

    public final String component3() {
        return this.f22330id;
    }

    public final NotificationTypes component4() {
        return this.type;
    }

    public final String component5() {
        return this.messageId;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.universalLink;
    }

    public final ForeSaleFCMMessage copy(String str, String str2, String str3, NotificationTypes notificationTypes, String str4, String str5, String str6) {
        return new ForeSaleFCMMessage(str, str2, str3, notificationTypes, str4, str5, str6);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ForeSaleFCMMessage)) {
            return false;
        }
        ForeSaleFCMMessage foreSaleFCMMessage = (ForeSaleFCMMessage) obj;
        if (o.d(this.title, foreSaleFCMMessage.title) && o.d(this.alert, foreSaleFCMMessage.alert) && o.d(this.f22330id, foreSaleFCMMessage.f22330id) && this.type == foreSaleFCMMessage.type && o.d(this.messageId, foreSaleFCMMessage.messageId) && o.d(this.url, foreSaleFCMMessage.url) && o.d(this.universalLink, foreSaleFCMMessage.universalLink)) {
            return true;
        }
        return false;
    }

    public final String getAlert() {
        return this.alert;
    }

    public final String getId() {
        return this.f22330id;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final NotificationTypes getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.title;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.alert;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.f22330id;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        NotificationTypes notificationTypes = this.type;
        if (notificationTypes == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = notificationTypes.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.messageId;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        String str5 = this.url;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str6 = this.universalLink;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return i17 + i11;
    }

    public final Boolean isInAppMessage() {
        return this.isInAppMessage;
    }

    public final void setInAppMessage(Boolean bool) {
        this.isInAppMessage = bool;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.alert;
        String str3 = this.f22330id;
        NotificationTypes notificationTypes = this.type;
        String str4 = this.messageId;
        String str5 = this.url;
        String str6 = this.universalLink;
        return "ForeSaleFCMMessage(title=" + str + ", alert=" + str2 + ", id=" + str3 + ", type=" + notificationTypes + ", messageId=" + str4 + ", url=" + str5 + ", universalLink=" + str6 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        o.i(parcel, "parcel");
        parcel.writeString(this.title);
        parcel.writeString(this.alert);
        parcel.writeString(this.f22330id);
        parcel.writeSerializable(this.type);
        parcel.writeString(this.messageId);
        parcel.writeString(this.url);
        parcel.writeString(this.universalLink);
    }

    public /* synthetic */ ForeSaleFCMMessage(String str, String str2, String str3, NotificationTypes notificationTypes, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, str3, notificationTypes, str4, str5, str6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ForeSaleFCMMessage(android.os.Parcel r10) {
        /*
            r9 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.i(r10, r0)
            java.lang.String r2 = r10.readString()
            java.lang.String r3 = r10.readString()
            java.lang.String r4 = r10.readString()
            java.io.Serializable r0 = r10.readSerializable()
            boolean r1 = r0 instanceof com.forsale.app.utils.NotificationTypes
            if (r1 == 0) goto L1c
            com.forsale.app.utils.NotificationTypes r0 = (com.forsale.app.utils.NotificationTypes) r0
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r5 = r0
            java.lang.String r6 = r10.readString()
            java.lang.String r7 = r10.readString()
            java.lang.String r8 = r10.readString()
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.ForeSaleFCMMessage.<init>(android.os.Parcel):void");
    }
}

package com.forsale.app.datalayer.network.entities;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.requestsbodies.Gender;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.Scopes;
import com.google.gson.d;
import falcon.chat.entities.MessageKt;
import falcon.chat.entities.UserEntityKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import tv.teads.sdk.TeadsMediationSettings;
import up.c;
/* compiled from: SessionEntity.kt */
/* loaded from: classes2.dex */
public final class SessionEntity {
    public static final String SESSION_TABLE = "session_table";
    @c("app_status")
    private final AppStatus appStatus;
    @c("greeting")
    private final Greeting greeting;

    /* renamed from: id  reason: collision with root package name */
    private final int f22335id;
    @c("landing_page")
    private final LandingPage landingPage;
    @c("office")
    private final Office office;
    @c(Scopes.PROFILE)
    private final Profile profile;
    @c("ranked_vertical_id")
    private final Integer rankedVerticalId;
    @c(MessageKt.STATUS)
    private final SessionStatus sessionStatus;
    @c("verification")
    private final Verification verification;
    @c(TeadsMediationSettings.MEDIATION_VERSION_KEY)
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class AppStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ AppStatus[] $VALUES;
        @c("in_maintenance")
        public static final AppStatus IN_MAINTENANCE = new AppStatus("IN_MAINTENANCE", 0);
        @c("force_update")
        public static final AppStatus FORCE_UPDATE = new AppStatus("FORCE_UPDATE", 1);
        @c("optional_update")
        public static final AppStatus OPTIONAL_UPDATE = new AppStatus("OPTIONAL_UPDATE", 2);

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class AppStatusTypeConverter {
            public static final int $stable = 0;

            public final AppStatus toSessionStatus(String str) {
                boolean z11;
                Object k11;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k11 = null;
                } else {
                    k11 = new d().k(str, AppStatus.class);
                }
                return (AppStatus) k11;
            }

            public final String toString(AppStatus appStatus) {
                return TopLevelUtilityFunctionsKt.f(appStatus);
            }
        }

        private static final /* synthetic */ AppStatus[] $values() {
            return new AppStatus[]{IN_MAINTENANCE, FORCE_UPDATE, OPTIONAL_UPDATE};
        }

        static {
            AppStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AppStatus(String str, int i11) {
        }

        public static a<AppStatus> getEntries() {
            return $ENTRIES;
        }

        public static AppStatus valueOf(String str) {
            return (AppStatus) Enum.valueOf(AppStatus.class, str);
        }

        public static AppStatus[] values() {
            return (AppStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SessionStatus.values().length];
                try {
                    iArr[SessionStatus.PROFILE_BLOCKED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SessionStatus.DEVICE_BLOCKED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final java.lang.String mapFirstAndLastNameToName(com.forsale.app.datalayer.network.entities.SessionEntity.Profile r5) {
            /*
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L76
                java.lang.String r1 = r5.getFirstName()
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L14
                int r1 = r1.length()
                if (r1 != 0) goto L12
                goto L14
            L12:
                r1 = r2
                goto L15
            L14:
                r1 = r3
            L15:
                if (r1 != 0) goto L46
                java.lang.String r1 = r5.getLastName()
                if (r1 == 0) goto L26
                int r1 = r1.length()
                if (r1 != 0) goto L24
                goto L26
            L24:
                r1 = r2
                goto L27
            L26:
                r1 = r3
            L27:
                if (r1 != 0) goto L46
                java.lang.String r1 = r5.getFirstName()
                java.lang.String r5 = r5.getLastName()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r1)
                java.lang.String r1 = " "
                r2.append(r1)
                r2.append(r5)
                java.lang.String r5 = r2.toString()
                goto L72
            L46:
                java.lang.String r1 = r5.getFirstName()
                if (r1 == 0) goto L55
                int r1 = r1.length()
                if (r1 != 0) goto L53
                goto L55
            L53:
                r1 = r2
                goto L56
            L55:
                r1 = r3
            L56:
                if (r1 != 0) goto L5d
                java.lang.String r5 = r5.getFirstName()
                goto L72
            L5d:
                java.lang.String r1 = r5.getLastName()
                if (r1 == 0) goto L69
                int r1 = r1.length()
                if (r1 != 0) goto L6a
            L69:
                r2 = r3
            L6a:
                if (r2 != 0) goto L71
                java.lang.String r5 = r5.getLastName()
                goto L72
            L71:
                r5 = r0
            L72:
                if (r5 != 0) goto L75
                goto L76
            L75:
                r0 = r5
            L76:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.entities.SessionEntity.Companion.mapFirstAndLastNameToName(com.forsale.app.datalayer.network.entities.SessionEntity$Profile):java.lang.String");
        }

        private final int mapSessionStatusToBlocked(SessionStatus sessionStatus) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[sessionStatus.ordinal()];
            if (i11 == 1) {
                return 1;
            }
            if (i11 == 2) {
                return 2;
            }
            return 0;
        }
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Greeting implements Parcelable {
        @c("image_url")
        private final String imageUrl;
        @c("timeout")
        private final int timeout;
        public static final Parcelable.Creator<Greeting> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Greeting> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Greeting createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new Greeting(parcel.readString(), parcel.readInt());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Greeting[] newArray(int i11) {
                return new Greeting[i11];
            }
        }

        public Greeting(String imageUrl, int i11) {
            o.i(imageUrl, "imageUrl");
            this.imageUrl = imageUrl;
            this.timeout = i11;
        }

        public static /* synthetic */ Greeting copy$default(Greeting greeting, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = greeting.imageUrl;
            }
            if ((i12 & 2) != 0) {
                i11 = greeting.timeout;
            }
            return greeting.copy(str, i11);
        }

        public final String component1() {
            return this.imageUrl;
        }

        public final int component2() {
            return this.timeout;
        }

        public final Greeting copy(String imageUrl, int i11) {
            o.i(imageUrl, "imageUrl");
            return new Greeting(imageUrl, i11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Greeting)) {
                return false;
            }
            Greeting greeting = (Greeting) obj;
            if (o.d(this.imageUrl, greeting.imageUrl) && this.timeout == greeting.timeout) {
                return true;
            }
            return false;
        }

        public final String getImageUrl() {
            return this.imageUrl;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        public int hashCode() {
            return (this.imageUrl.hashCode() * 31) + Integer.hashCode(this.timeout);
        }

        public String toString() {
            String str = this.imageUrl;
            int i11 = this.timeout;
            return "Greeting(imageUrl=" + str + ", timeout=" + i11 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.imageUrl);
            out.writeInt(this.timeout);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class LandingPage {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LandingPage[] $VALUES;
        @c("Home")
        public static final LandingPage HOME = new LandingPage("HOME", 0);
        @c("Commercial")
        public static final LandingPage COMMERCIAL = new LandingPage("COMMERCIAL", 1);

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class LandingPageConverter {
            public static final int $stable = 0;

            public final LandingPage toLandingPage(String str) {
                boolean z11;
                Object k11;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k11 = null;
                } else {
                    k11 = new d().k(str, LandingPage.class);
                }
                return (LandingPage) k11;
            }

            public final String toString(LandingPage landingPage) {
                return TopLevelUtilityFunctionsKt.f(landingPage);
            }
        }

        private static final /* synthetic */ LandingPage[] $values() {
            return new LandingPage[]{HOME, COMMERCIAL};
        }

        static {
            LandingPage[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private LandingPage(String str, int i11) {
        }

        public static a<LandingPage> getEntries() {
            return $ENTRIES;
        }

        public static LandingPage valueOf(String str) {
            return (LandingPage) Enum.valueOf(LandingPage.class, str);
        }

        public static LandingPage[] values() {
            return (LandingPage[]) $VALUES.clone();
        }
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Office {
        public static final int $stable = 0;
        @c("contact_numbers")
        private final String contactNumbers;
        @c("name_ar")
        private final String nameAr;
        @c("name_en")
        private final String nameEn;

        public Office(String str, String str2, String str3) {
            this.contactNumbers = str;
            this.nameAr = str2;
            this.nameEn = str3;
        }

        public static /* synthetic */ Office copy$default(Office office, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = office.contactNumbers;
            }
            if ((i11 & 2) != 0) {
                str2 = office.nameAr;
            }
            if ((i11 & 4) != 0) {
                str3 = office.nameEn;
            }
            return office.copy(str, str2, str3);
        }

        public final String component1() {
            return this.contactNumbers;
        }

        public final String component2() {
            return this.nameAr;
        }

        public final String component3() {
            return this.nameEn;
        }

        public final Office copy(String str, String str2, String str3) {
            return new Office(str, str2, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Office)) {
                return false;
            }
            Office office = (Office) obj;
            if (o.d(this.contactNumbers, office.contactNumbers) && o.d(this.nameAr, office.nameAr) && o.d(this.nameEn, office.nameEn)) {
                return true;
            }
            return false;
        }

        public final String getContactNumbers() {
            return this.contactNumbers;
        }

        public final String getNameAr() {
            return this.nameAr;
        }

        public final String getNameEn() {
            return this.nameEn;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            String str = this.contactNumbers;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.nameAr;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.nameEn;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return i13 + i11;
        }

        public String toString() {
            String str = this.contactNumbers;
            String str2 = this.nameAr;
            String str3 = this.nameEn;
            return "Office(contactNumbers=" + str + ", nameAr=" + str2 + ", nameEn=" + str3 + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class SessionStatus {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SessionStatus[] $VALUES;
        @c("not_verified_password_required")
        public static final SessionStatus NOT_VERIFIED_PASSWORD_REQUIRED = new SessionStatus("NOT_VERIFIED_PASSWORD_REQUIRED", 0);
        @c("not_verified_otp_required")
        public static final SessionStatus NOT_VERIFIED_OTP_REQUIRED = new SessionStatus("NOT_VERIFIED_OTP_REQUIRED", 1);
        @c("verified_missing_info_and_password")
        public static final SessionStatus VERIFIED_MISSING_INFO_AND_PASSWORD = new SessionStatus("VERIFIED_MISSING_INFO_AND_PASSWORD", 2);
        @c("verified_missing_password")
        public static final SessionStatus VERIFIED_MISSING_PASSWORD = new SessionStatus("VERIFIED_MISSING_PASSWORD", 3);
        @c("logged_in")
        public static final SessionStatus LOGGED_IN = new SessionStatus("LOGGED_IN", 4);
        @c("not_logged_in")
        public static final SessionStatus NOT_LOGGED_IN = new SessionStatus("NOT_LOGGED_IN", 5);
        @c("profile_blocked")
        public static final SessionStatus PROFILE_BLOCKED = new SessionStatus("PROFILE_BLOCKED", 6);
        @c("device_blocked")
        public static final SessionStatus DEVICE_BLOCKED = new SessionStatus("DEVICE_BLOCKED", 7);
        @c("not_genuine")
        public static final SessionStatus NOT_GENUINE = new SessionStatus("NOT_GENUINE", 8);

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class SessionStatusTypeConverter {
            public static final int $stable = 0;

            public final SessionStatus toSessionStatus(String str) {
                boolean z11;
                Object k11;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k11 = null;
                } else {
                    k11 = new d().k(str, SessionStatus.class);
                }
                return (SessionStatus) k11;
            }

            public final String toString(SessionStatus sessionStatus) {
                return TopLevelUtilityFunctionsKt.f(sessionStatus);
            }
        }

        private static final /* synthetic */ SessionStatus[] $values() {
            return new SessionStatus[]{NOT_VERIFIED_PASSWORD_REQUIRED, NOT_VERIFIED_OTP_REQUIRED, VERIFIED_MISSING_INFO_AND_PASSWORD, VERIFIED_MISSING_PASSWORD, LOGGED_IN, NOT_LOGGED_IN, PROFILE_BLOCKED, DEVICE_BLOCKED, NOT_GENUINE};
        }

        static {
            SessionStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SessionStatus(String str, int i11) {
        }

        public static a<SessionStatus> getEntries() {
            return $ENTRIES;
        }

        public static SessionStatus valueOf(String str) {
            return (SessionStatus) Enum.valueOf(SessionStatus.class, str);
        }

        public static SessionStatus[] values() {
            return (SessionStatus[]) $VALUES.clone();
        }
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Verification {
        public static final int $stable = 0;
        @c(MessageKt.STATUS)
        private final VerificationStatus status;
        @c("user_send_sms_data")
        private final UserSendSmsData userSendSmsData;

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class UserSendSmsData {
            public static final int $stable = 0;
            @c("body")
            private final String body;
            @c("to")

            /* renamed from: to  reason: collision with root package name */
            private final String f22336to;

            public UserSendSmsData(String str, String str2) {
                this.body = str;
                this.f22336to = str2;
            }

            public static /* synthetic */ UserSendSmsData copy$default(UserSendSmsData userSendSmsData, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = userSendSmsData.body;
                }
                if ((i11 & 2) != 0) {
                    str2 = userSendSmsData.f22336to;
                }
                return userSendSmsData.copy(str, str2);
            }

            public final String component1() {
                return this.body;
            }

            public final String component2() {
                return this.f22336to;
            }

            public final UserSendSmsData copy(String str, String str2) {
                return new UserSendSmsData(str, str2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof UserSendSmsData)) {
                    return false;
                }
                UserSendSmsData userSendSmsData = (UserSendSmsData) obj;
                if (o.d(this.body, userSendSmsData.body) && o.d(this.f22336to, userSendSmsData.f22336to)) {
                    return true;
                }
                return false;
            }

            public final String getBody() {
                return this.body;
            }

            public final String getTo() {
                return this.f22336to;
            }

            public int hashCode() {
                int hashCode;
                String str = this.body;
                int i11 = 0;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                int i12 = hashCode * 31;
                String str2 = this.f22336to;
                if (str2 != null) {
                    i11 = str2.hashCode();
                }
                return i12 + i11;
            }

            public String toString() {
                String str = this.body;
                String str2 = this.f22336to;
                return "UserSendSmsData(body=" + str + ", to=" + str2 + ")";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class VerificationStatus {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ VerificationStatus[] $VALUES;
            @c("sms_sent")
            public static final VerificationStatus SMS_SENT = new VerificationStatus("SMS_SENT", 0);
            @c("voice_call_made")
            public static final VerificationStatus VOICE_CALL_MADE = new VerificationStatus("VOICE_CALL_MADE", 1);
            @c("failed")
            public static final VerificationStatus FAILED = new VerificationStatus("FAILED", 2);
            @c("limit_reached")
            public static final VerificationStatus LIMIT_REACHED = new VerificationStatus("LIMIT_REACHED", 3);
            @c("whatsapp_message_sent")
            public static final VerificationStatus WHATSAPP_MESSAGE_SENT = new VerificationStatus("WHATSAPP_MESSAGE_SENT", 4);

            /* compiled from: SessionEntity.kt */
            /* loaded from: classes2.dex */
            public static final class VerificationStatusTypeConverter {
                public static final int $stable = 0;

                public final String toString(VerificationStatus verificationStatus) {
                    return TopLevelUtilityFunctionsKt.f(verificationStatus);
                }

                public final VerificationStatus toVerificationStatus(String str) {
                    boolean z11;
                    Object k11;
                    if (str != null && str.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z11) {
                        k11 = null;
                    } else {
                        k11 = new d().k(str, VerificationStatus.class);
                    }
                    return (VerificationStatus) k11;
                }
            }

            private static final /* synthetic */ VerificationStatus[] $values() {
                return new VerificationStatus[]{SMS_SENT, VOICE_CALL_MADE, FAILED, LIMIT_REACHED, WHATSAPP_MESSAGE_SENT};
            }

            static {
                VerificationStatus[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private VerificationStatus(String str, int i11) {
            }

            public static a<VerificationStatus> getEntries() {
                return $ENTRIES;
            }

            public static VerificationStatus valueOf(String str) {
                return (VerificationStatus) Enum.valueOf(VerificationStatus.class, str);
            }

            public static VerificationStatus[] values() {
                return (VerificationStatus[]) $VALUES.clone();
            }
        }

        public Verification(VerificationStatus verificationStatus, UserSendSmsData userSendSmsData) {
            this.status = verificationStatus;
            this.userSendSmsData = userSendSmsData;
        }

        public static /* synthetic */ Verification copy$default(Verification verification, VerificationStatus verificationStatus, UserSendSmsData userSendSmsData, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                verificationStatus = verification.status;
            }
            if ((i11 & 2) != 0) {
                userSendSmsData = verification.userSendSmsData;
            }
            return verification.copy(verificationStatus, userSendSmsData);
        }

        public final VerificationStatus component1() {
            return this.status;
        }

        public final UserSendSmsData component2() {
            return this.userSendSmsData;
        }

        public final Verification copy(VerificationStatus verificationStatus, UserSendSmsData userSendSmsData) {
            return new Verification(verificationStatus, userSendSmsData);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Verification)) {
                return false;
            }
            Verification verification = (Verification) obj;
            if (this.status == verification.status && o.d(this.userSendSmsData, verification.userSendSmsData)) {
                return true;
            }
            return false;
        }

        public final VerificationStatus getStatus() {
            return this.status;
        }

        public final UserSendSmsData getUserSendSmsData() {
            return this.userSendSmsData;
        }

        public int hashCode() {
            int hashCode;
            VerificationStatus verificationStatus = this.status;
            int i11 = 0;
            if (verificationStatus == null) {
                hashCode = 0;
            } else {
                hashCode = verificationStatus.hashCode();
            }
            int i12 = hashCode * 31;
            UserSendSmsData userSendSmsData = this.userSendSmsData;
            if (userSendSmsData != null) {
                i11 = userSendSmsData.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            VerificationStatus verificationStatus = this.status;
            UserSendSmsData userSendSmsData = this.userSendSmsData;
            return "Verification(status=" + verificationStatus + ", userSendSmsData=" + userSendSmsData + ")";
        }
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SessionStatus.values().length];
            try {
                iArr[SessionStatus.VERIFIED_MISSING_INFO_AND_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SessionStatus.VERIFIED_MISSING_PASSWORD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SessionStatus.LOGGED_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SessionStatus.PROFILE_BLOCKED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SessionStatus.DEVICE_BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SessionStatus.NOT_GENUINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SessionEntity(int i11, AppStatus appStatus, Greeting greeting, Office office, Profile profile, SessionStatus sessionStatus, Verification verification, String str, Integer num, LandingPage landingPage) {
        o.i(sessionStatus, "sessionStatus");
        this.f22335id = i11;
        this.appStatus = appStatus;
        this.greeting = greeting;
        this.office = office;
        this.profile = profile;
        this.sessionStatus = sessionStatus;
        this.verification = verification;
        this.version = str;
        this.rankedVerticalId = num;
        this.landingPage = landingPage;
    }

    public static /* synthetic */ SessionEntity copy$default(SessionEntity sessionEntity, int i11, AppStatus appStatus, Greeting greeting, Office office, Profile profile, SessionStatus sessionStatus, Verification verification, String str, Integer num, LandingPage landingPage, int i12, Object obj) {
        int i13;
        AppStatus appStatus2;
        Greeting greeting2;
        Office office2;
        Profile profile2;
        SessionStatus sessionStatus2;
        Verification verification2;
        String str2;
        Integer num2;
        LandingPage landingPage2;
        if ((i12 & 1) != 0) {
            i13 = sessionEntity.f22335id;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            appStatus2 = sessionEntity.appStatus;
        } else {
            appStatus2 = appStatus;
        }
        if ((i12 & 4) != 0) {
            greeting2 = sessionEntity.greeting;
        } else {
            greeting2 = greeting;
        }
        if ((i12 & 8) != 0) {
            office2 = sessionEntity.office;
        } else {
            office2 = office;
        }
        if ((i12 & 16) != 0) {
            profile2 = sessionEntity.profile;
        } else {
            profile2 = profile;
        }
        if ((i12 & 32) != 0) {
            sessionStatus2 = sessionEntity.sessionStatus;
        } else {
            sessionStatus2 = sessionStatus;
        }
        if ((i12 & 64) != 0) {
            verification2 = sessionEntity.verification;
        } else {
            verification2 = verification;
        }
        if ((i12 & 128) != 0) {
            str2 = sessionEntity.version;
        } else {
            str2 = str;
        }
        if ((i12 & 256) != 0) {
            num2 = sessionEntity.rankedVerticalId;
        } else {
            num2 = num;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            landingPage2 = sessionEntity.landingPage;
        } else {
            landingPage2 = landingPage;
        }
        return sessionEntity.copy(i13, appStatus2, greeting2, office2, profile2, sessionStatus2, verification2, str2, num2, landingPage2);
    }

    public final int component1() {
        return this.f22335id;
    }

    public final LandingPage component10() {
        return this.landingPage;
    }

    public final AppStatus component2() {
        return this.appStatus;
    }

    public final Greeting component3() {
        return this.greeting;
    }

    public final Office component4() {
        return this.office;
    }

    public final Profile component5() {
        return this.profile;
    }

    public final SessionStatus component6() {
        return this.sessionStatus;
    }

    public final Verification component7() {
        return this.verification;
    }

    public final String component8() {
        return this.version;
    }

    public final Integer component9() {
        return this.rankedVerticalId;
    }

    public final SessionEntity copy(int i11, AppStatus appStatus, Greeting greeting, Office office, Profile profile, SessionStatus sessionStatus, Verification verification, String str, Integer num, LandingPage landingPage) {
        o.i(sessionStatus, "sessionStatus");
        return new SessionEntity(i11, appStatus, greeting, office, profile, sessionStatus, verification, str, num, landingPage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEntity)) {
            return false;
        }
        SessionEntity sessionEntity = (SessionEntity) obj;
        if (this.f22335id == sessionEntity.f22335id && this.appStatus == sessionEntity.appStatus && o.d(this.greeting, sessionEntity.greeting) && o.d(this.office, sessionEntity.office) && o.d(this.profile, sessionEntity.profile) && this.sessionStatus == sessionEntity.sessionStatus && o.d(this.verification, sessionEntity.verification) && o.d(this.version, sessionEntity.version) && o.d(this.rankedVerticalId, sessionEntity.rankedVerticalId) && this.landingPage == sessionEntity.landingPage) {
            return true;
        }
        return false;
    }

    public final AppStatus getAppStatus() {
        return this.appStatus;
    }

    public final Greeting getGreeting() {
        return this.greeting;
    }

    public final int getId() {
        return this.f22335id;
    }

    public final LandingPage getLandingPage() {
        return this.landingPage;
    }

    public final Office getOffice() {
        return this.office;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final Integer getRankedVerticalId() {
        return this.rankedVerticalId;
    }

    public final SessionStatus getSessionStatus() {
        return this.sessionStatus;
    }

    public final Verification getVerification() {
        return this.verification;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = Integer.hashCode(this.f22335id) * 31;
        AppStatus appStatus = this.appStatus;
        int i11 = 0;
        if (appStatus == null) {
            hashCode = 0;
        } else {
            hashCode = appStatus.hashCode();
        }
        int i12 = (hashCode8 + hashCode) * 31;
        Greeting greeting = this.greeting;
        if (greeting == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = greeting.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Office office = this.office;
        if (office == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = office.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Profile profile = this.profile;
        if (profile == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = profile.hashCode();
        }
        int hashCode9 = (((i14 + hashCode4) * 31) + this.sessionStatus.hashCode()) * 31;
        Verification verification = this.verification;
        if (verification == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = verification.hashCode();
        }
        int i15 = (hashCode9 + hashCode5) * 31;
        String str = this.version;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num = this.rankedVerticalId;
        if (num == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        LandingPage landingPage = this.landingPage;
        if (landingPage != null) {
            i11 = landingPage.hashCode();
        }
        return i17 + i11;
    }

    public final boolean isUserVerified() {
        switch (WhenMappings.$EnumSwitchMapping$0[this.sessionStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public String toString() {
        int i11 = this.f22335id;
        AppStatus appStatus = this.appStatus;
        Greeting greeting = this.greeting;
        Office office = this.office;
        Profile profile = this.profile;
        SessionStatus sessionStatus = this.sessionStatus;
        Verification verification = this.verification;
        String str = this.version;
        Integer num = this.rankedVerticalId;
        LandingPage landingPage = this.landingPage;
        return "SessionEntity(id=" + i11 + ", appStatus=" + appStatus + ", greeting=" + greeting + ", office=" + office + ", profile=" + profile + ", sessionStatus=" + sessionStatus + ", verification=" + verification + ", version=" + str + ", rankedVerticalId=" + num + ", landingPage=" + landingPage + ")";
    }

    public /* synthetic */ SessionEntity(int i11, AppStatus appStatus, Greeting greeting, Office office, Profile profile, SessionStatus sessionStatus, Verification verification, String str, Integer num, LandingPage landingPage, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? null : appStatus, (i12 & 4) != 0 ? null : greeting, (i12 & 8) != 0 ? null : office, profile, sessionStatus, (i12 & 64) != 0 ? null : verification, (i12 & 128) != 0 ? null : str, (i12 & 256) != 0 ? null : num, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? LandingPage.COMMERCIAL : landingPage);
    }

    /* compiled from: SessionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Profile {
        private static final double LATITUDE_MAX = 90.0d;
        private static final double LATITUDE_MIN = -90.0d;
        private static final double LONGITUDE_MAX = 180.0d;
        private static final double LONGITUDE_MIN = -180.0d;
        @c("allow_banner_notifications")
        private final Integer allowBannerNotifications;
        @c("allow_follow")
        private final Integer allowFollow;
        @c("dob")
        private final String dob;
        @c("email")
        private final String email;
        @c("first_name")
        private final String firstName;
        @c("free_ads")
        private final Float freeAds;
        private String fullName;
        @c("gender")
        private final Gender gender;
        @c("image")
        private final String image;
        @c("is_email_verified")
        private final Integer isEmailVerified;
        @c("is_fresh")
        private final Integer isFresh;
        @c("language")
        private final Languages language;
        @c("last_name")
        private final String lastName;
        @c("location_lat")
        private final Float locationLat;
        @c("location_lon")
        private final Float locationLon;
        @c("member_since")
        private final String memberSince;
        @c("number_of_followers")
        private final Integer numberOfFollowers;
        @c("number_of_following")
        private final Integer numberOfFollowing;
        @c("phone")
        private final String phone;
        @c("points_active")
        private final Integer pointsActive;
        @c("points_lifetime")
        private final Integer pointsLifetime;
        @c("premium_ads")
        private final Float premiumAds;
        @c("region_id")
        private final Integer regionId;
        @c(UserEntityKt.USER_ID)
        private final Integer userId;
        public static final Companion Companion = new Companion(null);
        public static final int $stable = 8;

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: SessionEntity.kt */
        /* loaded from: classes2.dex */
        public static final class LanguageTypeConverter {
            public static final int $stable = 0;

            public final Languages toLanguages(String str) {
                Languages languages = Languages.ARABIC;
                if (!o.d(str, languages.getValue())) {
                    Languages languages2 = Languages.ENGLISH;
                    if (!o.d(str, languages2.getValue())) {
                        return null;
                    }
                    return languages2;
                }
                return languages;
            }

            public final String toString(Languages languages) {
                if (languages != null) {
                    return languages.getValue();
                }
                return null;
            }
        }

        public Profile(Integer num, Integer num2, String str, String str2, String str3, Float f11, Gender gender, String str4, Integer num3, String str5, Float f12, Float f13, Integer num4, Integer num5, String str6, Integer num6, Integer num7, Float f14, Languages languages, String str7, Integer num8, Integer num9, Integer num10) {
            String str8 = str3;
            String str9 = str5;
            this.allowBannerNotifications = num;
            this.allowFollow = num2;
            this.dob = str;
            this.email = str2;
            this.firstName = str8;
            this.freeAds = f11;
            this.gender = gender;
            this.image = str4;
            this.isEmailVerified = num3;
            this.lastName = str9;
            this.locationLat = f12;
            this.locationLon = f13;
            this.numberOfFollowers = num4;
            this.numberOfFollowing = num5;
            this.phone = str6;
            this.pointsActive = num6;
            this.pointsLifetime = num7;
            this.premiumAds = f14;
            this.language = languages;
            this.memberSince = str7;
            this.regionId = num8;
            this.isFresh = num9;
            this.userId = num10;
            str8 = str8 == null ? "" : str8;
            str9 = str9 == null ? "" : str9;
            this.fullName = str8 + " " + str9;
        }

        public final Integer component1() {
            return this.allowBannerNotifications;
        }

        public final String component10() {
            return this.lastName;
        }

        public final Float component11() {
            return this.locationLat;
        }

        public final Float component12() {
            return this.locationLon;
        }

        public final Integer component13() {
            return this.numberOfFollowers;
        }

        public final Integer component14() {
            return this.numberOfFollowing;
        }

        public final String component15() {
            return this.phone;
        }

        public final Integer component16() {
            return this.pointsActive;
        }

        public final Integer component17() {
            return this.pointsLifetime;
        }

        public final Float component18() {
            return this.premiumAds;
        }

        public final Languages component19() {
            return this.language;
        }

        public final Integer component2() {
            return this.allowFollow;
        }

        public final String component20() {
            return this.memberSince;
        }

        public final Integer component21() {
            return this.regionId;
        }

        public final Integer component22() {
            return this.isFresh;
        }

        public final Integer component23() {
            return this.userId;
        }

        public final String component3() {
            return this.dob;
        }

        public final String component4() {
            return this.email;
        }

        public final String component5() {
            return this.firstName;
        }

        public final Float component6() {
            return this.freeAds;
        }

        public final Gender component7() {
            return this.gender;
        }

        public final String component8() {
            return this.image;
        }

        public final Integer component9() {
            return this.isEmailVerified;
        }

        public final boolean coordinatesNotNull() {
            if (this.locationLat != null && this.locationLon != null) {
                return true;
            }
            return false;
        }

        public final Profile copy(Integer num, Integer num2, String str, String str2, String str3, Float f11, Gender gender, String str4, Integer num3, String str5, Float f12, Float f13, Integer num4, Integer num5, String str6, Integer num6, Integer num7, Float f14, Languages languages, String str7, Integer num8, Integer num9, Integer num10) {
            return new Profile(num, num2, str, str2, str3, f11, gender, str4, num3, str5, f12, f13, num4, num5, str6, num6, num7, f14, languages, str7, num8, num9, num10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj;
            if (o.d(this.allowBannerNotifications, profile.allowBannerNotifications) && o.d(this.allowFollow, profile.allowFollow) && o.d(this.dob, profile.dob) && o.d(this.email, profile.email) && o.d(this.firstName, profile.firstName) && o.d(this.freeAds, profile.freeAds) && this.gender == profile.gender && o.d(this.image, profile.image) && o.d(this.isEmailVerified, profile.isEmailVerified) && o.d(this.lastName, profile.lastName) && o.d(this.locationLat, profile.locationLat) && o.d(this.locationLon, profile.locationLon) && o.d(this.numberOfFollowers, profile.numberOfFollowers) && o.d(this.numberOfFollowing, profile.numberOfFollowing) && o.d(this.phone, profile.phone) && o.d(this.pointsActive, profile.pointsActive) && o.d(this.pointsLifetime, profile.pointsLifetime) && o.d(this.premiumAds, profile.premiumAds) && this.language == profile.language && o.d(this.memberSince, profile.memberSince) && o.d(this.regionId, profile.regionId) && o.d(this.isFresh, profile.isFresh) && o.d(this.userId, profile.userId)) {
                return true;
            }
            return false;
        }

        public final Integer getAllowBannerNotifications() {
            return this.allowBannerNotifications;
        }

        public final Integer getAllowFollow() {
            return this.allowFollow;
        }

        public final String getDob() {
            return this.dob;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getFirstName() {
            return this.firstName;
        }

        public final Float getFreeAds() {
            return this.freeAds;
        }

        public final String getFullName() {
            String str = this.firstName;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = this.lastName;
            if (str3 != null) {
                str2 = str3;
            }
            return str + " " + str2;
        }

        public final Gender getGender() {
            return this.gender;
        }

        public final String getImage() {
            return this.image;
        }

        public final Languages getLanguage() {
            return this.language;
        }

        public final String getLastName() {
            return this.lastName;
        }

        public final Float getLocationLat() {
            return this.locationLat;
        }

        public final Float getLocationLon() {
            return this.locationLon;
        }

        public final String getMemberSince() {
            return this.memberSince;
        }

        public final Integer getNumberOfFollowers() {
            return this.numberOfFollowers;
        }

        public final Integer getNumberOfFollowing() {
            return this.numberOfFollowing;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final Integer getPointsActive() {
            return this.pointsActive;
        }

        public final Integer getPointsLifetime() {
            return this.pointsLifetime;
        }

        public final Float getPremiumAds() {
            return this.premiumAds;
        }

        public final Integer getRegionId() {
            return this.regionId;
        }

        public final Integer getUserId() {
            return this.userId;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            int hashCode10;
            int hashCode11;
            int hashCode12;
            int hashCode13;
            int hashCode14;
            int hashCode15;
            int hashCode16;
            int hashCode17;
            int hashCode18;
            int hashCode19;
            int hashCode20;
            int hashCode21;
            int hashCode22;
            Integer num = this.allowBannerNotifications;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = hashCode * 31;
            Integer num2 = this.allowFollow;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str = this.dob;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str2 = this.email;
            if (str2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str2.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str3 = this.firstName;
            if (str3 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str3.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            Float f11 = this.freeAds;
            if (f11 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = f11.hashCode();
            }
            int i17 = (i16 + hashCode6) * 31;
            Gender gender = this.gender;
            if (gender == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = gender.hashCode();
            }
            int i18 = (i17 + hashCode7) * 31;
            String str4 = this.image;
            if (str4 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = str4.hashCode();
            }
            int i19 = (i18 + hashCode8) * 31;
            Integer num3 = this.isEmailVerified;
            if (num3 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = num3.hashCode();
            }
            int i21 = (i19 + hashCode9) * 31;
            String str5 = this.lastName;
            if (str5 == null) {
                hashCode10 = 0;
            } else {
                hashCode10 = str5.hashCode();
            }
            int i22 = (i21 + hashCode10) * 31;
            Float f12 = this.locationLat;
            if (f12 == null) {
                hashCode11 = 0;
            } else {
                hashCode11 = f12.hashCode();
            }
            int i23 = (i22 + hashCode11) * 31;
            Float f13 = this.locationLon;
            if (f13 == null) {
                hashCode12 = 0;
            } else {
                hashCode12 = f13.hashCode();
            }
            int i24 = (i23 + hashCode12) * 31;
            Integer num4 = this.numberOfFollowers;
            if (num4 == null) {
                hashCode13 = 0;
            } else {
                hashCode13 = num4.hashCode();
            }
            int i25 = (i24 + hashCode13) * 31;
            Integer num5 = this.numberOfFollowing;
            if (num5 == null) {
                hashCode14 = 0;
            } else {
                hashCode14 = num5.hashCode();
            }
            int i26 = (i25 + hashCode14) * 31;
            String str6 = this.phone;
            if (str6 == null) {
                hashCode15 = 0;
            } else {
                hashCode15 = str6.hashCode();
            }
            int i27 = (i26 + hashCode15) * 31;
            Integer num6 = this.pointsActive;
            if (num6 == null) {
                hashCode16 = 0;
            } else {
                hashCode16 = num6.hashCode();
            }
            int i28 = (i27 + hashCode16) * 31;
            Integer num7 = this.pointsLifetime;
            if (num7 == null) {
                hashCode17 = 0;
            } else {
                hashCode17 = num7.hashCode();
            }
            int i29 = (i28 + hashCode17) * 31;
            Float f14 = this.premiumAds;
            if (f14 == null) {
                hashCode18 = 0;
            } else {
                hashCode18 = f14.hashCode();
            }
            int i31 = (i29 + hashCode18) * 31;
            Languages languages = this.language;
            if (languages == null) {
                hashCode19 = 0;
            } else {
                hashCode19 = languages.hashCode();
            }
            int i32 = (i31 + hashCode19) * 31;
            String str7 = this.memberSince;
            if (str7 == null) {
                hashCode20 = 0;
            } else {
                hashCode20 = str7.hashCode();
            }
            int i33 = (i32 + hashCode20) * 31;
            Integer num8 = this.regionId;
            if (num8 == null) {
                hashCode21 = 0;
            } else {
                hashCode21 = num8.hashCode();
            }
            int i34 = (i33 + hashCode21) * 31;
            Integer num9 = this.isFresh;
            if (num9 == null) {
                hashCode22 = 0;
            } else {
                hashCode22 = num9.hashCode();
            }
            int i35 = (i34 + hashCode22) * 31;
            Integer num10 = this.userId;
            if (num10 != null) {
                i11 = num10.hashCode();
            }
            return i35 + i11;
        }

        public final Integer isEmailVerified() {
            return this.isEmailVerified;
        }

        public final Integer isFresh() {
            return this.isFresh;
        }

        public String toString() {
            Integer num = this.allowBannerNotifications;
            Integer num2 = this.allowFollow;
            String str = this.dob;
            String str2 = this.email;
            String str3 = this.firstName;
            Float f11 = this.freeAds;
            Gender gender = this.gender;
            String str4 = this.image;
            Integer num3 = this.isEmailVerified;
            String str5 = this.lastName;
            Float f12 = this.locationLat;
            Float f13 = this.locationLon;
            Integer num4 = this.numberOfFollowers;
            Integer num5 = this.numberOfFollowing;
            String str6 = this.phone;
            Integer num6 = this.pointsActive;
            Integer num7 = this.pointsLifetime;
            Float f14 = this.premiumAds;
            Languages languages = this.language;
            String str7 = this.memberSince;
            Integer num8 = this.regionId;
            Integer num9 = this.isFresh;
            Integer num10 = this.userId;
            return "Profile(allowBannerNotifications=" + num + ", allowFollow=" + num2 + ", dob=" + str + ", email=" + str2 + ", firstName=" + str3 + ", freeAds=" + f11 + ", gender=" + gender + ", image=" + str4 + ", isEmailVerified=" + num3 + ", lastName=" + str5 + ", locationLat=" + f12 + ", locationLon=" + f13 + ", numberOfFollowers=" + num4 + ", numberOfFollowing=" + num5 + ", phone=" + str6 + ", pointsActive=" + num6 + ", pointsLifetime=" + num7 + ", premiumAds=" + f14 + ", language=" + languages + ", memberSince=" + str7 + ", regionId=" + num8 + ", isFresh=" + num9 + ", userId=" + num10 + ")";
        }

        public /* synthetic */ Profile(Integer num, Integer num2, String str, String str2, String str3, Float f11, Gender gender, String str4, Integer num3, String str5, Float f12, Float f13, Integer num4, Integer num5, String str6, Integer num6, Integer num7, Float f14, Languages languages, String str7, Integer num8, Integer num9, Integer num10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(num, num2, str, str2, str3, f11, gender, str4, num3, str5, f12, f13, num4, num5, str6, num6, num7, f14, languages, str7, num8, (i11 & 2097152) != 0 ? null : num9, num10);
        }
    }
}

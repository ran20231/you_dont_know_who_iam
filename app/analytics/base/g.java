package com.forsale.app.analytics.base;

import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticsConfiguration.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private b f22002a;

    /* renamed from: b  reason: collision with root package name */
    private a f22003b;

    /* renamed from: c  reason: collision with root package name */
    private UserStatus f22004c;

    /* compiled from: AnalyticsConfiguration.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private Float f22005a;

        /* renamed from: b  reason: collision with root package name */
        private Float f22006b;

        public a(Float f11, Float f12) {
            this.f22005a = f11;
            this.f22006b = f12;
        }

        public final float a() {
            Float f11 = this.f22005a;
            if (f11 != null) {
                return f11.floatValue();
            }
            return 0.0f;
        }

        public final float b() {
            Float f11 = this.f22006b;
            if (f11 != null) {
                return f11.floatValue();
            }
            return 0.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f22005a, aVar.f22005a) && o.d(this.f22006b, aVar.f22006b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            Float f11 = this.f22005a;
            int i11 = 0;
            if (f11 == null) {
                hashCode = 0;
            } else {
                hashCode = f11.hashCode();
            }
            int i12 = hashCode * 31;
            Float f12 = this.f22006b;
            if (f12 != null) {
                i11 = f12.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            Float f11 = this.f22005a;
            Float f12 = this.f22006b;
            return "CreditInfo(free=" + f11 + ", premium=" + f12 + ")";
        }
    }

    /* compiled from: AnalyticsConfiguration.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final Integer f22007a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22008b;

        /* renamed from: c  reason: collision with root package name */
        private final String f22009c;

        /* renamed from: d  reason: collision with root package name */
        private final String f22010d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f22011e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f22012f;

        /* renamed from: g  reason: collision with root package name */
        private Languages f22013g;

        public b(Integer num, String str, String str2, String str3, Integer num2, boolean z11, Languages languages) {
            this.f22007a = num;
            this.f22008b = str;
            this.f22009c = str2;
            this.f22010d = str3;
            this.f22011e = num2;
            this.f22012f = z11;
            this.f22013g = languages;
        }

        public final String a() {
            return this.f22010d;
        }

        public final String b() {
            return this.f22009c;
        }

        public final Languages c() {
            return this.f22013g;
        }

        public final String d() {
            return this.f22008b;
        }

        public final Integer e() {
            return this.f22007a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f22007a, bVar.f22007a) && o.d(this.f22008b, bVar.f22008b) && o.d(this.f22009c, bVar.f22009c) && o.d(this.f22010d, bVar.f22010d) && o.d(this.f22011e, bVar.f22011e) && this.f22012f == bVar.f22012f && this.f22013g == bVar.f22013g) {
                return true;
            }
            return false;
        }

        public final Integer f() {
            return this.f22011e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            Integer num = this.f22007a;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = hashCode * 31;
            String str = this.f22008b;
            if (str == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str2 = this.f22009c;
            if (str2 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str2.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str3 = this.f22010d;
            if (str3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str3.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            Integer num2 = this.f22011e;
            if (num2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = num2.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            boolean z11 = this.f22012f;
            int i17 = z11;
            if (z11 != 0) {
                i17 = 1;
            }
            int i18 = (i16 + i17) * 31;
            Languages languages = this.f22013g;
            if (languages != null) {
                i11 = languages.hashCode();
            }
            return i18 + i11;
        }

        public String toString() {
            Integer num = this.f22007a;
            String str = this.f22008b;
            String str2 = this.f22009c;
            String str3 = this.f22010d;
            Integer num2 = this.f22011e;
            boolean z11 = this.f22012f;
            Languages languages = this.f22013g;
            return "UserGeneralInfo(userId=" + num + ", phone=" + str + ", firstName=" + str2 + ", email=" + str3 + ", isEmailVerified=" + num2 + ", isBlocked=" + z11 + ", language=" + languages + ")";
        }
    }

    public g(b bVar, a aVar, UserStatus userStatus) {
        o.i(userStatus, "userStatus");
        this.f22002a = bVar;
        this.f22003b = aVar;
        this.f22004c = userStatus;
    }

    public final a a() {
        return this.f22003b;
    }

    public final b b() {
        return this.f22002a;
    }

    public final UserStatus c() {
        return this.f22004c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (o.d(this.f22002a, gVar.f22002a) && o.d(this.f22003b, gVar.f22003b) && this.f22004c == gVar.f22004c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        b bVar = this.f22002a;
        int i11 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i12 = hashCode * 31;
        a aVar = this.f22003b;
        if (aVar != null) {
            i11 = aVar.hashCode();
        }
        return ((i12 + i11) * 31) + this.f22004c.hashCode();
    }

    public String toString() {
        b bVar = this.f22002a;
        a aVar = this.f22003b;
        UserStatus userStatus = this.f22004c;
        return "UserConfig(userGeneralInfo=" + bVar + ", creditInfo=" + aVar + ", userStatus=" + userStatus + ")";
    }
}

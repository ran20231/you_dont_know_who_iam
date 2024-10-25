package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.d;
import com.forsale.app.analytics.base.g;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticsProperties.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: AnalyticsProperties.kt */
    /* loaded from: classes2.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private final com.forsale.app.analytics.base.d f21981a;

        public a(com.forsale.app.analytics.base.d dVar) {
            this.f21981a = dVar;
        }

        public final com.forsale.app.analytics.base.d a() {
            return this.f21981a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && o.d(this.f21981a, ((a) obj).f21981a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            com.forsale.app.analytics.base.d dVar = this.f21981a;
            if (dVar == null) {
                return 0;
            }
            return dVar.hashCode();
        }

        public String toString() {
            com.forsale.app.analytics.base.d dVar = this.f21981a;
            return "AppSettings(appInfo=" + dVar + ")";
        }
    }

    /* compiled from: AnalyticsProperties.kt */
    /* renamed from: com.forsale.app.analytics.base.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0247b implements b {

        /* renamed from: a  reason: collision with root package name */
        private final g.a f21982a;

        public C0247b(g.a aVar) {
            this.f21982a = aVar;
        }

        public final g.a a() {
            return this.f21982a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0247b) && o.d(this.f21982a, ((C0247b) obj).f21982a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            g.a aVar = this.f21982a;
            if (aVar == null) {
                return 0;
            }
            return aVar.hashCode();
        }

        public String toString() {
            g.a aVar = this.f21982a;
            return "Credit(creditInfo=" + aVar + ")";
        }
    }

    /* compiled from: AnalyticsProperties.kt */
    /* loaded from: classes2.dex */
    public static final class c implements b {

        /* renamed from: a  reason: collision with root package name */
        private final Languages f21983a;

        public c(Languages languages) {
            this.f21983a = languages;
        }

        public final Languages a() {
            return this.f21983a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && this.f21983a == ((c) obj).f21983a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Languages languages = this.f21983a;
            if (languages == null) {
                return 0;
            }
            return languages.hashCode();
        }

        public String toString() {
            Languages languages = this.f21983a;
            return "Language(language=" + languages + ")";
        }
    }

    /* compiled from: AnalyticsProperties.kt */
    /* loaded from: classes2.dex */
    public static final class d implements b {

        /* renamed from: a  reason: collision with root package name */
        private final g.b f21984a;

        public d(g.b bVar) {
            this.f21984a = bVar;
        }

        public final g.b a() {
            return this.f21984a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && o.d(this.f21984a, ((d) obj).f21984a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            g.b bVar = this.f21984a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            g.b bVar = this.f21984a;
            return "Profile(user=" + bVar + ")";
        }
    }

    /* compiled from: AnalyticsProperties.kt */
    /* loaded from: classes2.dex */
    public static final class e implements b {

        /* renamed from: a  reason: collision with root package name */
        private final d.c f21985a;

        public e(d.c regionInfo) {
            o.i(regionInfo, "regionInfo");
            this.f21985a = regionInfo;
        }

        public final d.c a() {
            return this.f21985a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && o.d(this.f21985a, ((e) obj).f21985a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f21985a.hashCode();
        }

        public String toString() {
            d.c cVar = this.f21985a;
            return "Region(regionInfo=" + cVar + ")";
        }
    }

    /* compiled from: AnalyticsProperties.kt */
    /* loaded from: classes2.dex */
    public static final class f implements b {

        /* renamed from: a  reason: collision with root package name */
        private final UserStatus f21986a;

        public f(UserStatus userStatus) {
            o.i(userStatus, "userStatus");
            this.f21986a = userStatus;
        }

        public final UserStatus a() {
            return this.f21986a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof f) && this.f21986a == ((f) obj).f21986a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f21986a.hashCode();
        }

        public String toString() {
            UserStatus userStatus = this.f21986a;
            return "Registration(userStatus=" + userStatus + ")";
        }
    }
}

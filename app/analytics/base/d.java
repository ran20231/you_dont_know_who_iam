package com.forsale.app.analytics.base;

import com.forsale.app.utils.DeviceType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AnalyticsConfiguration.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21989c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final b f21990a;

    /* renamed from: b  reason: collision with root package name */
    private final c f21991b;

    /* compiled from: AnalyticsConfiguration.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AnalyticsConfiguration.kt */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f21992a;

        /* renamed from: b  reason: collision with root package name */
        private final DeviceType f21993b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f21994c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f21995d;

        public b(String deviceId, DeviceType deviceType, boolean z11, boolean z12) {
            o.i(deviceId, "deviceId");
            o.i(deviceType, "deviceType");
            this.f21992a = deviceId;
            this.f21993b = deviceType;
            this.f21994c = z11;
            this.f21995d = z12;
        }

        public final DeviceType a() {
            return this.f21993b;
        }

        public final boolean b() {
            return this.f21995d;
        }

        public final boolean c() {
            return this.f21994c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f21992a, bVar.f21992a) && this.f21993b == bVar.f21993b && this.f21994c == bVar.f21994c && this.f21995d == bVar.f21995d) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f21992a.hashCode() * 31) + this.f21993b.hashCode()) * 31;
            boolean z11 = this.f21994c;
            int i11 = 1;
            int i12 = z11;
            if (z11 != 0) {
                i12 = 1;
            }
            int i13 = (hashCode + i12) * 31;
            boolean z12 = this.f21995d;
            if (!z12) {
                i11 = z12 ? 1 : 0;
            }
            return i13 + i11;
        }

        public String toString() {
            String str = this.f21992a;
            DeviceType deviceType = this.f21993b;
            boolean z11 = this.f21994c;
            boolean z12 = this.f21995d;
            return "DeviceSetting(deviceId=" + str + ", deviceType=" + deviceType + ", isPushNotificationEnabled=" + z11 + ", isDarkModeEnabled=" + z12 + ")";
        }
    }

    /* compiled from: AnalyticsConfiguration.kt */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f21996a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21997b;

        public c(int i11, String regionName) {
            o.i(regionName, "regionName");
            this.f21996a = i11;
            this.f21997b = regionName;
        }

        public final int a() {
            return this.f21996a;
        }

        public final String b() {
            return this.f21997b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.f21996a == cVar.f21996a && o.d(this.f21997b, cVar.f21997b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f21996a) * 31) + this.f21997b.hashCode();
        }

        public String toString() {
            int i11 = this.f21996a;
            String str = this.f21997b;
            return "RegionInfo(regionId=" + i11 + ", regionName=" + str + ")";
        }
    }

    public d() {
        this(null, null, 3, null);
    }

    public final b a() {
        return this.f21990a;
    }

    public final c b() {
        return this.f21991b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (o.d(this.f21990a, dVar.f21990a) && o.d(this.f21991b, dVar.f21991b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        b bVar = this.f21990a;
        int i11 = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i12 = hashCode * 31;
        c cVar = this.f21991b;
        if (cVar != null) {
            i11 = cVar.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        b bVar = this.f21990a;
        c cVar = this.f21991b;
        return "AppInfo(deviceSetting=" + bVar + ", regionInfo=" + cVar + ")";
    }

    public d(b bVar, c cVar) {
        this.f21990a = bVar;
        this.f21991b = cVar;
    }

    public /* synthetic */ d(b bVar, c cVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : cVar);
    }
}

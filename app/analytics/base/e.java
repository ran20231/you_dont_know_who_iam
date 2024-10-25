package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.d;
import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.o;
/* compiled from: TrackerConfigurationType.kt */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: TrackerConfigurationType.kt */
    /* loaded from: classes2.dex */
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        private final u9.a f21998a;

        public a(u9.a analyticsConfig) {
            o.i(analyticsConfig, "analyticsConfig");
            this.f21998a = analyticsConfig;
        }

        public final u9.a a() {
            return this.f21998a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && o.d(this.f21998a, ((a) obj).f21998a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f21998a.hashCode();
        }

        public String toString() {
            u9.a aVar = this.f21998a;
            return "Data(analyticsConfig=" + aVar + ")";
        }
    }

    /* compiled from: TrackerConfigurationType.kt */
    /* loaded from: classes2.dex */
    public static final class b implements e {

        /* renamed from: a  reason: collision with root package name */
        private final Languages f21999a;

        public b(Languages language) {
            o.i(language, "language");
            this.f21999a = language;
        }

        public final Languages a() {
            return this.f21999a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && this.f21999a == ((b) obj).f21999a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f21999a.hashCode();
        }

        public String toString() {
            Languages languages = this.f21999a;
            return "Language(language=" + languages + ")";
        }
    }

    /* compiled from: TrackerConfigurationType.kt */
    /* loaded from: classes2.dex */
    public static final class c implements e {

        /* renamed from: a  reason: collision with root package name */
        private final d.c f22000a;

        public final d.c a() {
            return this.f22000a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && o.d(this.f22000a, ((c) obj).f22000a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f22000a.hashCode();
        }

        public String toString() {
            d.c cVar = this.f22000a;
            return "Region(regionInfo=" + cVar + ")";
        }
    }
}

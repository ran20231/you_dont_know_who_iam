package com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: LogVerticalPageScrolledInteractor.kt */
/* loaded from: classes2.dex */
public final class LogVerticalPageScrolledInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f22376a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogVerticalPageScrolledInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalPageScrolled {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ VerticalPageScrolled[] $VALUES;
        private final String value;
        public static final VerticalPageScrolled VERTICAL_PAGE_SCROLLED = new VerticalPageScrolled("VERTICAL_PAGE_SCROLLED", 0, "Vertical Page Scrolled");
        public static final VerticalPageScrolled VERTICAL = new VerticalPageScrolled("VERTICAL", 1, "Vertical");
        public static final VerticalPageScrolled MAX_VISITED_SECTION_NAME = new VerticalPageScrolled("MAX_VISITED_SECTION_NAME", 2, "MaxVisitedSectionName");
        public static final VerticalPageScrolled MAX_VISITED_SECTION_NUMBER = new VerticalPageScrolled("MAX_VISITED_SECTION_NUMBER", 3, "MaxVisitedSectionNumber");
        public static final VerticalPageScrolled TOTAL_SECTION_COUNT = new VerticalPageScrolled("TOTAL_SECTION_COUNT", 4, "TotalSectionsCount");
        public static final VerticalPageScrolled RECOMMENDATION_CRITERIA = new VerticalPageScrolled("RECOMMENDATION_CRITERIA", 5, "RecommendationCriteria");
        public static final VerticalPageScrolled SECTION = new VerticalPageScrolled("SECTION", 6, "Sections");

        private static final /* synthetic */ VerticalPageScrolled[] $values() {
            return new VerticalPageScrolled[]{VERTICAL_PAGE_SCROLLED, VERTICAL, MAX_VISITED_SECTION_NAME, MAX_VISITED_SECTION_NUMBER, TOTAL_SECTION_COUNT, RECOMMENDATION_CRITERIA, SECTION};
        }

        static {
            VerticalPageScrolled[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private VerticalPageScrolled(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<VerticalPageScrolled> getEntries() {
            return $ENTRIES;
        }

        public static VerticalPageScrolled valueOf(String str) {
            return (VerticalPageScrolled) Enum.valueOf(VerticalPageScrolled.class, str);
        }

        public static VerticalPageScrolled[] values() {
            return (VerticalPageScrolled[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: LogVerticalPageScrolledInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f22377a;

        /* renamed from: b  reason: collision with root package name */
        private final String f22378b;

        /* renamed from: c  reason: collision with root package name */
        private final int f22379c;

        /* renamed from: d  reason: collision with root package name */
        private final int f22380d;

        /* renamed from: e  reason: collision with root package name */
        private final String f22381e;

        /* renamed from: f  reason: collision with root package name */
        private final List<String> f22382f;

        public a(String verticalName, String maxVisitedSectionName, int i11, int i12, String str, List<String> sections) {
            o.i(verticalName, "verticalName");
            o.i(maxVisitedSectionName, "maxVisitedSectionName");
            o.i(sections, "sections");
            this.f22377a = verticalName;
            this.f22378b = maxVisitedSectionName;
            this.f22379c = i11;
            this.f22380d = i12;
            this.f22381e = str;
            this.f22382f = sections;
        }

        public final String a() {
            return this.f22378b;
        }

        public final int b() {
            return this.f22379c;
        }

        public final String c() {
            return this.f22381e;
        }

        public final List<String> d() {
            return this.f22382f;
        }

        public final int e() {
            return this.f22380d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f22377a, aVar.f22377a) && o.d(this.f22378b, aVar.f22378b) && this.f22379c == aVar.f22379c && this.f22380d == aVar.f22380d && o.d(this.f22381e, aVar.f22381e) && o.d(this.f22382f, aVar.f22382f)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f22377a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((this.f22377a.hashCode() * 31) + this.f22378b.hashCode()) * 31) + Integer.hashCode(this.f22379c)) * 31) + Integer.hashCode(this.f22380d)) * 31;
            String str = this.f22381e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.f22382f.hashCode();
        }

        public String toString() {
            String str = this.f22377a;
            String str2 = this.f22378b;
            int i11 = this.f22379c;
            int i12 = this.f22380d;
            String str3 = this.f22381e;
            List<String> list = this.f22382f;
            return "Params(verticalName=" + str + ", maxVisitedSectionName=" + str2 + ", maxVisitedSectionNumber=" + i11 + ", totalSectionsCount=" + i12 + ", recommendationCriteria=" + str3 + ", sections=" + list + ")";
        }
    }

    public LogVerticalPageScrolledInteractor(AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(analyticsLogger, "analyticsLogger");
        this.f22376a = analyticsLogger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x006f, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.RECOMMENDATION_CRITERIA.getValue(), r11.c()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.a r11) {
        /*
            r10 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.o.i(r11, r0)
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r0 = r10.f22376a
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r1 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.VERTICAL_PAGE_SCROLLED
            java.lang.String r3 = r1.getValue()
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r1 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.VERTICAL
            java.lang.String r1 = r1.getValue()
            java.lang.String r2 = r11.f()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r2 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.MAX_VISITED_SECTION_NAME
            java.lang.String r2 = r2.getValue()
            java.lang.String r4 = r11.a()
            kotlin.Pair r2 = wz.i.a(r2, r4)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            java.util.Map r1 = kotlin.collections.g0.o(r1, r2)
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r2 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.MAX_VISITED_SECTION_NUMBER
            java.lang.String r2 = r2.getValue()
            int r4 = r11.b()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r2 = wz.i.a(r2, r4)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            java.util.Map r1 = kotlin.collections.g0.o(r1, r2)
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r2 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.TOTAL_SECTION_COUNT
            java.lang.String r2 = r2.getValue()
            int r4 = r11.e()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            kotlin.Pair r2 = wz.i.a(r2, r4)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            java.util.Map r1 = kotlin.collections.g0.o(r1, r2)
            java.lang.String r2 = r11.c()
            if (r2 == 0) goto L83
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r2 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.RECOMMENDATION_CRITERIA
            java.lang.String r2 = r2.getValue()
            java.lang.String r4 = r11.c()
            kotlin.Pair r2 = wz.i.a(r2, r4)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L87
        L83:
            java.util.Map r2 = kotlin.collections.g0.h()
        L87:
            java.util.Map r1 = kotlin.collections.g0.o(r1, r2)
            com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$VerticalPageScrolled r2 = com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.VerticalPageScrolled.SECTION
            java.lang.String r2 = r2.getValue()
            java.util.List r11 = r11.d()
            kotlin.Pair r11 = wz.i.a(r2, r11)
            java.util.Map r11 = kotlin.collections.g0.f(r11)
            java.util.Map r4 = kotlin.collections.g0.o(r1, r11)
            r5 = 1
            r6 = 0
            r7 = 0
            r8 = 24
            r9 = 0
            s9.a r11 = new s9.a
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.c0(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor.a(com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics.LogVerticalPageScrolledInteractor$a):void");
    }
}

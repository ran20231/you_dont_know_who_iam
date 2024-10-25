package com.forsale.app.domainlayer.interactors.analyticsInteractors.verticalPageAnalytics;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.o;
import wz.i;
/* compiled from: LogVerticalPageSwipedInteractor.kt */
/* loaded from: classes2.dex */
public final class LogVerticalPageSwipedInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f22383a;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LogVerticalPageSwipedInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalPageSwiped {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ VerticalPageSwiped[] $VALUES;
        private final String value;
        public static final VerticalPageSwiped VERTICAL_PAGE_SWIPED = new VerticalPageSwiped("VERTICAL_PAGE_SWIPED", 0, "Vertical Page Swiped");
        public static final VerticalPageSwiped VERTICAL = new VerticalPageSwiped("VERTICAL", 1, "Vertical");
        public static final VerticalPageSwiped MAX_ITEM_SCROLLED = new VerticalPageSwiped("MAX_ITEM_SCROLLED", 2, "MaxItemScrolled");
        public static final VerticalPageSwiped SECTION_NAME = new VerticalPageSwiped("SECTION_NAME", 3, "SectionName");
        public static final VerticalPageSwiped TOTAL_ITEM_COUNT = new VerticalPageSwiped("TOTAL_ITEM_COUNT", 4, "TotalItemsCount");

        private static final /* synthetic */ VerticalPageSwiped[] $values() {
            return new VerticalPageSwiped[]{VERTICAL_PAGE_SWIPED, VERTICAL, MAX_ITEM_SCROLLED, SECTION_NAME, TOTAL_ITEM_COUNT};
        }

        static {
            VerticalPageSwiped[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private VerticalPageSwiped(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<VerticalPageSwiped> getEntries() {
            return $ENTRIES;
        }

        public static VerticalPageSwiped valueOf(String str) {
            return (VerticalPageSwiped) Enum.valueOf(VerticalPageSwiped.class, str);
        }

        public static VerticalPageSwiped[] values() {
            return (VerticalPageSwiped[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: LogVerticalPageSwipedInteractor.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f22384a;

        /* renamed from: b  reason: collision with root package name */
        private final int f22385b;

        /* renamed from: c  reason: collision with root package name */
        private final String f22386c;

        /* renamed from: d  reason: collision with root package name */
        private final int f22387d;

        public a(String verticalName, int i11, String sectionName, int i12) {
            o.i(verticalName, "verticalName");
            o.i(sectionName, "sectionName");
            this.f22384a = verticalName;
            this.f22385b = i11;
            this.f22386c = sectionName;
            this.f22387d = i12;
        }

        public final int a() {
            return this.f22385b;
        }

        public final String b() {
            return this.f22386c;
        }

        public final int c() {
            return this.f22387d;
        }

        public final String d() {
            return this.f22384a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f22384a, aVar.f22384a) && this.f22385b == aVar.f22385b && o.d(this.f22386c, aVar.f22386c) && this.f22387d == aVar.f22387d) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f22384a.hashCode() * 31) + Integer.hashCode(this.f22385b)) * 31) + this.f22386c.hashCode()) * 31) + Integer.hashCode(this.f22387d);
        }

        public String toString() {
            String str = this.f22384a;
            int i11 = this.f22385b;
            String str2 = this.f22386c;
            int i12 = this.f22387d;
            return "Params(verticalName=" + str + ", maxItemScrolled=" + i11 + ", sectionName=" + str2 + ", totalItemsCount=" + i12 + ")";
        }
    }

    public LogVerticalPageSwipedInteractor(AggregatedAllAnalyticsLogger analyticsLogger) {
        o.i(analyticsLogger, "analyticsLogger");
        this.f22383a = analyticsLogger;
    }

    public final void a(a params) {
        Map f11;
        Map f12;
        Map o11;
        Map f13;
        Map o12;
        Map f14;
        Map o13;
        o.i(params, "params");
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f22383a;
        String value = VerticalPageSwiped.VERTICAL_PAGE_SWIPED.getValue();
        f11 = i0.f(i.a(VerticalPageSwiped.VERTICAL.getValue(), params.d()));
        f12 = i0.f(i.a(VerticalPageSwiped.MAX_ITEM_SCROLLED.getValue(), Integer.valueOf(params.a())));
        o11 = j0.o(f11, f12);
        f13 = i0.f(i.a(VerticalPageSwiped.SECTION_NAME.getValue(), params.b()));
        o12 = j0.o(o11, f13);
        f14 = i0.f(i.a(VerticalPageSwiped.TOTAL_ITEM_COUNT.getValue(), Integer.valueOf(params.c())));
        o13 = j0.o(o12, f14);
        aggregatedAllAnalyticsLogger.c0(new s9.a(value, o13, true, false, false, 24, null));
    }
}

package com.forsale.app.datalayer.network.responses;

import com.leanplum.core.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.internal.o;
import wz.i;
/* compiled from: ListingAnalyticsResponse.kt */
/* loaded from: classes2.dex */
public final class ListingAnalyticsResponse {
    public static final int $stable = 8;
    private final List<Analytics> analytics;
    private final int total;

    /* compiled from: ListingAnalyticsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Analytics {
        public static final int $stable = 8;
        private final String day;
        private final List<Map<String, Integer>> values;

        /* JADX WARN: Multi-variable type inference failed */
        public Analytics(String day, List<? extends Map<String, Integer>> values) {
            o.i(day, "day");
            o.i(values, "values");
            this.day = day;
            this.values = values;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Analytics copy$default(Analytics analytics, String str, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = analytics.day;
            }
            if ((i11 & 2) != 0) {
                list = analytics.values;
            }
            return analytics.copy(str, list);
        }

        public final String component1() {
            return this.day;
        }

        public final List<Map<String, Integer>> component2() {
            return this.values;
        }

        public final Analytics copy(String day, List<? extends Map<String, Integer>> values) {
            o.i(day, "day");
            o.i(values, "values");
            return new Analytics(day, values);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            if (o.d(this.day, analytics.day) && o.d(this.values, analytics.values)) {
                return true;
            }
            return false;
        }

        public final List<Map<String, Integer>> getAllDayValues() {
            List<Map<String, Integer>> X0;
            String valueOf;
            Object obj;
            int i11;
            Map f11;
            Integer num;
            ArrayList arrayList = new ArrayList();
            for (int i12 = 0; i12 < 24; i12++) {
                if (i12 < 10) {
                    valueOf = BuildConfig.BUILD_NUMBER + i12;
                } else {
                    valueOf = String.valueOf(i12);
                }
                Iterator<T> it2 = this.values.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((Map) obj).containsKey(valueOf)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Map map = (Map) obj;
                if (map != null && (num = (Integer) map.get(valueOf)) != null) {
                    i11 = num.intValue();
                } else {
                    i11 = 0;
                }
                f11 = i0.f(i.a(valueOf, Integer.valueOf(i11)));
                arrayList.add(f11);
            }
            X0 = CollectionsKt___CollectionsKt.X0(arrayList);
            return X0;
        }

        public final String getDay() {
            return this.day;
        }

        public final List<Map<String, Integer>> getValues() {
            return this.values;
        }

        public int hashCode() {
            return (this.day.hashCode() * 31) + this.values.hashCode();
        }

        public String toString() {
            String str = this.day;
            List<Map<String, Integer>> list = this.values;
            return "Analytics(day=" + str + ", values=" + list + ")";
        }
    }

    public ListingAnalyticsResponse(List<Analytics> analytics, int i11) {
        o.i(analytics, "analytics");
        this.analytics = analytics;
        this.total = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ListingAnalyticsResponse copy$default(ListingAnalyticsResponse listingAnalyticsResponse, List list, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = listingAnalyticsResponse.analytics;
        }
        if ((i12 & 2) != 0) {
            i11 = listingAnalyticsResponse.total;
        }
        return listingAnalyticsResponse.copy(list, i11);
    }

    public final List<Analytics> component1() {
        return this.analytics;
    }

    public final int component2() {
        return this.total;
    }

    public final ListingAnalyticsResponse copy(List<Analytics> analytics, int i11) {
        o.i(analytics, "analytics");
        return new ListingAnalyticsResponse(analytics, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingAnalyticsResponse)) {
            return false;
        }
        ListingAnalyticsResponse listingAnalyticsResponse = (ListingAnalyticsResponse) obj;
        if (o.d(this.analytics, listingAnalyticsResponse.analytics) && this.total == listingAnalyticsResponse.total) {
            return true;
        }
        return false;
    }

    public final List<Analytics> getAnalytics() {
        return this.analytics;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return (this.analytics.hashCode() * 31) + Integer.hashCode(this.total);
    }

    public String toString() {
        List<Analytics> list = this.analytics;
        int i11 = this.total;
        return "ListingAnalyticsResponse(analytics=" + list + ", total=" + i11 + ")";
    }
}

package com.forsale.app.utils.analytics.listingfiltration;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: FilterAnalyticsTypes.kt */
/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f40057a;

    /* compiled from: FilterAnalyticsTypes.kt */
    /* renamed from: com.forsale.app.utils.analytics.listingfiltration.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0456a extends a {

        /* renamed from: b  reason: collision with root package name */
        private final String f40058b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f40059c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0456a(String filterName, List<String> attributesSelected) {
            super(filterName, null);
            o.i(filterName, "filterName");
            o.i(attributesSelected, "attributesSelected");
            this.f40058b = filterName;
            this.f40059c = attributesSelected;
        }

        @Override // com.forsale.app.utils.analytics.listingfiltration.a
        public String a() {
            return this.f40058b;
        }

        public final List<String> b() {
            return this.f40059c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0456a)) {
                return false;
            }
            C0456a c0456a = (C0456a) obj;
            if (o.d(this.f40058b, c0456a.f40058b) && o.d(this.f40059c, c0456a.f40059c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f40058b.hashCode() * 31) + this.f40059c.hashCode();
        }

        public String toString() {
            String str = this.f40058b;
            List<String> list = this.f40059c;
            return "BooleanFilter(filterName=" + str + ", attributesSelected=" + list + ")";
        }
    }

    /* compiled from: FilterAnalyticsTypes.kt */
    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: b  reason: collision with root package name */
        private final String f40060b;

        /* renamed from: c  reason: collision with root package name */
        private final List<dc.a> f40061c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String filterName, List<dc.a> locationAnalyticData) {
            super(filterName, null);
            o.i(filterName, "filterName");
            o.i(locationAnalyticData, "locationAnalyticData");
            this.f40060b = filterName;
            this.f40061c = locationAnalyticData;
        }

        @Override // com.forsale.app.utils.analytics.listingfiltration.a
        public String a() {
            return this.f40060b;
        }

        public final List<dc.a> b() {
            return this.f40061c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f40060b, bVar.f40060b) && o.d(this.f40061c, bVar.f40061c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f40060b.hashCode() * 31) + this.f40061c.hashCode();
        }

        public String toString() {
            String str = this.f40060b;
            List<dc.a> list = this.f40061c;
            return "LocationFilter(filterName=" + str + ", locationAnalyticData=" + list + ")";
        }
    }

    /* compiled from: FilterAnalyticsTypes.kt */
    /* loaded from: classes3.dex */
    public static final class c extends a {

        /* renamed from: b  reason: collision with root package name */
        private final String f40062b;

        /* renamed from: c  reason: collision with root package name */
        private final GetListingsBody.FiltrationData.Range f40063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String filterName, GetListingsBody.FiltrationData.Range range) {
            super(filterName, null);
            o.i(filterName, "filterName");
            this.f40062b = filterName;
            this.f40063c = range;
        }

        @Override // com.forsale.app.utils.analytics.listingfiltration.a
        public String a() {
            return this.f40062b;
        }

        public final GetListingsBody.FiltrationData.Range b() {
            return this.f40063c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (o.d(this.f40062b, cVar.f40062b) && o.d(this.f40063c, cVar.f40063c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f40062b.hashCode() * 31;
            GetListingsBody.FiltrationData.Range range = this.f40063c;
            if (range == null) {
                hashCode = 0;
            } else {
                hashCode = range.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            String str = this.f40062b;
            GetListingsBody.FiltrationData.Range range = this.f40063c;
            return "RangeFilter(filterName=" + str + ", rangeAnalyticData=" + range + ")";
        }
    }

    /* compiled from: FilterAnalyticsTypes.kt */
    /* loaded from: classes3.dex */
    public static final class d extends a {

        /* renamed from: b  reason: collision with root package name */
        private final String f40064b;

        /* renamed from: c  reason: collision with root package name */
        private final List<String> f40065c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String filterName, List<String> selectAnalyticData) {
            super(filterName, null);
            o.i(filterName, "filterName");
            o.i(selectAnalyticData, "selectAnalyticData");
            this.f40064b = filterName;
            this.f40065c = selectAnalyticData;
        }

        @Override // com.forsale.app.utils.analytics.listingfiltration.a
        public String a() {
            return this.f40064b;
        }

        public final List<String> b() {
            return this.f40065c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (o.d(this.f40064b, dVar.f40064b) && o.d(this.f40065c, dVar.f40065c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f40064b.hashCode() * 31) + this.f40065c.hashCode();
        }

        public String toString() {
            String str = this.f40064b;
            List<String> list = this.f40065c;
            return "SelectionFilter(filterName=" + str + ", selectAnalyticData=" + list + ")";
        }
    }

    public /* synthetic */ a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String a() {
        return this.f40057a;
    }

    private a(String str) {
        this.f40057a = str;
    }
}

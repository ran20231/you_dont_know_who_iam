package com.forsale.app.features.categories.listingdetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.analytics.SourceSectionName;
import com.forsale.app.utils.analytics.propertyhome.PropertySectionName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ListingDetailsAnalyticSource.kt */
/* loaded from: classes2.dex */
public abstract class ListingDetailsAnalyticSource implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f25152a;

    /* compiled from: ListingDetailsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class HomePageRecommendedVertical extends ListingDetailsAnalyticSource {
        public static final Parcelable.Creator<HomePageRecommendedVertical> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public static final int f25153g = 8;

        /* renamed from: b  reason: collision with root package name */
        private final Integer f25154b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f25155c;

        /* renamed from: d  reason: collision with root package name */
        private final String f25156d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f25157e;

        /* renamed from: f  reason: collision with root package name */
        private final SourceSectionName f25158f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ListingDetailsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class PARAMS {
            private static final /* synthetic */ a00.a $ENTRIES;
            private static final /* synthetic */ PARAMS[] $VALUES;
            private final String value;
            public static final PARAMS SOURCE_SECTION_ORDER = new PARAMS("SOURCE_SECTION_ORDER", 0, "SourceSectionOrder");
            public static final PARAMS SOURCE_ITEM_ORDER = new PARAMS("SOURCE_ITEM_ORDER", 1, "SourceItemOrder");
            public static final PARAMS RECOMMENDATION_CRITERIA = new PARAMS("RECOMMENDATION_CRITERIA", 2, "RecommendationCriteria");
            public static final PARAMS SOURCE_CAROUSEL_TOTAL_ITEMS = new PARAMS("SOURCE_CAROUSEL_TOTAL_ITEMS", 3, "SourceCarouselTotalItems");
            public static final PARAMS SOURCE_SECTION_NAME = new PARAMS("SOURCE_SECTION_NAME", 4, "SourceSectionName");

            private static final /* synthetic */ PARAMS[] $values() {
                return new PARAMS[]{SOURCE_SECTION_ORDER, SOURCE_ITEM_ORDER, RECOMMENDATION_CRITERIA, SOURCE_CAROUSEL_TOTAL_ITEMS, SOURCE_SECTION_NAME};
            }

            static {
                PARAMS[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private PARAMS(String str, int i11, String str2) {
                this.value = str2;
            }

            public static a00.a<PARAMS> getEntries() {
                return $ENTRIES;
            }

            public static PARAMS valueOf(String str) {
                return (PARAMS) Enum.valueOf(PARAMS.class, str);
            }

            public static PARAMS[] values() {
                return (PARAMS[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: ListingDetailsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<HomePageRecommendedVertical> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final HomePageRecommendedVertical createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                Integer valueOf3;
                SourceSectionName valueOf4;
                o.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = SourceSectionName.valueOf(parcel.readString());
                }
                return new HomePageRecommendedVertical(valueOf, valueOf2, readString, valueOf3, valueOf4);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final HomePageRecommendedVertical[] newArray(int i11) {
                return new HomePageRecommendedVertical[i11];
            }
        }

        public HomePageRecommendedVertical(Integer num, Integer num2, String str, Integer num3, SourceSectionName sourceSectionName) {
            super("Home Page Recommended Vertical", null);
            this.f25154b = num;
            this.f25155c = num2;
            this.f25156d = str;
            this.f25157e = num3;
            this.f25158f = sourceSectionName;
        }

        public final String b() {
            return this.f25156d;
        }

        public final Integer c() {
            return this.f25157e;
        }

        public final Integer d() {
            return this.f25155c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final SourceSectionName e() {
            return this.f25158f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomePageRecommendedVertical)) {
                return false;
            }
            HomePageRecommendedVertical homePageRecommendedVertical = (HomePageRecommendedVertical) obj;
            if (o.d(this.f25154b, homePageRecommendedVertical.f25154b) && o.d(this.f25155c, homePageRecommendedVertical.f25155c) && o.d(this.f25156d, homePageRecommendedVertical.f25156d) && o.d(this.f25157e, homePageRecommendedVertical.f25157e) && this.f25158f == homePageRecommendedVertical.f25158f) {
                return true;
            }
            return false;
        }

        public final Integer f() {
            return this.f25154b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            Integer num = this.f25154b;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = hashCode * 31;
            Integer num2 = this.f25155c;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str = this.f25156d;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Integer num3 = this.f25157e;
            if (num3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num3.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            SourceSectionName sourceSectionName = this.f25158f;
            if (sourceSectionName != null) {
                i11 = sourceSectionName.hashCode();
            }
            return i15 + i11;
        }

        public String toString() {
            Integer num = this.f25154b;
            Integer num2 = this.f25155c;
            String str = this.f25156d;
            Integer num3 = this.f25157e;
            SourceSectionName sourceSectionName = this.f25158f;
            return "HomePageRecommendedVertical(sourceSectionOrder=" + num + ", sourceItemOrder=" + num2 + ", recommendationCriteria=" + str + ", sourceCarouselTotalItems=" + num3 + ", sourceSectionName=" + sourceSectionName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            Integer num = this.f25154b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25155c;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25156d);
            Integer num3 = this.f25157e;
            if (num3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num3.intValue());
            }
            SourceSectionName sourceSectionName = this.f25158f;
            if (sourceSectionName == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(sourceSectionName.name());
        }
    }

    /* compiled from: ListingDetailsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class PropertyHomeAnalytics extends ListingDetailsAnalyticSource {
        public static final Parcelable.Creator<PropertyHomeAnalytics> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public static final int f25159j = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f25160b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f25161c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f25162d;

        /* renamed from: e  reason: collision with root package name */
        private final String f25163e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f25164f;

        /* renamed from: g  reason: collision with root package name */
        private final PropertySectionName f25165g;

        /* renamed from: h  reason: collision with root package name */
        private final List<String> f25166h;

        /* renamed from: i  reason: collision with root package name */
        private final List<String> f25167i;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ListingDetailsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class PARAMS {
            private static final /* synthetic */ a00.a $ENTRIES;
            private static final /* synthetic */ PARAMS[] $VALUES;
            private final String value;
            public static final PARAMS SOURCE_SECTION_ORDER = new PARAMS("SOURCE_SECTION_ORDER", 0, "SourceSectionOrder");
            public static final PARAMS SOURCE_ITEM_ORDER = new PARAMS("SOURCE_ITEM_ORDER", 1, "SourceItemOrder");
            public static final PARAMS RECOMMENDATION_CRITERIA = new PARAMS("RECOMMENDATION_CRITERIA", 2, "RecommendationCriteria");
            public static final PARAMS SOURCE_CAROUSEL_TOTAL_ITEMS = new PARAMS("SOURCE_CAROUSEL_TOTAL_ITEMS", 3, "SourceCarouselTotalItems");
            public static final PARAMS SOURCE_SECTION_NAME = new PARAMS("SOURCE_SECTION_NAME", 4, "SourceSectionName");
            public static final PARAMS SOURCE_FILTER_NAME = new PARAMS("SOURCE_FILTER_NAME", 5, "SourceFilterName");
            public static final PARAMS SOURCE_FILTER_VALUE = new PARAMS("SOURCE_FILTER_VALUE", 6, "SourceFilterValue");

            private static final /* synthetic */ PARAMS[] $values() {
                return new PARAMS[]{SOURCE_SECTION_ORDER, SOURCE_ITEM_ORDER, RECOMMENDATION_CRITERIA, SOURCE_CAROUSEL_TOTAL_ITEMS, SOURCE_SECTION_NAME, SOURCE_FILTER_NAME, SOURCE_FILTER_VALUE};
            }

            static {
                PARAMS[] $values = $values();
                $VALUES = $values;
                $ENTRIES = kotlin.enums.a.a($values);
            }

            private PARAMS(String str, int i11, String str2) {
                this.value = str2;
            }

            public static a00.a<PARAMS> getEntries() {
                return $ENTRIES;
            }

            public static PARAMS valueOf(String str) {
                return (PARAMS) Enum.valueOf(PARAMS.class, str);
            }

            public static PARAMS[] values() {
                return (PARAMS[]) $VALUES.clone();
            }

            public final String getValue() {
                return this.value;
            }
        }

        /* compiled from: ListingDetailsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<PropertyHomeAnalytics> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final PropertyHomeAnalytics createFromParcel(Parcel parcel) {
                Integer valueOf;
                Integer valueOf2;
                Integer valueOf3;
                PropertySectionName valueOf4;
                o.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel.readInt());
                }
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Integer.valueOf(parcel.readInt());
                }
                if (parcel.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = PropertySectionName.valueOf(parcel.readString());
                }
                return new PropertyHomeAnalytics(readString, valueOf, valueOf2, readString2, valueOf3, valueOf4, parcel.createStringArrayList(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final PropertyHomeAnalytics[] newArray(int i11) {
                return new PropertyHomeAnalytics[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PropertyHomeAnalytics(String source, Integer num, Integer num2, String str, Integer num3, PropertySectionName propertySectionName, List<String> list, List<String> list2) {
            super(source, null);
            o.i(source, "source");
            this.f25160b = source;
            this.f25161c = num;
            this.f25162d = num2;
            this.f25163e = str;
            this.f25164f = num3;
            this.f25165g = propertySectionName;
            this.f25166h = list;
            this.f25167i = list2;
        }

        public final String b() {
            return this.f25163e;
        }

        public final Integer c() {
            return this.f25164f;
        }

        public final List<String> d() {
            return this.f25166h;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final List<String> e() {
            return this.f25167i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PropertyHomeAnalytics)) {
                return false;
            }
            PropertyHomeAnalytics propertyHomeAnalytics = (PropertyHomeAnalytics) obj;
            if (o.d(this.f25160b, propertyHomeAnalytics.f25160b) && o.d(this.f25161c, propertyHomeAnalytics.f25161c) && o.d(this.f25162d, propertyHomeAnalytics.f25162d) && o.d(this.f25163e, propertyHomeAnalytics.f25163e) && o.d(this.f25164f, propertyHomeAnalytics.f25164f) && this.f25165g == propertyHomeAnalytics.f25165g && o.d(this.f25166h, propertyHomeAnalytics.f25166h) && o.d(this.f25167i, propertyHomeAnalytics.f25167i)) {
                return true;
            }
            return false;
        }

        public final Integer f() {
            return this.f25162d;
        }

        public final PropertySectionName g() {
            return this.f25165g;
        }

        public final Integer h() {
            return this.f25161c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7 = this.f25160b.hashCode() * 31;
            Integer num = this.f25161c;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = (hashCode7 + hashCode) * 31;
            Integer num2 = this.f25162d;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str = this.f25163e;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Integer num3 = this.f25164f;
            if (num3 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = num3.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            PropertySectionName propertySectionName = this.f25165g;
            if (propertySectionName == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = propertySectionName.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            List<String> list = this.f25166h;
            if (list == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = list.hashCode();
            }
            int i17 = (i16 + hashCode6) * 31;
            List<String> list2 = this.f25167i;
            if (list2 != null) {
                i11 = list2.hashCode();
            }
            return i17 + i11;
        }

        public String toString() {
            String str = this.f25160b;
            Integer num = this.f25161c;
            Integer num2 = this.f25162d;
            String str2 = this.f25163e;
            Integer num3 = this.f25164f;
            PropertySectionName propertySectionName = this.f25165g;
            List<String> list = this.f25166h;
            List<String> list2 = this.f25167i;
            return "PropertyHomeAnalytics(source=" + str + ", sourceSectionOrder=" + num + ", sourceItemOrder=" + num2 + ", recommendationCriteria=" + str2 + ", sourceCarouselTotalItems=" + num3 + ", sourceSectionName=" + propertySectionName + ", sourceFilterName=" + list + ", sourceFilterValue=" + list2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f25160b);
            Integer num = this.f25161c;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25162d;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25163e);
            Integer num3 = this.f25164f;
            if (num3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num3.intValue());
            }
            PropertySectionName propertySectionName = this.f25165g;
            if (propertySectionName == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(propertySectionName.name());
            }
            out.writeStringList(this.f25166h);
            out.writeStringList(this.f25167i);
        }
    }

    /* compiled from: ListingDetailsAnalyticSource.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalCarouselAnalytics extends ListingDetailsAnalyticSource {
        public static final Parcelable.Creator<VerticalCarouselAnalytics> CREATOR = new a();

        /* renamed from: f  reason: collision with root package name */
        public static final int f25168f = 8;

        /* renamed from: b  reason: collision with root package name */
        private final int f25169b;

        /* renamed from: c  reason: collision with root package name */
        private final int f25170c;

        /* renamed from: d  reason: collision with root package name */
        private final String f25171d;

        /* renamed from: e  reason: collision with root package name */
        private final int f25172e;

        /* compiled from: ListingDetailsAnalyticSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<VerticalCarouselAnalytics> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final VerticalCarouselAnalytics createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new VerticalCarouselAnalytics(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final VerticalCarouselAnalytics[] newArray(int i11) {
                return new VerticalCarouselAnalytics[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VerticalCarouselAnalytics(int i11, int i12, String SourceSectionName, int i13) {
            super("Vertical Page", null);
            o.i(SourceSectionName, "SourceSectionName");
            this.f25169b = i11;
            this.f25170c = i12;
            this.f25171d = SourceSectionName;
            this.f25172e = i13;
        }

        public final int b() {
            return this.f25169b;
        }

        public final int c() {
            return this.f25170c;
        }

        public final String d() {
            return this.f25171d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int e() {
            return this.f25172e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalCarouselAnalytics)) {
                return false;
            }
            VerticalCarouselAnalytics verticalCarouselAnalytics = (VerticalCarouselAnalytics) obj;
            if (this.f25169b == verticalCarouselAnalytics.f25169b && this.f25170c == verticalCarouselAnalytics.f25170c && o.d(this.f25171d, verticalCarouselAnalytics.f25171d) && this.f25172e == verticalCarouselAnalytics.f25172e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f25169b) * 31) + Integer.hashCode(this.f25170c)) * 31) + this.f25171d.hashCode()) * 31) + Integer.hashCode(this.f25172e);
        }

        public String toString() {
            int i11 = this.f25169b;
            int i12 = this.f25170c;
            String str = this.f25171d;
            int i13 = this.f25172e;
            return "VerticalCarouselAnalytics(SourceCarouselTotalItems=" + i11 + ", SourceItemOrder=" + i12 + ", SourceSectionName=" + str + ", SourceSectionOrder=" + i13 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeInt(this.f25169b);
            out.writeInt(this.f25170c);
            out.writeString(this.f25171d);
            out.writeInt(this.f25172e);
        }
    }

    public /* synthetic */ ListingDetailsAnalyticSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f25152a;
    }

    private ListingDetailsAnalyticSource(String str) {
        this.f25152a = str;
    }
}

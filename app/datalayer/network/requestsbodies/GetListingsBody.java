package com.forsale.app.datalayer.network.requestsbodies;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.powerpins.ListingsScreenType;
import com.forsale.app.utils.d;
import com.google.android.gms.ads.AdRequest;
import com.leanplum.internal.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import up.c;
/* compiled from: GetListingsBody.kt */
/* loaded from: classes2.dex */
public final class GetListingsBody extends GetListingsBaseBody {
    public static final String SCREEN_TYPE = "screen_type";
    @c("category_id")
    private final Integer categoryId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c("filters")
    private final FiltrationData filtrationData;
    private final String lang;
    private final int page;
    @c("page_size")
    private final int pageSize;
    @c("region_id")
    private final int regionId;
    @c(SCREEN_TYPE)
    private final ListingsScreenType screenType;
    @c("search_string")
    private final String searchString;
    @c("sorting")
    private final String sortingOption;
    @c("thumb_size")
    private final int thumbSize;
    private final String translation;
    @c("user_type")
    private final UserType userType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GetListingsBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: GetListingsBody.kt */
    /* loaded from: classes2.dex */
    public static final class FiltrationData implements Parcelable {
        @c("attribute")
        private final List<Attribute<?>> attribute;
        @c("category")
        private final List<Integer> category;
        @c(Constants.Keys.LOCATION)
        private final List<Integer> location;
        @c("price")
        private final Range price;
        private boolean resetAll;
        @c("sub_category")
        private final List<Integer> subCategory;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<FiltrationData> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: GetListingsBody.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean compare(FiltrationData filtrationData, FiltrationData filtrationData2) {
                boolean z11;
                boolean z12;
                boolean z13;
                boolean z14;
                Range range;
                List<Integer> list;
                List<Integer> list2;
                List<Integer> list3 = null;
                if (filtrationData != null && filtrationData.getCategory() != null) {
                    List<Integer> category = filtrationData.getCategory();
                    if (filtrationData2 != null) {
                        list2 = filtrationData2.getCategory();
                    } else {
                        list2 = null;
                    }
                    z11 = d.b(category, list2);
                } else {
                    z11 = true;
                }
                if (filtrationData != null && filtrationData.getSubCategory() != null) {
                    List<Integer> subCategory = filtrationData.getSubCategory();
                    if (filtrationData2 != null) {
                        list = filtrationData2.getSubCategory();
                    } else {
                        list = null;
                    }
                    z12 = d.b(subCategory, list);
                } else {
                    z12 = true;
                }
                if (filtrationData != null && filtrationData.getPrice() != null) {
                    Range price = filtrationData.getPrice();
                    if (filtrationData2 != null) {
                        range = filtrationData2.getPrice();
                    } else {
                        range = null;
                    }
                    z13 = d.a(price, range);
                } else {
                    z13 = true;
                }
                if (filtrationData != null && filtrationData.getLocation() != null) {
                    List<Integer> location = filtrationData.getLocation();
                    if (filtrationData2 != null) {
                        list3 = filtrationData2.getLocation();
                    }
                    z14 = d.b(location, list3);
                } else {
                    z14 = true;
                }
                if (z11 && z12 && z13 && z14) {
                    return true;
                }
                return false;
            }

            public final boolean equal(FiltrationData filtrationData, FiltrationData filtrationData2) {
                List<Integer> list;
                List<Integer> list2;
                List<Integer> list3;
                List<Integer> list4;
                List<Integer> list5;
                List<Integer> list6;
                Range range;
                Range range2;
                List<Attribute<?>> list7;
                if (o.d(filtrationData, filtrationData2)) {
                    return true;
                }
                List<Attribute<?>> list8 = null;
                if (filtrationData != null) {
                    list = filtrationData.getCategory();
                } else {
                    list = null;
                }
                if (filtrationData2 != null) {
                    list2 = filtrationData2.getCategory();
                } else {
                    list2 = null;
                }
                if (d.b(list, list2)) {
                    if (filtrationData != null) {
                        list3 = filtrationData.getSubCategory();
                    } else {
                        list3 = null;
                    }
                    if (filtrationData2 != null) {
                        list4 = filtrationData2.getSubCategory();
                    } else {
                        list4 = null;
                    }
                    if (d.b(list3, list4)) {
                        if (filtrationData != null) {
                            list5 = filtrationData.getLocation();
                        } else {
                            list5 = null;
                        }
                        if (filtrationData2 != null) {
                            list6 = filtrationData2.getLocation();
                        } else {
                            list6 = null;
                        }
                        if (d.b(list5, list6)) {
                            if (filtrationData != null) {
                                range = filtrationData.getPrice();
                            } else {
                                range = null;
                            }
                            if (filtrationData2 != null) {
                                range2 = filtrationData2.getPrice();
                            } else {
                                range2 = null;
                            }
                            if (d.a(range, range2)) {
                                if (filtrationData != null) {
                                    list7 = filtrationData.getAttribute();
                                } else {
                                    list7 = null;
                                }
                                if (filtrationData2 != null) {
                                    list8 = filtrationData2.getAttribute();
                                }
                                if (d.b(list7, list8)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
        }

        /* compiled from: GetListingsBody.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<FiltrationData> {
            @Override // android.os.Parcelable.Creator
            public final FiltrationData createFromParcel(Parcel parcel) {
                ArrayList arrayList;
                ArrayList arrayList2;
                ArrayList arrayList3;
                o.i(parcel, "parcel");
                if (parcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        arrayList4.add(Integer.valueOf(parcel.readInt()));
                    }
                    arrayList = arrayList4;
                }
                if (parcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList5 = new ArrayList(readInt2);
                    for (int i12 = 0; i12 != readInt2; i12++) {
                        arrayList5.add(Integer.valueOf(parcel.readInt()));
                    }
                    arrayList2 = arrayList5;
                }
                if (parcel.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt3 = parcel.readInt();
                    ArrayList arrayList6 = new ArrayList(readInt3);
                    for (int i13 = 0; i13 != readInt3; i13++) {
                        arrayList6.add(Integer.valueOf(parcel.readInt()));
                    }
                    arrayList3 = arrayList6;
                }
                Range createFromParcel = parcel.readInt() != 0 ? Range.CREATOR.createFromParcel(parcel) : null;
                int readInt4 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt4);
                for (int i14 = 0; i14 != readInt4; i14++) {
                    arrayList7.add(Attribute.CREATOR.createFromParcel(parcel));
                }
                return new FiltrationData(arrayList, arrayList2, arrayList3, createFromParcel, arrayList7);
            }

            @Override // android.os.Parcelable.Creator
            public final FiltrationData[] newArray(int i11) {
                return new FiltrationData[i11];
            }
        }

        /* compiled from: GetListingsBody.kt */
        /* loaded from: classes2.dex */
        public static final class Range implements Parcelable {
            @c("from")
            private final Integer from;
            @c("to")

            /* renamed from: to */
            private final Integer f22342to;
            public static final Parcelable.Creator<Range> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: GetListingsBody.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<Range> {
                @Override // android.os.Parcelable.Creator
                public final Range createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    return new Range(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final Range[] newArray(int i11) {
                    return new Range[i11];
                }
            }

            public Range() {
                this(null, null, 3, null);
            }

            public static /* synthetic */ Range copy$default(Range range, Integer num, Integer num2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    num = range.from;
                }
                if ((i11 & 2) != 0) {
                    num2 = range.f22342to;
                }
                return range.copy(num, num2);
            }

            public final Integer component1() {
                return this.from;
            }

            public final Integer component2() {
                return this.f22342to;
            }

            public final Range copy(Integer num, Integer num2) {
                return new Range(num, num2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Range)) {
                    return false;
                }
                Range range = (Range) obj;
                if (o.d(this.from, range.from) && o.d(this.f22342to, range.f22342to)) {
                    return true;
                }
                return false;
            }

            public final Integer getFrom() {
                return this.from;
            }

            public final Integer getTo() {
                return this.f22342to;
            }

            public int hashCode() {
                int hashCode;
                Integer num = this.from;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = hashCode * 31;
                Integer num2 = this.f22342to;
                if (num2 != null) {
                    i11 = num2.hashCode();
                }
                return i12 + i11;
            }

            public String toString() {
                Integer num = this.from;
                Integer num2 = this.f22342to;
                return "Range(from=" + num + ", to=" + num2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                Integer num = this.from;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                Integer num2 = this.f22342to;
                if (num2 == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }

            public Range(Integer num, Integer num2) {
                this.from = num;
                this.f22342to = num2;
            }

            public /* synthetic */ Range(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2);
            }
        }

        public FiltrationData() {
            this(null, null, null, null, null, 31, null);
        }

        public static /* synthetic */ FiltrationData copy$default(FiltrationData filtrationData, List list, List list2, List list3, Range range, List list4, int i11, Object obj) {
            List<Integer> list5 = list;
            if ((i11 & 1) != 0) {
                list5 = filtrationData.category;
            }
            List<Integer> list6 = list2;
            if ((i11 & 2) != 0) {
                list6 = filtrationData.subCategory;
            }
            List list7 = list6;
            List<Integer> list8 = list3;
            if ((i11 & 4) != 0) {
                list8 = filtrationData.location;
            }
            List list9 = list8;
            if ((i11 & 8) != 0) {
                range = filtrationData.price;
            }
            Range range2 = range;
            List<Attribute<?>> list10 = list4;
            if ((i11 & 16) != 0) {
                list10 = filtrationData.attribute;
            }
            return filtrationData.copy(list5, list7, list9, range2, list10);
        }

        public final FiltrationData addAttribute(Attribute<?> attribute) {
            if (attribute != null) {
                List<Attribute<?>> list = this.attribute;
                o.g(list, "null cannot be cast to non-null type kotlin.collections.MutableList<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute<*>>");
                x.c(list).add(attribute);
            }
            return this;
        }

        public final FiltrationData addSelectedBooleanAttributes(List<? extends Attribute<?>> list) {
            boolean z11;
            List<? extends Attribute<?>> list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                List<Attribute<?>> list3 = this.attribute;
                o.g(list3, "null cannot be cast to non-null type kotlin.collections.MutableList<com.forsale.app.datalayer.network.requestsbodies.GetListingsBody.FiltrationData.Attribute<*>>");
                List c11 = x.c(list3);
                o.f(list);
                c11.addAll(list2);
            }
            return this;
        }

        public final List<Integer> component1() {
            return this.category;
        }

        public final List<Integer> component2() {
            return this.subCategory;
        }

        public final List<Integer> component3() {
            return this.location;
        }

        public final Range component4() {
            return this.price;
        }

        public final List<Attribute<?>> component5() {
            return this.attribute;
        }

        public final FiltrationData copy(List<Integer> list, List<Integer> list2, List<Integer> list3, Range range, List<? extends Attribute<?>> attribute) {
            o.i(attribute, "attribute");
            return new FiltrationData(list, list2, list3, range, attribute);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FiltrationData)) {
                return false;
            }
            FiltrationData filtrationData = (FiltrationData) obj;
            if (o.d(this.category, filtrationData.category) && o.d(this.subCategory, filtrationData.subCategory) && o.d(this.location, filtrationData.location) && o.d(this.price, filtrationData.price) && o.d(this.attribute, filtrationData.attribute)) {
                return true;
            }
            return false;
        }

        public final boolean getAreGAMTargetsEmpty() {
            boolean z11;
            boolean z12;
            List<Integer> list = this.category;
            if (list != null && !list.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                return false;
            }
            List<Integer> list2 = this.subCategory;
            if (list2 != null && !list2.isEmpty()) {
                z12 = false;
            } else {
                z12 = true;
            }
            if (!z12) {
                return false;
            }
            return true;
        }

        public final List<Attribute<?>> getAttribute() {
            return this.attribute;
        }

        public final List<Integer> getCategory() {
            return this.category;
        }

        public final int getCount() {
            int i11;
            int i12;
            int i13;
            int i14;
            List<Integer> list = this.category;
            int i15 = 0;
            boolean z11 = true;
            if (list != null && !list.isEmpty()) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i16 = i11 ^ 1;
            List<Integer> list2 = this.subCategory;
            if (list2 != null && !list2.isEmpty()) {
                i12 = 0;
            } else {
                i12 = 1;
            }
            int i17 = i16 + (i12 ^ 1);
            List<Integer> list3 = this.location;
            if (list3 != null && !list3.isEmpty()) {
                i13 = 0;
            } else {
                i13 = 1;
            }
            int i18 = i17 + (i13 ^ 1);
            if (this.price == null) {
                i14 = 0;
            } else {
                i14 = 1;
            }
            int i19 = i18 + i14;
            List<Attribute<?>> list4 = this.attribute;
            if (list4 != null && !list4.isEmpty()) {
                z11 = false;
            }
            if (!z11) {
                i15 = this.attribute.size();
            }
            return i19 + i15;
        }

        public final List<Integer> getLocation() {
            return this.location;
        }

        public final Range getPrice() {
            return this.price;
        }

        public final boolean getResetAll() {
            return this.resetAll;
        }

        public final List<Integer> getSubCategory() {
            return this.subCategory;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            List<Integer> list = this.category;
            int i11 = 0;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            int i12 = hashCode * 31;
            List<Integer> list2 = this.subCategory;
            if (list2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = list2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            List<Integer> list3 = this.location;
            if (list3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Range range = this.price;
            if (range != null) {
                i11 = range.hashCode();
            }
            return ((i14 + i11) * 31) + this.attribute.hashCode();
        }

        public final void setResetAll(boolean z11) {
            this.resetAll = z11;
        }

        public String toString() {
            List<Integer> list = this.category;
            List<Integer> list2 = this.subCategory;
            List<Integer> list3 = this.location;
            Range range = this.price;
            List<Attribute<?>> list4 = this.attribute;
            return "FiltrationData(category=" + list + ", subCategory=" + list2 + ", location=" + list3 + ", price=" + range + ", attribute=" + list4 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            List<Integer> list = this.category;
            if (list == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list.size());
                for (Integer num : list) {
                    out.writeInt(num.intValue());
                }
            }
            List<Integer> list2 = this.subCategory;
            if (list2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list2.size());
                for (Integer num2 : list2) {
                    out.writeInt(num2.intValue());
                }
            }
            List<Integer> list3 = this.location;
            if (list3 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(list3.size());
                for (Integer num3 : list3) {
                    out.writeInt(num3.intValue());
                }
            }
            Range range = this.price;
            if (range == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                range.writeToParcel(out, i11);
            }
            List<Attribute<?>> list4 = this.attribute;
            out.writeInt(list4.size());
            for (Attribute<?> attribute : list4) {
                attribute.writeToParcel(out, i11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public FiltrationData(List<Integer> list, List<Integer> list2, List<Integer> list3, Range range, List<? extends Attribute<?>> attribute) {
            o.i(attribute, "attribute");
            this.category = list;
            this.subCategory = list2;
            this.location = list3;
            this.price = range;
            this.attribute = attribute;
        }

        /* compiled from: GetListingsBody.kt */
        /* loaded from: classes2.dex */
        public static final class Attribute<V> implements Parcelable {
            @c("from")
            private Integer from;
            @c("attribute_id")

            /* renamed from: id */
            private final int f22340id;
            @c("to")

            /* renamed from: to */
            private Integer f22341to;
            @c("type")
            private final String type;
            @c("value")
            private final V value;
            public static final Parcelable.Creator<Attribute<?>> CREATOR = new Creator();
            public static final int $stable = 8;

            /* compiled from: GetListingsBody.kt */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<Attribute<?>> {
                @Override // android.os.Parcelable.Creator
                public final Attribute<?> createFromParcel(Parcel parcel) {
                    o.i(parcel, "parcel");
                    return new Attribute<>(parcel.readInt(), parcel.readString(), parcel.readValue(Attribute.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Attribute<?>[] newArray(int i11) {
                    return new Attribute[i11];
                }
            }

            public Attribute(int i11, String type, V v11, Integer num, Integer num2) {
                o.i(type, "type");
                this.f22340id = i11;
                this.type = type;
                this.value = v11;
                this.from = num;
                this.f22341to = num2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Attribute copy$default(Attribute attribute, int i11, String str, Object obj, Integer num, Integer num2, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    i11 = attribute.f22340id;
                }
                if ((i12 & 2) != 0) {
                    str = attribute.type;
                }
                String str2 = str;
                V v11 = obj;
                if ((i12 & 4) != 0) {
                    v11 = attribute.value;
                }
                V v12 = v11;
                if ((i12 & 8) != 0) {
                    num = attribute.from;
                }
                Integer num3 = num;
                if ((i12 & 16) != 0) {
                    num2 = attribute.f22341to;
                }
                return attribute.copy(i11, str2, v12, num3, num2);
            }

            public final int component1() {
                return this.f22340id;
            }

            public final String component2() {
                return this.type;
            }

            public final V component3() {
                return this.value;
            }

            public final Integer component4() {
                return this.from;
            }

            public final Integer component5() {
                return this.f22341to;
            }

            public final Attribute<V> copy(int i11, String type, V v11, Integer num, Integer num2) {
                o.i(type, "type");
                return new Attribute<>(i11, type, v11, num, num2);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Attribute)) {
                    return false;
                }
                Attribute attribute = (Attribute) obj;
                if (this.f22340id == attribute.f22340id && o.d(this.type, attribute.type) && o.d(this.value, attribute.value) && o.d(this.from, attribute.from) && o.d(this.f22341to, attribute.f22341to)) {
                    return true;
                }
                return false;
            }

            public final Integer getFrom() {
                return this.from;
            }

            public final int getId() {
                return this.f22340id;
            }

            public final Range getRange() {
                return new Range(this.from, this.f22341to);
            }

            public final Integer getTo() {
                return this.f22341to;
            }

            public final String getType() {
                return this.type;
            }

            public final V getValue() {
                return this.value;
            }

            public int hashCode() {
                int hashCode;
                int hashCode2;
                int hashCode3 = ((Integer.hashCode(this.f22340id) * 31) + this.type.hashCode()) * 31;
                V v11 = this.value;
                int i11 = 0;
                if (v11 == null) {
                    hashCode = 0;
                } else {
                    hashCode = v11.hashCode();
                }
                int i12 = (hashCode3 + hashCode) * 31;
                Integer num = this.from;
                if (num == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = num.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Integer num2 = this.f22341to;
                if (num2 != null) {
                    i11 = num2.hashCode();
                }
                return i13 + i11;
            }

            public final void setFrom(Integer num) {
                this.from = num;
            }

            public final void setTo(Integer num) {
                this.f22341to = num;
            }

            public String toString() {
                int i11 = this.f22340id;
                String str = this.type;
                V v11 = this.value;
                Integer num = this.from;
                Integer num2 = this.f22341to;
                return "Attribute(id=" + i11 + ", type=" + str + ", value=" + v11 + ", from=" + num + ", to=" + num2 + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                o.i(out, "out");
                out.writeInt(this.f22340id);
                out.writeString(this.type);
                out.writeValue(this.value);
                Integer num = this.from;
                if (num == null) {
                    out.writeInt(0);
                } else {
                    out.writeInt(1);
                    out.writeInt(num.intValue());
                }
                Integer num2 = this.f22341to;
                if (num2 == null) {
                    out.writeInt(0);
                    return;
                }
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }

            public /* synthetic */ Attribute(int i11, String str, Object obj, Integer num, Integer num2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(i11, str, (i12 & 4) != 0 ? null : obj, (i12 & 8) != 0 ? null : num, (i12 & 16) != 0 ? null : num2);
            }
        }

        public /* synthetic */ FiltrationData(List list, List list2, List list3, Range range, List list4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : list2, (i11 & 4) != 0 ? null : list3, (i11 & 8) == 0 ? range : null, (i11 & 16) != 0 ? new ArrayList() : list4);
        }

        public static /* synthetic */ void getResetAll$annotations() {
        }
    }

    public /* synthetic */ GetListingsBody(Integer num, List list, int i11, int i12, int i13, String str, String str2, String str3, int i14, ListingsScreenType listingsScreenType, FiltrationData filtrationData, UserType userType, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i15 & 2) != 0 ? null : list, i11, i12, i13, str, str2, str3, i14, (i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : listingsScreenType, (i15 & 1024) != 0 ? null : filtrationData, (i15 & RecyclerView.l.FLAG_MOVED) != 0 ? null : userType, (i15 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetListingsBody copy$default(GetListingsBody getListingsBody, Integer num, List list, int i11, int i12, int i13, String str, String str2, String str3, int i14, ListingsScreenType listingsScreenType, FiltrationData filtrationData, UserType userType, String str4, int i15, Object obj) {
        Integer num2;
        List<Integer> list2;
        int i16;
        int i17;
        int i18;
        String str5;
        String str6;
        String str7;
        int i19;
        ListingsScreenType listingsScreenType2;
        FiltrationData filtrationData2;
        UserType userType2;
        String str8;
        if ((i15 & 1) != 0) {
            num2 = getListingsBody.categoryId;
        } else {
            num2 = num;
        }
        if ((i15 & 2) != 0) {
            list2 = getListingsBody.districtsIds;
        } else {
            list2 = list;
        }
        if ((i15 & 4) != 0) {
            i16 = getListingsBody.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 8) != 0) {
            i17 = getListingsBody.pageSize;
        } else {
            i17 = i12;
        }
        if ((i15 & 16) != 0) {
            i18 = getListingsBody.regionId;
        } else {
            i18 = i13;
        }
        if ((i15 & 32) != 0) {
            str5 = getListingsBody.searchString;
        } else {
            str5 = str;
        }
        if ((i15 & 64) != 0) {
            str6 = getListingsBody.lang;
        } else {
            str6 = str2;
        }
        if ((i15 & 128) != 0) {
            str7 = getListingsBody.translation;
        } else {
            str7 = str3;
        }
        if ((i15 & 256) != 0) {
            i19 = getListingsBody.thumbSize;
        } else {
            i19 = i14;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            listingsScreenType2 = getListingsBody.screenType;
        } else {
            listingsScreenType2 = listingsScreenType;
        }
        if ((i15 & 1024) != 0) {
            filtrationData2 = getListingsBody.filtrationData;
        } else {
            filtrationData2 = filtrationData;
        }
        if ((i15 & RecyclerView.l.FLAG_MOVED) != 0) {
            userType2 = getListingsBody.userType;
        } else {
            userType2 = userType;
        }
        if ((i15 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            str8 = getListingsBody.sortingOption;
        } else {
            str8 = str4;
        }
        return getListingsBody.copy(num2, list2, i16, i17, i18, str5, str6, str7, i19, listingsScreenType2, filtrationData2, userType2, str8);
    }

    public final Integer component1() {
        return this.categoryId;
    }

    public final ListingsScreenType component10() {
        return this.screenType;
    }

    public final FiltrationData component11() {
        return this.filtrationData;
    }

    public final UserType component12() {
        return this.userType;
    }

    public final String component13() {
        return this.sortingOption;
    }

    public final List<Integer> component2() {
        return this.districtsIds;
    }

    public final int component3() {
        return this.page;
    }

    public final int component4() {
        return this.pageSize;
    }

    public final int component5() {
        return this.regionId;
    }

    public final String component6() {
        return this.searchString;
    }

    public final String component7() {
        return this.lang;
    }

    public final String component8() {
        return this.translation;
    }

    public final int component9() {
        return this.thumbSize;
    }

    public final GetListingsBody copy(Integer num, List<Integer> list, int i11, int i12, int i13, String str, String lang, String translation, int i14, ListingsScreenType listingsScreenType, FiltrationData filtrationData, UserType userType, String str2) {
        o.i(lang, "lang");
        o.i(translation, "translation");
        return new GetListingsBody(num, list, i11, i12, i13, str, lang, translation, i14, listingsScreenType, filtrationData, userType, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetListingsBody)) {
            return false;
        }
        GetListingsBody getListingsBody = (GetListingsBody) obj;
        if (o.d(this.categoryId, getListingsBody.categoryId) && o.d(this.districtsIds, getListingsBody.districtsIds) && this.page == getListingsBody.page && this.pageSize == getListingsBody.pageSize && this.regionId == getListingsBody.regionId && o.d(this.searchString, getListingsBody.searchString) && o.d(this.lang, getListingsBody.lang) && o.d(this.translation, getListingsBody.translation) && this.thumbSize == getListingsBody.thumbSize && this.screenType == getListingsBody.screenType && o.d(this.filtrationData, getListingsBody.filtrationData) && this.userType == getListingsBody.userType && o.d(this.sortingOption, getListingsBody.sortingOption)) {
            return true;
        }
        return false;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final FiltrationData getFiltrationData() {
        return this.filtrationData;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public String getLang() {
        return this.lang;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public int getPage() {
        return this.page;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public int getPageSize() {
        return this.pageSize;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public int getRegionId() {
        return this.regionId;
    }

    public final ListingsScreenType getScreenType() {
        return this.screenType;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public String getSearchString() {
        return this.searchString;
    }

    public final String getSortingOption() {
        return this.sortingOption;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public int getThumbSize() {
        return this.thumbSize;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public String getTranslation() {
        return this.translation;
    }

    public final UserType getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        Integer num = this.categoryId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int hashCode7 = (((((((i12 + hashCode2) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.regionId)) * 31;
        String str = this.searchString;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode8 = (((((((hashCode7 + hashCode3) * 31) + this.lang.hashCode()) * 31) + this.translation.hashCode()) * 31) + Integer.hashCode(this.thumbSize)) * 31;
        ListingsScreenType listingsScreenType = this.screenType;
        if (listingsScreenType == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = listingsScreenType.hashCode();
        }
        int i13 = (hashCode8 + hashCode4) * 31;
        FiltrationData filtrationData = this.filtrationData;
        if (filtrationData == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = filtrationData.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        UserType userType = this.userType;
        if (userType == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = userType.hashCode();
        }
        int i15 = (i14 + hashCode6) * 31;
        String str2 = this.sortingOption;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i15 + i11;
    }

    public String toString() {
        Integer num = this.categoryId;
        List<Integer> list = this.districtsIds;
        int i11 = this.page;
        int i12 = this.pageSize;
        int i13 = this.regionId;
        String str = this.searchString;
        String str2 = this.lang;
        String str3 = this.translation;
        int i14 = this.thumbSize;
        ListingsScreenType listingsScreenType = this.screenType;
        FiltrationData filtrationData = this.filtrationData;
        UserType userType = this.userType;
        String str4 = this.sortingOption;
        return "GetListingsBody(categoryId=" + num + ", districtsIds=" + list + ", page=" + i11 + ", pageSize=" + i12 + ", regionId=" + i13 + ", searchString=" + str + ", lang=" + str2 + ", translation=" + str3 + ", thumbSize=" + i14 + ", screenType=" + listingsScreenType + ", filtrationData=" + filtrationData + ", userType=" + userType + ", sortingOption=" + str4 + ")";
    }

    public GetListingsBody(Integer num, List<Integer> list, int i11, int i12, int i13, String str, String lang, String translation, int i14, ListingsScreenType listingsScreenType, FiltrationData filtrationData, UserType userType, String str2) {
        o.i(lang, "lang");
        o.i(translation, "translation");
        this.categoryId = num;
        this.districtsIds = list;
        this.page = i11;
        this.pageSize = i12;
        this.regionId = i13;
        this.searchString = str;
        this.lang = lang;
        this.translation = translation;
        this.thumbSize = i14;
        this.screenType = listingsScreenType;
        this.filtrationData = filtrationData;
        this.userType = userType;
        this.sortingOption = str2;
    }
}

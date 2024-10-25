package com.forsale.app.datalayer.network.requestsbodies;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import up.c;
/* compiled from: AdvancedSearchBody.kt */
/* loaded from: classes2.dex */
public final class AdvancedSearchBody implements Parcelable {
    public static final String CATEGORY_ID = "category_id";
    public static final String EXTRA_ATTRIBUTES = "extra_attrs";
    public static final String GEO_LAT = "geo_lat";
    public static final String GEO_LON = "geo_lon";
    public static final String IMAGE_ONLY = "img_only";
    public static final String NEAR_ME = "near_me";
    public static final String PAGE = "page";
    public static final String PAGE_SIZE = "page_size";
    public static final String PRICE = "price";
    public static final String REGION_ID = "region_id";
    public static final String SAVE_TO_WANTED_ITEMS = "save_to_wanted_items";
    public static final String SEARCH_STRING = "search_string";
    public static final String THUMB_SIZE = "thumb_size";
    public static final String TRANSLATION = "translation";
    public static final String VIDEO_ONLY = "video_only";
    @c("category_id")
    private final Integer categoryId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c(EXTRA_ATTRIBUTES)
    private List<ExtraAttr> extraAttrs;
    @c("filters")
    private final GetListingsBody.FiltrationData filtrationData;
    @c(GEO_LAT)
    private Double geoLat;
    @c(GEO_LON)
    private Double geoLon;
    @c(IMAGE_ONLY)
    private Integer imgOnly;
    @c(NEAR_ME)
    private Integer nearMe;
    @c(PAGE)
    private int page;
    @c("page_size")
    private final int pageSize;
    @c("price")
    private String price;
    @c("region_id")
    private final int regionId;
    @c(SAVE_TO_WANTED_ITEMS)
    private Integer saveToWantedItems;
    @c("search_string")
    private String searchString;
    @c("sorting")
    private final String sortingOption;
    @c("thumb_size")
    private final int thumbSize;
    @c(TRANSLATION)
    private String translation;
    @c(VIDEO_ONLY)
    private Integer videoOnly;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AdvancedSearchBody> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: AdvancedSearchBody.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AdvancedSearchBody.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AdvancedSearchBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedSearchBody createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            o.i(parcel, "parcel");
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
            }
            int readInt2 = parcel.readInt();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt3);
                for (int i12 = 0; i12 != readInt3; i12++) {
                    arrayList3.add(ExtraAttr.CREATOR.createFromParcel(parcel));
                }
                arrayList2 = arrayList3;
            }
            return new AdvancedSearchBody(readString, valueOf, arrayList, readInt2, valueOf2, valueOf3, valueOf4, readString2, arrayList2, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? GetListingsBody.FiltrationData.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedSearchBody[] newArray(int i11) {
            return new AdvancedSearchBody[i11];
        }
    }

    public AdvancedSearchBody(String searchString, Integer num, List<Integer> list, int i11, Integer num2, Integer num3, Integer num4, String str, List<ExtraAttr> list2, int i12, Integer num5, String str2, Double d11, Double d12, int i13, int i14, GetListingsBody.FiltrationData filtrationData, String str3) {
        o.i(searchString, "searchString");
        this.searchString = searchString;
        this.categoryId = num;
        this.districtsIds = list;
        this.regionId = i11;
        this.videoOnly = num2;
        this.imgOnly = num3;
        this.nearMe = num4;
        this.price = str;
        this.extraAttrs = list2;
        this.page = i12;
        this.saveToWantedItems = num5;
        this.translation = str2;
        this.geoLon = d11;
        this.geoLat = d12;
        this.pageSize = i13;
        this.thumbSize = i14;
        this.filtrationData = filtrationData;
        this.sortingOption = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdvancedSearchBody copy$default(AdvancedSearchBody advancedSearchBody, String str, Integer num, List list, int i11, Integer num2, Integer num3, Integer num4, String str2, List list2, int i12, Integer num5, String str3, Double d11, Double d12, int i13, int i14, GetListingsBody.FiltrationData filtrationData, String str4, int i15, Object obj) {
        String str5;
        Integer num6;
        List<Integer> list3;
        int i16;
        Integer num7;
        Integer num8;
        Integer num9;
        String str6;
        List<ExtraAttr> list4;
        int i17;
        Integer num10;
        String str7;
        Double d13;
        Double d14;
        int i18;
        int i19;
        GetListingsBody.FiltrationData filtrationData2;
        String str8;
        if ((i15 & 1) != 0) {
            str5 = advancedSearchBody.searchString;
        } else {
            str5 = str;
        }
        if ((i15 & 2) != 0) {
            num6 = advancedSearchBody.categoryId;
        } else {
            num6 = num;
        }
        if ((i15 & 4) != 0) {
            list3 = advancedSearchBody.districtsIds;
        } else {
            list3 = list;
        }
        if ((i15 & 8) != 0) {
            i16 = advancedSearchBody.regionId;
        } else {
            i16 = i11;
        }
        if ((i15 & 16) != 0) {
            num7 = advancedSearchBody.videoOnly;
        } else {
            num7 = num2;
        }
        if ((i15 & 32) != 0) {
            num8 = advancedSearchBody.imgOnly;
        } else {
            num8 = num3;
        }
        if ((i15 & 64) != 0) {
            num9 = advancedSearchBody.nearMe;
        } else {
            num9 = num4;
        }
        if ((i15 & 128) != 0) {
            str6 = advancedSearchBody.price;
        } else {
            str6 = str2;
        }
        if ((i15 & 256) != 0) {
            list4 = advancedSearchBody.extraAttrs;
        } else {
            list4 = list2;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i17 = advancedSearchBody.page;
        } else {
            i17 = i12;
        }
        if ((i15 & 1024) != 0) {
            num10 = advancedSearchBody.saveToWantedItems;
        } else {
            num10 = num5;
        }
        if ((i15 & RecyclerView.l.FLAG_MOVED) != 0) {
            str7 = advancedSearchBody.translation;
        } else {
            str7 = str3;
        }
        if ((i15 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            d13 = advancedSearchBody.geoLon;
        } else {
            d13 = d11;
        }
        if ((i15 & 8192) != 0) {
            d14 = advancedSearchBody.geoLat;
        } else {
            d14 = d12;
        }
        Double d15 = d14;
        if ((i15 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i18 = advancedSearchBody.pageSize;
        } else {
            i18 = i13;
        }
        int i21 = i18;
        if ((i15 & 32768) != 0) {
            i19 = advancedSearchBody.thumbSize;
        } else {
            i19 = i14;
        }
        int i22 = i19;
        if ((i15 & 65536) != 0) {
            filtrationData2 = advancedSearchBody.filtrationData;
        } else {
            filtrationData2 = filtrationData;
        }
        if ((i15 & 131072) != 0) {
            str8 = advancedSearchBody.sortingOption;
        } else {
            str8 = str4;
        }
        return advancedSearchBody.copy(str5, num6, list3, i16, num7, num8, num9, str6, list4, i17, num10, str7, d13, d15, i21, i22, filtrationData2, str8);
    }

    public final void clearFilterData() {
        this.searchString = "";
        this.videoOnly = 0;
        this.imgOnly = 0;
        this.nearMe = 0;
        this.price = "";
        this.extraAttrs = null;
        this.page = 1;
        this.saveToWantedItems = 0;
        this.translation = "";
        Double valueOf = Double.valueOf((double) Utils.DOUBLE_EPSILON);
        this.geoLon = valueOf;
        this.geoLat = valueOf;
    }

    public final String component1() {
        return this.searchString;
    }

    public final int component10() {
        return this.page;
    }

    public final Integer component11() {
        return this.saveToWantedItems;
    }

    public final String component12() {
        return this.translation;
    }

    public final Double component13() {
        return this.geoLon;
    }

    public final Double component14() {
        return this.geoLat;
    }

    public final int component15() {
        return this.pageSize;
    }

    public final int component16() {
        return this.thumbSize;
    }

    public final GetListingsBody.FiltrationData component17() {
        return this.filtrationData;
    }

    public final String component18() {
        return this.sortingOption;
    }

    public final Integer component2() {
        return this.categoryId;
    }

    public final List<Integer> component3() {
        return this.districtsIds;
    }

    public final int component4() {
        return this.regionId;
    }

    public final Integer component5() {
        return this.videoOnly;
    }

    public final Integer component6() {
        return this.imgOnly;
    }

    public final Integer component7() {
        return this.nearMe;
    }

    public final String component8() {
        return this.price;
    }

    public final List<ExtraAttr> component9() {
        return this.extraAttrs;
    }

    public final AdvancedSearchBody copy(String searchString, Integer num, List<Integer> list, int i11, Integer num2, Integer num3, Integer num4, String str, List<ExtraAttr> list2, int i12, Integer num5, String str2, Double d11, Double d12, int i13, int i14, GetListingsBody.FiltrationData filtrationData, String str3) {
        o.i(searchString, "searchString");
        return new AdvancedSearchBody(searchString, num, list, i11, num2, num3, num4, str, list2, i12, num5, str2, d11, d12, i13, i14, filtrationData, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvancedSearchBody)) {
            return false;
        }
        AdvancedSearchBody advancedSearchBody = (AdvancedSearchBody) obj;
        if (o.d(this.searchString, advancedSearchBody.searchString) && o.d(this.categoryId, advancedSearchBody.categoryId) && o.d(this.districtsIds, advancedSearchBody.districtsIds) && this.regionId == advancedSearchBody.regionId && o.d(this.videoOnly, advancedSearchBody.videoOnly) && o.d(this.imgOnly, advancedSearchBody.imgOnly) && o.d(this.nearMe, advancedSearchBody.nearMe) && o.d(this.price, advancedSearchBody.price) && o.d(this.extraAttrs, advancedSearchBody.extraAttrs) && this.page == advancedSearchBody.page && o.d(this.saveToWantedItems, advancedSearchBody.saveToWantedItems) && o.d(this.translation, advancedSearchBody.translation) && o.d(this.geoLon, advancedSearchBody.geoLon) && o.d(this.geoLat, advancedSearchBody.geoLat) && this.pageSize == advancedSearchBody.pageSize && this.thumbSize == advancedSearchBody.thumbSize && o.d(this.filtrationData, advancedSearchBody.filtrationData) && o.d(this.sortingOption, advancedSearchBody.sortingOption)) {
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

    public final List<ExtraAttr> getExtraAttrs() {
        return this.extraAttrs;
    }

    public final GetListingsBody.FiltrationData getFiltrationData() {
        return this.filtrationData;
    }

    public final Double getGeoLat() {
        return this.geoLat;
    }

    public final Double getGeoLon() {
        return this.geoLon;
    }

    public final Integer getImgOnly() {
        return this.imgOnly;
    }

    public final Integer getNearMe() {
        return this.nearMe;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getPrice() {
        return this.price;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final Integer getSaveToWantedItems() {
        return this.saveToWantedItems;
    }

    public final String getSearchString() {
        return this.searchString;
    }

    public final String getSortingOption() {
        return this.sortingOption;
    }

    public final int getThumbSize() {
        return this.thumbSize;
    }

    public final String getTranslation() {
        return this.translation;
    }

    public final Integer getVideoOnly() {
        return this.videoOnly;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13 = this.searchString.hashCode() * 31;
        Integer num = this.categoryId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode13 + hashCode) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int hashCode14 = (((i12 + hashCode2) * 31) + Integer.hashCode(this.regionId)) * 31;
        Integer num2 = this.videoOnly;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i13 = (hashCode14 + hashCode3) * 31;
        Integer num3 = this.imgOnly;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num4 = this.nearMe;
        if (num4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num4.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str = this.price;
        if (str == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        List<ExtraAttr> list2 = this.extraAttrs;
        if (list2 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list2.hashCode();
        }
        int hashCode15 = (((i16 + hashCode7) * 31) + Integer.hashCode(this.page)) * 31;
        Integer num5 = this.saveToWantedItems;
        if (num5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num5.hashCode();
        }
        int i17 = (hashCode15 + hashCode8) * 31;
        String str2 = this.translation;
        if (str2 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str2.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        Double d11 = this.geoLon;
        if (d11 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = d11.hashCode();
        }
        int i19 = (i18 + hashCode10) * 31;
        Double d12 = this.geoLat;
        if (d12 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = d12.hashCode();
        }
        int hashCode16 = (((((i19 + hashCode11) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.thumbSize)) * 31;
        GetListingsBody.FiltrationData filtrationData = this.filtrationData;
        if (filtrationData == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = filtrationData.hashCode();
        }
        int i21 = (hashCode16 + hashCode12) * 31;
        String str3 = this.sortingOption;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i21 + i11;
    }

    public final void setExtraAttrs(List<ExtraAttr> list) {
        this.extraAttrs = list;
    }

    public final void setGeoLat(Double d11) {
        this.geoLat = d11;
    }

    public final void setGeoLon(Double d11) {
        this.geoLon = d11;
    }

    public final void setImgOnly(Integer num) {
        this.imgOnly = num;
    }

    public final void setNearMe(Integer num) {
        this.nearMe = num;
    }

    public final void setPage(int i11) {
        this.page = i11;
    }

    public final void setPrice(String str) {
        this.price = str;
    }

    public final void setSaveToWantedItems(Integer num) {
        this.saveToWantedItems = num;
    }

    public final void setSearchString(String str) {
        o.i(str, "<set-?>");
        this.searchString = str;
    }

    public final void setTranslation(String str) {
        this.translation = str;
    }

    public final void setVideoOnly(Integer num) {
        this.videoOnly = num;
    }

    public String toString() {
        String str = this.searchString;
        Integer num = this.categoryId;
        List<Integer> list = this.districtsIds;
        int i11 = this.regionId;
        Integer num2 = this.videoOnly;
        Integer num3 = this.imgOnly;
        Integer num4 = this.nearMe;
        String str2 = this.price;
        List<ExtraAttr> list2 = this.extraAttrs;
        int i12 = this.page;
        Integer num5 = this.saveToWantedItems;
        String str3 = this.translation;
        Double d11 = this.geoLon;
        Double d12 = this.geoLat;
        int i13 = this.pageSize;
        int i14 = this.thumbSize;
        GetListingsBody.FiltrationData filtrationData = this.filtrationData;
        String str4 = this.sortingOption;
        return "AdvancedSearchBody(searchString=" + str + ", categoryId=" + num + ", districtsIds=" + list + ", regionId=" + i11 + ", videoOnly=" + num2 + ", imgOnly=" + num3 + ", nearMe=" + num4 + ", price=" + str2 + ", extraAttrs=" + list2 + ", page=" + i12 + ", saveToWantedItems=" + num5 + ", translation=" + str3 + ", geoLon=" + d11 + ", geoLat=" + d12 + ", pageSize=" + i13 + ", thumbSize=" + i14 + ", filtrationData=" + filtrationData + ", sortingOption=" + str4 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.searchString);
        Integer num = this.categoryId;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<Integer> list = this.districtsIds;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Integer num2 : list) {
                out.writeInt(num2.intValue());
            }
        }
        out.writeInt(this.regionId);
        Integer num3 = this.videoOnly;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        Integer num4 = this.imgOnly;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.nearMe;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        out.writeString(this.price);
        List<ExtraAttr> list2 = this.extraAttrs;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (ExtraAttr extraAttr : list2) {
                extraAttr.writeToParcel(out, i11);
            }
        }
        out.writeInt(this.page);
        Integer num6 = this.saveToWantedItems;
        if (num6 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num6.intValue());
        }
        out.writeString(this.translation);
        Double d11 = this.geoLon;
        if (d11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d11.doubleValue());
        }
        Double d12 = this.geoLat;
        if (d12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d12.doubleValue());
        }
        out.writeInt(this.pageSize);
        out.writeInt(this.thumbSize);
        GetListingsBody.FiltrationData filtrationData = this.filtrationData;
        if (filtrationData == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            filtrationData.writeToParcel(out, i11);
        }
        out.writeString(this.sortingOption);
    }

    public /* synthetic */ AdvancedSearchBody(String str, Integer num, List list, int i11, Integer num2, Integer num3, Integer num4, String str2, List list2, int i12, Integer num5, String str3, Double d11, Double d12, int i13, int i14, GetListingsBody.FiltrationData filtrationData, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : list, i11, num2, num3, num4, str2, (i15 & 256) != 0 ? null : list2, i12, num5, str3, d11, d12, i13, i14, (65536 & i15) != 0 ? null : filtrationData, (i15 & 131072) != 0 ? null : str4);
    }
}

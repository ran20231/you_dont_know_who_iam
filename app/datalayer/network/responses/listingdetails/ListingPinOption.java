package com.forsale.app.datalayer.network.responses.listingdetails;

import com.forsale.app.datalayer.database.CategoryDistrict;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ListingPinOption.kt */
/* loaded from: classes2.dex */
public final class ListingPinOption {
    public static final int $stable = 8;
    private final String app;
    @c("cat_id")
    private final int catId;
    @c(CategoryDistrict.DISTRICT_ID)
    private Integer districtId;
    @c("icon_url")
    private final String iconUrl;
    private final String name;
    private final String placement;
    private final String time;
    @c("time_prefix")
    private final String timePrefix;
    private final ListingPinOptionType type;

    public ListingPinOption(String app, String name, int i11, Integer num, String iconUrl, String str, String time, String timePrefix, ListingPinOptionType type) {
        o.i(app, "app");
        o.i(name, "name");
        o.i(iconUrl, "iconUrl");
        o.i(time, "time");
        o.i(timePrefix, "timePrefix");
        o.i(type, "type");
        this.app = app;
        this.name = name;
        this.catId = i11;
        this.districtId = num;
        this.iconUrl = iconUrl;
        this.placement = str;
        this.time = time;
        this.timePrefix = timePrefix;
        this.type = type;
    }

    public static /* synthetic */ ListingPinOption copy$default(ListingPinOption listingPinOption, String str, String str2, int i11, Integer num, String str3, String str4, String str5, String str6, ListingPinOptionType listingPinOptionType, int i12, Object obj) {
        String str7;
        String str8;
        int i13;
        Integer num2;
        String str9;
        String str10;
        String str11;
        String str12;
        ListingPinOptionType listingPinOptionType2;
        if ((i12 & 1) != 0) {
            str7 = listingPinOption.app;
        } else {
            str7 = str;
        }
        if ((i12 & 2) != 0) {
            str8 = listingPinOption.name;
        } else {
            str8 = str2;
        }
        if ((i12 & 4) != 0) {
            i13 = listingPinOption.catId;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            num2 = listingPinOption.districtId;
        } else {
            num2 = num;
        }
        if ((i12 & 16) != 0) {
            str9 = listingPinOption.iconUrl;
        } else {
            str9 = str3;
        }
        if ((i12 & 32) != 0) {
            str10 = listingPinOption.placement;
        } else {
            str10 = str4;
        }
        if ((i12 & 64) != 0) {
            str11 = listingPinOption.time;
        } else {
            str11 = str5;
        }
        if ((i12 & 128) != 0) {
            str12 = listingPinOption.timePrefix;
        } else {
            str12 = str6;
        }
        if ((i12 & 256) != 0) {
            listingPinOptionType2 = listingPinOption.type;
        } else {
            listingPinOptionType2 = listingPinOptionType;
        }
        return listingPinOption.copy(str7, str8, i13, num2, str9, str10, str11, str12, listingPinOptionType2);
    }

    public final String component1() {
        return this.app;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.catId;
    }

    public final Integer component4() {
        return this.districtId;
    }

    public final String component5() {
        return this.iconUrl;
    }

    public final String component6() {
        return this.placement;
    }

    public final String component7() {
        return this.time;
    }

    public final String component8() {
        return this.timePrefix;
    }

    public final ListingPinOptionType component9() {
        return this.type;
    }

    public final ListingPinOption copy(String app, String name, int i11, Integer num, String iconUrl, String str, String time, String timePrefix, ListingPinOptionType type) {
        o.i(app, "app");
        o.i(name, "name");
        o.i(iconUrl, "iconUrl");
        o.i(time, "time");
        o.i(timePrefix, "timePrefix");
        o.i(type, "type");
        return new ListingPinOption(app, name, i11, num, iconUrl, str, time, timePrefix, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListingPinOption)) {
            return false;
        }
        ListingPinOption listingPinOption = (ListingPinOption) obj;
        if (o.d(this.app, listingPinOption.app) && o.d(this.name, listingPinOption.name) && this.catId == listingPinOption.catId && o.d(this.districtId, listingPinOption.districtId) && o.d(this.iconUrl, listingPinOption.iconUrl) && o.d(this.placement, listingPinOption.placement) && o.d(this.time, listingPinOption.time) && o.d(this.timePrefix, listingPinOption.timePrefix) && this.type == listingPinOption.type) {
            return true;
        }
        return false;
    }

    public final String getApp() {
        return this.app;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final Integer getDistrictId() {
        return this.districtId;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlacement() {
        return this.placement;
    }

    public final String getTime() {
        return this.time;
    }

    public final String getTimePrefix() {
        return this.timePrefix;
    }

    public final ListingPinOptionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.app.hashCode() * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.catId)) * 31;
        Integer num = this.districtId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.iconUrl.hashCode()) * 31;
        String str = this.placement;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((((hashCode3 + i11) * 31) + this.time.hashCode()) * 31) + this.timePrefix.hashCode()) * 31) + this.type.hashCode();
    }

    public final void setDistrictId(Integer num) {
        this.districtId = num;
    }

    public String toString() {
        String str = this.app;
        String str2 = this.name;
        int i11 = this.catId;
        Integer num = this.districtId;
        String str3 = this.iconUrl;
        String str4 = this.placement;
        String str5 = this.time;
        String str6 = this.timePrefix;
        ListingPinOptionType listingPinOptionType = this.type;
        return "ListingPinOption(app=" + str + ", name=" + str2 + ", catId=" + i11 + ", districtId=" + num + ", iconUrl=" + str3 + ", placement=" + str4 + ", time=" + str5 + ", timePrefix=" + str6 + ", type=" + listingPinOptionType + ")";
    }

    public /* synthetic */ ListingPinOption(String str, String str2, int i11, Integer num, String str3, String str4, String str5, String str6, ListingPinOptionType listingPinOptionType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i11, (i12 & 8) != 0 ? null : num, str3, str4, str5, str6, listingPinOptionType);
    }
}

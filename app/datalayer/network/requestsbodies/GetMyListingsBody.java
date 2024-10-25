package com.forsale.app.datalayer.network.requestsbodies;

import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetMyListingsBody.kt */
/* loaded from: classes2.dex */
public final class GetMyListingsBody extends GetListingsBaseBody {
    public static final int $stable = 0;
    @c("date_range")
    private final MyListingsDateRange dateRange;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    private final String lang;
    private final int page;
    @c("page_size")
    private final int pageSize;
    @c("region_id")
    private final int regionId;
    @c("search_string")
    private final String searchString;
    @c("thumb_size")
    private final int thumbSize;
    private final String translation;
    @c("type")
    private final MyListingsType type;

    public /* synthetic */ GetMyListingsBody(String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, MyListingsType myListingsType, MyListingsDateRange myListingsDateRange, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, i13, str2, str3, str4, i14, (i15 & 256) != 0 ? null : myListingsType, (i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : myListingsDateRange);
    }

    public static /* synthetic */ GetMyListingsBody copy$default(GetMyListingsBody getMyListingsBody, String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, MyListingsType myListingsType, MyListingsDateRange myListingsDateRange, int i15, Object obj) {
        String str5;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        String str8;
        int i19;
        MyListingsType myListingsType2;
        MyListingsDateRange myListingsDateRange2;
        if ((i15 & 1) != 0) {
            str5 = getMyListingsBody.deviceId;
        } else {
            str5 = str;
        }
        if ((i15 & 2) != 0) {
            i16 = getMyListingsBody.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 4) != 0) {
            i17 = getMyListingsBody.pageSize;
        } else {
            i17 = i12;
        }
        if ((i15 & 8) != 0) {
            i18 = getMyListingsBody.regionId;
        } else {
            i18 = i13;
        }
        if ((i15 & 16) != 0) {
            str6 = getMyListingsBody.searchString;
        } else {
            str6 = str2;
        }
        if ((i15 & 32) != 0) {
            str7 = getMyListingsBody.lang;
        } else {
            str7 = str3;
        }
        if ((i15 & 64) != 0) {
            str8 = getMyListingsBody.translation;
        } else {
            str8 = str4;
        }
        if ((i15 & 128) != 0) {
            i19 = getMyListingsBody.thumbSize;
        } else {
            i19 = i14;
        }
        if ((i15 & 256) != 0) {
            myListingsType2 = getMyListingsBody.type;
        } else {
            myListingsType2 = myListingsType;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            myListingsDateRange2 = getMyListingsBody.dateRange;
        } else {
            myListingsDateRange2 = myListingsDateRange;
        }
        return getMyListingsBody.copy(str5, i16, i17, i18, str6, str7, str8, i19, myListingsType2, myListingsDateRange2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final MyListingsDateRange component10() {
        return this.dateRange;
    }

    public final int component2() {
        return this.page;
    }

    public final int component3() {
        return this.pageSize;
    }

    public final int component4() {
        return this.regionId;
    }

    public final String component5() {
        return this.searchString;
    }

    public final String component6() {
        return this.lang;
    }

    public final String component7() {
        return this.translation;
    }

    public final int component8() {
        return this.thumbSize;
    }

    public final MyListingsType component9() {
        return this.type;
    }

    public final GetMyListingsBody copy(String deviceId, int i11, int i12, int i13, String searchString, String lang, String translation, int i14, MyListingsType myListingsType, MyListingsDateRange myListingsDateRange) {
        o.i(deviceId, "deviceId");
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        return new GetMyListingsBody(deviceId, i11, i12, i13, searchString, lang, translation, i14, myListingsType, myListingsDateRange);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMyListingsBody)) {
            return false;
        }
        GetMyListingsBody getMyListingsBody = (GetMyListingsBody) obj;
        if (o.d(this.deviceId, getMyListingsBody.deviceId) && this.page == getMyListingsBody.page && this.pageSize == getMyListingsBody.pageSize && this.regionId == getMyListingsBody.regionId && o.d(this.searchString, getMyListingsBody.searchString) && o.d(this.lang, getMyListingsBody.lang) && o.d(this.translation, getMyListingsBody.translation) && this.thumbSize == getMyListingsBody.thumbSize && this.type == getMyListingsBody.type && this.dateRange == getMyListingsBody.dateRange) {
            return true;
        }
        return false;
    }

    public final MyListingsDateRange getDateRange() {
        return this.dateRange;
    }

    public final String getDeviceId() {
        return this.deviceId;
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

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public String getSearchString() {
        return this.searchString;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public int getThumbSize() {
        return this.thumbSize;
    }

    @Override // com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody
    public String getTranslation() {
        return this.translation;
    }

    public final MyListingsType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.deviceId.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.regionId)) * 31) + this.searchString.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.translation.hashCode()) * 31) + Integer.hashCode(this.thumbSize)) * 31;
        MyListingsType myListingsType = this.type;
        int i11 = 0;
        if (myListingsType == null) {
            hashCode = 0;
        } else {
            hashCode = myListingsType.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        MyListingsDateRange myListingsDateRange = this.dateRange;
        if (myListingsDateRange != null) {
            i11 = myListingsDateRange.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.deviceId;
        int i11 = this.page;
        int i12 = this.pageSize;
        int i13 = this.regionId;
        String str2 = this.searchString;
        String str3 = this.lang;
        String str4 = this.translation;
        int i14 = this.thumbSize;
        MyListingsType myListingsType = this.type;
        MyListingsDateRange myListingsDateRange = this.dateRange;
        return "GetMyListingsBody(deviceId=" + str + ", page=" + i11 + ", pageSize=" + i12 + ", regionId=" + i13 + ", searchString=" + str2 + ", lang=" + str3 + ", translation=" + str4 + ", thumbSize=" + i14 + ", type=" + myListingsType + ", dateRange=" + myListingsDateRange + ")";
    }

    public GetMyListingsBody(String deviceId, int i11, int i12, int i13, String searchString, String lang, String translation, int i14, MyListingsType myListingsType, MyListingsDateRange myListingsDateRange) {
        o.i(deviceId, "deviceId");
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        this.deviceId = deviceId;
        this.page = i11;
        this.pageSize = i12;
        this.regionId = i13;
        this.searchString = searchString;
        this.lang = lang;
        this.translation = translation;
        this.thumbSize = i14;
        this.type = myListingsType;
        this.dateRange = myListingsDateRange;
    }
}

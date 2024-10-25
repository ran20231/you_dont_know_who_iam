package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetFavoritesBody.kt */
/* loaded from: classes2.dex */
public final class GetFavoritesBody extends GetListingsBaseBody {
    public static final int $stable = 0;
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

    public GetFavoritesBody(String deviceId, int i11, int i12, int i13, String searchString, String lang, String translation, int i14) {
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
    }

    public static /* synthetic */ GetFavoritesBody copy$default(GetFavoritesBody getFavoritesBody, String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, int i15, Object obj) {
        String str5;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        String str8;
        int i19;
        if ((i15 & 1) != 0) {
            str5 = getFavoritesBody.deviceId;
        } else {
            str5 = str;
        }
        if ((i15 & 2) != 0) {
            i16 = getFavoritesBody.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 4) != 0) {
            i17 = getFavoritesBody.pageSize;
        } else {
            i17 = i12;
        }
        if ((i15 & 8) != 0) {
            i18 = getFavoritesBody.regionId;
        } else {
            i18 = i13;
        }
        if ((i15 & 16) != 0) {
            str6 = getFavoritesBody.searchString;
        } else {
            str6 = str2;
        }
        if ((i15 & 32) != 0) {
            str7 = getFavoritesBody.lang;
        } else {
            str7 = str3;
        }
        if ((i15 & 64) != 0) {
            str8 = getFavoritesBody.translation;
        } else {
            str8 = str4;
        }
        if ((i15 & 128) != 0) {
            i19 = getFavoritesBody.thumbSize;
        } else {
            i19 = i14;
        }
        return getFavoritesBody.copy(str5, i16, i17, i18, str6, str7, str8, i19);
    }

    public final String component1() {
        return this.deviceId;
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

    public final GetFavoritesBody copy(String deviceId, int i11, int i12, int i13, String searchString, String lang, String translation, int i14) {
        o.i(deviceId, "deviceId");
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        return new GetFavoritesBody(deviceId, i11, i12, i13, searchString, lang, translation, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetFavoritesBody)) {
            return false;
        }
        GetFavoritesBody getFavoritesBody = (GetFavoritesBody) obj;
        if (o.d(this.deviceId, getFavoritesBody.deviceId) && this.page == getFavoritesBody.page && this.pageSize == getFavoritesBody.pageSize && this.regionId == getFavoritesBody.regionId && o.d(this.searchString, getFavoritesBody.searchString) && o.d(this.lang, getFavoritesBody.lang) && o.d(this.translation, getFavoritesBody.translation) && this.thumbSize == getFavoritesBody.thumbSize) {
            return true;
        }
        return false;
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

    public int hashCode() {
        return (((((((((((((this.deviceId.hashCode() * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.regionId)) * 31) + this.searchString.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.translation.hashCode()) * 31) + Integer.hashCode(this.thumbSize);
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
        return "GetFavoritesBody(deviceId=" + str + ", page=" + i11 + ", pageSize=" + i12 + ", regionId=" + i13 + ", searchString=" + str2 + ", lang=" + str3 + ", translation=" + str4 + ", thumbSize=" + i14 + ")";
    }
}

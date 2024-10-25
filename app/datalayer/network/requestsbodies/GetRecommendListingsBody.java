package com.forsale.app.datalayer.network.requestsbodies;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetRecommendListingsBody.kt */
/* loaded from: classes2.dex */
public final class GetRecommendListingsBody extends GetListingsBaseBody {
    public static final int $stable = 8;
    @c(GetListingsBaseBody.ADV_ID)
    private final Integer advId;
    @c("category_id")
    private final Integer categoryId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String device_id;
    @c("districts_ids")
    private final List<Integer> districtIds;
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

    public /* synthetic */ GetRecommendListingsBody(Integer num, Integer num2, String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, List list, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? null : num, (i15 & 2) != 0 ? null : num2, str, i11, i12, i13, str2, str3, str4, i14, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRecommendListingsBody copy$default(GetRecommendListingsBody getRecommendListingsBody, Integer num, Integer num2, String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, List list, int i15, Object obj) {
        Integer num3;
        Integer num4;
        String str5;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        String str8;
        int i19;
        List<Integer> list2;
        if ((i15 & 1) != 0) {
            num3 = getRecommendListingsBody.advId;
        } else {
            num3 = num;
        }
        if ((i15 & 2) != 0) {
            num4 = getRecommendListingsBody.categoryId;
        } else {
            num4 = num2;
        }
        if ((i15 & 4) != 0) {
            str5 = getRecommendListingsBody.device_id;
        } else {
            str5 = str;
        }
        if ((i15 & 8) != 0) {
            i16 = getRecommendListingsBody.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 16) != 0) {
            i17 = getRecommendListingsBody.pageSize;
        } else {
            i17 = i12;
        }
        if ((i15 & 32) != 0) {
            i18 = getRecommendListingsBody.regionId;
        } else {
            i18 = i13;
        }
        if ((i15 & 64) != 0) {
            str6 = getRecommendListingsBody.searchString;
        } else {
            str6 = str2;
        }
        if ((i15 & 128) != 0) {
            str7 = getRecommendListingsBody.lang;
        } else {
            str7 = str3;
        }
        if ((i15 & 256) != 0) {
            str8 = getRecommendListingsBody.translation;
        } else {
            str8 = str4;
        }
        if ((i15 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            i19 = getRecommendListingsBody.thumbSize;
        } else {
            i19 = i14;
        }
        if ((i15 & 1024) != 0) {
            list2 = getRecommendListingsBody.districtIds;
        } else {
            list2 = list;
        }
        return getRecommendListingsBody.copy(num3, num4, str5, i16, i17, i18, str6, str7, str8, i19, list2);
    }

    public final Integer component1() {
        return this.advId;
    }

    public final int component10() {
        return this.thumbSize;
    }

    public final List<Integer> component11() {
        return this.districtIds;
    }

    public final Integer component2() {
        return this.categoryId;
    }

    public final String component3() {
        return this.device_id;
    }

    public final int component4() {
        return this.page;
    }

    public final int component5() {
        return this.pageSize;
    }

    public final int component6() {
        return this.regionId;
    }

    public final String component7() {
        return this.searchString;
    }

    public final String component8() {
        return this.lang;
    }

    public final String component9() {
        return this.translation;
    }

    public final GetRecommendListingsBody copy(Integer num, Integer num2, String str, int i11, int i12, int i13, String searchString, String lang, String translation, int i14, List<Integer> list) {
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        return new GetRecommendListingsBody(num, num2, str, i11, i12, i13, searchString, lang, translation, i14, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetRecommendListingsBody)) {
            return false;
        }
        GetRecommendListingsBody getRecommendListingsBody = (GetRecommendListingsBody) obj;
        if (o.d(this.advId, getRecommendListingsBody.advId) && o.d(this.categoryId, getRecommendListingsBody.categoryId) && o.d(this.device_id, getRecommendListingsBody.device_id) && this.page == getRecommendListingsBody.page && this.pageSize == getRecommendListingsBody.pageSize && this.regionId == getRecommendListingsBody.regionId && o.d(this.searchString, getRecommendListingsBody.searchString) && o.d(this.lang, getRecommendListingsBody.lang) && o.d(this.translation, getRecommendListingsBody.translation) && this.thumbSize == getRecommendListingsBody.thumbSize && o.d(this.districtIds, getRecommendListingsBody.districtIds)) {
            return true;
        }
        return false;
    }

    public final Integer getAdvId() {
        return this.advId;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getDevice_id() {
        return this.device_id;
    }

    public final List<Integer> getDistrictIds() {
        return this.districtIds;
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
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.advId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.categoryId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.device_id;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode4 = (((((((((((((((i13 + hashCode3) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.regionId)) * 31) + this.searchString.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.translation.hashCode()) * 31) + Integer.hashCode(this.thumbSize)) * 31;
        List<Integer> list = this.districtIds;
        if (list != null) {
            i11 = list.hashCode();
        }
        return hashCode4 + i11;
    }

    public String toString() {
        Integer num = this.advId;
        Integer num2 = this.categoryId;
        String str = this.device_id;
        int i11 = this.page;
        int i12 = this.pageSize;
        int i13 = this.regionId;
        String str2 = this.searchString;
        String str3 = this.lang;
        String str4 = this.translation;
        int i14 = this.thumbSize;
        List<Integer> list = this.districtIds;
        return "GetRecommendListingsBody(advId=" + num + ", categoryId=" + num2 + ", device_id=" + str + ", page=" + i11 + ", pageSize=" + i12 + ", regionId=" + i13 + ", searchString=" + str2 + ", lang=" + str3 + ", translation=" + str4 + ", thumbSize=" + i14 + ", districtIds=" + list + ")";
    }

    public GetRecommendListingsBody(Integer num, Integer num2, String str, int i11, int i12, int i13, String searchString, String lang, String translation, int i14, List<Integer> list) {
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        this.advId = num;
        this.categoryId = num2;
        this.device_id = str;
        this.page = i11;
        this.pageSize = i12;
        this.regionId = i13;
        this.searchString = searchString;
        this.lang = lang;
        this.translation = translation;
        this.thumbSize = i14;
        this.districtIds = list;
    }
}

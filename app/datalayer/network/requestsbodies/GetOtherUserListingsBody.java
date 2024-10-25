package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetOtherUserListingsBody.kt */
/* loaded from: classes2.dex */
public final class GetOtherUserListingsBody extends GetListingsBaseBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final Integer adv_id;
    private final String lang;
    private final int page;
    @c("page_size")
    private final int pageSize;
    private final String phone;
    @c("region_id")
    private final int regionId;
    @c("search_string")
    private final String searchString;
    @c("thumb_size")
    private final int thumbSize;
    private final String translation;

    public GetOtherUserListingsBody(Integer num, String str, int i11, int i12, int i13, String searchString, String lang, String translation, int i14) {
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        this.adv_id = num;
        this.phone = str;
        this.page = i11;
        this.pageSize = i12;
        this.regionId = i13;
        this.searchString = searchString;
        this.lang = lang;
        this.translation = translation;
        this.thumbSize = i14;
    }

    public static /* synthetic */ GetOtherUserListingsBody copy$default(GetOtherUserListingsBody getOtherUserListingsBody, Integer num, String str, int i11, int i12, int i13, String str2, String str3, String str4, int i14, int i15, Object obj) {
        Integer num2;
        String str5;
        int i16;
        int i17;
        int i18;
        String str6;
        String str7;
        String str8;
        int i19;
        if ((i15 & 1) != 0) {
            num2 = getOtherUserListingsBody.adv_id;
        } else {
            num2 = num;
        }
        if ((i15 & 2) != 0) {
            str5 = getOtherUserListingsBody.phone;
        } else {
            str5 = str;
        }
        if ((i15 & 4) != 0) {
            i16 = getOtherUserListingsBody.page;
        } else {
            i16 = i11;
        }
        if ((i15 & 8) != 0) {
            i17 = getOtherUserListingsBody.pageSize;
        } else {
            i17 = i12;
        }
        if ((i15 & 16) != 0) {
            i18 = getOtherUserListingsBody.regionId;
        } else {
            i18 = i13;
        }
        if ((i15 & 32) != 0) {
            str6 = getOtherUserListingsBody.searchString;
        } else {
            str6 = str2;
        }
        if ((i15 & 64) != 0) {
            str7 = getOtherUserListingsBody.lang;
        } else {
            str7 = str3;
        }
        if ((i15 & 128) != 0) {
            str8 = getOtherUserListingsBody.translation;
        } else {
            str8 = str4;
        }
        if ((i15 & 256) != 0) {
            i19 = getOtherUserListingsBody.thumbSize;
        } else {
            i19 = i14;
        }
        return getOtherUserListingsBody.copy(num2, str5, i16, i17, i18, str6, str7, str8, i19);
    }

    public final Integer component1() {
        return this.adv_id;
    }

    public final String component2() {
        return this.phone;
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

    public final GetOtherUserListingsBody copy(Integer num, String str, int i11, int i12, int i13, String searchString, String lang, String translation, int i14) {
        o.i(searchString, "searchString");
        o.i(lang, "lang");
        o.i(translation, "translation");
        return new GetOtherUserListingsBody(num, str, i11, i12, i13, searchString, lang, translation, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetOtherUserListingsBody)) {
            return false;
        }
        GetOtherUserListingsBody getOtherUserListingsBody = (GetOtherUserListingsBody) obj;
        if (o.d(this.adv_id, getOtherUserListingsBody.adv_id) && o.d(this.phone, getOtherUserListingsBody.phone) && this.page == getOtherUserListingsBody.page && this.pageSize == getOtherUserListingsBody.pageSize && this.regionId == getOtherUserListingsBody.regionId && o.d(this.searchString, getOtherUserListingsBody.searchString) && o.d(this.lang, getOtherUserListingsBody.lang) && o.d(this.translation, getOtherUserListingsBody.translation) && this.thumbSize == getOtherUserListingsBody.thumbSize) {
            return true;
        }
        return false;
    }

    public final Integer getAdv_id() {
        return this.adv_id;
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

    public final String getPhone() {
        return this.phone;
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
        Integer num = this.adv_id;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        String str = this.phone;
        if (str != null) {
            i11 = str.hashCode();
        }
        return ((((((((((((((i12 + i11) * 31) + Integer.hashCode(this.page)) * 31) + Integer.hashCode(this.pageSize)) * 31) + Integer.hashCode(this.regionId)) * 31) + this.searchString.hashCode()) * 31) + this.lang.hashCode()) * 31) + this.translation.hashCode()) * 31) + Integer.hashCode(this.thumbSize);
    }

    public String toString() {
        Integer num = this.adv_id;
        String str = this.phone;
        int i11 = this.page;
        int i12 = this.pageSize;
        int i13 = this.regionId;
        String str2 = this.searchString;
        String str3 = this.lang;
        String str4 = this.translation;
        int i14 = this.thumbSize;
        return "GetOtherUserListingsBody(adv_id=" + num + ", phone=" + str + ", page=" + i11 + ", pageSize=" + i12 + ", regionId=" + i13 + ", searchString=" + str2 + ", lang=" + str3 + ", translation=" + str4 + ", thumbSize=" + i14 + ")";
    }
}

package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.datalayer.network.entities.PostListingIntention;
import com.forsale.app.utils.Languages;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetAddonsRequestBody.kt */
/* loaded from: classes2.dex */
public final class GetAddonsRequestBody {
    public static final int $stable = 8;
    @c(GetListingsBaseBody.ADV_ID)
    private final Integer advId;
    @c("category_id")
    private final int categoryId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c("intention")
    private final PostListingIntention intention;
    @c("lang")
    private final Languages language;
    @c("plan_id")
    private Integer planId;
    @c("region_id")
    private final int regionId;

    public GetAddonsRequestBody(Integer num, int i11, List<Integer> list, String deviceId, int i12, Languages language, PostListingIntention postListingIntention, Integer num2) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        this.advId = num;
        this.categoryId = i11;
        this.districtsIds = list;
        this.deviceId = deviceId;
        this.regionId = i12;
        this.language = language;
        this.intention = postListingIntention;
        this.planId = num2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetAddonsRequestBody copy$default(GetAddonsRequestBody getAddonsRequestBody, Integer num, int i11, List list, String str, int i12, Languages languages, PostListingIntention postListingIntention, Integer num2, int i13, Object obj) {
        Integer num3;
        int i14;
        List<Integer> list2;
        String str2;
        int i15;
        Languages languages2;
        PostListingIntention postListingIntention2;
        Integer num4;
        if ((i13 & 1) != 0) {
            num3 = getAddonsRequestBody.advId;
        } else {
            num3 = num;
        }
        if ((i13 & 2) != 0) {
            i14 = getAddonsRequestBody.categoryId;
        } else {
            i14 = i11;
        }
        if ((i13 & 4) != 0) {
            list2 = getAddonsRequestBody.districtsIds;
        } else {
            list2 = list;
        }
        if ((i13 & 8) != 0) {
            str2 = getAddonsRequestBody.deviceId;
        } else {
            str2 = str;
        }
        if ((i13 & 16) != 0) {
            i15 = getAddonsRequestBody.regionId;
        } else {
            i15 = i12;
        }
        if ((i13 & 32) != 0) {
            languages2 = getAddonsRequestBody.language;
        } else {
            languages2 = languages;
        }
        if ((i13 & 64) != 0) {
            postListingIntention2 = getAddonsRequestBody.intention;
        } else {
            postListingIntention2 = postListingIntention;
        }
        if ((i13 & 128) != 0) {
            num4 = getAddonsRequestBody.planId;
        } else {
            num4 = num2;
        }
        return getAddonsRequestBody.copy(num3, i14, list2, str2, i15, languages2, postListingIntention2, num4);
    }

    public final Integer component1() {
        return this.advId;
    }

    public final int component2() {
        return this.categoryId;
    }

    public final List<Integer> component3() {
        return this.districtsIds;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final int component5() {
        return this.regionId;
    }

    public final Languages component6() {
        return this.language;
    }

    public final PostListingIntention component7() {
        return this.intention;
    }

    public final Integer component8() {
        return this.planId;
    }

    public final GetAddonsRequestBody copy(Integer num, int i11, List<Integer> list, String deviceId, int i12, Languages language, PostListingIntention postListingIntention, Integer num2) {
        o.i(deviceId, "deviceId");
        o.i(language, "language");
        return new GetAddonsRequestBody(num, i11, list, deviceId, i12, language, postListingIntention, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetAddonsRequestBody)) {
            return false;
        }
        GetAddonsRequestBody getAddonsRequestBody = (GetAddonsRequestBody) obj;
        if (o.d(this.advId, getAddonsRequestBody.advId) && this.categoryId == getAddonsRequestBody.categoryId && o.d(this.districtsIds, getAddonsRequestBody.districtsIds) && o.d(this.deviceId, getAddonsRequestBody.deviceId) && this.regionId == getAddonsRequestBody.regionId && this.language == getAddonsRequestBody.language && this.intention == getAddonsRequestBody.intention && o.d(this.planId, getAddonsRequestBody.planId)) {
            return true;
        }
        return false;
    }

    public final Integer getAdvId() {
        return this.advId;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final PostListingIntention getIntention() {
        return this.intention;
    }

    public final Languages getLanguage() {
        return this.language;
    }

    public final Integer getPlanId() {
        return this.planId;
    }

    public final int getRegionId() {
        return this.regionId;
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
        int hashCode4 = ((hashCode * 31) + Integer.hashCode(this.categoryId)) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int hashCode5 = (((((((hashCode4 + hashCode2) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + this.language.hashCode()) * 31;
        PostListingIntention postListingIntention = this.intention;
        if (postListingIntention == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = postListingIntention.hashCode();
        }
        int i12 = (hashCode5 + hashCode3) * 31;
        Integer num2 = this.planId;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i12 + i11;
    }

    public final void setPlanId(Integer num) {
        this.planId = num;
    }

    public String toString() {
        Integer num = this.advId;
        int i11 = this.categoryId;
        List<Integer> list = this.districtsIds;
        String str = this.deviceId;
        int i12 = this.regionId;
        Languages languages = this.language;
        PostListingIntention postListingIntention = this.intention;
        Integer num2 = this.planId;
        return "GetAddonsRequestBody(advId=" + num + ", categoryId=" + i11 + ", districtsIds=" + list + ", deviceId=" + str + ", regionId=" + i12 + ", language=" + languages + ", intention=" + postListingIntention + ", planId=" + num2 + ")";
    }

    public /* synthetic */ GetAddonsRequestBody(Integer num, int i11, List list, String str, int i12, Languages languages, PostListingIntention postListingIntention, Integer num2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, i11, (i13 & 4) != 0 ? null : list, str, i12, (i13 & 32) != 0 ? Languages.Companion.b() : languages, (i13 & 64) != 0 ? null : postListingIntention, (i13 & 128) != 0 ? null : num2);
    }
}

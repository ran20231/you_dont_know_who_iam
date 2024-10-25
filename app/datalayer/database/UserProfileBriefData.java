package com.forsale.app.datalayer.database;

import kotlin.jvm.internal.o;
/* compiled from: UserProfileBriefData.kt */
/* loaded from: classes2.dex */
public final class UserProfileBriefData {
    public static final int $stable = 0;
    private final Integer adId;
    private final String imgUrl;
    private final String name;
    private final String phone;

    public UserProfileBriefData(String str, Integer num, String str2, String str3) {
        this.phone = str;
        this.adId = num;
        this.name = str2;
        this.imgUrl = str3;
    }

    public static /* synthetic */ UserProfileBriefData copy$default(UserProfileBriefData userProfileBriefData, String str, Integer num, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userProfileBriefData.phone;
        }
        if ((i11 & 2) != 0) {
            num = userProfileBriefData.adId;
        }
        if ((i11 & 4) != 0) {
            str2 = userProfileBriefData.name;
        }
        if ((i11 & 8) != 0) {
            str3 = userProfileBriefData.imgUrl;
        }
        return userProfileBriefData.copy(str, num, str2, str3);
    }

    public final String component1() {
        return this.phone;
    }

    public final Integer component2() {
        return this.adId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.imgUrl;
    }

    public final UserProfileBriefData copy(String str, Integer num, String str2, String str3) {
        return new UserProfileBriefData(str, num, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileBriefData)) {
            return false;
        }
        UserProfileBriefData userProfileBriefData = (UserProfileBriefData) obj;
        if (o.d(this.phone, userProfileBriefData.phone) && o.d(this.adId, userProfileBriefData.adId) && o.d(this.name, userProfileBriefData.name) && o.d(this.imgUrl, userProfileBriefData.imgUrl)) {
            return true;
        }
        return false;
    }

    public final Integer getAdId() {
        return this.adId;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.phone;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num = this.adId;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.name;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str3 = this.imgUrl;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        String str = this.phone;
        Integer num = this.adId;
        String str2 = this.name;
        String str3 = this.imgUrl;
        return "UserProfileBriefData(phone=" + str + ", adId=" + num + ", name=" + str2 + ", imgUrl=" + str3 + ")";
    }
}

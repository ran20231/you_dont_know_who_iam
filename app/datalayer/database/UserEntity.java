package com.forsale.app.datalayer.database;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.utils.Languages;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2;
import up.c;
/* compiled from: UserEntity.kt */
/* loaded from: classes2.dex */
public final class UserEntity {
    private static final String PERMISSION_BUNDLE_ENABLED = "bundle_enabled";
    @c("allow_follow")
    private final Integer allowFollow;
    @c("email")
    private final String email;
    @c("first_name")
    private final String firstName;
    @c("free_ads")
    private final Float freeAds;

    /* renamed from: id  reason: collision with root package name */
    private final int f22328id;
    @c("image")
    private final String image;
    @c("is_block")
    private final Integer isBlock;
    @c("is_email_verified")
    private final Integer isEmailVerified;
    @c("is_fresh")
    private final Integer isFresh;
    @c("language")
    private final Languages language;
    @c("member_since")
    private final String memberSince;
    @c("number_of_followers")
    private final Integer numberOfFollowers;
    @c("number_of_following")
    private final Integer numberOfFollowing;
    @c("phone")
    private final String phone;
    @c("premium_ads")
    private final Float premiumAds;
    @c("region_id")
    private final Integer regionId;
    @c(falcon.chat.entities.UserEntityKt.USER_ID)
    private final Integer userId;
    @c("user_type")
    private final UserType userType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UserEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: UserEntity.kt */
    /* loaded from: classes2.dex */
    public static final class UserType {
        public static final int $stable = 8;
        @c("permissions")
        private final List<String> permissions;

        public UserType(List<String> list) {
            this.permissions = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UserType copy$default(UserType userType, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = userType.permissions;
            }
            return userType.copy(list);
        }

        public final List<String> component1() {
            return this.permissions;
        }

        public final UserType copy(List<String> list) {
            return new UserType(list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof UserType) && o.d(this.permissions, ((UserType) obj).permissions)) {
                return true;
            }
            return false;
        }

        public final List<String> getPermissions() {
            return this.permissions;
        }

        public int hashCode() {
            List<String> list = this.permissions;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public String toString() {
            List<String> list = this.permissions;
            return "UserType(permissions=" + list + ")";
        }
    }

    public UserEntity() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }

    public static /* synthetic */ UserEntity copy$default(UserEntity userEntity, int i11, Integer num, Integer num2, String str, String str2, Float f11, Float f12, String str3, Integer num3, Integer num4, Integer num5, String str4, Languages languages, String str5, Integer num6, Integer num7, Integer num8, UserType userType, int i12, Object obj) {
        int i13;
        Integer num9;
        Integer num10;
        String str6;
        String str7;
        Float f13;
        Float f14;
        String str8;
        Integer num11;
        Integer num12;
        Integer num13;
        String str9;
        Languages languages2;
        String str10;
        Integer num14;
        Integer num15;
        Integer num16;
        UserType userType2;
        if ((i12 & 1) != 0) {
            i13 = userEntity.f22328id;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            num9 = userEntity.userId;
        } else {
            num9 = num;
        }
        if ((i12 & 4) != 0) {
            num10 = userEntity.allowFollow;
        } else {
            num10 = num2;
        }
        if ((i12 & 8) != 0) {
            str6 = userEntity.email;
        } else {
            str6 = str;
        }
        if ((i12 & 16) != 0) {
            str7 = userEntity.firstName;
        } else {
            str7 = str2;
        }
        if ((i12 & 32) != 0) {
            f13 = userEntity.freeAds;
        } else {
            f13 = f11;
        }
        if ((i12 & 64) != 0) {
            f14 = userEntity.premiumAds;
        } else {
            f14 = f12;
        }
        if ((i12 & 128) != 0) {
            str8 = userEntity.image;
        } else {
            str8 = str3;
        }
        if ((i12 & 256) != 0) {
            num11 = userEntity.isEmailVerified;
        } else {
            num11 = num3;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            num12 = userEntity.numberOfFollowers;
        } else {
            num12 = num4;
        }
        if ((i12 & 1024) != 0) {
            num13 = userEntity.numberOfFollowing;
        } else {
            num13 = num5;
        }
        if ((i12 & RecyclerView.l.FLAG_MOVED) != 0) {
            str9 = userEntity.phone;
        } else {
            str9 = str4;
        }
        if ((i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            languages2 = userEntity.language;
        } else {
            languages2 = languages;
        }
        if ((i12 & 8192) != 0) {
            str10 = userEntity.memberSince;
        } else {
            str10 = str5;
        }
        String str11 = str10;
        if ((i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            num14 = userEntity.regionId;
        } else {
            num14 = num6;
        }
        Integer num17 = num14;
        if ((i12 & 32768) != 0) {
            num15 = userEntity.isFresh;
        } else {
            num15 = num7;
        }
        Integer num18 = num15;
        if ((i12 & 65536) != 0) {
            num16 = userEntity.isBlock;
        } else {
            num16 = num8;
        }
        if ((i12 & 131072) != 0) {
            userType2 = userEntity.userType;
        } else {
            userType2 = userType;
        }
        return userEntity.copy(i13, num9, num10, str6, str7, f13, f14, str8, num11, num12, num13, str9, languages2, str11, num17, num18, num16, userType2);
    }

    private final Boolean hasPermission(String str) {
        List<String> permissions;
        UserType userType = this.userType;
        if (userType != null && (permissions = userType.getPermissions()) != null) {
            return Boolean.valueOf(permissions.contains(str));
        }
        return null;
    }

    public final int component1() {
        return this.f22328id;
    }

    public final Integer component10() {
        return this.numberOfFollowers;
    }

    public final Integer component11() {
        return this.numberOfFollowing;
    }

    public final String component12() {
        return this.phone;
    }

    public final Languages component13() {
        return this.language;
    }

    public final String component14() {
        return this.memberSince;
    }

    public final Integer component15() {
        return this.regionId;
    }

    public final Integer component16() {
        return this.isFresh;
    }

    public final Integer component17() {
        return this.isBlock;
    }

    public final UserType component18() {
        return this.userType;
    }

    public final Integer component2() {
        return this.userId;
    }

    public final Integer component3() {
        return this.allowFollow;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.firstName;
    }

    public final Float component6() {
        return this.freeAds;
    }

    public final Float component7() {
        return this.premiumAds;
    }

    public final String component8() {
        return this.image;
    }

    public final Integer component9() {
        return this.isEmailVerified;
    }

    public final UserEntity copy(int i11, Integer num, Integer num2, String str, String str2, Float f11, Float f12, String str3, Integer num3, Integer num4, Integer num5, String str4, Languages languages, String str5, Integer num6, Integer num7, Integer num8, UserType userType) {
        return new UserEntity(i11, num, num2, str, str2, f11, f12, str3, num3, num4, num5, str4, languages, str5, num6, num7, num8, userType);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) obj;
        if (this.f22328id == userEntity.f22328id && o.d(this.userId, userEntity.userId) && o.d(this.allowFollow, userEntity.allowFollow) && o.d(this.email, userEntity.email) && o.d(this.firstName, userEntity.firstName) && o.d(this.freeAds, userEntity.freeAds) && o.d(this.premiumAds, userEntity.premiumAds) && o.d(this.image, userEntity.image) && o.d(this.isEmailVerified, userEntity.isEmailVerified) && o.d(this.numberOfFollowers, userEntity.numberOfFollowers) && o.d(this.numberOfFollowing, userEntity.numberOfFollowing) && o.d(this.phone, userEntity.phone) && this.language == userEntity.language && o.d(this.memberSince, userEntity.memberSince) && o.d(this.regionId, userEntity.regionId) && o.d(this.isFresh, userEntity.isFresh) && o.d(this.isBlock, userEntity.isBlock) && o.d(this.userType, userEntity.userType)) {
            return true;
        }
        return false;
    }

    public final Integer getAllowFollow() {
        return this.allowFollow;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Float getFreeAds() {
        return this.freeAds;
    }

    public final int getId() {
        return this.f22328id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Languages getLanguage() {
        return this.language;
    }

    public final String getMemberSince() {
        return this.memberSince;
    }

    public final Integer getNumberOfFollowers() {
        return this.numberOfFollowers;
    }

    public final Integer getNumberOfFollowing() {
        return this.numberOfFollowing;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneInternational(String phonePrefix) {
        o.i(phonePrefix, "phonePrefix");
        int length = phonePrefix.length();
        String str = this.phone;
        if (str != null) {
            String substring = str.substring(0, length);
            o.h(substring, "substring(...)");
            String substring2 = str.substring(length, str.length());
            o.h(substring2, "substring(...)");
            String str2 = "+" + substring + substring2;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final Float getPremiumAds() {
        return this.premiumAds;
    }

    public final Integer getRegionId() {
        return this.regionId;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final UserType getUserType() {
        return this.userType;
    }

    public final Boolean hasBundlePermission() {
        return hasPermission(PERMISSION_BUNDLE_ENABLED);
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
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17 = Integer.hashCode(this.f22328id) * 31;
        Integer num = this.userId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode17 + hashCode) * 31;
        Integer num2 = this.allowFollow;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.email;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.firstName;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Float f11 = this.freeAds;
        if (f11 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = f11.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Float f12 = this.premiumAds;
        if (f12 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = f12.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str3 = this.image;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        Integer num3 = this.isEmailVerified;
        if (num3 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num3.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        Integer num4 = this.numberOfFollowers;
        if (num4 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = num4.hashCode();
        }
        int i21 = (i19 + hashCode9) * 31;
        Integer num5 = this.numberOfFollowing;
        if (num5 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = num5.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        String str4 = this.phone;
        if (str4 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str4.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        Languages languages = this.language;
        if (languages == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = languages.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        String str5 = this.memberSince;
        if (str5 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str5.hashCode();
        }
        int i25 = (i24 + hashCode13) * 31;
        Integer num6 = this.regionId;
        if (num6 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = num6.hashCode();
        }
        int i26 = (i25 + hashCode14) * 31;
        Integer num7 = this.isFresh;
        if (num7 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = num7.hashCode();
        }
        int i27 = (i26 + hashCode15) * 31;
        Integer num8 = this.isBlock;
        if (num8 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = num8.hashCode();
        }
        int i28 = (i27 + hashCode16) * 31;
        UserType userType = this.userType;
        if (userType != null) {
            i11 = userType.hashCode();
        }
        return i28 + i11;
    }

    public final Integer isBlock() {
        return this.isBlock;
    }

    public final Integer isEmailVerified() {
        return this.isEmailVerified;
    }

    public final Integer isFresh() {
        return this.isFresh;
    }

    public String toString() {
        int i11 = this.f22328id;
        Integer num = this.userId;
        Integer num2 = this.allowFollow;
        String str = this.email;
        String str2 = this.firstName;
        Float f11 = this.freeAds;
        Float f12 = this.premiumAds;
        String str3 = this.image;
        Integer num3 = this.isEmailVerified;
        Integer num4 = this.numberOfFollowers;
        Integer num5 = this.numberOfFollowing;
        String str4 = this.phone;
        Languages languages = this.language;
        String str5 = this.memberSince;
        Integer num6 = this.regionId;
        Integer num7 = this.isFresh;
        Integer num8 = this.isBlock;
        UserType userType = this.userType;
        return "UserEntity(id=" + i11 + ", userId=" + num + ", allowFollow=" + num2 + ", email=" + str + ", firstName=" + str2 + ", freeAds=" + f11 + ", premiumAds=" + f12 + ", image=" + str3 + ", isEmailVerified=" + num3 + ", numberOfFollowers=" + num4 + ", numberOfFollowing=" + num5 + ", phone=" + str4 + ", language=" + languages + ", memberSince=" + str5 + ", regionId=" + num6 + ", isFresh=" + num7 + ", isBlock=" + num8 + ", userType=" + userType + ")";
    }

    public UserEntity(int i11, Integer num, Integer num2, String str, String str2, Float f11, Float f12, String str3, Integer num3, Integer num4, Integer num5, String str4, Languages languages, String str5, Integer num6, Integer num7, Integer num8, UserType userType) {
        this.f22328id = i11;
        this.userId = num;
        this.allowFollow = num2;
        this.email = str;
        this.firstName = str2;
        this.freeAds = f11;
        this.premiumAds = f12;
        this.image = str3;
        this.isEmailVerified = num3;
        this.numberOfFollowers = num4;
        this.numberOfFollowing = num5;
        this.phone = str4;
        this.language = languages;
        this.memberSince = str5;
        this.regionId = num6;
        this.isFresh = num7;
        this.isBlock = num8;
        this.userType = userType;
    }

    public /* synthetic */ UserEntity(int i11, Integer num, Integer num2, String str, String str2, Float f11, Float f12, String str3, Integer num3, Integer num4, Integer num5, String str4, Languages languages, String str5, Integer num6, Integer num7, Integer num8, UserType userType, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 1 : i11, (i12 & 2) != 0 ? null : num, (i12 & 4) != 0 ? null : num2, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : f11, (i12 & 64) != 0 ? null : f12, (i12 & 128) != 0 ? null : str3, (i12 & 256) != 0 ? null : num3, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : num4, (i12 & 1024) != 0 ? null : num5, (i12 & RecyclerView.l.FLAG_MOVED) != 0 ? null : str4, (i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : languages, (i12 & 8192) != 0 ? null : str5, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : num6, (i12 & 32768) != 0 ? null : num7, (i12 & 65536) != 0 ? null : num8, (i12 & 131072) != 0 ? null : userType);
    }
}

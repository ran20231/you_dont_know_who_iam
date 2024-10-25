package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RegionEntity.kt */
/* loaded from: classes2.dex */
public final class RegionEntity {
    public static final String ADDRESS_AR = "address_ar";
    public static final String ADDRESS_EN = "address_en";
    public static final String ALLOW_GUEST_MESSAGING = "allow_guest_messaging";
    public static final String ALLOW_MESSAGING = "allow_messaging";
    public static final String AMOUNT_PER_REDEMPTION = "amount_per_redemption";
    public static final String CONTACT_DATA = "contact_data";
    public static final String CONTACT_EMAIL = "contact_email";
    public static final String EMAIL_NOT_VERIFIED_MESSAGE_AR = "email_not_verified_message_ar";
    public static final String EMAIL_NOT_VERIFIED_MESSAGE_EN = "email_not_verified_message_en";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String MAIN_DISTRICT_ID = "main_district_id";
    public static final String MIN_POINTS_FOR_REDEMPTION = "min_points_for_redemption";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PHONE_PREFIX = "phone_prefix";
    public static final String POINTS_PER_PAID_AMOUNT = "points_per_paid_amount";
    public static final String POINT_LEVELS = "point_levels";
    public static final String PROFILE_NOT_COMPLETE_MESSAGE_AR = "profile_not_complete_message_ar";
    public static final String PROFILE_NOT_COMPLETE_MESSAGE_EN = "profile_not_complete_message_en";
    public static final String REGIONS_TABLE = "regions";
    public static final String REGION_CODE_AR = "region_code_ar";
    public static final String REGION_CODE_EN = "region_code_en";
    public static final String REGION_ID = "region_id";
    public static final String SUPPORT_MESSAGE_AR = "support_message_ar";
    public static final String SUPPORT_MESSAGE_EN = "support_message_en";
    public static final String UTC_DIFF = "utc_diff";
    @c(ADDRESS_AR)
    private final String addressAr;
    @c(ADDRESS_EN)
    private final String addressEn;
    @c(ALLOW_GUEST_MESSAGING)
    private final int allowGuestMessaging;
    @c(ALLOW_MESSAGING)
    private final int allowMessaging;
    @c(AMOUNT_PER_REDEMPTION)
    private final float amountPerRedemption;
    @c(CONTACT_DATA)
    private final String contactDataString;
    @c(CONTACT_EMAIL)
    private final String contactEmail;
    @c(EMAIL_NOT_VERIFIED_MESSAGE_AR)
    private final String emailNotVerifiedMessageAr;
    @c(EMAIL_NOT_VERIFIED_MESSAGE_EN)
    private final String emailNotVerifiedMessageEn;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22320id;
    @c("is_active")
    private int isActive;
    @c(MAIN_DISTRICT_ID)
    private final Integer mainDistrictId;
    @c(MIN_POINTS_FOR_REDEMPTION)
    private final float minPointsForRedemption;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c(PHONE_PREFIX)
    private final String phonePrefix;
    @c(POINT_LEVELS)
    private final String pointLevelsString;
    @c(POINTS_PER_PAID_AMOUNT)
    private final float pointsPerPaidAmount;
    @c(PROFILE_NOT_COMPLETE_MESSAGE_AR)
    private final String profileNotCompleteMessageAr;
    @c(PROFILE_NOT_COMPLETE_MESSAGE_EN)
    private final String profileNotCompleteMessageEn;
    @c(REGION_CODE_AR)
    private final String regionCodeAr;
    @c(REGION_CODE_EN)
    private final String regionCodeEn;
    @c(SUPPORT_MESSAGE_AR)
    private final String supportMessageAr;
    @c(SUPPORT_MESSAGE_EN)
    private final String supportMessageEn;
    @c(UTC_DIFF)
    private final String utcDiff;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RegionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RegionEntity createDefaultRegion() {
            return new RegionEntity(1, 1, "Kuwait", "الكويت", "KWD", "د.ك", "965", "Asia/Kuwait", 1, 0, "", "info@q84sale.com", null, null, null, null, null, null, null, null, 1000000.0f, 100.0f, 1.0f, null);
        }
    }

    public RegionEntity(int i11, Integer num, String nameEn, String nameAr, String regionCodeEn, String regionCodeAr, String phonePrefix, String utcDiff, int i12, int i13, String contactDataString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f11, float f12, float f13, String str10) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        o.i(regionCodeEn, "regionCodeEn");
        o.i(regionCodeAr, "regionCodeAr");
        o.i(phonePrefix, "phonePrefix");
        o.i(utcDiff, "utcDiff");
        o.i(contactDataString, "contactDataString");
        this.f22320id = i11;
        this.mainDistrictId = num;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.regionCodeEn = regionCodeEn;
        this.regionCodeAr = regionCodeAr;
        this.phonePrefix = phonePrefix;
        this.utcDiff = utcDiff;
        this.allowMessaging = i12;
        this.allowGuestMessaging = i13;
        this.contactDataString = contactDataString;
        this.contactEmail = str;
        this.profileNotCompleteMessageEn = str2;
        this.emailNotVerifiedMessageEn = str3;
        this.profileNotCompleteMessageAr = str4;
        this.emailNotVerifiedMessageAr = str5;
        this.supportMessageEn = str6;
        this.supportMessageAr = str7;
        this.addressEn = str8;
        this.addressAr = str9;
        this.minPointsForRedemption = f11;
        this.amountPerRedemption = f12;
        this.pointsPerPaidAmount = f13;
        this.pointLevelsString = str10;
        this.isActive = 1;
    }

    public final int component1() {
        return this.f22320id;
    }

    public final int component10() {
        return this.allowGuestMessaging;
    }

    public final String component11() {
        return this.contactDataString;
    }

    public final String component12() {
        return this.contactEmail;
    }

    public final String component13() {
        return this.profileNotCompleteMessageEn;
    }

    public final String component14() {
        return this.emailNotVerifiedMessageEn;
    }

    public final String component15() {
        return this.profileNotCompleteMessageAr;
    }

    public final String component16() {
        return this.emailNotVerifiedMessageAr;
    }

    public final String component17() {
        return this.supportMessageEn;
    }

    public final String component18() {
        return this.supportMessageAr;
    }

    public final String component19() {
        return this.addressEn;
    }

    public final Integer component2() {
        return this.mainDistrictId;
    }

    public final String component20() {
        return this.addressAr;
    }

    public final float component21() {
        return this.minPointsForRedemption;
    }

    public final float component22() {
        return this.amountPerRedemption;
    }

    public final float component23() {
        return this.pointsPerPaidAmount;
    }

    public final String component24() {
        return this.pointLevelsString;
    }

    public final String component3() {
        return this.nameEn;
    }

    public final String component4() {
        return this.nameAr;
    }

    public final String component5() {
        return this.regionCodeEn;
    }

    public final String component6() {
        return this.regionCodeAr;
    }

    public final String component7() {
        return this.phonePrefix;
    }

    public final String component8() {
        return this.utcDiff;
    }

    public final int component9() {
        return this.allowMessaging;
    }

    public final RegionEntity copy(int i11, Integer num, String nameEn, String nameAr, String regionCodeEn, String regionCodeAr, String phonePrefix, String utcDiff, int i12, int i13, String contactDataString, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, float f11, float f12, float f13, String str10) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        o.i(regionCodeEn, "regionCodeEn");
        o.i(regionCodeAr, "regionCodeAr");
        o.i(phonePrefix, "phonePrefix");
        o.i(utcDiff, "utcDiff");
        o.i(contactDataString, "contactDataString");
        return new RegionEntity(i11, num, nameEn, nameAr, regionCodeEn, regionCodeAr, phonePrefix, utcDiff, i12, i13, contactDataString, str, str2, str3, str4, str5, str6, str7, str8, str9, f11, f12, f13, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionEntity)) {
            return false;
        }
        RegionEntity regionEntity = (RegionEntity) obj;
        if (this.f22320id == regionEntity.f22320id && o.d(this.mainDistrictId, regionEntity.mainDistrictId) && o.d(this.nameEn, regionEntity.nameEn) && o.d(this.nameAr, regionEntity.nameAr) && o.d(this.regionCodeEn, regionEntity.regionCodeEn) && o.d(this.regionCodeAr, regionEntity.regionCodeAr) && o.d(this.phonePrefix, regionEntity.phonePrefix) && o.d(this.utcDiff, regionEntity.utcDiff) && this.allowMessaging == regionEntity.allowMessaging && this.allowGuestMessaging == regionEntity.allowGuestMessaging && o.d(this.contactDataString, regionEntity.contactDataString) && o.d(this.contactEmail, regionEntity.contactEmail) && o.d(this.profileNotCompleteMessageEn, regionEntity.profileNotCompleteMessageEn) && o.d(this.emailNotVerifiedMessageEn, regionEntity.emailNotVerifiedMessageEn) && o.d(this.profileNotCompleteMessageAr, regionEntity.profileNotCompleteMessageAr) && o.d(this.emailNotVerifiedMessageAr, regionEntity.emailNotVerifiedMessageAr) && o.d(this.supportMessageEn, regionEntity.supportMessageEn) && o.d(this.supportMessageAr, regionEntity.supportMessageAr) && o.d(this.addressEn, regionEntity.addressEn) && o.d(this.addressAr, regionEntity.addressAr) && Float.compare(this.minPointsForRedemption, regionEntity.minPointsForRedemption) == 0 && Float.compare(this.amountPerRedemption, regionEntity.amountPerRedemption) == 0 && Float.compare(this.pointsPerPaidAmount, regionEntity.pointsPerPaidAmount) == 0 && o.d(this.pointLevelsString, regionEntity.pointLevelsString)) {
            return true;
        }
        return false;
    }

    public final String getAddressAr() {
        return this.addressAr;
    }

    public final String getAddressEn() {
        return this.addressEn;
    }

    public final int getAllowGuestMessaging() {
        return this.allowGuestMessaging;
    }

    public final int getAllowMessaging() {
        return this.allowMessaging;
    }

    public final float getAmountPerRedemption() {
        return this.amountPerRedemption;
    }

    public final List<ContactData> getContactData() {
        return new ContactDataConverters().toContactData(this.contactDataString);
    }

    public final String getContactDataString() {
        return this.contactDataString;
    }

    public final String getContactEmail() {
        return this.contactEmail;
    }

    public final String getCurrency() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.regionCodeEn;
        }
        return this.regionCodeAr;
    }

    public final String getEmailNotVerifiedMessageAr() {
        return this.emailNotVerifiedMessageAr;
    }

    public final String getEmailNotVerifiedMessageEn() {
        return this.emailNotVerifiedMessageEn;
    }

    public final String getFullName() {
        String str = this.nameEn;
        String str2 = this.nameAr;
        return str + "-" + str2;
    }

    public final int getId() {
        return this.f22320id;
    }

    public final Integer getMainDistrictId() {
        return this.mainDistrictId;
    }

    public final float getMinPointsForRedemption() {
        return this.minPointsForRedemption;
    }

    public final String getName() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.nameEn;
        }
        return this.nameAr;
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public final String getPhonePrefix() {
        return this.phonePrefix;
    }

    public final PointLevels getPointLevels() {
        return new PointLevelsConverters().toPointLevels(this.pointLevelsString);
    }

    public final String getPointLevelsString() {
        return this.pointLevelsString;
    }

    public final float getPointsPerPaidAmount() {
        return this.pointsPerPaidAmount;
    }

    public final String getProfileNotCompleteMessageAr() {
        return this.profileNotCompleteMessageAr;
    }

    public final String getProfileNotCompleteMessageEn() {
        return this.profileNotCompleteMessageEn;
    }

    public final String getRegionCode() {
        return getCurrency();
    }

    public final String getRegionCodeAr() {
        return this.regionCodeAr;
    }

    public final String getRegionCodeEn() {
        return this.regionCodeEn;
    }

    public final String getSupportMessage() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.supportMessageEn;
        }
        return this.supportMessageAr;
    }

    public final String getSupportMessageAr() {
        return this.supportMessageAr;
    }

    public final String getSupportMessageEn() {
        return this.supportMessageEn;
    }

    public final String getUtcDiff() {
        return this.utcDiff;
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
        int hashCode11 = Integer.hashCode(this.f22320id) * 31;
        Integer num = this.mainDistrictId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode12 = (((((((((((((((((((hashCode11 + hashCode) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.regionCodeEn.hashCode()) * 31) + this.regionCodeAr.hashCode()) * 31) + this.phonePrefix.hashCode()) * 31) + this.utcDiff.hashCode()) * 31) + Integer.hashCode(this.allowMessaging)) * 31) + Integer.hashCode(this.allowGuestMessaging)) * 31) + this.contactDataString.hashCode()) * 31;
        String str = this.contactEmail;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (hashCode12 + hashCode2) * 31;
        String str2 = this.profileNotCompleteMessageEn;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str3 = this.emailNotVerifiedMessageEn;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str4 = this.profileNotCompleteMessageAr;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str5 = this.emailNotVerifiedMessageAr;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        String str6 = this.supportMessageEn;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str7 = this.supportMessageAr;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str8 = this.addressEn;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i19 = (i18 + hashCode9) * 31;
        String str9 = this.addressAr;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int hashCode13 = (((((((i19 + hashCode10) * 31) + Float.hashCode(this.minPointsForRedemption)) * 31) + Float.hashCode(this.amountPerRedemption)) * 31) + Float.hashCode(this.pointsPerPaidAmount)) * 31;
        String str10 = this.pointLevelsString;
        if (str10 != null) {
            i11 = str10.hashCode();
        }
        return hashCode13 + i11;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22320id;
        Integer num = this.mainDistrictId;
        String str = this.nameEn;
        String str2 = this.nameAr;
        String str3 = this.regionCodeEn;
        String str4 = this.regionCodeAr;
        String str5 = this.phonePrefix;
        String str6 = this.utcDiff;
        int i12 = this.allowMessaging;
        int i13 = this.allowGuestMessaging;
        String str7 = this.contactDataString;
        String str8 = this.contactEmail;
        String str9 = this.profileNotCompleteMessageEn;
        String str10 = this.emailNotVerifiedMessageEn;
        String str11 = this.profileNotCompleteMessageAr;
        String str12 = this.emailNotVerifiedMessageAr;
        String str13 = this.supportMessageEn;
        String str14 = this.supportMessageAr;
        String str15 = this.addressEn;
        String str16 = this.addressAr;
        float f11 = this.minPointsForRedemption;
        float f12 = this.amountPerRedemption;
        float f13 = this.pointsPerPaidAmount;
        String str17 = this.pointLevelsString;
        return "RegionEntity(id=" + i11 + ", mainDistrictId=" + num + ", nameEn=" + str + ", nameAr=" + str2 + ", regionCodeEn=" + str3 + ", regionCodeAr=" + str4 + ", phonePrefix=" + str5 + ", utcDiff=" + str6 + ", allowMessaging=" + i12 + ", allowGuestMessaging=" + i13 + ", contactDataString=" + str7 + ", contactEmail=" + str8 + ", profileNotCompleteMessageEn=" + str9 + ", emailNotVerifiedMessageEn=" + str10 + ", profileNotCompleteMessageAr=" + str11 + ", emailNotVerifiedMessageAr=" + str12 + ", supportMessageEn=" + str13 + ", supportMessageAr=" + str14 + ", addressEn=" + str15 + ", addressAr=" + str16 + ", minPointsForRedemption=" + f11 + ", amountPerRedemption=" + f12 + ", pointsPerPaidAmount=" + f13 + ", pointLevelsString=" + str17 + ")";
    }

    public static /* synthetic */ void getRegionCode$annotations() {
    }
}

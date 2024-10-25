package com.forsale.app.datalayer.database;

import com.google.android.gms.ads.AdRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CategoryDistrict.kt */
/* loaded from: classes2.dex */
public final class CategoryDistrict {
    public static final int $stable = 0;
    public static final String ALLOW_UPLOAD_ON_FREE = "allow_upload_on_free";
    public static final String CATEGORY_DISTRICT_TABLE = "categories_districts";
    public static final String CAT_ID = "cat_id";
    public static final String COMMERCIAL_PINNING_SHUFFLE_FACTOR = "commercial_pinning_shuffle_factor";
    public static final Companion Companion = new Companion(null);
    public static final String DISPLAY_ORDER = "display_order";
    public static final String DISTRICT_ID = "district_id";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String LISTINGS_COUNT = "listings_count";
    public static final String MAX_PRICE = "max_price";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PARENT_ID = "parent_id";
    public static final String PINNING_SHUFFLE_FACTOR = "pinning_shuffle_factor";
    public static final String PRICE = "price";
    public static final String REGION_ID = "region_id";
    public static final String USER_TYPE_PINNING_SHUFFLE_FACTOR = "user_type_pinning_shuffle_factor";
    @c(ALLOW_UPLOAD_ON_FREE)
    private final int allowUploadOnFree;
    @c("cat_id")
    private final int catId;
    @c(COMMERCIAL_PINNING_SHUFFLE_FACTOR)
    private final int commercialPinningShuffleFactor;
    @c(DISTRICT_ID)
    private final int districtId;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22303id;
    @c("is_active")
    private final Integer isActive;
    @c(LISTINGS_COUNT)
    private final long listingCount;
    @c(MAX_PRICE)
    private final int maxPrice;
    @c(PINNING_SHUFFLE_FACTOR)
    private final int pinningShuffleFactor;
    @c("price")
    private final float price;
    @c(USER_TYPE_PINNING_SHUFFLE_FACTOR)
    private final int userTypePinningShuffleFactor;

    /* compiled from: CategoryDistrict.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CategoryDistrict(int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18, long j11, Integer num) {
        this.f22303id = i11;
        this.catId = i12;
        this.districtId = i13;
        this.price = f11;
        this.pinningShuffleFactor = i14;
        this.userTypePinningShuffleFactor = i15;
        this.maxPrice = i16;
        this.commercialPinningShuffleFactor = i17;
        this.allowUploadOnFree = i18;
        this.listingCount = j11;
        this.isActive = num;
    }

    public static /* synthetic */ CategoryDistrict copy$default(CategoryDistrict categoryDistrict, int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18, long j11, Integer num, int i19, Object obj) {
        int i21;
        int i22;
        int i23;
        float f12;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        long j12;
        Integer num2;
        if ((i19 & 1) != 0) {
            i21 = categoryDistrict.f22303id;
        } else {
            i21 = i11;
        }
        if ((i19 & 2) != 0) {
            i22 = categoryDistrict.catId;
        } else {
            i22 = i12;
        }
        if ((i19 & 4) != 0) {
            i23 = categoryDistrict.districtId;
        } else {
            i23 = i13;
        }
        if ((i19 & 8) != 0) {
            f12 = categoryDistrict.price;
        } else {
            f12 = f11;
        }
        if ((i19 & 16) != 0) {
            i24 = categoryDistrict.pinningShuffleFactor;
        } else {
            i24 = i14;
        }
        if ((i19 & 32) != 0) {
            i25 = categoryDistrict.userTypePinningShuffleFactor;
        } else {
            i25 = i15;
        }
        if ((i19 & 64) != 0) {
            i26 = categoryDistrict.maxPrice;
        } else {
            i26 = i16;
        }
        if ((i19 & 128) != 0) {
            i27 = categoryDistrict.commercialPinningShuffleFactor;
        } else {
            i27 = i17;
        }
        if ((i19 & 256) != 0) {
            i28 = categoryDistrict.allowUploadOnFree;
        } else {
            i28 = i18;
        }
        if ((i19 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            j12 = categoryDistrict.listingCount;
        } else {
            j12 = j11;
        }
        if ((i19 & 1024) != 0) {
            num2 = categoryDistrict.isActive;
        } else {
            num2 = num;
        }
        return categoryDistrict.copy(i21, i22, i23, f12, i24, i25, i26, i27, i28, j12, num2);
    }

    public final int component1() {
        return this.f22303id;
    }

    public final long component10() {
        return this.listingCount;
    }

    public final Integer component11() {
        return this.isActive;
    }

    public final int component2() {
        return this.catId;
    }

    public final int component3() {
        return this.districtId;
    }

    public final float component4() {
        return this.price;
    }

    public final int component5() {
        return this.pinningShuffleFactor;
    }

    public final int component6() {
        return this.userTypePinningShuffleFactor;
    }

    public final int component7() {
        return this.maxPrice;
    }

    public final int component8() {
        return this.commercialPinningShuffleFactor;
    }

    public final int component9() {
        return this.allowUploadOnFree;
    }

    public final CategoryDistrict copy(int i11, int i12, int i13, float f11, int i14, int i15, int i16, int i17, int i18, long j11, Integer num) {
        return new CategoryDistrict(i11, i12, i13, f11, i14, i15, i16, i17, i18, j11, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryDistrict)) {
            return false;
        }
        CategoryDistrict categoryDistrict = (CategoryDistrict) obj;
        if (this.f22303id == categoryDistrict.f22303id && this.catId == categoryDistrict.catId && this.districtId == categoryDistrict.districtId && Float.compare(this.price, categoryDistrict.price) == 0 && this.pinningShuffleFactor == categoryDistrict.pinningShuffleFactor && this.userTypePinningShuffleFactor == categoryDistrict.userTypePinningShuffleFactor && this.maxPrice == categoryDistrict.maxPrice && this.commercialPinningShuffleFactor == categoryDistrict.commercialPinningShuffleFactor && this.allowUploadOnFree == categoryDistrict.allowUploadOnFree && this.listingCount == categoryDistrict.listingCount && o.d(this.isActive, categoryDistrict.isActive)) {
            return true;
        }
        return false;
    }

    public final int getAllowUploadOnFree() {
        return this.allowUploadOnFree;
    }

    public final int getCatId() {
        return this.catId;
    }

    public final int getCommercialPinningShuffleFactor() {
        return this.commercialPinningShuffleFactor;
    }

    public final int getDistrictId() {
        return this.districtId;
    }

    public final int getId() {
        return this.f22303id;
    }

    public final long getListingCount() {
        return this.listingCount;
    }

    public final int getMaxPrice() {
        return this.maxPrice;
    }

    public final int getPinningShuffleFactor() {
        return this.pinningShuffleFactor;
    }

    public final float getPrice() {
        return this.price;
    }

    public final int getUserTypePinningShuffleFactor() {
        return this.userTypePinningShuffleFactor;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((Integer.hashCode(this.f22303id) * 31) + Integer.hashCode(this.catId)) * 31) + Integer.hashCode(this.districtId)) * 31) + Float.hashCode(this.price)) * 31) + Integer.hashCode(this.pinningShuffleFactor)) * 31) + Integer.hashCode(this.userTypePinningShuffleFactor)) * 31) + Integer.hashCode(this.maxPrice)) * 31) + Integer.hashCode(this.commercialPinningShuffleFactor)) * 31) + Integer.hashCode(this.allowUploadOnFree)) * 31) + Long.hashCode(this.listingCount)) * 31;
        Integer num = this.isActive;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public String toString() {
        int i11 = this.f22303id;
        int i12 = this.catId;
        int i13 = this.districtId;
        float f11 = this.price;
        int i14 = this.pinningShuffleFactor;
        int i15 = this.userTypePinningShuffleFactor;
        int i16 = this.maxPrice;
        int i17 = this.commercialPinningShuffleFactor;
        int i18 = this.allowUploadOnFree;
        long j11 = this.listingCount;
        Integer num = this.isActive;
        return "CategoryDistrict(id=" + i11 + ", catId=" + i12 + ", districtId=" + i13 + ", price=" + f11 + ", pinningShuffleFactor=" + i14 + ", userTypePinningShuffleFactor=" + i15 + ", maxPrice=" + i16 + ", commercialPinningShuffleFactor=" + i17 + ", allowUploadOnFree=" + i18 + ", listingCount=" + j11 + ", isActive=" + num + ")";
    }
}

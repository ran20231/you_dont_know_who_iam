package com.forsale.app.datalayer.database;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.gson.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import up.c;
/* compiled from: CategoryEntity.kt */
/* loaded from: classes2.dex */
public final class CategoryEntity implements Parcelable, Comparable<CategoryEntity> {
    public static final String ALLOW_DISTRICT_FILTERING = "allow_district_filtering";
    public static final String ALLOW_POWER_PIN_ADD = "allow_power_pin_add";
    public static final String ALLOW_POWER_PIN_VIEW = "allow_power_pin_view";
    public static final String ALLOW_SEARCH = "allow_search";
    public static final String ALLOW_UPLOADING = "allow_uploading";
    public static final String ATTRIBUTE_VALUES = "attribute_values";
    public static final String CATEGORIES_TABLE = "categories";
    public static final String CLASSIFICATION = "classification";
    public static final String DISPLAY_ORDER = "display_order";
    public static final String FEATURED_IMAGE = "featured_image";
    public static final String FILTERABLE_LABEL_AR = "filterable_label_ar";
    public static final String FILTERABLE_LABEL_EN = "filterable_label_en";
    public static final String FILTRATION_SETTINGS = "filtration_settings";
    public static final String FULL_PATH = "full_path";
    public static final String HAS_PLANS = "has_plans";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String IS_ACTIVE = "is_active";
    public static final String IS_ALTERNATE_VIEW = "is_alternate_view";
    public static final String IS_EXPENDABLE = "is_expendable";
    public static final String IS_FILTERABLE = "is_filterable";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PARENT_ID = "parent_id";
    public static final String PROMOTE_ANIMATION = "promote_animation";
    public static final String REGION_ID = "region_id";
    public static final String RULE_SET = "ruleset";
    public static final String SECTIONS = "sections";
    public static final String SLUG = "slug";
    public static final String STEPS = "steps";
    public static final String SYSTEM_NAME = "system_name";
    public static final String VERTICAL_IMAGE = "vertical_image";
    @c(SECTIONS)
    private final String _sections;
    @c(ALLOW_DISTRICT_FILTERING)
    private final int allowDistrictFiltering;
    @c(ALLOW_POWER_PIN_ADD)
    private final int allowPowerPinAdd;
    @c(ALLOW_POWER_PIN_VIEW)
    private final int allowPowerPinView;
    @c(ALLOW_SEARCH)
    private final Integer allowSearch;
    @c(ALLOW_UPLOADING)
    private final int allowUploading;
    @c(ATTRIBUTE_VALUES)
    private final String attributeValuesString;
    @c("category_type")
    private final CategoryType categoryType;
    private Integer choicableResId;
    private int choiceId;
    @c(CLASSIFICATION)
    private final String classificationString;
    @c("display_order")
    private final int displayOrder;
    private String displayedName;
    @c(FEATURED_IMAGE)
    private final String featuredImage;
    @c(FILTERABLE_LABEL_AR)
    private final String filterableLabelAr;
    @c(FILTERABLE_LABEL_EN)
    private final String filterableLabelEn;
    @c("filtering_classification_ar")
    private final String filteringClassificationAr;
    @c("filtering_classification_en")
    private final String filteringClassificationEn;
    @c(FILTRATION_SETTINGS)
    private final String filtrationSettingsString;
    @c(FULL_PATH)
    private final String fullPath;
    @c(HAS_PLANS)
    private final int has_plans;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22304id;
    @c("image")
    private final String image;
    @c("is_active")
    private int isActive;
    @c("is_alt_cat")
    private final int isAltCat;
    @c(IS_ALTERNATE_VIEW)
    private final Integer isAlternateView;
    private boolean isChosen;
    @c(IS_EXPENDABLE)
    private final Integer isExpendable;
    @c(IS_FILTERABLE)
    private final int isFilterable;
    @c("is_indexed")
    private final Integer isIndexed;
    @c("max_home_top_banners")
    private final int maxHomeTopBannersCount;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    private String parentDisplayedName;
    @c("parent_id")
    private final int parentId;
    @c("promote_animation")
    private final String promoteAnimation;
    @c("region_id")
    private final int regionId;
    @c("relatives")
    private final String relatives;
    private List<Integer> relativesIds;
    @c(RULE_SET)
    private final String ruleSetString;
    @c(SLUG)
    private final String slug;
    @c(STEPS)
    private final int steps;
    @c("system_name")
    private final String systemName;
    @c(VERTICAL_IMAGE)
    private final String verticalImage;
    private String verticalImageFullPath;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CategoryEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class CategoryType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CategoryType[] $VALUES;
        @c("sub_categories")
        public static final CategoryType SUB_CATEGORIES = new CategoryType("SUB_CATEGORIES", 0);
        @c("listings_district_filteration")
        public static final CategoryType LISTINGS_DISTRICT_FILTRATION = new CategoryType("LISTINGS_DISTRICT_FILTRATION", 1);
        @c("listings_full_filtration")
        public static final CategoryType LISTINGS_FULL_FILTRATION = new CategoryType("LISTINGS_FULL_FILTRATION", 2);
        @c("listings")
        public static final CategoryType LISTINGS = new CategoryType("LISTINGS", 3);
        @c("none")
        public static final CategoryType NONE = new CategoryType("NONE", 4);

        /* compiled from: CategoryEntity.kt */
        /* loaded from: classes2.dex */
        public static final class CategoryTypeConverter {
            public static final int $stable = 0;

            public final CategoryType toCategoryType(String str) {
                boolean z11;
                Object k11;
                if (str != null && str.length() != 0) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z11) {
                    k11 = null;
                } else {
                    k11 = new d().k(str, CategoryType.class);
                }
                CategoryType categoryType = (CategoryType) k11;
                if (categoryType == null) {
                    return CategoryType.NONE;
                }
                return categoryType;
            }

            public final String toString(CategoryType categoryType) {
                String f11 = TopLevelUtilityFunctionsKt.f(categoryType);
                if (f11 == null) {
                    return "NONE";
                }
                return f11;
            }
        }

        private static final /* synthetic */ CategoryType[] $values() {
            return new CategoryType[]{SUB_CATEGORIES, LISTINGS_DISTRICT_FILTRATION, LISTINGS_FULL_FILTRATION, LISTINGS, NONE};
        }

        static {
            CategoryType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CategoryType(String str, int i11) {
        }

        public static a<CategoryType> getEntries() {
            return $ENTRIES;
        }

        public static CategoryType valueOf(String str) {
            return (CategoryType) Enum.valueOf(CategoryType.class, str);
        }

        public static CategoryType[] values() {
            return (CategoryType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Classification {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Classification[] $VALUES;
        public static final Companion Companion;
        private static final Map<String, Classification> map;
        private final String value;
        @c("cars")
        public static final Classification CARS = new Classification("CARS", 0, "cars");
        @c("boats")
        public static final Classification BOATS = new Classification("BOATS", 1, "boats");
        @c("bikes")
        public static final Classification BIKES = new Classification("BIKES", 2, "bikes");
        @c("other")
        public static final Classification OTHER = new Classification("OTHER", 3, "other");
        @c("property")
        public static final Classification PROPERTY = new Classification("PROPERTY", 4, "property");
        @c("services")
        public static final Classification Services = new Classification("Services", 5, "services");
        @c("business")
        public static final Classification BUSINESS = new Classification("BUSINESS", 6, "business");
        @c("premium")
        public static final Classification PREMIUM = new Classification("PREMIUM", 7, "premium");
        @c("4sale")
        public static final Classification FOR_SALE = new Classification("FOR_SALE", 8, "4sale");
        @c("")
        public static final Classification DEFAULT = new Classification("DEFAULT", 9, "");

        /* compiled from: CategoryEntity.kt */
        /* loaded from: classes2.dex */
        public static final class ClassificationTypeConverter {
            public static final int $stable = 0;

            public final Classification toClassification(String str) {
                if (str != null) {
                    return Classification.Companion.from(str);
                }
                return null;
            }

            public final String toString(Classification classification) {
                if (classification != null) {
                    return classification.getValue();
                }
                return null;
            }
        }

        /* compiled from: CategoryEntity.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Classification from(String type) {
                Object i11;
                o.i(type, "type");
                try {
                    i11 = j0.i(Classification.map, type);
                    return (Classification) i11;
                } catch (Exception unused) {
                    return Classification.DEFAULT;
                }
            }
        }

        private static final /* synthetic */ Classification[] $values() {
            return new Classification[]{CARS, BOATS, BIKES, OTHER, PROPERTY, Services, BUSINESS, PREMIUM, FOR_SALE, DEFAULT};
        }

        static {
            int e11;
            int d11;
            Classification[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new Companion(null);
            Classification[] values = values();
            e11 = i0.e(values.length);
            d11 = m00.o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (Classification classification : values) {
                linkedHashMap.put(classification.value, classification);
            }
            map = linkedHashMap;
        }

        private Classification(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a<Classification> getEntries() {
            return $ENTRIES;
        }

        public static Classification valueOf(String str) {
            return (Classification) Enum.valueOf(Classification.class, str);
        }

        public static Classification[] values() {
            return (Classification[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: CategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<CategoryEntity> getMockedCategories(int i11) {
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList.add(CategoryEntity.Companion.makeMockCategory());
            }
            return arrayList;
        }

        public final CategoryEntity makeMockCategory() {
            return new CategoryEntity(852, 1, "Samsung Devices - Samsung Computers", "Samsung Computers", "كمبيوتر سامسونغ", "https://d3cxve53lbqhxv.cloudfront.net/images/cat_image/base_852.png", 837, 5, 1, 0, 100, "gif_formal", 0, 1, null, 0, 0, 0, "all", "الكل", "", "", 0, 0, "", CategoryType.SUB_CATEGORIES, "", "", 0, "", 10, null, "", 0, "", "", "", 0, 2, null);
        }
    }

    /* compiled from: CategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CategoryEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryEntity createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new CategoryEntity(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), CategoryType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CategoryEntity[] newArray(int i11) {
            return new CategoryEntity[i11];
        }
    }

    /* compiled from: CategoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Sections {
        public static final int $stable = 0;
        private final String name;
        private final int order;

        public Sections(String name, int i11) {
            o.i(name, "name");
            this.name = name;
            this.order = i11;
        }

        public static /* synthetic */ Sections copy$default(Sections sections, String str, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = sections.name;
            }
            if ((i12 & 2) != 0) {
                i11 = sections.order;
            }
            return sections.copy(str, i11);
        }

        public final String component1() {
            return this.name;
        }

        public final int component2() {
            return this.order;
        }

        public final Sections copy(String name, int i11) {
            o.i(name, "name");
            return new Sections(name, i11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Sections)) {
                return false;
            }
            Sections sections = (Sections) obj;
            if (o.d(this.name, sections.name) && this.order == sections.order) {
                return true;
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final int getOrder() {
            return this.order;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + Integer.hashCode(this.order);
        }

        public String toString() {
            String str = this.name;
            int i11 = this.order;
            return "Sections(name=" + str + ", order=" + i11 + ")";
        }
    }

    public CategoryEntity(int i11, int i12, String systemName, String nameEn, String nameAr, String image, int i13, int i14, int i15, int i16, int i17, String str, Integer num, Integer num2, String str2, Integer num3, int i18, int i19, String str3, String str4, String str5, String str6, int i21, int i22, String fullPath, CategoryType categoryType, String str7, String str8, Integer num4, String str9, int i23, String str10, String featuredImage, int i24, String str11, String str12, String str13) {
        o.i(systemName, "systemName");
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        o.i(image, "image");
        o.i(fullPath, "fullPath");
        o.i(categoryType, "categoryType");
        o.i(featuredImage, "featuredImage");
        this.f22304id = i11;
        this.regionId = i12;
        this.systemName = systemName;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.image = image;
        this.parentId = i13;
        this.displayOrder = i14;
        this.allowUploading = i15;
        this.isFilterable = i16;
        this.steps = i17;
        this.promoteAnimation = str;
        this.isAlternateView = num;
        this.allowSearch = num2;
        this.attributeValuesString = str2;
        this.isExpendable = num3;
        this.allowDistrictFiltering = i18;
        this.has_plans = i19;
        this.filterableLabelEn = str3;
        this.filterableLabelAr = str4;
        this.ruleSetString = str5;
        this.classificationString = str6;
        this.allowPowerPinView = i21;
        this.allowPowerPinAdd = i22;
        this.fullPath = fullPath;
        this.categoryType = categoryType;
        this.filteringClassificationAr = str7;
        this.filteringClassificationEn = str8;
        this.isIndexed = num4;
        this.verticalImage = str9;
        this.maxHomeTopBannersCount = i23;
        this.relatives = str10;
        this.featuredImage = featuredImage;
        this.isAltCat = i24;
        this.filtrationSettingsString = str11;
        this._sections = str12;
        this.slug = str13;
        this.displayedName = getName();
        this.parentDisplayedName = getFilterableLabel();
        this.choiceId = i11;
        this.verticalImageFullPath = "";
        this.isActive = 1;
    }

    public final int component1() {
        return this.f22304id;
    }

    public final int component10() {
        return this.isFilterable;
    }

    public final int component11() {
        return this.steps;
    }

    public final String component12() {
        return this.promoteAnimation;
    }

    public final Integer component13() {
        return this.isAlternateView;
    }

    public final Integer component14() {
        return this.allowSearch;
    }

    public final String component15() {
        return this.attributeValuesString;
    }

    public final Integer component16() {
        return this.isExpendable;
    }

    public final int component17() {
        return this.allowDistrictFiltering;
    }

    public final int component18() {
        return this.has_plans;
    }

    public final String component19() {
        return this.filterableLabelEn;
    }

    public final int component2() {
        return this.regionId;
    }

    public final String component20() {
        return this.filterableLabelAr;
    }

    public final String component21() {
        return this.ruleSetString;
    }

    public final String component22() {
        return this.classificationString;
    }

    public final int component23() {
        return this.allowPowerPinView;
    }

    public final int component24() {
        return this.allowPowerPinAdd;
    }

    public final String component25() {
        return this.fullPath;
    }

    public final CategoryType component26() {
        return this.categoryType;
    }

    public final String component27() {
        return this.filteringClassificationAr;
    }

    public final String component28() {
        return this.filteringClassificationEn;
    }

    public final Integer component29() {
        return this.isIndexed;
    }

    public final String component3() {
        return this.systemName;
    }

    public final String component30() {
        return this.verticalImage;
    }

    public final int component31() {
        return this.maxHomeTopBannersCount;
    }

    public final String component32() {
        return this.relatives;
    }

    public final String component33() {
        return this.featuredImage;
    }

    public final int component34() {
        return this.isAltCat;
    }

    public final String component35() {
        return this.filtrationSettingsString;
    }

    public final String component36() {
        return this._sections;
    }

    public final String component37() {
        return this.slug;
    }

    public final String component4() {
        return this.nameEn;
    }

    public final String component5() {
        return this.nameAr;
    }

    public final String component6() {
        return this.image;
    }

    public final int component7() {
        return this.parentId;
    }

    public final int component8() {
        return this.displayOrder;
    }

    public final int component9() {
        return this.allowUploading;
    }

    public final CategoryEntity copy(int i11, int i12, String systemName, String nameEn, String nameAr, String image, int i13, int i14, int i15, int i16, int i17, String str, Integer num, Integer num2, String str2, Integer num3, int i18, int i19, String str3, String str4, String str5, String str6, int i21, int i22, String fullPath, CategoryType categoryType, String str7, String str8, Integer num4, String str9, int i23, String str10, String featuredImage, int i24, String str11, String str12, String str13) {
        o.i(systemName, "systemName");
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        o.i(image, "image");
        o.i(fullPath, "fullPath");
        o.i(categoryType, "categoryType");
        o.i(featuredImage, "featuredImage");
        return new CategoryEntity(i11, i12, systemName, nameEn, nameAr, image, i13, i14, i15, i16, i17, str, num, num2, str2, num3, i18, i19, str3, str4, str5, str6, i21, i22, fullPath, categoryType, str7, str8, num4, str9, i23, str10, featuredImage, i24, str11, str12, str13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryEntity)) {
            return false;
        }
        CategoryEntity categoryEntity = (CategoryEntity) obj;
        if (this.f22304id == categoryEntity.f22304id && this.regionId == categoryEntity.regionId && o.d(this.systemName, categoryEntity.systemName) && o.d(this.nameEn, categoryEntity.nameEn) && o.d(this.nameAr, categoryEntity.nameAr) && o.d(this.image, categoryEntity.image) && this.parentId == categoryEntity.parentId && this.displayOrder == categoryEntity.displayOrder && this.allowUploading == categoryEntity.allowUploading && this.isFilterable == categoryEntity.isFilterable && this.steps == categoryEntity.steps && o.d(this.promoteAnimation, categoryEntity.promoteAnimation) && o.d(this.isAlternateView, categoryEntity.isAlternateView) && o.d(this.allowSearch, categoryEntity.allowSearch) && o.d(this.attributeValuesString, categoryEntity.attributeValuesString) && o.d(this.isExpendable, categoryEntity.isExpendable) && this.allowDistrictFiltering == categoryEntity.allowDistrictFiltering && this.has_plans == categoryEntity.has_plans && o.d(this.filterableLabelEn, categoryEntity.filterableLabelEn) && o.d(this.filterableLabelAr, categoryEntity.filterableLabelAr) && o.d(this.ruleSetString, categoryEntity.ruleSetString) && o.d(this.classificationString, categoryEntity.classificationString) && this.allowPowerPinView == categoryEntity.allowPowerPinView && this.allowPowerPinAdd == categoryEntity.allowPowerPinAdd && o.d(this.fullPath, categoryEntity.fullPath) && this.categoryType == categoryEntity.categoryType && o.d(this.filteringClassificationAr, categoryEntity.filteringClassificationAr) && o.d(this.filteringClassificationEn, categoryEntity.filteringClassificationEn) && o.d(this.isIndexed, categoryEntity.isIndexed) && o.d(this.verticalImage, categoryEntity.verticalImage) && this.maxHomeTopBannersCount == categoryEntity.maxHomeTopBannersCount && o.d(this.relatives, categoryEntity.relatives) && o.d(this.featuredImage, categoryEntity.featuredImage) && this.isAltCat == categoryEntity.isAltCat && o.d(this.filtrationSettingsString, categoryEntity.filtrationSettingsString) && o.d(this._sections, categoryEntity._sections) && o.d(this.slug, categoryEntity.slug)) {
            return true;
        }
        return false;
    }

    public final int getAllowDistrictFiltering() {
        return this.allowDistrictFiltering;
    }

    public final int getAllowPowerPinAdd() {
        return this.allowPowerPinAdd;
    }

    public final int getAllowPowerPinView() {
        return this.allowPowerPinView;
    }

    public final Integer getAllowSearch() {
        return this.allowSearch;
    }

    public final int getAllowUploading() {
        return this.allowUploading;
    }

    public final List<AttributeValue> getAttributeValues() {
        return new AttributeValueConverters().toAttributeValue(this.attributeValuesString);
    }

    public final String getAttributeValuesString() {
        return this.attributeValuesString;
    }

    public final List<String> getCategoryTreeNames() {
        List F0;
        boolean v11;
        F0 = StringsKt__StringsKt.F0(this.fullPath, new String[]{"--_--"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : F0) {
            v11 = s.v((String) obj);
            if (!v11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final CategoryType getCategoryType() {
        return this.categoryType;
    }

    public Integer getChoicableResId() {
        return this.choicableResId;
    }

    public int getChoiceId() {
        return this.choiceId;
    }

    public final Classification getClassification() {
        Classification classification = new Classification.ClassificationTypeConverter().toClassification(this.classificationString);
        if (classification == null) {
            return Classification.DEFAULT;
        }
        return classification;
    }

    public final String getClassificationString() {
        return this.classificationString;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public String getDisplayedName() {
        return this.displayedName;
    }

    public final String getFeaturedImage() {
        return this.featuredImage;
    }

    public final String getFilterableLabel() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            String str = this.filterableLabelEn;
            if (str != null) {
                Z02 = StringsKt__StringsKt.Z0(str);
                return Z02.toString();
            }
            return null;
        }
        String str2 = this.filterableLabelAr;
        if (str2 != null) {
            Z0 = StringsKt__StringsKt.Z0(str2);
            return Z0.toString();
        }
        return null;
    }

    public final String getFilterableLabelAr() {
        return this.filterableLabelAr;
    }

    public final String getFilterableLabelEn() {
        return this.filterableLabelEn;
    }

    public final String getFilteringClassificationAr() {
        return this.filteringClassificationAr;
    }

    public final String getFilteringClassificationEn() {
        return this.filteringClassificationEn;
    }

    public final List<ListingsResponse.UISettings.FiltrationSetting> getFiltrationSettings() {
        return new CategoryFiltrationSettingsConverter().toFiltrationSettings(this.filtrationSettingsString);
    }

    public final String getFiltrationSettingsString() {
        return this.filtrationSettingsString;
    }

    public final String getFullPath() {
        return this.fullPath;
    }

    public final int getHas_plans() {
        return this.has_plans;
    }

    public final int getId() {
        return this.f22304id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getMaxHomeTopBannersCount() {
        return this.maxHomeTopBannersCount;
    }

    public final String getName() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            Z02 = StringsKt__StringsKt.Z0(this.nameEn);
            return Z02.toString();
        }
        Z0 = StringsKt__StringsKt.Z0(this.nameAr);
        return Z0.toString();
    }

    public final String getNameAr() {
        return this.nameAr;
    }

    public final String getNameEn() {
        return this.nameEn;
    }

    public String getParentDisplayedName() {
        return this.parentDisplayedName;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final String getPromoteAnimation() {
        return this.promoteAnimation;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public final String getRelatives() {
        return this.relatives;
    }

    public final List<Integer> getRelativesIds() {
        List<Integer> I0;
        String str = this.relatives;
        if (str == null || (I0 = TypeExtensionsKt.I0(str)) == null) {
            return null;
        }
        return I0;
    }

    public final CategoryRuleSet.RuleSet getRuleSet() {
        return new CategoryRuleSetConverters().toRuleSetConfiguration(this.ruleSetString);
    }

    public final String getRuleSetString() {
        return this.ruleSetString;
    }

    public final List<Sections> getSections() {
        boolean z11;
        String str = this._sections;
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        Object obj = null;
        if (!z11) {
            try {
                obj = new d().l(str, new com.google.gson.reflect.a<List<? extends Sections>>() { // from class: com.forsale.app.datalayer.database.CategoryEntity$special$$inlined$fromJson$1
                }.getType());
            } catch (Exception unused) {
            }
        }
        return (List) obj;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final int getSteps() {
        return this.steps;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getVerticalImage() {
        return this.verticalImage;
    }

    public final String getVerticalImageFullPath() {
        return this.verticalImageFullPath;
    }

    public final String get_sections() {
        return this._sections;
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
        int hashCode17 = ((((((((((((((((((((Integer.hashCode(this.f22304id) * 31) + Integer.hashCode(this.regionId)) * 31) + this.systemName.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.image.hashCode()) * 31) + Integer.hashCode(this.parentId)) * 31) + Integer.hashCode(this.displayOrder)) * 31) + Integer.hashCode(this.allowUploading)) * 31) + Integer.hashCode(this.isFilterable)) * 31) + Integer.hashCode(this.steps)) * 31;
        String str = this.promoteAnimation;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode17 + hashCode) * 31;
        Integer num = this.isAlternateView;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.allowSearch;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.attributeValuesString;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num3 = this.isExpendable;
        if (num3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num3.hashCode();
        }
        int hashCode18 = (((((i15 + hashCode5) * 31) + Integer.hashCode(this.allowDistrictFiltering)) * 31) + Integer.hashCode(this.has_plans)) * 31;
        String str3 = this.filterableLabelEn;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (hashCode18 + hashCode6) * 31;
        String str4 = this.filterableLabelAr;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str5 = this.ruleSetString;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str6 = this.classificationString;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int hashCode19 = (((((((((i18 + hashCode9) * 31) + Integer.hashCode(this.allowPowerPinView)) * 31) + Integer.hashCode(this.allowPowerPinAdd)) * 31) + this.fullPath.hashCode()) * 31) + this.categoryType.hashCode()) * 31;
        String str7 = this.filteringClassificationAr;
        if (str7 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str7.hashCode();
        }
        int i19 = (hashCode19 + hashCode10) * 31;
        String str8 = this.filteringClassificationEn;
        if (str8 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str8.hashCode();
        }
        int i21 = (i19 + hashCode11) * 31;
        Integer num4 = this.isIndexed;
        if (num4 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = num4.hashCode();
        }
        int i22 = (i21 + hashCode12) * 31;
        String str9 = this.verticalImage;
        if (str9 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = str9.hashCode();
        }
        int hashCode20 = (((i22 + hashCode13) * 31) + Integer.hashCode(this.maxHomeTopBannersCount)) * 31;
        String str10 = this.relatives;
        if (str10 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = str10.hashCode();
        }
        int hashCode21 = (((((hashCode20 + hashCode14) * 31) + this.featuredImage.hashCode()) * 31) + Integer.hashCode(this.isAltCat)) * 31;
        String str11 = this.filtrationSettingsString;
        if (str11 == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = str11.hashCode();
        }
        int i23 = (hashCode21 + hashCode15) * 31;
        String str12 = this._sections;
        if (str12 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = str12.hashCode();
        }
        int i24 = (i23 + hashCode16) * 31;
        String str13 = this.slug;
        if (str13 != null) {
            i11 = str13.hashCode();
        }
        return i24 + i11;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final boolean isAllowSearch() {
        return TypeExtensionsKt.i0(this.allowSearch);
    }

    public final int isAltCat() {
        return this.isAltCat;
    }

    public final Integer isAlternateView() {
        return this.isAlternateView;
    }

    public boolean isChosen() {
        return this.isChosen;
    }

    public final Integer isExpendable() {
        return this.isExpendable;
    }

    public final int isFilterable() {
        return this.isFilterable;
    }

    public final Integer isIndexed() {
        return this.isIndexed;
    }

    public final boolean isListingCategory() {
        List q11;
        q11 = r.q(CategoryType.LISTINGS, CategoryType.LISTINGS_DISTRICT_FILTRATION, CategoryType.LISTINGS_FULL_FILTRATION);
        return q11.contains(this.categoryType);
    }

    public final boolean isVertical() {
        if (this.parentId == 0) {
            return true;
        }
        return false;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public void setChoicableResId(Integer num) {
        this.choicableResId = num;
    }

    public void setChoiceId(int i11) {
        this.choiceId = i11;
    }

    public void setChosen(boolean z11) {
        this.isChosen = z11;
    }

    public void setDisplayedName(String str) {
        o.i(str, "<set-?>");
        this.displayedName = str;
    }

    public void setParentDisplayedName(String str) {
        this.parentDisplayedName = str;
    }

    public final void setRelativesIds(List<Integer> list) {
        this.relativesIds = list;
    }

    public final void setVerticalImageFullPath(String str) {
        o.i(str, "<set-?>");
        this.verticalImageFullPath = str;
    }

    public String toString() {
        int i11 = this.f22304id;
        int i12 = this.regionId;
        String str = this.systemName;
        String str2 = this.nameEn;
        String str3 = this.nameAr;
        String str4 = this.image;
        int i13 = this.parentId;
        int i14 = this.displayOrder;
        int i15 = this.allowUploading;
        int i16 = this.isFilterable;
        int i17 = this.steps;
        String str5 = this.promoteAnimation;
        Integer num = this.isAlternateView;
        Integer num2 = this.allowSearch;
        String str6 = this.attributeValuesString;
        Integer num3 = this.isExpendable;
        int i18 = this.allowDistrictFiltering;
        int i19 = this.has_plans;
        String str7 = this.filterableLabelEn;
        String str8 = this.filterableLabelAr;
        String str9 = this.ruleSetString;
        String str10 = this.classificationString;
        int i21 = this.allowPowerPinView;
        int i22 = this.allowPowerPinAdd;
        String str11 = this.fullPath;
        CategoryType categoryType = this.categoryType;
        String str12 = this.filteringClassificationAr;
        String str13 = this.filteringClassificationEn;
        Integer num4 = this.isIndexed;
        String str14 = this.verticalImage;
        int i23 = this.maxHomeTopBannersCount;
        String str15 = this.relatives;
        String str16 = this.featuredImage;
        int i24 = this.isAltCat;
        String str17 = this.filtrationSettingsString;
        String str18 = this._sections;
        String str19 = this.slug;
        return "CategoryEntity(id=" + i11 + ", regionId=" + i12 + ", systemName=" + str + ", nameEn=" + str2 + ", nameAr=" + str3 + ", image=" + str4 + ", parentId=" + i13 + ", displayOrder=" + i14 + ", allowUploading=" + i15 + ", isFilterable=" + i16 + ", steps=" + i17 + ", promoteAnimation=" + str5 + ", isAlternateView=" + num + ", allowSearch=" + num2 + ", attributeValuesString=" + str6 + ", isExpendable=" + num3 + ", allowDistrictFiltering=" + i18 + ", has_plans=" + i19 + ", filterableLabelEn=" + str7 + ", filterableLabelAr=" + str8 + ", ruleSetString=" + str9 + ", classificationString=" + str10 + ", allowPowerPinView=" + i21 + ", allowPowerPinAdd=" + i22 + ", fullPath=" + str11 + ", categoryType=" + categoryType + ", filteringClassificationAr=" + str12 + ", filteringClassificationEn=" + str13 + ", isIndexed=" + num4 + ", verticalImage=" + str14 + ", maxHomeTopBannersCount=" + i23 + ", relatives=" + str15 + ", featuredImage=" + str16 + ", isAltCat=" + i24 + ", filtrationSettingsString=" + str17 + ", _sections=" + str18 + ", slug=" + str19 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f22304id);
        out.writeInt(this.regionId);
        out.writeString(this.systemName);
        out.writeString(this.nameEn);
        out.writeString(this.nameAr);
        out.writeString(this.image);
        out.writeInt(this.parentId);
        out.writeInt(this.displayOrder);
        out.writeInt(this.allowUploading);
        out.writeInt(this.isFilterable);
        out.writeInt(this.steps);
        out.writeString(this.promoteAnimation);
        Integer num = this.isAlternateView;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.allowSearch;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        out.writeString(this.attributeValuesString);
        Integer num3 = this.isExpendable;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeInt(this.allowDistrictFiltering);
        out.writeInt(this.has_plans);
        out.writeString(this.filterableLabelEn);
        out.writeString(this.filterableLabelAr);
        out.writeString(this.ruleSetString);
        out.writeString(this.classificationString);
        out.writeInt(this.allowPowerPinView);
        out.writeInt(this.allowPowerPinAdd);
        out.writeString(this.fullPath);
        out.writeString(this.categoryType.name());
        out.writeString(this.filteringClassificationAr);
        out.writeString(this.filteringClassificationEn);
        Integer num4 = this.isIndexed;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        out.writeString(this.verticalImage);
        out.writeInt(this.maxHomeTopBannersCount);
        out.writeString(this.relatives);
        out.writeString(this.featuredImage);
        out.writeInt(this.isAltCat);
        out.writeString(this.filtrationSettingsString);
        out.writeString(this._sections);
        out.writeString(this.slug);
    }

    @Override // java.lang.Comparable
    public int compareTo(CategoryEntity other) {
        o.i(other, "other");
        return o.k(this.displayOrder, other.displayOrder);
    }

    public static /* synthetic */ void getChoicableResId$annotations() {
    }

    public static /* synthetic */ void getChoiceId$annotations() {
    }

    public static /* synthetic */ void getDisplayedName$annotations() {
    }

    public static /* synthetic */ void getParentDisplayedName$annotations() {
    }

    public static /* synthetic */ void getVerticalImageFullPath$annotations() {
    }

    public static /* synthetic */ void isActive$annotations() {
    }

    public static /* synthetic */ void isChosen$annotations() {
    }

    public /* synthetic */ CategoryEntity(int i11, int i12, String str, String str2, String str3, String str4, int i13, int i14, int i15, int i16, int i17, String str5, Integer num, Integer num2, String str6, Integer num3, int i18, int i19, String str7, String str8, String str9, String str10, int i21, int i22, String str11, CategoryType categoryType, String str12, String str13, Integer num4, String str14, int i23, String str15, String str16, int i24, String str17, String str18, String str19, int i25, int i26, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, str, str2, str3, str4, i13, i14, i15, i16, i17, str5, num, num2, str6, num3, i18, i19, str7, str8, str9, (i25 & 2097152) != 0 ? "DEFAULT" : str10, i21, i22, str11, (i25 & 33554432) != 0 ? CategoryType.NONE : categoryType, str12, str13, num4, str14, (i25 & 1073741824) != 0 ? 0 : i23, str15, str16, (i26 & 2) != 0 ? 0 : i24, str17, str18, str19);
    }
}

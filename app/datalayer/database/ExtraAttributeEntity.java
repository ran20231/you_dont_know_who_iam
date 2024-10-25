package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TypeExtensionsKt;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ExtraAttributeEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributeEntity {
    public static final String DISPLAY_ORDER = "display_order";
    public static final String EXTRA_ATTRIBUTES_TABLE = "extra_attributes";
    public static final String EXTRA_ATTRIBUTE_GROUP_ID = "extra_attribute_group_id";
    public static final String ID = "id";
    public static final String IMAGE = "image";
    public static final String IS_ACTIVE = "is_active";
    public static final String IS_INT = "is_int";
    public static final String IS_REQUIRED = "is_required";
    public static final String MAX = "max";
    public static final String MIN = "min";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String REGION_ID = "region_id";
    public static final String SCOPE = "scope";
    public static final String SLIDER_STEPS = "slider_steps";
    public static final String SUB_TYPE = "sub_type";
    public static final String SYSTEM_NAME = "system_name";
    public static final String TYPE = "type";
    public static final String VALIDATE_MAX = "validate_max";
    public static final String VALIDATE_MIN = "validate_min";
    @c(CategoryEntity.IS_FILTERABLE)
    private final int _isFilterable;
    @c("display_order")
    private final Integer displayOrder;
    @c("exposed_type")
    private final ListingsResponse.UISettings.FiltrationSetting.ExposeType exposedType;
    @c("extra_attribute_group_id")
    private final Integer extraAttributeGroupId;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22310id;
    @c("image")
    private final String image;
    @c("is_active")
    private int isActive;
    @c("is_int")
    private final int isInt;
    @c("is_required")
    private final Integer isRequired;
    @c("max")
    private final int max;
    @c("min")
    private final int min;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    @c("scope")
    private final String scope;
    @c("selection_type")
    private final ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType;
    @c("slider_steps")
    private final Integer sliderSteps;
    @c("sub_type")
    private final String subType;
    @c("system_name")
    private final String systemName;
    @c("type")
    private final String type;
    @c("unit")
    private final AttrUnit unit;
    @c("validate_max")
    private final int validateMax;
    @c("validate_min")
    private final int validateMin;
    @c("view_type")
    private final ListingsResponse.UISettings.FiltrationSetting.ViewType viewType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ExtraAttributeEntity.kt */
    /* loaded from: classes2.dex */
    public static final class AttrUnit implements Serializable {
        public static final int $stable = 0;
        @c(SearchPlaceholderKeywordEntity.AR)

        /* renamed from: ar  reason: collision with root package name */
        private final LocalUnit f22311ar;
        @c(SearchPlaceholderKeywordEntity.EN)

        /* renamed from: en  reason: collision with root package name */
        private final LocalUnit f22312en;

        public AttrUnit(LocalUnit en2, LocalUnit ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            this.f22312en = en2;
            this.f22311ar = ar2;
        }

        public static /* synthetic */ AttrUnit copy$default(AttrUnit attrUnit, LocalUnit localUnit, LocalUnit localUnit2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                localUnit = attrUnit.f22312en;
            }
            if ((i11 & 2) != 0) {
                localUnit2 = attrUnit.f22311ar;
            }
            return attrUnit.copy(localUnit, localUnit2);
        }

        public final LocalUnit component1() {
            return this.f22312en;
        }

        public final LocalUnit component2() {
            return this.f22311ar;
        }

        public final AttrUnit copy(LocalUnit en2, LocalUnit ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            return new AttrUnit(en2, ar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttrUnit)) {
                return false;
            }
            AttrUnit attrUnit = (AttrUnit) obj;
            if (o.d(this.f22312en, attrUnit.f22312en) && o.d(this.f22311ar, attrUnit.f22311ar)) {
                return true;
            }
            return false;
        }

        public final LocalUnit getAr() {
            return this.f22311ar;
        }

        public final LocalUnit getEn() {
            return this.f22312en;
        }

        public final LocalUnit getUnit() {
            if (LocaleManager.f39597a.r()) {
                return this.f22311ar;
            }
            return this.f22312en;
        }

        public int hashCode() {
            return (this.f22312en.hashCode() * 31) + this.f22311ar.hashCode();
        }

        public String toString() {
            LocalUnit localUnit = this.f22312en;
            LocalUnit localUnit2 = this.f22311ar;
            return "AttrUnit(en=" + localUnit + ", ar=" + localUnit2 + ")";
        }
    }

    /* compiled from: ExtraAttributeEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExtraAttributeEntity(int i11, String type, String nameAr, String nameEn, String systemName, Integer num, Integer num2, int i12, int i13, int i14, int i15, Integer num3, int i16, String image, Integer num4, String str, String scope, AttrUnit attrUnit, ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType, ListingsResponse.UISettings.FiltrationSetting.ExposeType exposedType, ListingsResponse.UISettings.FiltrationSetting.ViewType viewType, int i17) {
        o.i(type, "type");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(scope, "scope");
        o.i(selectionType, "selectionType");
        o.i(exposedType, "exposedType");
        o.i(viewType, "viewType");
        this.f22310id = i11;
        this.type = type;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.systemName = systemName;
        this.isRequired = num;
        this.displayOrder = num2;
        this.min = i12;
        this.max = i13;
        this.validateMin = i14;
        this.validateMax = i15;
        this.sliderSteps = num3;
        this.isInt = i16;
        this.image = image;
        this.extraAttributeGroupId = num4;
        this.subType = str;
        this.scope = scope;
        this.unit = attrUnit;
        this.selectionType = selectionType;
        this.exposedType = exposedType;
        this.viewType = viewType;
        this._isFilterable = i17;
        this.isActive = 1;
    }

    public final int component1() {
        return this.f22310id;
    }

    public final int component10() {
        return this.validateMin;
    }

    public final int component11() {
        return this.validateMax;
    }

    public final Integer component12() {
        return this.sliderSteps;
    }

    public final int component13() {
        return this.isInt;
    }

    public final String component14() {
        return this.image;
    }

    public final Integer component15() {
        return this.extraAttributeGroupId;
    }

    public final String component16() {
        return this.subType;
    }

    public final String component17() {
        return this.scope;
    }

    public final AttrUnit component18() {
        return this.unit;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.SelectionType component19() {
        return this.selectionType;
    }

    public final String component2() {
        return this.type;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.ExposeType component20() {
        return this.exposedType;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.ViewType component21() {
        return this.viewType;
    }

    public final int component22() {
        return this._isFilterable;
    }

    public final String component3() {
        return this.nameAr;
    }

    public final String component4() {
        return this.nameEn;
    }

    public final String component5() {
        return this.systemName;
    }

    public final Integer component6() {
        return this.isRequired;
    }

    public final Integer component7() {
        return this.displayOrder;
    }

    public final int component8() {
        return this.min;
    }

    public final int component9() {
        return this.max;
    }

    public final ExtraAttributeEntity copy(int i11, String type, String nameAr, String nameEn, String systemName, Integer num, Integer num2, int i12, int i13, int i14, int i15, Integer num3, int i16, String image, Integer num4, String str, String scope, AttrUnit attrUnit, ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType, ListingsResponse.UISettings.FiltrationSetting.ExposeType exposedType, ListingsResponse.UISettings.FiltrationSetting.ViewType viewType, int i17) {
        o.i(type, "type");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(scope, "scope");
        o.i(selectionType, "selectionType");
        o.i(exposedType, "exposedType");
        o.i(viewType, "viewType");
        return new ExtraAttributeEntity(i11, type, nameAr, nameEn, systemName, num, num2, i12, i13, i14, i15, num3, i16, image, num4, str, scope, attrUnit, selectionType, exposedType, viewType, i17);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraAttributeEntity)) {
            return false;
        }
        ExtraAttributeEntity extraAttributeEntity = (ExtraAttributeEntity) obj;
        if (this.f22310id == extraAttributeEntity.f22310id && o.d(this.type, extraAttributeEntity.type) && o.d(this.nameAr, extraAttributeEntity.nameAr) && o.d(this.nameEn, extraAttributeEntity.nameEn) && o.d(this.systemName, extraAttributeEntity.systemName) && o.d(this.isRequired, extraAttributeEntity.isRequired) && o.d(this.displayOrder, extraAttributeEntity.displayOrder) && this.min == extraAttributeEntity.min && this.max == extraAttributeEntity.max && this.validateMin == extraAttributeEntity.validateMin && this.validateMax == extraAttributeEntity.validateMax && o.d(this.sliderSteps, extraAttributeEntity.sliderSteps) && this.isInt == extraAttributeEntity.isInt && o.d(this.image, extraAttributeEntity.image) && o.d(this.extraAttributeGroupId, extraAttributeEntity.extraAttributeGroupId) && o.d(this.subType, extraAttributeEntity.subType) && o.d(this.scope, extraAttributeEntity.scope) && o.d(this.unit, extraAttributeEntity.unit) && this.selectionType == extraAttributeEntity.selectionType && this.exposedType == extraAttributeEntity.exposedType && this.viewType == extraAttributeEntity.viewType && this._isFilterable == extraAttributeEntity._isFilterable) {
            return true;
        }
        return false;
    }

    public final Integer getDisplayOrder() {
        return this.displayOrder;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.ExposeType getExposedType() {
        return this.exposedType;
    }

    public final Integer getExtraAttributeGroupId() {
        return this.extraAttributeGroupId;
    }

    public final int getId() {
        return this.f22310id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getMax() {
        return this.max;
    }

    public final int getMin() {
        return this.min;
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

    public final String getScope() {
        return this.scope;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.SelectionType getSelectionType() {
        return this.selectionType;
    }

    public final Integer getSliderSteps() {
        return this.sliderSteps;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getSystemName() {
        return this.systemName;
    }

    public final String getType() {
        return this.type;
    }

    public final AttrUnit getUnit() {
        return this.unit;
    }

    public final int getValidateMax() {
        return this.validateMax;
    }

    public final int getValidateMin() {
        return this.validateMin;
    }

    public final ListingsResponse.UISettings.FiltrationSetting.ViewType getViewType() {
        return this.viewType;
    }

    public final int get_isFilterable() {
        return this._isFilterable;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((((((((Integer.hashCode(this.f22310id) * 31) + this.type.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + this.systemName.hashCode()) * 31;
        Integer num = this.isRequired;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode6 + hashCode) * 31;
        Integer num2 = this.displayOrder;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode7 = (((((((((i12 + hashCode2) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.validateMin)) * 31) + Integer.hashCode(this.validateMax)) * 31;
        Integer num3 = this.sliderSteps;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int hashCode8 = (((((hashCode7 + hashCode3) * 31) + Integer.hashCode(this.isInt)) * 31) + this.image.hashCode()) * 31;
        Integer num4 = this.extraAttributeGroupId;
        if (num4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num4.hashCode();
        }
        int i13 = (hashCode8 + hashCode4) * 31;
        String str = this.subType;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int hashCode9 = (((i13 + hashCode5) * 31) + this.scope.hashCode()) * 31;
        AttrUnit attrUnit = this.unit;
        if (attrUnit != null) {
            i11 = attrUnit.hashCode();
        }
        return ((((((((hashCode9 + i11) * 31) + this.selectionType.hashCode()) * 31) + this.exposedType.hashCode()) * 31) + this.viewType.hashCode()) * 31) + Integer.hashCode(this._isFilterable);
    }

    public final int isActive() {
        return this.isActive;
    }

    public final boolean isFilterable() {
        return TypeExtensionsKt.h0(this._isFilterable);
    }

    public final int isInt() {
        return this.isInt;
    }

    public final Integer isRequired() {
        return this.isRequired;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public String toString() {
        int i11 = this.f22310id;
        String str = this.type;
        String str2 = this.nameAr;
        String str3 = this.nameEn;
        String str4 = this.systemName;
        Integer num = this.isRequired;
        Integer num2 = this.displayOrder;
        int i12 = this.min;
        int i13 = this.max;
        int i14 = this.validateMin;
        int i15 = this.validateMax;
        Integer num3 = this.sliderSteps;
        int i16 = this.isInt;
        String str5 = this.image;
        Integer num4 = this.extraAttributeGroupId;
        String str6 = this.subType;
        String str7 = this.scope;
        AttrUnit attrUnit = this.unit;
        ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType = this.selectionType;
        ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType = this.exposedType;
        ListingsResponse.UISettings.FiltrationSetting.ViewType viewType = this.viewType;
        int i17 = this._isFilterable;
        return "ExtraAttributeEntity(id=" + i11 + ", type=" + str + ", nameAr=" + str2 + ", nameEn=" + str3 + ", systemName=" + str4 + ", isRequired=" + num + ", displayOrder=" + num2 + ", min=" + i12 + ", max=" + i13 + ", validateMin=" + i14 + ", validateMax=" + i15 + ", sliderSteps=" + num3 + ", isInt=" + i16 + ", image=" + str5 + ", extraAttributeGroupId=" + num4 + ", subType=" + str6 + ", scope=" + str7 + ", unit=" + attrUnit + ", selectionType=" + selectionType + ", exposedType=" + exposeType + ", viewType=" + viewType + ", _isFilterable=" + i17 + ")";
    }

    /* compiled from: ExtraAttributeEntity.kt */
    /* loaded from: classes2.dex */
    public static final class LocalUnit implements Serializable {
        public static final int $stable = 0;
        @c("dual")
        private final String dual;
        @c("plural")
        private final String plural;
        @c("singular")
        private final String singular;

        public LocalUnit(String singular, String str, String plural) {
            o.i(singular, "singular");
            o.i(plural, "plural");
            this.singular = singular;
            this.dual = str;
            this.plural = plural;
        }

        public static /* synthetic */ LocalUnit copy$default(LocalUnit localUnit, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = localUnit.singular;
            }
            if ((i11 & 2) != 0) {
                str2 = localUnit.dual;
            }
            if ((i11 & 4) != 0) {
                str3 = localUnit.plural;
            }
            return localUnit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.singular;
        }

        public final String component2() {
            return this.dual;
        }

        public final String component3() {
            return this.plural;
        }

        public final LocalUnit copy(String singular, String str, String plural) {
            o.i(singular, "singular");
            o.i(plural, "plural");
            return new LocalUnit(singular, str, plural);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalUnit)) {
                return false;
            }
            LocalUnit localUnit = (LocalUnit) obj;
            if (o.d(this.singular, localUnit.singular) && o.d(this.dual, localUnit.dual) && o.d(this.plural, localUnit.plural)) {
                return true;
            }
            return false;
        }

        public final String getDual() {
            return this.dual;
        }

        public final String getPlural() {
            return this.plural;
        }

        public final String getSingular() {
            return this.singular;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.singular.hashCode() * 31;
            String str = this.dual;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.plural.hashCode();
        }

        public String toString() {
            String str = this.singular;
            String str2 = this.dual;
            String str3 = this.plural;
            return "LocalUnit(singular=" + str + ", dual=" + str2 + ", plural=" + str3 + ")";
        }

        public /* synthetic */ LocalUnit(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ ExtraAttributeEntity(int i11, String str, String str2, String str3, String str4, Integer num, Integer num2, int i12, int i13, int i14, int i15, Integer num3, int i16, String str5, Integer num4, String str6, String str7, AttrUnit attrUnit, ListingsResponse.UISettings.FiltrationSetting.SelectionType selectionType, ListingsResponse.UISettings.FiltrationSetting.ExposeType exposeType, ListingsResponse.UISettings.FiltrationSetting.ViewType viewType, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, num, num2, i12, i13, i14, i15, num3, i16, str5, num4, str6, str7, (i18 & 131072) != 0 ? null : attrUnit, selectionType, exposeType, viewType, i17);
    }
}

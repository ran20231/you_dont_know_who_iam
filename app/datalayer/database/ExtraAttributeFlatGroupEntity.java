package com.forsale.app.datalayer.database;

import com.forsale.app.features.postad.extraattributes.enums.AttributeSubtype;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import okhttp3.internal.http2.Http2Connection;
import up.c;
/* compiled from: ExtraAttributeFlatGroupEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributeFlatGroupEntity {
    public static final String DISPLAY_ORDER = "display_order";
    public static final String EXTRA_ATTRIBUTES_FLAT_GROUP_TABLE = "extra_attributes_flat_group";
    public static final String EXTRA_ATTRIBUTE_GROUP_ID = "extra_attribute_group_id";
    public static final String GROUP_DISPLAY_ORDER = "group_display_order";
    public static final String GROUP_ID = "group_id";
    public static final String GROUP_NAME_AR = "group_name_ar";
    public static final String GROUP_NAME_EN = "group_name_en";
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
    @c("display_order")
    private final int displayOrder;
    @c("extra_attribute_group_id")
    private final Integer extraAttributeGroupId;
    private String fileName;
    @c(GROUP_DISPLAY_ORDER)
    private final int groupDisplayOrder;
    @c(GROUP_ID)
    private final Integer groupId;
    @c(GROUP_NAME_AR)
    private final String groupNameAr;
    @c(GROUP_NAME_EN)
    private final String groupNameEn;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22313id;
    @c("image")
    private final String image;
    private boolean isChecked;
    @c("is_int")
    private final int isInt;
    @c("is_required")
    private final int isRequired;
    private boolean isValid;
    @c("max")
    private final int max;
    private String maxValue;
    @c("min")
    private final int min;
    private String minValue;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    private int optionId;
    private transient ArrayList<String> prohibtedKeywords;
    @c("scope")
    private final String scope;
    @c("slider_steps")
    private final Integer sliderSteps;
    @c("sub_type")
    private final String subType;
    @c("system_name")
    private final String systemName;
    private String textNumValue;
    @c("type")
    private final String type;
    @c("validate_max")
    private final int validateMax;
    @c("validate_min")
    private final int validateMin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ExtraAttributeFlatGroupEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExtraAttributeFlatGroupEntity(int i11, String type, String nameAr, String nameEn, String systemName, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, int i18, String image, Integer num2, String str, String scope, Integer num3, String str2, String str3, int i19, boolean z11, String str4, int i21, String str5, String str6, String str7) {
        o.i(type, "type");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(scope, "scope");
        this.f22313id = i11;
        this.type = type;
        this.nameAr = nameAr;
        this.nameEn = nameEn;
        this.systemName = systemName;
        this.isRequired = i12;
        this.displayOrder = i13;
        this.min = i14;
        this.max = i15;
        this.validateMin = i16;
        this.validateMax = i17;
        this.sliderSteps = num;
        this.isInt = i18;
        this.image = image;
        this.extraAttributeGroupId = num2;
        this.subType = str;
        this.scope = scope;
        this.groupId = num3;
        this.groupNameAr = str2;
        this.groupNameEn = str3;
        this.groupDisplayOrder = i19;
        this.isChecked = z11;
        this.textNumValue = str4;
        this.optionId = i21;
        this.minValue = str5;
        this.maxValue = str6;
        this.fileName = str7;
        this.isValid = true;
        this.prohibtedKeywords = new ArrayList<>();
    }

    public final int component1() {
        return this.f22313id;
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

    public final Integer component18() {
        return this.groupId;
    }

    public final String component19() {
        return this.groupNameAr;
    }

    public final String component2() {
        return this.type;
    }

    public final String component20() {
        return this.groupNameEn;
    }

    public final int component21() {
        return this.groupDisplayOrder;
    }

    public final boolean component22() {
        return this.isChecked;
    }

    public final String component23() {
        return this.textNumValue;
    }

    public final int component24() {
        return this.optionId;
    }

    public final String component25() {
        return this.minValue;
    }

    public final String component26() {
        return this.maxValue;
    }

    public final String component27() {
        return this.fileName;
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

    public final int component6() {
        return this.isRequired;
    }

    public final int component7() {
        return this.displayOrder;
    }

    public final int component8() {
        return this.min;
    }

    public final int component9() {
        return this.max;
    }

    public final ExtraAttributeFlatGroupEntity copy(int i11, String type, String nameAr, String nameEn, String systemName, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, int i18, String image, Integer num2, String str, String scope, Integer num3, String str2, String str3, int i19, boolean z11, String str4, int i21, String str5, String str6, String str7) {
        o.i(type, "type");
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        o.i(systemName, "systemName");
        o.i(image, "image");
        o.i(scope, "scope");
        return new ExtraAttributeFlatGroupEntity(i11, type, nameAr, nameEn, systemName, i12, i13, i14, i15, i16, i17, num, i18, image, num2, str, scope, num3, str2, str3, i19, z11, str4, i21, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraAttributeFlatGroupEntity)) {
            return false;
        }
        ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity = (ExtraAttributeFlatGroupEntity) obj;
        if (this.f22313id == extraAttributeFlatGroupEntity.f22313id && o.d(this.type, extraAttributeFlatGroupEntity.type) && o.d(this.nameAr, extraAttributeFlatGroupEntity.nameAr) && o.d(this.nameEn, extraAttributeFlatGroupEntity.nameEn) && o.d(this.systemName, extraAttributeFlatGroupEntity.systemName) && this.isRequired == extraAttributeFlatGroupEntity.isRequired && this.displayOrder == extraAttributeFlatGroupEntity.displayOrder && this.min == extraAttributeFlatGroupEntity.min && this.max == extraAttributeFlatGroupEntity.max && this.validateMin == extraAttributeFlatGroupEntity.validateMin && this.validateMax == extraAttributeFlatGroupEntity.validateMax && o.d(this.sliderSteps, extraAttributeFlatGroupEntity.sliderSteps) && this.isInt == extraAttributeFlatGroupEntity.isInt && o.d(this.image, extraAttributeFlatGroupEntity.image) && o.d(this.extraAttributeGroupId, extraAttributeFlatGroupEntity.extraAttributeGroupId) && o.d(this.subType, extraAttributeFlatGroupEntity.subType) && o.d(this.scope, extraAttributeFlatGroupEntity.scope) && o.d(this.groupId, extraAttributeFlatGroupEntity.groupId) && o.d(this.groupNameAr, extraAttributeFlatGroupEntity.groupNameAr) && o.d(this.groupNameEn, extraAttributeFlatGroupEntity.groupNameEn) && this.groupDisplayOrder == extraAttributeFlatGroupEntity.groupDisplayOrder && this.isChecked == extraAttributeFlatGroupEntity.isChecked && o.d(this.textNumValue, extraAttributeFlatGroupEntity.textNumValue) && this.optionId == extraAttributeFlatGroupEntity.optionId && o.d(this.minValue, extraAttributeFlatGroupEntity.minValue) && o.d(this.maxValue, extraAttributeFlatGroupEntity.maxValue) && o.d(this.fileName, extraAttributeFlatGroupEntity.fileName)) {
            return true;
        }
        return false;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    public final Integer getExtraAttributeGroupId() {
        return this.extraAttributeGroupId;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getGetUserValue() {
        boolean d11;
        String str = this.type;
        if (o.d(str, AttributeType.TEXT.getValue())) {
            d11 = true;
        } else {
            d11 = o.d(str, AttributeType.NUMBER.getValue());
        }
        if (d11) {
            String str2 = this.textNumValue;
            if (str2 != null) {
                return str2;
            }
            return "";
        } else if (o.d(str, AttributeType.BOOL.getValue())) {
            boolean z11 = this.isChecked;
            if (z11) {
                return String.valueOf(TypeExtensionsKt.H0(z11));
            }
            return "";
        } else if (o.d(str, AttributeType.DROP_DOWN.getValue())) {
            int i11 = this.optionId;
            if (i11 != 0) {
                return String.valueOf(i11);
            }
            return "";
        } else if (o.d(str, AttributeType.FILE.getValue())) {
            return this.fileName;
        } else {
            return "";
        }
    }

    public final int getGroupDisplayOrder() {
        return this.groupDisplayOrder;
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final String getGroupName() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.groupNameEn;
        }
        return this.groupNameAr;
    }

    public final String getGroupNameAr() {
        return this.groupNameAr;
    }

    public final String getGroupNameEn() {
        return this.groupNameEn;
    }

    public final int getId() {
        return this.f22313id;
    }

    public final String getImage() {
        return this.image;
    }

    public final int getMax() {
        return this.max;
    }

    public final String getMaxValue() {
        return this.maxValue;
    }

    public final int getMin() {
        return this.min;
    }

    public final String getMinValue() {
        return this.minValue;
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

    public final int getOptionId() {
        return this.optionId;
    }

    public final ArrayList<String> getProhibtedKeywords() {
        return this.prohibtedKeywords;
    }

    public final String getScope() {
        return this.scope;
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

    public final String getTextNumValue() {
        return this.textNumValue;
    }

    public final String getType() {
        return this.type;
    }

    public final int getTypeDisplayOrder() {
        String str = this.type;
        if (o.d(str, AttributeType.DROP_DOWN.getValue())) {
            if (o.d(this.subType, AttributeSubtype.VERTICAL.getValue())) {
                return 1;
            }
            return 2;
        } else if (o.d(str, AttributeType.NUMBER.getValue())) {
            return 3;
        } else {
            if (o.d(str, AttributeType.TEXT.getValue())) {
                return 4;
            }
            if (o.d(str, AttributeType.BOOL.getValue())) {
                return 5;
            }
            if (o.d(str, AttributeType.FILE.getValue())) {
                return 6;
            }
            return 7;
        }
    }

    public final int getValidateMax() {
        return this.validateMax;
    }

    public final int getValidateMin() {
        return this.validateMin;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode10 = ((((((((((((((((((((Integer.hashCode(this.f22313id) * 31) + this.type.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31) + this.systemName.hashCode()) * 31) + Integer.hashCode(this.isRequired)) * 31) + Integer.hashCode(this.displayOrder)) * 31) + Integer.hashCode(this.min)) * 31) + Integer.hashCode(this.max)) * 31) + Integer.hashCode(this.validateMin)) * 31) + Integer.hashCode(this.validateMax)) * 31;
        Integer num = this.sliderSteps;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode11 = (((((hashCode10 + hashCode) * 31) + Integer.hashCode(this.isInt)) * 31) + this.image.hashCode()) * 31;
        Integer num2 = this.extraAttributeGroupId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i12 = (hashCode11 + hashCode2) * 31;
        String str = this.subType;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int hashCode12 = (((i12 + hashCode3) * 31) + this.scope.hashCode()) * 31;
        Integer num3 = this.groupId;
        if (num3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num3.hashCode();
        }
        int i13 = (hashCode12 + hashCode4) * 31;
        String str2 = this.groupNameAr;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i14 = (i13 + hashCode5) * 31;
        String str3 = this.groupNameEn;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int hashCode13 = (((i14 + hashCode6) * 31) + Integer.hashCode(this.groupDisplayOrder)) * 31;
        boolean z11 = this.isChecked;
        int i15 = z11;
        if (z11 != 0) {
            i15 = 1;
        }
        int i16 = (hashCode13 + i15) * 31;
        String str4 = this.textNumValue;
        if (str4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str4.hashCode();
        }
        int hashCode14 = (((i16 + hashCode7) * 31) + Integer.hashCode(this.optionId)) * 31;
        String str5 = this.minValue;
        if (str5 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str5.hashCode();
        }
        int i17 = (hashCode14 + hashCode8) * 31;
        String str6 = this.maxValue;
        if (str6 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str6.hashCode();
        }
        int i18 = (i17 + hashCode9) * 31;
        String str7 = this.fileName;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return i18 + i11;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final int isInt() {
        return this.isInt;
    }

    public final int isRequired() {
        return this.isRequired;
    }

    public final boolean isValid() {
        return this.isValid;
    }

    public final void setChecked(boolean z11) {
        this.isChecked = z11;
    }

    public final void setFileName(String str) {
        this.fileName = str;
    }

    public final void setGetUserValue(String str) {
        boolean d11;
        if (str != null) {
            String str2 = this.type;
            if (o.d(str2, AttributeType.TEXT.getValue())) {
                d11 = true;
            } else {
                d11 = o.d(str2, AttributeType.NUMBER.getValue());
            }
            if (d11) {
                this.textNumValue = str;
            } else if (o.d(str2, AttributeType.BOOL.getValue())) {
                this.isChecked = Boolean.parseBoolean(str);
            } else if (o.d(str2, AttributeType.DROP_DOWN.getValue())) {
                this.optionId = Integer.parseInt(str);
            } else if (o.d(str2, AttributeType.FILE.getValue())) {
                this.fileName = str;
            }
        }
    }

    public final void setMaxValue(String str) {
        this.maxValue = str;
    }

    public final void setMinValue(String str) {
        this.minValue = str;
    }

    public final void setOptionId(int i11) {
        this.optionId = i11;
    }

    public final void setProhibtedKeywords(ArrayList<String> arrayList) {
        o.i(arrayList, "<set-?>");
        this.prohibtedKeywords = arrayList;
    }

    public final void setTextNumValue(String str) {
        this.textNumValue = str;
    }

    public final void setValid(boolean z11) {
        this.isValid = z11;
    }

    public String toString() {
        int i11 = this.f22313id;
        String str = this.type;
        String str2 = this.nameAr;
        String str3 = this.nameEn;
        String str4 = this.systemName;
        int i12 = this.isRequired;
        int i13 = this.displayOrder;
        int i14 = this.min;
        int i15 = this.max;
        int i16 = this.validateMin;
        int i17 = this.validateMax;
        Integer num = this.sliderSteps;
        int i18 = this.isInt;
        String str5 = this.image;
        Integer num2 = this.extraAttributeGroupId;
        String str6 = this.subType;
        String str7 = this.scope;
        Integer num3 = this.groupId;
        String str8 = this.groupNameAr;
        String str9 = this.groupNameEn;
        int i19 = this.groupDisplayOrder;
        boolean z11 = this.isChecked;
        String str10 = this.textNumValue;
        int i21 = this.optionId;
        String str11 = this.minValue;
        String str12 = this.maxValue;
        String str13 = this.fileName;
        return "ExtraAttributeFlatGroupEntity(id=" + i11 + ", type=" + str + ", nameAr=" + str2 + ", nameEn=" + str3 + ", systemName=" + str4 + ", isRequired=" + i12 + ", displayOrder=" + i13 + ", min=" + i14 + ", max=" + i15 + ", validateMin=" + i16 + ", validateMax=" + i17 + ", sliderSteps=" + num + ", isInt=" + i18 + ", image=" + str5 + ", extraAttributeGroupId=" + num2 + ", subType=" + str6 + ", scope=" + str7 + ", groupId=" + num3 + ", groupNameAr=" + str8 + ", groupNameEn=" + str9 + ", groupDisplayOrder=" + i19 + ", isChecked=" + z11 + ", textNumValue=" + str10 + ", optionId=" + i21 + ", minValue=" + str11 + ", maxValue=" + str12 + ", fileName=" + str13 + ")";
    }

    public /* synthetic */ ExtraAttributeFlatGroupEntity(int i11, String str, String str2, String str3, String str4, int i12, int i13, int i14, int i15, int i16, int i17, Integer num, int i18, String str5, Integer num2, String str6, String str7, Integer num3, String str8, String str9, int i19, boolean z11, String str10, int i21, String str11, String str12, String str13, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, str, str2, str3, str4, i12, i13, i14, i15, i16, i17, num, i18, str5, num2, str6, str7, num3, str8, str9, i19, (i22 & 2097152) != 0 ? false : z11, (i22 & 4194304) != 0 ? "" : str10, (i22 & 8388608) != 0 ? 0 : i21, (i22 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "" : str11, (i22 & 33554432) != 0 ? "" : str12, (i22 & 67108864) != 0 ? "" : str13);
    }
}

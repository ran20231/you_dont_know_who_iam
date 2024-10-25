package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import hi.b;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ExtraAttributeOptionEntity.kt */
/* loaded from: classes2.dex */
public final class ExtraAttributeOptionEntity implements b, Serializable {
    public static final String ATTRIBUTE_ID = "attribute_id";
    public static final String DISPLAY_ORDER = "display_order";
    public static final String EXTRA_ATTRIBUTE_OPTIONS_TABLE = "extra_attribute_options";
    public static final String ID = "id";
    public static final String IS_ACTIVE = "is_active";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String REGION_ID = "region_id";
    @c("attribute_id")
    private final int attributeId;
    private List<Integer> cousinIdsList;
    @c("display_order")
    private final int displayOrder;
    private int displayOrderSort;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22315id;
    @c("is_active")
    private int isActive;
    private String label;
    private String labelAr;
    private String labelEn;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    private Integer parentID;
    private Integer selectableResId;
    private int selectedId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ExtraAttributeOptionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ExtraAttributeOptionEntity(int i11, int i12, int i13, String nameEn, String nameAr) {
        List<Integer> e11;
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        this.f22315id = i11;
        this.attributeId = i12;
        this.displayOrder = i13;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.isActive = 1;
        this.selectedId = i11;
        this.label = getName();
        this.labelAr = nameAr;
        this.labelEn = nameEn;
        this.displayOrderSort = i13;
        e11 = q.e(Integer.valueOf(getSelectedId()));
        this.cousinIdsList = e11;
    }

    public static /* synthetic */ ExtraAttributeOptionEntity copy$default(ExtraAttributeOptionEntity extraAttributeOptionEntity, int i11, int i12, int i13, String str, String str2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = extraAttributeOptionEntity.f22315id;
        }
        if ((i14 & 2) != 0) {
            i12 = extraAttributeOptionEntity.attributeId;
        }
        int i15 = i12;
        if ((i14 & 4) != 0) {
            i13 = extraAttributeOptionEntity.displayOrder;
        }
        int i16 = i13;
        if ((i14 & 8) != 0) {
            str = extraAttributeOptionEntity.nameEn;
        }
        String str3 = str;
        if ((i14 & 16) != 0) {
            str2 = extraAttributeOptionEntity.nameAr;
        }
        return extraAttributeOptionEntity.copy(i11, i15, i16, str3, str2);
    }

    public final int component1() {
        return this.f22315id;
    }

    public final int component2() {
        return this.attributeId;
    }

    public final int component3() {
        return this.displayOrder;
    }

    public final String component4() {
        return this.nameEn;
    }

    public final String component5() {
        return this.nameAr;
    }

    public final ExtraAttributeOptionEntity copy(int i11, int i12, int i13, String nameEn, String nameAr) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        return new ExtraAttributeOptionEntity(i11, i12, i13, nameEn, nameAr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraAttributeOptionEntity)) {
            return false;
        }
        ExtraAttributeOptionEntity extraAttributeOptionEntity = (ExtraAttributeOptionEntity) obj;
        if (this.f22315id == extraAttributeOptionEntity.f22315id && this.attributeId == extraAttributeOptionEntity.attributeId && this.displayOrder == extraAttributeOptionEntity.displayOrder && o.d(this.nameEn, extraAttributeOptionEntity.nameEn) && o.d(this.nameAr, extraAttributeOptionEntity.nameAr)) {
            return true;
        }
        return false;
    }

    public final int getAttributeId() {
        return this.attributeId;
    }

    @Override // hi.b
    public List<Integer> getCousinIdsList() {
        return this.cousinIdsList;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    @Override // hi.b
    public int getDisplayOrderSort() {
        return this.displayOrderSort;
    }

    public final int getId() {
        return this.f22315id;
    }

    @Override // hi.b
    public String getLabel() {
        return this.label;
    }

    @Override // hi.b
    public String getLabelAr() {
        return this.labelAr;
    }

    @Override // hi.b
    public String getLabelEn() {
        return this.labelEn;
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

    @Override // hi.b
    public Integer getParentID() {
        return this.parentID;
    }

    @Override // hi.b
    public Integer getSelectableResId() {
        return this.selectableResId;
    }

    @Override // hi.b
    public int getSelectedId() {
        return this.selectedId;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f22315id) * 31) + Integer.hashCode(this.attributeId)) * 31) + Integer.hashCode(this.displayOrder)) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode();
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i11) {
        this.isActive = i11;
    }

    public void setCousinIdsList(List<Integer> list) {
        o.i(list, "<set-?>");
        this.cousinIdsList = list;
    }

    public void setDisplayOrderSort(int i11) {
        this.displayOrderSort = i11;
    }

    public void setLabel(String str) {
        o.i(str, "<set-?>");
        this.label = str;
    }

    public void setLabelAr(String str) {
        o.i(str, "<set-?>");
        this.labelAr = str;
    }

    public void setLabelEn(String str) {
        o.i(str, "<set-?>");
        this.labelEn = str;
    }

    public void setParentID(Integer num) {
        this.parentID = num;
    }

    public void setSelectableResId(Integer num) {
        this.selectableResId = num;
    }

    @Override // hi.b
    public void setSelectedId(int i11) {
        this.selectedId = i11;
    }

    public String toString() {
        int i11 = this.f22315id;
        int i12 = this.attributeId;
        int i13 = this.displayOrder;
        String str = this.nameEn;
        String str2 = this.nameAr;
        return "ExtraAttributeOptionEntity(id=" + i11 + ", attributeId=" + i12 + ", displayOrder=" + i13 + ", nameEn=" + str + ", nameAr=" + str2 + ")";
    }
}

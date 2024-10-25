package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import hi.b;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: CategoryView.kt */
/* loaded from: classes2.dex */
public final class CategoryView implements b, Serializable {
    public static final int $stable = 8;
    private List<Integer> cousinIdsList;
    @c("display_order")
    private final int displayOrder;
    private int displayOrderSort;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22306id;
    private String label;
    private String labelAr;
    private String labelEn;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    private Integer parentID;
    @c("parent_id")
    private final int parentId;
    @c("region_id")
    private final int regionId;
    private Integer selectableResId;
    private int selectedId;

    public CategoryView(int i11, int i12, int i13, String nameEn, String nameAr, int i14) {
        List<Integer> e11;
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        this.f22306id = i11;
        this.regionId = i12;
        this.parentId = i13;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.displayOrder = i14;
        this.selectedId = i11;
        this.label = getName();
        this.labelAr = nameAr;
        this.labelEn = nameEn;
        this.displayOrderSort = i14;
        e11 = q.e(Integer.valueOf(getSelectedId()));
        this.cousinIdsList = e11;
        this.parentID = Integer.valueOf(i13);
    }

    public static /* synthetic */ CategoryView copy$default(CategoryView categoryView, int i11, int i12, int i13, String str, String str2, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = categoryView.f22306id;
        }
        if ((i15 & 2) != 0) {
            i12 = categoryView.regionId;
        }
        int i16 = i12;
        if ((i15 & 4) != 0) {
            i13 = categoryView.parentId;
        }
        int i17 = i13;
        if ((i15 & 8) != 0) {
            str = categoryView.nameEn;
        }
        String str3 = str;
        if ((i15 & 16) != 0) {
            str2 = categoryView.nameAr;
        }
        String str4 = str2;
        if ((i15 & 32) != 0) {
            i14 = categoryView.displayOrder;
        }
        return categoryView.copy(i11, i16, i17, str3, str4, i14);
    }

    public final int component1() {
        return this.f22306id;
    }

    public final int component2() {
        return this.regionId;
    }

    public final int component3() {
        return this.parentId;
    }

    public final String component4() {
        return this.nameEn;
    }

    public final String component5() {
        return this.nameAr;
    }

    public final int component6() {
        return this.displayOrder;
    }

    public final CategoryView copy(int i11, int i12, int i13, String nameEn, String nameAr, int i14) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        return new CategoryView(i11, i12, i13, nameEn, nameAr, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryView)) {
            return false;
        }
        CategoryView categoryView = (CategoryView) obj;
        if (this.f22306id == categoryView.f22306id && this.regionId == categoryView.regionId && this.parentId == categoryView.parentId && o.d(this.nameEn, categoryView.nameEn) && o.d(this.nameAr, categoryView.nameAr) && this.displayOrder == categoryView.displayOrder) {
            return true;
        }
        return false;
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
        return this.f22306id;
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

    @Override // hi.b
    public Integer getParentID() {
        return this.parentID;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final int getRegionId() {
        return this.regionId;
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
        return (((((((((Integer.hashCode(this.f22306id) * 31) + Integer.hashCode(this.regionId)) * 31) + Integer.hashCode(this.parentId)) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31) + Integer.hashCode(this.displayOrder);
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
        int i11 = this.f22306id;
        int i12 = this.regionId;
        int i13 = this.parentId;
        String str = this.nameEn;
        String str2 = this.nameAr;
        int i14 = this.displayOrder;
        return "CategoryView(id=" + i11 + ", regionId=" + i12 + ", parentId=" + i13 + ", nameEn=" + str + ", nameAr=" + str2 + ", displayOrder=" + i14 + ")";
    }
}

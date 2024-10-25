package com.forsale.app.datalayer.database;

import com.forsale.app.datalayer.network.requestsbodies.AdvancedSearchBody;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TypeExtensionsKt;
import hi.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: DistrictEntity.kt */
/* loaded from: classes2.dex */
public final class DistrictEntity implements Serializable, b {
    public static final String CHILDREN = "children";
    public static final String DISPLAY_ORDER = "display_order";
    public static final String DISTRICTS_TABLE = "districts";
    public static final String ID = "id";
    public static final String IMAGE_AR = "image_ar";
    public static final String IMAGE_EN = "image_en";
    public static final String IS_ACTIVE = "is_active";
    public static final String LEVEL = "level";
    public static final String NAME_AR = "name_ar";
    public static final String NAME_EN = "name_en";
    public static final String PARENTS = "parents";
    public static final String PARENT_ID = "parent_id";
    public static final String REGION_ID = "region_id";
    @c(CHILDREN)
    private final String children;
    private Integer choicableResId;
    private int choiceId;
    private List<Integer> cousinIdsList;
    @c("display_order")
    private final int displayOrder;
    private int displayOrderSort;
    private String displayedName;
    @c("full_path_ar")
    private final String fullPathAr;
    @c("full_path_en")
    private final String fullPathEn;
    @c(AdvancedSearchBody.GEO_LAT)
    private final Double geoLat;
    @c(AdvancedSearchBody.GEO_LON)
    private final Double geoLon;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22309id;
    @c("image")
    private final String image;
    @c("image_ar")
    private final String imageAr;
    @c("image_en")
    private final String imageEn;
    @c("is_active")
    private Integer isActive;
    private boolean isChosen;
    private String label;
    private String labelAr;
    private String labelEn;
    @c(LEVEL)
    private final int level;
    @c("name_ar")
    private final String nameAr;
    @c("name_en")
    private final String nameEn;
    private String parentDisplayedName;
    private Integer parentID;
    @c("parent_id")
    private final int parentId;
    @c(PARENTS)
    private final String parents;
    @c("region_id")
    private final int regionId;
    private Integer selectableResId;
    private int selectedId;
    private ArrayList<DistrictEntity> treeChildren;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DistrictEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public DistrictEntity(int i11, int i12, int i13, String nameEn, String nameAr, String str, String str2, String str3, int i14, int i15, String str4, String str5, Double d11, Double d12, String str6, String str7) {
        List<Integer> e11;
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        this.f22309id = i11;
        this.regionId = i12;
        this.displayOrder = i13;
        this.nameEn = nameEn;
        this.nameAr = nameAr;
        this.image = str;
        this.imageEn = str2;
        this.imageAr = str3;
        this.parentId = i14;
        this.level = i15;
        this.children = str4;
        this.parents = str5;
        this.geoLat = d11;
        this.geoLon = d12;
        this.fullPathAr = str6;
        this.fullPathEn = str7;
        this.isActive = 1;
        this.treeChildren = new ArrayList<>();
        this.displayedName = getName();
        this.choiceId = i11;
        this.selectedId = i11;
        this.label = getName();
        this.labelAr = nameAr;
        this.labelEn = nameEn;
        this.displayOrderSort = i13;
        e11 = q.e(Integer.valueOf(getSelectedId()));
        this.cousinIdsList = e11;
        this.parentID = Integer.valueOf(i14);
    }

    public final int component1() {
        return this.f22309id;
    }

    public final int component10() {
        return this.level;
    }

    public final String component11() {
        return this.children;
    }

    public final String component12() {
        return this.parents;
    }

    public final Double component13() {
        return this.geoLat;
    }

    public final Double component14() {
        return this.geoLon;
    }

    public final String component15() {
        return this.fullPathAr;
    }

    public final String component16() {
        return this.fullPathEn;
    }

    public final int component2() {
        return this.regionId;
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

    public final String component6() {
        return this.image;
    }

    public final String component7() {
        return this.imageEn;
    }

    public final String component8() {
        return this.imageAr;
    }

    public final int component9() {
        return this.parentId;
    }

    public final DistrictEntity copy(int i11, int i12, int i13, String nameEn, String nameAr, String str, String str2, String str3, int i14, int i15, String str4, String str5, Double d11, Double d12, String str6, String str7) {
        o.i(nameEn, "nameEn");
        o.i(nameAr, "nameAr");
        return new DistrictEntity(i11, i12, i13, nameEn, nameAr, str, str2, str3, i14, i15, str4, str5, d11, d12, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DistrictEntity)) {
            return false;
        }
        DistrictEntity districtEntity = (DistrictEntity) obj;
        if (this.f22309id == districtEntity.f22309id && this.regionId == districtEntity.regionId && this.displayOrder == districtEntity.displayOrder && o.d(this.nameEn, districtEntity.nameEn) && o.d(this.nameAr, districtEntity.nameAr) && o.d(this.image, districtEntity.image) && o.d(this.imageEn, districtEntity.imageEn) && o.d(this.imageAr, districtEntity.imageAr) && this.parentId == districtEntity.parentId && this.level == districtEntity.level && o.d(this.children, districtEntity.children) && o.d(this.parents, districtEntity.parents) && o.d(this.geoLat, districtEntity.geoLat) && o.d(this.geoLon, districtEntity.geoLon) && o.d(this.fullPathAr, districtEntity.fullPathAr) && o.d(this.fullPathEn, districtEntity.fullPathEn)) {
            return true;
        }
        return false;
    }

    public final String getChildren() {
        return this.children;
    }

    public Integer getChoicableResId() {
        return this.choicableResId;
    }

    public int getChoiceId() {
        return this.choiceId;
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

    public String getDisplayedName() {
        return this.displayedName;
    }

    public final String getFullPath() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            String str = this.fullPathEn;
            if (str != null) {
                Z02 = StringsKt__StringsKt.Z0(str);
                return Z02.toString();
            }
            return null;
        }
        String str2 = this.fullPathAr;
        if (str2 != null) {
            Z0 = StringsKt__StringsKt.Z0(str2);
            return Z0.toString();
        }
        return null;
    }

    public final String getFullPathAr() {
        return this.fullPathAr;
    }

    public final String getFullPathCustomDelimiter() {
        CharSequence Z0;
        CharSequence Z02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            String str = this.fullPathEn;
            if (str != null) {
                Z02 = StringsKt__StringsKt.Z0(str);
                String obj = Z02.toString();
                if (obj == null) {
                    return null;
                }
                return TypeExtensionsKt.e0(obj);
            }
            return null;
        }
        String str2 = this.fullPathAr;
        if (str2 != null) {
            Z0 = StringsKt__StringsKt.Z0(str2);
            String obj2 = Z0.toString();
            if (obj2 == null) {
                return null;
            }
            return TypeExtensionsKt.e0(obj2);
        }
        return null;
    }

    public final String getFullPathEn() {
        return this.fullPathEn;
    }

    public final String getFullPathReversed() {
        String fullPath = getFullPath();
        if (fullPath == null) {
            return null;
        }
        return TypeExtensionsKt.T0(fullPath, false, false, 3, null);
    }

    public final Double getGeoLat() {
        return this.geoLat;
    }

    public final Double getGeoLon() {
        return this.geoLon;
    }

    public final int getId() {
        return this.f22309id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getImageAr() {
        return this.imageAr;
    }

    public final String getImageEn() {
        return this.imageEn;
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

    public final int getLevel() {
        return this.level;
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

    @Override // hi.b
    public Integer getParentID() {
        return this.parentID;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final String getParents() {
        return this.parents;
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

    public final ArrayList<DistrictEntity> getTreeChildren() {
        return this.treeChildren;
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
        int hashCode9 = ((((((((Integer.hashCode(this.f22309id) * 31) + Integer.hashCode(this.regionId)) * 31) + Integer.hashCode(this.displayOrder)) * 31) + this.nameEn.hashCode()) * 31) + this.nameAr.hashCode()) * 31;
        String str = this.image;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode9 + hashCode) * 31;
        String str2 = this.imageEn;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.imageAr;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode10 = (((((i13 + hashCode3) * 31) + Integer.hashCode(this.parentId)) * 31) + Integer.hashCode(this.level)) * 31;
        String str4 = this.children;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i14 = (hashCode10 + hashCode4) * 31;
        String str5 = this.parents;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Double d11 = this.geoLat;
        if (d11 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = d11.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Double d12 = this.geoLon;
        if (d12 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = d12.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        String str6 = this.fullPathAr;
        if (str6 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str6.hashCode();
        }
        int i18 = (i17 + hashCode8) * 31;
        String str7 = this.fullPathEn;
        if (str7 != null) {
            i11 = str7.hashCode();
        }
        return i18 + i11;
    }

    public final Integer isActive() {
        return this.isActive;
    }

    public boolean isChosen() {
        return this.isChosen;
    }

    public final void setActive(Integer num) {
        this.isActive = num;
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

    public void setCousinIdsList(List<Integer> list) {
        o.i(list, "<set-?>");
        this.cousinIdsList = list;
    }

    public void setDisplayOrderSort(int i11) {
        this.displayOrderSort = i11;
    }

    public void setDisplayedName(String str) {
        o.i(str, "<set-?>");
        this.displayedName = str;
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

    public void setParentDisplayedName(String str) {
        this.parentDisplayedName = str;
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

    public final void setTreeChildren(ArrayList<DistrictEntity> arrayList) {
        o.i(arrayList, "<set-?>");
        this.treeChildren = arrayList;
    }

    public String toString() {
        int i11 = this.f22309id;
        int i12 = this.regionId;
        int i13 = this.displayOrder;
        String str = this.nameEn;
        String str2 = this.nameAr;
        String str3 = this.image;
        String str4 = this.imageEn;
        String str5 = this.imageAr;
        int i14 = this.parentId;
        int i15 = this.level;
        String str6 = this.children;
        String str7 = this.parents;
        Double d11 = this.geoLat;
        Double d12 = this.geoLon;
        String str8 = this.fullPathAr;
        String str9 = this.fullPathEn;
        return "DistrictEntity(id=" + i11 + ", regionId=" + i12 + ", displayOrder=" + i13 + ", nameEn=" + str + ", nameAr=" + str2 + ", image=" + str3 + ", imageEn=" + str4 + ", imageAr=" + str5 + ", parentId=" + i14 + ", level=" + i15 + ", children=" + str6 + ", parents=" + str7 + ", geoLat=" + d11 + ", geoLon=" + d12 + ", fullPathAr=" + str8 + ", fullPathEn=" + str9 + ")";
    }
}

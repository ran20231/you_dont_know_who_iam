package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import hi.b;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: CousinCategory.kt */
/* loaded from: classes2.dex */
public final class CousinCategory implements b, Serializable {
    public static final int $stable = 8;
    private List<Integer> cousinIdsList;
    @c("cousins_ids")
    private final String cousinsIds;
    @c("display_order")
    private final int displayOrder;
    private int displayOrderSort;

    /* renamed from: id  reason: collision with root package name */
    private final int f22307id;
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
    private Integer selectableResId;
    private int selectedId;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
        r7 = kotlin.text.StringsKt__StringsKt.E0(r10, new char[]{','}, false, 0, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CousinCategory(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, int r12) {
        /*
            r6 = this;
            java.lang.String r0 = "nameAr"
            kotlin.jvm.internal.o.i(r8, r0)
            java.lang.String r0 = "nameEn"
            kotlin.jvm.internal.o.i(r9, r0)
            r6.<init>()
            r6.f22307id = r7
            r6.nameAr = r8
            r6.nameEn = r9
            r6.cousinsIds = r10
            r6.displayOrder = r11
            r6.parentId = r12
            r6.selectedId = r7
            java.lang.String r7 = r6.getName()
            r6.label = r7
            r6.labelAr = r8
            r6.labelEn = r9
            r6.displayOrderSort = r11
            if (r10 == 0) goto L65
            r7 = 1
            char[] r1 = new char[r7]
            r7 = 0
            r8 = 44
            r1[r7] = r8
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r10
            java.util.List r7 = kotlin.text.k.E0(r0, r1, r2, r3, r4, r5)
            if (r7 == 0) goto L65
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.p.y(r7, r9)
            r8.<init>(r9)
            java.util.Iterator r7 = r7.iterator()
        L4d:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L69
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            int r9 = java.lang.Integer.parseInt(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.add(r9)
            goto L4d
        L65:
            java.util.List r8 = kotlin.collections.p.n()
        L69:
            r6.cousinIdsList = r8
            int r7 = r6.parentId
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.parentID = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.CousinCategory.<init>(int, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public static /* synthetic */ CousinCategory copy$default(CousinCategory cousinCategory, int i11, String str, String str2, String str3, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = cousinCategory.f22307id;
        }
        if ((i14 & 2) != 0) {
            str = cousinCategory.nameAr;
        }
        String str4 = str;
        if ((i14 & 4) != 0) {
            str2 = cousinCategory.nameEn;
        }
        String str5 = str2;
        if ((i14 & 8) != 0) {
            str3 = cousinCategory.cousinsIds;
        }
        String str6 = str3;
        if ((i14 & 16) != 0) {
            i12 = cousinCategory.displayOrder;
        }
        int i15 = i12;
        if ((i14 & 32) != 0) {
            i13 = cousinCategory.parentId;
        }
        return cousinCategory.copy(i11, str4, str5, str6, i15, i13);
    }

    public final int component1() {
        return this.f22307id;
    }

    public final String component2() {
        return this.nameAr;
    }

    public final String component3() {
        return this.nameEn;
    }

    public final String component4() {
        return this.cousinsIds;
    }

    public final int component5() {
        return this.displayOrder;
    }

    public final int component6() {
        return this.parentId;
    }

    public final CousinCategory copy(int i11, String nameAr, String nameEn, String str, int i12, int i13) {
        o.i(nameAr, "nameAr");
        o.i(nameEn, "nameEn");
        return new CousinCategory(i11, nameAr, nameEn, str, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CousinCategory)) {
            return false;
        }
        CousinCategory cousinCategory = (CousinCategory) obj;
        if (this.f22307id == cousinCategory.f22307id && o.d(this.nameAr, cousinCategory.nameAr) && o.d(this.nameEn, cousinCategory.nameEn) && o.d(this.cousinsIds, cousinCategory.cousinsIds) && this.displayOrder == cousinCategory.displayOrder && this.parentId == cousinCategory.parentId) {
            return true;
        }
        return false;
    }

    @Override // hi.b
    public List<Integer> getCousinIdsList() {
        return this.cousinIdsList;
    }

    public final String getCousinsIds() {
        return this.cousinsIds;
    }

    public final int getDisplayOrder() {
        return this.displayOrder;
    }

    @Override // hi.b
    public int getDisplayOrderSort() {
        return this.displayOrderSort;
    }

    public final int getId() {
        return this.f22307id;
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

    @Override // hi.b
    public Integer getSelectableResId() {
        return this.selectableResId;
    }

    @Override // hi.b
    public int getSelectedId() {
        return this.selectedId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((Integer.hashCode(this.f22307id) * 31) + this.nameAr.hashCode()) * 31) + this.nameEn.hashCode()) * 31;
        String str = this.cousinsIds;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + Integer.hashCode(this.displayOrder)) * 31) + Integer.hashCode(this.parentId);
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
        int i11 = this.f22307id;
        String str = this.nameAr;
        String str2 = this.nameEn;
        String str3 = this.cousinsIds;
        int i12 = this.displayOrder;
        int i13 = this.parentId;
        return "CousinCategory(id=" + i11 + ", nameAr=" + str + ", nameEn=" + str2 + ", cousinsIds=" + str3 + ", displayOrder=" + i12 + ", parentId=" + i13 + ")";
    }

    public /* synthetic */ CousinCategory(int i11, String str, String str2, String str3, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 1 : i11, str, str2, str3, i12, i13);
    }
}

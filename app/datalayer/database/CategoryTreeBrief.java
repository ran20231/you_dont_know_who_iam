package com.forsale.app.datalayer.database;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: CategoryTreeBrief.kt */
/* loaded from: classes2.dex */
public final class CategoryTreeBrief {
    public static final int $stable = 8;
    @c("category_ids")
    private final String categoryIds;
    private final List<String> categoryListReversedIds;
    @c("category_names_ar")
    private final String categoryNamesAr;
    @c("category_names_en")
    private final String categoryNamesEn;
    @c("category_types")
    private final String categoryTypes;

    public CategoryTreeBrief(String categoryIds, String str, String str2, String str3) {
        List E0;
        List<String> H0;
        o.i(categoryIds, "categoryIds");
        this.categoryIds = categoryIds;
        this.categoryNamesEn = str;
        this.categoryNamesAr = str2;
        this.categoryTypes = str3;
        E0 = StringsKt__StringsKt.E0(TypeExtensionsKt.Z(categoryIds), new char[]{','}, false, 0, 6, null);
        H0 = CollectionsKt___CollectionsKt.H0(E0);
        this.categoryListReversedIds = H0;
    }

    public static /* synthetic */ CategoryTreeBrief copy$default(CategoryTreeBrief categoryTreeBrief, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = categoryTreeBrief.categoryIds;
        }
        if ((i11 & 2) != 0) {
            str2 = categoryTreeBrief.categoryNamesEn;
        }
        if ((i11 & 4) != 0) {
            str3 = categoryTreeBrief.categoryNamesAr;
        }
        if ((i11 & 8) != 0) {
            str4 = categoryTreeBrief.categoryTypes;
        }
        return categoryTreeBrief.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.categoryIds;
    }

    public final String component2() {
        return this.categoryNamesEn;
    }

    public final String component3() {
        return this.categoryNamesAr;
    }

    public final String component4() {
        return this.categoryTypes;
    }

    public final CategoryTreeBrief copy(String categoryIds, String str, String str2, String str3) {
        o.i(categoryIds, "categoryIds");
        return new CategoryTreeBrief(categoryIds, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CategoryTreeBrief)) {
            return false;
        }
        CategoryTreeBrief categoryTreeBrief = (CategoryTreeBrief) obj;
        if (o.d(this.categoryIds, categoryTreeBrief.categoryIds) && o.d(this.categoryNamesEn, categoryTreeBrief.categoryNamesEn) && o.d(this.categoryNamesAr, categoryTreeBrief.categoryNamesAr) && o.d(this.categoryTypes, categoryTreeBrief.categoryTypes)) {
            return true;
        }
        return false;
    }

    public final String getCategoryIds() {
        return this.categoryIds;
    }

    public final List<String> getCategoryListReversedIds() {
        return this.categoryListReversedIds;
    }

    public final String getCategoryName(List<String> list) {
        String str;
        if (list == null) {
            return "";
        }
        if (list.size() <= 1) {
            str = "";
        } else {
            str = list.get(0);
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String getCategoryNamesAr() {
        return this.categoryNamesAr;
    }

    public final String getCategoryNamesEn() {
        return this.categoryNamesEn;
    }

    public final List<String> getCategoryNamesList() {
        CharSequence Z0;
        List<String> E0;
        CharSequence Z02;
        List<String> E02;
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            String str = this.categoryNamesEn;
            if (str != null) {
                Z02 = StringsKt__StringsKt.Z0(str);
                String obj = Z02.toString();
                if (obj != null) {
                    E02 = StringsKt__StringsKt.E0(obj, new char[]{','}, false, 0, 6, null);
                    return E02;
                }
                return null;
            }
            return null;
        }
        String str2 = this.categoryNamesAr;
        if (str2 != null) {
            Z0 = StringsKt__StringsKt.Z0(str2);
            String obj2 = Z0.toString();
            if (obj2 != null) {
                E0 = StringsKt__StringsKt.E0(obj2, new char[]{','}, false, 0, 6, null);
                return E0;
            }
            return null;
        }
        return null;
    }

    public final String getCategoryTypes() {
        return this.categoryTypes;
    }

    public final List<Integer> getFilter(List<String> ids, int i11) {
        List<Integer> e11;
        o.i(ids, "ids");
        if (ids.size() > i11) {
            e11 = q.e(Integer.valueOf(Integer.parseInt(ids.get(i11))));
            return e11;
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.categoryIds.hashCode() * 31;
        String str = this.categoryNamesEn;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        String str2 = this.categoryNamesAr;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.categoryTypes;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.categoryIds;
        String str2 = this.categoryNamesEn;
        String str3 = this.categoryNamesAr;
        String str4 = this.categoryTypes;
        return "CategoryTreeBrief(categoryIds=" + str + ", categoryNamesEn=" + str2 + ", categoryNamesAr=" + str3 + ", categoryTypes=" + str4 + ")";
    }

    public /* synthetic */ CategoryTreeBrief(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }
}

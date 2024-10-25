package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchHistoryEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.network.responses.autocompletesearch.AutoCompleteSearchResponse;
import com.forsale.app.utils.TypeExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: SearchItemModel.kt */
/* loaded from: classes2.dex */
public final class SearchItemModel {

    /* renamed from: h  reason: collision with root package name */
    public static final a f36813h = new a(null);

    /* renamed from: i  reason: collision with root package name */
    public static final int f36814i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f36815a;

    /* renamed from: b  reason: collision with root package name */
    private final String f36816b;

    /* renamed from: c  reason: collision with root package name */
    private final String f36817c;

    /* renamed from: d  reason: collision with root package name */
    private final CategoryEntity f36818d;

    /* renamed from: e  reason: collision with root package name */
    private final ItemType f36819e;

    /* renamed from: f  reason: collision with root package name */
    private final GetListingsBody.FiltrationData f36820f;

    /* renamed from: g  reason: collision with root package name */
    private final int f36821g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchItemModel.kt */
    /* loaded from: classes2.dex */
    public static final class ItemType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ItemType[] $VALUES;
        public static final ItemType HISTORY = new ItemType("HISTORY", 0);
        public static final ItemType AUTOCOMPLETE = new ItemType("AUTOCOMPLETE", 1);

        private static final /* synthetic */ ItemType[] $values() {
            return new ItemType[]{HISTORY, AUTOCOMPLETE};
        }

        static {
            ItemType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ItemType(String str, int i11) {
        }

        public static a00.a<ItemType> getEntries() {
            return $ENTRIES;
        }

        public static ItemType valueOf(String str) {
            return (ItemType) Enum.valueOf(ItemType.class, str);
        }

        public static ItemType[] values() {
            return (ItemType[]) $VALUES.clone();
        }
    }

    /* compiled from: SearchItemModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final List<Integer> a(List<SearchItemModel> list, List<Integer> list2) {
            Set c12;
            List<Integer> B0;
            c12 = CollectionsKt___CollectionsKt.c1(list2);
            B0 = CollectionsKt___CollectionsKt.B0(b(list), c12);
            return B0;
        }

        private final String c(String str) {
            CharSequence c12;
            CharSequence a12;
            boolean v11;
            c12 = StringsKt__StringsKt.c1(str);
            a12 = StringsKt__StringsKt.a1(c12.toString());
            String a02 = TypeExtensionsKt.a0(a12.toString());
            v11 = kotlin.text.s.v(a02);
            if (!(!v11)) {
                return null;
            }
            return a02;
        }

        private final List<SearchItemModel> d(List<SearchItemModel> list, List<Integer> list2) {
            int y11;
            Integer num;
            boolean b02;
            List<SearchItemModel> list3 = list;
            y11 = kotlin.collections.s.y(list3, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (SearchItemModel searchItemModel : list3) {
                List<Integer> list4 = list2;
                CategoryEntity c11 = searchItemModel.c();
                if (c11 != null) {
                    num = Integer.valueOf(c11.getId());
                } else {
                    num = null;
                }
                b02 = CollectionsKt___CollectionsKt.b0(list4, num);
                if (b02) {
                    searchItemModel = SearchItemModel.b(searchItemModel, 0, null, null, null, null, null, 0, 87, null);
                }
                arrayList.add(searchItemModel);
            }
            return arrayList;
        }

        public final List<Integer> b(List<SearchItemModel> list) {
            List<Integer> c02;
            Integer num;
            kotlin.jvm.internal.o.i(list, "<this>");
            ArrayList arrayList = new ArrayList();
            for (SearchItemModel searchItemModel : list) {
                CategoryEntity c11 = searchItemModel.c();
                if (c11 != null) {
                    num = Integer.valueOf(c11.getId());
                } else {
                    num = null;
                }
                if (num != null) {
                    arrayList.add(num);
                }
            }
            c02 = CollectionsKt___CollectionsKt.c0(arrayList);
            return c02;
        }

        public final SearchHistoryEntity e(SearchItemModel searchItemModel, SearchHistoryEntity.SearchHistorySource source) {
            boolean z11;
            Integer num;
            kotlin.jvm.internal.o.i(searchItemModel, "<this>");
            kotlin.jvm.internal.o.i(source, "source");
            String c11 = c(searchItemModel.i());
            if (searchItemModel.i().length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Integer num2 = null;
            if (z11) {
                CategoryEntity c12 = searchItemModel.c();
                if (c12 != null) {
                    num = Integer.valueOf(c12.getId());
                } else {
                    num = null;
                }
                if (num == null) {
                    return null;
                }
            }
            int f11 = searchItemModel.f();
            if (c11 == null) {
                c11 = "";
            }
            String str = c11;
            CategoryEntity c13 = searchItemModel.c();
            if (c13 != null) {
                num2 = Integer.valueOf(c13.getId());
            }
            return new SearchHistoryEntity(f11, str, num2, searchItemModel.d(), searchItemModel.c(), searchItemModel.e(), source);
        }

        public final SearchHistoryEntity f(SearchItemModel searchItemModel) {
            Integer num;
            kotlin.jvm.internal.o.i(searchItemModel, "<this>");
            int f11 = searchItemModel.f();
            String i11 = searchItemModel.i();
            CategoryEntity c11 = searchItemModel.c();
            if (c11 != null) {
                num = Integer.valueOf(c11.getId());
            } else {
                num = null;
            }
            return new SearchHistoryEntity(f11, i11, num, searchItemModel.d(), searchItemModel.c(), searchItemModel.e(), null, 64, null);
        }

        public final SearchItemModel g(SearchHistoryEntity searchHistoryEntity, int i11) {
            kotlin.jvm.internal.o.i(searchHistoryEntity, "<this>");
            return new SearchItemModel(searchHistoryEntity.getId(), searchHistoryEntity.getSearchText(), searchHistoryEntity.getCategoryName(), searchHistoryEntity.getCategory(), ItemType.HISTORY, searchHistoryEntity.getFiltrationData(), i11 + 1);
        }

        public final SearchItemModel h(AutoCompleteSearchResponse autoCompleteSearchResponse, int i11) {
            kotlin.jvm.internal.o.i(autoCompleteSearchResponse, "<this>");
            return new SearchItemModel(0, autoCompleteSearchResponse.getKeyword(), autoCompleteSearchResponse.getDisplayName(), autoCompleteSearchResponse.getCategoryEntity(), ItemType.AUTOCOMPLETE, autoCompleteSearchResponse.getPredefinedFilters(), i11 + 1, 1, null);
        }

        public final List<SearchItemModel> i(List<SearchItemModel> list, List<Integer> existedCategoryIds) {
            kotlin.jvm.internal.o.i(list, "<this>");
            kotlin.jvm.internal.o.i(existedCategoryIds, "existedCategoryIds");
            List<Integer> a11 = a(list, existedCategoryIds);
            if (!a11.isEmpty()) {
                return d(list, a11);
            }
            return list;
        }
    }

    public SearchItemModel(int i11, String query, String str, CategoryEntity categoryEntity, ItemType itemType, GetListingsBody.FiltrationData filtrationData, int i12) {
        kotlin.jvm.internal.o.i(query, "query");
        kotlin.jvm.internal.o.i(itemType, "itemType");
        this.f36815a = i11;
        this.f36816b = query;
        this.f36817c = str;
        this.f36818d = categoryEntity;
        this.f36819e = itemType;
        this.f36820f = filtrationData;
        this.f36821g = i12;
    }

    public static /* synthetic */ SearchItemModel b(SearchItemModel searchItemModel, int i11, String str, String str2, CategoryEntity categoryEntity, ItemType itemType, GetListingsBody.FiltrationData filtrationData, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = searchItemModel.f36815a;
        }
        if ((i13 & 2) != 0) {
            str = searchItemModel.f36816b;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            str2 = searchItemModel.f36817c;
        }
        String str4 = str2;
        if ((i13 & 8) != 0) {
            categoryEntity = searchItemModel.f36818d;
        }
        CategoryEntity categoryEntity2 = categoryEntity;
        if ((i13 & 16) != 0) {
            itemType = searchItemModel.f36819e;
        }
        ItemType itemType2 = itemType;
        if ((i13 & 32) != 0) {
            filtrationData = searchItemModel.f36820f;
        }
        GetListingsBody.FiltrationData filtrationData2 = filtrationData;
        if ((i13 & 64) != 0) {
            i12 = searchItemModel.f36821g;
        }
        return searchItemModel.a(i11, str3, str4, categoryEntity2, itemType2, filtrationData2, i12);
    }

    public final SearchItemModel a(int i11, String query, String str, CategoryEntity categoryEntity, ItemType itemType, GetListingsBody.FiltrationData filtrationData, int i12) {
        kotlin.jvm.internal.o.i(query, "query");
        kotlin.jvm.internal.o.i(itemType, "itemType");
        return new SearchItemModel(i11, query, str, categoryEntity, itemType, filtrationData, i12);
    }

    public final CategoryEntity c() {
        return this.f36818d;
    }

    public final String d() {
        return this.f36817c;
    }

    public final GetListingsBody.FiltrationData e() {
        return this.f36820f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchItemModel)) {
            return false;
        }
        SearchItemModel searchItemModel = (SearchItemModel) obj;
        if (this.f36815a == searchItemModel.f36815a && kotlin.jvm.internal.o.d(this.f36816b, searchItemModel.f36816b) && kotlin.jvm.internal.o.d(this.f36817c, searchItemModel.f36817c) && kotlin.jvm.internal.o.d(this.f36818d, searchItemModel.f36818d) && this.f36819e == searchItemModel.f36819e && kotlin.jvm.internal.o.d(this.f36820f, searchItemModel.f36820f) && this.f36821g == searchItemModel.f36821g) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f36815a;
    }

    public final ItemType g() {
        return this.f36819e;
    }

    public final int h() {
        return this.f36821g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((Integer.hashCode(this.f36815a) * 31) + this.f36816b.hashCode()) * 31;
        String str = this.f36817c;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        CategoryEntity categoryEntity = this.f36818d;
        if (categoryEntity == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = categoryEntity.hashCode();
        }
        int hashCode4 = (((i12 + hashCode2) * 31) + this.f36819e.hashCode()) * 31;
        GetListingsBody.FiltrationData filtrationData = this.f36820f;
        if (filtrationData != null) {
            i11 = filtrationData.hashCode();
        }
        return ((hashCode4 + i11) * 31) + Integer.hashCode(this.f36821g);
    }

    public final String i() {
        return this.f36816b;
    }

    public String toString() {
        int i11 = this.f36815a;
        String str = this.f36816b;
        String str2 = this.f36817c;
        CategoryEntity categoryEntity = this.f36818d;
        ItemType itemType = this.f36819e;
        GetListingsBody.FiltrationData filtrationData = this.f36820f;
        int i12 = this.f36821g;
        return "SearchItemModel(id=" + i11 + ", query=" + str + ", displayName=" + str2 + ", category=" + categoryEntity + ", itemType=" + itemType + ", filtrationData=" + filtrationData + ", order=" + i12 + ")";
    }

    public /* synthetic */ SearchItemModel(int i11, String str, String str2, CategoryEntity categoryEntity, ItemType itemType, GetListingsBody.FiltrationData filtrationData, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i11, str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : categoryEntity, (i13 & 16) != 0 ? ItemType.HISTORY : itemType, (i13 & 32) != 0 ? null : filtrationData, (i13 & 64) != 0 ? 0 : i12);
    }
}

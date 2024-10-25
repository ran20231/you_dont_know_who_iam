package com.forsale.app.datalayer.database;

import a00.a;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: SearchHistoryEntity.kt */
/* loaded from: classes2.dex */
public final class SearchHistoryEntity {
    public static final String tableName = "search_history_table";
    @c("category")
    private final CategoryEntity category;
    @c("category_id")
    private final Integer categoryId;
    @c("category_name")
    private final String categoryName;
    @c("filters")
    private final GetListingsBody.FiltrationData filtrationData;
    @c("id")

    /* renamed from: id  reason: collision with root package name */
    private final int f22321id;
    @c("search_text")
    private final String searchText;
    @c("source")
    private final SearchHistorySource source;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchHistoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SearchHistoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class SearchHistorySource {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SearchHistorySource[] $VALUES;
        public static final SearchHistorySource SEARCH_HISTORY = new SearchHistorySource("SEARCH_HISTORY", 0);
        public static final SearchHistorySource MATCHING_CATEGORIES = new SearchHistorySource("MATCHING_CATEGORIES", 1);

        private static final /* synthetic */ SearchHistorySource[] $values() {
            return new SearchHistorySource[]{SEARCH_HISTORY, MATCHING_CATEGORIES};
        }

        static {
            SearchHistorySource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SearchHistorySource(String str, int i11) {
        }

        public static a<SearchHistorySource> getEntries() {
            return $ENTRIES;
        }

        public static SearchHistorySource valueOf(String str) {
            return (SearchHistorySource) Enum.valueOf(SearchHistorySource.class, str);
        }

        public static SearchHistorySource[] values() {
            return (SearchHistorySource[]) $VALUES.clone();
        }
    }

    public SearchHistoryEntity(int i11, String searchText, Integer num, String str, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchHistorySource searchHistorySource) {
        o.i(searchText, "searchText");
        this.f22321id = i11;
        this.searchText = searchText;
        this.categoryId = num;
        this.categoryName = str;
        this.category = categoryEntity;
        this.filtrationData = filtrationData;
        this.source = searchHistorySource;
    }

    public static /* synthetic */ SearchHistoryEntity copy$default(SearchHistoryEntity searchHistoryEntity, int i11, String str, Integer num, String str2, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchHistorySource searchHistorySource, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = searchHistoryEntity.f22321id;
        }
        if ((i12 & 2) != 0) {
            str = searchHistoryEntity.searchText;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            num = searchHistoryEntity.categoryId;
        }
        Integer num2 = num;
        if ((i12 & 8) != 0) {
            str2 = searchHistoryEntity.categoryName;
        }
        String str4 = str2;
        if ((i12 & 16) != 0) {
            categoryEntity = searchHistoryEntity.category;
        }
        CategoryEntity categoryEntity2 = categoryEntity;
        if ((i12 & 32) != 0) {
            filtrationData = searchHistoryEntity.filtrationData;
        }
        GetListingsBody.FiltrationData filtrationData2 = filtrationData;
        if ((i12 & 64) != 0) {
            searchHistorySource = searchHistoryEntity.source;
        }
        return searchHistoryEntity.copy(i11, str3, num2, str4, categoryEntity2, filtrationData2, searchHistorySource);
    }

    public final int component1() {
        return this.f22321id;
    }

    public final String component2() {
        return this.searchText;
    }

    public final Integer component3() {
        return this.categoryId;
    }

    public final String component4() {
        return this.categoryName;
    }

    public final CategoryEntity component5() {
        return this.category;
    }

    public final GetListingsBody.FiltrationData component6() {
        return this.filtrationData;
    }

    public final SearchHistorySource component7() {
        return this.source;
    }

    public final SearchHistoryEntity copy(int i11, String searchText, Integer num, String str, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchHistorySource searchHistorySource) {
        o.i(searchText, "searchText");
        return new SearchHistoryEntity(i11, searchText, num, str, categoryEntity, filtrationData, searchHistorySource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchHistoryEntity)) {
            return false;
        }
        SearchHistoryEntity searchHistoryEntity = (SearchHistoryEntity) obj;
        if (this.f22321id == searchHistoryEntity.f22321id && o.d(this.searchText, searchHistoryEntity.searchText) && o.d(this.categoryId, searchHistoryEntity.categoryId) && o.d(this.categoryName, searchHistoryEntity.categoryName) && o.d(this.category, searchHistoryEntity.category) && o.d(this.filtrationData, searchHistoryEntity.filtrationData) && this.source == searchHistoryEntity.source) {
            return true;
        }
        return false;
    }

    public final CategoryEntity getCategory() {
        return this.category;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final GetListingsBody.FiltrationData getFiltrationData() {
        return this.filtrationData;
    }

    public final int getId() {
        return this.f22321id;
    }

    public final String getSearchText() {
        return this.searchText;
    }

    public final SearchHistorySource getSource() {
        return this.source;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = ((Integer.hashCode(this.f22321id) * 31) + this.searchText.hashCode()) * 31;
        Integer num = this.categoryId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode5 + hashCode) * 31;
        String str = this.categoryName;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        CategoryEntity categoryEntity = this.category;
        if (categoryEntity == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = categoryEntity.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        GetListingsBody.FiltrationData filtrationData = this.filtrationData;
        if (filtrationData == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = filtrationData.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        SearchHistorySource searchHistorySource = this.source;
        if (searchHistorySource != null) {
            i11 = searchHistorySource.hashCode();
        }
        return i15 + i11;
    }

    public String toString() {
        int i11 = this.f22321id;
        String str = this.searchText;
        Integer num = this.categoryId;
        String str2 = this.categoryName;
        CategoryEntity categoryEntity = this.category;
        GetListingsBody.FiltrationData filtrationData = this.filtrationData;
        SearchHistorySource searchHistorySource = this.source;
        return "SearchHistoryEntity(id=" + i11 + ", searchText=" + str + ", categoryId=" + num + ", categoryName=" + str2 + ", category=" + categoryEntity + ", filtrationData=" + filtrationData + ", source=" + searchHistorySource + ")";
    }

    public /* synthetic */ SearchHistoryEntity(int i11, String str, Integer num, String str2, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, SearchHistorySource searchHistorySource, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i11, str, (i12 & 4) != 0 ? null : num, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : categoryEntity, (i12 & 32) != 0 ? null : filtrationData, (i12 & 64) != 0 ? SearchHistorySource.SEARCH_HISTORY : searchHistorySource);
    }
}

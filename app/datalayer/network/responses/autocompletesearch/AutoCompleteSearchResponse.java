package com.forsale.app.datalayer.network.responses.autocompletesearch;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.ProhibitedKeywordEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AutoCompleteSearchResponse.kt */
/* loaded from: classes2.dex */
public final class AutoCompleteSearchResponse {
    public static final int $stable = 8;
    @c("category_entity")
    private CategoryEntity categoryEntity;
    @c("display_name")
    private final String displayName;
    @c(ProhibitedKeywordEntity.KEYWORD)
    private final String keyword;
    @c("listing_category")
    private final int listingCategory;
    @c("predefined_filters")
    private final GetListingsBody.FiltrationData predefinedFilters;

    public AutoCompleteSearchResponse(String keyword, int i11, String displayName, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData) {
        o.i(keyword, "keyword");
        o.i(displayName, "displayName");
        this.keyword = keyword;
        this.listingCategory = i11;
        this.displayName = displayName;
        this.categoryEntity = categoryEntity;
        this.predefinedFilters = filtrationData;
    }

    public static /* synthetic */ AutoCompleteSearchResponse copy$default(AutoCompleteSearchResponse autoCompleteSearchResponse, String str, int i11, String str2, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = autoCompleteSearchResponse.keyword;
        }
        if ((i12 & 2) != 0) {
            i11 = autoCompleteSearchResponse.listingCategory;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            str2 = autoCompleteSearchResponse.displayName;
        }
        String str3 = str2;
        if ((i12 & 8) != 0) {
            categoryEntity = autoCompleteSearchResponse.categoryEntity;
        }
        CategoryEntity categoryEntity2 = categoryEntity;
        if ((i12 & 16) != 0) {
            filtrationData = autoCompleteSearchResponse.predefinedFilters;
        }
        return autoCompleteSearchResponse.copy(str, i13, str3, categoryEntity2, filtrationData);
    }

    public final String component1() {
        return this.keyword;
    }

    public final int component2() {
        return this.listingCategory;
    }

    public final String component3() {
        return this.displayName;
    }

    public final CategoryEntity component4() {
        return this.categoryEntity;
    }

    public final GetListingsBody.FiltrationData component5() {
        return this.predefinedFilters;
    }

    public final AutoCompleteSearchResponse copy(String keyword, int i11, String displayName, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData) {
        o.i(keyword, "keyword");
        o.i(displayName, "displayName");
        return new AutoCompleteSearchResponse(keyword, i11, displayName, categoryEntity, filtrationData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoCompleteSearchResponse)) {
            return false;
        }
        AutoCompleteSearchResponse autoCompleteSearchResponse = (AutoCompleteSearchResponse) obj;
        if (o.d(this.keyword, autoCompleteSearchResponse.keyword) && this.listingCategory == autoCompleteSearchResponse.listingCategory && o.d(this.displayName, autoCompleteSearchResponse.displayName) && o.d(this.categoryEntity, autoCompleteSearchResponse.categoryEntity) && o.d(this.predefinedFilters, autoCompleteSearchResponse.predefinedFilters)) {
            return true;
        }
        return false;
    }

    public final CategoryEntity getCategoryEntity() {
        return this.categoryEntity;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getListingCategory() {
        return this.listingCategory;
    }

    public final GetListingsBody.FiltrationData getPredefinedFilters() {
        return this.predefinedFilters;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((this.keyword.hashCode() * 31) + Integer.hashCode(this.listingCategory)) * 31) + this.displayName.hashCode()) * 31;
        CategoryEntity categoryEntity = this.categoryEntity;
        int i11 = 0;
        if (categoryEntity == null) {
            hashCode = 0;
        } else {
            hashCode = categoryEntity.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        GetListingsBody.FiltrationData filtrationData = this.predefinedFilters;
        if (filtrationData != null) {
            i11 = filtrationData.hashCode();
        }
        return i12 + i11;
    }

    public final void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public String toString() {
        String str = this.keyword;
        int i11 = this.listingCategory;
        String str2 = this.displayName;
        CategoryEntity categoryEntity = this.categoryEntity;
        GetListingsBody.FiltrationData filtrationData = this.predefinedFilters;
        return "AutoCompleteSearchResponse(keyword=" + str + ", listingCategory=" + i11 + ", displayName=" + str2 + ", categoryEntity=" + categoryEntity + ", predefinedFilters=" + filtrationData + ")";
    }

    public /* synthetic */ AutoCompleteSearchResponse(String str, int i11, String str2, CategoryEntity categoryEntity, GetListingsBody.FiltrationData filtrationData, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, str2, (i12 & 8) != 0 ? null : categoryEntity, (i12 & 16) != 0 ? null : filtrationData);
    }

    public static /* synthetic */ void getCategoryEntity$annotations() {
    }
}

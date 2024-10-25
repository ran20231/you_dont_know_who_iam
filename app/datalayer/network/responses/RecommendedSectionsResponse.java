package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.utils.LocaleManager;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: RecommendedSectionsResponse.kt */
/* loaded from: classes2.dex */
public final class RecommendedSectionsResponse {
    public static final int $stable = 8;
    @c("cat_id")
    private final int categoryId;
    @c(CategoryEntity.SECTIONS)
    private final List<Section> sections;

    /* compiled from: RecommendedSectionsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Section {
        public static final int $stable = 8;
        @c("filters")
        private final List<SectionFilter> filters;
        @c("listings")
        private final List<ListingItemBrief> listings;
        @c("title_prefix")
        private final SectionTitlePrefix titlePrefix;
        private final transient SectionTitleTrailing titleTrailing;

        public Section(SectionTitlePrefix titlePrefix, SectionTitleTrailing titleTrailing, List<SectionFilter> filters, List<ListingItemBrief> listings) {
            o.i(titlePrefix, "titlePrefix");
            o.i(titleTrailing, "titleTrailing");
            o.i(filters, "filters");
            o.i(listings, "listings");
            this.titlePrefix = titlePrefix;
            this.titleTrailing = titleTrailing;
            this.filters = filters;
            this.listings = listings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Section copy$default(Section section, SectionTitlePrefix sectionTitlePrefix, SectionTitleTrailing sectionTitleTrailing, List list, List list2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                sectionTitlePrefix = section.titlePrefix;
            }
            if ((i11 & 2) != 0) {
                sectionTitleTrailing = section.titleTrailing;
            }
            if ((i11 & 4) != 0) {
                list = section.filters;
            }
            if ((i11 & 8) != 0) {
                list2 = section.listings;
            }
            return section.copy(sectionTitlePrefix, sectionTitleTrailing, list, list2);
        }

        public final SectionTitlePrefix component1() {
            return this.titlePrefix;
        }

        public final SectionTitleTrailing component2() {
            return this.titleTrailing;
        }

        public final List<SectionFilter> component3() {
            return this.filters;
        }

        public final List<ListingItemBrief> component4() {
            return this.listings;
        }

        public final Section copy(SectionTitlePrefix titlePrefix, SectionTitleTrailing titleTrailing, List<SectionFilter> filters, List<ListingItemBrief> listings) {
            o.i(titlePrefix, "titlePrefix");
            o.i(titleTrailing, "titleTrailing");
            o.i(filters, "filters");
            o.i(listings, "listings");
            return new Section(titlePrefix, titleTrailing, filters, listings);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            if (o.d(this.titlePrefix, section.titlePrefix) && o.d(this.titleTrailing, section.titleTrailing) && o.d(this.filters, section.filters) && o.d(this.listings, section.listings)) {
                return true;
            }
            return false;
        }

        public final List<SectionFilter> getFilters() {
            return this.filters;
        }

        public final List<ListingItemBrief> getListings() {
            return this.listings;
        }

        public final String getTitle() {
            String str;
            String localized = this.titlePrefix.getLocalized();
            SectionTitleTrailing sectionTitleTrailing = this.titleTrailing;
            if (sectionTitleTrailing != null) {
                str = sectionTitleTrailing.getLocalized();
            } else {
                str = null;
            }
            return localized + " " + str;
        }

        public final SectionTitlePrefix getTitlePrefix() {
            return this.titlePrefix;
        }

        public final SectionTitleTrailing getTitleTrailing() {
            return this.titleTrailing;
        }

        public int hashCode() {
            return (((((this.titlePrefix.hashCode() * 31) + this.titleTrailing.hashCode()) * 31) + this.filters.hashCode()) * 31) + this.listings.hashCode();
        }

        public String toString() {
            SectionTitlePrefix sectionTitlePrefix = this.titlePrefix;
            SectionTitleTrailing sectionTitleTrailing = this.titleTrailing;
            List<SectionFilter> list = this.filters;
            List<ListingItemBrief> list2 = this.listings;
            return "Section(titlePrefix=" + sectionTitlePrefix + ", titleTrailing=" + sectionTitleTrailing + ", filters=" + list + ", listings=" + list2 + ")";
        }
    }

    /* compiled from: RecommendedSectionsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class SectionFilter {
        public static final int $stable = 0;
        @c("attr_type")
        private final String attrType;
        @c("filter_type")
        private final ListingsResponse.UISettings.FiltrationSetting.FilterType filterType;
        @c("id")

        /* renamed from: id */
        private final String f22362id;
        @c("name_en")
        private final String nameEn;
        @c("value")
        private final String value;

        public SectionFilter(String id2, String nameEn, String attrType, ListingsResponse.UISettings.FiltrationSetting.FilterType filterType, String value) {
            o.i(id2, "id");
            o.i(nameEn, "nameEn");
            o.i(attrType, "attrType");
            o.i(filterType, "filterType");
            o.i(value, "value");
            this.f22362id = id2;
            this.nameEn = nameEn;
            this.attrType = attrType;
            this.filterType = filterType;
            this.value = value;
        }

        public static /* synthetic */ SectionFilter copy$default(SectionFilter sectionFilter, String str, String str2, String str3, ListingsResponse.UISettings.FiltrationSetting.FilterType filterType, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sectionFilter.f22362id;
            }
            if ((i11 & 2) != 0) {
                str2 = sectionFilter.nameEn;
            }
            String str5 = str2;
            if ((i11 & 4) != 0) {
                str3 = sectionFilter.attrType;
            }
            String str6 = str3;
            if ((i11 & 8) != 0) {
                filterType = sectionFilter.filterType;
            }
            ListingsResponse.UISettings.FiltrationSetting.FilterType filterType2 = filterType;
            if ((i11 & 16) != 0) {
                str4 = sectionFilter.value;
            }
            return sectionFilter.copy(str, str5, str6, filterType2, str4);
        }

        public final String component1() {
            return this.f22362id;
        }

        public final String component2() {
            return this.nameEn;
        }

        public final String component3() {
            return this.attrType;
        }

        public final ListingsResponse.UISettings.FiltrationSetting.FilterType component4() {
            return this.filterType;
        }

        public final String component5() {
            return this.value;
        }

        public final SectionFilter copy(String id2, String nameEn, String attrType, ListingsResponse.UISettings.FiltrationSetting.FilterType filterType, String value) {
            o.i(id2, "id");
            o.i(nameEn, "nameEn");
            o.i(attrType, "attrType");
            o.i(filterType, "filterType");
            o.i(value, "value");
            return new SectionFilter(id2, nameEn, attrType, filterType, value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionFilter)) {
                return false;
            }
            SectionFilter sectionFilter = (SectionFilter) obj;
            if (o.d(this.f22362id, sectionFilter.f22362id) && o.d(this.nameEn, sectionFilter.nameEn) && o.d(this.attrType, sectionFilter.attrType) && this.filterType == sectionFilter.filterType && o.d(this.value, sectionFilter.value)) {
                return true;
            }
            return false;
        }

        public final String getAttrType() {
            return this.attrType;
        }

        public final ListingsResponse.UISettings.FiltrationSetting.FilterType getFilterType() {
            return this.filterType;
        }

        public final String getId() {
            return this.f22362id;
        }

        public final String getNameEn() {
            return this.nameEn;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return (((((((this.f22362id.hashCode() * 31) + this.nameEn.hashCode()) * 31) + this.attrType.hashCode()) * 31) + this.filterType.hashCode()) * 31) + this.value.hashCode();
        }

        public String toString() {
            String str = this.f22362id;
            String str2 = this.nameEn;
            String str3 = this.attrType;
            ListingsResponse.UISettings.FiltrationSetting.FilterType filterType = this.filterType;
            String str4 = this.value;
            return "SectionFilter(id=" + str + ", nameEn=" + str2 + ", attrType=" + str3 + ", filterType=" + filterType + ", value=" + str4 + ")";
        }
    }

    /* compiled from: RecommendedSectionsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class SectionTitlePrefix {
        public static final int $stable = 0;
        @c(SearchPlaceholderKeywordEntity.AR)

        /* renamed from: ar */
        private final String f22363ar;
        @c(SearchPlaceholderKeywordEntity.EN)

        /* renamed from: en */
        private final String f22364en;

        public SectionTitlePrefix(String en2, String ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            this.f22364en = en2;
            this.f22363ar = ar2;
        }

        public static /* synthetic */ SectionTitlePrefix copy$default(SectionTitlePrefix sectionTitlePrefix, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sectionTitlePrefix.f22364en;
            }
            if ((i11 & 2) != 0) {
                str2 = sectionTitlePrefix.f22363ar;
            }
            return sectionTitlePrefix.copy(str, str2);
        }

        public final String component1() {
            return this.f22364en;
        }

        public final String component2() {
            return this.f22363ar;
        }

        public final SectionTitlePrefix copy(String en2, String ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            return new SectionTitlePrefix(en2, ar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionTitlePrefix)) {
                return false;
            }
            SectionTitlePrefix sectionTitlePrefix = (SectionTitlePrefix) obj;
            if (o.d(this.f22364en, sectionTitlePrefix.f22364en) && o.d(this.f22363ar, sectionTitlePrefix.f22363ar)) {
                return true;
            }
            return false;
        }

        public final String getAr() {
            return this.f22363ar;
        }

        public final String getEn() {
            return this.f22364en;
        }

        public final String getLocalized() {
            CharSequence Z0;
            CharSequence Z02;
            if (LocaleManager.f39597a.r()) {
                Z02 = StringsKt__StringsKt.Z0(this.f22363ar);
                return Z02.toString();
            }
            Z0 = StringsKt__StringsKt.Z0(this.f22364en);
            return Z0.toString();
        }

        public int hashCode() {
            return (this.f22364en.hashCode() * 31) + this.f22363ar.hashCode();
        }

        public String toString() {
            String str = this.f22364en;
            String str2 = this.f22363ar;
            return "SectionTitlePrefix(en=" + str + ", ar=" + str2 + ")";
        }
    }

    /* compiled from: RecommendedSectionsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class SectionTitleTrailing {
        public static final int $stable = 0;
        @c(SearchPlaceholderKeywordEntity.AR)

        /* renamed from: ar */
        private final String f22365ar;
        @c(SearchPlaceholderKeywordEntity.EN)

        /* renamed from: en */
        private final String f22366en;

        public SectionTitleTrailing(String en2, String ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            this.f22366en = en2;
            this.f22365ar = ar2;
        }

        public static /* synthetic */ SectionTitleTrailing copy$default(SectionTitleTrailing sectionTitleTrailing, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sectionTitleTrailing.f22366en;
            }
            if ((i11 & 2) != 0) {
                str2 = sectionTitleTrailing.f22365ar;
            }
            return sectionTitleTrailing.copy(str, str2);
        }

        public final String component1() {
            return this.f22366en;
        }

        public final String component2() {
            return this.f22365ar;
        }

        public final SectionTitleTrailing copy(String en2, String ar2) {
            o.i(en2, "en");
            o.i(ar2, "ar");
            return new SectionTitleTrailing(en2, ar2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionTitleTrailing)) {
                return false;
            }
            SectionTitleTrailing sectionTitleTrailing = (SectionTitleTrailing) obj;
            if (o.d(this.f22366en, sectionTitleTrailing.f22366en) && o.d(this.f22365ar, sectionTitleTrailing.f22365ar)) {
                return true;
            }
            return false;
        }

        public final String getAr() {
            return this.f22365ar;
        }

        public final String getEn() {
            return this.f22366en;
        }

        public final String getLocalized() {
            CharSequence Z0;
            CharSequence Z02;
            if (LocaleManager.f39597a.r()) {
                Z02 = StringsKt__StringsKt.Z0(this.f22365ar);
                return Z02.toString();
            }
            Z0 = StringsKt__StringsKt.Z0(this.f22366en);
            return Z0.toString();
        }

        public int hashCode() {
            return (this.f22366en.hashCode() * 31) + this.f22365ar.hashCode();
        }

        public String toString() {
            String str = this.f22366en;
            String str2 = this.f22365ar;
            return "SectionTitleTrailing(en=" + str + ", ar=" + str2 + ")";
        }
    }

    public RecommendedSectionsResponse(int i11, List<Section> sections) {
        o.i(sections, "sections");
        this.categoryId = i11;
        this.sections = sections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendedSectionsResponse copy$default(RecommendedSectionsResponse recommendedSectionsResponse, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = recommendedSectionsResponse.categoryId;
        }
        if ((i12 & 2) != 0) {
            list = recommendedSectionsResponse.sections;
        }
        return recommendedSectionsResponse.copy(i11, list);
    }

    public final int component1() {
        return this.categoryId;
    }

    public final List<Section> component2() {
        return this.sections;
    }

    public final RecommendedSectionsResponse copy(int i11, List<Section> sections) {
        o.i(sections, "sections");
        return new RecommendedSectionsResponse(i11, sections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendedSectionsResponse)) {
            return false;
        }
        RecommendedSectionsResponse recommendedSectionsResponse = (RecommendedSectionsResponse) obj;
        if (this.categoryId == recommendedSectionsResponse.categoryId && o.d(this.sections, recommendedSectionsResponse.sections)) {
            return true;
        }
        return false;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<Section> getSections() {
        return this.sections;
    }

    public int hashCode() {
        return (Integer.hashCode(this.categoryId) * 31) + this.sections.hashCode();
    }

    public String toString() {
        int i11 = this.categoryId;
        List<Section> list = this.sections;
        return "RecommendedSectionsResponse(categoryId=" + i11 + ", sections=" + list + ")";
    }
}

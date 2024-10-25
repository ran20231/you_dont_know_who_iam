package com.forsale.app.datalayer.network.responses;

import com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: HomeSectionsResponse.kt */
/* loaded from: classes2.dex */
public final class HomeSectionsResponse {
    public static final int $stable = 8;
    @c("expire_at")
    private final String expireAt;
    @c("rec_type")
    private final String recommendationCriteria;
    @c("vertical_sections")
    private final List<VerticalSection> verticalSections;

    public HomeSectionsResponse(String expireAt, String recommendationCriteria, List<VerticalSection> verticalSections) {
        o.i(expireAt, "expireAt");
        o.i(recommendationCriteria, "recommendationCriteria");
        o.i(verticalSections, "verticalSections");
        this.expireAt = expireAt;
        this.recommendationCriteria = recommendationCriteria;
        this.verticalSections = verticalSections;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HomeSectionsResponse copy$default(HomeSectionsResponse homeSectionsResponse, String str, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = homeSectionsResponse.expireAt;
        }
        if ((i11 & 2) != 0) {
            str2 = homeSectionsResponse.recommendationCriteria;
        }
        if ((i11 & 4) != 0) {
            list = homeSectionsResponse.verticalSections;
        }
        return homeSectionsResponse.copy(str, str2, list);
    }

    public final String component1() {
        return this.expireAt;
    }

    public final String component2() {
        return this.recommendationCriteria;
    }

    public final List<VerticalSection> component3() {
        return this.verticalSections;
    }

    public final HomeSectionsResponse copy(String expireAt, String recommendationCriteria, List<VerticalSection> verticalSections) {
        o.i(expireAt, "expireAt");
        o.i(recommendationCriteria, "recommendationCriteria");
        o.i(verticalSections, "verticalSections");
        return new HomeSectionsResponse(expireAt, recommendationCriteria, verticalSections);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeSectionsResponse)) {
            return false;
        }
        HomeSectionsResponse homeSectionsResponse = (HomeSectionsResponse) obj;
        if (o.d(this.expireAt, homeSectionsResponse.expireAt) && o.d(this.recommendationCriteria, homeSectionsResponse.recommendationCriteria) && o.d(this.verticalSections, homeSectionsResponse.verticalSections)) {
            return true;
        }
        return false;
    }

    public final String getExpireAt() {
        return this.expireAt;
    }

    public final String getRecommendationCriteria() {
        return this.recommendationCriteria;
    }

    public final List<VerticalSection> getVerticalSections() {
        return this.verticalSections;
    }

    public int hashCode() {
        return (((this.expireAt.hashCode() * 31) + this.recommendationCriteria.hashCode()) * 31) + this.verticalSections.hashCode();
    }

    public String toString() {
        String str = this.expireAt;
        String str2 = this.recommendationCriteria;
        List<VerticalSection> list = this.verticalSections;
        return "HomeSectionsResponse(expireAt=" + str + ", recommendationCriteria=" + str2 + ", verticalSections=" + list + ")";
    }

    /* compiled from: HomeSectionsResponse.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalSection {
        public static final int $stable = 8;
        @c("cat_id")
        private final int catId;
        @c("default_tab")
        private final VerticalSectionsTabs defaultTab;
        @c("title")
        private final Title title;
        @c("user_ads")
        private final List<ListingItemBrief> userAds;

        /* compiled from: HomeSectionsResponse.kt */
        /* loaded from: classes2.dex */
        public static final class Title {
            public static final int $stable = 0;
            @c("title_ar")
            private final String titleAr;
            @c("title_en")
            private final String titleEn;

            public Title(String titleAr, String titleEn) {
                o.i(titleAr, "titleAr");
                o.i(titleEn, "titleEn");
                this.titleAr = titleAr;
                this.titleEn = titleEn;
            }

            public static /* synthetic */ Title copy$default(Title title, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = title.titleAr;
                }
                if ((i11 & 2) != 0) {
                    str2 = title.titleEn;
                }
                return title.copy(str, str2);
            }

            public final String component1() {
                return this.titleAr;
            }

            public final String component2() {
                return this.titleEn;
            }

            public final Title copy(String titleAr, String titleEn) {
                o.i(titleAr, "titleAr");
                o.i(titleEn, "titleEn");
                return new Title(titleAr, titleEn);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Title)) {
                    return false;
                }
                Title title = (Title) obj;
                if (o.d(this.titleAr, title.titleAr) && o.d(this.titleEn, title.titleEn)) {
                    return true;
                }
                return false;
            }

            public final String getTitleAr() {
                return this.titleAr;
            }

            public final String getTitleEn() {
                return this.titleEn;
            }

            public int hashCode() {
                return (this.titleAr.hashCode() * 31) + this.titleEn.hashCode();
            }

            public String toString() {
                String str = this.titleAr;
                String str2 = this.titleEn;
                return "Title(titleAr=" + str + ", titleEn=" + str2 + ")";
            }
        }

        public VerticalSection(int i11, VerticalSectionsTabs verticalSectionsTabs, Title title, List<ListingItemBrief> userAds) {
            o.i(title, "title");
            o.i(userAds, "userAds");
            this.catId = i11;
            this.defaultTab = verticalSectionsTabs;
            this.title = title;
            this.userAds = userAds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VerticalSection copy$default(VerticalSection verticalSection, int i11, VerticalSectionsTabs verticalSectionsTabs, Title title, List list, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = verticalSection.catId;
            }
            if ((i12 & 2) != 0) {
                verticalSectionsTabs = verticalSection.defaultTab;
            }
            if ((i12 & 4) != 0) {
                title = verticalSection.title;
            }
            if ((i12 & 8) != 0) {
                list = verticalSection.userAds;
            }
            return verticalSection.copy(i11, verticalSectionsTabs, title, list);
        }

        public final int component1() {
            return this.catId;
        }

        public final VerticalSectionsTabs component2() {
            return this.defaultTab;
        }

        public final Title component3() {
            return this.title;
        }

        public final List<ListingItemBrief> component4() {
            return this.userAds;
        }

        public final VerticalSection copy(int i11, VerticalSectionsTabs verticalSectionsTabs, Title title, List<ListingItemBrief> userAds) {
            o.i(title, "title");
            o.i(userAds, "userAds");
            return new VerticalSection(i11, verticalSectionsTabs, title, userAds);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalSection)) {
                return false;
            }
            VerticalSection verticalSection = (VerticalSection) obj;
            if (this.catId == verticalSection.catId && this.defaultTab == verticalSection.defaultTab && o.d(this.title, verticalSection.title) && o.d(this.userAds, verticalSection.userAds)) {
                return true;
            }
            return false;
        }

        public final int getCatId() {
            return this.catId;
        }

        public final VerticalSectionsTabs getDefaultTab() {
            return this.defaultTab;
        }

        public final Title getTitle() {
            return this.title;
        }

        public final List<ListingItemBrief> getUserAds() {
            return this.userAds;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.catId) * 31;
            VerticalSectionsTabs verticalSectionsTabs = this.defaultTab;
            if (verticalSectionsTabs == null) {
                hashCode = 0;
            } else {
                hashCode = verticalSectionsTabs.hashCode();
            }
            return ((((hashCode2 + hashCode) * 31) + this.title.hashCode()) * 31) + this.userAds.hashCode();
        }

        public String toString() {
            int i11 = this.catId;
            VerticalSectionsTabs verticalSectionsTabs = this.defaultTab;
            Title title = this.title;
            List<ListingItemBrief> list = this.userAds;
            return "VerticalSection(catId=" + i11 + ", defaultTab=" + verticalSectionsTabs + ", title=" + title + ", userAds=" + list + ")";
        }

        public /* synthetic */ VerticalSection(int i11, VerticalSectionsTabs verticalSectionsTabs, Title title, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, (i12 & 2) != 0 ? VerticalSectionsTabs.TOP_USER_ADS : verticalSectionsTabs, title, list);
        }
    }
}

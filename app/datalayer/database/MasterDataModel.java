package com.forsale.app.datalayer.database;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MasterDataModel.kt */
/* loaded from: classes2.dex */
public final class MasterDataModel {
    public static final String ANALYTICS_MODEL = "analytics";
    public static final String BOTTOM_TOOLTIP_SETTINGS = "bottom_tooltip_settings";
    public static final String COLLAPSE_HOME_RECOMMENDED = "collapse_home_recommended";
    public static final String DATABASE_URL = "database_url";
    public static final String HOME_TOOLTIP_SETTINGS = "home_tooltip_settings";
    public static final String IMAGE_BASE_URLS = "image_base_urls";
    public static final String IS_PM_ENABLED = "is_pm_enabled";
    public static final String LAST_UPDATE_DATETIME = "last_update_datetime";
    public static final String LAST_UPDATE_TIMESTAMP = "last_update_timestamp";
    public static final String LINKS_MODEL = "links";
    public static final String MISC_MODEL = "misc";
    public static final String ON_BOARDING_VIEW = "onboarding_view";
    public static final String PLF_WEB_VIEW_FEATURE_FLAG = "is_web_view_enabled";
    public static final String POWER_PINS_SETTINGS = "power_pins_settings";
    public static final String SEARCH_PLACEHOLDER_KEYWORDS = "search_placeholder_keywords";
    @c(AgentLocationEntity.AGENTS_LOCATIONS_TABLE)
    private final List<AgentLocationEntity> agentLocations;
    @c(AgentEntity.AGENTS_TABLE)
    private final List<AgentEntity> agents;
    @c(ANALYTICS_MODEL)
    private final MasterDataAnalyticsModel analytics;
    @c(BOTTOM_TOOLTIP_SETTINGS)
    private final List<MasterDataBottomTooltipSettings> bottomTooltipSettings;
    @c(CategoryEntity.CATEGORIES_TABLE)
    private final List<CategoryEntity> categories;
    @c(CategoryDistrict.CATEGORY_DISTRICT_TABLE)
    private final List<CategoryDistrict> categoryDistricts;
    @c(CategoryExtraAttributeEntity.CATEGORIES_EXTRA_ATTRIBUTES)
    private final List<CategoryExtraAttributeEntity> categoryExtraAttributes;
    @c(COLLAPSE_HOME_RECOMMENDED)
    private final Integer collapseHomeRecommended;
    @c(DATABASE_URL)
    private final String databaseUrl;
    @c(DirectoryCategoryEntity.DIRECTORY_CATEGORIES_TABLE)
    private final List<DirectoryCategoryEntity> directoryCategories;
    @c("districts")
    private final List<DistrictEntity> districts;
    @c(ExtraAttributeGroupEntity.EXTRA_ATTRIBUTE_GROUPS_TABLE)
    private final List<ExtraAttributeGroupEntity> extraAttributeGroups;
    @c(ExtraAttributeOptionEntity.EXTRA_ATTRIBUTE_OPTIONS_TABLE)
    private final List<ExtraAttributeOptionEntity> extraAttributeOptions;
    @c(ExtraAttributeEntity.EXTRA_ATTRIBUTES_TABLE)
    private final List<ExtraAttributeEntity> extraAttributes;
    @c(HOME_TOOLTIP_SETTINGS)
    private final HomeTooltipSettings home_tooltip_settings;
    @c(IMAGE_BASE_URLS)
    private final MasterDataImageBaseUrls imageBaseUrls;
    @c(PLF_WEB_VIEW_FEATURE_FLAG)
    private final int isPLFAsWebViewFlagEnabled;
    @c(IS_PM_ENABLED)
    private final int isPmEnabled;
    @c(LAST_UPDATE_DATETIME)
    private final String lastUpdateDatetime;
    @c(LAST_UPDATE_TIMESTAMP)
    private final String lastUpdateTimestamp;
    @c(LINKS_MODEL)
    private final MasterDataLinkModel links;
    @c(LocationEntity.LOCATIONS_TABLE)
    private final List<LocationEntity> locations;
    @c(MISC_MODEL)
    private final MasterDataMiscModel misc;
    @c(ON_BOARDING_VIEW)
    private final OnBoardingViewModel onBoardingView;
    @c(POWER_PINS_SETTINGS)
    private final MasterDataPowerPinsSettings powerPinsSettings;
    @c(ProhibitedKeywordEntity.PROHIBITED_KEYWORDS)
    private final List<ProhibitedKeywordEntity> prohibitedkeywords;
    @c("regions")
    private final List<RegionEntity> regions;
    @c(SEARCH_PLACEHOLDER_KEYWORDS)
    private final List<SearchPlaceholderKeywordEntity> searchPlaceholderKeywords;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MasterDataModel.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MasterDataModel(List<CategoryEntity> list, List<ExtraAttributeEntity> list2, List<CategoryExtraAttributeEntity> list3, List<ExtraAttributeGroupEntity> list4, List<ExtraAttributeOptionEntity> list5, List<AgentEntity> list6, List<LocationEntity> list7, List<AgentLocationEntity> list8, List<DistrictEntity> list9, List<ProhibitedKeywordEntity> list10, List<DirectoryCategoryEntity> list11, List<RegionEntity> list12, List<CategoryDistrict> list13, String lastUpdateTimestamp, String lastUpdateDatetime, MasterDataLinkModel masterDataLinkModel, String databaseUrl, MasterDataMiscModel masterDataMiscModel, MasterDataAnalyticsModel masterDataAnalyticsModel, Integer num, MasterDataPowerPinsSettings masterDataPowerPinsSettings, List<SearchPlaceholderKeywordEntity> list14, MasterDataImageBaseUrls masterDataImageBaseUrls, HomeTooltipSettings homeTooltipSettings, List<MasterDataBottomTooltipSettings> list15, int i11, int i12, OnBoardingViewModel onBoardingView) {
        o.i(lastUpdateTimestamp, "lastUpdateTimestamp");
        o.i(lastUpdateDatetime, "lastUpdateDatetime");
        o.i(databaseUrl, "databaseUrl");
        o.i(onBoardingView, "onBoardingView");
        this.categories = list;
        this.extraAttributes = list2;
        this.categoryExtraAttributes = list3;
        this.extraAttributeGroups = list4;
        this.extraAttributeOptions = list5;
        this.agents = list6;
        this.locations = list7;
        this.agentLocations = list8;
        this.districts = list9;
        this.prohibitedkeywords = list10;
        this.directoryCategories = list11;
        this.regions = list12;
        this.categoryDistricts = list13;
        this.lastUpdateTimestamp = lastUpdateTimestamp;
        this.lastUpdateDatetime = lastUpdateDatetime;
        this.links = masterDataLinkModel;
        this.databaseUrl = databaseUrl;
        this.misc = masterDataMiscModel;
        this.analytics = masterDataAnalyticsModel;
        this.collapseHomeRecommended = num;
        this.powerPinsSettings = masterDataPowerPinsSettings;
        this.searchPlaceholderKeywords = list14;
        this.imageBaseUrls = masterDataImageBaseUrls;
        this.home_tooltip_settings = homeTooltipSettings;
        this.bottomTooltipSettings = list15;
        this.isPmEnabled = i11;
        this.isPLFAsWebViewFlagEnabled = i12;
        this.onBoardingView = onBoardingView;
    }

    public final List<CategoryEntity> component1() {
        return this.categories;
    }

    public final List<ProhibitedKeywordEntity> component10() {
        return this.prohibitedkeywords;
    }

    public final List<DirectoryCategoryEntity> component11() {
        return this.directoryCategories;
    }

    public final List<RegionEntity> component12() {
        return this.regions;
    }

    public final List<CategoryDistrict> component13() {
        return this.categoryDistricts;
    }

    public final String component14() {
        return this.lastUpdateTimestamp;
    }

    public final String component15() {
        return this.lastUpdateDatetime;
    }

    public final MasterDataLinkModel component16() {
        return this.links;
    }

    public final String component17() {
        return this.databaseUrl;
    }

    public final MasterDataMiscModel component18() {
        return this.misc;
    }

    public final MasterDataAnalyticsModel component19() {
        return this.analytics;
    }

    public final List<ExtraAttributeEntity> component2() {
        return this.extraAttributes;
    }

    public final Integer component20() {
        return this.collapseHomeRecommended;
    }

    public final MasterDataPowerPinsSettings component21() {
        return this.powerPinsSettings;
    }

    public final List<SearchPlaceholderKeywordEntity> component22() {
        return this.searchPlaceholderKeywords;
    }

    public final MasterDataImageBaseUrls component23() {
        return this.imageBaseUrls;
    }

    public final HomeTooltipSettings component24() {
        return this.home_tooltip_settings;
    }

    public final List<MasterDataBottomTooltipSettings> component25() {
        return this.bottomTooltipSettings;
    }

    public final int component26() {
        return this.isPmEnabled;
    }

    public final int component27() {
        return this.isPLFAsWebViewFlagEnabled;
    }

    public final OnBoardingViewModel component28() {
        return this.onBoardingView;
    }

    public final List<CategoryExtraAttributeEntity> component3() {
        return this.categoryExtraAttributes;
    }

    public final List<ExtraAttributeGroupEntity> component4() {
        return this.extraAttributeGroups;
    }

    public final List<ExtraAttributeOptionEntity> component5() {
        return this.extraAttributeOptions;
    }

    public final List<AgentEntity> component6() {
        return this.agents;
    }

    public final List<LocationEntity> component7() {
        return this.locations;
    }

    public final List<AgentLocationEntity> component8() {
        return this.agentLocations;
    }

    public final List<DistrictEntity> component9() {
        return this.districts;
    }

    public final MasterDataModel copy(List<CategoryEntity> list, List<ExtraAttributeEntity> list2, List<CategoryExtraAttributeEntity> list3, List<ExtraAttributeGroupEntity> list4, List<ExtraAttributeOptionEntity> list5, List<AgentEntity> list6, List<LocationEntity> list7, List<AgentLocationEntity> list8, List<DistrictEntity> list9, List<ProhibitedKeywordEntity> list10, List<DirectoryCategoryEntity> list11, List<RegionEntity> list12, List<CategoryDistrict> list13, String lastUpdateTimestamp, String lastUpdateDatetime, MasterDataLinkModel masterDataLinkModel, String databaseUrl, MasterDataMiscModel masterDataMiscModel, MasterDataAnalyticsModel masterDataAnalyticsModel, Integer num, MasterDataPowerPinsSettings masterDataPowerPinsSettings, List<SearchPlaceholderKeywordEntity> list14, MasterDataImageBaseUrls masterDataImageBaseUrls, HomeTooltipSettings homeTooltipSettings, List<MasterDataBottomTooltipSettings> list15, int i11, int i12, OnBoardingViewModel onBoardingView) {
        o.i(lastUpdateTimestamp, "lastUpdateTimestamp");
        o.i(lastUpdateDatetime, "lastUpdateDatetime");
        o.i(databaseUrl, "databaseUrl");
        o.i(onBoardingView, "onBoardingView");
        return new MasterDataModel(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, list11, list12, list13, lastUpdateTimestamp, lastUpdateDatetime, masterDataLinkModel, databaseUrl, masterDataMiscModel, masterDataAnalyticsModel, num, masterDataPowerPinsSettings, list14, masterDataImageBaseUrls, homeTooltipSettings, list15, i11, i12, onBoardingView);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MasterDataModel)) {
            return false;
        }
        MasterDataModel masterDataModel = (MasterDataModel) obj;
        if (o.d(this.categories, masterDataModel.categories) && o.d(this.extraAttributes, masterDataModel.extraAttributes) && o.d(this.categoryExtraAttributes, masterDataModel.categoryExtraAttributes) && o.d(this.extraAttributeGroups, masterDataModel.extraAttributeGroups) && o.d(this.extraAttributeOptions, masterDataModel.extraAttributeOptions) && o.d(this.agents, masterDataModel.agents) && o.d(this.locations, masterDataModel.locations) && o.d(this.agentLocations, masterDataModel.agentLocations) && o.d(this.districts, masterDataModel.districts) && o.d(this.prohibitedkeywords, masterDataModel.prohibitedkeywords) && o.d(this.directoryCategories, masterDataModel.directoryCategories) && o.d(this.regions, masterDataModel.regions) && o.d(this.categoryDistricts, masterDataModel.categoryDistricts) && o.d(this.lastUpdateTimestamp, masterDataModel.lastUpdateTimestamp) && o.d(this.lastUpdateDatetime, masterDataModel.lastUpdateDatetime) && o.d(this.links, masterDataModel.links) && o.d(this.databaseUrl, masterDataModel.databaseUrl) && o.d(this.misc, masterDataModel.misc) && o.d(this.analytics, masterDataModel.analytics) && o.d(this.collapseHomeRecommended, masterDataModel.collapseHomeRecommended) && o.d(this.powerPinsSettings, masterDataModel.powerPinsSettings) && o.d(this.searchPlaceholderKeywords, masterDataModel.searchPlaceholderKeywords) && o.d(this.imageBaseUrls, masterDataModel.imageBaseUrls) && o.d(this.home_tooltip_settings, masterDataModel.home_tooltip_settings) && o.d(this.bottomTooltipSettings, masterDataModel.bottomTooltipSettings) && this.isPmEnabled == masterDataModel.isPmEnabled && this.isPLFAsWebViewFlagEnabled == masterDataModel.isPLFAsWebViewFlagEnabled && o.d(this.onBoardingView, masterDataModel.onBoardingView)) {
            return true;
        }
        return false;
    }

    public final List<AgentLocationEntity> getAgentLocations() {
        return this.agentLocations;
    }

    public final List<AgentEntity> getAgents() {
        return this.agents;
    }

    public final MasterDataAnalyticsModel getAnalytics() {
        return this.analytics;
    }

    public final List<MasterDataBottomTooltipSettings> getBottomTooltipSettings() {
        return this.bottomTooltipSettings;
    }

    public final List<CategoryEntity> getCategories() {
        return this.categories;
    }

    public final List<CategoryDistrict> getCategoryDistricts() {
        return this.categoryDistricts;
    }

    public final List<CategoryExtraAttributeEntity> getCategoryExtraAttributes() {
        return this.categoryExtraAttributes;
    }

    public final Integer getCollapseHomeRecommended() {
        return this.collapseHomeRecommended;
    }

    public final String getDatabaseUrl() {
        return this.databaseUrl;
    }

    public final List<DirectoryCategoryEntity> getDirectoryCategories() {
        return this.directoryCategories;
    }

    public final List<DistrictEntity> getDistricts() {
        return this.districts;
    }

    public final List<ExtraAttributeGroupEntity> getExtraAttributeGroups() {
        return this.extraAttributeGroups;
    }

    public final List<ExtraAttributeOptionEntity> getExtraAttributeOptions() {
        return this.extraAttributeOptions;
    }

    public final List<ExtraAttributeEntity> getExtraAttributes() {
        return this.extraAttributes;
    }

    public final HomeTooltipSettings getHome_tooltip_settings() {
        return this.home_tooltip_settings;
    }

    public final MasterDataImageBaseUrls getImageBaseUrls() {
        return this.imageBaseUrls;
    }

    public final String getLastUpdateDatetime() {
        return this.lastUpdateDatetime;
    }

    public final String getLastUpdateTimestamp() {
        return this.lastUpdateTimestamp;
    }

    public final MasterDataLinkModel getLinks() {
        return this.links;
    }

    public final List<LocationEntity> getLocations() {
        return this.locations;
    }

    public final MasterDataMiscModel getMisc() {
        return this.misc;
    }

    public final OnBoardingViewModel getOnBoardingView() {
        return this.onBoardingView;
    }

    public final MasterDataPowerPinsSettings getPowerPinsSettings() {
        return this.powerPinsSettings;
    }

    public final List<ProhibitedKeywordEntity> getProhibitedkeywords() {
        return this.prohibitedkeywords;
    }

    public final List<RegionEntity> getRegions() {
        return this.regions;
    }

    public final List<SearchPlaceholderKeywordEntity> getSearchPlaceholderKeywords() {
        return this.searchPlaceholderKeywords;
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
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        int hashCode21;
        List<CategoryEntity> list = this.categories;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = hashCode * 31;
        List<ExtraAttributeEntity> list2 = this.extraAttributes;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<CategoryExtraAttributeEntity> list3 = this.categoryExtraAttributes;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        List<ExtraAttributeGroupEntity> list4 = this.extraAttributeGroups;
        if (list4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list4.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        List<ExtraAttributeOptionEntity> list5 = this.extraAttributeOptions;
        if (list5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = list5.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        List<AgentEntity> list6 = this.agents;
        if (list6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list6.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        List<LocationEntity> list7 = this.locations;
        if (list7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = list7.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        List<AgentLocationEntity> list8 = this.agentLocations;
        if (list8 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = list8.hashCode();
        }
        int i19 = (i18 + hashCode8) * 31;
        List<DistrictEntity> list9 = this.districts;
        if (list9 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list9.hashCode();
        }
        int i21 = (i19 + hashCode9) * 31;
        List<ProhibitedKeywordEntity> list10 = this.prohibitedkeywords;
        if (list10 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = list10.hashCode();
        }
        int i22 = (i21 + hashCode10) * 31;
        List<DirectoryCategoryEntity> list11 = this.directoryCategories;
        if (list11 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = list11.hashCode();
        }
        int i23 = (i22 + hashCode11) * 31;
        List<RegionEntity> list12 = this.regions;
        if (list12 == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = list12.hashCode();
        }
        int i24 = (i23 + hashCode12) * 31;
        List<CategoryDistrict> list13 = this.categoryDistricts;
        if (list13 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = list13.hashCode();
        }
        int hashCode22 = (((((i24 + hashCode13) * 31) + this.lastUpdateTimestamp.hashCode()) * 31) + this.lastUpdateDatetime.hashCode()) * 31;
        MasterDataLinkModel masterDataLinkModel = this.links;
        if (masterDataLinkModel == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = masterDataLinkModel.hashCode();
        }
        int hashCode23 = (((hashCode22 + hashCode14) * 31) + this.databaseUrl.hashCode()) * 31;
        MasterDataMiscModel masterDataMiscModel = this.misc;
        if (masterDataMiscModel == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = masterDataMiscModel.hashCode();
        }
        int i25 = (hashCode23 + hashCode15) * 31;
        MasterDataAnalyticsModel masterDataAnalyticsModel = this.analytics;
        if (masterDataAnalyticsModel == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = masterDataAnalyticsModel.hashCode();
        }
        int i26 = (i25 + hashCode16) * 31;
        Integer num = this.collapseHomeRecommended;
        if (num == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = num.hashCode();
        }
        int i27 = (i26 + hashCode17) * 31;
        MasterDataPowerPinsSettings masterDataPowerPinsSettings = this.powerPinsSettings;
        if (masterDataPowerPinsSettings == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = masterDataPowerPinsSettings.hashCode();
        }
        int i28 = (i27 + hashCode18) * 31;
        List<SearchPlaceholderKeywordEntity> list14 = this.searchPlaceholderKeywords;
        if (list14 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = list14.hashCode();
        }
        int i29 = (i28 + hashCode19) * 31;
        MasterDataImageBaseUrls masterDataImageBaseUrls = this.imageBaseUrls;
        if (masterDataImageBaseUrls == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = masterDataImageBaseUrls.hashCode();
        }
        int i31 = (i29 + hashCode20) * 31;
        HomeTooltipSettings homeTooltipSettings = this.home_tooltip_settings;
        if (homeTooltipSettings == null) {
            hashCode21 = 0;
        } else {
            hashCode21 = homeTooltipSettings.hashCode();
        }
        int i32 = (i31 + hashCode21) * 31;
        List<MasterDataBottomTooltipSettings> list15 = this.bottomTooltipSettings;
        if (list15 != null) {
            i11 = list15.hashCode();
        }
        return ((((((i32 + i11) * 31) + Integer.hashCode(this.isPmEnabled)) * 31) + Integer.hashCode(this.isPLFAsWebViewFlagEnabled)) * 31) + this.onBoardingView.hashCode();
    }

    public final int isPLFAsWebViewFlagEnabled() {
        return this.isPLFAsWebViewFlagEnabled;
    }

    public final int isPmEnabled() {
        return this.isPmEnabled;
    }

    public String toString() {
        List<CategoryEntity> list = this.categories;
        List<ExtraAttributeEntity> list2 = this.extraAttributes;
        List<CategoryExtraAttributeEntity> list3 = this.categoryExtraAttributes;
        List<ExtraAttributeGroupEntity> list4 = this.extraAttributeGroups;
        List<ExtraAttributeOptionEntity> list5 = this.extraAttributeOptions;
        List<AgentEntity> list6 = this.agents;
        List<LocationEntity> list7 = this.locations;
        List<AgentLocationEntity> list8 = this.agentLocations;
        List<DistrictEntity> list9 = this.districts;
        List<ProhibitedKeywordEntity> list10 = this.prohibitedkeywords;
        List<DirectoryCategoryEntity> list11 = this.directoryCategories;
        List<RegionEntity> list12 = this.regions;
        List<CategoryDistrict> list13 = this.categoryDistricts;
        String str = this.lastUpdateTimestamp;
        String str2 = this.lastUpdateDatetime;
        MasterDataLinkModel masterDataLinkModel = this.links;
        String str3 = this.databaseUrl;
        MasterDataMiscModel masterDataMiscModel = this.misc;
        MasterDataAnalyticsModel masterDataAnalyticsModel = this.analytics;
        Integer num = this.collapseHomeRecommended;
        MasterDataPowerPinsSettings masterDataPowerPinsSettings = this.powerPinsSettings;
        List<SearchPlaceholderKeywordEntity> list14 = this.searchPlaceholderKeywords;
        MasterDataImageBaseUrls masterDataImageBaseUrls = this.imageBaseUrls;
        HomeTooltipSettings homeTooltipSettings = this.home_tooltip_settings;
        List<MasterDataBottomTooltipSettings> list15 = this.bottomTooltipSettings;
        int i11 = this.isPmEnabled;
        int i12 = this.isPLFAsWebViewFlagEnabled;
        OnBoardingViewModel onBoardingViewModel = this.onBoardingView;
        return "MasterDataModel(categories=" + list + ", extraAttributes=" + list2 + ", categoryExtraAttributes=" + list3 + ", extraAttributeGroups=" + list4 + ", extraAttributeOptions=" + list5 + ", agents=" + list6 + ", locations=" + list7 + ", agentLocations=" + list8 + ", districts=" + list9 + ", prohibitedkeywords=" + list10 + ", directoryCategories=" + list11 + ", regions=" + list12 + ", categoryDistricts=" + list13 + ", lastUpdateTimestamp=" + str + ", lastUpdateDatetime=" + str2 + ", links=" + masterDataLinkModel + ", databaseUrl=" + str3 + ", misc=" + masterDataMiscModel + ", analytics=" + masterDataAnalyticsModel + ", collapseHomeRecommended=" + num + ", powerPinsSettings=" + masterDataPowerPinsSettings + ", searchPlaceholderKeywords=" + list14 + ", imageBaseUrls=" + masterDataImageBaseUrls + ", home_tooltip_settings=" + homeTooltipSettings + ", bottomTooltipSettings=" + list15 + ", isPmEnabled=" + i11 + ", isPLFAsWebViewFlagEnabled=" + i12 + ", onBoardingView=" + onBoardingViewModel + ")";
    }
}

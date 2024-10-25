package com.forsale.app.utils.analytics;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.entities.BusinessType;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.Location;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingType;
import com.forsale.app.datalayer.repositories.CategoryDao;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.datalayer.repositories.LocationDao;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.forsale.app.utils.s;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import falcon.chat.entities.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.q;
import kotlin.collections.r;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: AggregatedAllAnalyticsLogger.kt */
/* loaded from: classes3.dex */
public final class AggregatedAllAnalyticsLogger implements CoroutineScope {
    private final MutableStateFlow<h> A;
    private final CoroutineContext B;
    public CoroutineDispatcher C;

    /* renamed from: a  reason: collision with root package name */
    private final AmplitudeLogger f39718a;

    /* renamed from: b  reason: collision with root package name */
    private final LeanPlumLogger f39719b;

    /* renamed from: c  reason: collision with root package name */
    private final d f39720c;

    /* renamed from: d  reason: collision with root package name */
    private final s f39721d;

    /* renamed from: e  reason: collision with root package name */
    private final m f39722e;

    /* renamed from: f  reason: collision with root package name */
    private final RegionsRepository f39723f;

    /* renamed from: g  reason: collision with root package name */
    private final TranslationRepository f39724g;

    /* renamed from: h  reason: collision with root package name */
    private final ExtraAttributeRawRepository f39725h;

    /* renamed from: i  reason: collision with root package name */
    private final DistrictsRepository f39726i;

    /* renamed from: j  reason: collision with root package name */
    private final CategoryDao f39727j;

    /* renamed from: x  reason: collision with root package name */
    private final LocationDao f39728x;

    /* renamed from: y  reason: collision with root package name */
    private final b0<Integer> f39729y;

    /* renamed from: z  reason: collision with root package name */
    private final b0<String> f39730z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AdServerEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AdServerEvents[] $VALUES;
        private final String value;
        public static final AdServerEvents SPLASH_ACTION_LIKED = new AdServerEvents("SPLASH_ACTION_LIKED", 0, "SplashAction-Liked");
        public static final AdServerEvents SPLASH_ACTION_URL_CLICKED = new AdServerEvents("SPLASH_ACTION_URL_CLICKED", 1, "SplashAction-UrlClicked");
        public static final AdServerEvents OFFER_ACTION_LIKED = new AdServerEvents("OFFER_ACTION_LIKED", 2, "OfferAction-Liked");
        public static final AdServerEvents OFFER_ACTION_URL_CLICKED = new AdServerEvents("OFFER_ACTION_URL_CLICKED", 3, "OfferAction-UrlClicked");
        public static final AdServerEvents BANNER_ACTION_LIKED = new AdServerEvents("BANNER_ACTION_LIKED", 4, "BannerAction-Liked");
        public static final AdServerEvents BANNER_ACTION_URL_CLICKED = new AdServerEvents("BANNER_ACTION_URL_CLICKED", 5, "BannerAction-UrlClicked");
        public static final AdServerEvents BANNER_ACTION_VIDEO_UNMUTED = new AdServerEvents("BANNER_ACTION_VIDEO_UNMUTED", 6, "BannerAction-VideoUnmuted");

        private static final /* synthetic */ AdServerEvents[] $values() {
            return new AdServerEvents[]{SPLASH_ACTION_LIKED, SPLASH_ACTION_URL_CLICKED, OFFER_ACTION_LIKED, OFFER_ACTION_URL_CLICKED, BANNER_ACTION_LIKED, BANNER_ACTION_URL_CLICKED, BANNER_ACTION_VIDEO_UNMUTED};
        }

        static {
            AdServerEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AdServerEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AdServerEvents> getEntries() {
            return $ENTRIES;
        }

        public static AdServerEvents valueOf(String str) {
            return (AdServerEvents) Enum.valueOf(AdServerEvents.class, str);
        }

        public static AdServerEvents[] values() {
            return (AdServerEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AdvActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AdvActionEvents[] $VALUES;
        public static final a Companion;
        private static final Map<String, AdvActionEvents> map;
        private final String value;
        public static final AdvActionEvents LISTING_DETAILS_VISITED = new AdvActionEvents("LISTING_DETAILS_VISITED", 0, "Listing Details Visited");
        public static final AdvActionEvents LISTING_DETAILS_FAVORITED = new AdvActionEvents("LISTING_DETAILS_FAVORITED", 1, "Listing Details Favorited");
        public static final AdvActionEvents LISTING_DETAILS_UN_FAVORITED = new AdvActionEvents("LISTING_DETAILS_UN_FAVORITED", 2, "Listing Details UnFavorited");
        public static final AdvActionEvents LISTING_DETAILS_CALL_CLICKED = new AdvActionEvents("LISTING_DETAILS_CALL_CLICKED", 3, "Listing Details Call Clicked");
        public static final AdvActionEvents LISTING_DETAILS_VOICE_CALL_CLICKED = new AdvActionEvents("LISTING_DETAILS_VOICE_CALL_CLICKED", 4, "Listing Details Voice Call Clicked");
        public static final AdvActionEvents LISTING_DETAILS_WHATS_APP_CLICKED = new AdvActionEvents("LISTING_DETAILS_WHATS_APP_CLICKED", 5, "Listing Details Whatsapp Clicked");
        public static final AdvActionEvents LISTING_DETAILS_REPORT_ABUSE_CLICKED = new AdvActionEvents("LISTING_DETAILS_REPORT_ABUSE_CLICKED", 6, "Listing Details Report Abuse Clicked");
        public static final AdvActionEvents MY_LISTING_DETAILS_VISITED = new AdvActionEvents("MY_LISTING_DETAILS_VISITED", 7, "My Listing Details Visited");
        public static final AdvActionEvents LISTING_DETAILS_SHARE_CLICKED = new AdvActionEvents("LISTING_DETAILS_SHARE_CLICKED", 8, "Listing Details Share Clicked");
        public static final AdvActionEvents LISTING_DETAILS_CHAT_CLICKED = new AdvActionEvents("LISTING_DETAILS_CHAT_CLICKED", 9, "Listing Details Chat Clicked");
        public static final AdvActionEvents LISTING_DETAILS_CHAT_STARTED = new AdvActionEvents("LISTING_DETAILS_CHAT_STARTED", 10, "Listing Details Chat Started");
        public static final AdvActionEvents LISTING_DETAILS_PHONE_CLICKED = new AdvActionEvents("LISTING_DETAILS_PHONE_CLICKED", 11, "Listing Details Phone Clicked");
        public static final AdvActionEvents LISTING_DETAILS_WHATSAPP_DIRECTED = new AdvActionEvents("LISTING_DETAILS_WHATSAPP_DIRECTED", 12, "Listing Details Whatsapp Directed");
        public static final AdvActionEvents LISTING_DETAILS_USER_FOLLOWED = new AdvActionEvents("LISTING_DETAILS_USER_FOLLOWED", 13, "User Follow Clicked");
        public static final AdvActionEvents LISTING_DETAILS_USER_UNFOLLOWED = new AdvActionEvents("LISTING_DETAILS_USER_UNFOLLOWED", 14, "User UnFollow Clicked");
        public static final AdvActionEvents LISTING_DETAILS_MORE_CLICKED = new AdvActionEvents("LISTING_DETAILS_MORE_CLICKED", 15, "Listing Details More Clicked");
        public static final AdvActionEvents VIRTUAL_TOUR_EXPLORE_CLICKED = new AdvActionEvents("VIRTUAL_TOUR_EXPLORE_CLICKED", 16, "Explore Virtual Tour Clicked");
        public static final AdvActionEvents VIRTUAL_TOUR_CLOSE_CLICKED = new AdvActionEvents("VIRTUAL_TOUR_CLOSE_CLICKED", 17, "Explore Virtual Tour Close Clicked");
        public static final AdvActionEvents ADV_ACTION_VOIP_CALL_CLICKED = new AdvActionEvents("ADV_ACTION_VOIP_CALL_CLICKED", 18, "Listing Details Voice Call Clicked");
        public static final AdvActionEvents ADV_ACTION_VOIP_CALL_STARTED = new AdvActionEvents("ADV_ACTION_VOIP_CALL_STARTED", 19, "Listing Details Voice Call Started");
        public static final AdvActionEvents ADV_ACTION_VIDEO_CALL_CLICKED = new AdvActionEvents("ADV_ACTION_VIDEO_CALL_CLICKED", 20, "Listing Details Video Call Clicked");
        public static final AdvActionEvents ADV_ACTION_VIDEO_CALL_STARTED = new AdvActionEvents("ADV_ACTION_VIDEO_CALL_STARTED", 21, "Listing Details Video Call Started");
        public static final AdvActionEvents ADV_ACTION_URL_CLICKED = new AdvActionEvents("ADV_ACTION_URL_CLICKED", 22, "AdvAction-UrlClicked");
        public static final AdvActionEvents ADV_ACTION_RECOMMENDATION_NAVIGATED = new AdvActionEvents("ADV_ACTION_RECOMMENDATION_NAVIGATED", 23, "AdvAction-RecommendationNavigated");
        public static final AdvActionEvents ADV_ACTION_USER_OTHER_ADVS_NAVIGATED = new AdvActionEvents("ADV_ACTION_USER_OTHER_ADVS_NAVIGATED", 24, "AdvAction-UserOtherAdvsNavigated");
        public static final AdvActionEvents ADV_ACTION_USER_PROFILE_CLICKED = new AdvActionEvents("ADV_ACTION_USER_PROFILE_CLICKED", 25, "AdvAction-UserProfileClicked");
        public static final AdvActionEvents ADV_ACTION_TRANSLATE = new AdvActionEvents("ADV_ACTION_TRANSLATE", 26, "AdvAction-Translate");
        public static final AdvActionEvents ADV_ACTION_VOIP_CALL_FAILED = new AdvActionEvents("ADV_ACTION_VOIP_CALL_FAILED", 27, "Listing Details Voice Call Failed");
        public static final AdvActionEvents ADV_ACTION_VIDEO_CALL_FAILED = new AdvActionEvents("ADV_ACTION_VIDEO_CALL_FAILED", 28, "Listing Details Video Call Failed");
        public static final AdvActionEvents MY_LISTING_PREVIEWED = new AdvActionEvents("MY_LISTING_PREVIEWED", 29, "My Listing Previewed");
        public static final AdvActionEvents MY_LISTING_PREVIEW_EDIT_CLICKED = new AdvActionEvents("MY_LISTING_PREVIEW_EDIT_CLICKED", 30, "My Listing Preview Edit Clicked");
        public static final AdvActionEvents RECOMMENDATION_VISITED = new AdvActionEvents("RECOMMENDATION_VISITED", 31, "Recommendation Visited");
        public static final AdvActionEvents ALERT_VIEWED = new AdvActionEvents("ALERT_VIEWED", 32, "Alert Viewed");
        public static final AdvActionEvents ALERT_TRY_AGAIN_CLICKED = new AdvActionEvents("ALERT_TRY_AGAIN_CLICKED", 33, "Alert Try Again Clicked");

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AdvActionEvents a(String type) {
                o.i(type, "type");
                return (AdvActionEvents) AdvActionEvents.map.get(type);
            }
        }

        private static final /* synthetic */ AdvActionEvents[] $values() {
            return new AdvActionEvents[]{LISTING_DETAILS_VISITED, LISTING_DETAILS_FAVORITED, LISTING_DETAILS_UN_FAVORITED, LISTING_DETAILS_CALL_CLICKED, LISTING_DETAILS_VOICE_CALL_CLICKED, LISTING_DETAILS_WHATS_APP_CLICKED, LISTING_DETAILS_REPORT_ABUSE_CLICKED, MY_LISTING_DETAILS_VISITED, LISTING_DETAILS_SHARE_CLICKED, LISTING_DETAILS_CHAT_CLICKED, LISTING_DETAILS_CHAT_STARTED, LISTING_DETAILS_PHONE_CLICKED, LISTING_DETAILS_WHATSAPP_DIRECTED, LISTING_DETAILS_USER_FOLLOWED, LISTING_DETAILS_USER_UNFOLLOWED, LISTING_DETAILS_MORE_CLICKED, VIRTUAL_TOUR_EXPLORE_CLICKED, VIRTUAL_TOUR_CLOSE_CLICKED, ADV_ACTION_VOIP_CALL_CLICKED, ADV_ACTION_VOIP_CALL_STARTED, ADV_ACTION_VIDEO_CALL_CLICKED, ADV_ACTION_VIDEO_CALL_STARTED, ADV_ACTION_URL_CLICKED, ADV_ACTION_RECOMMENDATION_NAVIGATED, ADV_ACTION_USER_OTHER_ADVS_NAVIGATED, ADV_ACTION_USER_PROFILE_CLICKED, ADV_ACTION_TRANSLATE, ADV_ACTION_VOIP_CALL_FAILED, ADV_ACTION_VIDEO_CALL_FAILED, MY_LISTING_PREVIEWED, MY_LISTING_PREVIEW_EDIT_CLICKED, RECOMMENDATION_VISITED, ALERT_VIEWED, ALERT_TRY_AGAIN_CLICKED};
        }

        static {
            int e11;
            int d11;
            AdvActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
            AdvActionEvents[] values = values();
            e11 = i0.e(values.length);
            d11 = m00.o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (AdvActionEvents advActionEvents : values) {
                linkedHashMap.put(advActionEvents.value, advActionEvents);
            }
            map = linkedHashMap;
        }

        private AdvActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AdvActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static AdvActionEvents valueOf(String str) {
            return (AdvActionEvents) Enum.valueOf(AdvActionEvents.class, str);
        }

        public static AdvActionEvents[] values() {
            return (AdvActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AnalyticsAccountType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AnalyticsAccountType[] $VALUES;
        public static final a Companion;
        private final String value;
        public static final AnalyticsAccountType PERSONAL = new AnalyticsAccountType("PERSONAL", 0, "Personal");
        public static final AnalyticsAccountType BUSINESS = new AnalyticsAccountType("BUSINESS", 1, "Business");

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {

            /* compiled from: AggregatedAllAnalyticsLogger.kt */
            /* renamed from: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$AnalyticsAccountType$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0450a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f39731a;

                static {
                    int[] iArr = new int[BusinessType.values().length];
                    try {
                        iArr[BusinessType.BUSINESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BusinessType.PERSONAL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f39731a = iArr;
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AnalyticsAccountType a(BusinessType businessType) {
                o.i(businessType, "businessType");
                int i11 = C0450a.f39731a[businessType.ordinal()];
                if (i11 != 1) {
                    if (i11 == 2) {
                        return AnalyticsAccountType.PERSONAL;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return AnalyticsAccountType.BUSINESS;
            }
        }

        private static final /* synthetic */ AnalyticsAccountType[] $values() {
            return new AnalyticsAccountType[]{PERSONAL, BUSINESS};
        }

        static {
            AnalyticsAccountType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private AnalyticsAccountType(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AnalyticsAccountType> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsAccountType valueOf(String str) {
            return (AnalyticsAccountType) Enum.valueOf(AnalyticsAccountType.class, str);
        }

        public static AnalyticsAccountType[] values() {
            return (AnalyticsAccountType[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AnalyticsListingStatus {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AnalyticsListingStatus[] $VALUES;
        private final String value;
        public static final AnalyticsListingStatus ACTIVE = new AnalyticsListingStatus("ACTIVE", 0, "Active");
        public static final AnalyticsListingStatus QUARANTINED = new AnalyticsListingStatus("QUARANTINED", 1, "Quarantined");
        public static final AnalyticsListingStatus DRAFT = new AnalyticsListingStatus("DRAFT", 2, "Draft");
        public static final AnalyticsListingStatus ARCHIVED = new AnalyticsListingStatus("ARCHIVED", 3, "Archived");

        private static final /* synthetic */ AnalyticsListingStatus[] $values() {
            return new AnalyticsListingStatus[]{ACTIVE, QUARANTINED, DRAFT, ARCHIVED};
        }

        static {
            AnalyticsListingStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnalyticsListingStatus(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AnalyticsListingStatus> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsListingStatus valueOf(String str) {
            return (AnalyticsListingStatus) Enum.valueOf(AnalyticsListingStatus.class, str);
        }

        public static AnalyticsListingStatus[] values() {
            return (AnalyticsListingStatus[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AnalyticsLocation {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AnalyticsLocation[] $VALUES;
        private final String value;
        public static final AnalyticsLocation DISABLED = new AnalyticsLocation("DISABLED", 0, "Disable Location");
        public static final AnalyticsLocation APPROXIMATE = new AnalyticsLocation("APPROXIMATE", 1, "Approximate Location");
        public static final AnalyticsLocation EXACT = new AnalyticsLocation("EXACT", 2, "Exact Location");

        private static final /* synthetic */ AnalyticsLocation[] $values() {
            return new AnalyticsLocation[]{DISABLED, APPROXIMATE, EXACT};
        }

        static {
            AnalyticsLocation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnalyticsLocation(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AnalyticsLocation> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsLocation valueOf(String str) {
            return (AnalyticsLocation) Enum.valueOf(AnalyticsLocation.class, str);
        }

        public static AnalyticsLocation[] values() {
            return (AnalyticsLocation[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AnalyticsOnOffStatus {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AnalyticsOnOffStatus[] $VALUES;
        private final String value;
        public static final AnalyticsOnOffStatus ON = new AnalyticsOnOffStatus("ON", 0, "On");
        public static final AnalyticsOnOffStatus OFF = new AnalyticsOnOffStatus("OFF", 1, "Off");

        private static final /* synthetic */ AnalyticsOnOffStatus[] $values() {
            return new AnalyticsOnOffStatus[]{ON, OFF};
        }

        static {
            AnalyticsOnOffStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnalyticsOnOffStatus(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AnalyticsOnOffStatus> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsOnOffStatus valueOf(String str) {
            return (AnalyticsOnOffStatus) Enum.valueOf(AnalyticsOnOffStatus.class, str);
        }

        public static AnalyticsOnOffStatus[] values() {
            return (AnalyticsOnOffStatus[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class AnalyticsPosition {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AnalyticsPosition[] $VALUES;
        private final String value;
        public static final AnalyticsPosition MID_SCREEN = new AnalyticsPosition("MID_SCREEN", 0, "MidScreen");
        public static final AnalyticsPosition TOP_SCREEN = new AnalyticsPosition("TOP_SCREEN", 1, "TopScreen");
        public static final AnalyticsPosition ACTION_SHEET = new AnalyticsPosition("ACTION_SHEET", 2, "ActionSheet");
        public static final AnalyticsPosition SELLER_ITEM = new AnalyticsPosition("SELLER_ITEM", 3, "SellerItem");
        public static final AnalyticsPosition SETTINGS = new AnalyticsPosition("SETTINGS", 4, "Settings");
        public static final AnalyticsPosition LISTING_LIFE_TIME = new AnalyticsPosition("LISTING_LIFE_TIME", 5, "ListingLifetime");
        public static final AnalyticsPosition ANALYTICS = new AnalyticsPosition("ANALYTICS", 6, "Analytics");
        public static final AnalyticsPosition MY_LISTING_DETAILS = new AnalyticsPosition("MY_LISTING_DETAILS", 7, "MyListingDetails");
        public static final AnalyticsPosition MORE = new AnalyticsPosition("MORE", 8, "More");
        public static final AnalyticsPosition DELETE_ACTION = new AnalyticsPosition("DELETE_ACTION", 9, "DeleteAction");
        public static final AnalyticsPosition ADD_LISTING_PAYMENT_BOTTOM_SHEET = new AnalyticsPosition("ADD_LISTING_PAYMENT_BOTTOM_SHEET", 10, "Add Listing Payment Bottom Sheet");
        public static final AnalyticsPosition EDIT_LISTING_PAYMENT_BOTTOM_SHEET = new AnalyticsPosition("EDIT_LISTING_PAYMENT_BOTTOM_SHEET", 11, "Edit Listing Payment Bottom Sheet");

        private static final /* synthetic */ AnalyticsPosition[] $values() {
            return new AnalyticsPosition[]{MID_SCREEN, TOP_SCREEN, ACTION_SHEET, SELLER_ITEM, SETTINGS, LISTING_LIFE_TIME, ANALYTICS, MY_LISTING_DETAILS, MORE, DELETE_ACTION, ADD_LISTING_PAYMENT_BOTTOM_SHEET, EDIT_LISTING_PAYMENT_BOTTOM_SHEET};
        }

        static {
            AnalyticsPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AnalyticsPosition(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AnalyticsPosition> getEntries() {
            return $ENTRIES;
        }

        public static AnalyticsPosition valueOf(String str) {
            return (AnalyticsPosition) Enum.valueOf(AnalyticsPosition.class, str);
        }

        public static AnalyticsPosition[] values() {
            return (AnalyticsPosition[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class BottomToolTipAction {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ BottomToolTipAction[] $VALUES;
        public static final BottomToolTipAction CLICKED_INSIDE = new BottomToolTipAction("CLICKED_INSIDE", 0, "ClickedInside");
        public static final BottomToolTipAction CLICKED_ON_TAB = new BottomToolTipAction("CLICKED_ON_TAB", 1, "ClickedOntab");
        public static final BottomToolTipAction CLICKED_OUTSIDE = new BottomToolTipAction("CLICKED_OUTSIDE", 2, "ClickedOutSide");
        private final String value;

        private static final /* synthetic */ BottomToolTipAction[] $values() {
            return new BottomToolTipAction[]{CLICKED_INSIDE, CLICKED_ON_TAB, CLICKED_OUTSIDE};
        }

        static {
            BottomToolTipAction[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private BottomToolTipAction(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<BottomToolTipAction> getEntries() {
            return $ENTRIES;
        }

        public static BottomToolTipAction valueOf(String str) {
            return (BottomToolTipAction) Enum.valueOf(BottomToolTipAction.class, str);
        }

        public static BottomToolTipAction[] values() {
            return (BottomToolTipAction[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class CarouselName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CarouselName[] $VALUES;
        private final String value;
        public static final CarouselName HOT_ZONE = new CarouselName("HOT_ZONE", 0, "Hot Zone");
        public static final CarouselName FOR_SALE_REALTY = new CarouselName("FOR_SALE_REALTY", 1, "4sale Realty");
        public static final CarouselName FEATURED = new CarouselName("FEATURED", 2, "Featured");

        private static final /* synthetic */ CarouselName[] $values() {
            return new CarouselName[]{HOT_ZONE, FOR_SALE_REALTY, FEATURED};
        }

        static {
            CarouselName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CarouselName(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CarouselName> getEntries() {
            return $ENTRIES;
        }

        public static CarouselName valueOf(String str) {
            return (CarouselName) Enum.valueOf(CarouselName.class, str);
        }

        public static CarouselName[] values() {
            return (CarouselName[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class ChatActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ChatActionEvents[] $VALUES;
        private final String value;
        public static final ChatActionEvents CHATS_SCREEN_VISITED = new ChatActionEvents("CHATS_SCREEN_VISITED", 0, "ChatsScreenVisited");
        public static final ChatActionEvents CHAT_SCREEN_VISITED = new ChatActionEvents("CHAT_SCREEN_VISITED", 1, "ChatScreenVisited");
        public static final ChatActionEvents CHAT_ACTION_SEND_TEXT = new ChatActionEvents("CHAT_ACTION_SEND_TEXT", 2, "ChatAction-SendText");
        public static final ChatActionEvents CHAT_ACTION_SEND_IMAGE = new ChatActionEvents("CHAT_ACTION_SEND_IMAGE", 3, "ChatAction-SendImage");
        public static final ChatActionEvents CHAT_ACTION_SEND_LOCATION = new ChatActionEvents("CHAT_ACTION_SEND_LOCATION", 4, "ChatAction-SendLocation");
        public static final ChatActionEvents CHAT_ACTION_SEND_VOICE_NOTE = new ChatActionEvents("CHAT_ACTION_SEND_VOICE_NOTE", 5, "ChatAction-SendVoiceNote");
        public static final ChatActionEvents CHAT_ACTION_DEEP_LINK_OTHER_APP = new ChatActionEvents("CHAT_ACTION_DEEP_LINK_OTHER_APP", 6, "ChatAction-DeepLinkOtherApp");

        private static final /* synthetic */ ChatActionEvents[] $values() {
            return new ChatActionEvents[]{CHATS_SCREEN_VISITED, CHAT_SCREEN_VISITED, CHAT_ACTION_SEND_TEXT, CHAT_ACTION_SEND_IMAGE, CHAT_ACTION_SEND_LOCATION, CHAT_ACTION_SEND_VOICE_NOTE, CHAT_ACTION_DEEP_LINK_OTHER_APP};
        }

        static {
            ChatActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private ChatActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<ChatActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static ChatActionEvents valueOf(String str) {
            return (ChatActionEvents) Enum.valueOf(ChatActionEvents.class, str);
        }

        public static ChatActionEvents[] values() {
            return (ChatActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class CustomEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomEvents[] $VALUES;
        public static final a Companion;
        private static final Map<String, CustomEvents> map;
        private final String value;
        public static final CustomEvents USER_REGISTRATION_ACTION_TAKEN = new CustomEvents("USER_REGISTRATION_ACTION_TAKEN", 0, "UserRegistrationActionTaken");
        public static final CustomEvents HOME_SCREEN_VISITED = new CustomEvents("HOME_SCREEN_VISITED", 1, "Home Visited");
        public static final CustomEvents CATEGORY_VISITED = new CustomEvents("CATEGORY_VISITED", 2, "Category Visited");
        public static final CustomEvents SPLASH_VISITED = new CustomEvents("SPLASH_VISITED", 3, "Splash Visited");
        public static final CustomEvents MORE_SCREEN = new CustomEvents("MORE_SCREEN", 4, "More Visited");
        public static final CustomEvents CALL_LOG_SCREEN_VISITED = new CustomEvents("CALL_LOG_SCREEN_VISITED", 5, "CallLogScreenVisited");
        public static final CustomEvents MY_PROFILE_CHAT_VISITED = new CustomEvents("MY_PROFILE_CHAT_VISITED", 6, "My Profile Chat Visited");
        public static final CustomEvents MY_PROFILE_VOIP_VISITED = new CustomEvents("MY_PROFILE_VOIP_VISITED", 7, "My Profile VoIP Visited");
        public static final CustomEvents REGION_CHANGED = new CustomEvents("REGION_CHANGED", 8, "RegionChanged");
        public static final CustomEvents LANGUAGE_CHANGED = new CustomEvents("LANGUAGE_CHANGED", 9, "Language Changed");
        public static final CustomEvents WEB_LOGIN_ACTION_TAKEN = new CustomEvents("WEB_LOGIN_ACTION_TAKEN", 10, "WebLoginActionTaken");
        public static final CustomEvents MY_LISTING_ANALYTICS_VISITED = new CustomEvents("MY_LISTING_ANALYTICS_VISITED", 11, "MyListingAnalyticsVisited");
        public static final CustomEvents MY_TRANSACTIONS_VISITED = new CustomEvents("MY_TRANSACTIONS_VISITED", 12, "MyTransactionsVisited");
        public static final CustomEvents PAYMENT_HISTORY_VISITED = new CustomEvents("PAYMENT_HISTORY_VISITED", 13, "PaymentHistoryVisited");
        public static final CustomEvents PAYMENT_HISTORY_RECEIPT_OPENED = new CustomEvents("PAYMENT_HISTORY_RECEIPT_OPENED", 14, "PaymentHistoryReceiptOpened");
        public static final CustomEvents NOTIFICATIONS_VISITED = new CustomEvents("NOTIFICATIONS_VISITED", 15, "NotificationsVisited");
        public static final CustomEvents SOCIAL_LINK_CLICKED = new CustomEvents("SOCIAL_LINK_CLICKED", 16, "SocialLinkClicked");
        public static final CustomEvents ABOUT_US_VISITED = new CustomEvents("ABOUT_US_VISITED", 17, "About Us Visited");
        public static final CustomEvents TERMS_VISITED = new CustomEvents("TERMS_VISITED", 18, "Terms Visited");
        public static final CustomEvents SUPPORT_VISITED = new CustomEvents("SUPPORT_VISITED", 19, "Support Visited");
        public static final CustomEvents AGENTS_SCREEN_VISITED = new CustomEvents("AGENTS_SCREEN_VISITED", 20, "AgentsScreenVisited");
        public static final CustomEvents AGENT_DETAILS_SCREEN_VISITED = new CustomEvents("AGENT_DETAILS_SCREEN_VISITED", 21, "AgentDetailsScreenVisited");
        public static final CustomEvents AGENT_ACTION_TAKEN = new CustomEvents("AGENT_ACTION_TAKEN", 22, "AgentActionTaken");
        public static final CustomEvents MY_PROFILE_VISITED = new CustomEvents("MY_PROFILE_VISITED", 23, "My Profile Visited");
        public static final CustomEvents MY_PROFILE_EDIT_SAVED = new CustomEvents("MY_PROFILE_EDIT_SAVED", 24, "My Profile Edit Saved");
        public static final CustomEvents PROFILE_ACTION_TAKEN = new CustomEvents("PROFILE_ACTION_TAKEN", 25, "ProfileActionTaken");
        public static final CustomEvents FOLLOWERS_VISITED = new CustomEvents("FOLLOWERS_VISITED", 26, "FollowersVisited");
        public static final CustomEvents FOLLOWING_VISITED = new CustomEvents("FOLLOWING_VISITED", 27, "FollowingVisited");
        public static final CustomEvents FOLLOW_ACTION_TAKEN = new CustomEvents("FOLLOW_ACTION_TAKEN", 28, "FollowActionTaken");
        public static final CustomEvents PAYMENT_PACKAGES_VISITED = new CustomEvents("PAYMENT_PACKAGES_VISITED", 29, "Payment Packages Visited");
        public static final CustomEvents BUY_PACKAGE_SELECTED = new CustomEvents("BUY_PACKAGE_SELECTED", 30, "Buy Package Selected");
        public static final CustomEvents BUY_MORE_TOKENS_CLICKED = new CustomEvents("BUY_MORE_TOKENS_CLICKED", 31, "Buy More Tokens Clicked");
        public static final CustomEvents PAYMENT_OPTIONS_VISITED = new CustomEvents("PAYMENT_OPTIONS_VISITED", 32, "PaymentOptionsVisited");
        public static final CustomEvents ADDONS_HELP_VISITED = new CustomEvents("ADDONS_HELP_VISITED", 33, "AddonsHelpVisited");
        public static final CustomEvents NEED_UPDATE_SCREEN_SHOWN = new CustomEvents("NEED_UPDATE_SCREEN_SHOWN", 34, "Need Update Screen Shown");
        public static final CustomEvents MAINTENANCE_SCREEN_SHOWN = new CustomEvents("MAINTENANCE_SCREEN_SHOWN", 35, "Maintenance Screen Shown");
        public static final CustomEvents ERROR_SCREEN_SHOWN = new CustomEvents("ERROR_SCREEN_SHOWN", 36, "Error Screen Shown");
        public static final CustomEvents TRANSLATE_SETTING_CHANGED = new CustomEvents("TRANSLATE_SETTING_CHANGED", 37, "Translate Settings Changed");
        public static final CustomEvents PUSH_NOTIFCATION_OPENED = new CustomEvents("PUSH_NOTIFCATION_OPENED", 38, "PushNotifcationOpened");
        public static final CustomEvents LISTINGS_VISITED = new CustomEvents("LISTINGS_VISITED", 39, "Listings Visited");
        public static final CustomEvents LISTINGS_FILLER_CLICKED = new CustomEvents("LISTINGS_FILLER_CLICKED", 40, "Listings Filler Clicked");
        public static final CustomEvents LISTINGS_FILTERED = new CustomEvents("LISTINGS_FILTERED", 41, "Listings Filtered");
        public static final CustomEvents LISTINGS_SCROLLED = new CustomEvents("LISTINGS_SCROLLED", 42, "Listings Scrolled");
        public static final CustomEvents MY_FAVORITE_VIEW_MORE_CLICKED = new CustomEvents("MY_FAVORITE_VIEW_MORE_CLICKED", 43, "My Favorite View More Clicked");
        public static final CustomEvents RESET_ALL_CLICKED = new CustomEvents("RESET_ALL_CLICKED", 44, "Reset All Clicked");
        public static final CustomEvents SEARCH_CLICKED = new CustomEvents("SEARCH_CLICKED", 45, "Search Clicked");
        public static final CustomEvents SEARCH_CLEAR_CLICKED = new CustomEvents("SEARCH_CLEAR_CLICKED", 46, "Search Bar Clear Clicked");
        public static final CustomEvents SEARCH_CANCEL_CLICKED = new CustomEvents("SEARCH_CANCEL_CLICKED", 47, "Search Cancel Clicked");
        public static final CustomEvents SEARCH_BAR_CLICKED = new CustomEvents("SEARCH_BAR_CLICKED", 48, "Search Bar Clicked");
        public static final CustomEvents SEARCH_HISTORY_CLEAR_ALL_CLICKED = new CustomEvents("SEARCH_HISTORY_CLEAR_ALL_CLICKED", 49, "Search History Clear All Clicked");
        public static final CustomEvents SEARCH_HISTORY_ITEM_CLEAR_CLICKED = new CustomEvents("SEARCH_HISTORY_ITEM_CLEAR_CLICKED", 50, "Search History Item Clear Clicked");
        public static final CustomEvents SEARCH_HISTORY_ITEM_CLICKED = new CustomEvents("SEARCH_HISTORY_ITEM_CLICKED", 51, "Search History Item Clicked");
        public static final CustomEvents TREND_ITEM_CLICKED = new CustomEvents("TREND_ITEM_CLICKED", 52, "Trending Item Clicked");
        public static final CustomEvents SPOTLIGHT_SEE_ALL_VISITED = new CustomEvents("SPOTLIGHT_SEE_ALL_VISITED", 53, "Spotlight See All Visited");
        public static final CustomEvents AUTHENTICATION_CLICKED = new CustomEvents("AUTHENTICATION_CLICKED", 54, "Authentication clicked");
        public static final CustomEvents AUTHENTICATION_VISITED = new CustomEvents("AUTHENTICATION_VISITED", 55, "Authentication Visited");
        public static final CustomEvents CHECKING_USER_STATUS_CLICKED = new CustomEvents("CHECKING_USER_STATUS_CLICKED", 56, "Checking User Status Clicked");
        public static final CustomEvents LOGIN_VISITED = new CustomEvents("LOGIN_VISITED", 57, "Login Visited");
        public static final CustomEvents LOGIN_CLICKED = new CustomEvents("LOGIN_CLICKED", 58, "Login Clicked");
        public static final CustomEvents VERIFICATION_VISITED = new CustomEvents("VERIFICATION_VISITED", 59, "Verification Visited");
        public static final CustomEvents VERIFICATION_EDIT_MOBILE_CLICKED = new CustomEvents("VERIFICATION_EDIT_MOBILE_CLICKED", 60, "Verification Edit Mobile Clicked");
        public static final CustomEvents VERIFICATION_EDIT_MOBILE_SAVED = new CustomEvents("VERIFICATION_EDIT_MOBILE_SAVED", 61, "Verification Edit Mobile Saved");
        public static final CustomEvents VERIFICATION_VERIFY_CLICKED = new CustomEvents("VERIFICATION_VERIFY_CLICKED", 62, "Verification Verify Clicked");
        public static final CustomEvents VERIFICATION_DID_NOT_RECIEVE_CODE_CLICKED = new CustomEvents("VERIFICATION_DID_NOT_RECIEVE_CODE_CLICKED", 63, "Verification Did not Recieve Code Clicked");
        public static final CustomEvents VERIFICATION_RESEND_BY_SMS_CLICKED = new CustomEvents("VERIFICATION_RESEND_BY_SMS_CLICKED", 64, "Verification Resend by SMS Clicked");
        public static final CustomEvents VERIFICATION_RESEND_BY_CALL_CLICKED = new CustomEvents("VERIFICATION_RESEND_BY_CALL_CLICKED", 65, "Verification Resend by Call Clicked");
        public static final CustomEvents VERIFICATION_RESEND_BY_WHATSAPP_CLICKED = new CustomEvents("VERIFICATION_RESEND_BY_WHATSAPP_CLICKED", 66, "Verification Resend by WhatsApp Clicked");
        public static final CustomEvents PERSONAL_INFORMATION_VISITED = new CustomEvents("PERSONAL_INFORMATION_VISITED", 67, "Personal Information Visited");
        public static final CustomEvents PERSONAL_INFORMATION_LOGIN_CLICKED = new CustomEvents("PERSONAL_INFORMATION_LOGIN_CLICKED", 68, "Personal Information Login CLicked");
        public static final CustomEvents WELCOME_PAGE_VISITED = new CustomEvents("WELCOME_PAGE_VISITED", 69, "Welcome Page Visited");
        public static final CustomEvents SAVED_SEARCH_VISITED = new CustomEvents("SAVED_SEARCH_VISITED", 70, "Saved Search Visited");
        public static final CustomEvents SAVED_SEARCH_LISTED = new CustomEvents("SAVED_SEARCH_LISTED", 71, "Saved Search Listed");
        public static final CustomEvents RECOMMENDATION_SECTION_VISITED = new CustomEvents("RECOMMENDATION_SECTION_VISITED", 72, "Recommendation Section Visited");
        public static final CustomEvents RECOMMENDATION_SWIPED = new CustomEvents("RECOMMENDATION_SWIPED", 73, "Recommendation Swiped");
        public static final CustomEvents USER_REPORT_ABUSE_CLICKED = new CustomEvents("USER_REPORT_ABUSE_CLICKED", 74, "User Report Abuse Clicked");
        public static final CustomEvents SEARCH_PAGE_VISITED = new CustomEvents("SEARCH_PAGE_VISITED", 75, "Search Page Visited");
        public static final CustomEvents LETS_GET_STARTED_CLICKED = new CustomEvents("LETS_GET_STARTED_CLICKED", 76, "Lets Get Started Clicked");
        public static final CustomEvents CHANGE_CATEGORY_CLICKED = new CustomEvents("CHANGE_CATEGORY_CLICKED", 77, "Change Category Clicked");
        public static final CustomEvents HOT_ZONE_SEE_ALL_CLICKED = new CustomEvents("HOT_ZONE_SEE_ALL_CLICKED", 78, "Hot Zone See All Clicked");
        public static final CustomEvents HOT_ZONE_SCROLLED = new CustomEvents("HOT_ZONE_SCROLLED", 79, "Hot Zone Scrolled");
        public static final CustomEvents HOT_ZONE_SEE_ALL_SCROLLED = new CustomEvents("HOT_ZONE_SEE_ALL_SCROLLED", 80, "Hot Zone See All Scrolled");
        public static final CustomEvents NEW_ARRIVALS_SCROLLED = new CustomEvents("NEW_ARRIVALS_SCROLLED", 81, "New Arrivals Scrolled");
        public static final CustomEvents BOTTOM_TOOLTIP_VIEWED = new CustomEvents("BOTTOM_TOOLTIP_VIEWED", 82, "Bottom Tooltip Viewed");
        public static final CustomEvents BOTTOM_TOOLTIP_ACTION = new CustomEvents("BOTTOM_TOOLTIP_ACTION", 83, "Bottom Tooltip Action");
        public static final CustomEvents PULL_TO_REFRESH = new CustomEvents("PULL_TO_REFRESH", 84, "Pull To Refresh");
        public static final CustomEvents UP_BUTTON_CLICKED = new CustomEvents("UP_BUTTON_CLICKED", 85, "Up Button Clicked");
        public static final CustomEvents CHOOSE_CATEGORY_VISITED = new CustomEvents("CHOOSE_CATEGORY_VISITED", 86, "Choose Category Visited");
        public static final CustomEvents ALERT_CONTINUE_UPLOADING_CLICKED = new CustomEvents("ALERT_CONTINUE_UPLOADING_CLICKED", 87, "Alert Continue Uploading Clicked");
        public static final CustomEvents CAROUSEL_SEE_ALL_SCROLLED = new CustomEvents("CAROUSEL_SEE_ALL_SCROLLED", 88, "Carousel See All Scrolled");

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CustomEvents a(String type) {
                o.i(type, "type");
                return (CustomEvents) CustomEvents.map.get(type);
            }
        }

        private static final /* synthetic */ CustomEvents[] $values() {
            return new CustomEvents[]{USER_REGISTRATION_ACTION_TAKEN, HOME_SCREEN_VISITED, CATEGORY_VISITED, SPLASH_VISITED, MORE_SCREEN, CALL_LOG_SCREEN_VISITED, MY_PROFILE_CHAT_VISITED, MY_PROFILE_VOIP_VISITED, REGION_CHANGED, LANGUAGE_CHANGED, WEB_LOGIN_ACTION_TAKEN, MY_LISTING_ANALYTICS_VISITED, MY_TRANSACTIONS_VISITED, PAYMENT_HISTORY_VISITED, PAYMENT_HISTORY_RECEIPT_OPENED, NOTIFICATIONS_VISITED, SOCIAL_LINK_CLICKED, ABOUT_US_VISITED, TERMS_VISITED, SUPPORT_VISITED, AGENTS_SCREEN_VISITED, AGENT_DETAILS_SCREEN_VISITED, AGENT_ACTION_TAKEN, MY_PROFILE_VISITED, MY_PROFILE_EDIT_SAVED, PROFILE_ACTION_TAKEN, FOLLOWERS_VISITED, FOLLOWING_VISITED, FOLLOW_ACTION_TAKEN, PAYMENT_PACKAGES_VISITED, BUY_PACKAGE_SELECTED, BUY_MORE_TOKENS_CLICKED, PAYMENT_OPTIONS_VISITED, ADDONS_HELP_VISITED, NEED_UPDATE_SCREEN_SHOWN, MAINTENANCE_SCREEN_SHOWN, ERROR_SCREEN_SHOWN, TRANSLATE_SETTING_CHANGED, PUSH_NOTIFCATION_OPENED, LISTINGS_VISITED, LISTINGS_FILLER_CLICKED, LISTINGS_FILTERED, LISTINGS_SCROLLED, MY_FAVORITE_VIEW_MORE_CLICKED, RESET_ALL_CLICKED, SEARCH_CLICKED, SEARCH_CLEAR_CLICKED, SEARCH_CANCEL_CLICKED, SEARCH_BAR_CLICKED, SEARCH_HISTORY_CLEAR_ALL_CLICKED, SEARCH_HISTORY_ITEM_CLEAR_CLICKED, SEARCH_HISTORY_ITEM_CLICKED, TREND_ITEM_CLICKED, SPOTLIGHT_SEE_ALL_VISITED, AUTHENTICATION_CLICKED, AUTHENTICATION_VISITED, CHECKING_USER_STATUS_CLICKED, LOGIN_VISITED, LOGIN_CLICKED, VERIFICATION_VISITED, VERIFICATION_EDIT_MOBILE_CLICKED, VERIFICATION_EDIT_MOBILE_SAVED, VERIFICATION_VERIFY_CLICKED, VERIFICATION_DID_NOT_RECIEVE_CODE_CLICKED, VERIFICATION_RESEND_BY_SMS_CLICKED, VERIFICATION_RESEND_BY_CALL_CLICKED, VERIFICATION_RESEND_BY_WHATSAPP_CLICKED, PERSONAL_INFORMATION_VISITED, PERSONAL_INFORMATION_LOGIN_CLICKED, WELCOME_PAGE_VISITED, SAVED_SEARCH_VISITED, SAVED_SEARCH_LISTED, RECOMMENDATION_SECTION_VISITED, RECOMMENDATION_SWIPED, USER_REPORT_ABUSE_CLICKED, SEARCH_PAGE_VISITED, LETS_GET_STARTED_CLICKED, CHANGE_CATEGORY_CLICKED, HOT_ZONE_SEE_ALL_CLICKED, HOT_ZONE_SCROLLED, HOT_ZONE_SEE_ALL_SCROLLED, NEW_ARRIVALS_SCROLLED, BOTTOM_TOOLTIP_VIEWED, BOTTOM_TOOLTIP_ACTION, PULL_TO_REFRESH, UP_BUTTON_CLICKED, CHOOSE_CATEGORY_VISITED, ALERT_CONTINUE_UPLOADING_CLICKED, CAROUSEL_SEE_ALL_SCROLLED};
        }

        static {
            int e11;
            int d11;
            CustomEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
            CustomEvents[] values = values();
            e11 = i0.e(values.length);
            d11 = m00.o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (CustomEvents customEvents : values) {
                linkedHashMap.put(customEvents.value, customEvents);
            }
            map = linkedHashMap;
        }

        private CustomEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomEvents> getEntries() {
            return $ENTRIES;
        }

        public static CustomEvents valueOf(String str) {
            return (CustomEvents) Enum.valueOf(CustomEvents.class, str);
        }

        public static CustomEvents[] values() {
            return (CustomEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class CustomParameterName {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CustomParameterName[] $VALUES;
        private final String value;
        public static final CustomParameterName RegionName = new CustomParameterName("RegionName", 0, "RegionName");
        public static final CustomParameterName RegionID = new CustomParameterName("RegionID", 1, "RegionID");
        public static final CustomParameterName ACTION_TYPE = new CustomParameterName("ACTION_TYPE", 2, "ActionType");
        public static final CustomParameterName PHONE_NUMBER = new CustomParameterName("PHONE_NUMBER", 3, "PhoneNumber");
        public static final CustomParameterName SELLER_PHONE_NUMBER = new CustomParameterName("SELLER_PHONE_NUMBER", 4, "SellerPhoneNumber");
        public static final CustomParameterName CATEGORY_NAME = new CustomParameterName("CATEGORY_NAME", 5, "CategoryName");
        public static final CustomParameterName CATEGORY_ID = new CustomParameterName("CATEGORY_ID", 6, "CategoryID");
        public static final CustomParameterName VERTICAL = new CustomParameterName("VERTICAL", 7, "Vertical");
        public static final CustomParameterName CATEGORY_LEVEL = new CustomParameterName("CATEGORY_LEVEL", 8, "CategoryLevel");
        public static final CustomParameterName DISTRICTS_LEVEL = new CustomParameterName("DISTRICTS_LEVEL", 9, "DistrictsLevel");
        public static final CustomParameterName POSITION_DISTRICTS_LEVEL = new CustomParameterName("POSITION_DISTRICTS_LEVEL", 10, "PositionDistrictsLevel");
        public static final CustomParameterName CATEGORY_FULL_PATH = new CustomParameterName("CATEGORY_FULL_PATH", 11, "CategoryFullPath");
        public static final CustomParameterName ADV_OWNER_PHONE = new CustomParameterName("ADV_OWNER_PHONE", 12, "AdvOwnerPhone");
        public static final CustomParameterName ADV_ID = new CustomParameterName("ADV_ID", 13, "AdvID");
        public static final CustomParameterName ADV_TITLE = new CustomParameterName("ADV_TITLE", 14, "AdvTitle");
        public static final CustomParameterName LISTING_ID = new CustomParameterName("LISTING_ID", 15, "ListingID");
        public static final CustomParameterName LISTING_TITLE = new CustomParameterName("LISTING_TITLE", 16, "ListingTitle");
        public static final CustomParameterName TRANSLATE = new CustomParameterName("TRANSLATE", 17, "Translate");
        public static final CustomParameterName EXTRA_ATTR = new CustomParameterName("EXTRA_ATTR", 18, "z_ExtraAttr: ");
        public static final CustomParameterName ATTRIBUTES_IDS = new CustomParameterName("ATTRIBUTES_IDS", 19, "AttributesIDs");
        public static final CustomParameterName ATTRIBUTES_NAMES = new CustomParameterName("ATTRIBUTES_NAMES", 20, "AttributesNames");
        public static final CustomParameterName ADDITIONAL_NUMBERS = new CustomParameterName("ADDITIONAL_NUMBERS", 21, "AdditionalNumbers");
        public static final CustomParameterName RECIPIENT_PHONE = new CustomParameterName("RECIPIENT_PHONE", 22, "RecipientPhone");
        public static final CustomParameterName CHAT_SOURCE = new CustomParameterName("CHAT_SOURCE", 23, "Source");
        public static final CustomParameterName SPLASH_ID = new CustomParameterName("SPLASH_ID", 24, "SplashID");
        public static final CustomParameterName LANGUAGE = new CustomParameterName("LANGUAGE", 25, "Language");
        public static final CustomParameterName OLD_LANGUAGE = new CustomParameterName("OLD_LANGUAGE", 26, "OldLanguage");
        public static final CustomParameterName NEW_LANGUAGE = new CustomParameterName("NEW_LANGUAGE", 27, "NewLanguage");
        public static final CustomParameterName DELETION_REASON = new CustomParameterName("DELETION_REASON", 28, "DeletionReason");
        public static final CustomParameterName ANALYTICS_TYPE = new CustomParameterName("ANALYTICS_TYPE", 29, "AnalyticsType");
        public static final CustomParameterName ITEM_ID = new CustomParameterName(Constants.ITEM_ID, 30, "ItemID");
        public static final CustomParameterName TEXT_VALUE = new CustomParameterName("TEXT_VALUE", 31, "TextValue");
        public static final CustomParameterName PRICE = new CustomParameterName("PRICE", 32, "Price");
        public static final CustomParameterName PRICE_MIN = new CustomParameterName("PRICE_MIN", 33, "PriceMin");
        public static final CustomParameterName PRICE_MAX = new CustomParameterName("PRICE_MAX", 34, "PriceMax");
        public static final CustomParameterName IMAGES_ONLY = new CustomParameterName("IMAGES_ONLY", 35, "ImagesOnly");
        public static final CustomParameterName VIDEO_ONLY = new CustomParameterName("VIDEO_ONLY", 36, "VideoOnly");
        public static final CustomParameterName LINK_TYPE = new CustomParameterName("LINK_TYPE", 37, "LinkType");
        public static final CustomParameterName SEARCH_KEYWORD = new CustomParameterName("SEARCH_KEYWORD", 38, "SearchKeyword");
        public static final CustomParameterName NEAR_ME = new CustomParameterName("NEAR_ME", 39, "NearMe");
        public static final CustomParameterName SAVE_SEARCH_CHECKED = new CustomParameterName("SAVE_SEARCH_CHECKED", 40, "SaveSearchChecked");
        public static final CustomParameterName LOCATION_ID = new CustomParameterName("LOCATION_ID", 41, "LocationID");
        public static final CustomParameterName LOCATION_NAME = new CustomParameterName("LOCATION_NAME", 42, "LocationName");
        public static final CustomParameterName AGENT_ID = new CustomParameterName("AGENT_ID", 43, "AgentID");
        public static final CustomParameterName AGENT_NAME = new CustomParameterName("AGENT_NAME", 44, "AgentName");
        public static final CustomParameterName ADV_REGION_NAME = new CustomParameterName("ADV_REGION_NAME", 45, "AdvRegionName");
        public static final CustomParameterName ADV_REGION_ID = new CustomParameterName("ADV_REGION_ID", 46, "AdvRegionID");
        public static final CustomParameterName IS_DRAFT = new CustomParameterName("IS_DRAFT", 47, "IsDraft");
        public static final CustomParameterName IS_ARCHIVED = new CustomParameterName("IS_ARCHIVED", 48, "IsArchived");
        public static final CustomParameterName ALLOW_INTERNET_CALL = new CustomParameterName("ALLOW_INTERNET_CALL", 49, "AllowInternetCall");
        public static final CustomParameterName ALLOW_CHAT = new CustomParameterName("ALLOW_CHAT", 50, "AllowChat");
        public static final CustomParameterName HIDE_MY_NUMBER = new CustomParameterName("HIDE_MY_NUMBER", 51, "HideMyNumber");
        public static final CustomParameterName USED_ALT_NUMBERS = new CustomParameterName("USED_ALT_NUMBERS", 52, "UsedAltNumbers");
        public static final CustomParameterName LOCATION_LONGITUDE = new CustomParameterName("LOCATION_LONGITUDE", 53, "LocationLongitude");
        public static final CustomParameterName LOCATION_LATITUDE = new CustomParameterName("LOCATION_LATITUDE", 54, "LocationLatitude");
        public static final CustomParameterName ACCOUNT_TYPE = new CustomParameterName("ACCOUNT_TYPE", 55, "AccountType");
        public static final CustomParameterName ADD_ON_NAME = new CustomParameterName("ADD_ON_NAME", 56, "AddOnName");
        public static final CustomParameterName ADD_ONS_IDS = new CustomParameterName("ADD_ONS_IDS", 57, "AddOnsIDs");
        public static final CustomParameterName APPROVED_ADD_ONS_IDS = new CustomParameterName("APPROVED_ADD_ONS_IDS", 58, "ApprovedAddOnsIDs");
        public static final CustomParameterName ADD_ONS_NAMES = new CustomParameterName("ADD_ONS_NAMES", 59, "AddOnsNames");
        public static final CustomParameterName IS_LOGGED_IN = new CustomParameterName("IS_LOGGED_IN", 60, "IsLoggedIn");
        public static final CustomParameterName DO_NOT_DISTURB = new CustomParameterName("DO_NOT_DISTURB", 61, "DoNotDisturb");
        public static final CustomParameterName AUTO_REPOST_ON = new CustomParameterName("AUTO_REPOST_ON", 62, "AutoRepostOn");
        public static final CustomParameterName IS_QUARANTINE = new CustomParameterName("IS_QUARANTINE", 63, "IsQuarantine");
        public static final CustomParameterName IS_DO_NOT_DISTURB = new CustomParameterName("IS_DO_NOT_DISTURB", 64, "IsDoNotDisturb");
        public static final CustomParameterName IS_AUTO_RE_POST = new CustomParameterName("IS_AUTO_RE_POST", 65, "IsAutoRepost");
        public static final CustomParameterName IS_HIDE_MY_NUMBER = new CustomParameterName("IS_HIDE_MY_NUMBER", 66, "isHideMyNumber");
        public static final CustomParameterName PROHIBITED_KEYWORDS = new CustomParameterName("PROHIBITED_KEYWORDS", 67, "ProhibitedKeywords");
        public static final CustomParameterName CONTAINS_VIDEO = new CustomParameterName("CONTAINS_VIDEO", 68, "ContainsVideo");
        public static final CustomParameterName CONTAINS_IMAGES = new CustomParameterName("CONTAINS_IMAGES", 69, "ContainsImages");
        public static final CustomParameterName PLAN_ID = new CustomParameterName("PLAN_ID", 70, "PlanID");
        public static final CustomParameterName ADDON_ID = new CustomParameterName("ADDON_ID", 71, "AddOnID");
        public static final CustomParameterName ADDONS_COUNT = new CustomParameterName("ADDONS_COUNT", 72, "AddOnsCount");
        public static final CustomParameterName PROMOTION_USED = new CustomParameterName("PROMOTION_USED", 73, "PromotionUsed");
        public static final CustomParameterName CATEGORY_PRICE = new CustomParameterName("CATEGORY_PRICE", 74, "CategoryPrice");
        public static final CustomParameterName PLAN_PRICE = new CustomParameterName("PLAN_PRICE", 75, "PlanPrice");
        public static final CustomParameterName ADD_ONS_TOTAL_PRICE = new CustomParameterName("ADD_ONS_TOTAL_PRICE", 76, "AddOnsTotalPrice");
        public static final CustomParameterName USER_FREE_CREDITS = new CustomParameterName("USER_FREE_CREDITS", 77, "UserFreeCredits");
        public static final CustomParameterName USER_PREMIUM_CREDITS = new CustomParameterName("USER_PREMIUM_CREDITS", 78, "UserPremiumCredits");
        public static final CustomParameterName IMAGES_COUNT = new CustomParameterName("IMAGES_COUNT", 79, "ImagesCount");
        public static final CustomParameterName PACKAGE_ID = new CustomParameterName("PACKAGE_ID", 80, "PackageID");
        public static final CustomParameterName PACKAGE_NAME = new CustomParameterName("PACKAGE_NAME", 81, "PackageName");
        public static final CustomParameterName PAYMENT_OPTION = new CustomParameterName("PAYMENT_OPTION", 82, "PaymentOption");
        public static final CustomParameterName NOTIFICATION_TYPE = new CustomParameterName("NOTIFICATION_TYPE", 83, "NotificationType");
        public static final CustomParameterName OPENED_FROM = new CustomParameterName("OPENED_FROM", 84, "OpenedFrom");
        public static final CustomParameterName OFFER_ID = new CustomParameterName("OFFER_ID", 85, "OfferID");
        public static final CustomParameterName OFFER_CATEGORY_ID = new CustomParameterName("OFFER_CATEGORY_ID", 86, "OfferCategoryID");
        public static final CustomParameterName OFFER_CATEGORY_NAME = new CustomParameterName("OFFER_CATEGORY_NAME", 87, "OfferCategoryName");
        public static final CustomParameterName LANDMARKS = new CustomParameterName("LANDMARKS", 88, "Landmarks");
        public static final CustomParameterName STREET_NAME = new CustomParameterName("STREET_NAME", 89, "StreetName");
        public static final CustomParameterName LONGTUDE = new CustomParameterName("LONGTUDE", 90, "LocationLongitude");
        public static final CustomParameterName LATITUDE = new CustomParameterName("LATITUDE", 91, "LocationLatitude");
        public static final CustomParameterName LOCATION_OPTIONS = new CustomParameterName("LOCATION_OPTIONS", 92, "LocationOptions");
        public static final CustomParameterName DEVICE_ID = new CustomParameterName("DEVICE_ID", 93, "DeviceId");
        public static final CustomParameterName REPORTER_USER_ID = new CustomParameterName("REPORTER_USER_ID", 94, "ReporterUserID");
        public static final CustomParameterName REPORTED_USER_ID = new CustomParameterName("REPORTED_USER_ID", 95, "ReportedUserID");
        public static final CustomParameterName BANNER_ID = new CustomParameterName("BANNER_ID", 96, "BannerID");
        public static final CustomParameterName BANNER_TYPE = new CustomParameterName("BANNER_TYPE", 97, "BannerType");
        public static final CustomParameterName BANNER_SCREEN = new CustomParameterName("BANNER_SCREEN", 98, "bannerScreen");
        public static final CustomParameterName KEYWORD = new CustomParameterName("KEYWORD", 99, "Keyword");
        public static final CustomParameterName POSITION = new CustomParameterName("POSITION", 100, "Position");
        public static final CustomParameterName ANIMATION_POSITION = new CustomParameterName("ANIMATION_POSITION", FacebookMediationAdapter.ERROR_INVALID_SERVER_PARAMETERS, "Position");
        public static final CustomParameterName STATUS = new CustomParameterName("STATUS", 102, "Status");
        public static final CustomParameterName FROM = new CustomParameterName("FROM", FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, "from");
        public static final CustomParameterName TO = new CustomParameterName("TO", 104, "to");
        public static final CustomParameterName OLD_NUMBERS = new CustomParameterName("OLD_NUMBERS", 105, "OldNumbers");
        public static final CustomParameterName NEW_NUMBERS = new CustomParameterName("NEW_NUMBERS", FacebookMediationAdapter.ERROR_WRONG_NATIVE_TYPE, "NewNumbers");
        public static final CustomParameterName NOTE = new CustomParameterName("NOTE", FacebookMediationAdapter.ERROR_NULL_CONTEXT, "Note");
        public static final CustomParameterName REASON = new CustomParameterName("REASON", FacebookMediationAdapter.ERROR_MAPPING_NATIVE_ASSETS, "Reason");
        public static final CustomParameterName POWER_PIN_ID = new CustomParameterName("POWER_PIN_ID", FacebookMediationAdapter.ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD, "PowerPinID");
        public static final CustomParameterName LISTING_STATUS = new CustomParameterName("LISTING_STATUS", FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, "ListingStatus");
        public static final CustomParameterName ITEM_TYPE = new CustomParameterName("ITEM_TYPE", FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, "Type");
        public static final CustomParameterName LISTING_TYPE = new CustomParameterName("LISTING_TYPE", 112, "ListingType");
        public static final CustomParameterName SOURCE = new CustomParameterName("SOURCE", 113, "Source");
        public static final CustomParameterName PLF_SOURCE = new CustomParameterName("PLF_SOURCE", 114, "PLFSource");
        public static final CustomParameterName LISTING_SOURCE = new CustomParameterName("LISTING_SOURCE", 115, "ListingSource");
        public static final CustomParameterName LISTINGS_COUNT = new CustomParameterName("LISTINGS_COUNT", 116, "ListingsCount");
        public static final CustomParameterName TOTAL_LISTINGS_COUNT = new CustomParameterName("TOTAL_LISTINGS_COUNT", 117, "TotalListingsCount");
        public static final CustomParameterName TOTAL_PAGES_COUNT = new CustomParameterName("TOTAL_PAGES_COUNT", 118, "TotalPagesCount");
        public static final CustomParameterName MAX_ITEM_SCROLLED = new CustomParameterName("MAX_ITEM_SCROLLED", 119, "MaxItemScrolled");
        public static final CustomParameterName MAX_VISITED_PAGE = new CustomParameterName("MAX_VISITED_PAGE", 120, "MaxVisitedPage");
        public static final CustomParameterName PAGES_COUNT = new CustomParameterName("PAGES_COUNT", 121, "PagesCount");
        public static final CustomParameterName TYPE = new CustomParameterName("TYPE", 122, "Type");
        public static final CustomParameterName AREA = new CustomParameterName("AREA", 123, "Area");
        public static final CustomParameterName BLOCK = new CustomParameterName("BLOCK", 124, "Block");
        public static final CustomParameterName POSITION_VERTICAL = new CustomParameterName("POSITION_VERTICAL", 125, "PositionVertical");
        public static final CustomParameterName POSITION_CATEGORY_LEVEL = new CustomParameterName("POSITION_CATEGORY_LEVEL", WebSocketProtocol.PAYLOAD_SHORT, "PositionCategoryLevel");
        public static final CustomParameterName POSITION_CATEGORY_FULL_PATH = new CustomParameterName("POSITION_CATEGORY_FULL_PATH", 127, "PositionCategoryFullPath");
        public static final CustomParameterName POSITION_CATEGORY_ID = new CustomParameterName("POSITION_CATEGORY_ID", 128, "PositionCategoryID");
        public static final CustomParameterName POSITION_CATEGORY_NAME = new CustomParameterName("POSITION_CATEGORY_NAME", 129, "PositionCategoryName");
        public static final CustomParameterName SPOT = new CustomParameterName("SPOT", 130, "Spot");
        public static final CustomParameterName OLD_VERTICAL = new CustomParameterName("OLD_VERTICAL", 131, "OldVertical");
        public static final CustomParameterName NEW_VERTICAL = new CustomParameterName("NEW_VERTICAL", 132, "NewVertical");
        public static final CustomParameterName TAB_NAME = new CustomParameterName("TAB_NAME", 133, "TabName");
        public static final CustomParameterName ACTION_NAME = new CustomParameterName("ACTION_NAME", 134, "ActionName");
        public static final CustomParameterName CLICKED_TAB = new CustomParameterName("CLICKED_TAB", 135, "ClickedTab");
        public static final CustomParameterName SEARCH_BAR_LOCATION = new CustomParameterName("SEARCH_BAR_LOCATION", 136, "Location");
        public static final CustomParameterName SEARCH_HISTORY_COUNT = new CustomParameterName("SEARCH_HISTORY_COUNT", 137, "SearchHistoryCount");
        public static final CustomParameterName RECENT_SEARCH_CATEGORIES_COUNT = new CustomParameterName("RECENT_SEARCH_CATEGORIES_COUNT", 138, "RecentSearchCategoriesCount");
        public static final CustomParameterName RECENT_SEARCH_CATEGORIES_NAMES = new CustomParameterName("RECENT_SEARCH_CATEGORIES_NAMES", 139, "RecentSearchCategoriesNames");
        public static final CustomParameterName SEARCH_HISTORY_KEYWORD = new CustomParameterName("SEARCH_HISTORY_KEYWORD", 140, "Keyword");
        public static final CustomParameterName PAGE_SOURCE = new CustomParameterName("PAGE_SOURCE", 141, "PageSource");
        public static final CustomParameterName PAGE_NAME = new CustomParameterName("PAGE_NAME", 142, "PageName");
        public static final CustomParameterName SEARCH_SOURCE = new CustomParameterName("SEARCH_SOURCE", 143, "SearchSource");
        public static final CustomParameterName ERROR_CODE = new CustomParameterName("ERROR_CODE", 144, "ErrorCode");
        public static final CustomParameterName ERROR_MESSAGE = new CustomParameterName("ERROR_MESSAGE", 145, "ErrorMessage");
        public static final CustomParameterName CURRENT_SCREEN = new CustomParameterName("CURRENT_SCREEN", 146, "CurrentScreen");
        public static final CustomParameterName CLICKED_BUTTON_LOCATION = new CustomParameterName("CLICKED_BUTTON_LOCATION", 147, "ClickedButtonLocation");
        public static final CustomParameterName HOME_PAGE = new CustomParameterName("HOME_PAGE", 148, "Home Page");
        public static final CustomParameterName RELATIVE_CURRENT_CATEGORY_PINNING = new CustomParameterName("RELATIVE_CURRENT_CATEGORY_PINNING", 149, "");
        public static final CustomParameterName RELATIVE_PARENT_PINNING = new CustomParameterName("RELATIVE_PARENT_PINNING", Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, "parent");
        public static final CustomParameterName RELATIVE_GRAND_PINNING = new CustomParameterName("RELATIVE_GRAND_PINNING", 151, "grand");
        public static final CustomParameterName VIRTUAL_TOUR_DURATION = new CustomParameterName("VIRTUAL_TOUR_DURATION", 152, "TourDuration");
        public static final CustomParameterName VIRTUAL_TOUR_POSITION = new CustomParameterName("VIRTUAL_TOUR_POSITION", 153, "VirtualTourPosition");
        public static final CustomParameterName CONTAINS_VIRTUAL_TOUR = new CustomParameterName("CONTAINS_VIRTUAL_TOUR", 154, "ContainsVirtualTour");
        public static final CustomParameterName IS_NEW_LISTING = new CustomParameterName("IS_NEW_LISTING", 155, "isNewListing");
        public static final CustomParameterName SCREEN_NAME = new CustomParameterName("SCREEN_NAME", 156, "ScreenName");
        public static final CustomParameterName MEDIA_TYPE = new CustomParameterName("MEDIA_TYPE", 157, "MediaType");
        public static final CustomParameterName LISTING_PAYMENT_METHOD = new CustomParameterName("LISTING_PAYMENT_METHOD", 158, "ListingPaymentMethod");
        public static final CustomParameterName ADDONS_PAYMENT_METHOD = new CustomParameterName("ADDONS_PAYMENT_METHOD", 159, "AddonsPaymentMethod");
        public static final CustomParameterName ADDONS_PAGE = new CustomParameterName("ADDONS_PAGE", 160, "AddonsPage");
        public static final CustomParameterName FILTERS_COUNT = new CustomParameterName("FILTERS_COUNT", 161, "FiltersCount");
        public static final CustomParameterName FILTERS_NAMES = new CustomParameterName("FILTERS_NAMES", 162, "FiltersNames");
        public static final CustomParameterName CAROUSEL_NAME = new CustomParameterName("CAROUSEL_NAME", 163, "CarouselName");
        public static final CustomParameterName TOTAL_ITEMS_COUNT = new CustomParameterName("TOTAL_ITEMS_COUNT", 164, "TotalItemsCount");
        public static final CustomParameterName PAGE_NUMBER = new CustomParameterName("PAGE_NUMBER", 165, "PageNumber");
        public static final CustomParameterName MAX_SCROLLED_ITEMS = new CustomParameterName("MAX_SCROLLED_ITEMS", 166, "MaxScrolledItems");
        public static final CustomParameterName IS_FOR_SALE_REALTY = new CustomParameterName("IS_FOR_SALE_REALTY", 167, "Is4saleRealty");
        public static final CustomParameterName REVENUE = new CustomParameterName("REVENUE", 168, "Revenue");
        public static final CustomParameterName REVENUE_CURRENCY = new CustomParameterName("REVENUE_CURRENCY", 169, "RevenueCurrency");
        public static final CustomParameterName PACKAGE_PRICE = new CustomParameterName("PACKAGE_PRICE", 170, "PackagePrice");
        public static final CustomParameterName SOURCE_AD_PLATFORM = new CustomParameterName("SOURCE_AD_PLATFORM", 171, "SourceAdPlatform");
        public static final CustomParameterName Campaign_ID = new CustomParameterName("Campaign_ID", 172, "CampaignID");
        public static final CustomParameterName PROMOTED_POST_IS_CANCELED = new CustomParameterName("PROMOTED_POST_IS_CANCELED", 173, "IsCanceled");
        public static final CustomParameterName SOURCE_SECTION_NAME = new CustomParameterName("SOURCE_SECTION_NAME", 174, "SourceSectionName");
        public static final CustomParameterName SORT_BY = new CustomParameterName("SORT_BY", 175, "SortBy");
        public static final CustomParameterName SOURCE_ITEM_ORDER = new CustomParameterName("SOURCE_ITEM_ORDER", 176, "SourceItemOrder");
        public static final CustomParameterName SOURCE_FILTER_NAME = new CustomParameterName("SOURCE_FILTER_NAME", 177, "SourceFilterName");
        public static final CustomParameterName PAGE_MODE = new CustomParameterName("PAGE_MODE", 178, "PageMode");
        public static final CustomParameterName SOURCE_PAGE_MODE = new CustomParameterName("SOURCE_PAGE_MODE", 179, "SourcePageMode");
        public static final CustomParameterName FILTERS_PLACE = new CustomParameterName("FILTERS_PLACE", 180, "FiltersPlace");

        private static final /* synthetic */ CustomParameterName[] $values() {
            return new CustomParameterName[]{RegionName, RegionID, ACTION_TYPE, PHONE_NUMBER, SELLER_PHONE_NUMBER, CATEGORY_NAME, CATEGORY_ID, VERTICAL, CATEGORY_LEVEL, DISTRICTS_LEVEL, POSITION_DISTRICTS_LEVEL, CATEGORY_FULL_PATH, ADV_OWNER_PHONE, ADV_ID, ADV_TITLE, LISTING_ID, LISTING_TITLE, TRANSLATE, EXTRA_ATTR, ATTRIBUTES_IDS, ATTRIBUTES_NAMES, ADDITIONAL_NUMBERS, RECIPIENT_PHONE, CHAT_SOURCE, SPLASH_ID, LANGUAGE, OLD_LANGUAGE, NEW_LANGUAGE, DELETION_REASON, ANALYTICS_TYPE, ITEM_ID, TEXT_VALUE, PRICE, PRICE_MIN, PRICE_MAX, IMAGES_ONLY, VIDEO_ONLY, LINK_TYPE, SEARCH_KEYWORD, NEAR_ME, SAVE_SEARCH_CHECKED, LOCATION_ID, LOCATION_NAME, AGENT_ID, AGENT_NAME, ADV_REGION_NAME, ADV_REGION_ID, IS_DRAFT, IS_ARCHIVED, ALLOW_INTERNET_CALL, ALLOW_CHAT, HIDE_MY_NUMBER, USED_ALT_NUMBERS, LOCATION_LONGITUDE, LOCATION_LATITUDE, ACCOUNT_TYPE, ADD_ON_NAME, ADD_ONS_IDS, APPROVED_ADD_ONS_IDS, ADD_ONS_NAMES, IS_LOGGED_IN, DO_NOT_DISTURB, AUTO_REPOST_ON, IS_QUARANTINE, IS_DO_NOT_DISTURB, IS_AUTO_RE_POST, IS_HIDE_MY_NUMBER, PROHIBITED_KEYWORDS, CONTAINS_VIDEO, CONTAINS_IMAGES, PLAN_ID, ADDON_ID, ADDONS_COUNT, PROMOTION_USED, CATEGORY_PRICE, PLAN_PRICE, ADD_ONS_TOTAL_PRICE, USER_FREE_CREDITS, USER_PREMIUM_CREDITS, IMAGES_COUNT, PACKAGE_ID, PACKAGE_NAME, PAYMENT_OPTION, NOTIFICATION_TYPE, OPENED_FROM, OFFER_ID, OFFER_CATEGORY_ID, OFFER_CATEGORY_NAME, LANDMARKS, STREET_NAME, LONGTUDE, LATITUDE, LOCATION_OPTIONS, DEVICE_ID, REPORTER_USER_ID, REPORTED_USER_ID, BANNER_ID, BANNER_TYPE, BANNER_SCREEN, KEYWORD, POSITION, ANIMATION_POSITION, STATUS, FROM, TO, OLD_NUMBERS, NEW_NUMBERS, NOTE, REASON, POWER_PIN_ID, LISTING_STATUS, ITEM_TYPE, LISTING_TYPE, SOURCE, PLF_SOURCE, LISTING_SOURCE, LISTINGS_COUNT, TOTAL_LISTINGS_COUNT, TOTAL_PAGES_COUNT, MAX_ITEM_SCROLLED, MAX_VISITED_PAGE, PAGES_COUNT, TYPE, AREA, BLOCK, POSITION_VERTICAL, POSITION_CATEGORY_LEVEL, POSITION_CATEGORY_FULL_PATH, POSITION_CATEGORY_ID, POSITION_CATEGORY_NAME, SPOT, OLD_VERTICAL, NEW_VERTICAL, TAB_NAME, ACTION_NAME, CLICKED_TAB, SEARCH_BAR_LOCATION, SEARCH_HISTORY_COUNT, RECENT_SEARCH_CATEGORIES_COUNT, RECENT_SEARCH_CATEGORIES_NAMES, SEARCH_HISTORY_KEYWORD, PAGE_SOURCE, PAGE_NAME, SEARCH_SOURCE, ERROR_CODE, ERROR_MESSAGE, CURRENT_SCREEN, CLICKED_BUTTON_LOCATION, HOME_PAGE, RELATIVE_CURRENT_CATEGORY_PINNING, RELATIVE_PARENT_PINNING, RELATIVE_GRAND_PINNING, VIRTUAL_TOUR_DURATION, VIRTUAL_TOUR_POSITION, CONTAINS_VIRTUAL_TOUR, IS_NEW_LISTING, SCREEN_NAME, MEDIA_TYPE, LISTING_PAYMENT_METHOD, ADDONS_PAYMENT_METHOD, ADDONS_PAGE, FILTERS_COUNT, FILTERS_NAMES, CAROUSEL_NAME, TOTAL_ITEMS_COUNT, PAGE_NUMBER, MAX_SCROLLED_ITEMS, IS_FOR_SALE_REALTY, REVENUE, REVENUE_CURRENCY, PACKAGE_PRICE, SOURCE_AD_PLATFORM, Campaign_ID, PROMOTED_POST_IS_CANCELED, SOURCE_SECTION_NAME, SORT_BY, SOURCE_ITEM_ORDER, SOURCE_FILTER_NAME, PAGE_MODE, SOURCE_PAGE_MODE, FILTERS_PLACE};
        }

        static {
            CustomParameterName[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CustomParameterName(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CustomParameterName> getEntries() {
            return $ENTRIES;
        }

        public static CustomParameterName valueOf(String str) {
            return (CustomParameterName) Enum.valueOf(CustomParameterName.class, str);
        }

        public static CustomParameterName[] values() {
            return (CustomParameterName[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class InAppActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ InAppActionEvents[] $VALUES;
        private final String value;
        public static final InAppActionEvents ANIMATED_LISTING_STARTED = new InAppActionEvents("ANIMATED_LISTING_STARTED", 0, "Animated Listing Started");
        public static final InAppActionEvents ANIMATED_LISTING_VIEWED = new InAppActionEvents("ANIMATED_LISTING_VIEWED", 1, "Animated Listing Viewed");
        public static final InAppActionEvents ANIMATED_LISTING_OPENED = new InAppActionEvents("ANIMATED_LISTING_OPENED", 2, "Animated Listing Opened");
        public static final InAppActionEvents IN_APP_MESSAGE_VIEWED = new InAppActionEvents("IN_APP_MESSAGE_VIEWED", 3, "InAppMessageViewed");
        public static final InAppActionEvents IN_APP_MESSAGE_OPENED = new InAppActionEvents("IN_APP_MESSAGE_OPENED", 4, "InAppMessageOpened");

        private static final /* synthetic */ InAppActionEvents[] $values() {
            return new InAppActionEvents[]{ANIMATED_LISTING_STARTED, ANIMATED_LISTING_VIEWED, ANIMATED_LISTING_OPENED, IN_APP_MESSAGE_VIEWED, IN_APP_MESSAGE_OPENED};
        }

        static {
            InAppActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private InAppActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<InAppActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static InAppActionEvents valueOf(String str) {
            return (InAppActionEvents) Enum.valueOf(InAppActionEvents.class, str);
        }

        public static InAppActionEvents[] values() {
            return (InAppActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class ListingsPageSource {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ListingsPageSource[] $VALUES;
        public static final a Companion;
        private final String value;
        public static final ListingsPageSource SEARCH_RESULTS = new ListingsPageSource("SEARCH_RESULTS", 0, "Search Results");
        public static final ListingsPageSource LISTINGS = new ListingsPageSource("LISTINGS", 1, "Listings");
        public static final ListingsPageSource SPOTLIGHT_SEE_ALL = new ListingsPageSource("SPOTLIGHT_SEE_ALL", 2, "Spotlight See All");
        public static final ListingsPageSource HOT_ZONE_SEE_ALL = new ListingsPageSource("HOT_ZONE_SEE_ALL", 3, "Hotzone See All");
        public static final ListingsPageSource ADVANCED_SEARCH_RESULTS = new ListingsPageSource("ADVANCED_SEARCH_RESULTS", 4, "Advanced Search Results");
        public static final ListingsPageSource WANTED_ITEM_LISTINGS = new ListingsPageSource("WANTED_ITEM_LISTINGS", 5, "Wanted Item Listings");
        public static final ListingsPageSource MY_LISTINGS = new ListingsPageSource("MY_LISTINGS", 6, "My Listings");
        public static final ListingsPageSource MY_FAVORITES = new ListingsPageSource("MY_FAVORITES", 7, "My Favorites");
        public static final ListingsPageSource RECENTLY_VIEWED = new ListingsPageSource("RECENTLY_VIEWED", 8, "Recently Viewed");
        public static final ListingsPageSource MY_LISTING_PREVIEWED = new ListingsPageSource("MY_LISTING_PREVIEWED", 9, "My Listing Previewed");

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {

            /* compiled from: AggregatedAllAnalyticsLogger.kt */
            /* renamed from: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$ListingsPageSource$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0451a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f39732a;

                static {
                    int[] iArr = new int[ListingsTypes.values().length];
                    try {
                        iArr[ListingsTypes.NORMAL_LISTINGS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ListingsTypes.MY_FAVORITES.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ListingsTypes.MY_LISTINGS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ListingsTypes.SPOTLIGHT_ALL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ListingsTypes.WANTED_ITEMS.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ListingsTypes.SEARCH_SCREEN.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ListingsTypes.HOT_ZONES.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ListingsTypes.MY_VIEW_HISTORY.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    f39732a = iArr;
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ListingsPageSource a(ListingsTypes type) {
                o.i(type, "type");
                switch (C0451a.f39732a[type.ordinal()]) {
                    case 1:
                        return ListingsPageSource.LISTINGS;
                    case 2:
                        return ListingsPageSource.MY_FAVORITES;
                    case 3:
                        return ListingsPageSource.MY_LISTINGS;
                    case 4:
                        return ListingsPageSource.SPOTLIGHT_SEE_ALL;
                    case 5:
                        return ListingsPageSource.WANTED_ITEM_LISTINGS;
                    case 6:
                        return ListingsPageSource.SEARCH_RESULTS;
                    case 7:
                        return ListingsPageSource.HOT_ZONE_SEE_ALL;
                    case 8:
                        return ListingsPageSource.RECENTLY_VIEWED;
                    default:
                        return null;
                }
            }
        }

        private static final /* synthetic */ ListingsPageSource[] $values() {
            return new ListingsPageSource[]{SEARCH_RESULTS, LISTINGS, SPOTLIGHT_SEE_ALL, HOT_ZONE_SEE_ALL, ADVANCED_SEARCH_RESULTS, WANTED_ITEM_LISTINGS, MY_LISTINGS, MY_FAVORITES, RECENTLY_VIEWED, MY_LISTING_PREVIEWED};
        }

        static {
            ListingsPageSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private ListingsPageSource(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<ListingsPageSource> getEntries() {
            return $ENTRIES;
        }

        public static ListingsPageSource valueOf(String str) {
            return (ListingsPageSource) Enum.valueOf(ListingsPageSource.class, str);
        }

        public static ListingsPageSource[] values() {
            return (ListingsPageSource[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class ListingsVisitedEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ ListingsVisitedEvents[] $VALUES;
        public static final a Companion;
        private static final Map<String, ListingsVisitedEvents> map;
        private final String value;
        public static final ListingsVisitedEvents FAVORITES_VISITED = new ListingsVisitedEvents("FAVORITES_VISITED", 0, "My Favorite Visited");
        public static final ListingsVisitedEvents RECENTLY_VIEWED_VISITED = new ListingsVisitedEvents("RECENTLY_VIEWED_VISITED", 1, "Recently Viewed Visited");
        public static final ListingsVisitedEvents MY_LISTINGS_VISITED = new ListingsVisitedEvents("MY_LISTINGS_VISITED", 2, "My Listings Visited");
        public static final ListingsVisitedEvents ARCHIVED_LISTINGS_VISITED = new ListingsVisitedEvents("ARCHIVED_LISTINGS_VISITED", 3, "Archived Listings Visited");
        public static final ListingsVisitedEvents STATUS_TAB_CLICKED = new ListingsVisitedEvents("STATUS_TAB_CLICKED", 4, "Status Tab Clicked");
        public static final ListingsVisitedEvents SEARCH_RESULTS_VISITED = new ListingsVisitedEvents("SEARCH_RESULTS_VISITED", 5, "Search Results Visited");
        public static final ListingsVisitedEvents SEARCH_RESULTS_SCROLLED = new ListingsVisitedEvents("SEARCH_RESULTS_SCROLLED", 6, "Search Results Scrolled");
        public static final ListingsVisitedEvents CAROUSEL_SEE_ALL_VISITED = new ListingsVisitedEvents("CAROUSEL_SEE_ALL_VISITED", 7, "Carousel See All Visited");

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ListingsVisitedEvents a(String type) {
                o.i(type, "type");
                return (ListingsVisitedEvents) ListingsVisitedEvents.map.get(type);
            }
        }

        private static final /* synthetic */ ListingsVisitedEvents[] $values() {
            return new ListingsVisitedEvents[]{FAVORITES_VISITED, RECENTLY_VIEWED_VISITED, MY_LISTINGS_VISITED, ARCHIVED_LISTINGS_VISITED, STATUS_TAB_CLICKED, SEARCH_RESULTS_VISITED, SEARCH_RESULTS_SCROLLED, CAROUSEL_SEE_ALL_VISITED};
        }

        static {
            int e11;
            int d11;
            ListingsVisitedEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
            ListingsVisitedEvents[] values = values();
            e11 = i0.e(values.length);
            d11 = m00.o.d(e11, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
            for (ListingsVisitedEvents listingsVisitedEvents : values) {
                linkedHashMap.put(listingsVisitedEvents.value, listingsVisitedEvents);
            }
            map = linkedHashMap;
        }

        private ListingsVisitedEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<ListingsVisitedEvents> getEntries() {
            return $ENTRIES;
        }

        public static ListingsVisitedEvents valueOf(String str) {
            return (ListingsVisitedEvents) Enum.valueOf(ListingsVisitedEvents.class, str);
        }

        public static ListingsVisitedEvents[] values() {
            return (ListingsVisitedEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class MyListingActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ MyListingActionEvents[] $VALUES;
        private final String value;
        public static final MyListingActionEvents MY_LISTING_ACTION_CHATS_CLICKED = new MyListingActionEvents("MY_LISTING_ACTION_CHATS_CLICKED", 0, "My Listing Details Chats Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_DELETED = new MyListingActionEvents("MY_LISTING_DETAILS_DELETED", 1, "My Listing Details Deleted");
        public static final MyListingActionEvents MY_LISTING_DETAILS_DELETE_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_DELETE_CLICKED", 2, "My Listing Details Delete Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_REPOSTED = new MyListingActionEvents("MY_LISTING_DETAILS_REPOSTED", 3, "My Listing Details Reposted");
        public static final MyListingActionEvents MY_LISTING_DETAILS_BOOST_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_BOOST_CLICKED", 4, "My Listing Details Boost Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_ANALYTICS_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_ANALYTICS_CLICKED", 5, "My Listing Details Analytics Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_ALL_ANALYTICS_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_ALL_ANALYTICS_CLICKED", 6, "My Listing Details All Analytics Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_EDIT_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_EDIT_CLICKED", 7, "My Listing Details Edit Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_AUTO_REPOST_TOGGLED = new MyListingActionEvents("MY_LISTING_DETAILS_AUTO_REPOST_TOGGLED", 8, "My Listing Details Auto Repost Toggled");
        public static final MyListingActionEvents MY_LISTING_DETAILS_HIDE_MY_NUMBER_TOGGLED = new MyListingActionEvents("MY_LISTING_DETAILS_HIDE_MY_NUMBER_TOGGLED", 9, "My Listing Details Hide My Number Toggled");
        public static final MyListingActionEvents MY_LISTING_DETAILS_REPOST_CLICKED = new MyListingActionEvents("MY_LISTING_DETAILS_REPOST_CLICKED", 10, "My Listing Details Repost Clicked");
        public static final MyListingActionEvents MY_LISTING_DETAILS_DO_NOT_DISTURB_CHANGED = new MyListingActionEvents("MY_LISTING_DETAILS_DO_NOT_DISTURB_CHANGED", 11, "My Listing Details Do Not Disturb Changed");
        public static final MyListingActionEvents MY_LISTING_DETAILS_ADDITIONAL_NUMBERS_CHANGED = new MyListingActionEvents("MY_LISTING_DETAILS_ADDITIONAL_NUMBERS_CHANGED", 12, "My Listing Details Additional Numbers Changed");

        private static final /* synthetic */ MyListingActionEvents[] $values() {
            return new MyListingActionEvents[]{MY_LISTING_ACTION_CHATS_CLICKED, MY_LISTING_DETAILS_DELETED, MY_LISTING_DETAILS_DELETE_CLICKED, MY_LISTING_DETAILS_REPOSTED, MY_LISTING_DETAILS_BOOST_CLICKED, MY_LISTING_DETAILS_ANALYTICS_CLICKED, MY_LISTING_DETAILS_ALL_ANALYTICS_CLICKED, MY_LISTING_DETAILS_EDIT_CLICKED, MY_LISTING_DETAILS_AUTO_REPOST_TOGGLED, MY_LISTING_DETAILS_HIDE_MY_NUMBER_TOGGLED, MY_LISTING_DETAILS_REPOST_CLICKED, MY_LISTING_DETAILS_DO_NOT_DISTURB_CHANGED, MY_LISTING_DETAILS_ADDITIONAL_NUMBERS_CHANGED};
        }

        static {
            MyListingActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private MyListingActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<MyListingActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static MyListingActionEvents valueOf(String str) {
            return (MyListingActionEvents) Enum.valueOf(MyListingActionEvents.class, str);
        }

        public static MyListingActionEvents[] values() {
            return (MyListingActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class PowerPinsEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ PowerPinsEvents[] $VALUES;
        private final String value;
        public static final PowerPinsEvents PPS_CALL_CLICKED = new PowerPinsEvents("PPS_CALL_CLICKED", 0, "PPs Call Clicked");
        public static final PowerPinsEvents PPS_PHONE_CLICKED = new PowerPinsEvents("PPS_PHONE_CLICKED", 1, "PPs Phone Clicked");
        public static final PowerPinsEvents PPS_CHAT_CLICKED = new PowerPinsEvents("PPS_CHAT_CLICKED", 2, "PPs Chat Clicked");
        public static final PowerPinsEvents PPS_CHAT_STARTED = new PowerPinsEvents("PPS_CHAT_STARTED", 3, "PPs Chat Started");
        public static final PowerPinsEvents PPS_ADD_BUTTON_CLICKED = new PowerPinsEvents("PPS_ADD_BUTTON_CLICKED", 4, "PPs Add Button Clicked");

        private static final /* synthetic */ PowerPinsEvents[] $values() {
            return new PowerPinsEvents[]{PPS_CALL_CLICKED, PPS_PHONE_CLICKED, PPS_CHAT_CLICKED, PPS_CHAT_STARTED, PPS_ADD_BUTTON_CLICKED};
        }

        static {
            PowerPinsEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private PowerPinsEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<PowerPinsEvents> getEntries() {
            return $ENTRIES;
        }

        public static PowerPinsEvents valueOf(String str) {
            return (PowerPinsEvents) Enum.valueOf(PowerPinsEvents.class, str);
        }

        public static PowerPinsEvents[] values() {
            return (PowerPinsEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class SearchPageSource {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ SearchPageSource[] $VALUES;
        private final String value;
        public static final SearchPageSource SEARCH_PAGE = new SearchPageSource("SEARCH_PAGE", 0, "Search Page");
        public static final SearchPageSource NO_RESULTS_PAGE = new SearchPageSource("NO_RESULTS_PAGE", 1, "No Results Page");

        private static final /* synthetic */ SearchPageSource[] $values() {
            return new SearchPageSource[]{SEARCH_PAGE, NO_RESULTS_PAGE};
        }

        static {
            SearchPageSource[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private SearchPageSource(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<SearchPageSource> getEntries() {
            return $ENTRIES;
        }

        public static SearchPageSource valueOf(String str) {
            return (SearchPageSource) Enum.valueOf(SearchPageSource.class, str);
        }

        public static SearchPageSource[] values() {
            return (SearchPageSource[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class WalkThroughActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ WalkThroughActionEvents[] $VALUES;
        public static final WalkThroughActionEvents HELP_WALK_THROUGH_STARTED = new WalkThroughActionEvents("HELP_WALK_THROUGH_STARTED", 0, "HelpWalkthroughStarted");
        public static final WalkThroughActionEvents HELP_WALK_THROUGH_STOPPED = new WalkThroughActionEvents("HELP_WALK_THROUGH_STOPPED", 1, "HelpWalkthroughStopped");
        private final String value;

        private static final /* synthetic */ WalkThroughActionEvents[] $values() {
            return new WalkThroughActionEvents[]{HELP_WALK_THROUGH_STARTED, HELP_WALK_THROUGH_STOPPED};
        }

        static {
            WalkThroughActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private WalkThroughActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<WalkThroughActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static WalkThroughActionEvents valueOf(String str) {
            return (WalkThroughActionEvents) Enum.valueOf(WalkThroughActionEvents.class, str);
        }

        public static WalkThroughActionEvents[] values() {
            return (WalkThroughActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class WantedItemActionEvents {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ WantedItemActionEvents[] $VALUES;
        public static final WantedItemActionEvents WANTED_ITEMS_ACTION_ADDED = new WantedItemActionEvents("WANTED_ITEMS_ACTION_ADDED", 0, "WantedItemsAction-Added");
        public static final WantedItemActionEvents WANTED_ITEMS_ACTION_DELETED = new WantedItemActionEvents("WANTED_ITEMS_ACTION_DELETED", 1, "WantedItemsAction-Deleted");
        public static final WantedItemActionEvents WANTED_ITEMS_ACTION_SEARCHED = new WantedItemActionEvents("WANTED_ITEMS_ACTION_SEARCHED", 2, "WantedItemsAction-Searched");
        private final String value;

        private static final /* synthetic */ WantedItemActionEvents[] $values() {
            return new WantedItemActionEvents[]{WANTED_ITEMS_ACTION_ADDED, WANTED_ITEMS_ACTION_DELETED, WANTED_ITEMS_ACTION_SEARCHED};
        }

        static {
            WantedItemActionEvents[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private WantedItemActionEvents(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<WantedItemActionEvents> getEntries() {
            return $ENTRIES;
        }

        public static WantedItemActionEvents valueOf(String str) {
            return (WantedItemActionEvents) Enum.valueOf(WantedItemActionEvents.class, str);
        }

        public static WantedItemActionEvents[] values() {
            return (WantedItemActionEvents[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public static final class YesNo {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ YesNo[] $VALUES;
        public static final a Companion;
        private final String value;
        public static final YesNo YES = new YesNo("YES", 0, MessageTemplateConstants.Values.YES_TEXT);
        public static final YesNo NO = new YesNo("NO", 1, MessageTemplateConstants.Values.NO_TEXT);

        /* compiled from: AggregatedAllAnalyticsLogger.kt */
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final String a(Boolean bool) {
                YesNo yesNo;
                if (o.d(bool, Boolean.TRUE)) {
                    yesNo = YesNo.YES;
                } else {
                    yesNo = YesNo.NO;
                }
                return yesNo.getValue();
            }

            public final String b(Integer num) {
                YesNo yesNo;
                if (num != null && num.intValue() == 1) {
                    yesNo = YesNo.YES;
                } else {
                    yesNo = YesNo.NO;
                }
                return yesNo.getValue();
            }
        }

        private static final /* synthetic */ YesNo[] $values() {
            return new YesNo[]{YES, NO};
        }

        static {
            YesNo[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private YesNo(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<YesNo> getEntries() {
            return $ENTRIES;
        }

        public static YesNo valueOf(String str) {
            return (YesNo) Enum.valueOf(YesNo.class, str);
        }

        public static YesNo[] values() {
            return (YesNo[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: AggregatedAllAnalyticsLogger.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39733a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f39734b;

        static {
            int[] iArr = new int[Location.values().length];
            try {
                iArr[Location.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Location.APPROXIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Location.EXACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39733a = iArr;
            int[] iArr2 = new int[ItemStatus.values().length];
            try {
                iArr2[ItemStatus.DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ItemStatus.QUARANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ItemStatus.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ItemStatus.PINNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ItemStatus.COMMERCIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f39734b = iArr2;
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            String message = th2.getMessage();
            x10.a.b("XXX: " + message, new Object[0]);
            dj.i.f54287a.invoke().f(th2);
        }
    }

    public AggregatedAllAnalyticsLogger(AmplitudeLogger amplitudeLogger, LeanPlumLogger leanPlumLogger, d adjustLogger, s moEngageLogger, m userPropertiesLogger, RegionsRepository regionsRepository, TranslationRepository translationRepository, ExtraAttributeRawRepository extraAttributeRawRepository, DistrictsRepository districtsRepository, CategoryDao categoryDao, LocationDao locationDao) {
        o.i(amplitudeLogger, "amplitudeLogger");
        o.i(leanPlumLogger, "leanPlumLogger");
        o.i(adjustLogger, "adjustLogger");
        o.i(moEngageLogger, "moEngageLogger");
        o.i(userPropertiesLogger, "userPropertiesLogger");
        o.i(regionsRepository, "regionsRepository");
        o.i(translationRepository, "translationRepository");
        o.i(extraAttributeRawRepository, "extraAttributeRawRepository");
        o.i(districtsRepository, "districtsRepository");
        o.i(categoryDao, "categoryDao");
        o.i(locationDao, "locationDao");
        this.f39718a = amplitudeLogger;
        this.f39719b = leanPlumLogger;
        this.f39720c = adjustLogger;
        this.f39721d = moEngageLogger;
        this.f39722e = userPropertiesLogger;
        this.f39723f = regionsRepository;
        this.f39724g = translationRepository;
        this.f39725h = extraAttributeRawRepository;
        this.f39726i = districtsRepository;
        this.f39727j = categoryDao;
        this.f39728x = locationDao;
        this.f39729y = new b0<>();
        this.f39730z = new b0<>();
        this.A = StateFlowKt.MutableStateFlow(null);
        this.B = new b(CoroutineExceptionHandler.Key);
    }

    public static /* synthetic */ Object B(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, List list, CustomParameterName customParameterName, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            customParameterName = CustomParameterName.DISTRICTS_LEVEL;
        }
        return aggregatedAllAnalyticsLogger.A(list, customParameterName, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0180, code lost:
        if (r4 != null) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Type inference failed for: r14v3, types: [T, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(java.util.List<com.forsale.app.datalayer.network.entities.ExtraAttr> r14, zz.a<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r15) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.D(java.util.List, zz.a):java.lang.Object");
    }

    private final List<Pair<String, String>> E(Float f11, Float f12) {
        List<Pair<String, String>> n11;
        List<Pair<String, String>> q11;
        if (f11 == null || f12 == null) {
            n11 = r.n();
            return n11;
        }
        q11 = r.q(wz.i.a(CustomParameterName.LOCATION_LONGITUDE.getValue(), f11.toString()), wz.i.a(CustomParameterName.LOCATION_LATITUDE.getValue(), f12.toString()));
        return q11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
        r4 = kotlin.text.s.C(r1.getScreenType(), " ", "_", false, 4, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(java.util.List<com.forsale.app.datalayer.network.responses.listingdetails.OtherStatusAll> r12, int r13, zz.a<? super java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>>> r14) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.G(java.util.List, int, zz.a):java.lang.Object");
    }

    private final Map<String, List<String>> H(List<AddonsRequested> list) {
        Map<String, List<String>> h11;
        List<AddonsRequested> list2;
        int y11;
        List X0;
        Map<String, List<String>> f11;
        if (list != null) {
            if (!list.isEmpty()) {
                list2 = list;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                String valueOf = String.valueOf(CustomParameterName.ADD_ONS_IDS.getValue());
                List<AddonsRequested> list3 = list;
                y11 = kotlin.collections.s.y(list3, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (AddonsRequested addonsRequested : list3) {
                    arrayList.add(addonsRequested.getAddon());
                }
                X0 = CollectionsKt___CollectionsKt.X0(arrayList);
                f11 = i0.f(wz.i.a(valueOf, X0));
                if (f11 != null) {
                    return f11;
                }
            }
        }
        h11 = j0.h();
        return h11;
    }

    private final Map<String, List<String>> I(List<String> list) {
        Map<String, List<String>> h11;
        List<String> list2;
        List X0;
        Map<String, List<String>> f11;
        if (list != null) {
            if (!list.isEmpty()) {
                list2 = list;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                String valueOf = String.valueOf(CustomParameterName.APPROVED_ADD_ONS_IDS.getValue());
                X0 = CollectionsKt___CollectionsKt.X0(list);
                f11 = i0.f(wz.i.a(valueOf, X0));
                if (f11 != null) {
                    return f11;
                }
            }
        }
        h11 = j0.h();
        return h11;
    }

    public static /* synthetic */ Object N(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, ListingDetailsEntity listingDetailsEntity, Boolean bool, TranslationRepository.Translation translation, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, zz.a aVar, int i11, Object obj) {
        TranslationRepository.Translation translation2;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData2;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace2;
        if ((i11 & 2) != 0) {
            bool = Boolean.FALSE;
        }
        Boolean bool2 = bool;
        if ((i11 & 4) != 0) {
            translation2 = null;
        } else {
            translation2 = translation;
        }
        if ((i11 & 8) != 0) {
            listingDetailsSearchAnalyticsData2 = null;
        } else {
            listingDetailsSearchAnalyticsData2 = listingDetailsSearchAnalyticsData;
        }
        if ((i11 & 16) != 0) {
            listingsAnalytics$FiltersPlace2 = null;
        } else {
            listingsAnalytics$FiltersPlace2 = listingsAnalytics$FiltersPlace;
        }
        return aggregatedAllAnalyticsLogger.M(listingDetailsEntity, bool2, translation2, listingDetailsSearchAnalyticsData2, listingsAnalytics$FiltersPlace2, aVar);
    }

    private final Map<String, String> O(String str) {
        boolean z11;
        Map<String, String> f11;
        String value = CustomParameterName.LISTING_TITLE.getValue();
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && str.length() > 100) {
            str = str.substring(0, 100);
            o.h(str, "substring(...)");
        }
        f11 = i0.f(wz.i.a(value, str));
        return f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.STREET_NAME.getValue(), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0105, code lost:
        r9 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LOCATION_OPTIONS.getValue(), f0(r9).getValue()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object Q(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r9, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r10) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.Q(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }

    private final List<Pair<String, Object>> V(CategoryEntity categoryEntity) {
        List n11;
        List E0;
        List F0;
        List<Pair<String, Object>> F02;
        n11 = r.n();
        E0 = CollectionsKt___CollectionsKt.E0(n11, g0(categoryEntity, CustomParameterName.POSITION_VERTICAL.getValue(), CustomParameterName.POSITION_CATEGORY_LEVEL.getValue()));
        String fullPath = categoryEntity.getFullPath();
        if (fullPath != null) {
            E0 = CollectionsKt___CollectionsKt.F0(E0, wz.i.a(CustomParameterName.POSITION_CATEGORY_FULL_PATH.getValue(), fullPath));
        }
        F0 = CollectionsKt___CollectionsKt.F0(E0, wz.i.a(CustomParameterName.POSITION_CATEGORY_ID.getValue(), Integer.valueOf(categoryEntity.getId())));
        F02 = CollectionsKt___CollectionsKt.F0(F0, wz.i.a(CustomParameterName.POSITION_CATEGORY_NAME.getValue(), categoryEntity.getNameEn()));
        return F02;
    }

    private final List<Pair<String, String>> d(List<String> list, String str) {
        List<Pair<String, String>> n11;
        boolean v11;
        n11 = r.n();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            String str2 = (String) obj;
            if (i11 > 0) {
                String str3 = str + i12;
                v11 = kotlin.text.s.v(str2);
                if (!v11) {
                    n11 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str3, str2));
                }
            }
            i11 = i12;
        }
        return n11;
    }

    private final List<Pair<String, List<String>>> e(List<String> list, String str) {
        List<Pair<String, List<String>>> n11;
        boolean v11;
        List e11;
        n11 = r.n();
        int i11 = 0;
        for (Object obj : list) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            String str2 = (String) obj;
            String str3 = str + i11;
            v11 = kotlin.text.s.v(str2);
            if (!v11) {
                e11 = q.e(str2);
                n11 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str3, e11));
            }
            i11 = i12;
        }
        return n11;
    }

    private final AnalyticsLocation f0(Location location) {
        int i11 = a.f39733a[location.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return AnalyticsLocation.EXACT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return AnalyticsLocation.APPROXIMATE;
        }
        return AnalyticsLocation.DISABLED;
    }

    private static final Map<String, Object> g(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, Map<String, ? extends Object> map) {
        Map<String, Object> o11;
        Map<String, String> d11 = AggregatedAllAnalyticsLoggerKt.d(aggregatedAllAnalyticsLogger.A.getValue());
        if (d11 != null) {
            o11 = j0.o(map, d11);
            return o11;
        }
        return null;
    }

    private final List<Pair<String, String>> g0(CategoryEntity categoryEntity, String str, String str2) {
        List<Pair<String, String>> n11;
        List<String> F0;
        Object k02;
        List F02;
        List<Pair<String, String>> E0;
        n11 = r.n();
        String fullPath = categoryEntity.getFullPath();
        if (fullPath != null) {
            F0 = StringsKt__StringsKt.F0(fullPath, new String[]{"--_--"}, false, 0, 6, null);
            if (!F0.isEmpty()) {
                k02 = CollectionsKt___CollectionsKt.k0(F0);
                F02 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str, k02));
                E0 = CollectionsKt___CollectionsKt.E0(F02, d(F0, str2));
                return E0;
            }
            return n11;
        }
        return n11;
    }

    public static /* synthetic */ void h(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, String str, Map map, Map map2, Map map3, EventGroups eventGroups, boolean z11, boolean z12, boolean z13, boolean z14, int i11, Object obj) {
        Map map4;
        Map map5;
        EventGroups eventGroups2;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        if ((i11 & 4) != 0) {
            map4 = null;
        } else {
            map4 = map2;
        }
        if ((i11 & 8) != 0) {
            map5 = null;
        } else {
            map5 = map3;
        }
        if ((i11 & 16) != 0) {
            eventGroups2 = null;
        } else {
            eventGroups2 = eventGroups;
        }
        if ((i11 & 32) != 0) {
            z15 = false;
        } else {
            z15 = z11;
        }
        if ((i11 & 64) != 0) {
            z16 = false;
        } else {
            z16 = z12;
        }
        if ((i11 & 128) != 0) {
            z17 = false;
        } else {
            z17 = z13;
        }
        if ((i11 & 256) != 0) {
            z18 = true;
        } else {
            z18 = z14;
        }
        aggregatedAllAnalyticsLogger.f(str, map, map4, map5, eventGroups2, z15, z16, z17, z18);
    }

    static /* synthetic */ List h0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, CategoryEntity categoryEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = CustomParameterName.VERTICAL.getValue();
        }
        if ((i11 & 4) != 0) {
            str2 = CustomParameterName.CATEGORY_LEVEL.getValue();
        }
        return aggregatedAllAnalyticsLogger.g0(categoryEntity, str, str2);
    }

    private final List<Pair<String, String>> i0(CategoryEntity categoryEntity, String str, String str2) {
        List<Pair<String, String>> n11;
        List<String> F0;
        Object k02;
        List F02;
        List<Pair<String, String>> E0;
        n11 = r.n();
        String fullPath = categoryEntity.getFullPath();
        if (fullPath != null) {
            F0 = StringsKt__StringsKt.F0(fullPath, new String[]{"--_--"}, false, 0, 6, null);
            if (!F0.isEmpty()) {
                k02 = CollectionsKt___CollectionsKt.k0(F0);
                F02 = CollectionsKt___CollectionsKt.F0(n11, wz.i.a(str, k02));
                E0 = CollectionsKt___CollectionsKt.E0(F02, d(F0, str2));
                return E0;
            }
            return n11;
        }
        return n11;
    }

    static /* synthetic */ List j0(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, CategoryEntity categoryEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = CustomParameterName.POSITION_VERTICAL.getValue();
        }
        if ((i11 & 4) != 0) {
            str2 = CustomParameterName.CATEGORY_LEVEL.getValue();
        }
        return aggregatedAllAnalyticsLogger.i0(categoryEntity, str, str2);
    }

    private final List<Pair<String, List<String>>> k0(DistrictEntity districtEntity, String str) {
        List<Pair<String, List<String>>> n11;
        List<String> F0;
        List<Pair<String, List<String>>> E0;
        n11 = r.n();
        String fullPathEn = districtEntity.getFullPathEn();
        if (fullPathEn != null) {
            F0 = StringsKt__StringsKt.F0(fullPathEn, new String[]{"--_--"}, false, 0, 6, null);
            if (!F0.isEmpty()) {
                E0 = CollectionsKt___CollectionsKt.E0(n11, e(F0, str));
                return E0;
            }
            return n11;
        }
        return n11;
    }

    private final Map<String, List<String>> y(List<DistrictEntity> list, String str) {
        List n11;
        Map<String, List<String>> t11;
        n11 = r.n();
        for (DistrictEntity districtEntity : list) {
            n11 = CollectionsKt___CollectionsKt.E0(n11, k0(districtEntity, str));
        }
        t11 = j0.t(n11);
        return t11;
    }

    static /* synthetic */ Map z(AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger, List list, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = CustomParameterName.DISTRICTS_LEVEL.getValue();
        }
        return aggregatedAllAnalyticsLogger.y(list, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0091 -> B:36:0x0094). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.util.List<java.lang.Integer> r9, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName r10, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictsParametersById$1
            if (r0 == 0) goto L13
            r0 = r11
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictsParametersById$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictsParametersById$1) r0
            int r1 = r0.f39758g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39758g = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictsParametersById$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictsParametersById$1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f39756e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39758g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r9 = r0.f39755d
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.f39754c
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.Object r2 = r0.f39753b
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName) r2
            java.lang.Object r5 = r0.f39752a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r5
            kotlin.f.b(r11)
            goto L94
        L3a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L42:
            kotlin.f.b(r11)
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            if (r11 == 0) goto L53
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L51
            goto L53
        L51:
            r11 = 0
            goto L54
        L53:
            r11 = r4
        L54:
            r11 = r11 ^ r4
            if (r11 == 0) goto L58
            goto L59
        L58:
            r9 = r3
        L59:
            if (r9 == 0) goto La9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
            r5 = r8
            r7 = r11
            r11 = r10
            r10 = r7
        L6a:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r9.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r6 = -1
            if (r2 != r6) goto L7e
            r2 = r4
        L7e:
            com.forsale.app.datalayer.repositories.DistrictsRepository r6 = r5.f39726i
            r0.f39752a = r5
            r0.f39753b = r11
            r0.f39754c = r10
            r0.f39755d = r9
            r0.f39758g = r4
            java.lang.Object r2 = r6.getDistrictByDistrictId(r2, r0)
            if (r2 != r1) goto L91
            return r1
        L91:
            r7 = r2
            r2 = r11
            r11 = r7
        L94:
            com.forsale.app.datalayer.database.DistrictEntity r11 = (com.forsale.app.datalayer.database.DistrictEntity) r11
            if (r11 == 0) goto L9b
            r10.add(r11)
        L9b:
            r11 = r2
            goto L6a
        L9d:
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto La9
            java.lang.String r9 = r11.getValue()
            java.util.Map r3 = r5.y(r10, r9)
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.A(java.util.List, com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091 A[LOOP:0: B:28:0x008b->B:30:0x0091, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C(java.util.List<com.forsale.app.datalayer.network.entities.ExtraAttr> r14, zz.a<? super java.util.List<kotlin.Pair<java.lang.Integer, java.lang.String>>> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1) r0
            int r1 = r0.f39761c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39761c = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$1
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f39759a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39761c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r15)
            goto L7a
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L31:
            kotlin.f.b(r15)
            if (r14 == 0) goto Lb8
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r14 = r14.iterator()
        L41:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L5f
            java.lang.Object r15 = r14.next()
            r2 = r15
            com.forsale.app.datalayer.network.entities.ExtraAttr r2 = (com.forsale.app.datalayer.network.entities.ExtraAttr) r2
            java.lang.String r2 = r2.getValue()
            java.lang.String r5 = "-1"
            boolean r2 = kotlin.jvm.internal.o.d(r2, r5)
            r2 = r2 ^ r3
            if (r2 == 0) goto L41
            r4.add(r15)
            goto L41
        L5f:
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3 r10 = new g00.l<com.forsale.app.datalayer.network.entities.ExtraAttr, java.lang.CharSequence>() { // from class: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3
                static {
                    /*
                        com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  (r0 I:com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3) com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3.a com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3.<init>():void");
                }

                @Override // g00.l
                /* renamed from: b */
                public final java.lang.CharSequence invoke(com.forsale.app.datalayer.network.entities.ExtraAttr r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.o.i(r2, r0)
                        int r2 = r2.getId()
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3.invoke(com.forsale.app.datalayer.network.entities.ExtraAttr):java.lang.CharSequence");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(com.forsale.app.datalayer.network.entities.ExtraAttr r1) {
                    /*
                        r0 = this;
                        com.forsale.app.datalayer.network.entities.ExtraAttr r1 = (com.forsale.app.datalayer.network.entities.ExtraAttr) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getExtraAttributeIdNamePairs$3.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r11 = 31
            r12 = 0
            java.lang.String r14 = kotlin.collections.p.t0(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r14 == 0) goto Lb8
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r15 = r13.f39725h
            r0.f39761c = r3
            java.lang.Object r15 = r15.getExtraAttributesByIds(r14, r0)
            if (r15 != r1) goto L7a
            return r1
        L7a:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.p.y(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L8b:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r15.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r0 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r0
            int r1 = r0.getId()
            java.lang.Integer r1 = kotlin.coroutines.jvm.internal.a.d(r1)
            java.lang.String r0 = r0.getNameEn()
            java.lang.String r0 = com.forsale.app.utils.ContextExtensionsKt.h(r0)
            java.lang.String r0 = com.forsale.app.utils.TypeExtensionsKt.Z(r0)
            kotlin.Pair r0 = wz.i.a(r1, r0)
            r14.add(r0)
            goto L8b
        Lb3:
            java.util.List r14 = kotlin.collections.p.X0(r14)
            goto Lb9
        Lb8:
            r14 = 0
        Lb9:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.C(java.util.List, zz.a):java.lang.Object");
    }

    public final CoroutineDispatcher F() {
        CoroutineDispatcher coroutineDispatcher = this.C;
        if (coroutineDispatcher != null) {
            return coroutineDispatcher;
        }
        o.w("ioDispatcher");
        return null;
    }

    public final List<Pair<String, List<String>>> J(List<Pair<Integer, String>> list) {
        List<Pair<String, List<String>>> n11;
        List<Pair<Integer, String>> list2;
        int y11;
        List X0;
        int y12;
        List X02;
        List<Pair<String, List<String>>> q11;
        if (list != null) {
            if (!list.isEmpty()) {
                list2 = list;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    if (!o.d(((Pair) obj).d(), "-1")) {
                        arrayList.add(obj);
                    }
                }
                Pair[] pairArr = new Pair[2];
                String valueOf = String.valueOf(CustomParameterName.ATTRIBUTES_IDS.getValue());
                List<Pair<Integer, String>> list3 = list;
                y11 = kotlin.collections.s.y(list3, 10);
                ArrayList arrayList2 = new ArrayList(y11);
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(String.valueOf(((Number) ((Pair) it2.next()).c()).intValue()));
                }
                X0 = CollectionsKt___CollectionsKt.X0(arrayList2);
                pairArr[0] = wz.i.a(valueOf, X0);
                String valueOf2 = String.valueOf(CustomParameterName.ATTRIBUTES_NAMES.getValue());
                y12 = kotlin.collections.s.y(list3, 10);
                ArrayList arrayList3 = new ArrayList(y12);
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add((String) ((Pair) it3.next()).d());
                }
                X02 = CollectionsKt___CollectionsKt.X0(arrayList3);
                pairArr[1] = wz.i.a(valueOf2, X02);
                q11 = r.q(pairArr);
                if (q11 != null) {
                    return q11;
                }
            }
        }
        n11 = r.n();
        return n11;
    }

    public final Map<String, String> K(int i11) {
        Map<String, String> h11;
        Map<String, String> f11;
        if (i11 != 0) {
            f11 = i0.f(wz.i.a(CustomParameterName.LISTING_ID.getValue(), String.valueOf(i11)));
            return f11;
        }
        h11 = j0.h();
        return h11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x027b, code lost:
        if (r4 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02e5, code lost:
        if (r4 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
        if (r4 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a7, code lost:
        if (r4 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01da, code lost:
        if (r4 == null) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0316 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r20, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r21) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.L(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x034e, code lost:
        if (r8 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0223, code lost:
        if (r2 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0265, code lost:
        if (r2 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02e0, code lost:
        if (r2 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0333 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r19, java.lang.Boolean r20, com.forsale.app.datalayer.repositories.TranslationRepository.Translation r21, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r22, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace r23, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r24) {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.M(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, java.lang.Boolean, com.forsale.app.datalayer.repositories.TranslationRepository$Translation, com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(int r5, zz.a<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getLocationParameters$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getLocationParameters$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getLocationParameters$1) r0
            int r1 = r0.f39792d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39792d = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getLocationParameters$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getLocationParameters$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39790b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39792d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f39789a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r5
            kotlin.f.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.LocationDao r6 = r4.f39728x
            r0.f39789a = r4
            r0.f39792d = r3
            java.lang.Object r6 = r6.getLocationSuspendById(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.forsale.app.datalayer.database.LocationEntity r6 = (com.forsale.app.datalayer.database.LocationEntity) r6
            if (r6 == 0) goto L77
            r5 = 2
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LOCATION_ID
            java.lang.String r0 = r0.getValue()
            int r1 = r6.getId()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            kotlin.Pair r0 = wz.i.a(r0, r1)
            r1 = 0
            r5[r1] = r0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r0 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.LOCATION_NAME
            java.lang.String r0 = r0.getValue()
            java.lang.String r6 = r6.getNameEn()
            kotlin.Pair r6 = wz.i.a(r0, r6)
            r5[r3] = r6
            java.util.List r5 = kotlin.collections.p.q(r5)
            if (r5 != 0) goto L7b
        L77:
            java.util.List r5 = kotlin.collections.p.n()
        L7b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.S(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T(int r5, zz.a<? super java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.lang.Object>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1) r0
            int r1 = r0.f39796d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39796d = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getPositionCategoryParameters$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39794b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39796d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f39793a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r5
            kotlin.f.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.f39727j
            r0.f39793a = r4
            r0.f39796d = r3
            java.lang.Object r6 = r6.getCategoryById(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            if (r6 == 0) goto L50
            java.util.List r5 = r5.V(r6)
            if (r5 != 0) goto L54
        L50:
            java.util.List r5 = kotlin.collections.p.n()
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.T(int, zz.a):java.lang.Object");
    }

    public final b0<Integer> X() {
        return this.f39729y;
    }

    public final b0<String> Y() {
        return this.f39730z;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, T] */
    public final List<Pair<String, String>> Z() {
        ?? n11;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        n11 = r.n();
        ref$ObjectRef.f61778a = n11;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(F().plus(getCoroutineContext())), null, null, new AggregatedAllAnalyticsLogger$getRegionParameters$1(ref$ObjectRef, this, null), 3, null);
        return (List) ref$ObjectRef.f61778a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(int r12, zz.a<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1
            if (r0 == 0) goto L13
            r0 = r13
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1) r0
            int r1 = r0.f39806e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39806e = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getSeeAllPositionCategoryParameters$1
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f39804c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39806e
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r12 = r0.f39803b
            kotlin.jvm.internal.Ref$ObjectRef r12 = (kotlin.jvm.internal.Ref$ObjectRef) r12
            java.lang.Object r0 = r0.f39802a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r0
            kotlin.f.b(r13)
            r4 = r0
            goto L5b
        L32:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3a:
            kotlin.f.b(r13)
            kotlin.jvm.internal.Ref$ObjectRef r13 = new kotlin.jvm.internal.Ref$ObjectRef
            r13.<init>()
            java.util.List r2 = kotlin.collections.p.n()
            r13.f61778a = r2
            com.forsale.app.datalayer.repositories.CategoryDao r2 = r11.f39727j
            r0.f39802a = r11
            r0.f39803b = r13
            r0.f39806e = r3
            java.lang.Object r12 = r2.getCategorySuspendById(r12, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r4 = r11
            r10 = r13
            r13 = r12
            r12 = r10
        L5b:
            com.forsale.app.datalayer.database.CategoryEntity r13 = (com.forsale.app.datalayer.database.CategoryEntity) r13
            if (r13 == 0) goto Lc0
            T r0 = r12.f61778a
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 2
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION_CATEGORY_ID
            java.lang.String r2 = r2.getValue()
            int r5 = r13.getId()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            kotlin.Pair r2 = wz.i.a(r2, r5)
            r5 = 0
            r1[r5] = r2
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r2 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION_CATEGORY_NAME
            java.lang.String r2 = r2.getValue()
            java.lang.String r5 = r13.getNameEn()
            kotlin.Pair r2 = wz.i.a(r2, r5)
            r1[r3] = r2
            java.util.List r1 = kotlin.collections.p.q(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.p.E0(r0, r1)
            java.util.Collection r0 = (java.util.Collection) r0
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r5 = r13
            java.util.List r1 = j0(r4, r5, r6, r7, r8, r9)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.p.E0(r0, r1)
            r12.f61778a = r0
            java.lang.String r13 = r13.getFullPath()
            T r0 = r12.f61778a
            java.util.Collection r0 = (java.util.Collection) r0
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$CustomParameterName r1 = com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.POSITION_CATEGORY_FULL_PATH
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r13 = wz.i.a(r1, r13)
            java.util.List r13 = kotlin.collections.p.F0(r0, r13)
            r12.f61778a = r13
        Lc0:
            T r12 = r12.f61778a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.a0(int, zz.a):java.lang.Object");
    }

    public final Pair<String, String> b0(TranslationRepository.Translation translation) {
        boolean z11;
        String h11;
        if (translation != null) {
            String value = CustomParameterName.TRANSLATE.getValue();
            String lowerCase = translation.name().toLowerCase(Locale.ROOT);
            o.h(lowerCase, "toLowerCase(...)");
            if (lowerCase.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                StringBuilder sb2 = new StringBuilder();
                h11 = kotlin.text.c.h(lowerCase.charAt(0));
                sb2.append((Object) h11);
                String substring = lowerCase.substring(1);
                o.h(substring, "substring(...)");
                sb2.append(substring);
                lowerCase = sb2.toString();
            }
            return wz.i.a(value, lowerCase);
        }
        return null;
    }

    public final void c0(s9.a value) {
        o.i(value, "value");
        h(this, value.e(), value.a(), null, null, null, value.c(), value.d(), value.b(), false, 284, null);
    }

    public final void d0(List<? extends s9.a> values) {
        o.i(values, "values");
        for (s9.a aVar : values) {
            h(this, aVar.e(), aVar.a(), null, null, null, aVar.c(), aVar.d(), aVar.b(), false, 284, null);
        }
    }

    public final void e0(ui.a carouselTabAnalytic) {
        o.i(carouselTabAnalytic, "carouselTabAnalytic");
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AggregatedAllAnalyticsLogger$logTopCommercialAdsClicked$1(carouselTabAnalytic, this, null), 3, null);
    }

    public final void f(String eventName, Map<String, ? extends Object> attributes, Map<String, ? extends Object> map, Map<String, Double> map2, EventGroups eventGroups, boolean z11, boolean z12, boolean z13, boolean z14) {
        o.i(eventName, "eventName");
        o.i(attributes, "attributes");
        Map<String, ? extends Object> g11 = g(this, attributes);
        if (g11 != null) {
            attributes = g11;
        }
        x10.a.b("Event Name:: " + eventName + ":: All-Attributes:: " + attributes, new Object[0]);
        if (z11) {
            this.f39718a.b(eventName, attributes, map2, eventGroups);
        }
        if (z12) {
            this.f39719b.g(eventName, attributes, map2);
        }
        if (z13) {
            this.f39720c.c(eventName, attributes, map);
        }
        if (z14) {
            this.f39721d.a(eventName, attributes, map2);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
        if (r4 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0163, code lost:
        r4 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.CustomParameterName.ACCOUNT_TYPE.getValue(), com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.AnalyticsAccountType.Companion.a(r4).getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c4, code lost:
        if (r4 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0249, code lost:
        if (r4 == null) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0278, code lost:
        if (r4 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0135 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0259  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.forsale.app.datalayer.network.entities.ListingDetailsEntity r21, zz.a<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r22) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.j(com.forsale.app.datalayer.network.entities.ListingDetailsEntity, zz.a):java.lang.Object");
    }

    public final List<Pair<String, String>> k(List<ExtraAttr> attrs) {
        int y11;
        o.i(attrs, "attrs");
        List<ExtraAttr> list = attrs;
        y11 = kotlin.collections.s.y(list, 10);
        ArrayList arrayList = new ArrayList(y11);
        for (ExtraAttr extraAttr : list) {
            String value = CustomParameterName.EXTRA_ATTR.getValue();
            int id2 = extraAttr.getId();
            arrayList.add(wz.i.a(value + id2, extraAttr.getValue()));
        }
        return arrayList;
    }

    public final Map<String, String> l(int i11) {
        Map<String, String> h11;
        Map<String, String> f11;
        if (i11 != 0) {
            f11 = i0.f(wz.i.a(CustomParameterName.ADV_ID.getValue(), String.valueOf(i11)));
            return f11;
        }
        h11 = j0.h();
        return h11;
    }

    public final List<Pair<String, String>> m(int i11, String agentName) {
        List<Pair<String, String>> q11;
        o.i(agentName, "agentName");
        q11 = r.q(wz.i.a(CustomParameterName.AGENT_ID.getValue(), String.valueOf(i11)), wz.i.a(CustomParameterName.AGENT_NAME.getValue(), agentName));
        return q11;
    }

    public final AmplitudeLogger o() {
        return this.f39718a;
    }

    public final AnalyticsItemType p(ItemStatus itemStatus) {
        o.i(itemStatus, "itemStatus");
        int i11 = a.f39734b[itemStatus.ordinal()];
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 5) {
                    return AnalyticsItemType.NORMAL_LISTING;
                }
                return AnalyticsItemType.COMMERCIAL_LISTING;
            }
            return AnalyticsItemType.PINNED_LISTING;
        }
        return AnalyticsItemType.NORMAL_LISTING;
    }

    public final AnalyticsListingStatus q(ListingItemDetails listingItem) {
        int i11;
        o.i(listingItem, "listingItem");
        if (listingItem.getType() == ListingType.ARCHIVED) {
            return AnalyticsListingStatus.ARCHIVED;
        }
        ItemStatus status = listingItem.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = a.f39734b[status.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return AnalyticsListingStatus.ACTIVE;
            }
            return AnalyticsListingStatus.QUARANTINED;
        }
        return AnalyticsListingStatus.DRAFT;
    }

    public final MutableStateFlow<h> r() {
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(int r5, zz.a<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$1) r0
            int r1 = r0.f39745d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39745d = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39743b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39745d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f39742a
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger r5 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger) r5
            kotlin.f.b(r6)
            goto L46
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.CategoryDao r6 = r4.f39727j
            r0.f39742a = r4
            r0.f39745d = r3
            java.lang.Object r6 = r6.getCategoryById(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5 = r4
        L46:
            com.forsale.app.datalayer.database.CategoryEntity r6 = (com.forsale.app.datalayer.database.CategoryEntity) r6
            if (r6 == 0) goto L50
            java.util.List r5 = r5.v(r6)
            if (r5 != 0) goto L54
        L50:
            java.util.List r5 = kotlin.collections.p.n()
        L54:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.s(int, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(com.forsale.app.datalayer.database.CategoryEntity r5, java.lang.Integer r6, zz.a<? super java.util.List<kotlin.Pair<java.lang.String, java.lang.String>>> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$4
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$4 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$4) r0
            int r1 = r0.f39748c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39748c = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$4 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getCategoryParameters$4
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f39746a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39748c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r7)
            goto L4b
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r7)
            if (r5 == 0) goto L3c
            java.util.List r5 = r4.v(r5)
            if (r5 != 0) goto L56
        L3c:
            if (r6 == 0) goto L52
            int r5 = r6.intValue()
            r0.f39748c = r3
            java.lang.Object r7 = r4.s(r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L50
            goto L52
        L50:
            r5 = r7
            goto L56
        L52:
            java.util.List r5 = kotlin.collections.p.n()
        L56:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.t(com.forsale.app.datalayer.database.CategoryEntity, java.lang.Integer, zz.a):java.lang.Object");
    }

    public final List<Pair<String, String>> v(CategoryEntity category) {
        List n11;
        List q11;
        List E0;
        List E02;
        List<Pair<String, String>> F0;
        o.i(category, "category");
        n11 = r.n();
        q11 = r.q(wz.i.a(CustomParameterName.CATEGORY_ID.getValue(), String.valueOf(category.getId())), wz.i.a(CustomParameterName.CATEGORY_NAME.getValue(), category.getNameEn()));
        E0 = CollectionsKt___CollectionsKt.E0(n11, q11);
        E02 = CollectionsKt___CollectionsKt.E0(E0, h0(this, category, null, null, 6, null));
        F0 = CollectionsKt___CollectionsKt.F0(E02, wz.i.a(CustomParameterName.CATEGORY_FULL_PATH.getValue(), category.getFullPath()));
        return F0;
    }

    public final Object w(zz.a<? super String> aVar) {
        return this.f39723f.getCurrencyNameEn(aVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        r5 = kotlin.collections.q.e(kotlin.coroutines.jvm.internal.a.d(r5.getId()));
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(com.forsale.app.datalayer.database.DistrictEntity r5, zz.a<? super java.util.List<java.lang.Integer>> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictIds$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictIds$1 r0 = (com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictIds$1) r0
            int r1 = r0.f39751c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39751c = r1
            goto L18
        L13:
            com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictIds$1 r0 = new com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger$getDistrictIds$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f39749a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39751c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.f.b(r6)
            goto L4f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.f.b(r6)
            if (r5 == 0) goto L44
            int r5 = r5.getId()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.util.List r5 = kotlin.collections.p.e(r5)
            if (r5 != 0) goto L6b
        L44:
            com.forsale.app.datalayer.repositories.RegionsRepository r5 = r4.f39723f
            r0.f39751c = r3
            java.lang.Object r6 = r5.getCurrentRegion(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            java.lang.Integer r5 = r6.getMainDistrictId()
            if (r5 == 0) goto L64
            int r5 = r5.intValue()
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.a.d(r5)
            java.util.List r5 = kotlin.collections.p.e(r5)
            goto L65
        L64:
            r5 = 0
        L65:
            if (r5 != 0) goto L6b
            java.util.List r5 = kotlin.collections.p.n()
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger.x(com.forsale.app.datalayer.database.DistrictEntity, zz.a):java.lang.Object");
    }
}

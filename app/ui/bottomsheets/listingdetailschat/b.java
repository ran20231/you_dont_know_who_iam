package com.forsale.app.ui.bottomsheets.listingdetailschat;

import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.features.powerpins.ListingsScreenType;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ChatNowModel.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f38156a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f38157b;

    /* renamed from: c  reason: collision with root package name */
    private final ListingItemBrief f38158c;

    /* renamed from: d  reason: collision with root package name */
    private final a f38159d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f38160e;

    /* renamed from: f  reason: collision with root package name */
    private final TranslationRepository.Translation f38161f;

    /* renamed from: g  reason: collision with root package name */
    private final Boolean f38162g;

    /* renamed from: h  reason: collision with root package name */
    private final UserType f38163h;

    /* renamed from: i  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f38164i;

    /* renamed from: j  reason: collision with root package name */
    private final String f38165j;

    /* renamed from: k  reason: collision with root package name */
    private final List<String> f38166k;

    /* renamed from: l  reason: collision with root package name */
    private final ListingsAnalytics$FiltersPlace f38167l;

    /* renamed from: m  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f38168m;

    /* compiled from: ChatNowModel.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f38169a;

        /* renamed from: b  reason: collision with root package name */
        private final String f38170b;

        /* renamed from: c  reason: collision with root package name */
        private final UserProfileData f38171c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f38172d;

        /* renamed from: e  reason: collision with root package name */
        private final List<Integer> f38173e;

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, Object> f38174f;

        /* renamed from: g  reason: collision with root package name */
        private final ListingsScreenType f38175g;

        public a(String title, String str, UserProfileData user, Integer num, List<Integer> list, Map<String, ? extends Object> map, ListingsScreenType listingsScreenType) {
            o.i(title, "title");
            o.i(user, "user");
            this.f38169a = title;
            this.f38170b = str;
            this.f38171c = user;
            this.f38172d = num;
            this.f38173e = list;
            this.f38174f = map;
            this.f38175g = listingsScreenType;
        }

        public final String a() {
            return this.f38170b;
        }

        public final String b() {
            return this.f38169a;
        }

        public final UserProfileData c() {
            return this.f38171c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (o.d(this.f38169a, aVar.f38169a) && o.d(this.f38170b, aVar.f38170b) && o.d(this.f38171c, aVar.f38171c) && o.d(this.f38172d, aVar.f38172d) && o.d(this.f38173e, aVar.f38173e) && o.d(this.f38174f, aVar.f38174f) && this.f38175g == aVar.f38175g) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5 = this.f38169a.hashCode() * 31;
            String str = this.f38170b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode6 = (((hashCode5 + hashCode) * 31) + this.f38171c.hashCode()) * 31;
            Integer num = this.f38172d;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i12 = (hashCode6 + hashCode2) * 31;
            List<Integer> list = this.f38173e;
            if (list == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = list.hashCode();
            }
            int i13 = (i12 + hashCode3) * 31;
            Map<String, Object> map = this.f38174f;
            if (map == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = map.hashCode();
            }
            int i14 = (i13 + hashCode4) * 31;
            ListingsScreenType listingsScreenType = this.f38175g;
            if (listingsScreenType != null) {
                i11 = listingsScreenType.hashCode();
            }
            return i14 + i11;
        }

        public String toString() {
            String str = this.f38169a;
            String str2 = this.f38170b;
            UserProfileData userProfileData = this.f38171c;
            Integer num = this.f38172d;
            List<Integer> list = this.f38173e;
            Map<String, Object> map = this.f38174f;
            ListingsScreenType listingsScreenType = this.f38175g;
            return "ItemInfo(title=" + str + ", thumb=" + str2 + ", user=" + userProfileData + ", categoryId=" + num + ", districtsIds=" + list + ", filtersData=" + map + ", listingsScreenType=" + listingsScreenType + ")";
        }

        public /* synthetic */ a(String str, String str2, UserProfileData userProfileData, Integer num, List list, Map map, ListingsScreenType listingsScreenType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, userProfileData, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : list, (i11 & 32) != 0 ? null : map, (i11 & 64) != 0 ? null : listingsScreenType);
        }
    }

    public b(int i11, ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, a aVar, boolean z11, TranslationRepository.Translation translation, Boolean bool, UserType userType, ListingDetailsAnalyticSource listingDetailsAnalyticSource, String str, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
        this.f38156a = i11;
        this.f38157b = listingItemDetails;
        this.f38158c = listingItemBrief;
        this.f38159d = aVar;
        this.f38160e = z11;
        this.f38161f = translation;
        this.f38162g = bool;
        this.f38163h = userType;
        this.f38164i = listingDetailsAnalyticSource;
        this.f38165j = str;
        this.f38166k = list;
        this.f38167l = listingsAnalytics$FiltersPlace;
        this.f38168m = listingDetailsSearchAnalyticsData;
    }

    public final ListingDetailsAnalyticSource a() {
        return this.f38164i;
    }

    public final ListingsAnalytics$FiltersPlace b() {
        return this.f38167l;
    }

    public final ListingItemBrief c() {
        return this.f38158c;
    }

    public final a d() {
        return this.f38159d;
    }

    public final int e() {
        return this.f38156a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38156a == bVar.f38156a && o.d(this.f38157b, bVar.f38157b) && o.d(this.f38158c, bVar.f38158c) && o.d(this.f38159d, bVar.f38159d) && this.f38160e == bVar.f38160e && this.f38161f == bVar.f38161f && o.d(this.f38162g, bVar.f38162g) && this.f38163h == bVar.f38163h && o.d(this.f38164i, bVar.f38164i) && o.d(this.f38165j, bVar.f38165j) && o.d(this.f38166k, bVar.f38166k) && this.f38167l == bVar.f38167l && o.d(this.f38168m, bVar.f38168m)) {
            return true;
        }
        return false;
    }

    public final ListingItemDetails f() {
        return this.f38157b;
    }

    public final String g() {
        return this.f38165j;
    }

    public final ListingDetailsSearchAnalyticsData h() {
        return this.f38168m;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        int hashCode11 = Integer.hashCode(this.f38156a) * 31;
        ListingItemDetails listingItemDetails = this.f38157b;
        int i11 = 0;
        if (listingItemDetails == null) {
            hashCode = 0;
        } else {
            hashCode = listingItemDetails.hashCode();
        }
        int i12 = (hashCode11 + hashCode) * 31;
        ListingItemBrief listingItemBrief = this.f38158c;
        if (listingItemBrief == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = listingItemBrief.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        a aVar = this.f38159d;
        if (aVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = aVar.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        boolean z11 = this.f38160e;
        int i15 = z11;
        if (z11 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        TranslationRepository.Translation translation = this.f38161f;
        if (translation == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = translation.hashCode();
        }
        int i17 = (i16 + hashCode4) * 31;
        Boolean bool = this.f38162g;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i18 = (i17 + hashCode5) * 31;
        UserType userType = this.f38163h;
        if (userType == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = userType.hashCode();
        }
        int i19 = (i18 + hashCode6) * 31;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f38164i;
        if (listingDetailsAnalyticSource == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = listingDetailsAnalyticSource.hashCode();
        }
        int i21 = (i19 + hashCode7) * 31;
        String str = this.f38165j;
        if (str == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str.hashCode();
        }
        int i22 = (i21 + hashCode8) * 31;
        List<String> list = this.f38166k;
        if (list == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = list.hashCode();
        }
        int i23 = (i22 + hashCode9) * 31;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace = this.f38167l;
        if (listingsAnalytics$FiltersPlace == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = listingsAnalytics$FiltersPlace.hashCode();
        }
        int i24 = (i23 + hashCode10) * 31;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f38168m;
        if (listingDetailsSearchAnalyticsData != null) {
            i11 = listingDetailsSearchAnalyticsData.hashCode();
        }
        return i24 + i11;
    }

    public final List<String> i() {
        return this.f38166k;
    }

    public final TranslationRepository.Translation j() {
        return this.f38161f;
    }

    public final UserType k() {
        return this.f38163h;
    }

    public final boolean l() {
        return this.f38160e;
    }

    public final Boolean m() {
        return this.f38162g;
    }

    public String toString() {
        int i11 = this.f38156a;
        ListingItemDetails listingItemDetails = this.f38157b;
        ListingItemBrief listingItemBrief = this.f38158c;
        a aVar = this.f38159d;
        boolean z11 = this.f38160e;
        TranslationRepository.Translation translation = this.f38161f;
        Boolean bool = this.f38162g;
        UserType userType = this.f38163h;
        ListingDetailsAnalyticSource listingDetailsAnalyticSource = this.f38164i;
        String str = this.f38165j;
        List<String> list = this.f38166k;
        ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace = this.f38167l;
        ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData = this.f38168m;
        return "ChatNowModel(itemPosition=" + i11 + ", listingDetails=" + listingItemDetails + ", itemBrief=" + listingItemBrief + ", itemInfo=" + aVar + ", isPreview=" + z11 + ", translation=" + translation + ", isProperty=" + bool + ", userType=" + userType + ", analyticSource=" + listingDetailsAnalyticSource + ", listingSource=" + str + ", sourceFilterName=" + list + ", filtersPlace=" + listingsAnalytics$FiltersPlace + ", searchAnalyticsData=" + listingDetailsSearchAnalyticsData + ")";
    }

    public /* synthetic */ b(int i11, ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, a aVar, boolean z11, TranslationRepository.Translation translation, Boolean bool, UserType userType, ListingDetailsAnalyticSource listingDetailsAnalyticSource, String str, List list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? -1 : i11, listingItemDetails, listingItemBrief, aVar, z11, translation, (i12 & 64) != 0 ? null : bool, (i12 & 128) != 0 ? null : userType, (i12 & 256) != 0 ? null : listingDetailsAnalyticSource, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : str, (i12 & 1024) != 0 ? null : list, (i12 & RecyclerView.l.FLAG_MOVED) != 0 ? null : listingsAnalytics$FiltersPlace, (i12 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : listingDetailsSearchAnalyticsData);
    }
}

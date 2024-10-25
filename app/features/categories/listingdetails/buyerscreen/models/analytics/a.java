package com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.network.responses.listingdetails.BuyerListingDetailsResponseModel;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.YesNo;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.forsale.app.features.categories.listings.ListingsIntention;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.SourceSectionName;
import com.forsale.app.utils.analytics.j;
import com.forsale.app.utils.analytics.propertyhome.PropertySectionName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import wz.i;
import wz.p;
/* compiled from: ListingDetailsEventKeys.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: ListingDetailsEventKeys.kt */
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C0282a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26323a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f26324b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f26325c;

        static {
            int[] iArr = new int[AttributeType.values().length];
            try {
                iArr[AttributeType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26323a = iArr;
            int[] iArr2 = new int[BuyerListingDetailsResponseModel.ListingType.values().length];
            try {
                iArr2[BuyerListingDetailsResponseModel.ListingType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[BuyerListingDetailsResponseModel.ListingType.PINNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BuyerListingDetailsResponseModel.ListingType.COMMERCIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f26324b = iArr2;
            int[] iArr3 = new int[BuyerListingDetailsResponseModel.Location.values().length];
            try {
                iArr3[BuyerListingDetailsResponseModel.Location.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[BuyerListingDetailsResponseModel.Location.APPROXIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BuyerListingDetailsResponseModel.Location.EXACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f26325c = iArr3;
        }
    }

    private static final AnalyticsItemType a(BuyerListingDetailsResponseModel.ListingType listingType) {
        int i11 = C0282a.f26324b[listingType.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return AnalyticsItemType.NORMAL_LISTING;
                }
                return AnalyticsItemType.COMMERCIAL_LISTING;
            }
            return AnalyticsItemType.PINNED_LISTING;
        }
        return AnalyticsItemType.NORMAL_LISTING;
    }

    private static final List<Pair<String, String>> b(List<AttributesMapper.AttributesDataModel> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AttributesMapper.AttributesDataModel attributesDataModel : list) {
                if (C0282a.f26323a[attributesDataModel.j().ordinal()] == 1) {
                    String i11 = attributesDataModel.i();
                    if (i11 != null) {
                        arrayList.add(new Pair(i11, YesNo.YES.getValue()));
                    }
                } else if (attributesDataModel.i() != null && attributesDataModel.m() != null) {
                    String i12 = attributesDataModel.i();
                    String m11 = attributesDataModel.m();
                    if (m11 == null) {
                        m11 = "";
                    }
                    arrayList.add(new Pair(i12, m11));
                }
            }
        }
        return arrayList;
    }

    private static final List<String> c(List<AttributesMapper.AttributesDataModel> list) {
        int y11;
        if (list != null) {
            List<AttributesMapper.AttributesDataModel> list2 = list;
            y11 = s.y(list2, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (AttributesMapper.AttributesDataModel attributesDataModel : list2) {
                arrayList.add(String.valueOf(attributesDataModel.e()));
            }
            return arrayList;
        }
        return null;
    }

    private static final List<String> d(List<AttributesMapper.AttributesDataModel> list) {
        int y11;
        if (list != null) {
            List<AttributesMapper.AttributesDataModel> list2 = list;
            y11 = s.y(list2, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (AttributesMapper.AttributesDataModel attributesDataModel : list2) {
                arrayList.add(String.valueOf(attributesDataModel.i()));
            }
            return arrayList;
        }
        return null;
    }

    private static final Map<String, Object> e(ListingDetailsAnalyticSource listingDetailsAnalyticSource) {
        String a11;
        Map h11;
        Map p11;
        Map<String, Object> h12;
        if (listingDetailsAnalyticSource == null) {
            h12 = j0.h();
            return h12;
        }
        boolean z11 = listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.VerticalCarouselAnalytics;
        if (z11) {
            a11 = ((ListingDetailsAnalyticSource.VerticalCarouselAnalytics) listingDetailsAnalyticSource).d();
        } else {
            a11 = listingDetailsAnalyticSource.a();
        }
        h11 = j0.h();
        p11 = j0.p(h11, i.a("Source", a11));
        String str = null;
        if (listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.HomePageRecommendedVertical) {
            ListingDetailsAnalyticSource.HomePageRecommendedVertical homePageRecommendedVertical = (ListingDetailsAnalyticSource.HomePageRecommendedVertical) listingDetailsAnalyticSource;
            Map<String, Object> Y = TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(p11, ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_SECTION_ORDER.getValue(), homePageRecommendedVertical.f()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_ITEM_ORDER.getValue(), homePageRecommendedVertical.d()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), homePageRecommendedVertical.c()), ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.RECOMMENDATION_CRITERIA.getValue(), homePageRecommendedVertical.b());
            String value = ListingDetailsAnalyticSource.HomePageRecommendedVertical.PARAMS.SOURCE_SECTION_NAME.getValue();
            SourceSectionName e11 = homePageRecommendedVertical.e();
            if (e11 != null) {
                str = e11.getValue();
            }
            return TypeExtensionsKt.Y(Y, value, str);
        } else if (listingDetailsAnalyticSource instanceof ListingDetailsAnalyticSource.PropertyHomeAnalytics) {
            ListingDetailsAnalyticSource.PropertyHomeAnalytics propertyHomeAnalytics = (ListingDetailsAnalyticSource.PropertyHomeAnalytics) listingDetailsAnalyticSource;
            Map<String, Object> Y2 = TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(p11, ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_ORDER.getValue(), propertyHomeAnalytics.h()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_ITEM_ORDER.getValue(), propertyHomeAnalytics.f()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), propertyHomeAnalytics.c()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.RECOMMENDATION_CRITERIA.getValue(), propertyHomeAnalytics.b());
            String value2 = ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_NAME.getValue();
            PropertySectionName g11 = propertyHomeAnalytics.g();
            if (g11 != null) {
                str = g11.getValue();
            }
            return TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(Y2, value2, str), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_FILTER_NAME.getValue(), propertyHomeAnalytics.d()), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_FILTER_VALUE.getValue(), propertyHomeAnalytics.e());
        } else if (z11) {
            ListingDetailsAnalyticSource.VerticalCarouselAnalytics verticalCarouselAnalytics = (ListingDetailsAnalyticSource.VerticalCarouselAnalytics) listingDetailsAnalyticSource;
            return TypeExtensionsKt.Y(TypeExtensionsKt.Y(TypeExtensionsKt.Y(p11, ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_SECTION_ORDER.getValue(), Integer.valueOf(verticalCarouselAnalytics.e())), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_ITEM_ORDER.getValue(), Integer.valueOf(verticalCarouselAnalytics.c())), ListingDetailsAnalyticSource.PropertyHomeAnalytics.PARAMS.SOURCE_CAROUSEL_TOTAL_ITEMS.getValue(), Integer.valueOf(verticalCarouselAnalytics.b()));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private static final ListingsPageMode f(ListingsIntention listingsIntention, boolean z11) {
        boolean k11 = k(listingsIntention, z11);
        if (k11) {
            return ListingsPageMode.SEARCH;
        }
        if (!k11) {
            return ListingsPageMode.LISTINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final Map<String, String> g(ListingsIntention listingsIntention, Boolean bool, boolean z11) {
        String str;
        boolean z12;
        Map<String, String> f11;
        if (z11) {
            str = "SourcePageMode";
        } else {
            str = "PageMode";
        }
        if (bool != null) {
            z12 = bool.booleanValue();
        } else {
            z12 = false;
        }
        f11 = i0.f(i.a(str, f(listingsIntention, z12).getValue()));
        return f11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
        r2 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SEARCH_SOURCE.getValue(), r2.getValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = kotlin.collections.i0.f(wz.i.a(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD.getValue(), r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.Map<java.lang.String, java.lang.Object> h(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData r2, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ListingsPageMode r3) {
        /*
            java.util.Map r3 = kotlin.collections.g0.h()
            java.lang.String r0 = r2.c()
            if (r0 == 0) goto L1a
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r1 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r0 = wz.i.a(r1, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L1e
        L1a:
            java.util.Map r0 = kotlin.collections.g0.h()
        L1e:
            java.util.Map r3 = kotlin.collections.g0.o(r3, r0)
            java.lang.Integer r0 = r2.d()
            if (r0 == 0) goto L40
            int r0 = r0.intValue()
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r1 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD_CHAR_COUNT
            java.lang.String r1 = r1.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = wz.i.a(r1, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L44
        L40:
            java.util.Map r0 = kotlin.collections.g0.h()
        L44:
            java.util.Map r3 = kotlin.collections.g0.o(r3, r0)
            java.lang.Integer r0 = r2.e()
            if (r0 == 0) goto L66
            int r0 = r0.intValue()
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r1 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SOURCE_SEARCH_KEYWORD_ORDER
            java.lang.String r1 = r1.getValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r0 = wz.i.a(r1, r0)
            java.util.Map r0 = kotlin.collections.g0.f(r0)
            if (r0 != 0) goto L6a
        L66:
            java.util.Map r0 = kotlin.collections.g0.h()
        L6a:
            java.util.Map r3 = kotlin.collections.g0.o(r3, r0)
            com.forsale.app.features.search.SearchAnalyticsData$SearchSource r2 = r2.b()
            if (r2 == 0) goto L88
            com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData$PARAMS r0 = com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData.PARAMS.SEARCH_SOURCE
            java.lang.String r0 = r0.getValue()
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r2 = wz.i.a(r0, r2)
            java.util.Map r2 = kotlin.collections.g0.f(r2)
            if (r2 != 0) goto L8c
        L88:
            java.util.Map r2 = kotlin.collections.g0.h()
        L8c:
            java.util.Map r2 = kotlin.collections.g0.o(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.a.h(com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData, com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ListingsPageMode):java.util.Map");
    }

    static /* synthetic */ Map i(ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, ListingsPageMode listingsPageMode, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            listingsPageMode = ListingsPageMode.LISTINGS;
        }
        return h(listingDetailsSearchAnalyticsData, listingsPageMode);
    }

    private static final String j(String str) {
        boolean z11;
        if (str.length() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && str.length() > 100) {
            String substring = str.substring(0, 100);
            o.h(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    private static final boolean k(ListingsIntention listingsIntention, boolean z11) {
        if (listingsIntention != ListingsIntention.SEARCH && !z11) {
            return false;
        }
        return true;
    }

    private static final AnalyticsLocation l(BuyerListingDetailsResponseModel.Location location) {
        int i11 = C0282a.f26325c[location.ordinal()];
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

    public static final void m(AnalyticsParameters analyticsParameters, DetailsModel detailsModel, ItemArgs itemArgs) {
        int i11;
        Boolean bool;
        Boolean bool2;
        ListingsIntention listingsIntention;
        List E0;
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.LocationInfo locationInfo;
        boolean z11;
        BuyerListingDetailsResponseModel.UserType userType;
        boolean z12;
        String url;
        boolean z13;
        boolean z14;
        o.i(analyticsParameters, "<this>");
        o.i(detailsModel, "detailsModel");
        o.i(itemArgs, "itemArgs");
        j.b(analyticsParameters, new com.forsale.app.utils.analytics.i(detailsModel.d().z(), detailsModel.d().A(), detailsModel.d().j(), detailsModel.d().k(), detailsModel.d().i(), detailsModel.d().p()));
        for (Pair pair : j.e(analyticsParameters, detailsModel.d().i(), null, null, 6, null)) {
            analyticsParameters.c((String) pair.c(), pair.d());
        }
        Iterator<T> it2 = j.f(analyticsParameters, detailsModel.d().p(), "DistrictsLevel").iterator();
        while (it2.hasNext()) {
            Pair pair2 = (Pair) it2.next();
            analyticsParameters.c((String) pair2.c(), pair2.d());
        }
        analyticsParameters.c("ListingID", detailsModel.d().c());
        analyticsParameters.c("ListingTitle", j(detailsModel.d().E()));
        BuyerListingDetailsResponseModel.ListingType v11 = detailsModel.d().v();
        if (v11 != null) {
            analyticsParameters.c("ListingType", a(v11).getValue());
        }
        Iterator<T> it3 = b(detailsModel.d().d()).iterator();
        while (it3.hasNext()) {
            Pair pair3 = (Pair) it3.next();
            analyticsParameters.c((String) pair3.c(), pair3.d());
        }
        List<String> c11 = c(detailsModel.d().d());
        if (c11 != null) {
            analyticsParameters.c("AttributesIDs", c11);
        }
        List<String> d11 = d(detailsModel.d().d());
        if (d11 != null) {
            analyticsParameters.c("AttributesNames", d11);
        }
        List<String> t11 = detailsModel.d().t();
        if (t11 != null) {
            i11 = t11.size();
        } else {
            i11 = 0;
        }
        analyticsParameters.c("ImagesCount", Integer.valueOf(i11));
        YesNo.a aVar = YesNo.Companion;
        String H = detailsModel.d().H();
        Boolean bool3 = null;
        if (H != null) {
            if (H.length() > 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            bool = Boolean.valueOf(z14);
        } else {
            bool = null;
        }
        analyticsParameters.c("ContainsVideo", aVar.a(bool));
        analyticsParameters.c("SellerPhoneNumber", detailsModel.d().w());
        analyticsParameters.c("IsHideMyNumber", aVar.a(detailsModel.d().M()));
        String u11 = detailsModel.d().u();
        if (u11 != null) {
            analyticsParameters.c("ListingSource", u11);
        }
        List<String> l11 = detailsModel.d().l();
        if (l11 != null) {
            analyticsParameters.c("AdditionalNumbers", l11);
        }
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo.VirtualTour J = detailsModel.d().J();
        if (J != null && (url = J.getUrl()) != null) {
            if (url.length() == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            bool2 = Boolean.valueOf(!z13);
        } else {
            bool2 = null;
        }
        analyticsParameters.c("ContainsVirtualTour", aVar.a(bool2));
        if (o.d(detailsModel.d().h(), CategoryEntity.Classification.PROPERTY.getValue())) {
            BuyerListingDetailsResponseModel.Data.Listing.User F = detailsModel.d().F();
            if (F != null) {
                userType = F.getUserType();
            } else {
                userType = null;
            }
            if (userType == BuyerListingDetailsResponseModel.UserType.FOR_SALE_REALTY) {
                z12 = true;
            } else {
                z12 = false;
            }
            analyticsParameters.c("Is4saleRealty", Boolean.valueOf(z12));
        }
        BuyerListingDetailsResponseModel.Data.Listing.ExtraInfo s11 = detailsModel.d().s();
        if (s11 != null && (locationInfo = s11.getLocationInfo()) != null) {
            Double lat = locationInfo.getLat();
            if (lat != null) {
                analyticsParameters.c("LocationLatitude", Double.valueOf(lat.doubleValue()));
            }
            Double lon = locationInfo.getLon();
            if (lon != null) {
                analyticsParameters.c("LocationLongitude", Double.valueOf(lon.doubleValue()));
            }
            List<String> landmarks = locationInfo.getLandmarks();
            if (landmarks != null && (!landmarks.isEmpty())) {
                analyticsParameters.c("Landmarks", landmarks);
            }
            String streetName = locationInfo.getStreetName();
            if (streetName != null) {
                if (streetName.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    analyticsParameters.c("StreetName", streetName);
                }
            }
            BuyerListingDetailsResponseModel.Location location = locationInfo.getLocation();
            if (location != null) {
                analyticsParameters.c("LocationOptions", l(location).getValue());
            }
        }
        if (itemArgs.d() != -1) {
            analyticsParameters.c("SourceItemOrder", Integer.valueOf(itemArgs.d()));
        }
        String g11 = itemArgs.g();
        if (g11 != null) {
            analyticsParameters.c("Source", g11);
        } else {
            ListingDetailsAnalyticSource a11 = itemArgs.a();
            if (a11 != null) {
                Map<String, Object> e11 = e(a11);
                ArrayList arrayList = new ArrayList(e11.size());
                for (Map.Entry<String, Object> entry : e11.entrySet()) {
                    analyticsParameters.c(entry.getKey(), entry.getValue());
                    arrayList.add(p.f75480a);
                }
            }
        }
        String e12 = itemArgs.e();
        if (e12 != null) {
            analyticsParameters.c("Status", e12);
        }
        ListingDetailsAnalyticSource a12 = itemArgs.a();
        if (a12 != null) {
            Map<String, Object> e13 = e(a12);
            ArrayList arrayList2 = new ArrayList(e13.size());
            for (Map.Entry<String, Object> entry2 : e13.entrySet()) {
                analyticsParameters.c(entry2.getKey(), entry2.getValue());
                arrayList2.add(p.f75480a);
            }
        }
        String h11 = itemArgs.h();
        if (h11 != null) {
            E0 = StringsKt__StringsKt.E0(h11, new char[]{','}, false, 0, 6, null);
            analyticsParameters.c("SourceFilterName", E0);
        }
        String b11 = itemArgs.b();
        if (b11 != null) {
            analyticsParameters.c("FiltersPlace", b11);
        }
        ListingDetailsSearchAnalyticsData f11 = itemArgs.f();
        if (f11 != null) {
            Map i12 = i(f11, null, 2, null);
            ArrayList arrayList3 = new ArrayList(i12.size());
            for (Map.Entry entry3 : i12.entrySet()) {
                analyticsParameters.c((String) entry3.getKey(), entry3.getValue());
                arrayList3.add(p.f75480a);
            }
        }
        ListingDetailsSearchAnalyticsData f12 = itemArgs.f();
        if (f12 == null || (listingsIntention = f12.a()) == null) {
            listingsIntention = ListingsIntention.LISTINGS;
        }
        ListingDetailsSearchAnalyticsData f13 = itemArgs.f();
        if (f13 != null) {
            bool3 = Boolean.valueOf(f13.f());
        }
        Map<String, String> g12 = g(listingsIntention, bool3, true);
        ArrayList arrayList4 = new ArrayList(g12.size());
        for (Map.Entry<String, String> entry4 : g12.entrySet()) {
            analyticsParameters.c(entry4.getKey(), entry4.getValue());
            arrayList4.add(p.f75480a);
        }
    }
}

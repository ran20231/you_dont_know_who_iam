package com.forsale.adserver.utils;

import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.analytics.AnalyticsType;
import g00.l;
import g00.w;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import n00.k;
import okhttp3.internal.ws.WebSocketProtocol;
import s9.a;
import wz.p;
/* compiled from: InitAnalytics.kt */
/* loaded from: classes2.dex */
public final class InitAnalytics {

    /* renamed from: a  reason: collision with root package name */
    public static final a f20835a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static w<? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Integer, ? super String, ? super String, p> f20836b;

    /* renamed from: c  reason: collision with root package name */
    private static final j00.d<Object, g9.a> f20837c;

    /* renamed from: d  reason: collision with root package name */
    public static l<? super a.C0811a, p> f20838d;

    /* renamed from: e  reason: collision with root package name */
    private static final j00.d<Object, a.C0811a> f20839e;

    /* renamed from: f  reason: collision with root package name */
    public static l<? super a.b, p> f20840f;

    /* renamed from: g  reason: collision with root package name */
    private static final j00.d<Object, a.b> f20841g;

    /* renamed from: h  reason: collision with root package name */
    public static g00.p<? super List<Integer>, ? super zz.a<? super List<String>>, ? extends Object> f20842h;

    /* renamed from: i  reason: collision with root package name */
    private static Boolean f20843i;

    /* renamed from: j  reason: collision with root package name */
    public static g00.p<? super String, ? super AnalyticsType, p> f20844j;

    /* renamed from: k  reason: collision with root package name */
    public static l<? super String, p> f20845k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InitAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class AwsBannerScreen {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AwsBannerScreen[] $VALUES;
        private final String value;
        public static final AwsBannerScreen HOME = new AwsBannerScreen("HOME", 0, "Home");
        public static final AwsBannerScreen CATEGORY = new AwsBannerScreen("CATEGORY", 1, "Category");
        public static final AwsBannerScreen LISTING = new AwsBannerScreen("LISTING", 2, "Listing");
        public static final AwsBannerScreen ITEMDETAIL = new AwsBannerScreen("ITEMDETAIL", 3, "ItemDetail");
        public static final AwsBannerScreen EMPTY = new AwsBannerScreen("EMPTY", 4, "");

        private static final /* synthetic */ AwsBannerScreen[] $values() {
            return new AwsBannerScreen[]{HOME, CATEGORY, LISTING, ITEMDETAIL, EMPTY};
        }

        static {
            AwsBannerScreen[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AwsBannerScreen(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AwsBannerScreen> getEntries() {
            return $ENTRIES;
        }

        public static AwsBannerScreen valueOf(String str) {
            return (AwsBannerScreen) Enum.valueOf(AwsBannerScreen.class, str);
        }

        public static AwsBannerScreen[] values() {
            return (AwsBannerScreen[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InitAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class AwsBannerType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ AwsBannerType[] $VALUES;
        private final String value;
        public static final AwsBannerType FIXED_FOOTER = new AwsBannerType("FIXED_FOOTER", 0, "FixedFooter");
        public static final AwsBannerType HOME_TOP = new AwsBannerType("HOME_TOP", 1, "HomeTop");
        public static final AwsBannerType SLIDING = new AwsBannerType("SLIDING", 2, "Sliding");
        public static final AwsBannerType SLIDING_BIG = new AwsBannerType("SLIDING_BIG", 3, "SlidingBig");
        public static final AwsBannerType VIDEO = new AwsBannerType("VIDEO", 4, "Video");
        public static final AwsBannerType LANDING = new AwsBannerType("LANDING", 5, "Landing");
        public static final AwsBannerType HOME_SLIDING = new AwsBannerType("HOME_SLIDING", 6, "HomeSliding");
        public static final AwsBannerType CATEGORIES_SLIDING = new AwsBannerType("CATEGORIES_SLIDING", 7, "CategoriesSliding");
        public static final AwsBannerType EMPTY = new AwsBannerType("EMPTY", 8, "");

        private static final /* synthetic */ AwsBannerType[] $values() {
            return new AwsBannerType[]{FIXED_FOOTER, HOME_TOP, SLIDING, SLIDING_BIG, VIDEO, LANDING, HOME_SLIDING, CATEGORIES_SLIDING, EMPTY};
        }

        static {
            AwsBannerType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AwsBannerType(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<AwsBannerType> getEntries() {
            return $ENTRIES;
        }

        public static AwsBannerType valueOf(String str) {
            return (AwsBannerType) Enum.valueOf(AwsBannerType.class, str);
        }

        public static AwsBannerType[] values() {
            return (AwsBannerType[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* compiled from: InitAnalytics.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ k<Object>[] f20846a = {s.e(new MutablePropertyReference1Impl(a.class, "eventReporter", "getEventReporter$adserver_forSaleRelease()Lcom/forsale/adserver/entities/local/AnalyticEntity;", 0)), s.e(new MutablePropertyReference1Impl(a.class, "commercialAnalyticsReporter", "getCommercialAnalyticsReporter$adserver_forSaleRelease()Lcom/forsale/analytics/common/AnalyticsResponse$CommercialAnalyticsResponse;", 0)), s.e(new MutablePropertyReference1Impl(a.class, "commercialPinAnalyticsReporter", "getCommercialPinAnalyticsReporter$adserver_forSaleRelease()Lcom/forsale/analytics/common/AnalyticsResponse$CommercialPinAnalyticsResponse;", 0))};

        /* compiled from: InitAnalytics.kt */
        /* renamed from: com.forsale.adserver.utils.InitAnalytics$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0230a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f20847a;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f20848b;

            static {
                int[] iArr = new int[ScreenBannerTypes.values().length];
                try {
                    iArr[ScreenBannerTypes.FIXED_FOOTER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ScreenBannerTypes.HOME_SLIDING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ScreenBannerTypes.HOME_TOP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ScreenBannerTypes.LANDING_PAGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ScreenBannerTypes.CATEGORIES_SLIDING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ScreenBannerTypes.SLIDING_SMALL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ScreenBannerTypes.SLIDING_BIG.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f20847a = iArr;
                int[] iArr2 = new int[Screens.values().length];
                try {
                    iArr2[Screens.HOME_SCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr2[Screens.CATEGORIES.ordinal()] = 2;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr2[Screens.LISTINGS.ordinal()] = 3;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr2[Screens.ITEM_DETAILS.ordinal()] = 4;
                } catch (NoSuchFieldError unused11) {
                }
                f20848b = iArr2;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AwsBannerType a(ScreenBannerTypes bannerType) {
            o.i(bannerType, "bannerType");
            switch (C0230a.f20847a[bannerType.ordinal()]) {
                case 1:
                    return AwsBannerType.FIXED_FOOTER;
                case 2:
                    return AwsBannerType.HOME_SLIDING;
                case 3:
                    return AwsBannerType.HOME_TOP;
                case 4:
                    return AwsBannerType.LANDING;
                case 5:
                    return AwsBannerType.CATEGORIES_SLIDING;
                case 6:
                    return AwsBannerType.SLIDING;
                case 7:
                    return AwsBannerType.SLIDING_BIG;
                default:
                    return AwsBannerType.EMPTY;
            }
        }

        public final AwsBannerScreen b(Screens bannerScreen) {
            o.i(bannerScreen, "bannerScreen");
            int i11 = C0230a.f20848b[bannerScreen.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return AwsBannerScreen.HOME;
                        }
                        return AwsBannerScreen.ITEMDETAIL;
                    }
                    return AwsBannerScreen.LISTING;
                }
                return AwsBannerScreen.CATEGORY;
            }
            return AwsBannerScreen.HOME;
        }

        public final w<String, Integer, Integer, Integer, Integer, String, Integer, String, String, p> c() {
            w wVar = InitAnalytics.f20836b;
            if (wVar != null) {
                return wVar;
            }
            o.w("analyticsListener");
            return null;
        }

        public final l<a.C0811a, p> d() {
            l lVar = InitAnalytics.f20838d;
            if (lVar != null) {
                return lVar;
            }
            o.w("commercialAnalyticsListener");
            return null;
        }

        public final l<a.b, p> e() {
            l lVar = InitAnalytics.f20840f;
            if (lVar != null) {
                return lVar;
            }
            o.w("commercialPinAnalyticsListener");
            return null;
        }

        public final g00.p<String, AnalyticsType, p> f() {
            g00.p pVar = InitAnalytics.f20844j;
            if (pVar != null) {
                return pVar;
            }
            o.w("incrementCommercialPinClicksListener");
            return null;
        }

        public final l<String, p> g() {
            l lVar = InitAnalytics.f20845k;
            if (lVar != null) {
                return lVar;
            }
            o.w("incrementCommercialPinViewsCountListener");
            return null;
        }

        public final g00.p<List<Integer>, zz.a<? super List<String>>, Object> h() {
            g00.p pVar = InitAnalytics.f20842h;
            if (pVar != null) {
                return pVar;
            }
            o.w("verticalNamesListener");
            return null;
        }

        public final void i(w<? super String, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super String, ? super Integer, ? super String, ? super String, p> wVar) {
            o.i(wVar, "<set-?>");
            InitAnalytics.f20836b = wVar;
        }

        public final void j(l<? super a.C0811a, p> lVar) {
            o.i(lVar, "<set-?>");
            InitAnalytics.f20838d = lVar;
        }

        public final void k(a.C0811a c0811a) {
            o.i(c0811a, "<set-?>");
            InitAnalytics.f20839e.setValue(this, f20846a[1], c0811a);
        }

        public final void l(l<? super a.b, p> lVar) {
            o.i(lVar, "<set-?>");
            InitAnalytics.f20840f = lVar;
        }

        public final void m(a.b bVar) {
            o.i(bVar, "<set-?>");
            InitAnalytics.f20841g.setValue(this, f20846a[2], bVar);
        }

        public final void n(g9.a aVar) {
            o.i(aVar, "<set-?>");
            InitAnalytics.f20837c.setValue(this, f20846a[0], aVar);
        }

        public final void o(g00.p<? super String, ? super AnalyticsType, p> pVar) {
            o.i(pVar, "<set-?>");
            InitAnalytics.f20844j = pVar;
        }

        public final void p(l<? super String, p> lVar) {
            o.i(lVar, "<set-?>");
            InitAnalytics.f20845k = lVar;
        }

        public final void q(Boolean bool) {
            InitAnalytics.f20843i = bool;
        }

        public final void r(g00.p<? super List<Integer>, ? super zz.a<? super List<String>>, ? extends Object> pVar) {
            o.i(pVar, "<set-?>");
            InitAnalytics.f20842h = pVar;
        }
    }

    /* compiled from: Delegates.kt */
    /* loaded from: classes2.dex */
    public static final class b extends j00.b<g9.a> {
        public b(Object obj) {
            super(obj);
        }

        @Override // j00.b
        protected void a(k<?> property, g9.a aVar, g9.a aVar2) {
            o.i(property, "property");
            g9.a aVar3 = aVar2;
            try {
                InitAnalytics.f20835a.c().j(aVar3.e(), aVar3.i(), aVar3.h(), aVar3.a(), aVar3.d(), aVar3.g(), aVar3.f(), aVar3.c(), aVar3.b());
            } catch (Exception unused) {
            }
        }
    }

    /* compiled from: Delegates.kt */
    /* loaded from: classes2.dex */
    public static final class c extends j00.b<a.C0811a> {
        public c(Object obj) {
            super(obj);
        }

        @Override // j00.b
        protected void a(k<?> property, a.C0811a c0811a, a.C0811a c0811a2) {
            o.i(property, "property");
            InitAnalytics.f20835a.d().invoke(c0811a2);
        }
    }

    /* compiled from: Delegates.kt */
    /* loaded from: classes2.dex */
    public static final class d extends j00.b<a.b> {
        public d(Object obj) {
            super(obj);
        }

        @Override // j00.b
        protected void a(k<?> property, a.b bVar, a.b bVar2) {
            o.i(property, "property");
            InitAnalytics.f20835a.e().invoke(bVar2);
        }
    }

    static {
        j00.a aVar = j00.a.f59932a;
        f20837c = new b(new g9.a(AnalyticsEvents.NON.getValue(), null, null, null, null, null, null, null, null, 510, null));
        f20839e = new c(new a.C0811a("", null, false, false, false, null, 62, null));
        f20841g = new d(new a.b("", null, false, false, false, null, null, WebSocketProtocol.PAYLOAD_SHORT, null));
    }
}

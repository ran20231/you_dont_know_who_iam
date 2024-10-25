package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.analytics.AnalyticsType;
import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingSourceApp;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsAnalyticSource;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.ui.bottomsheets.listingdetailschat.b;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import falcon.chat.Chat;
import falcon.chat.entities.ChannelEntity;
import java.util.List;
import kotlin.Triple;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: ActionUserItemViewModel.kt */
/* loaded from: classes3.dex */
public final class ActionUserItemViewModel {
    private final OneShotEventHandler<p> A;
    private final OneShotEventHandler<p> B;
    private final OneShotEventHandler<Triple<String, String, String>> C;

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f38303a;

    /* renamed from: b  reason: collision with root package name */
    private final UserContactType f38304b;

    /* renamed from: c  reason: collision with root package name */
    private final String f38305c;

    /* renamed from: d  reason: collision with root package name */
    private final ListingItemDetails f38306d;

    /* renamed from: e  reason: collision with root package name */
    private final ListingItemBrief f38307e;

    /* renamed from: f  reason: collision with root package name */
    private final b.a f38308f;

    /* renamed from: g  reason: collision with root package name */
    private final TranslationRepository.Translation f38309g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f38310h;

    /* renamed from: i  reason: collision with root package name */
    private final AnalyticsService f38311i;

    /* renamed from: j  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f38312j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f38313k;

    /* renamed from: l  reason: collision with root package name */
    private final String f38314l;

    /* renamed from: m  reason: collision with root package name */
    private final String f38315m;

    /* renamed from: n  reason: collision with root package name */
    private final boolean f38316n;

    /* renamed from: o  reason: collision with root package name */
    private final Boolean f38317o;

    /* renamed from: p  reason: collision with root package name */
    private final UserType f38318p;

    /* renamed from: q  reason: collision with root package name */
    private final ListingDetailsAnalyticSource f38319q;

    /* renamed from: r  reason: collision with root package name */
    private final ListingDetailsSearchAnalyticsData f38320r;

    /* renamed from: s  reason: collision with root package name */
    private final int f38321s;

    /* renamed from: t  reason: collision with root package name */
    private final List<String> f38322t;

    /* renamed from: u  reason: collision with root package name */
    private final ListingsAnalytics$FiltersPlace f38323u;

    /* renamed from: v  reason: collision with root package name */
    private final String f38324v;

    /* renamed from: w  reason: collision with root package name */
    private final OneShotEventHandler<String> f38325w;

    /* renamed from: x  reason: collision with root package name */
    private final OneShotEventHandler<String> f38326x;

    /* renamed from: y  reason: collision with root package name */
    private final OneShotEventHandler<com.forsale.app.ui.bottomsheets.listingdetailschat.b> f38327y;

    /* renamed from: z  reason: collision with root package name */
    private final OneShotEventHandler<p> f38328z;

    /* compiled from: ActionUserItemViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38329a;

        static {
            int[] iArr = new int[UserContactType.values().length];
            try {
                iArr[UserContactType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserContactType.WHATS_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserContactType.WHATS_APP_MULTIPLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserContactType.CHAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f38329a = iArr;
        }
    }

    public ActionUserItemViewModel(CoroutineScope coroutineScope, UserContactType contactType, String advId, ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, b.a aVar, TranslationRepository.Translation translation, boolean z11, AnalyticsService analysisService, AggregatedAllAnalyticsLogger analyticsLogger, boolean z12, String deviceId, String str, boolean z13, Boolean bool, UserType userType, ListingDetailsAnalyticSource listingDetailsAnalyticSource, ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData, int i11, List<String> list, ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace, String str2) {
        o.i(coroutineScope, "coroutineScope");
        o.i(contactType, "contactType");
        o.i(advId, "advId");
        o.i(analysisService, "analysisService");
        o.i(analyticsLogger, "analyticsLogger");
        o.i(deviceId, "deviceId");
        this.f38303a = coroutineScope;
        this.f38304b = contactType;
        this.f38305c = advId;
        this.f38306d = listingItemDetails;
        this.f38307e = listingItemBrief;
        this.f38308f = aVar;
        this.f38309g = translation;
        this.f38310h = z11;
        this.f38311i = analysisService;
        this.f38312j = analyticsLogger;
        this.f38313k = z12;
        this.f38314l = deviceId;
        this.f38315m = str;
        this.f38316n = z13;
        this.f38317o = bool;
        this.f38318p = userType;
        this.f38319q = listingDetailsAnalyticSource;
        this.f38320r = listingDetailsSearchAnalyticsData;
        this.f38321s = i11;
        this.f38322t = list;
        this.f38323u = listingsAnalytics$FiltersPlace;
        this.f38324v = str2;
        this.f38325w = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38326x = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38327y = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38328z = new OneShotEventHandler<>(null, 0, 3, null);
        this.A = new OneShotEventHandler<>(null, 0, 3, null);
        this.B = new OneShotEventHandler<>(null, 0, 3, null);
        this.C = new OneShotEventHandler<>(null, 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C() {
        BuildersKt__Builders_commonKt.launch$default(this.f38303a, null, null, new ActionUserItemViewModel$handleChat$1(this, null), 3, null);
    }

    private final void D(IncrementCallClicksBody incrementCallClicksBody) {
        BuildersKt__Builders_commonKt.launch$default(this.f38303a, null, null, new ActionUserItemViewModel$incrementCallClicks$1(this, incrementCallClicksBody, null), 3, null);
    }

    private final void I(AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str) {
        ListingItemDetails listingItemDetails = this.f38306d;
        if (listingItemDetails != null) {
            BuildersKt__Builders_commonKt.launch$default(this.f38303a, null, null, new ActionUserItemViewModel$logAnalytics$1$1(this, advActionEvents, listingItemDetails, z11, z12, z13, analyticsPosition, str, null), 3, null);
        }
    }

    static /* synthetic */ void J(ActionUserItemViewModel actionUserItemViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents, boolean z11, boolean z12, boolean z13, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, String str, int i11, Object obj) {
        boolean z14;
        boolean z15;
        AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition2;
        boolean z16 = false;
        if ((i11 & 2) != 0) {
            z14 = false;
        } else {
            z14 = z11;
        }
        if ((i11 & 4) != 0) {
            z15 = false;
        } else {
            z15 = z12;
        }
        if ((i11 & 8) == 0) {
            z16 = z13;
        }
        String str2 = null;
        if ((i11 & 16) != 0) {
            analyticsPosition2 = null;
        } else {
            analyticsPosition2 = analyticsPosition;
        }
        if ((i11 & 32) == 0) {
            str2 = str;
        }
        actionUserItemViewModel.I(advActionEvents, z14, z15, z16, analyticsPosition2, str2);
    }

    private final void K() {
        J(this, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_WHATSAPP_DIRECTED, true, true, false, null, null, 56, null);
    }

    private final void d() {
        int i11 = a.f38329a[this.f38304b.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        J(this, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CHAT_CLICKED, true, true, true, null, null, 48, null);
                        if (this.f38310h) {
                            f(new g00.a<p>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel$actionTaken$1
                                /* JADX INFO: Access modifiers changed from: package-private */
                                {
                                    super(0);
                                }

                                @Override // g00.a
                                public /* bridge */ /* synthetic */ p invoke() {
                                    invoke2();
                                    return p.f75480a;
                                }

                                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    ActionUserItemViewModel.this.C();
                                }
                            });
                            return;
                        } else {
                            OneShotEventHandler.d(this.B, null, 1, null);
                            return;
                        }
                    }
                    return;
                }
                OneShotEventHandler.d(this.A, null, 1, null);
                return;
            }
            D(new IncrementCallClicksBody(this.f38305c, AnalyticsType.WHATSAPP));
            K();
            this.f38326x.i(this.f38315m);
            return;
        }
        I(AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_PHONE_CLICKED, true, true, true, null, this.f38315m);
        D(new IncrementCallClicksBody(this.f38305c, AnalyticsType.PHONE_CALLS));
        this.f38325w.i(this.f38315m);
    }

    private final boolean e() {
        ListingSourceApp listingSourceApp;
        ListingItemDetails listingItemDetails = this.f38306d;
        if (listingItemDetails != null) {
            listingSourceApp = listingItemDetails.getSourceApp();
        } else {
            listingSourceApp = null;
        }
        if (listingSourceApp == ListingSourceApp.FORSALE) {
            return true;
        }
        return false;
    }

    private final void f(g00.a<p> aVar) {
        Integer num;
        String title;
        ListingSourceApp sourceApp;
        if (e()) {
            aVar.invoke();
            return;
        }
        OneShotEventHandler<Triple<String, String, String>> oneShotEventHandler = this.C;
        ListingItemDetails listingItemDetails = this.f38306d;
        String str = "";
        String str2 = (listingItemDetails == null || (sourceApp = listingItemDetails.getSourceApp()) == null || (str2 = sourceApp.getValue()) == null) ? "" : "";
        ListingItemDetails listingItemDetails2 = this.f38306d;
        if (listingItemDetails2 != null) {
            num = Integer.valueOf(listingItemDetails2.getId());
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        ListingItemDetails listingItemDetails3 = this.f38306d;
        if (listingItemDetails3 != null && (title = listingItemDetails3.getTitle()) != null) {
            str = title;
        }
        oneShotEventHandler.i(new Triple<>(str2, valueOf, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(zz.a<? super ChannelEntity> aVar) {
        Object f11;
        ListingItemDetails listingItemDetails = this.f38306d;
        if (listingItemDetails != null) {
            Object r11 = Chat.f55705a.r(listingItemDetails.getPhone(), String.valueOf(listingItemDetails.getId()), aVar);
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (r11 == f11) {
                return r11;
            }
            return (ChannelEntity) r11;
        }
        return null;
    }

    public final TranslationRepository.Translation A() {
        return this.f38309g;
    }

    public final UserType B() {
        return this.f38318p;
    }

    public final boolean E() {
        return this.f38316n;
    }

    public final boolean F() {
        return this.f38313k;
    }

    public final Boolean G() {
        return this.f38317o;
    }

    public final boolean H() {
        return this.f38310h;
    }

    public final void L() {
        boolean z11 = this.f38313k;
        if (z11 && this.f38304b == UserContactType.CALL) {
            this.f38325w.i(this.f38315m);
        } else if (!z11) {
            d();
        }
    }

    public final AggregatedAllAnalyticsLogger h() {
        return this.f38312j;
    }

    public final b.a i() {
        return this.f38308f;
    }

    public final String j() {
        return this.f38314l;
    }

    public final ListingsAnalytics$FiltersPlace k() {
        return this.f38323u;
    }

    public final ListingItemBrief l() {
        return this.f38307e;
    }

    public final int m() {
        return this.f38321s;
    }

    public final ListingItemDetails n() {
        return this.f38306d;
    }

    public final ListingDetailsAnalyticSource o() {
        return this.f38319q;
    }

    public final OneShotEventHandler<String> p() {
        return this.f38325w;
    }

    public final OneShotEventHandler<com.forsale.app.ui.bottomsheets.listingdetailschat.b> q() {
        return this.f38327y;
    }

    public final OneShotEventHandler<Triple<String, String, String>> r() {
        return this.C;
    }

    public final OneShotEventHandler<p> s() {
        return this.B;
    }

    public final OneShotEventHandler<p> t() {
        return this.A;
    }

    public final String u() {
        return this.f38315m;
    }

    public final ListingDetailsSearchAnalyticsData v() {
        return this.f38320r;
    }

    public final OneShotEventHandler<String> w() {
        return this.f38326x;
    }

    public final String x() {
        return this.f38324v;
    }

    public final List<String> y() {
        return this.f38322t;
    }

    public final OneShotEventHandler<p> z() {
        return this.f38328z;
    }
}

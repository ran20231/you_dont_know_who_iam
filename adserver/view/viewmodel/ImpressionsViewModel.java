package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.datalayer.bannerdata.ClickType;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.adserver.utils.AnalyticsEvents;
import com.forsale.adserver.utils.AnalyticsEventsTypes;
import com.forsale.adserver.utils.InitAnalytics;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import j9.e;
import j9.f;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ImpressionsViewModel.kt */
/* loaded from: classes2.dex */
public final class ImpressionsViewModel extends BaseViewModel {

    /* renamed from: b  reason: collision with root package name */
    private final a f21699b;

    /* renamed from: c  reason: collision with root package name */
    private final com.forsale.adserver.usecases.a f21700c;

    /* renamed from: d  reason: collision with root package name */
    private final e<f> f21701d;

    /* renamed from: e  reason: collision with root package name */
    private final e<f> f21702e;

    /* renamed from: f  reason: collision with root package name */
    private final e<Pair<f, Integer>> f21703f;

    /* compiled from: ImpressionsViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: j  reason: collision with root package name */
        public static final C0244a f21704j = new C0244a(null);

        /* renamed from: a  reason: collision with root package name */
        private final int f21705a;

        /* renamed from: b  reason: collision with root package name */
        private final String f21706b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f21707c;

        /* renamed from: d  reason: collision with root package name */
        private final Integer f21708d;

        /* renamed from: e  reason: collision with root package name */
        private final String f21709e;

        /* renamed from: f  reason: collision with root package name */
        private final String f21710f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean f21711g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f21712h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f21713i;

        /* compiled from: ImpressionsViewModel.kt */
        /* renamed from: com.forsale.adserver.view.viewmodel.ImpressionsViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0244a {
            private C0244a() {
            }

            public /* synthetic */ C0244a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(AdsModel adsModel) {
                boolean z11;
                if (adsModel != null) {
                    int g11 = adsModel.g();
                    String j11 = adsModel.j();
                    Integer i11 = adsModel.i();
                    Integer d11 = adsModel.d();
                    String c11 = adsModel.c();
                    String b11 = adsModel.b();
                    boolean z12 = true;
                    if (adsModel.a() == AdType.OFFER) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (adsModel.a() != AdType.SPLASH) {
                        z12 = false;
                    }
                    return new a(g11, j11, i11, d11, c11, b11, z11, z12, false);
                }
                return null;
            }
        }

        public a(int i11, String str, Integer num, Integer num2, String str2, String str3, boolean z11, boolean z12, boolean z13) {
            this.f21705a = i11;
            this.f21706b = str;
            this.f21707c = num;
            this.f21708d = num2;
            this.f21709e = str2;
            this.f21710f = str3;
            this.f21711g = z11;
            this.f21712h = z12;
            this.f21713i = z13;
        }

        public final String a() {
            return this.f21710f;
        }

        public final String b() {
            return this.f21709e;
        }

        public final Integer c() {
            return this.f21708d;
        }

        public final int d() {
            return this.f21705a;
        }

        public final Integer e() {
            return this.f21707c;
        }

        public final String f() {
            return this.f21706b;
        }

        public final boolean g() {
            return this.f21711g;
        }

        public final boolean h() {
            return this.f21712h;
        }

        public final boolean i() {
            return this.f21713i;
        }
    }

    /* compiled from: ImpressionsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        ImpressionsViewModel a(a aVar);
    }

    /* compiled from: ImpressionsViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21714a;

        static {
            int[] iArr = new int[AnalyticsEventsTypes.values().length];
            try {
                iArr[AnalyticsEventsTypes.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsEventsTypes.SPLASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsEventsTypes.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f21714a = iArr;
        }
    }

    public ImpressionsViewModel(a analyticsDetails, com.forsale.adserver.usecases.a impressionsUseCase) {
        o.i(analyticsDetails, "analyticsDetails");
        o.i(impressionsUseCase, "impressionsUseCase");
        this.f21699b = analyticsDetails;
        this.f21700c = impressionsUseCase;
        this.f21701d = new e<>();
        this.f21702e = new e<>();
        this.f21703f = new e<>();
    }

    private final InitAnalytics.AwsBannerScreen g(String str) {
        InitAnalytics.AwsBannerScreen awsBannerScreen;
        if (str != null) {
            Screens.a aVar = Screens.Companion;
            String lowerCase = str.toLowerCase();
            o.h(lowerCase, "toLowerCase(...)");
            Screens a11 = aVar.a(lowerCase);
            if (a11 != null) {
                awsBannerScreen = InitAnalytics.f20835a.b(a11);
            } else {
                awsBannerScreen = null;
            }
            if (awsBannerScreen != null) {
                return awsBannerScreen;
            }
        }
        return InitAnalytics.AwsBannerScreen.EMPTY;
    }

    private final InitAnalytics.AwsBannerType h(String str) {
        InitAnalytics.AwsBannerType awsBannerType;
        if (str != null) {
            ScreenBannerTypes.a aVar = ScreenBannerTypes.Companion;
            String lowerCase = str.toLowerCase();
            o.h(lowerCase, "toLowerCase(...)");
            ScreenBannerTypes a11 = aVar.a(lowerCase);
            if (a11 != null) {
                awsBannerType = InitAnalytics.f20835a.a(a11);
            } else {
                awsBannerType = null;
            }
            if (awsBannerType != null) {
                return awsBannerType;
            }
        }
        return InitAnalytics.AwsBannerType.EMPTY;
    }

    private final AnalyticsEventsTypes j() {
        if (this.f21699b.g()) {
            return AnalyticsEventsTypes.OFFER;
        }
        if (this.f21699b.h()) {
            return AnalyticsEventsTypes.SPLASH;
        }
        return AnalyticsEventsTypes.BANNER;
    }

    private final void w(String str, int i11, Integer num, String str2, String str3) {
        String str4;
        InitAnalytics.a aVar = InitAnalytics.f20835a;
        if (!this.f21699b.i()) {
            str4 = h(str2).getValue();
        } else {
            str4 = "VIDEO";
        }
        aVar.n(new g9.a(str, null, null, Integer.valueOf(i11), num, null, null, str4, g(str3).getValue(), 102, null));
    }

    private final void x(String str, int i11, String str2, Integer num) {
        InitAnalytics.f20835a.n(new g9.a(str, null, Integer.valueOf(i11), null, null, str2, num, null, null, 410, null));
    }

    private final void y(String str, int i11) {
        InitAnalytics.f20835a.n(new g9.a(str, Integer.valueOf(i11), null, null, null, null, null, null, null, 508, null));
    }

    @Override // com.forsale.adserver.view.viewmodel.BaseViewModel
    public String e() {
        return "Before_Details_item_view_model";
    }

    public final e<f> k() {
        return this.f21702e;
    }

    public final e<f> l() {
        return this.f21701d;
    }

    public final com.forsale.adserver.usecases.a m() {
        return this.f21700c;
    }

    public final e<Pair<f, Integer>> o() {
        return this.f21703f;
    }

    public final void p(boolean z11, int i11) {
        this.f21702e.postValue(f.c.f60482a);
        f(new ImpressionsViewModel$getLikesCount$1(z11, this, i11, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:14)(2:11|12))(2:18|(2:20|(1:22))(2:23|(1:25)))|15|16))|28|6|7|(0)(0)|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        r6.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0052 -> B:28:0x0055). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r6, int r7, com.forsale.adserver.datalayer.bannerdata.ClickType r8, zz.a<? super wz.p> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementClick$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementClick$1 r0 = (com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementClick$1) r0
            int r1 = r0.f21721c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21721c = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementClick$1 r0 = new com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementClick$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f21719a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21721c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L35
            goto L55
        L35:
            r6 = move-exception
            goto L52
        L37:
            kotlin.f.b(r9)
            if (r6 == 0) goto L47
            com.forsale.adserver.usecases.a r6 = r5.f21700c     // Catch: java.lang.Exception -> L35
            r0.f21721c = r4     // Catch: java.lang.Exception -> L35
            java.lang.Object r6 = r6.e(r7, r8, r0)     // Catch: java.lang.Exception -> L35
            if (r6 != r1) goto L55
            return r1
        L47:
            com.forsale.adserver.usecases.a r6 = r5.f21700c     // Catch: java.lang.Exception -> L35
            r0.f21721c = r3     // Catch: java.lang.Exception -> L35
            java.lang.Object r6 = r6.c(r7, r8, r0)     // Catch: java.lang.Exception -> L35
            if (r6 != r1) goto L55
            return r1
        L52:
            r6.getMessage()
        L55:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.ImpressionsViewModel.q(boolean, int, com.forsale.adserver.datalayer.bannerdata.ClickType, zz.a):java.lang.Object");
    }

    public final void r(boolean z11, int i11, ClickType clickType, int i12) {
        o.i(clickType, "clickType");
        f(new ImpressionsViewModel$incrementLikes$1(z11, this, i11, clickType, i12, null));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(5:11|12|(1:14)|16|17)(2:19|20))(5:21|22|(1:24)|16|17))(2:25|(6:27|(1:29)|22|(0)|16|17)(6:30|(1:32)|12|(0)|16|17))|15|16|17))|35|6|7|(0)(0)|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        r7.getMessage();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0029, B:32:0x0068, B:34:0x0070, B:16:0x0035, B:25:0x004d, B:27:0x0055, B:22:0x0040, B:29:0x005b), top: B:39:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070 A[Catch: Exception -> 0x0039, TRY_LEAVE, TryCatch #0 {Exception -> 0x0039, blocks: (B:12:0x0029, B:32:0x0068, B:34:0x0070, B:16:0x0035, B:25:0x004d, B:27:0x0055, B:22:0x0040, B:29:0x005b), top: B:39:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(boolean r7, int r8, zz.a<? super java.lang.Integer> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementViews$1
            if (r0 == 0) goto L13
            r0 = r9
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementViews$1 r0 = (com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementViews$1) r0
            int r1 = r0.f21730c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21730c = r1
            goto L18
        L13:
            com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementViews$1 r0 = new com.forsale.adserver.view.viewmodel.ImpressionsViewModel$incrementViews$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f21728a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f21730c
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L39
            goto L68
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.f.b(r9)     // Catch: java.lang.Exception -> L39
            goto L4d
        L39:
            r7 = move-exception
            goto L75
        L3b:
            kotlin.f.b(r9)
            if (r7 == 0) goto L5b
            com.forsale.adserver.usecases.a r7 = r6.f21700c     // Catch: java.lang.Exception -> L39
            com.forsale.adserver.datalayer.bannerdata.ClickType r9 = com.forsale.adserver.datalayer.bannerdata.ClickType.VIEW     // Catch: java.lang.Exception -> L39
            r0.f21730c = r4     // Catch: java.lang.Exception -> L39
            java.lang.Object r9 = r7.e(r8, r9, r0)     // Catch: java.lang.Exception -> L39
            if (r9 != r1) goto L4d
            return r1
        L4d:
            b9.i r9 = (b9.i) r9     // Catch: java.lang.Exception -> L39
            java.lang.Integer r7 = r9.a()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto L78
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L39
        L59:
            r5 = r7
            goto L78
        L5b:
            com.forsale.adserver.usecases.a r7 = r6.f21700c     // Catch: java.lang.Exception -> L39
            com.forsale.adserver.datalayer.bannerdata.ClickType r9 = com.forsale.adserver.datalayer.bannerdata.ClickType.VIEW     // Catch: java.lang.Exception -> L39
            r0.f21730c = r3     // Catch: java.lang.Exception -> L39
            java.lang.Object r9 = r7.c(r8, r9, r0)     // Catch: java.lang.Exception -> L39
            if (r9 != r1) goto L68
            return r1
        L68:
            b9.b r9 = (b9.b) r9     // Catch: java.lang.Exception -> L39
            java.lang.Integer r7 = r9.a()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto L78
            int r7 = r7.intValue()     // Catch: java.lang.Exception -> L39
            goto L59
        L75:
            r7.getMessage()
        L78:
            java.lang.Integer r7 = kotlin.coroutines.jvm.internal.a.d(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.viewmodel.ImpressionsViewModel.s(boolean, int, zz.a):java.lang.Object");
    }

    public final void t() {
        int i11 = c.f21714a[j().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    w(AnalyticsEvents.BANNER_ACTION_LIKED.getValue(), this.f21699b.d(), this.f21699b.c(), this.f21699b.b(), this.f21699b.a());
                    return;
                }
                return;
            }
            y(AnalyticsEvents.SPLASH_ACTION_LIKED.getValue(), this.f21699b.d());
            return;
        }
        x(AnalyticsEvents.OFFER_ACTION_LIKED.getValue(), this.f21699b.d(), this.f21699b.f(), this.f21699b.e());
    }

    public final void v() {
        int i11 = c.f21714a[j().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    w(AnalyticsEvents.BANNER_ACTION_URL_CLICKED.getValue(), this.f21699b.d(), this.f21699b.c(), this.f21699b.b(), this.f21699b.a());
                    return;
                }
                return;
            }
            y(AnalyticsEvents.SPLASH_ACTION_URL_CLICKED.getValue(), this.f21699b.d());
            return;
        }
        x(AnalyticsEvents.OFFER_ACTION_URL_CLICKED.getValue(), this.f21699b.d(), this.f21699b.f(), this.f21699b.e());
    }
}

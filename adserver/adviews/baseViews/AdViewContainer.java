package com.forsale.adserver.adviews.baseViews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import com.forsale.adserver.adviews.baseViews.image.AdImageView;
import com.forsale.adserver.adviews.baseViews.video.AdVideoPlayer;
import com.forsale.adserver.adviews.baseViews.webView.MyWebView;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.models.AdType;
import com.forsale.adserver.view.models.AdsModel;
import com.forsale.adserver.view.models.DetailsIntention;
import com.forsale.adserver.view.screens.detailsScreen.NewDetailsBottomSheetKt;
import com.forsale.adserver.view.viewmodel.BannerViewModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import com.forsale.analytics.commercial.CommercialPageSource;
import g00.l;
import j9.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.j;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.o;
import m9.c;
import m9.d;
import wz.p;
/* compiled from: AdViewContainer.kt */
/* loaded from: classes2.dex */
public final class AdViewContainer extends f implements com.forsale.adserver.adviews.baseViews.a, r {
    public static final a B = new a(null);
    public static final int C = 8;
    private static final WeakHashMap<Integer, Integer> D = new WeakHashMap<>();
    private Integer A;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<Context> f20533c;

    /* renamed from: d  reason: collision with root package name */
    private ProgressBar f20534d;

    /* renamed from: e  reason: collision with root package name */
    private View f20535e;

    /* renamed from: f  reason: collision with root package name */
    private final a9.b f20536f;

    /* renamed from: g  reason: collision with root package name */
    public BannerViewModel f20537g;

    /* renamed from: h  reason: collision with root package name */
    private s f20538h;

    /* renamed from: i  reason: collision with root package name */
    private l<? super CommercialPageSource, p> f20539i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f20540j;

    /* renamed from: x  reason: collision with root package name */
    private String f20541x;

    /* renamed from: y  reason: collision with root package name */
    private String f20542y;

    /* renamed from: z  reason: collision with root package name */
    private CommercialItemDetailsSource f20543z;

    /* compiled from: AdViewContainer.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: AdViewContainer.kt */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AdViewContainer.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<j9.f> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<T, p> f20544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AdViewContainer f20545b;

        /* JADX WARN: Multi-variable type inference failed */
        c(l<? super T, p> lVar, AdViewContainer adViewContainer) {
            this.f20544a = lVar;
            this.f20545b = adViewContainer;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            o.i(it2, "it");
            if (it2 instanceof f.d) {
                this.f20544a.invoke(((f.d) it2).a());
                this.f20545b.N();
            } else if (it2 instanceof f.a) {
                this.f20545b.I();
            } else if (it2 instanceof f.c) {
                this.f20545b.M();
            } else if (it2 instanceof f.b) {
                this.f20545b.I();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.i(context, "context");
        o.i(attrs, "attrs");
        this.f20533c = new WeakReference<>(getContext());
        this.f20536f = new a9.b();
        v();
        if (context instanceof s) {
            ((s) context).getLifecycle().a(this);
        }
    }

    private final void A(final Screens screens, final Integer num) {
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initLandingAd$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<g9.b> it2) {
                o.i(it2, "it");
                AdViewContainer.this.G(it2, ScreenBannerTypes.LANDING_PAGE, screens, num);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        getBannersViewModel().o(screens, num);
    }

    private final void B(final int i11, final ScreenBannerTypes screenBannerTypes, final Screens screens) {
        boolean z11;
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initSlidingView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<g9.b> it2) {
                List f11;
                int y11;
                o.i(it2, "it");
                f11 = q.f(it2);
                List<g9.b> list = f11;
                AdViewContainer adViewContainer = AdViewContainer.this;
                y11 = kotlin.collections.s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (g9.b bVar : list) {
                    arrayList.add(adViewContainer.getBannerMapper().a(bVar));
                }
                ArrayList<AdGeneralModel> arrayList2 = new ArrayList<>(arrayList);
                AdViewContainer adViewContainer2 = AdViewContainer.this;
                Context context = AdViewContainer.this.getContext();
                o.h(context, "getContext(...)");
                adViewContainer2.f20535e = new r8.c(context).L1(arrayList2, AdViewContainer.this, screenBannerTypes, screens, Integer.valueOf(i11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        BannerViewModel bannersViewModel = getBannersViewModel();
        if (screens == Screens.HOME_SCREEN) {
            z11 = true;
        } else {
            z11 = false;
        }
        bannersViewModel.q(screens, i11, z11);
    }

    private final void D(final Screens screens, final int i11, final int i12, final boolean z11) {
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initSmallSliding$1

            /* compiled from: Comparisons.kt */
            /* loaded from: classes2.dex */
            public static final class a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int a11;
                    a11 = yz.b.a(Integer.valueOf(((g9.b) t11).b()), Integer.valueOf(((g9.b) t12).b()));
                    return a11;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<g9.b> it2) {
                o.i(it2, "it");
                List M0 = z11 ? CollectionsKt___CollectionsKt.M0(it2, new a()) : q.f(it2);
                int size = M0.size();
                int i13 = i12;
                if (size >= i13 + 1) {
                    this.J((g9.b) M0.get(i13), this, false, ScreenBannerTypes.SLIDING_SMALL, screens, Integer.valueOf(i11));
                } else {
                    this.I();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        getBannersViewModel().p(screens, i11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(List<g9.b> list, ScreenBannerTypes screenBannerTypes, Screens screens, Integer num) {
        FragmentManager supportFragmentManager;
        List n11;
        if (o.d(((g9.b) kotlin.collections.p.k0(list)).n(), m9.d.f63243a.a())) {
            androidx.appcompat.app.d c11 = UtilsKt.c(getContext());
            if (c11 != null && (supportFragmentManager = c11.getSupportFragmentManager()) != null) {
                Context context = getContext();
                o.h(context, "getContext(...)");
                AdsModel G = ((g9.b) kotlin.collections.p.k0(list)).G(num, AdType.BANNER, screenBannerTypes, screens);
                l<? super CommercialPageSource, p> lVar = this.f20539i;
                Integer num2 = this.f20540j;
                if (num2 == null || (n11 = kotlin.collections.p.e(Integer.valueOf(num2.intValue()))) == null) {
                    n11 = kotlin.collections.p.n();
                }
                List list2 = n11;
                CommercialItemDetailsSource commercialItemDetailsSource = this.f20543z;
                if (commercialItemDetailsSource == null) {
                    commercialItemDetailsSource = CommercialItemDetailsSource.COMMERCIAL_SCREEN;
                }
                NewDetailsBottomSheetKt.f(context, G, lVar, list2, supportFragmentManager, null, commercialItemDetailsSource, new com.forsale.adserver.view.screens.detailsScreen.a(null, null, null, null, null, this.A, null, null, null, 479, null), null, 144, null);
                return;
            }
            return;
        }
        Context context2 = getContext();
        o.h(context2, "getContext(...)");
        String o11 = ((g9.b) kotlin.collections.p.k0(list)).o();
        if (o11 == null) {
            o11 = "";
        }
        m9.f.g(context2, o11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I() {
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            o.g(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void J(g9.b bVar, final com.forsale.adserver.adviews.baseViews.a aVar, boolean z11, final ScreenBannerTypes screenBannerTypes, final Screens screens, final Integer num) {
        String str;
        MyWebView myWebView;
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        boolean z12 = true;
        if (z11) {
            ref$IntRef.f61776a = 1;
        }
        final AdGeneralModel a11 = this.f20536f.a(bVar);
        String i11 = a11.i();
        d.a aVar2 = m9.d.f63243a;
        String str2 = "";
        if (o.d(i11, aVar2.a())) {
            Context context = getContext();
            o.h(context, "getContext(...)");
            AdImageView adImageView = new AdImageView(context);
            String h11 = a11.h();
            if (h11 != null && h11.length() != 0) {
                z12 = false;
            }
            if (z12) {
                String c11 = a11.c();
                if (c11 != null) {
                    str2 = c11;
                }
                adImageView.c(str2);
            } else {
                adImageView.c(a11.h());
            }
            adImageView.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.adviews.baseViews.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdViewContainer.K(a.this, a11, ref$IntRef, screenBannerTypes, screens, num, view);
                }
            });
            m9.f.b(adImageView, new g00.a<p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$setSingleView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    a.this.b(a11.b());
                }
            });
            myWebView = adImageView;
        } else if (o.d(i11, aVar2.b())) {
            Context context2 = getContext();
            o.h(context2, "getContext(...)");
            AdVideoPlayer adVideoPlayer = new AdVideoPlayer(context2);
            String l11 = a11.l();
            if (l11 == null) {
                str = "";
            } else {
                str = l11;
            }
            adVideoPlayer.e0(str, a11.b(), screenBannerTypes, screens, num, new g00.a<p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$setSingleView$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    a.this.a(new AdGeneralModel[]{a11}, ref$IntRef.f61776a, screenBannerTypes, screens, num);
                }
            });
            m9.f.b(adVideoPlayer, new g00.a<p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$setSingleView$4
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    a.this.b(a11.b());
                }
            });
            myWebView = adVideoPlayer;
        } else if (o.d(i11, aVar2.c())) {
            Context context3 = getContext();
            o.h(context3, "getContext(...)");
            MyWebView myWebView2 = new MyWebView(context3);
            String j11 = a11.j();
            if (j11 != null) {
                str2 = j11;
            }
            myWebView2.e(str2);
            myWebView2.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.adviews.baseViews.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AdViewContainer.L(a.this, a11, ref$IntRef, screenBannerTypes, screens, num, view);
                }
            });
            m9.f.b(myWebView2, new g00.a<p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$setSingleView$6
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    a.this.b(a11.b());
                }
            });
            myWebView = myWebView2;
        } else {
            throw new Exception("Not a valid type");
        }
        this.f20535e = myWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(com.forsale.adserver.adviews.baseViews.a adActionsListener, AdGeneralModel adModel, Ref$IntRef type, ScreenBannerTypes screenBannerTypes, Screens screens, Integer num, View view) {
        o.i(adActionsListener, "$adActionsListener");
        o.i(adModel, "$adModel");
        o.i(type, "$type");
        adActionsListener.a(new AdGeneralModel[]{adModel}, type.f61776a, screenBannerTypes, screens, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(com.forsale.adserver.adviews.baseViews.a adActionsListener, AdGeneralModel adModel, Ref$IntRef type, ScreenBannerTypes screenBannerTypes, Screens screens, Integer num, View view) {
        o.i(adActionsListener, "$adActionsListener");
        o.i(adModel, "$adModel");
        o.i(type, "$type");
        adActionsListener.a(new AdGeneralModel[]{adModel}, type.f61776a, screenBannerTypes, screens, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        ProgressBar progressBar = this.f20534d;
        if (progressBar == null) {
            o.w("loading");
            progressBar = null;
        }
        progressBar.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        ProgressBar progressBar = this.f20534d;
        if (progressBar == null) {
            o.w("loading");
            progressBar = null;
        }
        progressBar.setVisibility(4);
        p();
    }

    private final <T> void O(final l<? super T, p> lVar) {
        s lifeCycleOwner = getLifeCycleOwner();
        if (lifeCycleOwner != null) {
            getBannersViewModel().j().observe(lifeCycleOwner, r(new l<T, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$startObserving$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void b(T t11) {
                    lVar.invoke(t11);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Object obj) {
                    b(obj);
                    return p.f75480a;
                }
            }));
        }
    }

    private final s getLifeCycleOwner() {
        s sVar = this.f20538h;
        if (sVar == null) {
            if (getContext() instanceof s) {
                Context context = getContext();
                o.g(context, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
                return (s) context;
            }
            return null;
        }
        return sVar;
    }

    private final void p() {
        View view = this.f20535e;
        if (view != null) {
            View view2 = null;
            if (view == null) {
                o.w("mainView");
                view = null;
            }
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            View view3 = this.f20535e;
            if (view3 == null) {
                o.w("mainView");
            } else {
                view2 = view3;
            }
            addView(view2);
            invalidate();
        }
    }

    private final <T> c0<j9.f> r(l<? super T, p> lVar) {
        return new c(lVar, this);
    }

    private final void u(final Screens screens, final int i11, final int i12, final boolean z11) {
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initBigSliding$1

            /* compiled from: Comparisons.kt */
            /* loaded from: classes2.dex */
            public static final class a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t11, T t12) {
                    int a11;
                    a11 = yz.b.a(Integer.valueOf(((g9.b) t11).b()), Integer.valueOf(((g9.b) t12).b()));
                    return a11;
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<g9.b> it2) {
                o.i(it2, "it");
                List M0 = z11 ? CollectionsKt___CollectionsKt.M0(it2, new a()) : q.f(it2);
                int size = M0.size();
                int i13 = i12;
                if (size >= i13 + 1) {
                    this.J((g9.b) M0.get(i13), this, false, ScreenBannerTypes.SLIDING_BIG, screens, Integer.valueOf(i11));
                } else {
                    this.I();
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        getBannersViewModel().p(screens, i11, true);
    }

    private final void v() {
        ProgressBar progressBar = new ProgressBar(this.f20533c.get());
        this.f20534d = progressBar;
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        ProgressBar progressBar2 = this.f20534d;
        if (progressBar2 == null) {
            o.w("loading");
            progressBar2 = null;
        }
        addView(progressBar2);
    }

    private final void w(final Screens screens, final int i11) {
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initFixedFooter$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(List<g9.b> it2) {
                Object m02;
                Object k02;
                o.i(it2, "it");
                m02 = CollectionsKt___CollectionsKt.m0(it2);
                if (m02 != null) {
                    AdViewContainer adViewContainer = AdViewContainer.this;
                    k02 = CollectionsKt___CollectionsKt.k0(it2);
                    adViewContainer.J((g9.b) k02, AdViewContainer.this, false, ScreenBannerTypes.FIXED_FOOTER, screens, Integer.valueOf(i11));
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        getBannersViewModel().l(screens, i11);
    }

    private final void y() {
        O(new l<List<? extends g9.b>, p>() { // from class: com.forsale.adserver.adviews.baseViews.AdViewContainer$initHomeTopView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<g9.b> bannersList) {
                List f11;
                int y11;
                o.i(bannersList, "bannersList");
                f11 = q.f(bannersList);
                List<g9.b> list = f11;
                AdViewContainer adViewContainer = AdViewContainer.this;
                y11 = kotlin.collections.s.y(list, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (g9.b bVar : list) {
                    arrayList.add(adViewContainer.getBannerMapper().a(bVar));
                }
                ArrayList<AdGeneralModel> arrayList2 = new ArrayList<>(arrayList);
                AdViewContainer adViewContainer2 = AdViewContainer.this;
                Context context = AdViewContainer.this.getContext();
                o.h(context, "getContext(...)");
                adViewContainer2.f20535e = new s8.f(context).R1(arrayList2, AdViewContainer.this);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends g9.b> list) {
                b(list);
                return p.f75480a;
            }
        });
        getBannersViewModel().m(Screens.HOME_SCREEN);
    }

    public final AdViewContainer E(m9.c adsViewType) {
        o.i(adsViewType, "adsViewType");
        if (this.f20535e != null) {
            removeAllViews();
            v();
            j9.e<j9.f> j11 = getBannersViewModel().j();
            s lifeCycleOwner = getLifeCycleOwner();
            o.f(lifeCycleOwner);
            j11.removeObservers(lifeCycleOwner);
            invalidate();
        }
        if (adsViewType instanceof c.g) {
            y();
        } else if (adsViewType instanceof c.e) {
            c.e eVar = (c.e) adsViewType;
            u(eVar.c(), eVar.a(), eVar.b(), eVar.d());
        } else if (adsViewType instanceof c.f) {
            D(Screens.ITEM_DETAILS, ((c.f) adsViewType).a(), 0, true);
        } else if (adsViewType instanceof c.b) {
            c.b bVar = (c.b) adsViewType;
            w(bVar.b(), bVar.a());
        } else if (adsViewType instanceof c.C0739c) {
            c.C0739c c0739c = (c.C0739c) adsViewType;
            B(c0739c.a(), ScreenBannerTypes.HOME_SLIDING, c0739c.b());
        } else if (adsViewType instanceof c.a) {
            c.a aVar = (c.a) adsViewType;
            B(aVar.a(), ScreenBannerTypes.CATEGORIES_SLIDING, aVar.b());
        } else if (adsViewType instanceof c.d) {
            c.d dVar = (c.d) adsViewType;
            A(dVar.b(), dVar.a());
        }
        return this;
    }

    public final void H(s lifecycleOwner) {
        Lifecycle lifecycle;
        o.i(lifecycleOwner, "lifecycleOwner");
        s lifeCycleOwner = getLifeCycleOwner();
        if (lifeCycleOwner != null && (lifecycle = lifeCycleOwner.getLifecycle()) != null) {
            lifecycle.d(this);
        }
        lifecycleOwner.getLifecycle().a(this);
        this.f20538h = lifecycleOwner;
    }

    @Override // com.forsale.adserver.adviews.baseViews.a
    public void a(AdGeneralModel[] adModel, int i11, ScreenBannerTypes screenBannerTypes, Screens screens, Integer num) {
        String str;
        FragmentManager supportFragmentManager;
        AdType adType;
        List n11;
        DetailsIntention detailsIntention;
        o.i(adModel, "adModel");
        AdGeneralModel adGeneralModel = (AdGeneralModel) j.N(adModel);
        kotlin.collections.p.E(new ArrayList(), adModel);
        androidx.appcompat.app.d c11 = UtilsKt.c(getContext());
        if (c11 != null && (supportFragmentManager = c11.getSupportFragmentManager()) != null) {
            Context context = getContext();
            if (i11 == 1) {
                adType = AdType.SPLASH;
            } else {
                adType = AdType.BANNER;
            }
            AdsModel r11 = adGeneralModel.r(num, adType, screenBannerTypes, screens);
            l<? super CommercialPageSource, p> lVar = this.f20539i;
            Integer num2 = this.f20540j;
            if (num2 == null || (n11 = kotlin.collections.p.e(Integer.valueOf(num2.intValue()))) == null) {
                n11 = kotlin.collections.p.n();
            }
            List list = n11;
            if (i11 == 1) {
                detailsIntention = DetailsIntention.DETAILS_ONLY;
            } else {
                detailsIntention = DetailsIntention.ALL_SCREEN;
            }
            DetailsIntention detailsIntention2 = detailsIntention;
            com.forsale.adserver.view.screens.detailsScreen.a aVar = new com.forsale.adserver.view.screens.detailsScreen.a(null, null, this.f20542y, null, null, this.A, null, null, null, 475, null);
            CommercialItemDetailsSource commercialItemDetailsSource = this.f20543z;
            if (commercialItemDetailsSource == null) {
                commercialItemDetailsSource = CommercialItemDetailsSource.COMMERCIAL_SCREEN;
            }
            o.f(context);
            NewDetailsBottomSheetKt.f(context, r11, lVar, list, supportFragmentManager, detailsIntention2, commercialItemDetailsSource, aVar, null, 128, null);
        }
        String str2 = null;
        if (screenBannerTypes != null) {
            str = screenBannerTypes.name();
        } else {
            str = null;
        }
        if (screens != null) {
            str2 = screens.name();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Banner Type and Screen: ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" CategoryId: ");
        sb2.append(num);
    }

    @Override // com.forsale.adserver.adviews.baseViews.a
    public void b(int i11) {
        WeakHashMap<Integer, Integer> weakHashMap = D;
        if (weakHashMap.containsKey(Integer.valueOf(i11))) {
            Integer valueOf = Integer.valueOf(i11);
            Integer num = weakHashMap.get(Integer.valueOf(i11));
            o.f(num);
            weakHashMap.put(valueOf, Integer.valueOf(num.intValue() + 1));
        } else {
            weakHashMap.put(Integer.valueOf(i11), 1);
        }
        weakHashMap.toString();
    }

    public final a9.b getBannerMapper() {
        return this.f20536f;
    }

    public final BannerViewModel getBannersViewModel() {
        BannerViewModel bannerViewModel = this.f20537g;
        if (bannerViewModel != null) {
            return bannerViewModel;
        }
        o.w("bannersViewModel");
        return null;
    }

    public final l<CommercialPageSource, p> getCheckAllOffersClicked() {
        return this.f20539i;
    }

    public final Integer getPositionCategoryId() {
        return this.A;
    }

    public final CommercialItemDetailsSource getSource() {
        return this.f20543z;
    }

    public final String getSourceCategoryFullPath() {
        return this.f20542y;
    }

    public final Integer getVerticalId() {
        return this.f20540j;
    }

    public final String getVerticalName() {
        return this.f20541x;
    }

    @d0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        j9.e<j9.f> j11 = getBannersViewModel().j();
        s lifeCycleOwner = getLifeCycleOwner();
        o.f(lifeCycleOwner);
        j11.removeObservers(lifeCycleOwner);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setBannersViewModel(BannerViewModel bannerViewModel) {
        o.i(bannerViewModel, "<set-?>");
        this.f20537g = bannerViewModel;
    }

    public final void setCheckAllOffersClicked(l<? super CommercialPageSource, p> lVar) {
        this.f20539i = lVar;
    }

    public final void setOnAdRetrieved(b onAdRetrieved) {
        o.i(onAdRetrieved, "onAdRetrieved");
    }

    public final void setPositionCategoryId(Integer num) {
        this.A = num;
    }

    public final void setSource(CommercialItemDetailsSource commercialItemDetailsSource) {
        this.f20543z = commercialItemDetailsSource;
    }

    public final void setSourceCategoryFullPath(String str) {
        this.f20542y = str;
    }

    public final void setVerticalId(Integer num) {
        this.f20540j = num;
    }

    public final void setVerticalName(String str) {
        this.f20541x = str;
    }
}

package com.forsale.app.features.categories.home.homelandingscreen.topbannerslider;

import aa.kj;
import android.content.Context;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.c;
import androidx.viewpager2.widget.e;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$onPageChange$2;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.forsale.app.utils.z;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kr.b;
import m00.i;
import t9.r0;
import t9.t0;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: HomeTopSliderItem.kt */
/* loaded from: classes2.dex */
public final class HomeTopSliderItem extends x9.a<HomeTopSliderViewHolder, p, TopBannerSliderViewModel> {

    /* renamed from: k */
    public static final a f24196k = new a(null);

    /* renamed from: l */
    public static final int f24197l = 8;

    /* renamed from: m */
    private static final long f24198m = r0.f70058r7;

    /* renamed from: n */
    private static final int f24199n = 20;

    /* renamed from: g */
    private final TopBannerSliderViewModel f24200g;

    /* renamed from: h */
    private final s f24201h;

    /* renamed from: i */
    private final int f24202i;

    /* renamed from: j */
    private final h f24203j;

    /* compiled from: HomeTopSliderItem.kt */
    /* loaded from: classes2.dex */
    public static final class HomeTopSliderViewHolder extends b.c<HomeTopSliderItem> {

        /* renamed from: a */
        private final kj f24204a;

        /* renamed from: b */
        private final s f24205b;

        /* renamed from: c */
        private final h f24206c;

        /* renamed from: d */
        private final h f24207d;

        /* renamed from: e */
        private final h f24208e;

        /* compiled from: HomeTopSliderItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c0<List<? extends TopHomeBannerViewModel>> {

            /* renamed from: a */
            final /* synthetic */ HomeTopSliderItem f24209a;

            /* renamed from: b */
            final /* synthetic */ HomeTopSliderViewHolder f24210b;

            a(HomeTopSliderItem homeTopSliderItem, HomeTopSliderViewHolder homeTopSliderViewHolder) {
                this.f24209a = homeTopSliderItem;
                this.f24210b = homeTopSliderViewHolder;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(List<TopHomeBannerViewModel> list) {
                ua.b D = this.f24209a.D();
                if (D != null) {
                    HomeTopSliderViewHolder homeTopSliderViewHolder = this.f24210b;
                    if (!o.d(D.d(), list)) {
                        o.f(list);
                        D.h(list);
                        D.notifyDataSetChanged();
                        List<TopHomeBannerViewModel> list2 = list;
                        if (!list2.isEmpty()) {
                            homeTopSliderViewHolder.l().S.j(1073741823 - (1073741823 % list2.size()), false);
                        }
                    }
                }
            }
        }

        /* compiled from: HomeTopSliderItem.kt */
        /* loaded from: classes2.dex */
        public static final class b implements c0<CategoryEntity> {

            /* renamed from: b */
            final /* synthetic */ HomeTopSliderItem f24212b;

            b(HomeTopSliderItem homeTopSliderItem) {
                HomeTopSliderViewHolder.this = r1;
                this.f24212b = homeTopSliderItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(CategoryEntity categoryEntity) {
                int i11;
                if (categoryEntity.getMaxHomeTopBannersCount() <= 0) {
                    i11 = HomeTopSliderItem.f24199n;
                } else {
                    i11 = categoryEntity.getMaxHomeTopBannersCount();
                }
                HomeTopSliderViewHolder homeTopSliderViewHolder = HomeTopSliderViewHolder.this;
                TopBannerSliderViewModel topBannerSliderViewModel = this.f24212b.f24200g;
                Context context = HomeTopSliderViewHolder.this.l().getRoot().getContext();
                o.h(context, "getContext(...)");
                homeTopSliderViewHolder.p(topBannerSliderViewModel, i11, context, this.f24212b.f24201h);
            }
        }

        /* compiled from: HomeTopSliderItem.kt */
        /* loaded from: classes2.dex */
        public static final class c implements NativeCustomFormatAd.OnCustomFormatAdLoadedListener {

            /* renamed from: a */
            final /* synthetic */ CancellableContinuation<NativeCustomFormatAd> f24217a;

            /* JADX WARN: Multi-variable type inference failed */
            c(CancellableContinuation<? super NativeCustomFormatAd> cancellableContinuation) {
                this.f24217a = cancellableContinuation;
            }

            @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
            public final void onCustomFormatAdLoaded(NativeCustomFormatAd ad2) {
                o.i(ad2, "ad");
                if (this.f24217a.isActive()) {
                    this.f24217a.resumeWith(Result.b(ad2));
                }
            }
        }

        /* compiled from: HomeTopSliderItem.kt */
        /* loaded from: classes2.dex */
        public static final class d implements NativeCustomFormatAd.OnCustomClickListener {

            /* renamed from: a */
            final /* synthetic */ Context f24218a;

            /* renamed from: b */
            final /* synthetic */ OneShotEventHandler<Boolean> f24219b;

            d(Context context, OneShotEventHandler<Boolean> oneShotEventHandler) {
                this.f24218a = context;
                this.f24219b = oneShotEventHandler;
            }

            @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener
            public final void onCustomClick(NativeCustomFormatAd ad2, String assetName) {
                o.i(ad2, "ad");
                o.i(assetName, "assetName");
                GamActionUtilsKt.a(this.f24218a, GamActionUtilsKt.d(ad2), this.f24219b);
            }
        }

        /* compiled from: HomeTopSliderItem.kt */
        /* loaded from: classes2.dex */
        public static final class e extends AdListener {

            /* renamed from: a */
            final /* synthetic */ CancellableContinuation<NativeCustomFormatAd> f24220a;

            /* JADX WARN: Multi-variable type inference failed */
            e(CancellableContinuation<? super NativeCustomFormatAd> cancellableContinuation) {
                this.f24220a = cancellableContinuation;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError p02) {
                o.i(p02, "p0");
                if (this.f24220a.isActive()) {
                    this.f24220a.resumeWith(Result.b(null));
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public HomeTopSliderViewHolder(aa.kj r3, androidx.lifecycle.s r4) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "lc"
                kotlin.jvm.internal.o.i(r4, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f24204a = r3
                r2.f24205b = r4
                com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2 r3 = new g00.a<android.os.Handler>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2
                    static {
                        /*
                            com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2 r0 = new com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2
                            r0.<init>()
                            
                            // error: 0x0005: SPUT  
  (r0 I:com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2)
 com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2.a com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2.<clinit>():void");
                    }

                    {
                        /*
                            r1 = this;
                            r0 = 0
                            r1.<init>(r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2.<init>():void");
                    }

                    @Override // g00.a
                    /* renamed from: b */
                    public final android.os.Handler invoke() {
                        /*
                            r2 = this;
                            android.os.Handler r0 = new android.os.Handler
                            android.os.Looper r1 = android.os.Looper.getMainLooper()
                            r0.<init>(r1)
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2.invoke():android.os.Handler");
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ android.os.Handler invoke() {
                        /*
                            r1 = this;
                            android.os.Handler r0 = r1.invoke()
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderHandler$2.invoke():java.lang.Object");
                    }
                }
                wz.h r3 = kotlin.c.a(r3)
                r2.f24206c = r3
                com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderRunnable$2 r3 = new com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$sliderRunnable$2
                r3.<init>(r2)
                wz.h r3 = kotlin.c.a(r3)
                r2.f24207d = r3
                com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$onPageChange$2 r3 = new com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$HomeTopSliderViewHolder$onPageChange$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f24208e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem.HomeTopSliderViewHolder.<init>(aa.kj, androidx.lifecycle.s):void");
        }

        private final HomeTopSliderItem$HomeTopSliderViewHolder$onPageChange$2.a m() {
            return (HomeTopSliderItem$HomeTopSliderViewHolder$onPageChange$2.a) this.f24208e.getValue();
        }

        public final Handler n() {
            return (Handler) this.f24206c.getValue();
        }

        public final Runnable o() {
            return (Runnable) this.f24207d.getValue();
        }

        public final void p(TopBannerSliderViewModel topBannerSliderViewModel, int i11, Context context, s sVar) {
            i t11;
            List a02;
            Job launch$default;
            boolean z11;
            topBannerSliderViewModel.h(z.a.f40550a);
            int i12 = 5;
            if (i11 < 5) {
                if (i11 >= 0 && i11 < 5) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    i12 = i11;
                }
            }
            ArrayList arrayList = new ArrayList();
            t11 = m00.o.t(0, i11);
            a02 = CollectionsKt___CollectionsKt.a0(t11, i12);
            x10.a.b("**********TOP BANNERS****** chunked indexes = " + a02, new Object[0]);
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new HomeTopSliderItem$HomeTopSliderViewHolder$loadHomeTopBannersAsync$1$1(a02, this, context, topBannerSliderViewModel, arrayList, null), 3, null);
            ViewsExtensionsKt.C(launch$default, sVar);
        }

        public final Object q(Context context, AdRequest adRequest, OneShotEventHandler<Boolean> oneShotEventHandler, zz.a<? super NativeCustomFormatAd> aVar) {
            zz.a d11;
            Object f11;
            d11 = IntrinsicsKt__IntrinsicsJvmKt.d(aVar);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(d11, 1);
            cancellableContinuationImpl.initCancellability();
            AdLoader build = new AdLoader.Builder(context.getApplicationContext(), context.getString(y0.f70562m)).forCustomFormatAd(context.getString(y0.f70754xa), new c(cancellableContinuationImpl), new d(context, oneShotEventHandler)).withAdListener(new e(cancellableContinuationImpl)).build();
            o.h(build, "build(...)");
            build.loadAd(adRequest);
            Object result = cancellableContinuationImpl.getResult();
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (result == f11) {
                f.c(aVar);
            }
            return result;
        }

        public final void j(boolean z11) {
            if (z11) {
                n().postDelayed(o(), 5000L);
            } else {
                n().removeCallbacks(o());
            }
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void b(HomeTopSliderItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f24204a.U(this.f24205b);
            this.f24204a.h0(item.f24200g);
            this.f24204a.S.g(m());
            item.f24200g.g().observe(this.f24205b, new a(item, this));
            Transformations.a(item.f24200g.b()).observe(this.f24205b, new b(item));
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f24201h), null, null, new HomeTopSliderItem$HomeTopSliderViewHolder$bindView$3$1(item.f24200g, this, null), 3, null);
        }

        public final kj l() {
            return this.f24204a;
        }

        @Override // kr.b.c
        /* renamed from: r */
        public void e(HomeTopSliderItem item) {
            List<TopHomeBannerViewModel> n11;
            o.i(item, "item");
            this.f24204a.S.n(m());
            item.f24200g.c().removeObservers(item.f24201h);
            item.f24200g.b().removeObservers(item.f24201h);
            item.f24200g.f().j();
            ua.b D = item.D();
            n11 = r.n();
            D.h(n11);
        }
    }

    /* compiled from: HomeTopSliderItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeTopSliderItem(TopBannerSliderViewModel topBannerSliderViewModel, s lc2) {
        super(topBannerSliderViewModel, lc2);
        h a11;
        o.i(topBannerSliderViewModel, "topBannerSliderViewModel");
        o.i(lc2, "lc");
        this.f24200g = topBannerSliderViewModel;
        this.f24201h = lc2;
        this.f24202i = t0.D4;
        o(f24198m);
        a11 = d.a(new g00.a<ua.b>() { // from class: com.forsale.app.features.categories.home.homelandingscreen.topbannerslider.HomeTopSliderItem$homeAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ua.b invoke() {
                return new ua.b(null, HomeTopSliderItem.this.f24201h, 1, null);
            }
        });
        this.f24203j = a11;
    }

    private final void B(kj kjVar) {
        DisplayMetrics displayMetrics;
        int i11;
        Object systemService = kjVar.getRoot().getContext().getSystemService("window");
        o.g(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(new DisplayMetrics());
        float h11 = displayMetrics.widthPixels - (TypeExtensionsKt.h(kjVar.getRoot().getContext(), 320) + TypeExtensionsKt.h(kjVar.getRoot().getContext(), 0));
        if (h11 > 0.0f) {
            i11 = (int) (h11 / 2);
        } else {
            i11 = 0;
        }
        Integer.valueOf(i11).intValue();
        kjVar.S.setPaddingRelative(i11, 0, i11, 0);
    }

    public final ua.b D() {
        return (ua.b) this.f24203j.getValue();
    }

    private final void F(kj kjVar) {
        ViewPager2 viewPager2 = kjVar.S;
        viewPager2.setAdapter(D());
        viewPager2.setClipChildren(false);
        viewPager2.setClipToPadding(false);
        viewPager2.setOffscreenPageLimit(1);
        B(kjVar);
        viewPager2.getChildAt(0).setOverScrollMode(2);
        c cVar = new c();
        cVar.b(new e((int) TypeExtensionsKt.h(viewPager2.getContext(), 12)));
        cVar.b(new ua.a());
        viewPager2.setPageTransformer(cVar);
        viewPager2.setOrientation(0);
    }

    public static final void G(View page, float f11) {
        o.i(page, "page");
        page.setScaleY(((1 - Math.abs(f11)) * 0.15f) + 0.85f);
    }

    @Override // pr.b, kr.m
    /* renamed from: A */
    public void b(HomeTopSliderViewHolder holder) {
        o.i(holder, "holder");
        super.b(holder);
        holder.j(true);
    }

    @Override // pr.b, kr.m
    /* renamed from: C */
    public void j(HomeTopSliderViewHolder holder) {
        o.i(holder, "holder");
        holder.j(false);
        super.j(holder);
    }

    @Override // pr.a
    /* renamed from: E */
    public HomeTopSliderViewHolder u(View v11) {
        o.i(v11, "v");
        kj f02 = kj.f0(v11);
        o.f(f02);
        F(f02);
        o.h(f02, "apply(...)");
        return new HomeTopSliderViewHolder(f02, this.f24201h);
    }

    @Override // pr.a
    public int t() {
        return this.f24202i;
    }
}

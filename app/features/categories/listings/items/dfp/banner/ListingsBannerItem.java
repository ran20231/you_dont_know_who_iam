package com.forsale.app.features.categories.listings.items.dfp.banner;

import aa.yf;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.listings.items.dfp.banner.ListingsBannerItemViewModel;
import com.forsale.app.ui.bottomsheets.gamActionBottomSheet.GamActionUtilsKt;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import t9.y0;
import wz.h;
import wz.p;
/* compiled from: ListingsBannerItem.kt */
/* loaded from: classes2.dex */
public final class ListingsBannerItem extends qc.a<ViewHolder, p, ListingsBannerItemViewModel> {

    /* renamed from: k */
    public static final a f30637k = new a(null);

    /* renamed from: l */
    public static final int f30638l = 8;

    /* renamed from: m */
    private static final long f30639m = r0.L5;

    /* renamed from: h */
    private final ListingsBannerItemViewModel f30640h;

    /* renamed from: i */
    private final s f30641i;

    /* renamed from: j */
    private final int f30642j;

    /* compiled from: ListingsBannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<ListingsBannerItem> {

        /* renamed from: a */
        private final yf f30643a;

        /* renamed from: b */
        private r f30644b;

        /* renamed from: c */
        private final h f30645c;

        /* compiled from: ListingsBannerItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c0<Boolean> {

            /* renamed from: a */
            final /* synthetic */ ListingsBannerItem f30646a;

            /* renamed from: b */
            final /* synthetic */ ViewHolder f30647b;

            a(ListingsBannerItem listingsBannerItem, ViewHolder viewHolder) {
                this.f30646a = listingsBannerItem;
                this.f30647b = viewHolder;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(Boolean bool) {
                this.f30646a.f30640h.l(ListingsBannerItemViewModel.BANNERS_VIEWS.PLACE_HOLDER);
                o.f(bool);
                if (bool.booleanValue()) {
                    this.f30647b.n(this.f30646a);
                } else {
                    this.f30647b.m(this.f30646a);
                }
            }
        }

        /* compiled from: ListingsBannerItem.kt */
        /* loaded from: classes2.dex */
        public static final class b extends AdListener {

            /* renamed from: a */
            final /* synthetic */ ListingsBannerItemViewModel f30648a;

            b(ListingsBannerItemViewModel listingsBannerItemViewModel) {
                this.f30648a = listingsBannerItemViewModel;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError p02) {
                o.i(p02, "p0");
                super.onAdFailedToLoad(p02);
                this.f30648a.l(ListingsBannerItemViewModel.BANNERS_VIEWS.NONE);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                this.f30648a.l(ListingsBannerItemViewModel.BANNERS_VIEWS.BANNER);
            }
        }

        /* compiled from: ListingsBannerItem.kt */
        /* loaded from: classes2.dex */
        public static final class c extends AdListener {

            /* renamed from: a */
            final /* synthetic */ ListingsBannerItemViewModel f30649a;

            c(ListingsBannerItemViewModel listingsBannerItemViewModel) {
                this.f30649a = listingsBannerItemViewModel;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError p02) {
                o.i(p02, "p0");
                this.f30649a.l(ListingsBannerItemViewModel.BANNERS_VIEWS.PLACE_HOLDER);
                this.f30649a.f().postValue(Boolean.FALSE);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.yf r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f30643a = r3
                com.forsale.app.features.categories.listings.items.dfp.banner.ListingsBannerItem$ViewHolder$mpuBanner$2 r3 = new com.forsale.app.features.categories.listings.items.dfp.banner.ListingsBannerItem$ViewHolder$mpuBanner$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f30645c = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.dfp.banner.ListingsBannerItem.ViewHolder.<init>(aa.yf):void");
        }

        private final AdManagerAdView l() {
            return (AdManagerAdView) this.f30645c.getValue();
        }

        public final void m(ListingsBannerItem listingsBannerItem) {
            ListingsBannerItemViewModel listingsBannerItemViewModel = listingsBannerItem.f30640h;
            if (listingsBannerItemViewModel != null) {
                AdManagerAdView l11 = l();
                AdManagerAdRequest h11 = listingsBannerItemViewModel.h();
                o.f(l11);
                l11.loadAd(h11);
                l11.setAdListener(new b(listingsBannerItemViewModel));
                o.f(l11);
                this.f30644b = ViewsExtensionsKt.z(l11, listingsBannerItem.f30641i);
            }
        }

        public final void n(ListingsBannerItem listingsBannerItem) {
            Context context = this.f30643a.getRoot().getContext();
            ListingsBannerItemViewModel listingsBannerItemViewModel = listingsBannerItem.f30640h;
            AdLoader build = new AdLoader.Builder(context.getApplicationContext(), context.getResources().getString(y0.f70545l)).forCustomFormatAd(context.getString(y0.f70754xa), new tc.a(listingsBannerItemViewModel, this, listingsBannerItem), new tc.b(context)).withAdListener(new c(listingsBannerItemViewModel)).build();
            o.h(build, "build(...)");
            build.loadAd(listingsBannerItemViewModel.i());
        }

        public static final void o(ListingsBannerItemViewModel it2, ViewHolder this$0, ListingsBannerItem item, NativeCustomFormatAd ad2) {
            o.i(it2, "$it");
            o.i(this$0, "this$0");
            o.i(item, "$item");
            o.i(ad2, "ad");
            it2.k(ad2);
            this$0.f30644b = ViewsExtensionsKt.A(ad2, item.f30641i);
            it2.l(ListingsBannerItemViewModel.BANNERS_VIEWS.NATIVE_BANNER);
        }

        public static final void p(Context context, NativeCustomFormatAd ad2, String assetName) {
            o.i(ad2, "ad");
            o.i(assetName, "assetName");
            o.f(context);
            GamActionUtilsKt.b(context, GamActionUtilsKt.d(ad2), null, 2, null);
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void b(ListingsBannerItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            yf yfVar = this.f30643a;
            yfVar.h0(item.f30640h);
            yfVar.U(item.f30641i);
            item.f30640h.f().observe(item.f30641i, new a(item, this));
            yfVar.u();
        }

        @Override // kr.b.c
        /* renamed from: q */
        public void e(ListingsBannerItem item) {
            o.i(item, "item");
            r rVar = this.f30644b;
            if (rVar != null) {
                item.f30641i.getLifecycle().d(rVar);
            }
        }
    }

    /* compiled from: ListingsBannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsBannerItem(ListingsBannerItemViewModel viewModel, s lifecycleOwner) {
        super(viewModel, lifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f30640h = viewModel;
        this.f30641i = lifecycleOwner;
        this.f30642j = t0.H3;
    }

    @Override // pr.a
    public int t() {
        return this.f30642j;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        yf f02 = yf.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}

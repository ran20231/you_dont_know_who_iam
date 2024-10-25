package com.forsale.app.features.search.bannerItem;

import aa.sn;
import android.view.View;
import androidx.lifecycle.s;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.r0;
import t9.t0;
import wz.h;
import wz.p;
/* compiled from: SearchHomeBannerItem.kt */
/* loaded from: classes2.dex */
public final class SearchHomeBannerItem extends x9.a<ViewHolder, p, SearchHomeBannerItemViewModel> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f36961i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f36962j = 8;

    /* renamed from: k  reason: collision with root package name */
    private static final long f36963k = r0.L5;

    /* renamed from: g  reason: collision with root package name */
    private final SearchHomeBannerItemViewModel f36964g;

    /* renamed from: h  reason: collision with root package name */
    private final int f36965h;

    /* compiled from: SearchHomeBannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<SearchHomeBannerItem, sn> {

        /* renamed from: c  reason: collision with root package name */
        private final h f36966c;

        /* compiled from: SearchHomeBannerItem.kt */
        /* loaded from: classes2.dex */
        public static final class a extends AdListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SearchHomeBannerItemViewModel f36967a;

            a(SearchHomeBannerItemViewModel searchHomeBannerItemViewModel) {
                this.f36967a = searchHomeBannerItemViewModel;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                this.f36967a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final sn binding) {
            super(binding);
            h a11;
            o.i(binding, "binding");
            a11 = d.a(new g00.a<AdManagerAdView>() { // from class: com.forsale.app.features.search.bannerItem.SearchHomeBannerItem$ViewHolder$banner$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final AdManagerAdView invoke() {
                    return sn.this.Q;
                }
            });
            this.f36966c = a11;
        }

        private final AdManagerAdView j() {
            return (AdManagerAdView) this.f36966c.getValue();
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: i */
        public void b(SearchHomeBannerItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            sn f11 = f();
            f11.i0(item.f36964g);
            SearchHomeBannerItemViewModel h02 = f11.h0();
            if (h02 != null) {
                AdManagerAdView j11 = j();
                AdManagerAdRequest c11 = h02.c();
                o.f(j11);
                j11.loadAd(c11);
                h02.f();
                j11.setAdListener(new a(h02));
                o.f(j11);
                ViewsExtensionsKt.z(j11, g());
            }
            f11.u();
        }
    }

    /* compiled from: SearchHomeBannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHomeBannerItem(SearchHomeBannerItemViewModel viewModel, s hostLifecycleOwner) {
        super(viewModel, hostLifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(hostLifecycleOwner, "hostLifecycleOwner");
        this.f36964g = viewModel;
        this.f36965h = t0.H5;
    }

    @Override // pr.a
    public int t() {
        return this.f36965h;
    }

    @Override // pr.a
    /* renamed from: w */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        sn f02 = sn.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}

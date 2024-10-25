package com.forsale.app.features.banners;

import aa.eo;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.s;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
import com.forsale.app.utils.bindingadapters.ViewsBindingAdapters;
import com.forsale.app.utils.itemutils.ViewMargins;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.o;
import na.b;
import t9.r0;
import t9.t0;
import tv.teads.sdk.AdOpportunityTrackerView;
import tv.teads.sdk.AdPlacementSettings;
import tv.teads.sdk.AdRatio;
import tv.teads.sdk.AdRequestSettings;
import tv.teads.sdk.InReadAdListener;
import tv.teads.sdk.InReadAdPlacement;
import tv.teads.sdk.TeadsSDK;
import tv.teads.sdk.renderer.InReadAdView;
import wz.h;
import wz.p;
import x9.a;
/* compiled from: TeadsItem.kt */
/* loaded from: classes2.dex */
public final class TeadsItem extends a<ViewHolder, p, b> {

    /* renamed from: g  reason: collision with root package name */
    private final b f23245g;

    /* renamed from: h  reason: collision with root package name */
    private final int f23246h;

    /* renamed from: i  reason: collision with root package name */
    private final int f23247i;

    /* compiled from: TeadsItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<TeadsItem, eo> {

        /* renamed from: c  reason: collision with root package name */
        private final h f23248c;

        /* renamed from: d  reason: collision with root package name */
        private final AdPlacementSettings f23249d;

        /* renamed from: e  reason: collision with root package name */
        private final AdRequestSettings f23250e;

        /* renamed from: f  reason: collision with root package name */
        private final h f23251f;

        /* compiled from: TeadsItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements InReadAdListener {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ eo f23253b;

            a(eo eoVar) {
                this.f23253b = eoVar;
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void adOpportunityTrackerView(AdOpportunityTrackerView trackerView) {
                o.i(trackerView, "trackerView");
                ViewHolder.this.p().addView(trackerView);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdClicked() {
                InReadAdListener.DefaultImpls.onAdClicked(this);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdClosed() {
                InReadAdListener.DefaultImpls.onAdClosed(this);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdCollapsedFromFullscreen() {
                InReadAdListener.DefaultImpls.onAdCollapsedFromFullscreen(this);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdError(int i11, String description) {
                o.i(description, "description");
                ViewHolder.this.q(false);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdExpandedToFullscreen() {
                InReadAdListener.DefaultImpls.onAdExpandedToFullscreen(this);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdImpression() {
                InReadAdListener.DefaultImpls.onAdImpression(this);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdRatioUpdate(AdRatio adRatio) {
                o.i(adRatio, "adRatio");
                ViewGroup.LayoutParams layoutParams = ViewHolder.this.p().getLayoutParams();
                layoutParams.height = adRatio.calculateHeight(this.f23253b.O.getMeasuredWidth());
                ViewHolder.this.p().setLayoutParams(layoutParams);
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onAdReceived(InReadAdView inReadAdView, AdRatio adRatio) {
                o.i(inReadAdView, "inReadAdView");
                o.i(adRatio, "adRatio");
                ViewGroup.LayoutParams layoutParams = this.f23253b.O.getLayoutParams();
                ViewHolder.this.p().addView(inReadAdView);
                layoutParams.height = adRatio.calculateHeight(ViewHolder.this.p().getMeasuredWidth());
                ViewHolder.this.p().setLayoutParams(layoutParams);
                ViewHolder.this.q(true);
                ViewHolder.this.m();
            }

            @Override // tv.teads.sdk.InReadAdListener
            public void onFailToReceiveAd(String failReason) {
                o.i(failReason, "failReason");
                ViewHolder.this.q(false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(final eo binding, final b viewModel) {
            super(binding);
            h a11;
            h a12;
            o.i(binding, "binding");
            o.i(viewModel, "viewModel");
            a11 = d.a(new g00.a<FrameLayout>() { // from class: com.forsale.app.features.banners.TeadsItem$ViewHolder$adView$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final FrameLayout invoke() {
                    return eo.this.O;
                }
            });
            this.f23248c = a11;
            this.f23249d = new AdPlacementSettings.Builder().enableDebug().build();
            AdRequestSettings.Builder builder = new AdRequestSettings.Builder();
            String f11 = viewModel.f();
            if (f11 != null) {
                builder.pageSlotUrl(f11);
            }
            this.f23250e = builder.build();
            a12 = d.a(new g00.a<InReadAdPlacement>() { // from class: com.forsale.app.features.banners.TeadsItem$ViewHolder$adPlacement$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final InReadAdPlacement invoke() {
                    AdPlacementSettings adPlacementSettings;
                    TeadsSDK teadsSDK = TeadsSDK.INSTANCE;
                    Context context = eo.this.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    String string = eo.this.getRoot().getContext().getString(viewModel.e());
                    o.h(string, "getString(...)");
                    int parseInt = Integer.parseInt(string);
                    adPlacementSettings = this.f23249d;
                    return teadsSDK.createInReadPlacement(context, parseInt, adPlacementSettings);
                }
            });
            this.f23251f = a12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void m() {
            ViewMargins g11;
            Integer a11;
            ViewMargins g12;
            Integer d11;
            eo f11 = f();
            b h02 = f11.h0();
            if (h02 != null && (g12 = h02.g()) != null && (d11 = g12.d()) != null) {
                int intValue = d11.intValue();
                FrameLayout p11 = p();
                o.h(p11, "<get-adView>(...)");
                ViewsBindingAdapters.r(p11, p().getResources().getDimension(intValue));
            }
            b h03 = f11.h0();
            if (h03 != null && (g11 = h03.g()) != null && (a11 = g11.a()) != null) {
                int intValue2 = a11.intValue();
                FrameLayout p12 = p();
                o.h(p12, "<get-adView>(...)");
                ViewsBindingAdapters.m(p12, p().getResources().getDimension(intValue2));
            }
        }

        private final InReadAdPlacement o() {
            return (InReadAdPlacement) this.f23251f.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final FrameLayout p() {
            return (FrameLayout) this.f23248c.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void q(boolean z11) {
            int i11;
            FrameLayout p11 = p();
            o.h(p11, "<get-adView>(...)");
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            p11.setVisibility(i11);
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: n */
        public void b(TeadsItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            eo f11 = f();
            f11.U(g());
            f11.i0(item.w());
            o().requestAd(this.f23250e, new a(f11));
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: r */
        public void e(TeadsItem item) {
            o.i(item, "item");
            super.e(item);
            p().removeAllViews();
            q(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeadsItem(b viewModel, s lifeCycleOwner) {
        super(viewModel, lifeCycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        this.f23245g = viewModel;
        this.f23246h = r0.f70164z9;
        this.f23247i = t0.N5;
    }

    @Override // x9.a, kr.m
    public int getType() {
        return this.f23246h;
    }

    @Override // pr.a
    public int t() {
        return this.f23247i;
    }

    @Override // pr.a
    /* renamed from: v */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        eo f02 = eo.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f23245g);
    }

    public final b w() {
        return this.f23245g;
    }
}

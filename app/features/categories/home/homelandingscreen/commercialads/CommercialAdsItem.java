package com.forsale.app.features.categories.home.homelandingscreen.commercialads;

import aa.a5;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.utils.LifecycleAware$ViewHolder;
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
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kr.m;
import kr.n;
import m00.i;
import t9.r0;
import t9.t0;
import t9.y0;
import wz.p;
/* compiled from: CommercialAdsItem.kt */
/* loaded from: classes2.dex */
public final class CommercialAdsItem extends x9.a<ViewHolder, p, CommercialAdsViewModel> {

    /* renamed from: j  reason: collision with root package name */
    public static final a f24117j = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f24118k = 8;

    /* renamed from: l  reason: collision with root package name */
    private static final long f24119l = r0.f70092u2;

    /* renamed from: m  reason: collision with root package name */
    private static final int f24120m = 20;

    /* renamed from: g  reason: collision with root package name */
    private final CommercialAdsViewModel f24121g;

    /* renamed from: h  reason: collision with root package name */
    private final s f24122h;

    /* renamed from: i  reason: collision with root package name */
    private final int f24123i;

    /* compiled from: CommercialAdsItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends LifecycleAware$ViewHolder<CommercialAdsItem, a5> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialAdsItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements c0<List<? extends CommercialGamViewModel>> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ lr.c<x9.b<?>, m<?>> f24124a;

            a(lr.c<x9.b<?>, m<?>> cVar) {
                this.f24124a = cVar;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(List<CommercialGamViewModel> list) {
                if (!o.d(this.f24124a.v(), list)) {
                    if (list.isEmpty()) {
                        this.f24124a.q();
                        return;
                    }
                    lr.c<x9.b<?>, m<?>> cVar = this.f24124a;
                    o.f(list);
                    n.a.a(cVar, list, false, 2, null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialAdsItem.kt */
        /* loaded from: classes2.dex */
        public static final class b implements c0<CategoryEntity> {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ CommercialAdsItem f24126b;

            b(CommercialAdsItem commercialAdsItem) {
                this.f24126b = commercialAdsItem;
            }

            @Override // androidx.lifecycle.c0
            /* renamed from: a */
            public final void onChanged(CategoryEntity categoryEntity) {
                int i11;
                int id2 = categoryEntity.getId();
                int maxHomeTopBannersCount = categoryEntity.getMaxHomeTopBannersCount();
                x10.a.b("**********COMMERCIAL****** Category with id= " + id2 + " has " + maxHomeTopBannersCount + " banners", new Object[0]);
                if (categoryEntity.getMaxHomeTopBannersCount() <= 0) {
                    i11 = CommercialAdsItem.f24120m;
                } else {
                    i11 = categoryEntity.getMaxHomeTopBannersCount();
                }
                ViewHolder viewHolder = ViewHolder.this;
                CommercialAdsViewModel commercialAdsViewModel = this.f24126b.f24121g;
                Context context = ViewHolder.i(ViewHolder.this).getRoot().getContext();
                o.h(context, "getContext(...)");
                viewHolder.n(commercialAdsViewModel, context, i11, this.f24126b.f24122h);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialAdsItem.kt */
        /* loaded from: classes2.dex */
        public static final class c implements NativeCustomFormatAd.OnCustomFormatAdLoadedListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<NativeCustomFormatAd> f24135a;

            /* JADX WARN: Multi-variable type inference failed */
            c(CancellableContinuation<? super NativeCustomFormatAd> cancellableContinuation) {
                this.f24135a = cancellableContinuation;
            }

            @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener
            public final void onCustomFormatAdLoaded(NativeCustomFormatAd ad2) {
                o.i(ad2, "ad");
                if (this.f24135a.isActive()) {
                    this.f24135a.resumeWith(Result.b(ad2));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CommercialAdsItem.kt */
        /* loaded from: classes2.dex */
        public static final class d implements NativeCustomFormatAd.OnCustomClickListener {

            /* renamed from: a  reason: collision with root package name */
            public static final d f24136a = new d();

            d() {
            }

            @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener
            public final void onCustomClick(NativeCustomFormatAd ad2, String assetName) {
                o.i(ad2, "ad");
                o.i(assetName, "assetName");
            }
        }

        /* compiled from: CommercialAdsItem.kt */
        /* loaded from: classes2.dex */
        public static final class e extends AdListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ CancellableContinuation<NativeCustomFormatAd> f24137a;

            /* JADX WARN: Multi-variable type inference failed */
            e(CancellableContinuation<? super NativeCustomFormatAd> cancellableContinuation) {
                this.f24137a = cancellableContinuation;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError p02) {
                o.i(p02, "p0");
                if (this.f24137a.isActive()) {
                    this.f24137a.resumeWith(Result.b(null));
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(a5 binding) {
            super(binding);
            o.i(binding, "binding");
        }

        public static final /* synthetic */ a5 i(ViewHolder viewHolder) {
            return viewHolder.f();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object m(Context context, AdRequest adRequest, zz.a<? super NativeCustomFormatAd> aVar) {
            zz.a d11;
            Object f11;
            d11 = IntrinsicsKt__IntrinsicsJvmKt.d(aVar);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(d11, 1);
            cancellableContinuationImpl.initCancellability();
            AdLoader build = new AdLoader.Builder(context, context.getString(y0.f70478h)).forCustomFormatAd(context.getString(y0.f70754xa), new c(cancellableContinuationImpl), d.f24136a).withAdListener(new e(cancellableContinuationImpl)).build();
            o.h(build, "build(...)");
            build.loadAd(adRequest);
            Object result = cancellableContinuationImpl.getResult();
            f11 = kotlin.coroutines.intrinsics.b.f();
            if (result == f11) {
                f.c(aVar);
            }
            return result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void n(CommercialAdsViewModel commercialAdsViewModel, Context context, int i11, s sVar) {
            i t11;
            List a02;
            Job launch$default;
            boolean z11;
            commercialAdsViewModel.i(z.a.f40550a);
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
            x10.a.b("**********COMMERCIAL****** chunked indexes = " + a02, new Object[0]);
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new CommercialAdsItem$ViewHolder$loadCommercialBanners$1$1(a02, this, context, commercialAdsViewModel, arrayList, null), 3, null);
            ViewsExtensionsKt.C(launch$default, sVar);
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: l */
        public void b(CommercialAdsItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            super.b(item, payloads);
            lr.c<x9.b<?>, m<?>> invoke = CommercialAdAdapter.f24115a.invoke(g());
            kr.b i11 = kr.b.f61943t.i(invoke);
            a5 f11 = f();
            RecyclerView recyclerView = f().R;
            recyclerView.setLayoutManager(new LinearLayoutManager(f().getRoot().getContext(), 0, false));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(i11);
            f11.h0(item.f24121g);
            f11.U(g());
            CommercialAdsViewModel commercialAdsViewModel = item.f24121g;
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f24122h), null, null, new CommercialAdsItem$ViewHolder$bindView$1$2$1(commercialAdsViewModel, f11, null), 3, null);
            commercialAdsViewModel.c().observe(g(), new a(invoke));
            Transformations.a(commercialAdsViewModel.b()).observe(g(), new b(item));
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f24122h), null, null, new CommercialAdsItem$ViewHolder$bindView$1$2$4(commercialAdsViewModel, this, null), 3, null);
        }

        @Override // com.forsale.app.utils.LifecycleAware$ViewHolder, kr.b.c
        /* renamed from: o */
        public void e(CommercialAdsItem item) {
            o.i(item, "item");
            super.e(item);
            CommercialAdsViewModel commercialAdsViewModel = item.f24121g;
            commercialAdsViewModel.d().j();
            commercialAdsViewModel.e().j();
            commercialAdsViewModel.c().removeObservers(g());
            commercialAdsViewModel.b().removeObservers(g());
            f().R.setAdapter(null);
        }
    }

    /* compiled from: CommercialAdsItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialAdsItem(CommercialAdsViewModel viewModel, s lo2) {
        super(viewModel, lo2);
        o.i(viewModel, "viewModel");
        o.i(lo2, "lo");
        this.f24121g = viewModel;
        this.f24122h = lo2;
        this.f24123i = t0.F0;
        o(f24119l);
    }

    @Override // pr.a
    public int t() {
        return this.f24123i;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        a5 f02 = a5.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}

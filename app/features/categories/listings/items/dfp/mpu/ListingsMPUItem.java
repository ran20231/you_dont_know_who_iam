package com.forsale.app.features.categories.listings.items.dfp.mpu;

import aa.cg;
import android.view.View;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import wz.h;
import wz.p;
/* compiled from: ListingsMPUItem.kt */
/* loaded from: classes2.dex */
public final class ListingsMPUItem extends qc.a<ViewHolder, p, uc.a> {

    /* renamed from: k  reason: collision with root package name */
    public static final a f30688k = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f30689l = 8;

    /* renamed from: m  reason: collision with root package name */
    private static final long f30690m = r0.L5;

    /* renamed from: h  reason: collision with root package name */
    private final uc.a f30691h;

    /* renamed from: i  reason: collision with root package name */
    private final s f30692i;

    /* renamed from: j  reason: collision with root package name */
    private final int f30693j;

    /* compiled from: ListingsMPUItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<ListingsMPUItem> {

        /* renamed from: a  reason: collision with root package name */
        private final cg f30694a;

        /* renamed from: b  reason: collision with root package name */
        private r f30695b;

        /* renamed from: c  reason: collision with root package name */
        private final h f30696c;

        /* renamed from: d  reason: collision with root package name */
        private final h f30697d;

        /* compiled from: ListingsMPUItem.kt */
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f30698a;

            static {
                int[] iArr = new int[MpuTypes.values().length];
                try {
                    iArr[MpuTypes.LISTINGS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MpuTypes.SEARCH.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f30698a = iArr;
            }
        }

        /* compiled from: ListingsMPUItem.kt */
        /* loaded from: classes2.dex */
        public static final class b extends AdListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ uc.a f30699a;

            b(uc.a aVar) {
                this.f30699a = aVar;
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                super.onAdLoaded();
                this.f30699a.i();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.cg r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f30694a = r3
                com.forsale.app.features.categories.listings.items.dfp.mpu.ListingsMPUItem$ViewHolder$mpuBannerListing$2 r3 = new com.forsale.app.features.categories.listings.items.dfp.mpu.ListingsMPUItem$ViewHolder$mpuBannerListing$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f30696c = r3
                com.forsale.app.features.categories.listings.items.dfp.mpu.ListingsMPUItem$ViewHolder$mpuBannerSearch$2 r3 = new com.forsale.app.features.categories.listings.items.dfp.mpu.ListingsMPUItem$ViewHolder$mpuBannerSearch$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f30697d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.dfp.mpu.ListingsMPUItem.ViewHolder.<init>(aa.cg):void");
        }

        private final AdManagerAdView h(MpuTypes mpuTypes) {
            AdManagerAdView i11;
            int i12 = a.f30698a[mpuTypes.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    i11 = i();
                } else {
                    i11 = j();
                }
            } else {
                i11 = i();
            }
            o.f(i11);
            return i11;
        }

        private final AdManagerAdView i() {
            return (AdManagerAdView) this.f30696c.getValue();
        }

        private final AdManagerAdView j() {
            return (AdManagerAdView) this.f30697d.getValue();
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(ListingsMPUItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            cg cgVar = this.f30694a;
            cgVar.i0(item.f30691h);
            cgVar.U(item.f30692i);
            uc.a h02 = cgVar.h0();
            if (h02 != null) {
                AdManagerAdView h11 = h(item.f30691h.e());
                h11.loadAd(h02.h());
                h02.k();
                h11.setAdListener(new b(h02));
                this.f30695b = ViewsExtensionsKt.z(h11, item.f30692i);
            }
            cgVar.u();
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void e(ListingsMPUItem item) {
            o.i(item, "item");
            r rVar = this.f30695b;
            if (rVar != null) {
                item.f30692i.getLifecycle().d(rVar);
            }
        }
    }

    /* compiled from: ListingsMPUItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsMPUItem(uc.a viewModel, s lifecycleOwner) {
        super(viewModel, lifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f30691h = viewModel;
        this.f30692i = lifecycleOwner;
        this.f30693j = t0.J3;
    }

    @Override // pr.a
    public int t() {
        return this.f30693j;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        cg f02 = cg.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}

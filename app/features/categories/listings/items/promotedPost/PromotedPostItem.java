package com.forsale.app.features.categories.listings.items.promotedPost;

import aa.ch;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.s;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.AnalyticsDetailsSource;
import com.forsale.app.utils.bindingadapters.ViewsBindingAdapters;
import com.google.android.gms.ads.AdRequest;
import g00.r;
import i3.b;
import i3.d;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kr.b;
import okhttp3.internal.http2.Http2;
import t9.r0;
import t9.t0;
import wz.h;
import wz.p;
/* compiled from: PromotedPostItem.kt */
/* loaded from: classes2.dex */
public final class PromotedPostItem extends qc.a<ViewHolder, p, PromotedPostItemViewModel> {

    /* renamed from: k */
    public static final a f30847k = new a(null);

    /* renamed from: l */
    public static final int f30848l = 8;

    /* renamed from: m */
    private static final long f30849m = r0.J6;

    /* renamed from: h */
    private final PromotedPostItemViewModel f30850h;

    /* renamed from: i */
    private final s f30851i;

    /* renamed from: j */
    private final int f30852j;

    /* compiled from: PromotedPostItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<PromotedPostItem> {

        /* renamed from: a */
        private final ch f30853a;

        /* renamed from: b */
        private Job f30854b;

        /* renamed from: c */
        private d f30855c;

        /* renamed from: d */
        private final r<i3.b<?>, Boolean, Float, Float, p> f30856d;

        /* renamed from: e */
        private final h f30857e;

        /* compiled from: PromotedPostItem.kt */
        /* loaded from: classes2.dex */
        public static final class a implements FlowCollector<Integer> {

            /* renamed from: a */
            final /* synthetic */ ch f30858a;

            a(ch chVar) {
                this.f30858a = chVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(Integer num, zz.a<? super p> aVar) {
                Context context;
                if (num != null && (context = this.f30858a.getRoot().getContext()) != null) {
                    ListingDetailsActivity.R.a(context, (r33 & 1) != 0 ? null : null, (r33 & 2) != 0 ? null : null, (r33 & 4) != 0 ? -1 : num.intValue(), (r33 & 8) != 0 ? null : null, (r33 & 16) != 0 ? ListingsTypes.NORMAL_LISTINGS : null, (r33 & 32) != 0 ? null : AnalyticsDetailsSource.PROMOTED_LISTING.getValue(), (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : null, (r33 & 256) != 0 ? null : null, (r33 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : null, (r33 & 1024) != 0 ? false : false, (r33 & RecyclerView.l.FLAG_MOVED) == 0 ? 0 : -1, (r33 & RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : null, (r33 & 8192) == 0 ? null : null, (r33 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? kotlin.collections.r.n() : null);
                }
                return p.f75480a;
            }
        }

        /* compiled from: PromotedPostItem.kt */
        /* loaded from: classes2.dex */
        public static final class b implements FlowCollector<p> {
            b() {
                ViewHolder.this = r1;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                ViewHolder.this.s();
                return p.f75480a;
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.ch r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f30853a = r3
                r2.x()
                com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$endListener$1 r3 = new com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$endListener$1
                r3.<init>()
                r2.f30856d = r3
                com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$alphaAnimation$2 r3 = new com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem$ViewHolder$alphaAnimation$2
                r3.<init>(r2)
                wz.h r3 = kotlin.c.a(r3)
                r2.f30857e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.items.promotedPost.PromotedPostItem.ViewHolder.<init>(aa.ch):void");
        }

        public static final void A(r tmp0, i3.b bVar, boolean z11, float f11, float f12) {
            o.i(tmp0, "$tmp0");
            tmp0.d(bVar, Boolean.valueOf(z11), Float.valueOf(f11), Float.valueOf(f12));
        }

        public final void p() {
            PromotedPostItemViewModel h02 = this.f30853a.h0();
            if (h02 != null) {
                if (h02.N()) {
                    h02.K();
                    x10.a.b("PROMOTED: afterAnimation canceled", new Object[0]);
                    return;
                }
                y();
            }
        }

        private final void q() {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getMain(), null, new PromotedPostItem$ViewHolder$animatePromotedPost$1(this, null), 2, null);
        }

        public final void s() {
            x10.a.b("PROMOTED: timer.cancel()", new Object[0]);
            Job job = this.f30854b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.f30854b = null;
        }

        public final p t() {
            PromotedPostItemViewModel h02 = this.f30853a.h0();
            if (h02 != null) {
                h02.u();
                return p.f75480a;
            }
            return null;
        }

        public final d u() {
            ViewsBindingAdapters viewsBindingAdapters = ViewsBindingAdapters.f40083a;
            CardView promotedLayout = this.f30853a.Q;
            o.h(promotedLayout, "promotedLayout");
            b.r X = i3.b.f57947u;
            o.h(X, "X");
            d u11 = ViewsBindingAdapters.u(viewsBindingAdapters, promotedLayout, X, this.f30853a.Q.getX(), 0.0f, 0.0f, 0.0f, 28, null);
            u11.b(new dd.a(this.f30856d));
            return u11;
        }

        public static final void v(r tmp0, i3.b bVar, boolean z11, float f11, float f12) {
            o.i(tmp0, "$tmp0");
            tmp0.d(bVar, Boolean.valueOf(z11), Float.valueOf(f11), Float.valueOf(f12));
        }

        public final ValueAnimator w() {
            return (ValueAnimator) this.f30857e.getValue();
        }

        private final void x() {
            Job launch$default;
            launch$default = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, CoroutineStart.LAZY, new PromotedPostItem$ViewHolder$runJob$1(this, null), 1, null);
            this.f30854b = launch$default;
        }

        private final void y() {
            Boolean bool;
            Job job = this.f30854b;
            if (job != null) {
                bool = Boolean.valueOf(job.isActive());
            } else {
                bool = null;
            }
            x10.a.b("PROMOTED: job.isActive " + bool, new Object[0]);
            x();
            Job job2 = this.f30854b;
            if (job2 != null) {
                job2.start();
            }
            x10.a.b("PROMOTED: afterAnimation job.start()", new Object[0]);
        }

        @Override // kr.b.c
        /* renamed from: r */
        public void b(PromotedPostItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            ch chVar = this.f30853a;
            chVar.i0(item.z());
            chVar.U(item.x());
            PromotedPostItemViewModel h02 = chVar.h0();
            if (h02 != null) {
                h02.D().h(item.x(), new a(chVar));
                h02.C().h(item.x(), new b());
            }
            q();
            chVar.u();
        }

        @Override // kr.b.c
        /* renamed from: z */
        public void e(PromotedPostItem item) {
            o.i(item, "item");
            d dVar = this.f30855c;
            if (dVar == null) {
                o.w("springAnimation");
                dVar = null;
            }
            dVar.g(new dd.b(this.f30856d));
            w().removeAllUpdateListeners();
            s();
        }
    }

    /* compiled from: PromotedPostItem.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return PromotedPostItem.f30849m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedPostItem(PromotedPostItemViewModel viewModel, s lifecycleOwner) {
        super(viewModel, lifecycleOwner);
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f30850h = viewModel;
        this.f30851i = lifecycleOwner;
        this.f30852j = t0.Z3;
    }

    @Override // pr.a
    public int t() {
        return this.f30852j;
    }

    public final s x() {
        return this.f30851i;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        ch f02 = ch.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }

    public final PromotedPostItemViewModel z() {
        return this.f30850h;
    }
}

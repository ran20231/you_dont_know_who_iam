package com.forsale.app.features.banners;

import aa.c1;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
/* compiled from: BannerItem.kt */
/* loaded from: classes2.dex */
public final class BannerItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final na.a f23202f;

    /* renamed from: g  reason: collision with root package name */
    private final s f23203g;

    /* renamed from: h  reason: collision with root package name */
    private final ApplicationResourcesRepository f23204h;

    /* renamed from: i  reason: collision with root package name */
    private final int f23205i;

    /* renamed from: j  reason: collision with root package name */
    private final int f23206j;

    /* compiled from: BannerItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<BannerItem> {

        /* renamed from: a  reason: collision with root package name */
        private final c1 f23207a;

        /* renamed from: b  reason: collision with root package name */
        private final s f23208b;

        /* renamed from: c  reason: collision with root package name */
        private final ApplicationResourcesRepository f23209c;

        /* renamed from: d  reason: collision with root package name */
        private final float f23210d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.c1 r3, androidx.lifecycle.s r4, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository r5) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "lifeCycleOwner"
                kotlin.jvm.internal.o.i(r4, r0)
                java.lang.String r0 = "resourcesRepository"
                kotlin.jvm.internal.o.i(r5, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f23207a = r3
                r2.f23208b = r4
                r2.f23209c = r5
                android.view.View r3 = r3.getRoot()
                android.content.Context r3 = r3.getContext()
                android.content.res.Resources r3 = r3.getResources()
                android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
                float r3 = r3.density
                r2.f23210d = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.banners.BannerItem.ViewHolder.<init>(aa.c1, androidx.lifecycle.s, com.forsale.app.datalayer.repositories.ApplicationResourcesRepository):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void i(int i11, Integer num, Integer num2) {
            ViewGroup.LayoutParams layoutParams = this.f23207a.O.getLayoutParams();
            o.g(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
            ((ViewGroup.MarginLayoutParams) bVar).height = (int) ((i11 * this.f23210d) + 0.5f);
            if (num != null) {
                ((ViewGroup.MarginLayoutParams) bVar).topMargin = (int) ((num.intValue() * this.f23210d) + 0.5f);
            }
            if (num2 != null) {
                ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = (int) ((num2.intValue() * this.f23210d) + 0.5f);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static /* synthetic */ void j(ViewHolder viewHolder, int i11, Integer num, Integer num2, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                num = null;
            }
            if ((i12 & 4) != 0) {
                num2 = null;
            }
            viewHolder.i(i11, num, num2);
        }

        @Override // kr.b.c
        /* renamed from: k */
        public void b(BannerItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            item.w().k();
            c1 c1Var = this.f23207a;
            BuildersKt__Builders_commonKt.launch$default(t.a(this.f23208b), null, null, new BannerItem$ViewHolder$bindView$1$1(this, item, c1Var, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(this.f23208b), null, null, new BannerItem$ViewHolder$bindView$1$2(item, c1Var, this, null), 3, null);
            c1Var.u();
        }

        @Override // kr.b.c
        /* renamed from: l */
        public void e(BannerItem item) {
            o.i(item, "item");
            item.w().i().j();
            item.w().e().j();
            item.w().d().j();
            item.w().g().j();
            item.w().h().j();
        }
    }

    public BannerItem(na.a viewModel, s lifeCycleOwner, ApplicationResourcesRepository resourcesRepository) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        o.i(resourcesRepository, "resourcesRepository");
        this.f23202f = viewModel;
        this.f23203g = lifeCycleOwner;
        this.f23204h = resourcesRepository;
        this.f23205i = r0.f69831a1;
        this.f23206j = t0.E;
    }

    @Override // kr.m
    public int getType() {
        return this.f23205i;
    }

    @Override // pr.a
    public int t() {
        return this.f23206j;
    }

    @Override // pr.a
    /* renamed from: v */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        c1 f02 = c1.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f23203g, this.f23204h);
    }

    public final na.a w() {
        return this.f23202f;
    }
}

package com.forsale.app.features.postad.addons.featured;

import aa.wd;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
/* compiled from: FeaturedAddonItem.kt */
/* loaded from: classes2.dex */
public final class FeaturedAddonItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final s f34682f;

    /* renamed from: g  reason: collision with root package name */
    private final FeaturedAddonItemViewModel f34683g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f34684h;

    /* renamed from: i  reason: collision with root package name */
    private final int f34685i;

    /* renamed from: j  reason: collision with root package name */
    private final int f34686j;

    /* compiled from: FeaturedAddonItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<FeaturedAddonItem> {

        /* renamed from: a  reason: collision with root package name */
        private final wd f34687a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.wd r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f34687a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.featured.FeaturedAddonItem.ViewHolder.<init>(aa.wd):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(FeaturedAddonItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f34687a.U(item.f34682f);
            this.f34687a.h0(item.f34683g);
            this.f34687a.u();
            FeaturedAddonItemViewModel featuredAddonItemViewModel = item.f34683g;
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f34682f), null, null, new FeaturedAddonItem$ViewHolder$bindView$1$1(item, featuredAddonItemViewModel, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f34682f), null, null, new FeaturedAddonItem$ViewHolder$bindView$1$2(item, featuredAddonItemViewModel, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(FeaturedAddonItem item) {
            o.i(item, "item");
            FeaturedAddonItemViewModel unused = item.f34683g;
        }
    }

    public FeaturedAddonItem(s lifecycleOwner, FeaturedAddonItemViewModel viewModel, FragmentManager fragmentManager) {
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(viewModel, "viewModel");
        o.i(fragmentManager, "fragmentManager");
        this.f34682f = lifecycleOwner;
        this.f34683g = viewModel;
        this.f34684h = fragmentManager;
        this.f34685i = t0.f70193d3;
        this.f34686j = r0.f69833a3;
    }

    @Override // kr.m
    public int getType() {
        return this.f34686j;
    }

    @Override // pr.a
    public int t() {
        return this.f34685i;
    }

    @Override // pr.a
    /* renamed from: y */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        wd f02 = wd.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}

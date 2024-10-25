package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad;

import aa.mi;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.forsale.app.utils.LifeCycleUtilsKt;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
/* compiled from: BoostYourAdItem.kt */
/* loaded from: classes2.dex */
public final class BoostYourAdItem extends a<BoostYourAdViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final BoostYourAdViewModel f27733f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f27734g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27735h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27736i;

    /* compiled from: BoostYourAdItem.kt */
    /* loaded from: classes2.dex */
    public static final class BoostYourAdViewHolder extends b.c<BoostYourAdItem> {

        /* renamed from: a  reason: collision with root package name */
        private final mi f27737a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public BoostYourAdViewHolder(aa.mi r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27737a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.boostyourad.BoostYourAdItem.BoostYourAdViewHolder.<init>(aa.mi):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(BoostYourAdItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            mi miVar = this.f27737a;
            miVar.h0(item.f27733f);
            miVar.U(item.f27734g.getViewLifecycleOwner());
            LifeCycleUtilsKt.b(item.f27734g, new BoostYourAdItem$BoostYourAdViewHolder$bindView$2(item, null));
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(BoostYourAdItem item) {
            o.i(item, "item");
        }
    }

    public BoostYourAdItem(BoostYourAdViewModel boostYourAdViewModel, Fragment fragment) {
        o.i(boostYourAdViewModel, "boostYourAdViewModel");
        o.i(fragment, "fragment");
        this.f27733f = boostYourAdViewModel;
        this.f27734g = fragment;
        this.f27735h = t0.f70292r4;
        this.f27736i = r0.f69954j7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27736i;
    }

    @Override // pr.a
    public int t() {
        return this.f27735h;
    }

    @Override // pr.a
    /* renamed from: x */
    public BoostYourAdViewHolder u(View v11) {
        o.i(v11, "v");
        mi f02 = mi.f0(v11);
        o.h(f02, "bind(...)");
        return new BoostYourAdViewHolder(f02);
    }
}

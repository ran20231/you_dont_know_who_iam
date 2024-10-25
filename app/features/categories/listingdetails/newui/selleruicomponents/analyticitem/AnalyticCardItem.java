package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import aa.mh;
import android.view.View;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
/* compiled from: AnalyticCardItem.kt */
/* loaded from: classes2.dex */
public final class AnalyticCardItem extends a<AnalyticViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AnalyticCardViewModel f27652f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27653g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27654h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27655i;

    /* compiled from: AnalyticCardItem.kt */
    /* loaded from: classes2.dex */
    public static final class AnalyticViewHolder extends b.c<AnalyticCardItem> {

        /* renamed from: a  reason: collision with root package name */
        private final mh f27656a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AnalyticViewHolder(aa.mh r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27656a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem.AnalyticCardItem.AnalyticViewHolder.<init>(aa.mh):void");
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AnalyticCardItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            mh mhVar = this.f27656a;
            mhVar.U(item.f27653g);
            mhVar.h0(item.f27652f);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27653g), null, null, new AnalyticCardItem$AnalyticViewHolder$bindView$2(item, this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27653g), null, null, new AnalyticCardItem$AnalyticViewHolder$bindView$3(item, this, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(t.a(item.f27653g), null, null, new AnalyticCardItem$AnalyticViewHolder$bindView$4(item, this, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void e(AnalyticCardItem item) {
            o.i(item, "item");
        }
    }

    public AnalyticCardItem(AnalyticCardViewModel analyticCardViewModel, s lifeCycleOwner) {
        o.i(analyticCardViewModel, "analyticCardViewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        this.f27652f = analyticCardViewModel;
        this.f27653g = lifeCycleOwner;
        this.f27654h = t0.f70201e4;
        this.f27655i = r0.f69850b7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27655i;
    }

    @Override // pr.a
    public int t() {
        return this.f27654h;
    }

    @Override // pr.a
    /* renamed from: x */
    public AnalyticViewHolder u(View v11) {
        o.i(v11, "v");
        mh f02 = mh.f0(v11);
        o.h(f02, "bind(...)");
        return new AnalyticViewHolder(f02);
    }
}

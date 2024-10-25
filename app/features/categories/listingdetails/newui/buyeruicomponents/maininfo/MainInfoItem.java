package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo;

import aa.gk;
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
/* compiled from: MainInfoItem.kt */
/* loaded from: classes2.dex */
public final class MainInfoItem extends a<MainInfoViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final MainInfoItemViewModel f27537f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27538g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f27539h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27540i;

    /* renamed from: j  reason: collision with root package name */
    private final int f27541j;

    /* compiled from: MainInfoItem.kt */
    /* loaded from: classes2.dex */
    public static final class MainInfoViewHolder extends b.c<MainInfoItem> {

        /* renamed from: a  reason: collision with root package name */
        private final gk f27542a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public MainInfoViewHolder(aa.gk r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27542a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.maininfo.MainInfoItem.MainInfoViewHolder.<init>(aa.gk):void");
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(MainInfoItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            gk gkVar = this.f27542a;
            gkVar.U(item.w());
            gkVar.h0(item.y());
            BuildersKt__Builders_commonKt.launch$default(t.a(item.w()), null, null, new MainInfoItem$MainInfoViewHolder$bindView$1$1(item, this, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: h */
        public void e(MainInfoItem item) {
            o.i(item, "item");
            item.y().h().j();
        }
    }

    public MainInfoItem(MainInfoItemViewModel viewModel, s lifeCycle, FragmentManager fragmentManager) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycle, "lifeCycle");
        o.i(fragmentManager, "fragmentManager");
        this.f27537f = viewModel;
        this.f27538g = lifeCycle;
        this.f27539h = fragmentManager;
        this.f27540i = t0.O4;
        this.f27541j = r0.A7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27541j;
    }

    @Override // pr.a
    public int t() {
        return this.f27540i;
    }

    public final FragmentManager v() {
        return this.f27539h;
    }

    public final s w() {
        return this.f27538g;
    }

    @Override // pr.a
    /* renamed from: x */
    public MainInfoViewHolder u(View v11) {
        o.i(v11, "v");
        gk f02 = gk.f0(v11);
        o.h(f02, "bind(...)");
        return new MainInfoViewHolder(f02);
    }

    public final MainInfoItemViewModel y() {
        return this.f27537f;
    }
}

package com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost;

import aa.ml;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import g00.l;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import wz.p;
/* compiled from: SellerSettingAutoRepostItem.kt */
/* loaded from: classes3.dex */
public final class SellerSettingAutoRepostItem extends a<AutoRepostViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final ah.a f38882f;

    /* renamed from: g  reason: collision with root package name */
    private final s f38883g;

    /* renamed from: h  reason: collision with root package name */
    private final FragmentManager f38884h;

    /* renamed from: i  reason: collision with root package name */
    private final l<Boolean, p> f38885i;

    /* renamed from: j  reason: collision with root package name */
    private final int f38886j;

    /* renamed from: k  reason: collision with root package name */
    private final int f38887k;

    /* compiled from: SellerSettingAutoRepostItem.kt */
    /* loaded from: classes3.dex */
    public static final class AutoRepostViewHolder extends b.c<SellerSettingAutoRepostItem> {

        /* renamed from: a  reason: collision with root package name */
        private final ml f38888a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public AutoRepostViewHolder(aa.ml r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f38888a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailssellersettings.autorepost.SellerSettingAutoRepostItem.AutoRepostViewHolder.<init>(aa.ml):void");
        }

        @Override // kr.b.c
        /* renamed from: f */
        public void b(SellerSettingAutoRepostItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            ml mlVar = this.f38888a;
            mlVar.U(item.w());
            mlVar.h0(item.z());
            BuildersKt__Builders_commonKt.launch$default(t.a(item.w()), null, null, new SellerSettingAutoRepostItem$AutoRepostViewHolder$bindView$1$1(item, null), 3, null);
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void e(SellerSettingAutoRepostItem item) {
            o.i(item, "item");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SellerSettingAutoRepostItem(ah.a viewModel, s lifecycleOwner, FragmentManager fragmentManager, l<? super Boolean, p> onActionDone) {
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(fragmentManager, "fragmentManager");
        o.i(onActionDone, "onActionDone");
        this.f38882f = viewModel;
        this.f38883g = lifecycleOwner;
        this.f38884h = fragmentManager;
        this.f38885i = onActionDone;
        this.f38886j = t0.f70202e5;
        this.f38887k = r0.L7;
    }

    @Override // kr.m
    public int getType() {
        return this.f38887k;
    }

    @Override // pr.a
    public int t() {
        return this.f38886j;
    }

    public final FragmentManager v() {
        return this.f38884h;
    }

    public final s w() {
        return this.f38883g;
    }

    public final l<Boolean, p> x() {
        return this.f38885i;
    }

    @Override // pr.a
    /* renamed from: y */
    public AutoRepostViewHolder u(View v11) {
        o.i(v11, "v");
        ml f02 = ml.f0(v11);
        o.h(f02, "bind(...)");
        return new AutoRepostViewHolder(f02);
    }

    public final ah.a z() {
        return this.f38882f;
    }
}

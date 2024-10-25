package com.forsale.app.features.more.buymoretoken.paymentoption;

import aa.wg;
import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import z3.x;
/* compiled from: PaymentOptionItem.kt */
/* loaded from: classes2.dex */
public final class a extends pr.a<C0350a> {

    /* renamed from: f */
    private final rd.c f31833f;

    /* renamed from: g */
    private final boolean f31834g;

    /* renamed from: h */
    private final String f31835h;

    /* renamed from: i */
    private final int f31836i;

    /* renamed from: j */
    private final int f31837j;

    /* compiled from: PaymentOptionItem.kt */
    /* renamed from: com.forsale.app.features.more.buymoretoken.paymentoption.a$a */
    /* loaded from: classes2.dex */
    public static final class C0350a extends b.c<a> {

        /* renamed from: a */
        private final wg f31838a;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0350a(aa.wg r3) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f31838a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.buymoretoken.paymentoption.a.C0350a.<init>(aa.wg):void");
        }

        public static final void h(a item, View view) {
            o.i(item, "$item");
            o.f(view);
            x.a(view).d0(b.f31839a.a(item.y().a(), item.v(), item.w()));
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(a item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            wg wgVar = this.f31838a;
            wgVar.h0(item.y());
            wgVar.u();
            this.f31838a.getRoot().setOnClickListener(new rd.b(item));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(a item) {
            o.i(item, "item");
        }
    }

    public a(rd.c viewModel, boolean z11, String str) {
        o.i(viewModel, "viewModel");
        this.f31833f = viewModel;
        this.f31834g = z11;
        this.f31835h = str;
        this.f31836i = r0.C7;
        this.f31837j = t0.W3;
    }

    @Override // kr.m
    public int getType() {
        return this.f31836i;
    }

    @Override // pr.a
    public int t() {
        return this.f31837j;
    }

    public final boolean v() {
        return this.f31834g;
    }

    public final String w() {
        return this.f31835h;
    }

    @Override // pr.a
    /* renamed from: x */
    public C0350a u(View v11) {
        o.i(v11, "v");
        wg f02 = wg.f0(v11);
        o.h(f02, "bind(...)");
        return new C0350a(f02);
    }

    public final rd.c y() {
        return this.f31833f;
    }
}

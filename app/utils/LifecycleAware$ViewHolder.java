package com.forsale.app.utils;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kr.b;
import kr.m;
/* compiled from: LifecycleAware.kt */
/* loaded from: classes3.dex */
public class LifecycleAware$ViewHolder<item extends kr.m<? extends RecyclerView.d0>, B extends ViewDataBinding> extends b.c<item> {

    /* renamed from: a  reason: collision with root package name */
    private final B f39583a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.s f39584b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LifecycleAware$ViewHolder(B r3) {
        /*
            r2 = this;
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.o.i(r3, r0)
            android.view.View r0 = r3.getRoot()
            java.lang.String r1 = "getRoot(...)"
            kotlin.jvm.internal.o.h(r0, r1)
            r2.<init>(r0)
            r2.f39583a = r3
            com.forsale.app.utils.LifecycleAware$ViewHolder$bindingLifecycleOwner$1 r3 = new com.forsale.app.utils.LifecycleAware$ViewHolder$bindingLifecycleOwner$1
            r3.<init>()
            r2.f39584b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.LifecycleAware$ViewHolder.<init>(androidx.databinding.ViewDataBinding):void");
    }

    private final void h(androidx.lifecycle.s sVar, Lifecycle.Event event) {
        Lifecycle lifecycle = sVar.getLifecycle();
        kotlin.jvm.internal.o.g(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
        ((androidx.lifecycle.u) lifecycle).i(event);
    }

    @Override // kr.b.c
    public void b(item item, List<? extends Object> payloads) {
        kotlin.jvm.internal.o.i(item, "item");
        kotlin.jvm.internal.o.i(payloads, "payloads");
        androidx.lifecycle.s sVar = this.f39584b;
        h(sVar, Lifecycle.Event.ON_START);
        h(sVar, Lifecycle.Event.ON_RESUME);
        if (this.f39583a.B() == null) {
            this.f39583a.U(this.f39584b);
            this.f39583a.u();
        }
    }

    @Override // kr.b.c
    public void e(item item) {
        kotlin.jvm.internal.o.i(item, "item");
        androidx.lifecycle.s sVar = this.f39584b;
        h(sVar, Lifecycle.Event.ON_PAUSE);
        h(sVar, Lifecycle.Event.ON_STOP);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final B f() {
        return this.f39583a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final androidx.lifecycle.s g() {
        return this.f39584b;
    }
}

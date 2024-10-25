package com.forsale.app.ui.passwordmetter;

import aa.gf;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
import androidx.lifecycle.t;
import j00.d;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import n00.k;
import wz.h;
import xh.a;
/* compiled from: PasswordMeter.kt */
/* loaded from: classes3.dex */
public final class PasswordMeter extends FrameLayout implements r {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f39432d = {s.e(new MutablePropertyReference1Impl(PasswordMeter.class, "lifecycleOwner", "getLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;", 0))};

    /* renamed from: e  reason: collision with root package name */
    public static final int f39433e = 8;

    /* renamed from: a  reason: collision with root package name */
    private final h f39434a;

    /* renamed from: b  reason: collision with root package name */
    private final h f39435b;

    /* renamed from: c  reason: collision with root package name */
    private final d f39436c;

    public final void a(androidx.lifecycle.s sVar) {
        o.i(sVar, "<this>");
        sVar.getLifecycle().a(this);
        a viewModel = getViewModel();
        BuildersKt__Builders_commonKt.launch$default(t.a(sVar), null, null, new PasswordMeter$registerObservers$1$1(sVar, viewModel, this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(t.a(sVar), null, null, new PasswordMeter$registerObservers$1$2(sVar, viewModel, this, null), 3, null);
    }

    public final gf getBinding() {
        return (gf) this.f39435b.getValue();
    }

    public final androidx.lifecycle.s getLifecycleOwner() {
        return (androidx.lifecycle.s) this.f39436c.getValue(this, f39432d[0]);
    }

    public final a getViewModel() {
        return (a) this.f39434a.getValue();
    }

    @d0(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        androidx.lifecycle.s lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            a(lifecycleOwner);
        }
    }

    @d0(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        getViewModel().k();
    }

    public final void setLifecycleOwner(androidx.lifecycle.s sVar) {
        this.f39436c.setValue(this, f39432d[0], sVar);
    }
}

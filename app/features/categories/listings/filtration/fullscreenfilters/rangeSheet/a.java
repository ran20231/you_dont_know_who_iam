package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
import mx.c;
/* compiled from: Hilt_RangeFilterBottomSheet.java */
/* loaded from: classes2.dex */
public abstract class a extends d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f29943b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29944c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f29945d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f29946e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f29947f = false;

    private void s() {
        if (this.f29943b == null) {
            this.f29943b = g.b(super.getContext(), this);
            this.f29944c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f29944c) {
            return null;
        }
        s();
        return this.f29943b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        s();
        t();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    public final g q() {
        if (this.f29945d == null) {
            synchronized (this.f29946e) {
                if (this.f29945d == null) {
                    this.f29945d = r();
                }
            }
        }
        return this.f29945d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f29947f) {
            this.f29947f = true;
            ((lc.a) F()).g0((RangeFilterBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f29943b;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

package com.forsale.app.features.categories.listings.category;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import zb.h;
/* compiled from: Hilt_SortingOptionsBottomSheet.java */
/* loaded from: classes2.dex */
public abstract class g extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f28701b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f28702c;

    /* renamed from: d  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f28703d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f28704e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f28705f = false;

    private void s() {
        if (this.f28701b == null) {
            this.f28701b = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f28702c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f28702c) {
            return null;
        }
        s();
        return this.f28701b;
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
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    public final dagger.hilt.android.internal.managers.g q() {
        if (this.f28703d == null) {
            synchronized (this.f28704e) {
                if (this.f28703d == null) {
                    this.f28703d = r();
                }
            }
        }
        return this.f28703d;
    }

    protected dagger.hilt.android.internal.managers.g r() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    protected void t() {
        if (!this.f28705f) {
            this.f28705f = true;
            ((h) F()).q0((SortingOptionsBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f28701b;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

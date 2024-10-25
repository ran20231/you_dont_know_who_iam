package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
import mx.c;
import mx.d;
/* compiled from: Hilt_LocationFilterDialog.java */
/* loaded from: classes2.dex */
public abstract class a extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f29895a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29896b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f29897c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f29898d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f29899e = false;

    private void o() {
        if (this.f29895a == null) {
            this.f29895a = g.b(super.getContext(), this);
            this.f29896b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f29896b) {
            return null;
        }
        o();
        return this.f29895a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f29897c == null) {
            synchronized (this.f29898d) {
                if (this.f29897c == null) {
                    this.f29897c = m();
                }
            }
        }
        return this.f29897c;
    }

    protected g m() {
        return new g(this);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        o();
        p();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    protected void p() {
        if (!this.f29899e) {
            this.f29899e = true;
            ((kc.a) F()).H0((LocationFilterDialog) d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f29895a;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

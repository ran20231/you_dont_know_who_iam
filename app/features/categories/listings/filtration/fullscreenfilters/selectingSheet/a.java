package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

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
/* compiled from: Hilt_SelectableFilterDialog.java */
/* loaded from: classes2.dex */
public abstract class a extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f30061a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30062b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f30063c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f30064d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f30065e = false;

    private void o() {
        if (this.f30061a == null) {
            this.f30061a = g.b(super.getContext(), this);
            this.f30062b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f30062b) {
            return null;
        }
        o();
        return this.f30061a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f30063c == null) {
            synchronized (this.f30064d) {
                if (this.f30063c == null) {
                    this.f30063c = m();
                }
            }
        }
        return this.f30063c;
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
        if (!this.f30065e) {
            this.f30065e = true;
            ((mc.a) F()).M((SelectableFilterDialog) d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f30061a;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

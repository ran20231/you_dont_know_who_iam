package com.forsale.app.features.offers;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
import mx.d;
/* compiled from: Hilt_OffersFragment.java */
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f33836a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33837b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f33838c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f33839d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33840e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f33839d = new Object();
        this.f33840e = false;
    }

    private void o() {
        if (this.f33836a == null) {
            this.f33836a = g.b(super.getContext(), this);
            this.f33837b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f33837b) {
            return null;
        }
        o();
        return this.f33836a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f33838c == null) {
            synchronized (this.f33839d) {
                if (this.f33838c == null) {
                    this.f33838c = m();
                }
            }
        }
        return this.f33838c;
    }

    protected g m() {
        return new g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        o();
        p();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    protected void p() {
        if (!this.f33840e) {
            this.f33840e = true;
            ((c) F()).e((OffersFragment) d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f33839d = new Object();
        this.f33840e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33836a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

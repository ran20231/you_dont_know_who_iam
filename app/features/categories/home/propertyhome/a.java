package com.forsale.app.features.categories.home.propertyhome;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_PropertyHomeFragment.java */
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f24973a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f24974b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f24975c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f24976d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f24977e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f24976d = new Object();
        this.f24977e = false;
    }

    private void o() {
        if (this.f24973a == null) {
            this.f24973a = g.b(super.getContext(), this);
            this.f24974b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f24974b) {
            return null;
        }
        o();
        return this.f24973a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f24975c == null) {
            synchronized (this.f24976d) {
                if (this.f24975c == null) {
                    this.f24975c = m();
                }
            }
        }
        return this.f24975c;
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
        if (!this.f24977e) {
            this.f24977e = true;
            ((d) F()).q((PropertyHomeFragment) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f24976d = new Object();
        this.f24977e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f24973a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

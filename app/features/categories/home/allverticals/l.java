package com.forsale.app.features.categories.home.allverticals;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_AllVerticalsFragment.java */
/* loaded from: classes2.dex */
public abstract class l extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f23815a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f23816b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f23817c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f23818d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f23819e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
        this.f23818d = new Object();
        this.f23819e = false;
    }

    private void o() {
        if (this.f23815a == null) {
            this.f23815a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f23816b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f23816b) {
            return null;
        }
        o();
        return this.f23815a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f23817c == null) {
            synchronized (this.f23818d) {
                if (this.f23817c == null) {
                    this.f23817c = m();
                }
            }
        }
        return this.f23817c;
    }

    protected dagger.hilt.android.internal.managers.g m() {
        return new dagger.hilt.android.internal.managers.g(this);
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
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    protected void p() {
        if (!this.f23819e) {
            this.f23819e = true;
            ((d) F()).O((AllVerticalsFragment) mx.d.a(this));
        }
    }

    l(int i11) {
        super(i11);
        this.f23818d = new Object();
        this.f23819e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f23815a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

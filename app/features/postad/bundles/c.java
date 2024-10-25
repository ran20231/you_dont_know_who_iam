package com.forsale.app.features.postad.bundles;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_PostAdBundlesFragment.java */
/* loaded from: classes2.dex */
public abstract class c extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f35068a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35069b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f35070c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f35071d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35072e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        this.f35071d = new Object();
        this.f35072e = false;
    }

    private void o() {
        if (this.f35068a == null) {
            this.f35068a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f35069b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f35069b) {
            return null;
        }
        o();
        return this.f35068a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f35070c == null) {
            synchronized (this.f35071d) {
                if (this.f35070c == null) {
                    this.f35070c = m();
                }
            }
        }
        return this.f35070c;
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
        if (!this.f35072e) {
            this.f35072e = true;
            ((g) F()).G((PostAdBundlesFragment) mx.d.a(this));
        }
    }

    c(int i11) {
        super(i11);
        this.f35071d = new Object();
        this.f35072e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f35068a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

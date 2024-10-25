package com.forsale.app.features.welcome.loading;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_SplashFragment.java */
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f37368a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37369b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f37370c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f37371d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37372e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f37371d = new Object();
        this.f37372e = false;
    }

    private void o() {
        if (this.f37368a == null) {
            this.f37368a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f37369b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f37369b) {
            return null;
        }
        o();
        return this.f37368a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f37370c == null) {
            synchronized (this.f37371d) {
                if (this.f37370c == null) {
                    this.f37370c = m();
                }
            }
        }
        return this.f37370c;
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
        if (!this.f37372e) {
            this.f37372e = true;
            ((m) F()).L0((SplashFragment) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f37371d = new Object();
        this.f37372e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37368a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

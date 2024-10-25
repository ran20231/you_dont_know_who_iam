package com.forsale.app.features.postad.media.mediaScreenView;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_PostAdMediaFragment.java */
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f36270a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f36271b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f36272c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f36273d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f36274e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f36273d = new Object();
        this.f36274e = false;
    }

    private void o() {
        if (this.f36270a == null) {
            this.f36270a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f36271b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f36271b) {
            return null;
        }
        o();
        return this.f36270a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f36272c == null) {
            synchronized (this.f36273d) {
                if (this.f36272c == null) {
                    this.f36272c = m();
                }
            }
        }
        return this.f36272c;
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
        if (!this.f36274e) {
            this.f36274e = true;
            ((d) F()).e0((PostAdMediaFragment) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f36273d = new Object();
        this.f36274e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f36270a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

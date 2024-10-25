package com.forsale.app.features.postad.media.imagetutorials;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_ImageTutorialsSliderFragment.java */
/* loaded from: classes2.dex */
public abstract class b extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f35984a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f35985b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f35986c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f35987d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f35988e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        this.f35987d = new Object();
        this.f35988e = false;
    }

    private void o() {
        if (this.f35984a == null) {
            this.f35984a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f35985b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f35985b) {
            return null;
        }
        o();
        return this.f35984a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f35986c == null) {
            synchronized (this.f35987d) {
                if (this.f35986c == null) {
                    this.f35986c = m();
                }
            }
        }
        return this.f35986c;
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
        if (!this.f35988e) {
            this.f35988e = true;
            ((i) F()).z0((ImageTutorialsSliderFragment) mx.d.a(this));
        }
    }

    b(int i11) {
        super(i11);
        this.f35987d = new Object();
        this.f35988e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f35984a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

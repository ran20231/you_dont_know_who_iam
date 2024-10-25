package com.forsale.app.features.categories.listings.filtration.allFilters;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_AllFiltersDialogFragment.java */
/* loaded from: classes2.dex */
public abstract class e extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f29050a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29051b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f29052c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f29053d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f29054e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this.f29053d = new Object();
        this.f29054e = false;
    }

    private void o() {
        if (this.f29050a == null) {
            this.f29050a = g.b(super.getContext(), this);
            this.f29051b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f29051b) {
            return null;
        }
        o();
        return this.f29050a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f29052c == null) {
            synchronized (this.f29053d) {
                if (this.f29052c == null) {
                    this.f29052c = m();
                }
            }
        }
        return this.f29052c;
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
        if (!this.f29054e) {
            this.f29054e = true;
            ((b) F()).w0((AllFiltersDialogFragment) mx.d.a(this));
        }
    }

    e(int i11) {
        super(i11);
        this.f29053d = new Object();
        this.f29054e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f29050a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

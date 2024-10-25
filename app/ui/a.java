package com.forsale.app.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
import mx.d;
/* compiled from: Hilt_WebDialogFragment.java */
/* loaded from: classes3.dex */
public abstract class a extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f37855a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37856b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f37857c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f37858d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f37859e = false;

    private void o() {
        if (this.f37855a == null) {
            this.f37855a = g.b(super.getContext(), this);
            this.f37856b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f37856b) {
            return null;
        }
        o();
        return this.f37855a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f37857c == null) {
            synchronized (this.f37858d) {
                if (this.f37857c == null) {
                    this.f37857c = m();
                }
            }
        }
        return this.f37857c;
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
        if (!this.f37859e) {
            this.f37859e = true;
            ((bg.g) F()).A0((WebDialogFragment) d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37855a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

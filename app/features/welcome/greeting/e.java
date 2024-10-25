package com.forsale.app.features.welcome.greeting;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_GreetingDialogFragment.java */
/* loaded from: classes2.dex */
public abstract class e extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f37134a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f37135b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f37136c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f37137d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f37138e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this.f37137d = new Object();
        this.f37138e = false;
    }

    private void o() {
        if (this.f37134a == null) {
            this.f37134a = g.b(super.getContext(), this);
            this.f37135b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f37135b) {
            return null;
        }
        o();
        return this.f37134a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f37136c == null) {
            synchronized (this.f37137d) {
                if (this.f37136c == null) {
                    this.f37136c = m();
                }
            }
        }
        return this.f37136c;
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
        if (!this.f37138e) {
            this.f37138e = true;
            ((b) F()).l0((GreetingDialogFragment) mx.d.a(this));
        }
    }

    e(int i11) {
        super(i11);
        this.f37137d = new Object();
        this.f37138e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37134a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

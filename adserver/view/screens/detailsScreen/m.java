package com.forsale.adserver.view.screens.detailsScreen;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
/* compiled from: Hilt_NewDetailsBottomSheet.java */
/* loaded from: classes2.dex */
public abstract class m extends androidx.fragment.app.j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f21374a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f21375b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f21376c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f21377d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f21378e = false;

    private void o() {
        if (this.f21374a == null) {
            this.f21374a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f21375b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f21375b) {
            return null;
        }
        o();
        return this.f21374a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f21376c == null) {
            synchronized (this.f21377d) {
                if (this.f21376c == null) {
                    this.f21376c = m();
                }
            }
        }
        return this.f21376c;
    }

    protected dagger.hilt.android.internal.managers.g m() {
        return new dagger.hilt.android.internal.managers.g(this);
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
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    protected void p() {
        if (!this.f21378e) {
            this.f21378e = true;
            ((n) F()).s((NewDetailsBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f21374a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

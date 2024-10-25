package com.forsale.app.ui.bottomsheets.support;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
import mx.b;
import mx.c;
/* compiled from: Hilt_SupportCallUsBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class a extends d implements b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39131b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39132c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f39133d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39134e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f39135f = false;

    private void s() {
        if (this.f39131b == null) {
            this.f39131b = g.b(super.getContext(), this);
            this.f39132c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39132c) {
            return null;
        }
        s();
        return this.f39131b;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        s();
        t();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    public final g q() {
        if (this.f39133d == null) {
            synchronized (this.f39134e) {
                if (this.f39133d == null) {
                    this.f39133d = r();
                }
            }
        }
        return this.f39133d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f39135f) {
            this.f39135f = true;
            ((oh.b) F()).n((SupportCallUsBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39131b;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

package com.forsale.app.features.postad.addons.featured.selector;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
import mx.c;
import mx.d;
/* compiled from: Hilt_FeaturedAddonsSelectorDialogFragment.java */
/* loaded from: classes2.dex */
public abstract class b extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f34782a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f34783b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f34784c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f34785d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private boolean f34786e = false;

    private void o() {
        if (this.f34782a == null) {
            this.f34782a = g.b(super.getContext(), this);
            this.f34783b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f34783b) {
            return null;
        }
        o();
        return this.f34782a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f34784c == null) {
            synchronized (this.f34785d) {
                if (this.f34784c == null) {
                    this.f34784c = m();
                }
            }
        }
        return this.f34784c;
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
        if (!this.f34786e) {
            this.f34786e = true;
            ((ne.a) F()).f((FeaturedAddonsSelectorDialogFragment) d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f34782a;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

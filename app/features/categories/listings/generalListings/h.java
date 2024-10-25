package com.forsale.app.features.categories.listings.generalListings;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_GeneralListingsFragment.java */
/* loaded from: classes2.dex */
public abstract class h extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f30547a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30548b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f30549c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f30550d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f30551e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        this.f30550d = new Object();
        this.f30551e = false;
    }

    private void o() {
        if (this.f30547a == null) {
            this.f30547a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f30548b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f30548b) {
            return null;
        }
        o();
        return this.f30547a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f30549c == null) {
            synchronized (this.f30550d) {
                if (this.f30549c == null) {
                    this.f30549c = m();
                }
            }
        }
        return this.f30549c;
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
        if (!this.f30551e) {
            this.f30551e = true;
            ((c) F()).G0((GeneralListingsFragment) mx.d.a(this));
        }
    }

    h(int i11) {
        super(i11);
        this.f30550d = new Object();
        this.f30551e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f30547a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

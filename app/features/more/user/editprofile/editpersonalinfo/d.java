package com.forsale.app.features.more.user.editprofile.editpersonalinfo;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_EditPersonalInformationDialogFragment.java */
/* loaded from: classes2.dex */
public abstract class d extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f33375a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33376b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f33377c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f33378d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33379e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        this.f33378d = new Object();
        this.f33379e = false;
    }

    private void o() {
        if (this.f33375a == null) {
            this.f33375a = g.b(super.getContext(), this);
            this.f33376b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f33376b) {
            return null;
        }
        o();
        return this.f33375a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f33377c == null) {
            synchronized (this.f33378d) {
                if (this.f33377c == null) {
                    this.f33377c = m();
                }
            }
        }
        return this.f33377c;
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
        if (!this.f33379e) {
            this.f33379e = true;
            ((a) F()).C0((EditPersonalInformationDialogFragment) mx.d.a(this));
        }
    }

    d(int i11) {
        super(i11);
        this.f33378d = new Object();
        this.f33379e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33375a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

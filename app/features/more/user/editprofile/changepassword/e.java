package com.forsale.app.features.more.user.editprofile.changepassword;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_ChangePasswordDialogFragment.java */
/* loaded from: classes2.dex */
public abstract class e extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f33218a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33219b;

    /* renamed from: c  reason: collision with root package name */
    private volatile g f33220c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f33221d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33222e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        this.f33221d = new Object();
        this.f33222e = false;
    }

    private void o() {
        if (this.f33218a == null) {
            this.f33218a = g.b(super.getContext(), this);
            this.f33219b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f33219b) {
            return null;
        }
        o();
        return this.f33218a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final g k() {
        if (this.f33220c == null) {
            synchronized (this.f33221d) {
                if (this.f33220c == null) {
                    this.f33220c = m();
                }
            }
        }
        return this.f33220c;
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
        if (!this.f33222e) {
            this.f33222e = true;
            ((a) F()).S((ChangePasswordDialogFragment) mx.d.a(this));
        }
    }

    e(int i11) {
        super(i11);
        this.f33221d = new Object();
        this.f33222e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33218a;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

package com.forsale.app.features.more.user.profile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_NewProfileFragment.java */
/* loaded from: classes2.dex */
public abstract class a extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f33664a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33665b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f33666c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f33667d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33668e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f33667d = new Object();
        this.f33668e = false;
    }

    private void o() {
        if (this.f33664a == null) {
            this.f33664a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f33665b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f33665b) {
            return null;
        }
        o();
        return this.f33664a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f33666c == null) {
            synchronized (this.f33667d) {
                if (this.f33666c == null) {
                    this.f33666c = m();
                }
            }
        }
        return this.f33666c;
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
        if (!this.f33668e) {
            this.f33668e = true;
            ((c) F()).J0((NewProfileFragment) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f33667d = new Object();
        this.f33668e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33664a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

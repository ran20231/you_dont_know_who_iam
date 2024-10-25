package com.forsale.app.features.more.user.editprofile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.t0;
/* compiled from: Hilt_EditProfileFragment.java */
/* loaded from: classes2.dex */
public abstract class h extends Fragment implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f33386a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f33387b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f33388c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f33389d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f33390e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        this.f33389d = new Object();
        this.f33390e = false;
    }

    private void o() {
        if (this.f33386a == null) {
            this.f33386a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f33387b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f33387b) {
            return null;
        }
        o();
        return this.f33386a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f33388c == null) {
            synchronized (this.f33389d) {
                if (this.f33388c == null) {
                    this.f33388c = m();
                }
            }
        }
        return this.f33388c;
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
        if (!this.f33390e) {
            this.f33390e = true;
            ((d) F()).r0((EditProfileFragment) mx.d.a(this));
        }
    }

    h(int i11) {
        super(i11);
        this.f33389d = new Object();
        this.f33390e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f33386a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}
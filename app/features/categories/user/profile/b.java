package com.forsale.app.features.categories.user.profile;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.fragments.BaseViewModelFragment;
import com.forsale.app.base.viewmodels.BaseViewModel;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_UserProfileFragment.java */
/* loaded from: classes2.dex */
public abstract class b<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelFragment<B, VM> implements mx.b {

    /* renamed from: i  reason: collision with root package name */
    private ContextWrapper f31211i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31212j;

    /* renamed from: x  reason: collision with root package name */
    private volatile g f31213x;

    /* renamed from: y  reason: collision with root package name */
    private final Object f31214y = new Object();

    /* renamed from: z  reason: collision with root package name */
    private boolean f31215z = false;

    private void E() {
        if (this.f31211i == null) {
            this.f31211i = g.b(super.getContext(), this);
            this.f31212j = gx.a.a(super.getContext());
        }
    }

    public final g C() {
        if (this.f31213x == null) {
            synchronized (this.f31214y) {
                if (this.f31213x == null) {
                    this.f31213x = D();
                }
            }
        }
        return this.f31213x;
    }

    protected g D() {
        return new g(this);
    }

    @Override // mx.b
    public final Object F() {
        return C().F();
    }

    protected void G() {
        if (!this.f31215z) {
            this.f31215z = true;
            ((e) F()).t((UserProfileFragment) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f31212j) {
            return null;
        }
        E();
        return this.f31211i;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        E();
        G();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f31211i;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E();
        G();
    }
}

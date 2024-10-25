package com.forsale.app.features.more.buymoretoken.billingpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
/* compiled from: Hilt_BillingPackageFragment.java */
/* loaded from: classes2.dex */
public abstract class h<B extends ViewDataBinding, VM extends BaseStatefulViewModel> extends com.forsale.app.base.fragments.b<B, VM> implements mx.b {
    private boolean A;
    private volatile dagger.hilt.android.internal.managers.g B;
    private final Object C = new Object();
    private boolean D = false;

    /* renamed from: z  reason: collision with root package name */
    private ContextWrapper f31793z;

    private void M() {
        if (this.f31793z == null) {
            this.f31793z = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.A = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return K().F();
    }

    public final dagger.hilt.android.internal.managers.g K() {
        if (this.B == null) {
            synchronized (this.C) {
                if (this.B == null) {
                    this.B = L();
                }
            }
        }
        return this.B;
    }

    protected dagger.hilt.android.internal.managers.g L() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    protected void O() {
        if (!this.D) {
            this.D = true;
            ((c) F()).d((BillingPackageFragment) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.A) {
            return null;
        }
        M();
        return this.f31793z;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        M();
        O();
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f31793z;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        M();
        O();
    }
}

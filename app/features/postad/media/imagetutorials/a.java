package com.forsale.app.features.postad.media.imagetutorials;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.fragments.BaseViewModelFragment;
import com.forsale.app.base.viewmodels.BaseViewModel;
/* compiled from: Hilt_ImageTutorialListFragment.java */
/* loaded from: classes2.dex */
public abstract class a<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelFragment<B, VM> implements mx.b {

    /* renamed from: i  reason: collision with root package name */
    private ContextWrapper f35979i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f35980j;

    /* renamed from: x  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f35981x;

    /* renamed from: y  reason: collision with root package name */
    private final Object f35982y = new Object();

    /* renamed from: z  reason: collision with root package name */
    private boolean f35983z = false;

    private void E() {
        if (this.f35979i == null) {
            this.f35979i = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f35980j = gx.a.a(super.getContext());
        }
    }

    public final dagger.hilt.android.internal.managers.g C() {
        if (this.f35981x == null) {
            synchronized (this.f35982y) {
                if (this.f35981x == null) {
                    this.f35981x = D();
                }
            }
        }
        return this.f35981x;
    }

    protected dagger.hilt.android.internal.managers.g D() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    @Override // mx.b
    public final Object F() {
        return C().F();
    }

    protected void G() {
        if (!this.f35983z) {
            this.f35983z = true;
            ((c) F()).h((ImageTutorialListFragment) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f35980j) {
            return null;
        }
        E();
        return this.f35979i;
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
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f35979i;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        E();
        G();
    }
}

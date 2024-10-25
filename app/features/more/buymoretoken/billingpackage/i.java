package com.forsale.app.features.more.buymoretoken.billingpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
/* compiled from: Hilt_PaymentBottomSheet.java */
/* loaded from: classes2.dex */
public abstract class i extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f31794b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31795c;

    /* renamed from: d  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f31796d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f31797e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31798f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        this.f31797e = new Object();
        this.f31798f = false;
    }

    private void s() {
        if (this.f31794b == null) {
            this.f31794b = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f31795c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f31795c) {
            return null;
        }
        s();
        return this.f31794b;
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
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    public final dagger.hilt.android.internal.managers.g q() {
        if (this.f31796d == null) {
            synchronized (this.f31797e) {
                if (this.f31796d == null) {
                    this.f31796d = r();
                }
            }
        }
        return this.f31796d;
    }

    protected dagger.hilt.android.internal.managers.g r() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    protected void t() {
        if (!this.f31798f) {
            this.f31798f = true;
            ((k) F()).F0((PaymentBottomSheet) mx.d.a(this));
        }
    }

    i(int i11) {
        super(i11);
        this.f31797e = new Object();
        this.f31798f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f31794b;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

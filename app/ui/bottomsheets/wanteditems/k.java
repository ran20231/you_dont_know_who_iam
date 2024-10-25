package com.forsale.app.ui.bottomsheets.wanteditems;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
/* compiled from: Hilt_DeleteWantedItemBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class k extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39295b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39296c;

    /* renamed from: d  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f39297d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39298e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39299f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        this.f39298e = new Object();
        this.f39299f = false;
    }

    private void s() {
        if (this.f39295b == null) {
            this.f39295b = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f39296c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39296c) {
            return null;
        }
        s();
        return this.f39295b;
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
        if (this.f39297d == null) {
            synchronized (this.f39298e) {
                if (this.f39297d == null) {
                    this.f39297d = r();
                }
            }
        }
        return this.f39297d;
    }

    protected dagger.hilt.android.internal.managers.g r() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    protected void t() {
        if (!this.f39299f) {
            this.f39299f = true;
            ((g) F()).a0((DeleteWantedItemBottomSheet) mx.d.a(this));
        }
    }

    k(int i11) {
        super(i11);
        this.f39298e = new Object();
        this.f39299f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39295b;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

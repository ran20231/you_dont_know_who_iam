package com.forsale.app.ui.bottomsheets.wanteditems;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
/* compiled from: Hilt_AddWantedItemBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class j extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39290b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39291c;

    /* renamed from: d  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f39292d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39293e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39294f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j() {
        this.f39293e = new Object();
        this.f39294f = false;
    }

    private void s() {
        if (this.f39290b == null) {
            this.f39290b = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f39291c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39291c) {
            return null;
        }
        s();
        return this.f39290b;
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
        if (this.f39292d == null) {
            synchronized (this.f39293e) {
                if (this.f39292d == null) {
                    this.f39292d = r();
                }
            }
        }
        return this.f39292d;
    }

    protected dagger.hilt.android.internal.managers.g r() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    protected void t() {
        if (!this.f39294f) {
            this.f39294f = true;
            ((c) F()).o((AddWantedItemBottomSheet) mx.d.a(this));
        }
    }

    j(int i11) {
        super(i11);
        this.f39293e = new Object();
        this.f39294f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39290b;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

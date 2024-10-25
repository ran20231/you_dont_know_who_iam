package com.forsale.app.ui.bottomsheets.postadsavelistingsuccess;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_PostAdSaveListingBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class a extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39023b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39024c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f39025d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39026e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39027f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f39026e = new Object();
        this.f39027f = false;
    }

    private void s() {
        if (this.f39023b == null) {
            this.f39023b = g.b(super.getContext(), this);
            this.f39024c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39024c) {
            return null;
        }
        s();
        return this.f39023b;
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
        return onGetLayoutInflater.cloneInContext(g.c(onGetLayoutInflater, this));
    }

    public final g q() {
        if (this.f39025d == null) {
            synchronized (this.f39026e) {
                if (this.f39025d == null) {
                    this.f39025d = r();
                }
            }
        }
        return this.f39025d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f39027f) {
            this.f39027f = true;
            ((c) F()).p((PostAdSaveListingBottomSheet) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f39026e = new Object();
        this.f39027f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39023b;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

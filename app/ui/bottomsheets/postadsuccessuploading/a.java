package com.forsale.app.ui.bottomsheets.postadsuccessuploading;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_PostAdUploadAdSuccessBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class a extends com.google.android.material.bottomsheet.d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39047b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39048c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f39049d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39050e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f39051f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f39050e = new Object();
        this.f39051f = false;
    }

    private void s() {
        if (this.f39047b == null) {
            this.f39047b = g.b(super.getContext(), this);
            this.f39048c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39048c) {
            return null;
        }
        s();
        return this.f39047b;
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
        if (this.f39049d == null) {
            synchronized (this.f39050e) {
                if (this.f39049d == null) {
                    this.f39049d = r();
                }
            }
        }
        return this.f39049d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f39051f) {
            this.f39051f = true;
            ((c) F()).M0((PostAdUploadAdSuccessBottomSheet) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f39050e = new Object();
        this.f39051f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39047b;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

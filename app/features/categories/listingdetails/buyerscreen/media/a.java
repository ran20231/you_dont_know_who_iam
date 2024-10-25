package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.j;
import androidx.lifecycle.t0;
/* compiled from: Hilt_MediaDialog.java */
/* loaded from: classes2.dex */
public abstract class a extends j implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private ContextWrapper f26293a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26294b;

    /* renamed from: c  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.g f26295c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f26296d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f26297e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        this.f26296d = new Object();
        this.f26297e = false;
    }

    private void o() {
        if (this.f26293a == null) {
            this.f26293a = dagger.hilt.android.internal.managers.g.b(super.getContext(), this);
            this.f26294b = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return k().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f26294b) {
            return null;
        }
        o();
        return this.f26293a;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.g k() {
        if (this.f26295c == null) {
            synchronized (this.f26296d) {
                if (this.f26295c == null) {
                    this.f26295c = m();
                }
            }
        }
        return this.f26295c;
    }

    protected dagger.hilt.android.internal.managers.g m() {
        return new dagger.hilt.android.internal.managers.g(this);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        o();
        p();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(dagger.hilt.android.internal.managers.g.c(onGetLayoutInflater, this));
    }

    protected void p() {
        if (!this.f26297e) {
            this.f26297e = true;
            ((e) F()).Z((MediaDialog) mx.d.a(this));
        }
    }

    a(int i11) {
        super(i11);
        this.f26296d = new Object();
        this.f26297e = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f26293a;
        mx.c.d(contextWrapper == null || dagger.hilt.android.internal.managers.g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o();
        p();
    }
}

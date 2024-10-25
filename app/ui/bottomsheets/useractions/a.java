package com.forsale.app.ui.bottomsheets.useractions;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
import mx.c;
/* compiled from: Hilt_ReportAbuseBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class a extends d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39207b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39208c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f39209d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39210e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f39211f = false;

    private void s() {
        if (this.f39207b == null) {
            this.f39207b = g.b(super.getContext(), this);
            this.f39208c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39208c) {
            return null;
        }
        s();
        return this.f39207b;
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
        if (this.f39209d == null) {
            synchronized (this.f39210e) {
                if (this.f39209d == null) {
                    this.f39209d = r();
                }
            }
        }
        return this.f39209d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f39211f) {
            this.f39211f = true;
            ((sh.b) F()).b((ReportAbuseBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39207b;
        c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

package com.forsale.app.ui.bottomsheets.agents;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_AgentContactBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class b extends d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f37923b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37924c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f37925d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f37926e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f37927f = false;

    private void s() {
        if (this.f37923b == null) {
            this.f37923b = g.b(super.getContext(), this);
            this.f37924c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f37924c) {
            return null;
        }
        s();
        return this.f37923b;
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
        if (this.f37925d == null) {
            synchronized (this.f37926e) {
                if (this.f37925d == null) {
                    this.f37925d = r();
                }
            }
        }
        return this.f37925d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f37927f) {
            this.f37927f = true;
            ((dg.a) F()).t0((AgentContactBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37923b;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

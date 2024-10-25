package com.forsale.app.ui.bottomsheets.agents;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_AgentLocationsBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class c extends d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f37928b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37929c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f37930d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f37931e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f37932f = false;

    private void s() {
        if (this.f37928b == null) {
            this.f37928b = g.b(super.getContext(), this);
            this.f37929c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f37929c) {
            return null;
        }
        s();
        return this.f37928b;
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
        if (this.f37930d == null) {
            synchronized (this.f37931e) {
                if (this.f37930d == null) {
                    this.f37930d = r();
                }
            }
        }
        return this.f37930d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f37932f) {
            this.f37932f = true;
            ((dg.c) F()).j((AgentLocationsBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f37928b;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

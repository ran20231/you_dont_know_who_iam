package com.forsale.app.ui.bottomsheets.postadwarning;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.t0;
import com.google.android.material.bottomsheet.d;
import dagger.hilt.android.internal.managers.g;
/* compiled from: Hilt_PostAdWarningBottomSheet.java */
/* loaded from: classes3.dex */
public abstract class a extends d implements mx.b {

    /* renamed from: b  reason: collision with root package name */
    private ContextWrapper f39075b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f39076c;

    /* renamed from: d  reason: collision with root package name */
    private volatile g f39077d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f39078e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private boolean f39079f = false;

    private void s() {
        if (this.f39075b == null) {
            this.f39075b = g.b(super.getContext(), this);
            this.f39076c = gx.a.a(super.getContext());
        }
    }

    @Override // mx.b
    public final Object F() {
        return q().F();
    }

    @Override // androidx.fragment.app.Fragment
    public Context getContext() {
        if (super.getContext() == null && !this.f39076c) {
            return null;
        }
        s();
        return this.f39075b;
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
        if (this.f39077d == null) {
            synchronized (this.f39078e) {
                if (this.f39077d == null) {
                    this.f39077d = r();
                }
            }
        }
        return this.f39077d;
    }

    protected g r() {
        return new g(this);
    }

    protected void t() {
        if (!this.f39079f) {
            this.f39079f = true;
            ((lh.a) F()).H((PostAdWarningBottomSheet) mx.d.a(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f39075b;
        mx.c.d(contextWrapper == null || g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s();
        t();
    }
}

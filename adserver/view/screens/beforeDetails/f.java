package com.forsale.adserver.view.screens.beforeDetails;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_BeforeDetailsActivity.java */
/* loaded from: classes2.dex */
public abstract class f extends androidx.appcompat.app.d implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private h f21123a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f21124b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f21125c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f21126d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_BeforeDetailsActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            f.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        l0();
    }

    private void l0() {
        addOnContextAvailableListener(new a());
    }

    private void p0() {
        if (getApplication() instanceof mx.b) {
            h b11 = m0().b();
            this.f21123a = b11;
            if (b11.b()) {
                this.f21123a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // mx.b
    public final Object F() {
        return m0().F();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.a m0() {
        if (this.f21124b == null) {
            synchronized (this.f21125c) {
                if (this.f21124b == null) {
                    this.f21124b = o0();
                }
            }
        }
        return this.f21124b;
    }

    protected dagger.hilt.android.internal.managers.a o0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f21123a;
        if (hVar != null) {
            hVar.a();
        }
    }

    protected void q0() {
        if (!this.f21126d) {
            this.f21126d = true;
            ((b) F()).l((BeforeDetailsActivity) mx.d.a(this));
        }
    }
}

package com.forsale.app.features.auth;

import android.content.Context;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_AuthActivity.java */
/* loaded from: classes2.dex */
public abstract class g extends ComponentActivity implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private h f22726a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f22727b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f22728c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f22729d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_AuthActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            g.this.l0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        h0();
    }

    private void h0() {
        addOnContextAvailableListener(new a());
    }

    private void k0() {
        if (getApplication() instanceof mx.b) {
            h b11 = i0().b();
            this.f22726a = b11;
            if (b11.b()) {
                this.f22726a.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // mx.b
    public final Object F() {
        return i0().F();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    public final dagger.hilt.android.internal.managers.a i0() {
        if (this.f22727b == null) {
            synchronized (this.f22728c) {
                if (this.f22727b == null) {
                    this.f22727b = j0();
                }
            }
        }
        return this.f22727b;
    }

    protected dagger.hilt.android.internal.managers.a j0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void l0() {
        if (!this.f22729d) {
            this.f22729d = true;
            ((com.forsale.app.features.auth.a) F()).q((AuthActivity) mx.d.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        h hVar = this.f22726a;
        if (hVar != null) {
            hVar.a();
        }
    }
}

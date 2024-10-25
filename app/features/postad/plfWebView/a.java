package com.forsale.app.features.postad.plfWebView;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.t0;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_PLFWebViewActivity.java */
/* loaded from: classes2.dex */
public abstract class a extends androidx.appcompat.app.d implements mx.b {

    /* renamed from: a  reason: collision with root package name */
    private h f36447a;

    /* renamed from: b  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f36448b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f36449c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private boolean f36450d = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_PLFWebViewActivity.java */
    /* renamed from: com.forsale.app.features.postad.plfWebView.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0419a implements d.b {
        C0419a() {
        }

        @Override // d.b
        public void a(Context context) {
            a.this.q0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        l0();
    }

    private void l0() {
        addOnContextAvailableListener(new C0419a());
    }

    private void p0() {
        if (getApplication() instanceof mx.b) {
            h b11 = m0().b();
            this.f36447a = b11;
            if (b11.b()) {
                this.f36447a.c(getDefaultViewModelCreationExtras());
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
        if (this.f36448b == null) {
            synchronized (this.f36449c) {
                if (this.f36448b == null) {
                    this.f36448b = o0();
                }
            }
        }
        return this.f36448b;
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
        h hVar = this.f36447a;
        if (hVar != null) {
            hVar.a();
        }
    }

    protected void q0() {
        if (!this.f36450d) {
            this.f36450d = true;
            ((c) F()).v((PLFWebViewActivity) mx.d.a(this));
        }
    }
}

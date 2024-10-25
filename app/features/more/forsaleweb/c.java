package com.forsale.app.features.more.forsaleweb;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.base.viewmodels.BaseViewModel;
import dagger.hilt.android.internal.managers.h;
import mx.d;
/* compiled from: Hilt_ForSaleWebActivity.java */
/* loaded from: classes2.dex */
public abstract class c<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelActivity<B, VM> implements mx.b {

    /* renamed from: e  reason: collision with root package name */
    private h f31895e;

    /* renamed from: f  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f31896f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f31897g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f31898h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_ForSaleWebActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            c.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        z0();
    }

    private void C0() {
        if (getApplication() instanceof mx.b) {
            h b11 = A0().b();
            this.f31895e = b11;
            if (b11.b()) {
                this.f31895e.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void z0() {
        addOnContextAvailableListener(new a());
    }

    public final dagger.hilt.android.internal.managers.a A0() {
        if (this.f31896f == null) {
            synchronized (this.f31897g) {
                if (this.f31896f == null) {
                    this.f31896f = B0();
                }
            }
        }
        return this.f31896f;
    }

    protected dagger.hilt.android.internal.managers.a B0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void D0() {
        if (!this.f31898h) {
            this.f31898h = true;
            ((com.forsale.app.features.more.forsaleweb.a) F()).d((ForSaleWebActivity) d.a(this));
        }
    }

    @Override // mx.b
    public final Object F() {
        return A0().F();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f31895e;
        if (hVar != null) {
            hVar.a();
        }
    }
}

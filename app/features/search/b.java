package com.forsale.app.features.search;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.base.viewmodels.BaseViewModel;
/* compiled from: Hilt_SearchActivity.java */
/* loaded from: classes2.dex */
public abstract class b<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelActivity<B, VM> implements mx.b {

    /* renamed from: e  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.h f36956e;

    /* renamed from: f  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f36957f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f36958g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f36959h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_SearchActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            b.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        z0();
    }

    private void C0() {
        if (getApplication() instanceof mx.b) {
            dagger.hilt.android.internal.managers.h b11 = A0().b();
            this.f36956e = b11;
            if (b11.b()) {
                this.f36956e.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void z0() {
        addOnContextAvailableListener(new a());
    }

    public final dagger.hilt.android.internal.managers.a A0() {
        if (this.f36957f == null) {
            synchronized (this.f36958g) {
                if (this.f36957f == null) {
                    this.f36957f = B0();
                }
            }
        }
        return this.f36957f;
    }

    protected dagger.hilt.android.internal.managers.a B0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void D0() {
        if (!this.f36959h) {
            this.f36959h = true;
            ((e) F()).s((SearchActivity) mx.d.a(this));
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
        dagger.hilt.android.internal.managers.h hVar = this.f36956e;
        if (hVar != null) {
            hVar.a();
        }
    }
}

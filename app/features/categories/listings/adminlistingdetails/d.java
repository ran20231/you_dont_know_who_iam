package com.forsale.app.features.categories.listings.adminlistingdetails;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.base.viewmodels.BaseViewModel;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_AdminListingDetailsActivity.java */
/* loaded from: classes2.dex */
public abstract class d<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelActivity<B, VM> implements mx.b {

    /* renamed from: e  reason: collision with root package name */
    private h f28074e;

    /* renamed from: f  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f28075f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f28076g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f28077h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_AdminListingDetailsActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            d.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        z0();
    }

    private void C0() {
        if (getApplication() instanceof mx.b) {
            h b11 = A0().b();
            this.f28074e = b11;
            if (b11.b()) {
                this.f28074e.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void z0() {
        addOnContextAvailableListener(new a());
    }

    public final dagger.hilt.android.internal.managers.a A0() {
        if (this.f28075f == null) {
            synchronized (this.f28076g) {
                if (this.f28075f == null) {
                    this.f28075f = B0();
                }
            }
        }
        return this.f28075f;
    }

    protected dagger.hilt.android.internal.managers.a B0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void D0() {
        if (!this.f28077h) {
            this.f28077h = true;
            ((b) F()).r((AdminListingDetailsActivity) mx.d.a(this));
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

    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        h hVar = this.f28074e;
        if (hVar != null) {
            hVar.a();
        }
    }
}

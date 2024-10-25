package com.forsale.app.features.more.mylistings;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.base.viewmodels.BaseViewModel;
/* compiled from: Hilt_MyListingAnalyticsActivity.java */
/* loaded from: classes2.dex */
public abstract class a<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelActivity<B, VM> implements mx.b {

    /* renamed from: e  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.h f31938e;

    /* renamed from: f  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f31939f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f31940g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f31941h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_MyListingAnalyticsActivity.java */
    /* renamed from: com.forsale.app.features.more.mylistings.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0352a implements d.b {
        C0352a() {
        }

        @Override // d.b
        public void a(Context context) {
            a.this.D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        z0();
    }

    private void C0() {
        if (getApplication() instanceof mx.b) {
            dagger.hilt.android.internal.managers.h b11 = A0().b();
            this.f31938e = b11;
            if (b11.b()) {
                this.f31938e.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void z0() {
        addOnContextAvailableListener(new C0352a());
    }

    public final dagger.hilt.android.internal.managers.a A0() {
        if (this.f31939f == null) {
            synchronized (this.f31940g) {
                if (this.f31939f == null) {
                    this.f31939f = B0();
                }
            }
        }
        return this.f31939f;
    }

    protected dagger.hilt.android.internal.managers.a B0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void D0() {
        if (!this.f31941h) {
            this.f31941h = true;
            ((d) F()).i((MyListingAnalyticsActivity) mx.d.a(this));
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
        dagger.hilt.android.internal.managers.h hVar = this.f31938e;
        if (hVar != null) {
            hVar.a();
        }
    }
}

package com.forsale.app.features.more.mylistings;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseStatefulActivity;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
/* compiled from: Hilt_MyListingAnalyticsDetailsActivity.java */
/* loaded from: classes2.dex */
public abstract class b<B extends ViewDataBinding, VM extends BaseStatefulViewModel> extends BaseStatefulActivity<B, VM> implements mx.b {

    /* renamed from: j  reason: collision with root package name */
    private dagger.hilt.android.internal.managers.h f31943j;

    /* renamed from: x  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f31944x;

    /* renamed from: y  reason: collision with root package name */
    private final Object f31945y = new Object();

    /* renamed from: z  reason: collision with root package name */
    private boolean f31946z = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_MyListingAnalyticsDetailsActivity.java */
    /* loaded from: classes2.dex */
    public class a implements d.b {
        a() {
        }

        @Override // d.b
        public void a(Context context) {
            b.this.M0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b() {
        I0();
    }

    private void I0() {
        addOnContextAvailableListener(new a());
    }

    private void L0() {
        if (getApplication() instanceof mx.b) {
            dagger.hilt.android.internal.managers.h b11 = J0().b();
            this.f31943j = b11;
            if (b11.b()) {
                this.f31943j.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // mx.b
    public final Object F() {
        return J0().F();
    }

    public final dagger.hilt.android.internal.managers.a J0() {
        if (this.f31944x == null) {
            synchronized (this.f31945y) {
                if (this.f31944x == null) {
                    this.f31944x = K0();
                }
            }
        }
        return this.f31944x;
    }

    protected dagger.hilt.android.internal.managers.a K0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void M0() {
        if (!this.f31946z) {
            this.f31946z = true;
            ((j) F()).c((MyListingAnalyticsDetailsActivity) mx.d.a(this));
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        L0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dagger.hilt.android.internal.managers.h hVar = this.f31943j;
        if (hVar != null) {
            hVar.a();
        }
    }
}

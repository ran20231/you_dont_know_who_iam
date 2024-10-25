package com.forsale.app.ui.map;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseViewModelActivity;
import com.forsale.app.base.viewmodels.BaseViewModel;
import dagger.hilt.android.internal.managers.h;
import mx.d;
/* compiled from: Hilt_LocationPickerActivity.java */
/* loaded from: classes3.dex */
public abstract class a<B extends ViewDataBinding, VM extends BaseViewModel> extends BaseViewModelActivity<B, VM> implements mx.b {

    /* renamed from: e  reason: collision with root package name */
    private h f39374e;

    /* renamed from: f  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f39375f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f39376g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private boolean f39377h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_LocationPickerActivity.java */
    /* renamed from: com.forsale.app.ui.map.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0443a implements d.b {
        C0443a() {
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
            h b11 = A0().b();
            this.f39374e = b11;
            if (b11.b()) {
                this.f39374e.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    private void z0() {
        addOnContextAvailableListener(new C0443a());
    }

    public final dagger.hilt.android.internal.managers.a A0() {
        if (this.f39375f == null) {
            synchronized (this.f39376g) {
                if (this.f39375f == null) {
                    this.f39375f = B0();
                }
            }
        }
        return this.f39375f;
    }

    protected dagger.hilt.android.internal.managers.a B0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void D0() {
        if (!this.f39377h) {
            this.f39377h = true;
            ((b) F()).n((LocationPickerActivity) d.a(this));
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
        h hVar = this.f39374e;
        if (hVar != null) {
            hVar.a();
        }
    }
}

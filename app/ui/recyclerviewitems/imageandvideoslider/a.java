package com.forsale.app.ui.recyclerviewitems.imageandvideoslider;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BasePlainActivity;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_ImageSliderActivity.java */
/* loaded from: classes3.dex */
public abstract class a<B extends ViewDataBinding> extends BasePlainActivity<B> implements mx.b {

    /* renamed from: d  reason: collision with root package name */
    private h f39477d;

    /* renamed from: e  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f39478e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f39479f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private boolean f39480g = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_ImageSliderActivity.java */
    /* renamed from: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0447a implements d.b {
        C0447a() {
        }

        @Override // d.b
        public void a(Context context) {
            a.this.v0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        r0();
    }

    private void r0() {
        addOnContextAvailableListener(new C0447a());
    }

    private void u0() {
        if (getApplication() instanceof mx.b) {
            h b11 = s0().b();
            this.f39477d = b11;
            if (b11.b()) {
                this.f39477d.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // mx.b
    public final Object F() {
        return s0().F();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.l
    public t0.b getDefaultViewModelProviderFactory() {
        return jx.a.a(this, super.getDefaultViewModelProviderFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        u0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f39477d;
        if (hVar != null) {
            hVar.a();
        }
    }

    public final dagger.hilt.android.internal.managers.a s0() {
        if (this.f39478e == null) {
            synchronized (this.f39479f) {
                if (this.f39478e == null) {
                    this.f39478e = t0();
                }
            }
        }
        return this.f39478e;
    }

    protected dagger.hilt.android.internal.managers.a t0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void v0() {
        if (!this.f39480g) {
            this.f39480g = true;
            ((b) F()).h((ImageSliderActivity) mx.d.a(this));
        }
    }
}

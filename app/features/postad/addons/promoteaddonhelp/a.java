package com.forsale.app.features.postad.addons.promoteaddonhelp;

import android.content.Context;
import android.os.Bundle;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.t0;
import com.forsale.app.base.activities.BaseStatefulActivity;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import dagger.hilt.android.internal.managers.h;
/* compiled from: Hilt_PromoteAddonHelpActivity.java */
/* loaded from: classes2.dex */
public abstract class a<B extends ViewDataBinding, VM extends BaseStatefulViewModel> extends BaseStatefulActivity<B, VM> implements mx.b {

    /* renamed from: j  reason: collision with root package name */
    private h f34790j;

    /* renamed from: x  reason: collision with root package name */
    private volatile dagger.hilt.android.internal.managers.a f34791x;

    /* renamed from: y  reason: collision with root package name */
    private final Object f34792y = new Object();

    /* renamed from: z  reason: collision with root package name */
    private boolean f34793z = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Hilt_PromoteAddonHelpActivity.java */
    /* renamed from: com.forsale.app.features.postad.addons.promoteaddonhelp.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0388a implements d.b {
        C0388a() {
        }

        @Override // d.b
        public void a(Context context) {
            a.this.M0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        I0();
    }

    private void I0() {
        addOnContextAvailableListener(new C0388a());
    }

    private void L0() {
        if (getApplication() instanceof mx.b) {
            h b11 = J0().b();
            this.f34790j = b11;
            if (b11.b()) {
                this.f34790j.c(getDefaultViewModelCreationExtras());
            }
        }
    }

    @Override // mx.b
    public final Object F() {
        return J0().F();
    }

    public final dagger.hilt.android.internal.managers.a J0() {
        if (this.f34791x == null) {
            synchronized (this.f34792y) {
                if (this.f34791x == null) {
                    this.f34791x = K0();
                }
            }
        }
        return this.f34791x;
    }

    protected dagger.hilt.android.internal.managers.a K0() {
        return new dagger.hilt.android.internal.managers.a(this);
    }

    protected void M0() {
        if (!this.f34793z) {
            this.f34793z = true;
            ((b) F()).y((PromoteAddonHelpActivity) mx.d.a(this));
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

    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        h hVar = this.f34790j;
        if (hVar != null) {
            hVar.a();
        }
    }
}

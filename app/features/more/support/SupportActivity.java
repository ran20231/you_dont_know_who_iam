package com.forsale.app.features.more.support;

import aa.g0;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.c;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.y0;
import wz.h;
/* compiled from: SupportActivity.kt */
/* loaded from: classes2.dex */
public final class SupportActivity extends com.forsale.app.features.more.support.a<g0, SupportViewModel> {

    /* renamed from: x  reason: collision with root package name */
    public static final a f32788x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f32789y = 8;

    /* renamed from: i  reason: collision with root package name */
    private final h f32790i = new s0(s.b(SupportViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.support.SupportActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.support.SupportActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            return ComponentActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.support.SupportActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                return this.getDefaultViewModelCreationExtras();
            }
            return aVar;
        }
    });

    /* renamed from: j  reason: collision with root package name */
    private final int f32791j = t9.t0.f70280q;

    /* compiled from: SupportActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context) {
            o.i(context, "<this>");
            context.startActivity(new Intent(context, SupportActivity.class));
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            String packageName = SupportActivity.this.getPackageName();
            SupportActivity.this.startActivity(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + packageName)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0() {
        new SupportCallUsBottomSheet().show(getSupportFragmentManager(), "SupportCallUsBottomSheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0() {
        x0().S0().g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0() {
        if (!Settings.canDrawOverlays(this)) {
            String string = getString(y0.f70397c3);
            o.h(string, "getString(...)");
            String string2 = getString(y0.f70380b3);
            o.h(string2, "getString(...)");
            int i11 = y0.Z4;
            int i12 = y0.I4;
            if (ContextExtensionsKt.f(this)) {
                c.a aVar = new c.a(this);
                aVar.p(string);
                aVar.h(string2);
                aVar.m(getString(i11), new b());
                aVar.j(getString(i12), new c());
                aVar.d(false);
                aVar.q();
                return;
            }
            return;
        }
        x0().S0().o(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0() {
        x0().S0().m(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0(String str) {
        x0().S0().r(str);
        x0().S0().p(this);
    }

    private final void Q0() {
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$1(this, null));
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$2(this, null));
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$3(this, null));
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$4(this, null));
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$5(this, null));
        LifeCycleUtilsKt.a(this, new SupportActivity$registerObservers$6(this, null));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: M0 */
    public SupportViewModel x0() {
        return (SupportViewModel) this.f32790i.getValue();
    }

    @Override // com.forsale.app.features.more.support.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((g0) o0()).X);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        Q0();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f32791j;
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class c implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}

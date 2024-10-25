package com.forsale.app.features.more;

import aa.m0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.features.more.CmsViewModel;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.logging.type.LogSeverity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import wz.h;
/* compiled from: WebActivity.kt */
/* loaded from: classes2.dex */
public final class WebActivity extends com.forsale.app.features.more.a<m0, CmsViewModel> {
    public static final a I = new a(null);
    public static final int J = 8;
    public CmsViewModel.a B;
    private final h D;
    private final h E;
    private final h F;
    private final h G;
    private final h H;
    private final int A = t0.f70301t;
    private final h C = new s0(s.b(CmsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.more.WebActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ WebActivity f31598f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, WebActivity webActivity) {
                super(pVar, bundle);
                this.f31598f = webActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                String W0;
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                CmsViewModel.a R0 = this.f31598f.R0();
                W0 = this.f31598f.W0();
                CmsViewModel a11 = R0.a(W0);
                o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                return a11;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            return new a(p.this, p.this.getIntent().getExtras(), this);
        }
    }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));

    /* compiled from: WebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, WebType webType, String str, String str2, int i11, String str3, int i12, Object obj) {
            String str4;
            int i13;
            String str5;
            if ((i12 & 8) != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if ((i12 & 16) != 0) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            if ((i12 & 32) != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            return aVar.a(context, webType, str, str4, i13, str5);
        }

        public static /* synthetic */ void d(a aVar, Context context, WebType webType, String str, String str2, int i11, String str3, int i12, Object obj) {
            String str4;
            int i13;
            String str5;
            if ((i12 & 4) != 0) {
                str4 = "";
            } else {
                str4 = str2;
            }
            if ((i12 & 8) != 0) {
                i13 = 1;
            } else {
                i13 = i11;
            }
            if ((i12 & 16) != 0) {
                str5 = "";
            } else {
                str5 = str3;
            }
            aVar.c(context, webType, str, str4, i13, str5);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[ORIG_RETURN, RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.content.Intent a(android.content.Context r5, com.forsale.app.features.more.WebType r6, java.lang.String r7, java.lang.String r8, int r9, java.lang.String r10) {
            /*
                r4 = this;
                java.lang.String r0 = "webType"
                kotlin.jvm.internal.o.i(r6, r0)
                java.lang.String r0 = "title"
                kotlin.jvm.internal.o.i(r7, r0)
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L16
                boolean r2 = com.forsale.app.features.more.b.a(r5)
                if (r2 != r0) goto L16
                r2 = r0
                goto L17
            L16:
                r2 = r1
            L17:
                if (r2 == 0) goto L4a
                android.content.Intent r2 = new android.content.Intent
                java.lang.Class<com.forsale.app.features.more.WebActivity> r3 = com.forsale.app.features.more.WebActivity.class
                r2.<init>(r5, r3)
                java.lang.String r5 = "ACTIVITY_WEB_TYPE"
                java.lang.String r6 = r6.getValue()
                r2.putExtra(r5, r6)
                java.lang.String r5 = "ACTIVITY_WEB_TITLE"
                r2.putExtra(r5, r7)
                java.lang.String r5 = "ACTIVITY_IS_HTML_RENDER"
                r2.putExtra(r5, r9)
                if (r8 == 0) goto L3d
                int r5 = r8.length()
                if (r5 != 0) goto L3c
                goto L3d
            L3c:
                r0 = r1
            L3d:
                if (r0 != 0) goto L44
                java.lang.String r5 = "ACTIVITY_WEB_URL"
                r2.putExtra(r5, r8)
            L44:
                java.lang.String r5 = "ACTIVITY_WEB_NAME"
                r2.putExtra(r5, r10)
                goto L4b
            L4a:
                r2 = 0
            L4b:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.more.WebActivity.a.a(android.content.Context, com.forsale.app.features.more.WebType, java.lang.String, java.lang.String, int, java.lang.String):android.content.Intent");
        }

        public final void c(Context context, WebType webType, String title, String str, int i11, String str2) {
            o.i(context, "<this>");
            o.i(webType, "webType");
            o.i(title, "title");
            Intent a11 = a(context, webType, title, str, i11, str2);
            if (a11 != null) {
                context.startActivity(a11);
            }
        }

        public final void e(Fragment fragment, WebType webType, String title, String str, int i11, int i12) {
            o.i(fragment, "<this>");
            o.i(webType, "webType");
            o.i(title, "title");
            Intent b11 = b(this, fragment.getContext(), webType, title, str, i11, null, 32, null);
            if (b11 != null) {
                fragment.startActivityForResult(b11, i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<wz.p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            ViewsExtensionsKt.l(WebActivity.this, LogSeverity.CRITICAL_VALUE);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<wz.p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            WebActivity.this.finish();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<Boolean> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Boolean bool, zz.a<? super wz.p> aVar) {
            if (bool != null) {
                WebActivity.this.Q0(bool.booleanValue());
            }
            return wz.p.f75480a;
        }
    }

    public WebActivity() {
        h a11;
        h a12;
        h a13;
        h a14;
        h a15;
        a11 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.WebActivity$webType$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return WebActivity.this.getIntent().getStringExtra("ACTIVITY_WEB_TYPE");
            }
        });
        this.D = a11;
        a12 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.WebActivity$title$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                String stringExtra = WebActivity.this.getIntent().getStringExtra("ACTIVITY_WEB_TITLE");
                return stringExtra == null ? "" : stringExtra;
            }
        });
        this.E = a12;
        a13 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.WebActivity$url$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return WebActivity.this.getIntent().getStringExtra("ACTIVITY_WEB_URL");
            }
        });
        this.F = a13;
        a14 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.more.WebActivity$isHtmlRender$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(WebActivity.this.getIntent().getIntExtra("ACTIVITY_IS_HTML_RENDER", 1));
            }
        });
        this.G = a14;
        a15 = kotlin.d.a(new g00.a<String>() { // from class: com.forsale.app.features.more.WebActivity$name$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final String invoke() {
                return WebActivity.this.getIntent().getStringExtra("ACTIVITY_WEB_NAME");
            }
        });
        this.H = a15;
    }

    public static final /* synthetic */ m0 O0(WebActivity webActivity) {
        return (m0) webActivity.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0(boolean z11) {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A(z11);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(z11);
        }
        androidx.appcompat.app.a supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.u(z11);
        }
    }

    private final String S0() {
        return (String) this.H.getValue();
    }

    private final String T0() {
        return (String) this.E.getValue();
    }

    private final String U0() {
        return (String) this.F.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String W0() {
        return (String) this.D.getValue();
    }

    private final void X0() {
        x0().G0(Z0(), T0(), U0());
    }

    private final void Y0() {
        LifeCycleUtilsKt.a(this, new WebActivity$initializeObservers$1(this, null));
        x0().L0().h(this, new b());
        x0().D0().h(this, new c());
        x0().H0().h(this, new d());
    }

    private final int Z0() {
        return ((Number) this.G.getValue()).intValue();
    }

    public final CmsViewModel.a R0() {
        CmsViewModel.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: V0 */
    public CmsViewModel x0() {
        return (CmsViewModel) this.C.getValue();
    }

    @Override // com.forsale.app.features.more.a, com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        androidx.appcompat.app.a supportActionBar;
        super.onCreate(bundle);
        setSupportActionBar(((m0) o0()).Q);
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        boolean z11 = true;
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
        }
        if (T0().length() <= 0) {
            z11 = false;
        }
        if (z11 && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.D(T0());
        }
        X0();
        Y0();
        x0().V0(S0());
    }

    @Override // com.forsale.app.features.more.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        ((m0) o0()).S.stopLoading();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH, ActionViewsMode.MAINTENANCE_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        X0();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.A;
    }
}

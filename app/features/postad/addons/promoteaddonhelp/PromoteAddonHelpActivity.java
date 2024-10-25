package com.forsale.app.features.postad.addons.promoteaddonhelp;

import aa.y;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.features.postad.addons.promoteaddonhelp.d;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.ViewsExtensionsKt;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kr.b;
import kr.m;
import t9.y0;
import wz.h;
/* compiled from: PromoteAddonHelpActivity.kt */
/* loaded from: classes2.dex */
public final class PromoteAddonHelpActivity extends com.forsale.app.features.postad.addons.promoteaddonhelp.a<y, d> {
    public static final a F = new a(null);
    public static final int G = 8;
    public d.a A;
    private kr.b<m<?>> D;
    private final h B = new s0(s.b(d.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.postad.addons.promoteaddonhelp.PromoteAddonHelpActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ PromoteAddonHelpActivity f34789f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, PromoteAddonHelpActivity promoteAddonHelpActivity) {
                super(pVar, bundle);
                this.f34789f = promoteAddonHelpActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                d.a P0 = this.f34789f.P0();
                String stringExtra = this.f34789f.getIntent().getStringExtra("ACTIVITY_URL");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                o.f(stringExtra);
                d a11 = P0.a(stringExtra, this.f34789f.getIntent().getStringExtra("LISTING_TITLE"), this.f34789f.getIntent().getStringExtra("LISTING_IMAGE"), this.f34789f.getIntent().getStringExtra("CATEGORY_PROMOTE_ANIMATION"));
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
    private final int C = t9.t0.f70252m;
    private final lr.a<m<?>> E = new lr.a<>();

    /* compiled from: PromoteAddonHelpActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void N0(String str, String str2, String str3) {
        kr.b<m<?>> a11 = this.E.a();
        if (a11 != null) {
            a11.o(2L);
        }
    }

    private final void O0() {
        List e11;
        b.a aVar = kr.b.f61943t;
        e11 = q.e(this.E);
        this.D = aVar.g(e11);
        RecyclerView recyclerView = ((y) o0()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        kr.b<m<?>> bVar = this.D;
        if (bVar == null) {
            o.w("fastAdapter");
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
    }

    public final d.a P0() {
        d.a aVar = this.A;
        if (aVar != null) {
            return aVar;
        }
        o.w("promoteAddonHelpVMFactory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: Q0 */
    public d x0() {
        return (d) this.B.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.postad.addons.promoteaddonhelp.a, com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((y) o0()).P);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.C(y0.f70695u);
        }
        WebView webView = ((y) o0()).Q;
        o.h(webView, "webView");
        ViewsExtensionsKt.u(webView, null, x0().w0(), x0().v0(), false, 9, null);
        O0();
        N0(x0().z0(), x0().y0(), x0().x0());
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.C;
    }
}

package com.forsale.app.features.more.mylistings;

import aa.s;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.analytics.AnalyticsType;
import com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity;
import com.forsale.app.features.more.mylistings.l;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import t9.y0;
/* compiled from: MyListingAnalyticsActivity.kt */
/* loaded from: classes2.dex */
public final class MyListingAnalyticsActivity extends com.forsale.app.features.more.mylistings.a<s, l> {

    /* renamed from: i  reason: collision with root package name */
    public l.a f31906i;

    /* renamed from: j  reason: collision with root package name */
    private final wz.h f31907j;

    /* renamed from: x  reason: collision with root package name */
    private final wz.h f31908x;

    /* renamed from: y  reason: collision with root package name */
    private final int f31909y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f31905z = new a(null);
    public static final int A = 8;

    /* compiled from: MyListingAnalyticsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, AnalyticModel analyticModel) {
            o.i(context, "<this>");
            Intent intent = new Intent(context, MyListingAnalyticsActivity.class);
            intent.putExtra("analyticModel", analyticModel);
            context.startActivity(intent);
        }
    }

    public MyListingAnalyticsActivity() {
        wz.h a11;
        a11 = kotlin.d.a(new g00.a<AnalyticModel>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsActivity$analyticModel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AnalyticModel invoke() {
                return (AnalyticModel) MyListingAnalyticsActivity.this.getIntent().getParcelableExtra("analyticModel");
            }
        });
        this.f31907j = a11;
        this.f31908x = new s0(kotlin.jvm.internal.s.b(l.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsActivity$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MyListingAnalyticsActivity f31912f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(p pVar, Bundle bundle, MyListingAnalyticsActivity myListingAnalyticsActivity) {
                    super(pVar, bundle);
                    this.f31912f = myListingAnalyticsActivity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    AnalyticModel L0;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    l.a M0 = this.f31912f.M0();
                    L0 = this.f31912f.L0();
                    o.f(L0);
                    l a11 = M0.a(L0);
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
        this.f31909y = t9.t0.f70231j;
    }

    private final void H0() {
        s sVar = (s) o0();
        Group grpListingViews = sVar.P;
        o.h(grpListingViews, "grpListingViews");
        I0(grpListingViews, AnalyticsType.VIEWS);
        Group grpCallAttempts = sVar.O;
        o.h(grpCallAttempts, "grpCallAttempts");
        I0(grpCallAttempts, AnalyticsType.CALL_ATTEMPTS);
        Group grpPhoneCalls = sVar.Q;
        o.h(grpPhoneCalls, "grpPhoneCalls");
        I0(grpPhoneCalls, AnalyticsType.PHONE_CALLS);
        Group grpPromotionViews = sVar.S;
        o.h(grpPromotionViews, "grpPromotionViews");
        I0(grpPromotionViews, AnalyticsType.PROMOTION_VIEWS);
        Group grpPromotionClicks = sVar.R;
        o.h(grpPromotionClicks, "grpPromotionClicks");
        I0(grpPromotionClicks, AnalyticsType.PROMOTION_CLICKS);
    }

    private final void I0(Group group, final AnalyticsType analyticsType) {
        int[] referencedIds = group.getReferencedIds();
        o.h(referencedIds, "getReferencedIds(...)");
        for (int i11 : referencedIds) {
            findViewById(i11).setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.more.mylistings.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MyListingAnalyticsActivity.J0(MyListingAnalyticsActivity.this, analyticsType, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J0(MyListingAnalyticsActivity this$0, AnalyticsType analyticsType, View view) {
        o.i(this$0, "this$0");
        o.i(analyticsType, "$analyticsType");
        this$0.O0(analyticsType);
    }

    private final void K0() {
        if (!x0().x0()) {
            s sVar = (s) o0();
            sVar.f701g0.setVisibility(8);
            sVar.O.setVisibility(8);
            sVar.Q.setVisibility(8);
        }
        if (!x0().y0()) {
            s sVar2 = (s) o0();
            sVar2.f706l0.setVisibility(8);
            sVar2.S.setVisibility(8);
            sVar2.R.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticModel L0() {
        return (AnalyticModel) this.f31907j.getValue();
    }

    private final void O0(AnalyticsType analyticsType) {
        Integer num;
        MyListingAnalyticsDetailsActivity.a aVar = MyListingAnalyticsDetailsActivity.G;
        AnalyticModel L0 = L0();
        if (L0 != null) {
            num = Integer.valueOf(L0.a());
        } else {
            num = null;
        }
        aVar.a(this, num, analyticsType);
    }

    private final void P0() {
        K0();
        H0();
    }

    public final l.a M0() {
        l.a aVar = this.f31906i;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: N0 */
    public l x0() {
        return (l) this.f31908x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.more.mylistings.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((s) o0()).f699e0);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(getString(y0.P));
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
        }
        x0().w0();
        P0();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f31909y;
    }
}

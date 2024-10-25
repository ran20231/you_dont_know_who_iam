package com.forsale.app.features.search;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.fragment.NavHostFragment;
import com.forsale.app.features.search.SearchSharedViewModel;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.designSystem.theme.ThemeKt;
import com.forsale.ui.components.SearchToolbarKt;
import j0.d1;
import j0.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.r0;
import t9.t0;
/* compiled from: SearchActivity.kt */
/* loaded from: classes2.dex */
public final class SearchActivity extends com.forsale.app.features.search.b<aa.e0, SearchSharedViewModel> {
    public static final a B = new a(null);
    public static final int C = 8;
    private final NavController.b A;

    /* renamed from: j  reason: collision with root package name */
    public SearchSharedViewModel.a f36615j;

    /* renamed from: y  reason: collision with root package name */
    private final wz.h f36617y;

    /* renamed from: z  reason: collision with root package name */
    private final wz.h f36618z;

    /* renamed from: i  reason: collision with root package name */
    private final int f36614i = t0.f70273p;

    /* renamed from: x  reason: collision with root package name */
    private final wz.h f36616x = new s0(kotlin.jvm.internal.s.b(SearchSharedViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.search.SearchActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ SearchActivity f36621f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.fragment.app.p pVar, Bundle bundle, SearchActivity searchActivity) {
                super(pVar, bundle);
                this.f36621f = searchActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                Bundle bundle;
                kotlin.jvm.internal.o.i(key, "key");
                kotlin.jvm.internal.o.i(modelClass, "modelClass");
                kotlin.jvm.internal.o.i(handle, "handle");
                SearchSharedViewModel.a I0 = this.f36621f.I0();
                Bundle extras = this.f36621f.getIntent().getExtras();
                String str = (extras == null || (bundle = extras.getBundle("searchFocusArgs")) == null || (str = bundle.getString("SEARCH_KEYWORD")) == null) ? "" : "";
                kotlin.jvm.internal.o.f(str);
                SearchSharedViewModel a11 = I0.a(str);
                kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
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
            return new a(androidx.fragment.app.p.this, androidx.fragment.app.p.this.getIntent().getExtras(), this);
        }
    }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));

    /* compiled from: SearchActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, Bundle bundle, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bundle = null;
            }
            aVar.a(context, bundle);
        }

        public final void a(Context context, Bundle bundle) {
            kotlin.jvm.internal.o.i(context, "<this>");
            Intent intent = new Intent(context, SearchActivity.class);
            if (bundle != null) {
                intent.putExtra("searchFocusArgs", bundle);
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: SearchActivity.kt */
    /* loaded from: classes2.dex */
    static final class b implements NavController.b {
        b() {
        }

        @Override // androidx.navigation.NavController.b
        public final void a(NavController controller, NavDestination destination, Bundle bundle) {
            kotlin.jvm.internal.o.i(controller, "controller");
            kotlin.jvm.internal.o.i(destination, "destination");
            SearchActivity.this.x0().C0(destination.q());
        }
    }

    public SearchActivity() {
        wz.h a11;
        wz.h a12;
        a11 = kotlin.d.a(new g00.a<NavHostFragment>() { // from class: com.forsale.app.features.search.SearchActivity$navHostFragment$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavHostFragment invoke() {
                Fragment k02 = SearchActivity.this.getSupportFragmentManager().k0(r0.f69862c6);
                kotlin.jvm.internal.o.g(k02, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
                return (NavHostFragment) k02;
            }
        });
        this.f36617y = a11;
        a12 = kotlin.d.a(new g00.a<NavController>() { // from class: com.forsale.app.features.search.SearchActivity$navController$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final NavController invoke() {
                NavHostFragment K0;
                K0 = SearchActivity.this.K0();
                return K0.q();
            }
        });
        this.f36618z = a12;
        this.A = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E0(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(-1563361780);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1563361780, i11, -1, "com.forsale.app.features.search.SearchActivity.SearchBarCompose (SearchActivity.kt:53)");
        }
        if (((Boolean) androidx.compose.runtime.z.a(x0().z0(), Boolean.FALSE, null, h11, 56, 2).getValue()).booleanValue()) {
            SearchToolbarKt.a(null, (String) androidx.compose.runtime.z.a(x0().A0(), "", null, h11, 56, 2).getValue(), new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchActivity$SearchBarCompose$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SearchActivity.this.J0().h0();
                }
            }, new g00.a<wz.p>() { // from class: com.forsale.app.features.search.SearchActivity$SearchBarCompose$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SearchActivity.this.J0().h0();
                }
            }, (String) androidx.compose.runtime.z.a(x0().A0(), "", null, h11, 56, 2).getValue(), null, false, h11, 0, 97);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchActivity$SearchBarCompose$3
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SearchActivity.this.E0(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavHostFragment K0() {
        return (NavHostFragment) this.f36617y.getValue();
    }

    public final SearchSharedViewModel.a I0() {
        SearchSharedViewModel.a aVar = this.f36615j;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.w("factory");
        return null;
    }

    public final NavController J0() {
        return (NavController) this.f36618z.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: L0 */
    public SearchSharedViewModel x0() {
        return (SearchSharedViewModel) this.f36616x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.search.b, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        J0().r(this.A);
        ((aa.e0) o0()).P.setContent(r0.b.c(572025114, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchActivity$onCreate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(572025114, i11, -1, "com.forsale.app.features.search.SearchActivity.onCreate.<anonymous> (SearchActivity.kt:36)");
                }
                final SearchActivity searchActivity = SearchActivity.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1787757091, true, new g00.p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.search.SearchActivity$onCreate$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(1787757091, i12, -1, "com.forsale.app.features.search.SearchActivity.onCreate.<anonymous>.<anonymous> (SearchActivity.kt:37)");
                        }
                        SearchActivity.this.E0(aVar2, 8);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.search.b, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        J0().t0(this.A);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f36614i;
    }
}

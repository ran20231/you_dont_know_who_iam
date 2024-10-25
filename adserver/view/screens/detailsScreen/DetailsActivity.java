package com.forsale.adserver.view.screens.detailsScreen;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.c0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.datalayer.bannerdata.ClickType;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.forsale.adserver.view.screens.detailsScreen.k;
import com.forsale.adserver.view.viewmodel.ImpressionsViewModel;
import j9.f;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Pair;
/* compiled from: DetailsActivity.kt */
/* loaded from: classes2.dex */
public final class DetailsActivity extends l implements p {
    private t8.c B;

    /* renamed from: e  reason: collision with root package name */
    private AdGeneralModel f21145e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f21146f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f21147g;

    /* renamed from: j  reason: collision with root package name */
    private String f21150j;

    /* renamed from: x  reason: collision with root package name */
    private String f21151x;

    /* renamed from: y  reason: collision with root package name */
    private Integer f21152y;

    /* renamed from: z  reason: collision with root package name */
    public ImpressionsViewModel.b f21153z;

    /* renamed from: h  reason: collision with root package name */
    private Integer f21148h = -1;

    /* renamed from: i  reason: collision with root package name */
    private String f21149i = "";
    private final wz.h A = new s0(kotlin.jvm.internal.s.b(ImpressionsViewModel.class), new g00.a<w0>() { // from class: com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.adserver.view.screens.detailsScreen.DetailsActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtensions.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ DetailsActivity f21156f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(androidx.fragment.app.p pVar, Bundle bundle, DetailsActivity detailsActivity) {
                super(pVar, bundle);
                this.f21156f = detailsActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
            @Override // androidx.lifecycle.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected <T extends androidx.lifecycle.q0> T e(java.lang.String r12, java.lang.Class<T> r13, androidx.lifecycle.k0 r14) {
                /*
                    r11 = this;
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.o.i(r12, r0)
                    java.lang.String r12 = "modelClass"
                    kotlin.jvm.internal.o.i(r13, r12)
                    java.lang.String r12 = "handle"
                    kotlin.jvm.internal.o.i(r14, r12)
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r12 = r11.f21156f
                    com.forsale.adserver.view.viewmodel.ImpressionsViewModel$b r12 = r12.G0()
                    com.forsale.adserver.view.viewmodel.ImpressionsViewModel$a r13 = new com.forsale.adserver.view.viewmodel.ImpressionsViewModel$a
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r14 = r11.f21156f
                    com.forsale.adserver.view.models.AdGeneralModel r14 = com.forsale.adserver.view.screens.detailsScreen.DetailsActivity.w0(r14)
                    r0 = 0
                    java.lang.String r1 = "adModel"
                    if (r14 != 0) goto L26
                    kotlin.jvm.internal.o.w(r1)
                    r14 = r0
                L26:
                    int r14 = r14.b()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r2 = r11.f21156f
                    java.lang.String r2 = r2.J0()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r3 = r11.f21156f
                    java.lang.Integer r3 = r3.I0()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r4 = r11.f21156f
                    java.lang.Integer r4 = r4.E0()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r5 = r11.f21156f
                    java.lang.String r5 = r5.D0()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r6 = r11.f21156f
                    java.lang.String r6 = r6.C0()
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r7 = r11.f21156f
                    boolean r7 = com.forsale.adserver.view.screens.detailsScreen.DetailsActivity.z0(r7)
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r8 = r11.f21156f
                    boolean r8 = com.forsale.adserver.view.screens.detailsScreen.DetailsActivity.A0(r8)
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r9 = r11.f21156f
                    com.forsale.adserver.view.models.AdGeneralModel r9 = com.forsale.adserver.view.screens.detailsScreen.DetailsActivity.w0(r9)
                    if (r9 != 0) goto L60
                    kotlin.jvm.internal.o.w(r1)
                    r9 = r0
                L60:
                    java.lang.String r9 = r9.i()
                    m9.d$a r10 = m9.d.f63243a
                    java.lang.String r10 = r10.b()
                    boolean r9 = kotlin.jvm.internal.o.d(r9, r10)
                    r10 = 0
                    if (r9 == 0) goto L93
                    com.forsale.adserver.view.screens.detailsScreen.DetailsActivity r9 = r11.f21156f
                    com.forsale.adserver.view.models.AdGeneralModel r9 = com.forsale.adserver.view.screens.detailsScreen.DetailsActivity.w0(r9)
                    if (r9 != 0) goto L7d
                    kotlin.jvm.internal.o.w(r1)
                    goto L7e
                L7d:
                    r0 = r9
                L7e:
                    java.lang.String r0 = r0.l()
                    r1 = 1
                    if (r0 == 0) goto L8e
                    boolean r0 = kotlin.text.k.v(r0)
                    if (r0 == 0) goto L8c
                    goto L8e
                L8c:
                    r0 = r10
                    goto L8f
                L8e:
                    r0 = r1
                L8f:
                    if (r0 != 0) goto L93
                    r9 = r1
                    goto L94
                L93:
                    r9 = r10
                L94:
                    r0 = r13
                    r1 = r14
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    com.forsale.adserver.view.viewmodel.ImpressionsViewModel r12 = r12.a(r13)
                    java.lang.String r13 = "null cannot be cast to non-null type T of com.forsale.adserver.utils.ViewModelHiltExtensionsKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create"
                    kotlin.jvm.internal.o.g(r12, r13)
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.screens.detailsScreen.DetailsActivity$special$$inlined$assistedViewModel$1.a.e(java.lang.String, java.lang.Class, androidx.lifecycle.k0):androidx.lifecycle.q0");
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
    }, new g00.a<w3.a>() { // from class: com.forsale.adserver.utils.ViewModelHiltExtensionsKt$assistedViewModel$$inlined$viewModels$default$3
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<j9.f> {
        a() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            kotlin.jvm.internal.o.i(it2, "it");
            if (it2 instanceof f.d) {
                AdGeneralModel adGeneralModel = DetailsActivity.this.f21145e;
                AdGeneralModel adGeneralModel2 = null;
                if (adGeneralModel == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel = null;
                }
                Object a11 = ((f.d) it2).a();
                kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type kotlin.Int");
                adGeneralModel.p(((Integer) a11).intValue());
                t8.c cVar = DetailsActivity.this.B;
                if (cVar == null) {
                    kotlin.jvm.internal.o.w("binding");
                    cVar = null;
                }
                TextView likesCounter = cVar.T;
                kotlin.jvm.internal.o.h(likesCounter, "likesCounter");
                AdGeneralModel adGeneralModel3 = DetailsActivity.this.f21145e;
                if (adGeneralModel3 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                } else {
                    adGeneralModel2 = adGeneralModel3;
                }
                m9.f.h(likesCounter, adGeneralModel2.d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<j9.f> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(j9.f it2) {
            kotlin.jvm.internal.o.i(it2, "it");
            if (it2 instanceof f.d) {
                AdGeneralModel adGeneralModel = DetailsActivity.this.f21145e;
                AdGeneralModel adGeneralModel2 = null;
                if (adGeneralModel == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel = null;
                }
                Object a11 = ((f.d) it2).a();
                kotlin.jvm.internal.o.g(a11, "null cannot be cast to non-null type kotlin.Int");
                adGeneralModel.q(((Integer) a11).intValue());
                t8.c cVar = DetailsActivity.this.B;
                if (cVar == null) {
                    kotlin.jvm.internal.o.w("binding");
                    cVar = null;
                }
                TextView viewsCounter = cVar.V;
                kotlin.jvm.internal.o.h(viewsCounter, "viewsCounter");
                AdGeneralModel adGeneralModel3 = DetailsActivity.this.f21145e;
                if (adGeneralModel3 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                } else {
                    adGeneralModel2 = adGeneralModel3;
                }
                m9.f.h(viewsCounter, adGeneralModel2.m());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements c0<Pair<? extends j9.f, ? extends Integer>> {
        c() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<? extends j9.f, Integer> it2) {
            boolean z11;
            kotlin.jvm.internal.o.i(it2, "it");
            j9.f c11 = it2.c();
            t8.c cVar = null;
            AdGeneralModel adGeneralModel = null;
            if (c11 instanceof f.d) {
                AdGeneralModel adGeneralModel2 = DetailsActivity.this.f21145e;
                if (adGeneralModel2 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel2 = null;
                }
                int d11 = adGeneralModel2.d();
                Integer d12 = it2.d();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AdServer Likes Old: ");
                sb2.append(d11);
                sb2.append(" New: ");
                sb2.append(d12);
                AdGeneralModel adGeneralModel3 = DetailsActivity.this.f21145e;
                if (adGeneralModel3 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel3 = null;
                }
                if (adGeneralModel3.d() != it2.d().intValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AdGeneralModel adGeneralModel4 = DetailsActivity.this.f21145e;
                if (adGeneralModel4 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel4 = null;
                }
                adGeneralModel4.o(true);
                AdGeneralModel adGeneralModel5 = DetailsActivity.this.f21145e;
                if (adGeneralModel5 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                    adGeneralModel5 = null;
                }
                adGeneralModel5.p(it2.d().intValue());
                t8.c cVar2 = DetailsActivity.this.B;
                if (cVar2 == null) {
                    kotlin.jvm.internal.o.w("binding");
                    cVar2 = null;
                }
                TextView likesCounter = cVar2.T;
                kotlin.jvm.internal.o.h(likesCounter, "likesCounter");
                AdGeneralModel adGeneralModel6 = DetailsActivity.this.f21145e;
                if (adGeneralModel6 == null) {
                    kotlin.jvm.internal.o.w("adModel");
                } else {
                    adGeneralModel = adGeneralModel6;
                }
                m9.f.h(likesCounter, adGeneralModel.d());
                if (z11) {
                    DetailsActivity.this.H0().t();
                }
            } else if (c11 instanceof f.b) {
                t8.c cVar3 = DetailsActivity.this.B;
                if (cVar3 == null) {
                    kotlin.jvm.internal.o.w("binding");
                } else {
                    cVar = cVar3;
                }
                cVar.T.setClickable(true);
            }
        }
    }

    /* compiled from: DetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f21160a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DetailsActivity f21161b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f21162c;

        d(LinearLayoutManager linearLayoutManager, DetailsActivity detailsActivity, int i11) {
            this.f21160a = linearLayoutManager;
            this.f21161b = detailsActivity;
            this.f21162c = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            kotlin.jvm.internal.o.i(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i11, i12);
            int s22 = this.f21160a.s2();
            if (s22 != -1) {
                t8.c cVar = this.f21161b.B;
                if (cVar == null) {
                    kotlin.jvm.internal.o.w("binding");
                    cVar = null;
                }
                TextView textView = cVar.U;
                int i13 = this.f21162c;
                textView.setText((s22 + 1) + " / " + i13);
            }
        }
    }

    private final String B0(boolean z11, int i11) {
        if (z11) {
            return "https://www.q84sale.com/sharing/index.php/offer/" + i11;
        }
        return "https://www.q84sale.com/sharing/index.php/banner/" + i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImpressionsViewModel H0() {
        return (ImpressionsViewModel) this.A.getValue();
    }

    private final void K0() {
        H0().k().observe(this, new a());
    }

    private final void L0() {
        H0().l().observe(this, new b());
    }

    private final void M0() {
        H0().o().observe(this, new c());
    }

    private final void N0() {
        t8.c cVar = this.B;
        t8.c cVar2 = null;
        if (cVar == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar = null;
        }
        cVar.Q.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsActivity.O0(DetailsActivity.this, view);
            }
        });
        t8.c cVar3 = this.B;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar3 = null;
        }
        cVar3.T.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsActivity.P0(DetailsActivity.this, view);
            }
        });
        t8.c cVar4 = this.B;
        if (cVar4 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar4 = null;
        }
        cVar4.P.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsActivity.Q0(DetailsActivity.this, view);
            }
        });
        t8.c cVar5 = this.B;
        if (cVar5 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar5 = null;
        }
        cVar5.X.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsActivity.R0(DetailsActivity.this, view);
            }
        });
        t8.c cVar6 = this.B;
        if (cVar6 == null) {
            kotlin.jvm.internal.o.w("binding");
        } else {
            cVar2 = cVar6;
        }
        cVar2.W.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailsActivity.S0(DetailsActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O0(DetailsActivity this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P0(DetailsActivity this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        AdGeneralModel adGeneralModel = this$0.f21145e;
        t8.c cVar = null;
        if (adGeneralModel == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel = null;
        }
        if (!adGeneralModel.n()) {
            ImpressionsViewModel H0 = this$0.H0();
            boolean z11 = this$0.f21146f;
            AdGeneralModel adGeneralModel2 = this$0.f21145e;
            if (adGeneralModel2 == null) {
                kotlin.jvm.internal.o.w("adModel");
                adGeneralModel2 = null;
            }
            int b11 = adGeneralModel2.b();
            ClickType clickType = ClickType.LIKE;
            AdGeneralModel adGeneralModel3 = this$0.f21145e;
            if (adGeneralModel3 == null) {
                kotlin.jvm.internal.o.w("adModel");
                adGeneralModel3 = null;
            }
            H0.r(z11, b11, clickType, adGeneralModel3.d());
            t8.c cVar2 = this$0.B;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.w("binding");
            } else {
                cVar = cVar2;
            }
            cVar.T.setClickable(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q0(DetailsActivity this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        k.a aVar = k.f21363f;
        AdGeneralModel adGeneralModel = this$0.f21145e;
        if (adGeneralModel == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel = null;
        }
        String g11 = adGeneralModel.g();
        if (g11 == null) {
            g11 = "";
        }
        k.a.b(aVar, g11, null, 2, null).show(this$0.getSupportFragmentManager(), "dial dialog");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R0(DetailsActivity this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        boolean z11 = this$0.f21146f;
        AdGeneralModel adGeneralModel = this$0.f21145e;
        if (adGeneralModel == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel = null;
        }
        m9.f.l(this$0, this$0.B0(z11, adGeneralModel.b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S0(DetailsActivity this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        AdGeneralModel adGeneralModel = this$0.f21145e;
        if (adGeneralModel == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel = null;
        }
        String j11 = adGeneralModel.j();
        if (j11 != null) {
            m9.f.g(this$0, j11);
        }
        this$0.H0().v();
    }

    private final void T0(ArrayList<String> arrayList) {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 0, false);
        t8.c cVar = this.B;
        t8.c cVar2 = null;
        if (cVar == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar = null;
        }
        cVar.R.setLayoutManager(linearLayoutManager);
        t8.c cVar3 = this.B;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar3 = null;
        }
        cVar3.R.setHasFixedSize(true);
        t8.c cVar4 = this.B;
        if (cVar4 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar4 = null;
        }
        cVar4.R.setNestedScrollingEnabled(false);
        int size = arrayList.size();
        androidx.recyclerview.widget.r rVar = new androidx.recyclerview.widget.r();
        t tVar = new t(arrayList, this);
        t8.c cVar5 = this.B;
        if (cVar5 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar5 = null;
        }
        cVar5.R.setAdapter(tVar);
        t8.c cVar6 = this.B;
        if (cVar6 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar6 = null;
        }
        rVar.b(cVar6.R);
        t8.c cVar7 = this.B;
        if (cVar7 == null) {
            kotlin.jvm.internal.o.w("binding");
        } else {
            cVar2 = cVar7;
        }
        cVar2.R.n(new d(linearLayoutManager, this, size));
    }

    public final String C0() {
        return this.f21151x;
    }

    public final String D0() {
        return this.f21150j;
    }

    public final Integer E0() {
        return this.f21152y;
    }

    public final ImpressionsViewModel.b G0() {
        ImpressionsViewModel.b bVar = this.f21153z;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.w("factory");
        return null;
    }

    public final Integer I0() {
        return this.f21148h;
    }

    public final String J0() {
        return this.f21149i;
    }

    @Override // com.forsale.adserver.view.screens.detailsScreen.p
    public void c(String imgUrl) {
        kotlin.jvm.internal.o.i(imgUrl, "imgUrl");
        s.f21381f.a(imgUrl).show(getSupportFragmentManager(), "save image");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.adserver.view.screens.detailsScreen.l, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        ViewDataBinding j11 = androidx.databinding.g.j(this, l8.g.f62314b);
        kotlin.jvm.internal.o.h(j11, "setContentView(...)");
        this.B = (t8.c) j11;
        Serializable serializableExtra = getIntent().getSerializableExtra("AD_DETAILS");
        kotlin.jvm.internal.o.g(serializableExtra, "null cannot be cast to non-null type com.forsale.adserver.view.models.AdGeneralModel");
        this.f21145e = (AdGeneralModel) serializableExtra;
        this.f21146f = getIntent().getBooleanExtra("IS_OFFER", false);
        this.f21147g = getIntent().getBooleanExtra("IS_SPLASH", false);
        this.f21148h = Integer.valueOf(getIntent().getIntExtra("OFFER_CATEGORY_ID", 0));
        this.f21149i = getIntent().getStringExtra("OFFER_CATEGORY_NAME");
        this.f21150j = getIntent().getStringExtra("BANNER_TYPE");
        this.f21151x = getIntent().getStringExtra("BANNER_SCREEN");
        this.f21152y = Integer.valueOf(getIntent().getIntExtra("CATEGORY_ID", 0));
        t8.c cVar = this.B;
        AdGeneralModel adGeneralModel = null;
        if (cVar == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar = null;
        }
        AdGeneralModel adGeneralModel2 = this.f21145e;
        if (adGeneralModel2 == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel2 = null;
        }
        cVar.f0(adGeneralModel2);
        AdGeneralModel adGeneralModel3 = this.f21145e;
        if (adGeneralModel3 == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel3 = null;
        }
        T0(m9.b.b(adGeneralModel3));
        M0();
        N0();
        AdGeneralModel adGeneralModel4 = this.f21145e;
        if (adGeneralModel4 == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel4 = null;
        }
        if (adGeneralModel4.d() == 0) {
            K0();
            ImpressionsViewModel H0 = H0();
            boolean z11 = this.f21146f;
            AdGeneralModel adGeneralModel5 = this.f21145e;
            if (adGeneralModel5 == null) {
                kotlin.jvm.internal.o.w("adModel");
                adGeneralModel5 = null;
            }
            H0.p(z11, adGeneralModel5.b());
        } else {
            t8.c cVar2 = this.B;
            if (cVar2 == null) {
                kotlin.jvm.internal.o.w("binding");
                cVar2 = null;
            }
            TextView likesCounter = cVar2.T;
            kotlin.jvm.internal.o.h(likesCounter, "likesCounter");
            AdGeneralModel adGeneralModel6 = this.f21145e;
            if (adGeneralModel6 == null) {
                kotlin.jvm.internal.o.w("adModel");
                adGeneralModel6 = null;
            }
            m9.f.h(likesCounter, adGeneralModel6.d());
        }
        AdGeneralModel adGeneralModel7 = this.f21145e;
        if (adGeneralModel7 == null) {
            kotlin.jvm.internal.o.w("adModel");
            adGeneralModel7 = null;
        }
        if (adGeneralModel7.m() == 0) {
            L0();
            return;
        }
        t8.c cVar3 = this.B;
        if (cVar3 == null) {
            kotlin.jvm.internal.o.w("binding");
            cVar3 = null;
        }
        TextView viewsCounter = cVar3.V;
        kotlin.jvm.internal.o.h(viewsCounter, "viewsCounter");
        AdGeneralModel adGeneralModel8 = this.f21145e;
        if (adGeneralModel8 == null) {
            kotlin.jvm.internal.o.w("adModel");
        } else {
            adGeneralModel = adGeneralModel8;
        }
        m9.f.h(viewsCounter, adGeneralModel.m());
    }
}

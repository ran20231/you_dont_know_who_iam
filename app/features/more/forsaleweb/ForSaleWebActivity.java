package com.forsale.app.features.more.forsaleweb;

import aa.e;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.entities.qrsessions.ForSaleWebSession;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.more.forsaleweb.ForSaleWebViewModel;
import com.forsale.app.ui.QRScannerActivity;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import t9.y0;
import wz.h;
/* compiled from: ForSaleWebActivity.kt */
/* loaded from: classes2.dex */
public final class ForSaleWebActivity extends com.forsale.app.features.more.forsaleweb.c<e, ForSaleWebViewModel> {
    public static final a B = new a(null);
    public static final int C = 8;
    public ApplicationResourcesRepository A;

    /* renamed from: i  reason: collision with root package name */
    private kr.b<m<?>> f31868i;

    /* renamed from: j  reason: collision with root package name */
    private lr.a<m<?>> f31869j;

    /* renamed from: x  reason: collision with root package name */
    public ForSaleWebViewModel.a f31870x;

    /* renamed from: y  reason: collision with root package name */
    private final h f31871y = new s0(s.b(ForSaleWebViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.more.forsaleweb.ForSaleWebActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ForSaleWebActivity f31875f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, ForSaleWebActivity forSaleWebActivity) {
                super(pVar, bundle);
                this.f31875f = forSaleWebActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                ForSaleWebViewModel a11 = this.f31875f.G0().a(this.f31875f.getIntent().getParcelableArrayListExtra("qr_sessions_extra_name"));
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

    /* renamed from: z  reason: collision with root package name */
    private final int f31872z = t9.t0.f70182c;

    /* compiled from: ForSaleWebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, List<ForSaleWebSession> qrSessions) {
            o.i(context, "context");
            o.i(qrSessions, "qrSessions");
            Intent intent = new Intent(context, ForSaleWebActivity.class);
            intent.putParcelableArrayListExtra("qr_sessions_extra_name", new ArrayList<>(qrSessions));
            context.startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForSaleWebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0<List<? extends ForSaleWebSession>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(List<ForSaleWebSession> list) {
            int y11;
            if (list != null) {
                List<ForSaleWebSession> list2 = list;
                ForSaleWebActivity forSaleWebActivity = ForSaleWebActivity.this;
                y11 = kotlin.collections.s.y(list2, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (ForSaleWebSession forSaleWebSession : list2) {
                    td.a aVar = new td.a(new td.b(forSaleWebSession, forSaleWebActivity.H0()));
                    aVar.o(forSaleWebSession.getId());
                    arrayList.add(aVar);
                }
                ForSaleWebActivity forSaleWebActivity2 = ForSaleWebActivity.this;
                lr.a aVar2 = forSaleWebActivity2.f31869j;
                lr.a aVar3 = null;
                if (aVar2 == null) {
                    o.w("sessionsAdapter");
                    aVar2 = null;
                }
                aVar2.q();
                lr.a aVar4 = forSaleWebActivity2.f31869j;
                if (aVar4 == null) {
                    o.w("sessionsAdapter");
                } else {
                    aVar3 = aVar4;
                }
                aVar3.m(arrayList);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForSaleWebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<wz.p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            ForSaleWebActivity.this.x0().G0();
            QRScannerActivity.f37827g.a(ForSaleWebActivity.this, 1000);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForSaleWebActivity.kt */
    /* loaded from: classes2.dex */
    public static final class d implements FlowCollector<wz.p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            ForSaleWebActivity.this.finish();
            return wz.p.f75480a;
        }
    }

    private final void J0() {
        x0().A0().observe(this, new b());
        x0().z0().h(this, new c());
        x0().B0().h(this, new d());
    }

    public final ForSaleWebViewModel.a G0() {
        ForSaleWebViewModel.a aVar = this.f31870x;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ApplicationResourcesRepository H0() {
        ApplicationResourcesRepository applicationResourcesRepository = this.A;
        if (applicationResourcesRepository != null) {
            return applicationResourcesRepository;
        }
        o.w("resourcesRepository");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: I0 */
    public ForSaleWebViewModel x0() {
        return (ForSaleWebViewModel) this.f31871y.getValue();
    }

    public final void K0() {
        setSupportActionBar(((e) o0()).U);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.C(y0.f70668s4);
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
        }
        lr.a<m<?>> aVar = new lr.a<>();
        this.f31869j = aVar;
        kr.b<m<?>> i11 = kr.b.f61943t.i(aVar);
        this.f31868i = i11;
        kr.b<m<?>> bVar = null;
        if (i11 == null) {
            o.w("fastAdapter");
            i11 = null;
        }
        i11.setHasStableIds(true);
        RecyclerView recyclerView = ((e) o0()).R;
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        kr.b<m<?>> bVar2 = this.f31868i;
        if (bVar2 == null) {
            o.w("fastAdapter");
        } else {
            bVar = bVar2;
        }
        recyclerView.setAdapter(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        String stringExtra;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1000 && i12 == -1 && intent != null && (stringExtra = intent.getStringExtra("QR_RESULT_KEY")) != null) {
            x0().I0(stringExtra);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.more.forsaleweb.c, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        K0();
        J0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        o.i(outState, "outState");
        super.onSaveInstanceState(outState);
        kr.b<m<?>> bVar = this.f31868i;
        if (bVar == null) {
            o.w("fastAdapter");
            bVar = null;
        }
        kr.b.V(bVar, outState, null, 2, null);
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f31872z;
    }
}

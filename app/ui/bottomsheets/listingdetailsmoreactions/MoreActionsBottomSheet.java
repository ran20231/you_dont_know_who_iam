package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import aa.c8;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import com.forsale.app.features.categories.listingdetails.ListingDetailsSearchAnalyticsData;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.userinfoitem.UserInfoViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.listingfiltration.ListingsAnalytics$FiltersPlace;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowCollector;
import kr.m;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: MoreActionsBottomSheet.kt */
/* loaded from: classes3.dex */
public final class MoreActionsBottomSheet extends tg.a<c8, com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b> {
    public static final a J = new a(null);
    public static final int K = 8;
    private List<String> A;
    private int B = -1;
    private g00.a<p> C;
    public b.a D;
    private final h E;
    private final int F;
    private final h G;
    public AnalyticsService H;
    public AggregatedAllAnalyticsLogger I;

    /* renamed from: j  reason: collision with root package name */
    public tg.c f38364j;

    /* renamed from: x  reason: collision with root package name */
    private String f38365x;

    /* renamed from: y  reason: collision with root package name */
    private ListingDetailsSearchAnalyticsData f38366y;

    /* renamed from: z  reason: collision with root package name */
    private ListingsAnalytics$FiltersPlace f38367z;

    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            MoreActionsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<List<? extends String>> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(List<String> list, zz.a<? super p> aVar) {
            if (list != null) {
                MoreActionsBottomSheet.this.M(list);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class d implements FlowCollector<p> {
        d() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            MoreActionsBottomSheet.this.O();
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class e implements FlowCollector<String> {
        e() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super p> aVar) {
            if (str != null) {
                MoreActionsBottomSheet.this.S(str);
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class f implements FlowCollector<p> {
        f() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            if (pVar != null) {
                MoreActionsBottomSheet.this.T();
            }
            return p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MoreActionsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class g implements FlowCollector<List<? extends String>> {
        g() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(List<String> list, zz.a<? super p> aVar) {
            if (list != null) {
                MoreActionsBottomSheet.this.V(list);
            }
            return p.f75480a;
        }
    }

    public MoreActionsBottomSheet() {
        h b11;
        h a11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ MoreActionsBottomSheet f38370f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, MoreActionsBottomSheet moreActionsBottomSheet) {
                    super(fragment, bundle);
                    this.f38370f = moreActionsBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    b a11 = this.f38370f.c0().a(this.f38370f.g0(), this.f38370f.h0(), this.f38370f.j0(), this.f38370f.d0(), this.f38370f.i0(), this.f38370f.e0());
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
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.E = FragmentViewModelLazyKt.b(this, s.b(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
        this.F = t9.t0.C1;
        a11 = kotlin.d.a(new g00.a<lr.a<m<?>>>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet$itemsAdapter$2
            @Override // g00.a
            /* renamed from: b */
            public final lr.a<m<?>> invoke() {
                return new lr.a<>();
            }
        });
        this.G = a11;
    }

    private final void K(UserContactType userContactType, String str) {
        BuildersKt__Builders_commonKt.launch$default(t(), null, null, new MoreActionsBottomSheet$addWhatsAppItem$1(this, userContactType, str, null), 3, null);
    }

    static /* synthetic */ void L(MoreActionsBottomSheet moreActionsBottomSheet, UserContactType userContactType, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        moreActionsBottomSheet.K(userContactType, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(List<String> list) {
        BuildersKt__Builders_commonKt.launch$default(t(), null, null, new MoreActionsBottomSheet$bindCalls$1(list, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        BuildersKt__Builders_commonKt.launch$default(t(), null, null, new MoreActionsBottomSheet$bindChat$1(this, null), 3, null);
    }

    private final void Q() {
        UserInfoViewModel i11 = g0().i();
        if (i11 != null) {
            lr.a<m<?>> f02 = f0();
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            f02.n(new tg.d(i11, viewLifecycleOwner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(String str) {
        K(UserContactType.WHATS_APP, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T() {
        L(this, UserContactType.WHATS_APP_MULTIPLE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(List<String> list) {
        BuildersKt__Builders_commonKt.launch$default(t(), null, null, new MoreActionsBottomSheet$bindWhatsAppMultipleItems$1(list, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactType r38, java.lang.String r39, boolean r40, zz.a<? super com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel> r41) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet.X(com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactType, java.lang.String, boolean, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object Y(MoreActionsBottomSheet moreActionsBottomSheet, UserContactType userContactType, String str, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return moreActionsBottomSheet.X(userContactType, str, z11, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lr.a<m<?>> f0() {
        return (lr.a) this.G.getValue();
    }

    private final void l0() {
        OneShotEventHandler<p> x02 = t().x0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        x02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<List<String>> A0 = t().A0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner2, new c());
        OneShotEventHandler<p> B0 = t().B0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        B0.h(viewLifecycleOwner3, new d());
        OneShotEventHandler<String> E0 = t().E0();
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        E0.h(viewLifecycleOwner4, new e());
        OneShotEventHandler<p> C0 = t().C0();
        androidx.lifecycle.s viewLifecycleOwner5 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C0.h(viewLifecycleOwner5, new f());
        OneShotEventHandler<List<String>> D0 = t().D0();
        androidx.lifecycle.s viewLifecycleOwner6 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        D0.h(viewLifecycleOwner6, new g());
    }

    private final void t0() {
        RecyclerView recyclerView = ((c8) r()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(kr.b.f61943t.i(f0()));
    }

    public final AnalyticsService a0() {
        AnalyticsService analyticsService = this.H;
        if (analyticsService != null) {
            return analyticsService;
        }
        o.w("analysisService");
        return null;
    }

    public final AggregatedAllAnalyticsLogger b0() {
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.I;
        if (aggregatedAllAnalyticsLogger != null) {
            return aggregatedAllAnalyticsLogger;
        }
        o.w("analyticsLogger");
        return null;
    }

    public final b.a c0() {
        b.a aVar = this.D;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    public final ListingsAnalytics$FiltersPlace d0() {
        return this.f38367z;
    }

    public final int e0() {
        return this.B;
    }

    public final tg.c g0() {
        tg.c cVar = this.f38364j;
        if (cVar != null) {
            return cVar;
        }
        o.w("moreActionsModel");
        return null;
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    public final ListingDetailsSearchAnalyticsData h0() {
        return this.f38366y;
    }

    public final String i0() {
        return this.f38365x;
    }

    public final List<String> j0() {
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: k0 */
    public com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b t() {
        return (com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.b) this.E.getValue();
    }

    public final void m0(ListingsAnalytics$FiltersPlace listingsAnalytics$FiltersPlace) {
        this.f38367z = listingsAnalytics$FiltersPlace;
    }

    public final void o0(int i11) {
        this.B = i11;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        g00.a<p> aVar = this.C;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("MoreActionsBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        if (this.f38364j == null) {
            dismiss();
            return;
        }
        super.onViewCreated(view, bundle);
        t0();
        Q();
        l0();
    }

    public final void p0(tg.c cVar) {
        o.i(cVar, "<set-?>");
        this.f38364j = cVar;
    }

    public final void q0(ListingDetailsSearchAnalyticsData listingDetailsSearchAnalyticsData) {
        this.f38366y = listingDetailsSearchAnalyticsData;
    }

    public final void r0(String str) {
        this.f38365x = str;
    }

    @Override // w9.b
    protected int s() {
        return this.F;
    }

    public final void s0(List<String> list) {
        this.A = list;
    }
}

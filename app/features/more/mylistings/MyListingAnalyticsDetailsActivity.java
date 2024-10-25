package com.forsale.app.features.more.mylistings;

import aa.u;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.analytics.AnalyticsType;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.datalayer.network.responses.ListingAnalyticsResponse;
import com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.t;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.j0;
import kotlin.collections.r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.y0;
/* compiled from: MyListingAnalyticsDetailsActivity.kt */
/* loaded from: classes2.dex */
public final class MyListingAnalyticsDetailsActivity extends com.forsale.app.features.more.mylistings.b<u, MyListingAnalyticsDetailsViewModel> {
    public MyListingAnalyticsDetailsViewModel.a B;
    private final wz.h D;
    private final wz.h E;
    private final t F;
    static final /* synthetic */ n00.k<Object>[] H = {s.g(new PropertyReference1Impl(MyListingAnalyticsDetailsActivity.class, "writePermission", "getWritePermission()Lcom/forsale/app/utils/PermissionsManager;", 0))};
    public static final a G = new a(null);
    public static final int I = 8;
    private final int A = t0.f70238k;
    private final wz.h C = new s0(s.b(MyListingAnalyticsDetailsViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ MyListingAnalyticsDetailsActivity f31916f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, MyListingAnalyticsDetailsActivity myListingAnalyticsDetailsActivity) {
                super(pVar, bundle);
                this.f31916f = myListingAnalyticsDetailsActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                int f12;
                AnalyticsType i12;
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                MyListingAnalyticsDetailsViewModel.a j12 = this.f31916f.j1();
                f12 = this.f31916f.f1();
                i12 = this.f31916f.i1();
                MyListingAnalyticsDetailsViewModel a11 = j12.a(f12, i12);
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

    /* compiled from: MyListingAnalyticsDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Integer num, AnalyticsType analyticsType) {
            o.i(context, "<this>");
            o.i(analyticsType, "analyticsType");
            Intent intent = new Intent(context, MyListingAnalyticsDetailsActivity.class);
            intent.putExtra("ADV_ID", num);
            intent.putExtra("ANALYTICS_TYPE", analyticsType.name());
            context.startActivity(intent);
        }
    }

    /* compiled from: MyListingAnalyticsDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f31919a;

        static {
            int[] iArr = new int[AnalyticsType.values().length];
            try {
                iArr[AnalyticsType.VIEWS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnalyticsType.CALL_ATTEMPTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnalyticsType.PHONE_CALLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnalyticsType.VOIP_CALLS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnalyticsType.VIDEO_CALLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnalyticsType.PROMOTION_VIEWS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnalyticsType.PROMOTION_CLICKS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AnalyticsType.WHATSAPP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AnalyticsType.WHATSAPP_APP_ICON.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AnalyticsType.CHAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f31919a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MyListingAnalyticsDetailsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class c implements FlowCollector<ListingAnalyticsResponse> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(ListingAnalyticsResponse listingAnalyticsResponse, zz.a<? super wz.p> aVar) {
            if (listingAnalyticsResponse != null) {
                MyListingAnalyticsDetailsActivity.this.W0(listingAnalyticsResponse);
            }
            return wz.p.f75480a;
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
            MyListingAnalyticsDetailsActivity.this.r1();
        }
    }

    public MyListingAnalyticsDetailsActivity() {
        wz.h a11;
        wz.h a12;
        a11 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity$advId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(MyListingAnalyticsDetailsActivity.this.getIntent().getIntExtra("ADV_ID", -1));
            }
        });
        this.D = a11;
        a12 = kotlin.d.a(new g00.a<AnalyticsType>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity$analyticsType$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final AnalyticsType invoke() {
                AnalyticsType valueOf;
                String stringExtra = MyListingAnalyticsDetailsActivity.this.getIntent().getStringExtra("ANALYTICS_TYPE");
                if (stringExtra == null || (valueOf = AnalyticsType.valueOf(stringExtra)) == null) {
                    return AnalyticsType.VIEWS;
                }
                return valueOf;
            }
        });
        this.E = a12;
        this.F = t.f40536d.a(1001, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static final /* synthetic */ u U0(MyListingAnalyticsDetailsActivity myListingAnalyticsDetailsActivity) {
        return (u) myListingAnalyticsDetailsActivity.o0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(final ListingAnalyticsResponse listingAnalyticsResponse) {
        v1(e1(listingAnalyticsResponse.getTotal()));
        q1(listingAnalyticsResponse);
        t1(listingAnalyticsResponse.getAnalytics().size());
        ((u) o0()).R.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.more.mylistings.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListingAnalyticsDetailsActivity.X0(MyListingAnalyticsDetailsActivity.this, listingAnalyticsResponse, view);
            }
        });
        ((u) o0()).S.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.more.mylistings.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListingAnalyticsDetailsActivity.Y0(MyListingAnalyticsDetailsActivity.this, listingAnalyticsResponse, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X0(MyListingAnalyticsDetailsActivity this$0, ListingAnalyticsResponse analyticsResponse, View view) {
        o.i(this$0, "this$0");
        o.i(analyticsResponse, "$analyticsResponse");
        if (this$0.x0().I0(analyticsResponse.getAnalytics().size())) {
            this$0.x0().K0();
            this$0.q1(analyticsResponse);
        }
        this$0.t1(analyticsResponse.getAnalytics().size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y0(MyListingAnalyticsDetailsActivity this$0, ListingAnalyticsResponse analyticsResponse, View view) {
        o.i(this$0, "this$0");
        o.i(analyticsResponse, "$analyticsResponse");
        if (this$0.x0().J0()) {
            this$0.x0().y0();
            this$0.q1(analyticsResponse);
        }
        this$0.t1(analyticsResponse.getAnalytics().size());
    }

    private final void Z0() {
        x0().L0();
        x0().A0().h(this, new c());
    }

    private final void b1(String str, List<? extends Map<String, Integer>> list) {
        Object i11;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        for (Object obj : x0().C0()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                r.x();
            }
            for (String str2 : ((Map) obj).keySet()) {
                i11 = j0.i(list.get(i12), str2);
                arrayList.add(new BarEntry(i12, ((Number) i11).intValue()));
            }
            i12 = i13;
        }
        BarDataSet barDataSet = new BarDataSet(arrayList, str);
        int[] iArr = ColorTemplate.MATERIAL_COLORS;
        barDataSet.setColors(Arrays.copyOf(iArr, iArr.length));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(barDataSet);
        BarChart barChart = ((u) o0()).P;
        barChart.setData(new BarData(arrayList2));
        ((BarData) barChart.getData()).notifyDataChanged();
        barChart.notifyDataSetChanged();
        barChart.refreshDrawableState();
        barChart.invalidate();
    }

    private final void c1(boolean z11) {
        x0().E0().k(z11);
    }

    private final void d1(boolean z11) {
        x0().G0().k(z11);
    }

    private final String e1(int i11) {
        String string = getString(y0.Q);
        String g12 = g1();
        String string2 = getString(y0.J);
        return i11 + " " + string + " " + g12 + " " + string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int f1() {
        return ((Number) this.D.getValue()).intValue();
    }

    private final String g1() {
        switch (b.f31919a[i1().ordinal()]) {
            case 1:
                String string = getString(y0.H);
                o.h(string, "getString(...)");
                return string;
            case 2:
                String string2 = getString(y0.G);
                o.h(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = getString(y0.K);
                o.h(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = getString(y0.S);
                o.h(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = getString(y0.R);
                o.h(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = getString(y0.M);
                o.h(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = getString(y0.L);
                o.h(string7, "getString(...)");
                return string7;
            case 8:
                throw new Exception("WhatsApp Analytics not implemented yet");
            case 9:
                return "WhatsAppClicked";
            case 10:
                return "chat";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final String h1() {
        String string = getString(y0.Q);
        String g12 = g1();
        String string2 = getString(y0.J);
        return string + " " + g12 + " " + string2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsType i1() {
        return (AnalyticsType) this.E.getValue();
    }

    private final com.forsale.app.utils.u l1() {
        return this.F.a(this, H[0]);
    }

    private final void m1() {
        int y11;
        final List X0;
        BarChart barChart = ((u) o0()).P;
        barChart.setDrawBarShadow(false);
        barChart.setDrawValueAboveBar(true);
        barChart.getDescription().setEnabled(false);
        barChart.setNoDataText(getString(y0.I));
        barChart.setMaxVisibleValueCount(24);
        barChart.setPinchZoom(false);
        barChart.setDrawGridBackground(false);
        List<Map<String, String>> C0 = x0().C0();
        y11 = kotlin.collections.s.y(C0, 10);
        ArrayList arrayList = new ArrayList(y11);
        Iterator<T> it2 = C0.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map) it2.next()).values());
        }
        X0 = CollectionsKt___CollectionsKt.X0(arrayList);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setPosition(XAxis.XAxisPosition.BOTTOM);
        xAxis.setAxisMinimum(0.0f);
        xAxis.setDrawGridLines(false);
        xAxis.setGranularity(1.0f);
        xAxis.setLabelCount(6);
        xAxis.setValueFormatter(new IAxisValueFormatter() { // from class: com.forsale.app.features.more.mylistings.i
            @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
            public final String getFormattedValue(float f11, AxisBase axisBase) {
                String n12;
                n12 = MyListingAnalyticsDetailsActivity.n1(X0, f11, axisBase);
                return n12;
            }
        });
        barChart.getAxis(YAxis.AxisDependency.LEFT).setAxisMinimum(0.0f);
        barChart.getAxis(YAxis.AxisDependency.RIGHT).setAxisMinimum(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String n1(List labels, float f11, AxisBase axisBase) {
        o.i(labels, "$labels");
        return labels.get((int) f11).toString();
    }

    private final void o1() {
        m1();
        w1(false);
        ((u) o0()).O.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.app.features.more.mylistings.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyListingAnalyticsDetailsActivity.p1(MyListingAnalyticsDetailsActivity.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p1(MyListingAnalyticsDetailsActivity this$0, View view) {
        o.i(this$0, "this$0");
        String string = this$0.getString(y0.O);
        o.h(string, "getString(...)");
        String string2 = this$0.getString(y0.N);
        o.h(string2, "getString(...)");
        if (ContextExtensionsKt.f(this$0)) {
            c.a aVar = new c.a(this$0);
            aVar.p(string);
            aVar.h(string2);
            aVar.m(this$0.getString(y0.Z4), new d());
            aVar.j(this$0.getString(y0.I4), new e());
            aVar.d(false);
            aVar.q();
        }
    }

    private final void q1(ListingAnalyticsResponse listingAnalyticsResponse) {
        if (listingAnalyticsResponse.getTotal() > 0) {
            w1(true);
            ListingAnalyticsResponse.Analytics analytics = listingAnalyticsResponse.getAnalytics().get(x0().D0().j());
            b1(h1(), analytics.getAllDayValues());
            u1(TypeExtensionsKt.E0(analytics.getDay(), (char) 0, 1, null));
            return;
        }
        w1(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r1() {
        com.forsale.app.utils.u.g(l1(), null, new g00.a<wz.p>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity$saveChart$1
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
                AnalyticsType i12;
                BarChart barChart = MyListingAnalyticsDetailsActivity.U0(MyListingAnalyticsDetailsActivity.this).P;
                i12 = MyListingAnalyticsDetailsActivity.this.i1();
                String value = i12.getValue();
                long currentTimeMillis = System.currentTimeMillis();
                barChart.saveToGallery(value + "_" + currentTimeMillis);
            }
        }, 1, null);
    }

    private final void s1() {
        o1();
        Z0();
    }

    private final void t1(int i11) {
        if (!x0().J0()) {
            d1(false);
        } else if (!x0().I0(i11)) {
            c1(false);
        } else {
            c1(true);
            d1(true);
        }
    }

    private final void u1(String str) {
        ((u) o0()).U.setText(str);
    }

    private final void v1(String str) {
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(str);
        }
    }

    private final void w1(boolean z11) {
        x0().H0().k(z11);
    }

    public final MyListingAnalyticsDetailsViewModel.a j1() {
        MyListingAnalyticsDetailsViewModel.a aVar = this.B;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: k1 */
    public MyListingAnalyticsDetailsViewModel x0() {
        return (MyListingAnalyticsDetailsViewModel) this.C.getValue();
    }

    @Override // com.forsale.app.features.more.mylistings.b, com.forsale.app.base.activities.BaseStatefulActivity, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((u) o0()).T);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        v1(g1());
        s1();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH})
    public final void onError(View view) {
        o.i(view, "view");
        x0().L0();
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        o.i(permissions, "permissions");
        o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        l1().d(i11, permissions, grantResults, new g00.l<List<? extends String>, wz.p>() { // from class: com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsActivity$onRequestPermissionsResult$1
            public final void b(List<String> it2) {
                o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends String> list) {
                b(list);
                return wz.p.f75480a;
            }
        });
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

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes2.dex */
    public static final class e implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}

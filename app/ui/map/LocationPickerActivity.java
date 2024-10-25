package com.forsale.app.ui.map;

import aa.o;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.app.ui.bottomsheets.permissions.location.LocationBottomSheet;
import com.forsale.app.ui.map.LocationPickerViewModel;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.forsale.app.utils.facades.map.MapFacadeImpl;
import com.forsale.app.utils.facades.map.MarkerType;
import com.forsale.app.utils.facades.map.a;
import com.forsale.app.utils.location.GPSSettingsDelegate;
import com.forsale.app.utils.t;
import com.forsale.app.utils.u;
import g00.l;
import java.io.Serializable;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import n00.k;
import t9.r0;
import t9.t0;
import t9.y0;
import wz.h;
/* compiled from: LocationPickerActivity.kt */
/* loaded from: classes3.dex */
public final class LocationPickerActivity extends com.forsale.app.ui.map.a<o, LocationPickerViewModel> {
    private final h A;
    private final h B;
    private final h C;
    private final h D;
    private final t E;
    private final GPSSettingsDelegate F;

    /* renamed from: j  reason: collision with root package name */
    public LocationPickerViewModel.a f39335j;

    /* renamed from: y  reason: collision with root package name */
    private final h f39337y;

    /* renamed from: z  reason: collision with root package name */
    private final h f39338z;
    static final /* synthetic */ k<Object>[] H = {s.g(new PropertyReference1Impl(LocationPickerActivity.class, "locationPermission", "getLocationPermission()Lcom/forsale/app/utils/PermissionsManager;", 0)), s.g(new PropertyReference1Impl(LocationPickerActivity.class, "gpsSettingsManager", "getGpsSettingsManager()Lcom/forsale/app/utils/location/GPSSettingsDelegate$GPSSettingsManager;", 0))};
    public static final a G = new a(null);
    public static final int I = 8;

    /* renamed from: i  reason: collision with root package name */
    private final int f39334i = t0.f70217h;

    /* renamed from: x  reason: collision with root package name */
    private final h f39336x = new s0(s.b(LocationPickerViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes3.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ LocationPickerActivity f39341f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, LocationPickerActivity locationPickerActivity) {
                super(pVar, bundle);
                this.f39341f = locationPickerActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                double R0;
                double S0;
                kotlin.jvm.internal.o.i(key, "key");
                kotlin.jvm.internal.o.i(modelClass, "modelClass");
                kotlin.jvm.internal.o.i(handle, "handle");
                LocationPickerViewModel.a P0 = this.f39341f.P0();
                R0 = this.f39341f.R0();
                S0 = this.f39341f.S0();
                LocationPickerViewModel a11 = P0.a(R0, S0);
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
            return new a(p.this, p.this.getIntent().getExtras(), this);
        }
    }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));

    /* compiled from: LocationPickerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Intent a(Context context, double d11, double d12, float f11, MarkerType markerType, int i11) {
            Intent intent = new Intent(context, LocationPickerActivity.class);
            intent.putExtra("extra_init_lat", d11);
            intent.putExtra("extra_init_long", d12);
            intent.putExtra("zoom_level", f11);
            intent.putExtra("extra_marker_type", markerType);
            intent.putExtra("extra_title_res_id", i11);
            return intent;
        }

        public final void b(int i11, int i12, Intent intent, g00.p<? super Double, ? super Double, wz.p> result) {
            kotlin.jvm.internal.o.i(result, "result");
            if (i11 == 190 && i12 == 191 && intent != null) {
                result.invoke(Double.valueOf(intent.getDoubleExtra("extra_init_lat", Double.MAX_VALUE)), Double.valueOf(intent.getDoubleExtra("extra_init_long", Double.MAX_VALUE)));
            }
        }

        public final void c(Fragment fragment, double d11, double d12, float f11, MarkerType markerType, int i11) {
            Intent intent;
            kotlin.jvm.internal.o.i(fragment, "<this>");
            kotlin.jvm.internal.o.i(markerType, "markerType");
            Context context = fragment.getContext();
            if (context != null) {
                intent = a(context, d11, d12, f11, markerType, i11);
            } else {
                intent = null;
            }
            if (intent != null) {
                fragment.startActivityForResult(intent, 190);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationPickerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b implements FlowCollector<Pair<? extends Double, ? extends Double>> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(Pair<Double, Double> pair, zz.a<? super wz.p> aVar) {
            if (pair != null) {
                LocationPickerActivity.this.O0(pair.c().doubleValue(), pair.d().doubleValue());
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationPickerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class c implements FlowCollector<wz.p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(wz.p pVar, zz.a<? super wz.p> aVar) {
            LocationPickerActivity.this.Z0();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationPickerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements c0<Pair<? extends Double, ? extends Double>> {
        d() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Double, Double> pair) {
            a.C0458a.a(LocationPickerActivity.this.U0(), pair.c().doubleValue(), pair.d().doubleValue(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationPickerActivity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements c0<Pair<? extends Double, ? extends Double>> {
        e() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Double, Double> pair) {
            LocationPickerActivity.this.x0().J0(pair.c().doubleValue(), pair.d().doubleValue());
        }
    }

    public LocationPickerActivity() {
        h a11;
        h a12;
        h a13;
        h a14;
        h a15;
        h a16;
        a11 = kotlin.d.a(new g00.a<MapFacadeImpl>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$mapFacade$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final MapFacadeImpl invoke() {
                MarkerType V0;
                float Y0;
                int i11 = r0.R5;
                FragmentManager supportFragmentManager = LocationPickerActivity.this.getSupportFragmentManager();
                kotlin.jvm.internal.o.h(supportFragmentManager, "getSupportFragmentManager(...)");
                LocationPickerActivity locationPickerActivity = LocationPickerActivity.this;
                V0 = locationPickerActivity.V0();
                Y0 = LocationPickerActivity.this.Y0();
                return new MapFacadeImpl(i11, supportFragmentManager, locationPickerActivity, null, null, V0, false, Y0, 88, null);
            }
        });
        this.f39337y = a11;
        a12 = kotlin.d.a(new g00.a<Double>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$initLat$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Double invoke() {
                return Double.valueOf(LocationPickerActivity.this.getIntent().getDoubleExtra("extra_init_lat", Double.MAX_VALUE));
            }
        });
        this.f39338z = a12;
        a13 = kotlin.d.a(new g00.a<Double>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$initLong$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Double invoke() {
                return Double.valueOf(LocationPickerActivity.this.getIntent().getDoubleExtra("extra_init_long", Double.MAX_VALUE));
            }
        });
        this.A = a13;
        a14 = kotlin.d.a(new g00.a<MarkerType>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$markerType$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final MarkerType invoke() {
                Serializable serializableExtra = LocationPickerActivity.this.getIntent().getSerializableExtra("extra_marker_type");
                kotlin.jvm.internal.o.f(serializableExtra);
                return (MarkerType) serializableExtra;
            }
        });
        this.B = a14;
        a15 = kotlin.d.a(new g00.a<Float>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$zoomLevel$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Float invoke() {
                return Float.valueOf(LocationPickerActivity.this.getIntent().getFloatExtra("zoom_level", 14.0f));
            }
        });
        this.C = a15;
        a16 = kotlin.d.a(new g00.a<Integer>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$titleId$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Integer invoke() {
                return Integer.valueOf(LocationPickerActivity.this.getIntent().getIntExtra("extra_title_res_id", y0.Q1));
            }
        });
        this.D = a16;
        this.E = t.f40536d.a(66, "android.permission.ACCESS_FINE_LOCATION");
        this.F = new GPSSettingsDelegate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(double d11, double d12) {
        Intent intent = new Intent();
        intent.putExtra("extra_init_lat", d11);
        intent.putExtra("extra_init_long", d12);
        setResult(191, intent);
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GPSSettingsDelegate.GPSSettingsManager Q0() {
        return this.F.a(this, H[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double R0() {
        return ((Number) this.f39338z.getValue()).doubleValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double S0() {
        return ((Number) this.A.getValue()).doubleValue();
    }

    private final u T0() {
        return this.E.a(this, H[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.forsale.app.utils.facades.map.a U0() {
        return (com.forsale.app.utils.facades.map.a) this.f39337y.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarkerType V0() {
        return (MarkerType) this.B.getValue();
    }

    private final int W0() {
        return ((Number) this.D.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float Y0() {
        return ((Number) this.C.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final void Z0() {
        T0().f(new LocationPickerActivity$onAutoDetectLocation$1(this), new g00.a<wz.p>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$onAutoDetectLocation$2
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
                GPSSettingsDelegate.GPSSettingsManager Q0;
                Q0 = LocationPickerActivity.this.Q0();
                final LocationPickerActivity locationPickerActivity = LocationPickerActivity.this;
                GPSSettingsDelegate.GPSSettingsManager.g(Q0, false, null, new g00.a<wz.p>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$onAutoDetectLocation$2.1
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
                        LocationPickerActivity.this.x0().I0();
                    }
                }, 3, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1(List<String> list, g00.a<wz.p> aVar) {
        new LocationBottomSheet(aVar).show(getSupportFragmentManager(), (String) null);
    }

    private final void c1() {
        LocationPickerViewModel x02 = x0();
        x02.C0().h(this, new b());
        x02.A0().h(this, new c());
        x02.B0().observe(this, new d());
        U0().p().observe(this, new e());
    }

    public final LocationPickerViewModel.a P0() {
        LocationPickerViewModel.a aVar = this.f39335j;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: X0 */
    public LocationPickerViewModel x0() {
        return (LocationPickerViewModel) this.f39336x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.ui.map.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((o) o0()).U);
        c1();
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(getString(W0()));
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.i(permissions, "permissions");
        kotlin.jvm.internal.o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        T0().d(i11, permissions, grantResults, new l<List<? extends String>, wz.p>() { // from class: com.forsale.app.ui.map.LocationPickerActivity$onRequestPermissionsResult$1
            public final void b(List<String> it2) {
                kotlin.jvm.internal.o.i(it2, "it");
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
        return this.f39334i;
    }
}

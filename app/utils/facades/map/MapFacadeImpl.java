package com.forsale.app.utils.facades.map;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.d0;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import com.forsale.app.utils.facades.map.XMarker;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import t9.x0;
import wz.i;
import wz.p;
/* compiled from: MapFacadeImpl.kt */
/* loaded from: classes3.dex */
public final class MapFacadeImpl implements com.forsale.app.utils.facades.map.a, r {
    public static final a B = new a(null);
    public static final int C = 8;
    private final LiveData<Pair<Double, Double>> A;

    /* renamed from: a  reason: collision with root package name */
    private final int f40168a;

    /* renamed from: b  reason: collision with root package name */
    private final s f40169b;

    /* renamed from: c  reason: collision with root package name */
    private final MarkerType f40170c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f40171d;

    /* renamed from: e  reason: collision with root package name */
    private float f40172e;

    /* renamed from: f  reason: collision with root package name */
    private GoogleMap f40173f;

    /* renamed from: g  reason: collision with root package name */
    private Context f40174g;

    /* renamed from: h  reason: collision with root package name */
    private FragmentManager f40175h;

    /* renamed from: i  reason: collision with root package name */
    private View f40176i;

    /* renamed from: j  reason: collision with root package name */
    private g00.a<p> f40177j;

    /* renamed from: x  reason: collision with root package name */
    private XMarker<?> f40178x;

    /* renamed from: y  reason: collision with root package name */
    private LatLng f40179y;

    /* renamed from: z  reason: collision with root package name */
    private final b0<Pair<Double, Double>> f40180z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MapFacadeImpl.kt */
    /* renamed from: com.forsale.app.utils.facades.map.MapFacadeImpl$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends Lambda implements g00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final AnonymousClass1 f40181a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // g00.a
        public /* bridge */ /* synthetic */ p invoke() {
            invoke2();
            return p.f75480a;
        }
    }

    /* compiled from: MapFacadeImpl.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MapFacadeImpl(int i11, s sVar, Double d11, Double d12, MarkerType markerType, boolean z11, float f11) {
        LatLng latLng;
        this.f40168a = i11;
        this.f40169b = sVar;
        this.f40170c = markerType;
        this.f40171d = z11;
        this.f40172e = f11;
        this.f40177j = MapFacadeImpl$onMapViewClickListener$1.f40188a;
        b0<Pair<Double, Double>> b0Var = new b0<>();
        this.f40180z = b0Var;
        this.A = b0Var;
        if (d11 != null && d12 != null) {
            latLng = new LatLng(d11.doubleValue(), d12.doubleValue());
        } else {
            latLng = new LatLng(Utils.DOUBLE_EPSILON, Utils.DOUBLE_EPSILON);
        }
        this.f40179y = latLng;
    }

    private final void j(GoogleMap googleMap, LatLng latLng, Float f11) {
        XMarker<?> xMarker = null;
        googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition.Builder().target(latLng).zoom(k(googleMap, f11)).bearing(0.0f).tilt(25.0f).build()), 1000, null);
        XMarker<?> xMarker2 = this.f40178x;
        if (xMarker2 != null) {
            xMarker = xMarker2.b(latLng, googleMap);
        }
        this.f40178x = xMarker;
    }

    private final float k(GoogleMap googleMap, Float f11) {
        float f12 = googleMap.getCameraPosition().zoom;
        if (f11 != null && googleMap.getCameraPosition().zoom < f11.floatValue()) {
            return f11.floatValue();
        }
        if (f11 != null) {
            return f11.floatValue();
        }
        return f12;
    }

    private final void l() {
        this.f40169b.getLifecycle().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(MapFacadeImpl this$0, GoogleMap this_apply) {
        o.i(this$0, "this$0");
        o.i(this_apply, "$this_apply");
        LatLng latLng = this$0.f40179y;
        o.f(latLng);
        this$0.j(this_apply, latLng, Float.valueOf(this$0.f40172e));
    }

    private final void n(g00.a<p> aVar) {
        if (this.f40176i != null) {
            aVar.invoke();
        }
    }

    private final void o(g00.a<p> aVar) {
        if (this.f40175h != null) {
            aVar.invoke();
        }
    }

    @d0(Lifecycle.Event.ON_CREATE)
    private final void onCreate() {
        o(new MapFacadeImpl$onCreate$1(this));
        n(new MapFacadeImpl$onCreate$2(this));
        XMarker.a aVar = XMarker.f40191d;
        MarkerType markerType = this.f40170c;
        LatLng latLng = this.f40179y;
        Context context = this.f40174g;
        if (context == null) {
            o.w("appContext");
            context = null;
        }
        this.f40178x = aVar.a(markerType, latLng, context);
    }

    @Override // com.forsale.app.utils.facades.map.a
    public void d0(double d11, double d12, Float f11) {
        boolean z11;
        if (f11 != null) {
            this.f40172e = f11.floatValue();
        }
        LatLng latLng = this.f40179y;
        boolean z12 = true;
        if (latLng.latitude == d11) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (latLng.longitude != d12) {
                z12 = false;
            }
            if (z12) {
                return;
            }
        }
        this.f40179y = new LatLng(d11, d12);
        this.f40180z.postValue(i.a(Double.valueOf(d11), Double.valueOf(d12)));
        GoogleMap googleMap = this.f40173f;
        if (googleMap != null) {
            LatLng latLng2 = this.f40179y;
            o.f(latLng2);
            j(googleMap, latLng2, f11);
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        o.i(googleMap, "googleMap");
        this.f40173f = googleMap;
        if (this.f40171d) {
            Context context = this.f40174g;
            if (context == null) {
                o.w("appContext");
                context = null;
            }
            MapStyleOptions loadRawResourceStyle = MapStyleOptions.loadRawResourceStyle(context, x0.f70355a);
            o.h(loadRawResourceStyle, "loadRawResourceStyle(...)");
            GoogleMap googleMap2 = this.f40173f;
            if (googleMap2 != null) {
                googleMap2.setMapStyle(loadRawResourceStyle);
            }
        }
        GoogleMap googleMap3 = this.f40173f;
        if (googleMap3 != null) {
            googleMap3.setMapType(1);
            googleMap3.setOnCameraMoveCanceledListener(new ej.a(this, googleMap3));
            LatLng latLng = this.f40179y;
            o.f(latLng);
            j(googleMap3, latLng, Float.valueOf(this.f40172e));
            o(new MapFacadeImpl$onMapReady$1$2(googleMap3, this));
            n(new MapFacadeImpl$onMapReady$1$3(this, googleMap3));
        }
    }

    @Override // com.forsale.app.utils.facades.map.a
    public LiveData<Pair<Double, Double>> p() {
        return this.A;
    }

    @Override // com.forsale.app.utils.facades.map.a
    public void r(MarkerType markerType) {
        XMarker<?> xMarker;
        o.i(markerType, "markerType");
        GoogleMap googleMap = this.f40173f;
        if (googleMap != null) {
            XMarker<?> xMarker2 = this.f40178x;
            if (xMarker2 != null) {
                xMarker = xMarker2.c(markerType, googleMap);
            } else {
                xMarker = null;
            }
            this.f40178x = xMarker;
        }
    }

    public /* synthetic */ MapFacadeImpl(int i11, FragmentManager fragmentManager, s sVar, Double d11, Double d12, MarkerType markerType, boolean z11, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, fragmentManager, sVar, (i12 & 8) != 0 ? null : d11, (i12 & 16) != 0 ? null : d12, (i12 & 32) != 0 ? MarkerType.CIRCLE : markerType, (i12 & 64) != 0 ? false : z11, (i12 & 128) != 0 ? 14.0f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl(int i11, FragmentManager fragmentManager, s lifecycleOwner, Double d11, Double d12, MarkerType initMarkerType, boolean z11, float f11) {
        this(i11, lifecycleOwner, d11, d12, initMarkerType, z11, f11);
        o.i(fragmentManager, "fragmentManager");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(initMarkerType, "initMarkerType");
        this.f40175h = fragmentManager;
        this.f40172e = f11;
        l();
    }

    public /* synthetic */ MapFacadeImpl(int i11, View view, s sVar, g00.a aVar, Double d11, Double d12, MarkerType markerType, boolean z11, float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, view, sVar, (i12 & 8) != 0 ? AnonymousClass1.f40181a : aVar, (i12 & 16) != 0 ? null : d11, (i12 & 32) != 0 ? null : d12, (i12 & 64) != 0 ? MarkerType.CIRCLE : markerType, (i12 & 128) != 0 ? false : z11, (i12 & 256) != 0 ? 14.0f : f11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MapFacadeImpl(int i11, View rootView, s lifecycleOwner, g00.a<p> onMapViewClickListener, Double d11, Double d12, MarkerType initMarkerType, boolean z11, float f11) {
        this(i11, lifecycleOwner, d11, d12, initMarkerType, z11, f11);
        o.i(rootView, "rootView");
        o.i(lifecycleOwner, "lifecycleOwner");
        o.i(onMapViewClickListener, "onMapViewClickListener");
        o.i(initMarkerType, "initMarkerType");
        this.f40176i = rootView;
        this.f40177j = onMapViewClickListener;
        this.f40172e = f11;
        l();
    }
}

package com.forsale.app.utils.location;

import android.content.Context;
import android.content.IntentSender;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.tasks.Task;
import g00.l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import n00.k;
import wz.p;
/* compiled from: GPSSettingsDelegate.kt */
/* loaded from: classes3.dex */
public final class GPSSettingsDelegate {

    /* renamed from: b */
    public static final a f40339b = new a(null);

    /* renamed from: c */
    public static final int f40340c = 8;

    /* renamed from: a */
    private GPSSettingsManager f40341a;

    /* compiled from: GPSSettingsDelegate.kt */
    /* loaded from: classes3.dex */
    public static final class AppCompatActivityGPSSettingsManager extends GPSSettingsManager {

        /* renamed from: b */
        private final d f40342b;

        /* renamed from: c */
        private final s f40343c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppCompatActivityGPSSettingsManager(d activity) {
            super(activity);
            o.i(activity, "activity");
            this.f40342b = activity;
            this.f40343c = activity;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.utils.location.GPSSettingsDelegate.GPSSettingsManager
        public void b() {
            d(new GPSSettingsDelegate$AppCompatActivityGPSSettingsManager$enableGPS$1(this));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.utils.location.GPSSettingsDelegate.GPSSettingsManager
        public s c() {
            return this.f40343c;
        }
    }

    /* compiled from: GPSSettingsDelegate.kt */
    /* loaded from: classes3.dex */
    public static final class FragmentGPSSettingsManager extends GPSSettingsManager {

        /* renamed from: b */
        private final Fragment f40345b;

        /* renamed from: c */
        private final s f40346c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public FragmentGPSSettingsManager(androidx.fragment.app.Fragment r2) {
            /*
                r1 = this;
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.o.i(r2, r0)
                android.content.Context r0 = r2.getContext()
                kotlin.jvm.internal.o.f(r0)
                r1.<init>(r0)
                r1.f40345b = r2
                androidx.lifecycle.s r2 = r2.getViewLifecycleOwner()
                java.lang.String r0 = "getViewLifecycleOwner(...)"
                kotlin.jvm.internal.o.h(r2, r0)
                r1.f40346c = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.location.GPSSettingsDelegate.FragmentGPSSettingsManager.<init>(androidx.fragment.app.Fragment):void");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.utils.location.GPSSettingsDelegate.GPSSettingsManager
        public void b() {
            d(new GPSSettingsDelegate$FragmentGPSSettingsManager$enableGPS$1(this));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.forsale.app.utils.location.GPSSettingsDelegate.GPSSettingsManager
        public s c() {
            return this.f40346c;
        }
    }

    /* compiled from: GPSSettingsDelegate.kt */
    /* loaded from: classes3.dex */
    public static abstract class GPSSettingsManager {

        /* renamed from: a */
        private final Context f40348a;

        public GPSSettingsManager(Context ctx) {
            o.i(ctx, "ctx");
            this.f40348a = ctx;
        }

        public static final void e(l onNotEnabled, Exception exception) {
            o.i(onNotEnabled, "$onNotEnabled");
            o.i(exception, "exception");
            if (exception instanceof ResolvableApiException) {
                try {
                    onNotEnabled.invoke(exception);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void g(GPSSettingsManager gPSSettingsManager, boolean z11, l lVar, g00.a aVar, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = true;
                }
                if ((i11 & 2) != 0) {
                    lVar = null;
                }
                gPSSettingsManager.f(z11, lVar, aVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: withGPSEnabled");
        }

        public abstract void b();

        public abstract s c();

        protected final void d(l<? super ResolvableApiException, p> onNotEnabled) {
            o.i(onNotEnabled, "onNotEnabled");
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
            builder.addLocationRequest(LocationRequest.create());
            Task<LocationSettingsResponse> checkLocationSettings = LocationServices.getSettingsClient(this.f40348a).checkLocationSettings(builder.build());
            o.f(checkLocationSettings);
            checkLocationSettings.addOnFailureListener(new hj.a(onNotEnabled));
        }

        public final void f(boolean z11, l<? super g00.a<p>, p> lVar, g00.a<p> onEnabled) {
            o.i(onEnabled, "onEnabled");
            IsGPSEnabledLiveData isGPSEnabledLiveData = new IsGPSEnabledLiveData(this.f40348a);
            isGPSEnabledLiveData.observe(c(), new GPSSettingsDelegate$GPSSettingsManager$withGPSEnabled$gpsObserver$1(onEnabled, z11, isGPSEnabledLiveData, this, lVar));
        }
    }

    /* compiled from: GPSSettingsDelegate.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final GPSSettingsManager a(Object thisRef, k<?> property) {
        GPSSettingsManager appCompatActivityGPSSettingsManager;
        o.i(thisRef, "thisRef");
        o.i(property, "property");
        GPSSettingsManager gPSSettingsManager = this.f40341a;
        if (gPSSettingsManager != null) {
            if (gPSSettingsManager == null) {
                o.w("instance");
                return null;
            }
            return gPSSettingsManager;
        }
        if (thisRef instanceof Fragment) {
            appCompatActivityGPSSettingsManager = new FragmentGPSSettingsManager((Fragment) thisRef);
        } else if (thisRef instanceof d) {
            appCompatActivityGPSSettingsManager = new AppCompatActivityGPSSettingsManager((d) thisRef);
        } else {
            throw new TypeCastException("Can't cast " + thisRef + " to any thing because it is not supported");
        }
        this.f40341a = appCompatActivityGPSSettingsManager;
        return appCompatActivityGPSSettingsManager;
    }
}

package com.forsale.app.utils.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import com.forsale.app.utils.location.LocationUpdatesLiveData$locationCallbacks$2;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import kotlin.Pair;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: LocationUpdatesLiveData.kt */
/* loaded from: classes3.dex */
public final class LocationUpdatesLiveData extends LiveData<Pair<? extends Double, ? extends Double>> {

    /* renamed from: e  reason: collision with root package name */
    public static final a f40359e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f40360f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f40361a;

    /* renamed from: b  reason: collision with root package name */
    private final h f40362b;

    /* renamed from: c  reason: collision with root package name */
    private final h f40363c;

    /* renamed from: d  reason: collision with root package name */
    private final h f40364d;

    /* compiled from: LocationUpdatesLiveData.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocationUpdatesLiveData(Context ctx, boolean z11) {
        h a11;
        h a12;
        h a13;
        o.i(ctx, "ctx");
        this.f40361a = z11;
        a11 = d.a(new LocationUpdatesLiveData$fusedLocation$2(ctx));
        this.f40362b = a11;
        a12 = d.a(LocationUpdatesLiveData$locationRequest$2.f40368a);
        this.f40363c = a12;
        a13 = d.a(new LocationUpdatesLiveData$locationCallbacks$2(this));
        this.f40364d = a13;
    }

    private final FusedLocationProviderClient b() {
        return (FusedLocationProviderClient) this.f40362b.getValue();
    }

    private final LocationUpdatesLiveData$locationCallbacks$2.a c() {
        return (LocationUpdatesLiveData$locationCallbacks$2.a) this.f40364d.getValue();
    }

    private final LocationRequest d() {
        return (LocationRequest) this.f40363c.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: e */
    public void postValue(Pair<Double, Double> pair) {
        super.postValue(pair);
        if (this.f40361a) {
            b().removeLocationUpdates(c());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    /* renamed from: f */
    public void setValue(Pair<Double, Double> pair) {
        super.setValue(pair);
        if (this.f40361a) {
            b().removeLocationUpdates(c());
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(s owner, c0<? super Pair<? extends Double, ? extends Double>> observer) {
        o.i(owner, "owner");
        o.i(observer, "observer");
        removeObservers(owner);
        super.observe(owner, observer);
    }

    @Override // androidx.lifecycle.LiveData
    public void observeForever(c0<? super Pair<? extends Double, ? extends Double>> observer) {
        o.i(observer, "observer");
        removeObserver(observer);
        super.observeForever(observer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    @SuppressLint({"MissingPermission"})
    public void onActive() {
        super.onActive();
        b().requestLocationUpdates(d(), c(), Looper.myLooper());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onInactive() {
        super.onInactive();
        b().removeLocationUpdates(c());
    }
}

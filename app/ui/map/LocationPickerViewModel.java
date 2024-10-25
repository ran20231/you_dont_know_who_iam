package com.forsale.app.ui.map;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.LocationRepository;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import t9.y0;
import wz.i;
import wz.p;
/* compiled from: LocationPickerViewModel.kt */
/* loaded from: classes3.dex */
public final class LocationPickerViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final LocationRepository f39355k0;

    /* renamed from: l0  reason: collision with root package name */
    private final OneShotEventHandler<Pair<Double, Double>> f39356l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f39357m0;

    /* renamed from: n0  reason: collision with root package name */
    private final b0<Pair<Double, Double>> f39358n0;

    /* renamed from: o0  reason: collision with root package name */
    private final int f39359o0;

    /* renamed from: p0  reason: collision with root package name */
    private final b0<List<String>> f39360p0;

    /* renamed from: q0  reason: collision with root package name */
    private final LiveData<List<String>> f39361q0;

    /* renamed from: r0  reason: collision with root package name */
    private final LiveData<Boolean> f39362r0;

    /* renamed from: s0  reason: collision with root package name */
    private final AtomicReference<Job> f39363s0;

    /* renamed from: t0  reason: collision with root package name */
    private final c0<Pair<Double, Double>> f39364t0;

    /* compiled from: LocationPickerViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        LocationPickerViewModel a(double d11, double d12);
    }

    /* compiled from: LocationPickerViewModel.kt */
    /* loaded from: classes3.dex */
    static final class b implements c0<Pair<? extends Double, ? extends Double>> {
        b() {
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Double, Double> it2) {
            o.i(it2, "it");
            LocationPickerViewModel.this.J0(it2.c().doubleValue(), it2.d().doubleValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPickerViewModel(double d11, double d12, LocationRepository locationRepository, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(locationRepository, "locationRepository");
        o.i(baseRepository, "baseRepository");
        this.f39355k0 = locationRepository;
        this.f39356l0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39357m0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f39358n0 = new b0<>(i.a(Double.valueOf(d11), Double.valueOf(d12)));
        this.f39359o0 = y0.f70578mf;
        b0<List<String>> b0Var = new b0<>();
        this.f39360p0 = b0Var;
        this.f39361q0 = Transformations.b(b0Var, new l<List<String>, List<String>>() { // from class: com.forsale.app.ui.map.LocationPickerViewModel$locationAddress$1
            @Override // g00.l
            /* renamed from: b */
            public final List<String> invoke(List<String> list) {
                List<String> n11;
                if (list == null) {
                    n11 = r.n();
                    return n11;
                }
                return list;
            }
        });
        this.f39362r0 = Transformations.b(b0Var, new l<List<String>, Boolean>() { // from class: com.forsale.app.ui.map.LocationPickerViewModel$isLocationVisible$1
            @Override // g00.l
            /* renamed from: b */
            public final Boolean invoke(List<String> list) {
                boolean z11;
                if (list != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
            }
        });
        this.f39363s0 = new AtomicReference<>(null);
        this.f39364t0 = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0() {
        this.f39355k0.getLocationUpdatesLiveData().observeForever(this.f39364t0);
    }

    public final OneShotEventHandler<p> A0() {
        return this.f39357m0;
    }

    public final b0<Pair<Double, Double>> B0() {
        return this.f39358n0;
    }

    public final OneShotEventHandler<Pair<Double, Double>> C0() {
        return this.f39356l0;
    }

    public final int D0() {
        return this.f39359o0;
    }

    public final LiveData<List<String>> E0() {
        return this.f39361q0;
    }

    public final LiveData<Boolean> G0() {
        return this.f39362r0;
    }

    public final void I0() {
        BuildersKt__Builders_commonKt.launch$default(this, Dispatchers.getMain(), null, new LocationPickerViewModel$retrieveLastKnownLocation$1(this, null), 2, null);
    }

    public final void J0(double d11, double d12) {
        Job launch$default;
        this.f39358n0.postValue(i.a(Double.valueOf(d11), Double.valueOf(d12)));
        Job job = this.f39363s0.get();
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        AtomicReference<Job> atomicReference = this.f39363s0;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new LocationPickerViewModel$setCoordinates$1(this, d11, d12, null), 3, null);
        atomicReference.lazySet(launch$default);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.viewmodels.BaseViewModel, androidx.lifecycle.q0
    public void onCleared() {
        super.onCleared();
        this.f39355k0.getLocationUpdatesLiveData().removeObserver(this.f39364t0);
    }

    public final void y0() {
        this.f39357m0.i(p.f75480a);
    }

    public final void z0() {
        this.f39356l0.i(this.f39358n0.getValue());
    }
}

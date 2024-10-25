package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import com.forsale.app.datalayer.repositories.LocationRepository;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.i;
/* compiled from: ListingMapViewModel.kt */
/* loaded from: classes2.dex */
public class ListingMapViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f27509a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationRepository f27510b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f27511c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<Pair<Double, Double>> f27512d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<Pair<Double, Double>> f27513e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<String> f27514f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<String> f27515g;

    /* renamed from: h  reason: collision with root package name */
    private final LiveData<Boolean> f27516h;

    public ListingMapViewModel(CoroutineScope coroutineScope, double d11, double d12, LocationRepository locationRepository, Boolean bool) {
        o.i(coroutineScope, "coroutineScope");
        o.i(locationRepository, "locationRepository");
        this.f27509a = coroutineScope;
        this.f27510b = locationRepository;
        this.f27511c = bool;
        b0<Pair<Double, Double>> b0Var = new b0<>();
        this.f27512d = b0Var;
        Pair<Double, Double> value = b0Var.getValue();
        if (value != null) {
            f(value.c().doubleValue(), value.d().doubleValue());
        }
        this.f27513e = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f27514f = b0Var2;
        this.f27515g = b0Var2;
        String value2 = b0Var2.getValue();
        if (value2 != null) {
            o.d(bool, Boolean.FALSE);
        }
        this.f27516h = new b0(Boolean.valueOf(Boolean.parseBoolean(value2)));
        b0Var.postValue(i.a(Double.valueOf(d11), Double.valueOf(d12)));
    }

    private final void f(double d11, double d12) {
        BuildersKt__Builders_commonKt.launch$default(this.f27509a, null, null, new ListingMapViewModel$refreshLocationString$1(this, d11, d12, null), 3, null);
    }

    public final LiveData<String> c() {
        return this.f27515g;
    }

    public final LiveData<Pair<Double, Double>> d() {
        return this.f27513e;
    }

    public final LiveData<Boolean> e() {
        return this.f27516h;
    }
}

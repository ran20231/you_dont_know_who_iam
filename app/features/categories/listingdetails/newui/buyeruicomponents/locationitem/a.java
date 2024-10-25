package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem;

import com.forsale.app.datalayer.repositories.LocationRepository;
import com.forsale.app.utils.facades.map.MarkerType;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: LocationItemViewModel.kt */
/* loaded from: classes2.dex */
public final class a extends ListingMapViewModel {

    /* renamed from: i  reason: collision with root package name */
    private final CoroutineScope f27533i;

    /* renamed from: j  reason: collision with root package name */
    private final LocationRepository f27534j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f27535k;

    /* renamed from: l  reason: collision with root package name */
    private final MarkerType f27536l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(CoroutineScope coroutineScope, LocationRepository locationRepository, double d11, double d12, boolean z11) {
        super(coroutineScope, d11, d12, locationRepository, Boolean.valueOf(z11));
        MarkerType markerType;
        o.i(coroutineScope, "coroutineScope");
        o.i(locationRepository, "locationRepository");
        this.f27533i = coroutineScope;
        this.f27534j = locationRepository;
        this.f27535k = z11;
        if (z11) {
            markerType = MarkerType.CIRCLE;
        } else {
            markerType = MarkerType.PIN;
        }
        this.f27536l = markerType;
    }

    public final MarkerType g() {
        return this.f27536l;
    }
}

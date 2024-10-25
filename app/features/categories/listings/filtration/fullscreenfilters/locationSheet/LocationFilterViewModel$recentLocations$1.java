package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import g00.l;
import g00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$recentLocations$1", f = "LocationFilterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$recentLocations$1 extends SuspendLambda implements q<LocationTreeNode, List<? extends dc.a>, zz.a<? super List<? extends LocationTreeNode>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29879a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f29880b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f29881c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationFilterViewModel$recentLocations$1(zz.a<? super LocationFilterViewModel$recentLocations$1> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(LocationTreeNode locationTreeNode, List<dc.a> list, zz.a<? super List<LocationTreeNode>> aVar) {
        LocationFilterViewModel$recentLocations$1 locationFilterViewModel$recentLocations$1 = new LocationFilterViewModel$recentLocations$1(aVar);
        locationFilterViewModel$recentLocations$1.f29880b = locationTreeNode;
        locationFilterViewModel$recentLocations$1.f29881c = list;
        return locationFilterViewModel$recentLocations$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List n11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f29879a == 0) {
            f.b(obj);
            LocationTreeNode locationTreeNode = (LocationTreeNode) this.f29880b;
            List<dc.a> list = (List) this.f29881c;
            if (locationTreeNode == null || !(!list.isEmpty())) {
                n11 = r.n();
                return n11;
            }
            ArrayList arrayList = new ArrayList();
            for (final dc.a aVar : list) {
                LocationTreeNode g11 = locationTreeNode.g(new l<LocationTreeNode, Boolean>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$recentLocations$1$1$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        super(1);
                    }

                    @Override // g00.l
                    /* renamed from: b */
                    public final Boolean invoke(LocationTreeNode it2) {
                        boolean z11;
                        o.i(it2, "it");
                        if (it2.i().e() == dc.a.this.e()) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                    }
                });
                if (g11 != null) {
                    arrayList.add(g11);
                }
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

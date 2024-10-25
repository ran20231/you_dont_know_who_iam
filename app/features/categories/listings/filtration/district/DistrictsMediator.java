package com.forsale.app.features.categories.listings.filtration.district;

import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.utils.OneShotEventHandler;
import g00.a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.d;
import kotlin.jvm.internal.o;
import wz.h;
/* compiled from: DistrictsMediator.kt */
/* loaded from: classes2.dex */
public final class DistrictsMediator {

    /* renamed from: a  reason: collision with root package name */
    private final List<DistrictEntity> f29055a;

    /* renamed from: b  reason: collision with root package name */
    private final OneShotEventHandler<DistrictEntity> f29056b;

    /* renamed from: c  reason: collision with root package name */
    private final DistrictEntity f29057c;

    /* renamed from: d  reason: collision with root package name */
    private final h f29058d;

    public DistrictsMediator(List<DistrictEntity> districts, OneShotEventHandler<DistrictEntity> onDistrictSelectionChangeEvent, DistrictEntity districtEntity) {
        h a11;
        o.i(districts, "districts");
        o.i(onDistrictSelectionChangeEvent, "onDistrictSelectionChangeEvent");
        this.f29055a = districts;
        this.f29056b = onDistrictSelectionChangeEvent;
        this.f29057c = districtEntity;
        a11 = d.a(new a<List<? extends bc.a>>() { // from class: com.forsale.app.features.categories.listings.filtration.district.DistrictsMediator$districtsViewModels$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public final List<? extends bc.a> invoke() {
                List<DistrictEntity> list;
                List<? extends bc.a> e11;
                list = DistrictsMediator.this.f29055a;
                e11 = q.e(new bc.a(null, DistrictsMediator.this));
                DistrictsMediator districtsMediator = DistrictsMediator.this;
                for (DistrictEntity districtEntity2 : list) {
                    e11 = CollectionsKt___CollectionsKt.F0(e11, new bc.a(districtEntity2, districtsMediator));
                }
                return e11;
            }
        });
        this.f29058d = a11;
    }

    public final List<bc.a> b() {
        return (List) this.f29058d.getValue();
    }

    public final DistrictEntity c() {
        return this.f29057c;
    }

    public final void d(bc.a vm2) {
        Object obj;
        o.i(vm2, "vm");
        Iterator<T> it2 = b().iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((bc.a) obj).e().getValue().booleanValue()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        bc.a aVar = (bc.a) obj;
        if (aVar != null) {
            aVar.a();
        }
        this.f29056b.i(vm2.b());
    }
}

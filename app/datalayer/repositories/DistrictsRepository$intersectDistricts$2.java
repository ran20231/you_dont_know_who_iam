package com.forsale.app.datalayer.repositories;

import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository$intersectDistricts$2", f = "DistrictsRepository.kt", l = {115}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DistrictsRepository$intersectDistricts$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends Integer>>, Object> {
    final /* synthetic */ List<Integer> $childrenIds;
    final /* synthetic */ List<Integer> $parentIds;
    int label;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$intersectDistricts$2(DistrictsRepository districtsRepository, List<Integer> list, List<Integer> list2, zz.a<? super DistrictsRepository$intersectDistricts$2> aVar) {
        super(2, aVar);
        this.this$0 = districtsRepository;
        this.$parentIds = list;
        this.$childrenIds = list2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DistrictsRepository$intersectDistricts$2(this.this$0, this.$parentIds, this.$childrenIds, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends Integer>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<Integer>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DistrictDao districtDao;
        int y11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            districtDao = this.this$0.districtDao;
            List<Integer> list = this.$parentIds;
            y11 = s.y(list, 10);
            ArrayList arrayList = new ArrayList(y11);
            for (Number number : list) {
                arrayList.add(String.valueOf(number.intValue()));
            }
            List<Integer> list2 = this.$childrenIds;
            this.label = 1;
            obj = districtDao.intersectDistricts(arrayList, list2, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<Integer>> aVar) {
        return ((DistrictsRepository$intersectDistricts$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

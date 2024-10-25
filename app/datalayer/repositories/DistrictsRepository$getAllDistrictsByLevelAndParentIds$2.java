package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository$getAllDistrictsByLevelAndParentIds$2", f = "DistrictsRepository.kt", l = {134, 135}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DistrictsRepository$getAllDistrictsByLevelAndParentIds$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends DistrictEntity>>, Object> {
    final /* synthetic */ int $level;
    final /* synthetic */ List<Integer> $parentIds;
    int label;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$getAllDistrictsByLevelAndParentIds$2(DistrictsRepository districtsRepository, int i11, List<Integer> list, zz.a<? super DistrictsRepository$getAllDistrictsByLevelAndParentIds$2> aVar) {
        super(2, aVar);
        this.this$0 = districtsRepository;
        this.$level = i11;
        this.$parentIds = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DistrictsRepository$getAllDistrictsByLevelAndParentIds$2(this.this$0, this.$level, this.$parentIds, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends DistrictEntity>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<DistrictEntity>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        RegionsRepository regionsRepository;
        DistrictDao districtDao;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return (List) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            regionsRepository = this.this$0.regionsRepository;
            this.label = 1;
            obj = regionsRepository.getCurrentRegion(this);
            if (obj == f11) {
                return f11;
            }
        }
        DistrictsRepository districtsRepository = this.this$0;
        int i12 = this.$level;
        List<Integer> list = this.$parentIds;
        districtDao = districtsRepository.districtDao;
        int id2 = ((RegionEntity) obj).getId();
        this.label = 2;
        obj = districtDao.getAllDistrictsByLevelAndParentIds(id2, i12, list, this);
        if (obj == f11) {
            return f11;
        }
        return (List) obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<DistrictEntity>> aVar) {
        return ((DistrictsRepository$getAllDistrictsByLevelAndParentIds$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

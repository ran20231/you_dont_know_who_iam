package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.DistrictEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository$getMainDistricts$2", f = "DistrictsRepository.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DistrictsRepository$getMainDistricts$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends DistrictEntity>>, Object> {
    int label;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$getMainDistricts$2(DistrictsRepository districtsRepository, zz.a<? super DistrictsRepository$getMainDistricts$2> aVar) {
        super(2, aVar);
        this.this$0 = districtsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DistrictsRepository$getMainDistricts$2(this.this$0, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends DistrictEntity>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<DistrictEntity>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
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
            DistrictsRepository districtsRepository = this.this$0;
            this.label = 1;
            obj = districtsRepository.getAllDistrictsByLevel(1, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<DistrictEntity>> aVar) {
        return ((DistrictsRepository$getMainDistricts$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

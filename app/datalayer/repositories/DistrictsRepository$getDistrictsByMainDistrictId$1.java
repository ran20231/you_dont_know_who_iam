package com.forsale.app.datalayer.repositories;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DistrictsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.DistrictsRepository", f = "DistrictsRepository.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "getDistrictsByMainDistrictId")
/* loaded from: classes2.dex */
public final class DistrictsRepository$getDistrictsByMainDistrictId$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DistrictsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DistrictsRepository$getDistrictsByMainDistrictId$1(DistrictsRepository districtsRepository, zz.a<? super DistrictsRepository$getDistrictsByMainDistrictId$1> aVar) {
        super(aVar);
        this.this$0 = districtsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getDistrictsByMainDistrictId(this);
    }
}

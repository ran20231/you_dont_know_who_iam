package com.forsale.app.datalayer.database.masterdata;

import com.google.android.gms.maps.model.PinConfig;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDBRepo.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataNewRepository", f = "MasterDBRepo.kt", l = {PinConfig.BITMAP_LENGTH_DP, 39, 42, 43, 46, 46, 47, 48, 49}, m = "getMasterData")
/* loaded from: classes2.dex */
public final class MasterDataNewRepository$getMasterData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataNewRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataNewRepository$getMasterData$1(MasterDataNewRepository masterDataNewRepository, a<? super MasterDataNewRepository$getMasterData$1> aVar) {
        super(aVar);
        this.this$0 = masterDataNewRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getMasterData(this);
    }
}

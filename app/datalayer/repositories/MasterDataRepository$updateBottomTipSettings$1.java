package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.errorhandling.ErrorCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository", f = "MasterDataRepository.kt", l = {398, 399, ErrorCodes.UNAUTHORIZED_ERROR_CODE, ErrorCodes.BLOCKED_USER_ERROR_CODE}, m = "updateBottomTipSettings")
/* loaded from: classes2.dex */
public final class MasterDataRepository$updateBottomTipSettings$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$updateBottomTipSettings$1(MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$updateBottomTipSettings$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateBottomTipSettings;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateBottomTipSettings = this.this$0.updateBottomTipSettings(null, this);
        return updateBottomTipSettings;
    }
}

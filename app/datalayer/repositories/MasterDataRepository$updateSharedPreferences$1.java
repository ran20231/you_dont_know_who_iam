package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository", f = "MasterDataRepository.kt", l = {156, 157, 158, 159, 161, 162, 163, 164, 165, 167, 170, 171, 172, 173, 177, 178, 179, 185, 186, 187, 188, 194, 195, 196, 197, 198, 199, 204}, m = "updateSharedPreferences")
/* loaded from: classes2.dex */
public final class MasterDataRepository$updateSharedPreferences$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$updateSharedPreferences$1(MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$updateSharedPreferences$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object updateSharedPreferences;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateSharedPreferences = this.this$0.updateSharedPreferences(null, this);
        return updateSharedPreferences;
    }
}

package com.forsale.app.datalayer.database.masterdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRemoteSource.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataRemoteSource", f = "MasterDataRemoteSource.kt", l = {18, 18}, m = "getMasterData")
/* loaded from: classes2.dex */
public final class MasterDataRemoteSource$getMasterData$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRemoteSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRemoteSource$getMasterData$1(MasterDataRemoteSource masterDataRemoteSource, a<? super MasterDataRemoteSource$getMasterData$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRemoteSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getMasterData(this);
    }
}

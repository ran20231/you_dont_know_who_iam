package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataMigrationRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataMigrationRepository", f = "MasterDataMigrationRepository.kt", l = {16}, m = "queryRealDatabase")
/* loaded from: classes2.dex */
public final class MasterDataMigrationRepository$queryRealDatabase$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataMigrationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataMigrationRepository$queryRealDatabase$1(MasterDataMigrationRepository masterDataMigrationRepository, zz.a<? super MasterDataMigrationRepository$queryRealDatabase$1> aVar) {
        super(aVar);
        this.this$0 = masterDataMigrationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.queryRealDatabase(this);
    }
}

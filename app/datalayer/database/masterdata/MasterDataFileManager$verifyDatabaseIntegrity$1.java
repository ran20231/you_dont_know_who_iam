package com.forsale.app.datalayer.database.masterdata;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataFileManager.kt */
@d(c = "com.forsale.app.datalayer.database.masterdata.MasterDataFileManager", f = "MasterDataFileManager.kt", l = {89}, m = "verifyDatabaseIntegrity")
/* loaded from: classes2.dex */
public final class MasterDataFileManager$verifyDatabaseIntegrity$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataFileManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataFileManager$verifyDatabaseIntegrity$1(MasterDataFileManager masterDataFileManager, a<? super MasterDataFileManager$verifyDatabaseIntegrity$1> aVar) {
        super(aVar);
        this.this$0 = masterDataFileManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.verifyDatabaseIntegrity(this);
    }
}

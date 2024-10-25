package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository", f = "MasterDataRepository.kt", l = {464, 466}, m = "clearCachedListing")
/* loaded from: classes2.dex */
public final class MasterDataRepository$clearCachedListing$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$clearCachedListing$1(MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$clearCachedListing$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object clearCachedListing;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        clearCachedListing = this.this$0.clearCachedListing(null, this);
        return clearCachedListing;
    }
}

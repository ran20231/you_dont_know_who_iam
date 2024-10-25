package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository", f = "MasterDataRepository.kt", l = {87}, m = "isGoogleAnalyticsEnabled")
/* loaded from: classes2.dex */
public final class MasterDataRepository$isGoogleAnalyticsEnabled$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$isGoogleAnalyticsEnabled$1(MasterDataRepository masterDataRepository, zz.a<? super MasterDataRepository$isGoogleAnalyticsEnabled$1> aVar) {
        super(aVar);
        this.this$0 = masterDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isGoogleAnalyticsEnabled(this);
    }
}

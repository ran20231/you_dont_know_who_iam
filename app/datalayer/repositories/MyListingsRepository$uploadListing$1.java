package com.forsale.app.datalayer.repositories;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MyListingsRepository", f = "MyListingsRepository.kt", l = {20, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "uploadListing")
/* loaded from: classes2.dex */
public final class MyListingsRepository$uploadListing$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MyListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListingsRepository$uploadListing$1(MyListingsRepository myListingsRepository, zz.a<? super MyListingsRepository$uploadListing$1> aVar) {
        super(aVar);
        this.this$0 = myListingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadListing(null, null, this);
    }
}

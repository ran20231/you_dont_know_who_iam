package com.forsale.app.datalayer.repositories;

import com.google.android.gms.common.api.CommonStatusCodes;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannersRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.BannersRepository", f = "BannersRepository.kt", l = {22, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE}, m = "getCategoryBannersCount")
/* loaded from: classes2.dex */
public final class BannersRepository$getCategoryBannersCount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannersRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersRepository$getCategoryBannersCount$1(BannersRepository bannersRepository, zz.a<? super BannersRepository$getCategoryBannersCount$1> aVar) {
        super(aVar);
        this.this$0 = bannersRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getCategoryBannersCount(null, null, null, this);
    }
}

package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BannersRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.BannersRepository", f = "BannersRepository.kt", l = {34, 34}, m = "isCategoryScreenHasLandingBanners")
/* loaded from: classes2.dex */
public final class BannersRepository$isCategoryScreenHasLandingBanners$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BannersRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannersRepository$isCategoryScreenHasLandingBanners$1(BannersRepository bannersRepository, zz.a<? super BannersRepository$isCategoryScreenHasLandingBanners$1> aVar) {
        super(aVar);
        this.this$0 = bannersRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.isCategoryScreenHasLandingBanners(null, null, this);
    }
}

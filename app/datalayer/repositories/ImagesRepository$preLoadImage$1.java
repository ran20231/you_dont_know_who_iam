package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImagesRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ImagesRepository", f = "ImagesRepository.kt", l = {94}, m = "preLoadImage")
/* loaded from: classes2.dex */
public final class ImagesRepository$preLoadImage$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ImagesRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagesRepository$preLoadImage$1(ImagesRepository imagesRepository, zz.a<? super ImagesRepository$preLoadImage$1> aVar) {
        super(aVar);
        this.this$0 = imagesRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.preLoadImage(null, this);
    }
}

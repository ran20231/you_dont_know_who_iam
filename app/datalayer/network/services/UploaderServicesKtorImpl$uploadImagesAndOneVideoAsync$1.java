package com.forsale.app.datalayer.network.services;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UploaderServicesKtorImpl.kt */
@d(c = "com.forsale.app.datalayer.network.services.UploaderServicesKtorImpl", f = "UploaderServicesKtorImpl.kt", l = {100, 102, 105}, m = "uploadImagesAndOneVideoAsync")
/* loaded from: classes2.dex */
public final class UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UploaderServicesKtorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$1(UploaderServicesKtorImpl uploaderServicesKtorImpl, a<? super UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$1> aVar) {
        super(aVar);
        this.this$0 = uploaderServicesKtorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.uploadImagesAndOneVideoAsync(null, null, null, null, this);
    }
}

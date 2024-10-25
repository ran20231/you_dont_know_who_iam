package com.forsale.app.datalayer.repositories;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SupportRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SupportRepository", f = "SupportRepository.kt", l = {50, 51}, m = "getDeviceInfo")
/* loaded from: classes2.dex */
public final class SupportRepository$getDeviceInfo$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SupportRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportRepository$getDeviceInfo$1(SupportRepository supportRepository, zz.a<? super SupportRepository$getDeviceInfo$1> aVar) {
        super(aVar);
        this.this$0 = supportRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object deviceInfo;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        deviceInfo = this.this$0.getDeviceInfo(null, this);
        return deviceInfo;
    }
}

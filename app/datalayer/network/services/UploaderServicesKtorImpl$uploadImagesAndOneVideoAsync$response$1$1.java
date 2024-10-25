package com.forsale.app.datalayer.network.services;

import g00.l;
import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UploaderServicesKtorImpl.kt */
@d(c = "com.forsale.app.datalayer.network.services.UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1", f = "UploaderServicesKtorImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1 extends SuspendLambda implements q<Long, Long, a<? super p>, Object> {
    final /* synthetic */ l<Integer, p> $onProgress;
    /* synthetic */ long J$0;
    /* synthetic */ long J$1;
    int label;
    final /* synthetic */ UploaderServicesKtorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1(l<? super Integer, p> lVar, UploaderServicesKtorImpl uploaderServicesKtorImpl, a<? super UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1> aVar) {
        super(3, aVar);
        this.$onProgress = lVar;
        this.this$0 = uploaderServicesKtorImpl;
    }

    public final Object invoke(long j11, long j12, a<? super p> aVar) {
        UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1 uploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1 = new UploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1(this.$onProgress, this.this$0, aVar);
        uploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1.J$0 = j11;
        uploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1.J$1 = j12;
        return uploaderServicesKtorImpl$uploadImagesAndOneVideoAsync$response$1$1.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int progress;
        b.f();
        if (this.label == 0) {
            f.b(obj);
            long j11 = this.J$0;
            long j12 = this.J$1;
            l<Integer, p> lVar = this.$onProgress;
            progress = this.this$0.getProgress(j11, j12);
            lVar.invoke(kotlin.coroutines.jvm.internal.a.d(progress));
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ Object invoke(Long l11, Long l12, a<? super p> aVar) {
        return invoke(l11.longValue(), l12.longValue(), aVar);
    }
}

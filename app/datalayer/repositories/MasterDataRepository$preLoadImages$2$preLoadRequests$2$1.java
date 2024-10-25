package com.forsale.app.datalayer.repositories;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository$preLoadImages$2$preLoadRequests$2$1", f = "MasterDataRepository.kt", l = {383}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataRepository$preLoadImages$2$preLoadRequests$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$preLoadImages$2$preLoadRequests$2$1(MasterDataRepository masterDataRepository, String str, zz.a<? super MasterDataRepository$preLoadImages$2$preLoadRequests$2$1> aVar) {
        super(2, aVar);
        this.this$0 = masterDataRepository;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MasterDataRepository$preLoadImages$2$preLoadRequests$2$1(this.this$0, this.$it, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ImagesRepository imagesRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            imagesRepository = this.this$0.imagesRepository;
            String str = this.$it;
            this.label = 1;
            if (imagesRepository.preLoadImage(str, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MasterDataRepository$preLoadImages$2$preLoadRequests$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

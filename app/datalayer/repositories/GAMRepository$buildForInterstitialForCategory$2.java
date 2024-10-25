package com.forsale.app.datalayer.repositories;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GAMRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.GAMRepository$buildForInterstitialForCategory$2", f = "GAMRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GAMRepository$buildForInterstitialForCategory$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super AdManagerAdRequest>, Object> {
    final /* synthetic */ int $categoryId;
    final /* synthetic */ fj.a $gamContentMapping;
    int label;
    final /* synthetic */ GAMRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GAMRepository$buildForInterstitialForCategory$2(GAMRepository gAMRepository, int i11, fj.a aVar, zz.a<? super GAMRepository$buildForInterstitialForCategory$2> aVar2) {
        super(2, aVar2);
        this.this$0 = gAMRepository;
        this.$categoryId = i11;
        this.$gamContentMapping = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GAMRepository$buildForInterstitialForCategory$2(this.this$0, this.$categoryId, this.$gamContentMapping, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.label == 0) {
            f.b(obj);
            return this.this$0.buildForCategory(kotlin.coroutines.jvm.internal.a.d(this.$categoryId), this.$gamContentMapping);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super AdManagerAdRequest> aVar) {
        return ((GAMRepository$buildForInterstitialForCategory$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

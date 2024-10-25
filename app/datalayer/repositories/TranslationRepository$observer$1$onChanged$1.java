package com.forsale.app.datalayer.repositories;

import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TranslationRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.TranslationRepository$observer$1$onChanged$1", f = "TranslationRepository.kt", l = {PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TranslationRepository$observer$1$onChanged$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    int label;
    final /* synthetic */ TranslationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslationRepository$observer$1$onChanged$1(TranslationRepository translationRepository, zz.a<? super TranslationRepository$observer$1$onChanged$1> aVar) {
        super(2, aVar);
        this.this$0 = translationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new TranslationRepository$observer$1$onChanged$1(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
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
            TranslationRepository translationRepository = this.this$0;
            this.label = 1;
            if (translationRepository.getCurrentTranslationAndNotifyChange(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((TranslationRepository$observer$1$onChanged$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

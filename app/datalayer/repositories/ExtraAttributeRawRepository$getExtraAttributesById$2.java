package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtraAttributeRawRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getExtraAttributesById$2", f = "ExtraAttributeRawRepository.kt", l = {87}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExtraAttributeRawRepository$getExtraAttributesById$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ExtraAttributeEntity>, Object> {
    final /* synthetic */ int $id;
    int label;
    final /* synthetic */ ExtraAttributeRawRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraAttributeRawRepository$getExtraAttributesById$2(ExtraAttributeRawRepository extraAttributeRawRepository, int i11, zz.a<? super ExtraAttributeRawRepository$getExtraAttributesById$2> aVar) {
        super(2, aVar);
        this.this$0 = extraAttributeRawRepository;
        this.$id = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExtraAttributeRawRepository$getExtraAttributesById$2(this.this$0, this.$id, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ExtraAttributeRawDao extraAttributeRawDao;
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
            extraAttributeRawDao = this.this$0.extraAttributeRawDao;
            int i12 = this.$id;
            this.label = 1;
            obj = extraAttributeRawDao.getExtraAttributeWithId(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ExtraAttributeEntity> aVar) {
        return ((ExtraAttributeRawRepository$getExtraAttributesById$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

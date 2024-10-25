package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import g00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExtraAttributeRawRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2", f = "ExtraAttributeRawRepository.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super List<? extends ExtraAttributeOptionEntity>>, Object> {
    final /* synthetic */ int $attId;
    int label;
    final /* synthetic */ ExtraAttributeRawRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2(ExtraAttributeRawRepository extraAttributeRawRepository, int i11, zz.a<? super ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2> aVar) {
        super(2, aVar);
        this.this$0 = extraAttributeRawRepository;
        this.$attId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2(this.this$0, this.$attId, aVar);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super List<? extends ExtraAttributeOptionEntity>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super List<ExtraAttributeOptionEntity>>) aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ExtraAttributeOptionDao extraAttributeOptionDao;
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
            extraAttributeOptionDao = this.this$0.extraAttributeOptionDao;
            int i12 = this.$attId;
            this.label = 1;
            obj = extraAttributeOptionDao.getExtraAttributeOptionsBuAttributeId(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super List<ExtraAttributeOptionEntity>> aVar) {
        return ((ExtraAttributeRawRepository$getExtraAttributeOptionsBuAttributeId$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

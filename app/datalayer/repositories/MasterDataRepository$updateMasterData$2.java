package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.MasterDataModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MasterDataRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.MasterDataRepository$updateMasterData$2", f = "MasterDataRepository.kt", l = {69, 70, 71, 72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MasterDataRepository$updateMasterData$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {
    final /* synthetic */ MasterDataModel $masterDataModel;
    int label;
    final /* synthetic */ MasterDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MasterDataRepository$updateMasterData$2(MasterDataRepository masterDataRepository, MasterDataModel masterDataModel, zz.a<? super MasterDataRepository$updateMasterData$2> aVar) {
        super(2, aVar);
        this.this$0 = masterDataRepository;
        this.$masterDataModel = masterDataModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MasterDataRepository$updateMasterData$2(this.this$0, this.$masterDataModel, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2c
            if (r1 == r5) goto L28
            if (r1 == r4) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.f.b(r7)
            goto L63
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            kotlin.f.b(r7)
            goto L56
        L24:
            kotlin.f.b(r7)
            goto L49
        L28:
            kotlin.f.b(r7)
            goto L3c
        L2c:
            kotlin.f.b(r7)
            com.forsale.app.datalayer.repositories.MasterDataRepository r7 = r6.this$0
            com.forsale.app.datalayer.database.MasterDataModel r1 = r6.$masterDataModel
            r6.label = r5
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.MasterDataRepository.access$updateTables(r7, r1, r6)
            if (r7 != r0) goto L3c
            return r0
        L3c:
            com.forsale.app.datalayer.repositories.MasterDataRepository r7 = r6.this$0
            com.forsale.app.datalayer.database.MasterDataModel r1 = r6.$masterDataModel
            r6.label = r4
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.MasterDataRepository.access$updateSharedPreferences(r7, r1, r6)
            if (r7 != r0) goto L49
            return r0
        L49:
            com.forsale.app.datalayer.repositories.MasterDataRepository r7 = r6.this$0
            com.forsale.app.datalayer.database.MasterDataModel r1 = r6.$masterDataModel
            r6.label = r3
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.MasterDataRepository.access$preloadMasterDataImages(r7, r1, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            com.forsale.app.datalayer.repositories.MasterDataRepository r7 = r6.this$0
            com.forsale.app.datalayer.database.MasterDataModel r1 = r6.$masterDataModel
            r6.label = r2
            java.lang.Object r7 = com.forsale.app.datalayer.repositories.MasterDataRepository.access$updateAppCacheTables(r7, r1, r6)
            if (r7 != r0) goto L63
            return r0
        L63:
            wz.p r7 = wz.p.f75480a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataRepository$updateMasterData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MasterDataRepository$updateMasterData$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

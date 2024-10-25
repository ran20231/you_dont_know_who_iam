package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.database.SearchHistoryEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SearchHistoryRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.SearchHistoryRepository$insert$2", f = "SearchHistoryRepository.kt", l = {57, 62, 64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SearchHistoryRepository$insert$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Long>, Object> {
    final /* synthetic */ SearchHistoryEntity $entity;
    int label;
    final /* synthetic */ SearchHistoryRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchHistoryRepository$insert$2(SearchHistoryRepository searchHistoryRepository, SearchHistoryEntity searchHistoryEntity, zz.a<? super SearchHistoryRepository$insert$2> aVar) {
        super(2, aVar);
        this.this$0 = searchHistoryRepository;
        this.$entity = searchHistoryEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SearchHistoryRepository$insert$2(this.this$0, this.$entity, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[PHI: r14 
      PHI: (r14v9 java.lang.Object) = (r14v8 java.lang.Object), (r14v0 java.lang.Object) binds: [B:21:0x0070, B:7:0x0011] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            kotlin.f.b(r14)
            goto L73
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            kotlin.f.b(r14)
            goto L54
        L21:
            kotlin.f.b(r14)
            goto L45
        L25:
            kotlin.f.b(r14)
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r14 = r13.this$0
            com.forsale.app.datalayer.database.SearchHistoryEntity r1 = r13.$entity
            java.lang.String r1 = r1.getSearchText()
            com.forsale.app.datalayer.database.SearchHistoryEntity r5 = r13.$entity
            com.forsale.app.datalayer.database.CategoryEntity r5 = r5.getCategory()
            com.forsale.app.datalayer.database.SearchHistoryEntity r6 = r13.$entity
            com.forsale.app.datalayer.database.SearchHistoryEntity$SearchHistorySource r6 = r6.getSource()
            r13.label = r4
            java.lang.Object r14 = com.forsale.app.datalayer.repositories.SearchHistoryRepository.access$getSingle(r14, r1, r5, r6, r13)
            if (r14 != r0) goto L45
            return r0
        L45:
            com.forsale.app.datalayer.database.SearchHistoryEntity r14 = (com.forsale.app.datalayer.database.SearchHistoryEntity) r14
            if (r14 == 0) goto L54
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r1 = r13.this$0
            r13.label = r3
            java.lang.Object r14 = r1.delete(r14, r13)
            if (r14 != r0) goto L54
            return r0
        L54:
            com.forsale.app.datalayer.repositories.SearchHistoryRepository r14 = r13.this$0
            com.forsale.app.datalayer.repositories.SearchHistoryDao r14 = com.forsale.app.datalayer.repositories.SearchHistoryRepository.access$getSearchHistoryDao$p(r14)
            com.forsale.app.datalayer.database.SearchHistoryEntity r3 = r13.$entity
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r12 = 0
            com.forsale.app.datalayer.database.SearchHistoryEntity r1 = com.forsale.app.datalayer.database.SearchHistoryEntity.copy$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r13.label = r2
            java.lang.Object r14 = r14.insert(r1, r13)
            if (r14 != r0) goto L73
            return r0
        L73:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.SearchHistoryRepository$insert$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super Long> aVar) {
        return ((SearchHistoryRepository$insert$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

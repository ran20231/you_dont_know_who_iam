package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository$getRecommendedSections$2", f = "ListingsRepository.kt", l = {394, 394, 393, 395}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsRepository$getRecommendedSections$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super RecommendedSectionsResponse>, Object> {
    final /* synthetic */ int $categoryId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$getRecommendedSections$2(ListingsRepository listingsRepository, int i11, zz.a<? super ListingsRepository$getRecommendedSections$2> aVar) {
        super(2, aVar);
        this.this$0 = listingsRepository;
        this.$categoryId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingsRepository$getRecommendedSections$2(this.this$0, this.$categoryId, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[PHI: r12 
      PHI: (r12v12 java.lang.Object) = (r12v11 java.lang.Object), (r12v0 java.lang.Object) binds: [B:27:0x00a6, B:8:0x0015] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r11.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L4c
            if (r1 == r5) goto L3d
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            kotlin.f.b(r12)
            goto La9
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L22:
            java.lang.Object r1 = r11.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r1 = (com.forsale.app.datalayer.repositories.ListingsRepository) r1
            kotlin.f.b(r12)
            goto L9c
        L2b:
            int r1 = r11.I$0
            java.lang.Object r4 = r11.L$2
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r11.L$1
            com.forsale.app.datalayer.network.services.ListingsService r5 = (com.forsale.app.datalayer.network.services.ListingsService) r5
            java.lang.Object r7 = r11.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r7 = (com.forsale.app.datalayer.repositories.ListingsRepository) r7
            kotlin.f.b(r12)
            goto L85
        L3d:
            java.lang.Object r1 = r11.L$1
            com.forsale.app.datalayer.network.services.ListingsService r1 = (com.forsale.app.datalayer.network.services.ListingsService) r1
            java.lang.Object r5 = r11.L$0
            com.forsale.app.datalayer.repositories.ListingsRepository r5 = (com.forsale.app.datalayer.repositories.ListingsRepository) r5
            kotlin.f.b(r12)
            r9 = r5
            r5 = r1
            r1 = r9
            goto L68
        L4c:
            kotlin.f.b(r12)
            com.forsale.app.datalayer.repositories.ListingsRepository r12 = r11.this$0
            com.forsale.app.datalayer.network.services.ListingsService r1 = com.forsale.app.datalayer.repositories.ListingsRepository.access$getListingsService$p(r12)
            com.forsale.app.datalayer.repositories.ListingsRepository r7 = r11.this$0
            r11.L$0 = r12
            r11.L$1 = r1
            r11.label = r5
            java.lang.Object r5 = r7.deviceId(r11)
            if (r5 != r0) goto L64
            return r0
        L64:
            r9 = r1
            r1 = r12
            r12 = r5
            r5 = r9
        L68:
            java.lang.String r12 = (java.lang.String) r12
            int r7 = r11.$categoryId
            com.forsale.app.utils.LocaleManager r8 = com.forsale.app.utils.LocaleManager.f39597a
            r11.L$0 = r1
            r11.L$1 = r5
            r11.L$2 = r12
            r11.I$0 = r7
            r11.label = r4
            java.lang.Object r4 = r8.h(r11)
            if (r4 != r0) goto L7f
            return r0
        L7f:
            r9 = r4
            r4 = r12
            r12 = r9
            r10 = r7
            r7 = r1
            r1 = r10
        L85:
            java.lang.String r12 = (java.lang.String) r12
            com.forsale.app.datalayer.network.requestsbodies.RecommendedSectionsBody r8 = new com.forsale.app.datalayer.network.requestsbodies.RecommendedSectionsBody
            r8.<init>(r4, r1, r12)
            r11.L$0 = r7
            r11.L$1 = r6
            r11.L$2 = r6
            r11.label = r3
            java.lang.Object r12 = r5.recommendedSections(r8, r11)
            if (r12 != r0) goto L9b
            return r0
        L9b:
            r1 = r7
        L9c:
            com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse r12 = (com.forsale.app.datalayer.network.responses.RecommendedSectionsResponse) r12
            r11.L$0 = r6
            r11.label = r2
            java.lang.Object r12 = com.forsale.app.datalayer.repositories.ListingsRepository.access$updateAttrsInfo(r1, r12, r11)
            if (r12 != r0) goto La9
            return r0
        La9:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ListingsRepository$getRecommendedSections$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super RecommendedSectionsResponse> aVar) {
        return ((ListingsRepository$getRecommendedSections$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

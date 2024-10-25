package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.requestsbodies.UserType;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository$getForSaleRealty$2", f = "ListingsRepository.kt", l = {407}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsRepository$getForSaleRealty$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ListingsResponse>, Object> {
    final /* synthetic */ int $pageSize;
    int label;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$getForSaleRealty$2(ListingsRepository listingsRepository, int i11, zz.a<? super ListingsRepository$getForSaleRealty$2> aVar) {
        super(2, aVar);
        this.this$0 = listingsRepository;
        this.$pageSize = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingsRepository$getForSaleRealty$2(this.this$0, this.$pageSize, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        UserType userType = UserType.FOR_SALE_REALTY;
        ListingsRepository listingsRepository = this.this$0;
        Integer d11 = kotlin.coroutines.jvm.internal.a.d(this.$pageSize);
        this.label = 1;
        Object normalListings$default = ListingsRepository.getNormalListings$default(listingsRepository, 1, null, null, null, null, null, userType, d11, null, null, null, this, 1854, null);
        if (normalListings$default == f11) {
            return f11;
        }
        return normalListings$default;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ListingsResponse> aVar) {
        return ((ListingsRepository$getForSaleRealty$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

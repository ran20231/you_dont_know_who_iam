package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.features.powerpins.ListingsScreenType;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository$getSpotlightListings$2", f = "ListingsRepository.kt", l = {386}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingsRepository$getSpotlightListings$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super ListingsResponse>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$getSpotlightListings$2(ListingsRepository listingsRepository, zz.a<? super ListingsRepository$getSpotlightListings$2> aVar) {
        super(2, aVar);
        this.this$0 = listingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingsRepository$getSpotlightListings$2(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object normalListings$default;
        ListingsRepository listingsRepository;
        ListingsResponse changePinnedShuffleItemStatus;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
                listingsRepository = (ListingsRepository) this.L$0;
                normalListings$default = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingsRepository listingsRepository2 = this.this$0;
            ListingsScreenType listingsScreenType = ListingsScreenType.SPOTLIGHT;
            this.L$0 = listingsRepository2;
            this.label = 1;
            normalListings$default = ListingsRepository.getNormalListings$default(listingsRepository2, 1, listingsScreenType, null, null, null, null, null, null, null, null, null, this, 2044, null);
            if (normalListings$default == f11) {
                return f11;
            }
            listingsRepository = listingsRepository2;
        }
        changePinnedShuffleItemStatus = listingsRepository.changePinnedShuffleItemStatus((ListingsResponse) normalListings$default, null);
        return changePinnedShuffleItemStatus;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super ListingsResponse> aVar) {
        return ((ListingsRepository$getSpotlightListings$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

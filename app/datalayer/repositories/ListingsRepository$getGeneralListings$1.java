package com.forsale.app.datalayer.repositories;

import com.leanplum.internal.ResourceQualifiers;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingsRepository.kt */
@d(c = "com.forsale.app.datalayer.repositories.ListingsRepository", f = "ListingsRepository.kt", l = {119, 124, 127, 129, 122, 138, 141, 143, 136, 158, 160, 152, 173, 175, 167, 188, 190, 182, 197, ResourceQualifiers.Qualifier.AnonymousClass14.DENSITY_TV, 216, 218, 211, 227, 233, 239, 244, 251, 254, 257, 262}, m = "getGeneralListings")
/* loaded from: classes2.dex */
public final class ListingsRepository$getGeneralListings$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ListingsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingsRepository$getGeneralListings$1(ListingsRepository listingsRepository, zz.a<? super ListingsRepository$getGeneralListings$1> aVar) {
        super(aVar);
        this.this$0 = listingsRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getGeneralListings(0, null, null, null, null, null, null, null, null, null, null, null, null, this);
    }
}

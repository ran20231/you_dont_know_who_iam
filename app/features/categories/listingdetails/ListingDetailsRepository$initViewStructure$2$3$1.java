package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.b0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsRepository.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsRepository$initViewStructure$2$3$1", f = "ListingDetailsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsRepository$initViewStructure$2$3$1 extends SuspendLambda implements p<xb.a, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25265a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f25266b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsRepository f25267c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsRepository$initViewStructure$2$3$1(ListingDetailsRepository listingDetailsRepository, zz.a<? super ListingDetailsRepository$initViewStructure$2$3$1> aVar) {
        super(2, aVar);
        this.f25267c = listingDetailsRepository;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(xb.a aVar, zz.a<? super wz.p> aVar2) {
        return ((ListingDetailsRepository$initViewStructure$2$3$1) create(aVar, aVar2)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ListingDetailsRepository$initViewStructure$2$3$1 listingDetailsRepository$initViewStructure$2$3$1 = new ListingDetailsRepository$initViewStructure$2$3$1(this.f25267c, aVar);
        listingDetailsRepository$initViewStructure$2$3$1.f25266b = obj;
        return listingDetailsRepository$initViewStructure$2$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b0 b0Var;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f25265a == 0) {
            kotlin.f.b(obj);
            b0Var = this.f25267c.D;
            b0Var.postValue((xb.a) this.f25266b);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

package com.forsale.app.features.categories.listings.paging;

import g00.l;
import g00.p;
import j0.n1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PagedListings.kt */
@d(c = "com.forsale.app.features.categories.listings.paging.PagedListingsKt$PagedListings$2$1", f = "PagedListings.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PagedListingsKt$PagedListings$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30948a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ n1<Integer> f30949b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<Integer, wz.p> f30950c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PagedListingsKt$PagedListings$2$1(n1<Integer> n1Var, l<? super Integer, wz.p> lVar, zz.a<? super PagedListingsKt$PagedListings$2$1> aVar) {
        super(2, aVar);
        this.f30949b = n1Var;
        this.f30950c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PagedListingsKt$PagedListings$2$1(this.f30949b, this.f30950c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Integer b11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f30948a == 0) {
            f.b(obj);
            b11 = PagedListingsKt.b(this.f30949b);
            if (b11 != null) {
                this.f30950c.invoke(kotlin.coroutines.jvm.internal.a.d(b11.intValue()));
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PagedListingsKt$PagedListings$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

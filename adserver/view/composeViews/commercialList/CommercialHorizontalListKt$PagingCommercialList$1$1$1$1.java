package com.forsale.adserver.view.composeViews.commercialList;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CommercialHorizontalList.kt */
@d(c = "com.forsale.adserver.view.composeViews.commercialList.CommercialHorizontalListKt$PagingCommercialList$1$1$1$1", f = "CommercialHorizontalList.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CommercialHorizontalListKt$PagingCommercialList$1$1$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20980a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f20981b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommercialHorizontalListKt$PagingCommercialList$1$1$1$1(g00.a<wz.p> aVar, zz.a<? super CommercialHorizontalListKt$PagingCommercialList$1$1$1$1> aVar2) {
        super(2, aVar2);
        this.f20981b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new CommercialHorizontalListKt$PagingCommercialList$1$1$1$1(this.f20981b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f20980a == 0) {
            f.b(obj);
            this.f20981b.invoke();
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((CommercialHorizontalListKt$PagingCommercialList$1$1$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

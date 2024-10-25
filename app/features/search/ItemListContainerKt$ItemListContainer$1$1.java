package com.forsale.app.features.search;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ItemListContainer.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.search.ItemListContainerKt$ItemListContainer$1$1", f = "ItemListContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ItemListContainerKt$ItemListContainer$1$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36488a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f36489b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemListContainerKt$ItemListContainer$1$1(g00.a<wz.p> aVar, zz.a<? super ItemListContainerKt$ItemListContainer$1$1> aVar2) {
        super(2, aVar2);
        this.f36489b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ItemListContainerKt$ItemListContainer$1$1(this.f36489b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f36488a == 0) {
            kotlin.f.b(obj);
            g00.a<wz.p> aVar = this.f36489b;
            if (aVar != null) {
                aVar.invoke();
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ItemListContainerKt$ItemListContainer$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

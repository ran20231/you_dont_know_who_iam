package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.foundation.lazy.LazyListState;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import x.j;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragAndDrop.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.DragDropState$onDrag$1", f = "DragAndDrop.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DragDropState$onDrag$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36057a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DragDropState f36058b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Integer f36059c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j f36060d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ j f36061e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDrag$1(DragDropState dragDropState, Integer num, j jVar, j jVar2, zz.a<? super DragDropState$onDrag$1> aVar) {
        super(2, aVar);
        this.f36058b = dragDropState;
        this.f36059c = num;
        this.f36060d = jVar;
        this.f36061e = jVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DragDropState$onDrag$1(this.f36058b, this.f36059c, this.f36060d, this.f36061e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LazyListState lazyListState;
        LazyListState lazyListState2;
        p pVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36057a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            lazyListState = this.f36058b.f36047a;
            int intValue = this.f36059c.intValue();
            lazyListState2 = this.f36058b.f36047a;
            int s11 = lazyListState2.s();
            this.f36057a = 1;
            if (lazyListState.K(intValue, s11, this) == f11) {
                return f11;
            }
        }
        pVar = this.f36058b.f36050d;
        pVar.invoke(kotlin.coroutines.jvm.internal.a.d(this.f36060d.getIndex()), kotlin.coroutines.jvm.internal.a.d(this.f36061e.getIndex()));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DragDropState$onDrag$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

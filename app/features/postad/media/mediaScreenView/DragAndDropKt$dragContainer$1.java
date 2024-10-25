package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.f0;
import androidx.compose.ui.input.pointer.x;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
/* compiled from: DragAndDrop.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$dragContainer$1", f = "DragAndDrop.kt", l = {166}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DragAndDropKt$dragContainer$1 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36037a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f36038b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DragDropState f36039c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropKt$dragContainer$1(DragDropState dragDropState, zz.a<? super DragAndDropKt$dragContainer$1> aVar) {
        super(2, aVar);
        this.f36039c = dragDropState;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((DragAndDropKt$dragContainer$1) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        DragAndDropKt$dragContainer$1 dragAndDropKt$dragContainer$1 = new DragAndDropKt$dragContainer$1(this.f36039c, aVar);
        dragAndDropKt$dragContainer$1.f36038b = obj;
        return dragAndDropKt$dragContainer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36037a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            f0 f0Var = (f0) this.f36038b;
            final DragDropState dragDropState = this.f36039c;
            l<a1.f, wz.p> lVar = new l<a1.f, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$dragContainer$1.1
                {
                    super(1);
                }

                public final void b(long j11) {
                    DragDropState.this.o(j11);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(a1.f fVar) {
                    b(fVar.x());
                    return wz.p.f75480a;
                }
            };
            final DragDropState dragDropState2 = this.f36039c;
            g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$dragContainer$1.2
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DragDropState.this.n();
                }
            };
            final DragDropState dragDropState3 = this.f36039c;
            g00.a<wz.p> aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$dragContainer$1.3
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    DragDropState.this.n();
                }
            };
            final DragDropState dragDropState4 = this.f36039c;
            p<x, a1.f, wz.p> pVar = new p<x, a1.f, wz.p>() { // from class: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$dragContainer$1.4
                {
                    super(2);
                }

                public final void b(x change, long j11) {
                    o.i(change, "change");
                    change.a();
                    DragDropState.this.m(j11);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(x xVar, a1.f fVar) {
                    b(xVar, fVar.x());
                    return wz.p.f75480a;
                }
            };
            this.f36037a = 1;
            if (DragGestureDetectorKt.g(f0Var, lVar, aVar, aVar2, pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}

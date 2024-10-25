package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.foundation.lazy.LazyListState;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: DragAndDrop.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$rememberDragDropState$1", f = "DragAndDrop.kt", l = {42, 43}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DragAndDropKt$rememberDragDropState$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DragDropState f36045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LazyListState f36046c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropKt$rememberDragDropState$1(DragDropState dragDropState, LazyListState lazyListState, zz.a<? super DragAndDropKt$rememberDragDropState$1> aVar) {
        super(2, aVar);
        this.f36045b = dragDropState;
        this.f36046c = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DragAndDropKt$rememberDragDropState$1(this.f36045b, this.f36046c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0045 -> B:11:0x0021). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f36044a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L1d
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            kotlin.f.b(r7)
            r1 = r0
            r0 = r6
            goto L34
        L1d:
            kotlin.f.b(r7)
            r7 = r6
        L21:
            com.forsale.app.features.postad.media.mediaScreenView.DragDropState r1 = r7.f36045b
            kotlinx.coroutines.channels.Channel r1 = r1.l()
            r7.f36044a = r3
            java.lang.Object r1 = r1.receive(r7)
            if (r1 != r0) goto L30
            return r0
        L30:
            r5 = r0
            r0 = r7
            r7 = r1
            r1 = r5
        L34:
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            androidx.compose.foundation.lazy.LazyListState r4 = r0.f36046c
            r0.f36044a = r2
            java.lang.Object r7 = androidx.compose.foundation.gestures.ScrollExtensionsKt.c(r4, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r7 = r0
            r0 = r1
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.media.mediaScreenView.DragAndDropKt$rememberDragDropState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DragAndDropKt$rememberDragDropState$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

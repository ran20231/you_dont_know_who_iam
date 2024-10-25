package com.forsale.app.features.postad.media.mediaScreenView;

import androidx.compose.animation.core.Animatable;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import r.j;
import r.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragAndDrop.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.postad.media.mediaScreenView.DragDropState$onDragInterrupted$1", f = "DragAndDrop.kt", l = {94, 95}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DragDropState$onDragInterrupted$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36062a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DragDropState f36063b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f36064c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragDropState$onDragInterrupted$1(DragDropState dragDropState, float f11, zz.a<? super DragDropState$onDragInterrupted$1> aVar) {
        super(2, aVar);
        this.f36063b = dragDropState;
        this.f36064c = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new DragDropState$onDragInterrupted$1(this.f36063b, this.f36064c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f36062a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    this.f36063b.s(null);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            Animatable<Float, j> k11 = this.f36063b.k();
            Float c11 = kotlin.coroutines.jvm.internal.a.c(this.f36064c);
            this.f36062a = 1;
            if (k11.t(c11, this) == f11) {
                return f11;
            }
        }
        Animatable<Float, j> k12 = this.f36063b.k();
        Float c12 = kotlin.coroutines.jvm.internal.a.c(0.0f);
        y0 i12 = r.g.i(0.0f, 400.0f, kotlin.coroutines.jvm.internal.a.c(1.0f), 1, null);
        this.f36062a = 2;
        if (Animatable.f(k12, c12, i12, null, null, this, 12, null) == f11) {
            return f11;
        }
        this.f36063b.s(null);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((DragDropState$onDragInterrupted$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

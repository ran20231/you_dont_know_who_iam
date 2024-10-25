package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.ui.input.pointer.f0;
import androidx.compose.ui.input.pointer.x;
import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZoomableImage.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$1$1", f = "ZoomableImage.kt", l = {73}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ZoomableImageKt$ZoomableImage$1$1$1 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26255a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f26256b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k0<Float> f26257c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<a1.f> f26258d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageKt$ZoomableImage$1$1$1(k0<Float> k0Var, k0<a1.f> k0Var2, zz.a<? super ZoomableImageKt$ZoomableImage$1$1$1> aVar) {
        super(2, aVar);
        this.f26257c = k0Var;
        this.f26258d = k0Var2;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((ZoomableImageKt$ZoomableImage$1$1$1) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ZoomableImageKt$ZoomableImage$1$1$1 zoomableImageKt$ZoomableImage$1$1$1 = new ZoomableImageKt$ZoomableImage$1$1$1(this.f26257c, this.f26258d, aVar);
        zoomableImageKt$ZoomableImage$1$1$1.f26256b = obj;
        return zoomableImageKt$ZoomableImage$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        float b11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26255a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            f0 f0Var = (f0) this.f26256b;
            b11 = ZoomableImageKt.b(this.f26257c);
            if (b11 > 1.0f) {
                final k0<a1.f> k0Var = this.f26258d;
                p<x, a1.f, wz.p> pVar = new p<x, a1.f, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$1$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(x xVar, long j11) {
                        long d11;
                        o.i(xVar, "<anonymous parameter 0>");
                        k0<a1.f> k0Var2 = k0Var;
                        d11 = ZoomableImageKt.d(k0Var2);
                        ZoomableImageKt.e(k0Var2, a1.f.t(d11, j11));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(x xVar, a1.f fVar) {
                        b(xVar, fVar.x());
                        return wz.p.f75480a;
                    }
                };
                this.f26255a = 1;
                if (DragGestureDetectorKt.f(f0Var, null, null, null, pVar, this, 7, null) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }
}

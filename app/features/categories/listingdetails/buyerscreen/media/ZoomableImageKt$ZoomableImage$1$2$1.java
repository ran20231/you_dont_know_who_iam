package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.ui.input.pointer.f0;
import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m00.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZoomableImage.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$2$1", f = "ZoomableImage.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ZoomableImageKt$ZoomableImage$1$2$1 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26260a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f26261b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f26262c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<Float> f26263d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k0<a1.f> f26264e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageKt$ZoomableImage$1$2$1(float f11, k0<Float> k0Var, k0<a1.f> k0Var2, zz.a<? super ZoomableImageKt$ZoomableImage$1$2$1> aVar) {
        super(2, aVar);
        this.f26262c = f11;
        this.f26263d = k0Var;
        this.f26264e = k0Var2;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((ZoomableImageKt$ZoomableImage$1$2$1) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ZoomableImageKt$ZoomableImage$1$2$1 zoomableImageKt$ZoomableImage$1$2$1 = new ZoomableImageKt$ZoomableImage$1$2$1(this.f26262c, this.f26263d, this.f26264e, aVar);
        zoomableImageKt$ZoomableImage$1$2$1.f26261b = obj;
        return zoomableImageKt$ZoomableImage$1$2$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26260a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            final float f12 = this.f26262c;
            final k0<Float> k0Var = this.f26263d;
            final k0<a1.f> k0Var2 = this.f26264e;
            p<Float, a1.f, wz.p> pVar = new p<Float, a1.f, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$2$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(float f13, long j11) {
                    float b11;
                    float k11;
                    long d11;
                    float b12;
                    float b13;
                    b11 = ZoomableImageKt.b(k0Var);
                    k11 = o.k(b11 * f13, 1.0f, f12);
                    d11 = ZoomableImageKt.d(k0Var2);
                    b12 = ZoomableImageKt.b(k0Var);
                    long t11 = a1.f.t(d11, a1.f.j(a1.f.u(j11, b12), k11));
                    ZoomableImageKt.c(k0Var, k11);
                    b13 = ZoomableImageKt.b(k0Var);
                    if (b13 > 1.0f) {
                        ZoomableImageKt.e(k0Var2, t11);
                        return;
                    }
                    ZoomableImageKt.c(k0Var, 1.0f);
                    ZoomableImageKt.e(k0Var2, a1.f.f62b.c());
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(Float f13, a1.f fVar) {
                    b(f13.floatValue(), fVar.x());
                    return wz.p.f75480a;
                }
            };
            this.f26260a = 1;
            if (ZoomableImageKt.n((f0) this.f26261b, pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}

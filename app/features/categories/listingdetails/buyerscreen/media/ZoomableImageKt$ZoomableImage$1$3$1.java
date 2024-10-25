package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.ui.input.pointer.f0;
import g00.l;
import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ZoomableImage.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$3$1", f = "ZoomableImage.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ZoomableImageKt$ZoomableImage$1$3$1 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26268a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f26269b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f26270c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<Float> f26271d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k0<a1.f> f26272e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableImageKt$ZoomableImage$1$3$1(float f11, k0<Float> k0Var, k0<a1.f> k0Var2, zz.a<? super ZoomableImageKt$ZoomableImage$1$3$1> aVar) {
        super(2, aVar);
        this.f26270c = f11;
        this.f26271d = k0Var;
        this.f26272e = k0Var2;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((ZoomableImageKt$ZoomableImage$1$3$1) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ZoomableImageKt$ZoomableImage$1$3$1 zoomableImageKt$ZoomableImage$1$3$1 = new ZoomableImageKt$ZoomableImage$1$3$1(this.f26270c, this.f26271d, this.f26272e, aVar);
        zoomableImageKt$ZoomableImage$1$3$1.f26269b = obj;
        return zoomableImageKt$ZoomableImage$1$3$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26268a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            f0 f0Var = (f0) this.f26269b;
            final float f12 = this.f26270c;
            final k0<Float> k0Var = this.f26271d;
            final k0<a1.f> k0Var2 = this.f26272e;
            l<a1.f, wz.p> lVar = new l<a1.f, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$ZoomableImage$1$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void b(long j11) {
                    float b11;
                    boolean z11;
                    float f13;
                    float b12;
                    long c11;
                    b11 = ZoomableImageKt.b(k0Var);
                    boolean z12 = true;
                    if (b11 == 1.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        f13 = f12;
                    } else {
                        f13 = 1.0f;
                    }
                    b12 = ZoomableImageKt.b(k0Var);
                    if (b12 != 1.0f) {
                        z12 = false;
                    }
                    if (z12) {
                        c11 = ZoomableImageKt.d(k0Var2);
                    } else {
                        c11 = a1.f.f62b.c();
                    }
                    ZoomableImageKt.c(k0Var, f13);
                    ZoomableImageKt.e(k0Var2, c11);
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(a1.f fVar) {
                    b(fVar.x());
                    return wz.p.f75480a;
                }
            };
            this.f26268a = 1;
            if (TapGestureDetectorKt.j(f0Var, lVar, null, null, null, this, 14, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}

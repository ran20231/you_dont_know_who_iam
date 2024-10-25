package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import androidx.compose.ui.input.pointer.f0;
import g00.p;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
/* compiled from: ZoomableImage.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$detectZoom$2", f = "ZoomableImage.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ZoomableImageKt$detectZoom$2 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26284a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f26285b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<Float, a1.f, wz.p> f26286c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ZoomableImage.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$detectZoom$2$1", f = "ZoomableImage.kt", l = {145, 147}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$detectZoom$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements p<androidx.compose.ui.input.pointer.c, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        float f26287a;

        /* renamed from: b  reason: collision with root package name */
        float f26288b;

        /* renamed from: c  reason: collision with root package name */
        int f26289c;

        /* renamed from: d  reason: collision with root package name */
        int f26290d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f26291e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p<Float, a1.f, wz.p> f26292f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(p<? super Float, ? super a1.f, wz.p> pVar, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f26292f = pVar;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(androidx.compose.ui.input.pointer.c cVar, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(cVar, aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26292f, aVar);
            anonymousClass1.f26291e = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
            r12 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x012a, code lost:
            r5 = true;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0078 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0076 -> B:18:0x0079). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.buyerscreen.media.ZoomableImageKt$detectZoom$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ZoomableImageKt$detectZoom$2(p<? super Float, ? super a1.f, wz.p> pVar, zz.a<? super ZoomableImageKt$detectZoom$2> aVar) {
        super(2, aVar);
        this.f26286c = pVar;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((ZoomableImageKt$detectZoom$2) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        ZoomableImageKt$detectZoom$2 zoomableImageKt$detectZoom$2 = new ZoomableImageKt$detectZoom$2(this.f26286c, aVar);
        zoomableImageKt$detectZoom$2.f26285b = obj;
        return zoomableImageKt$detectZoom$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26284a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26286c, null);
            this.f26284a = 1;
            if (((f0) this.f26285b).z0(anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}

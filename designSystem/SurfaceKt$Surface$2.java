package com.forsale.designSystem;

import androidx.compose.ui.input.pointer.f0;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* compiled from: Surface.kt */
@d(c = "com.forsale.designSystem.SurfaceKt$Surface$2", f = "Surface.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class SurfaceKt$Surface$2 extends SuspendLambda implements p<f0, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40666a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SurfaceKt$Surface$2(zz.a<? super SurfaceKt$Surface$2> aVar) {
        super(2, aVar);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(f0 f0Var, zz.a<? super wz.p> aVar) {
        return ((SurfaceKt$Surface$2) create(f0Var, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SurfaceKt$Surface$2(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f40666a == 0) {
            f.b(obj);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

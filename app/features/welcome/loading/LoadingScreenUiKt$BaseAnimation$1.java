package com.forsale.app.features.welcome.loading;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.RepeatMode;
import com.google.logging.type.LogSeverity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import r.f0;
import r.u0;
/* compiled from: LoadingScreenUi.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingScreenUiKt$BaseAnimation$1", f = "LoadingScreenUi.kt", l = {180}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoadingScreenUiKt$BaseAnimation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37184a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Animatable<Float, r.j> f37185b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingScreenUiKt$BaseAnimation$1(Animatable<Float, r.j> animatable, zz.a<? super LoadingScreenUiKt$BaseAnimation$1> aVar) {
        super(2, aVar);
        this.f37185b = animatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingScreenUiKt$BaseAnimation$1(this.f37185b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37184a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Animatable<Float, r.j> animatable = this.f37185b;
            Float c11 = kotlin.coroutines.jvm.internal.a.c(1.0f);
            u0 g11 = r.g.g(1, r.g.j(LogSeverity.ERROR_VALUE, LogSeverity.INFO_VALUE, f0.n()), RepeatMode.Reverse, 0L, 8, null);
            this.f37184a = 1;
            if (Animatable.f(animatable, c11, g11, null, null, this, 12, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingScreenUiKt$BaseAnimation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

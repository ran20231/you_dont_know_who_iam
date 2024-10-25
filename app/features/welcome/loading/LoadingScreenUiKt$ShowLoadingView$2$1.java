package com.forsale.app.features.welcome.loading;

import g00.p;
import j0.k0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingScreenUi.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$2$1", f = "LoadingScreenUi.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingScreenUiKt$ShowLoadingView$2$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37193a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f37194b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f37195c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f37196d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingScreenUiKt$ShowLoadingView$2$1(boolean z11, k0<Boolean> k0Var, k0<Boolean> k0Var2, zz.a<? super LoadingScreenUiKt$ShowLoadingView$2$1> aVar) {
        super(2, aVar);
        this.f37194b = z11;
        this.f37195c = k0Var;
        this.f37196d = k0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingScreenUiKt$ShowLoadingView$2$1(this.f37194b, this.f37195c, this.f37196d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37193a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            f12 = LoadingScreenUiKt.f(this.f37195c);
            if (f12 && this.f37194b) {
                x10.a.b("logo end", new Object[0]);
                this.f37193a = 1;
                if (DelayKt.delay(1500L, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
        LoadingScreenUiKt.i(this.f37196d, true);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingScreenUiKt$ShowLoadingView$2$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

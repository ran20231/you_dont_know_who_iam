package com.forsale.app.features.welcome.loading;

import g00.p;
import j0.k0;
import j0.n1;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingScreenUi.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingScreenUiKt$ShowLoadingView$1", f = "LoadingScreenUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingScreenUiKt$ShowLoadingView$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37188a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k0<Integer> f37189b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<Integer> f37190c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ n1<Float> f37191d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f37192e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingScreenUiKt$ShowLoadingView$1(k0<Integer> k0Var, List<Integer> list, n1<Float> n1Var, k0<Boolean> k0Var2, zz.a<? super LoadingScreenUiKt$ShowLoadingView$1> aVar) {
        super(2, aVar);
        this.f37189b = k0Var;
        this.f37190c = list;
        this.f37191d = n1Var;
        this.f37192e = k0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingScreenUiKt$ShowLoadingView$1(this.f37189b, this.f37190c, this.f37191d, this.f37192e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float c11;
        boolean z11;
        float c12;
        boolean d11;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f37188a == 0) {
            kotlin.f.b(obj);
            c11 = LoadingScreenUiKt.c(this.f37191d);
            double d12 = 1.0f;
            boolean z12 = true;
            if (((float) Math.ceil(c11)) == ((float) Math.ceil(d12))) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                d11 = LoadingScreenUiKt.d(this.f37192e);
                if (!d11) {
                    LoadingScreenUiKt.e(this.f37192e, true);
                    if (this.f37189b.getValue().intValue() > this.f37190c.size()) {
                        this.f37189b.setValue(kotlin.coroutines.jvm.internal.a.d(0));
                    } else {
                        k0<Integer> k0Var = this.f37189b;
                        k0Var.setValue(kotlin.coroutines.jvm.internal.a.d(k0Var.getValue().intValue() + 1));
                    }
                }
            }
            c12 = LoadingScreenUiKt.c(this.f37191d);
            if (((float) Math.ceil(c12)) != ((float) Math.ceil(d12))) {
                z12 = false;
            }
            if (!z12) {
                LoadingScreenUiKt.e(this.f37192e, false);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingScreenUiKt$ShowLoadingView$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

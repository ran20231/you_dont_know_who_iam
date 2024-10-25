package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$onStop$1", f = "MainContainerActivity.kt", l = {689}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainContainerActivity$onStop$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31427a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31428b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$onStop$1(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$onStop$1> aVar) {
        super(2, aVar);
        this.f31428b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$onStop$1(this.f31428b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a m12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31427a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            m12 = this.f31428b.m1();
            this.f31427a = 1;
            if (invoke.a(m12, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$onStop$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

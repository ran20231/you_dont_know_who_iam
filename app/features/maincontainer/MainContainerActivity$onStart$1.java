package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$onStart$1", f = "MainContainerActivity.kt", l = {682}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class MainContainerActivity$onStart$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31425a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31426b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$onStart$1(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$onStart$1> aVar) {
        super(2, aVar);
        this.f31426b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$onStart$1(this.f31426b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a m12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31425a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
            m12 = this.f31426b.m1();
            this.f31425a = 1;
            if (invoke.b(m12, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$onStart$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

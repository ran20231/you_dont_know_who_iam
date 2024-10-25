package com.forsale.app.features.maincontainer;

import androidx.navigation.NavDestination;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerActivity$initMainContainerPrioritizer$1", f = "MainContainerActivity.kt", l = {833}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerActivity$initMainContainerPrioritizer$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31367a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerActivity f31368b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerActivity$initMainContainerPrioritizer$1(MainContainerActivity mainContainerActivity, zz.a<? super MainContainerActivity$initMainContainerPrioritizer$1> aVar) {
        super(2, aVar);
        this.f31368b = mainContainerActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerActivity$initMainContainerPrioritizer$1(this.f31368b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ij.a m12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31367a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            NavDestination F = this.f31368b.q1().F();
            boolean z11 = false;
            if (F != null && F.q() == r0.N5) {
                z11 = true;
            }
            if (!z11) {
                com.forsale.app.utils.popUpsPrioritizer.a invoke = com.forsale.app.utils.popUpsPrioritizer.a.f40401a.invoke();
                m12 = this.f31368b.m1();
                this.f31367a = 1;
                if (invoke.b(m12, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerActivity$initMainContainerPrioritizer$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

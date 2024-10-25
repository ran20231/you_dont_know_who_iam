package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$decideSearchBarElevation$1", f = "MainContainerViewModel.kt", l = {498}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$decideSearchBarElevation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31503a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31504b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31505c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$decideSearchBarElevation$1(MainContainerViewModel mainContainerViewModel, int i11, zz.a<? super MainContainerViewModel$decideSearchBarElevation$1> aVar) {
        super(2, aVar);
        this.f31504b = mainContainerViewModel;
        this.f31505c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$decideSearchBarElevation$1(this.f31504b, this.f31505c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31503a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f31504b.f31456g1;
            if (this.f31505c == r0.P5) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(z11);
            this.f31503a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$decideSearchBarElevation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

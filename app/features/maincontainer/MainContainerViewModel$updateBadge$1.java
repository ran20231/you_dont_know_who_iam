package com.forsale.app.features.maincontainer;

import com.forsale.app.features.auth.UserStatus;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$updateBadge$1", f = "MainContainerViewModel.kt", l = {214}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$updateBadge$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31531a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31532b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$updateBadge$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$updateBadge$1> aVar) {
        super(2, aVar);
        this.f31532b = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$updateBadge$1(this.f31532b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        StateFlow stateFlow;
        boolean z11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31531a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f31532b.G0;
            stateFlow = this.f31532b.F0;
            if (!((Boolean) stateFlow.getValue()).booleanValue() && this.f31532b.r1().getValue() == UserStatus.LoggedIn && this.f31532b.o1().getValue().intValue() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(z11);
            this.f31531a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$updateBadge$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
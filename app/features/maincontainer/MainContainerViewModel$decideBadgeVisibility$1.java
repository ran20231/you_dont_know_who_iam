package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$decideBadgeVisibility$1", f = "MainContainerViewModel.kt", l = {373}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$decideBadgeVisibility$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31495a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f31496b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31497c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$decideBadgeVisibility$1(int i11, MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$decideBadgeVisibility$1> aVar) {
        super(2, aVar);
        this.f31496b = i11;
        this.f31497c = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$decideBadgeVisibility$1(this.f31496b, this.f31497c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean z11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31495a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            if (this.f31496b == r0.W5) {
                z11 = true;
            } else {
                z11 = false;
            }
            x10.a.b("isBadgeVisible:: in More:: " + z11, new Object[0]);
            mutableStateFlow = this.f31497c.E0;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(z11);
            this.f31495a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        this.f31497c.Q1();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$decideBadgeVisibility$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

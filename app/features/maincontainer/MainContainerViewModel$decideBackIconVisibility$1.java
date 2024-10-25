package com.forsale.app.features.maincontainer;

import g00.p;
import java.util.List;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import t9.r0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$decideBackIconVisibility$1", f = "MainContainerViewModel.kt", l = {486}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$decideBackIconVisibility$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31492a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31493b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31494c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$decideBackIconVisibility$1(MainContainerViewModel mainContainerViewModel, int i11, zz.a<? super MainContainerViewModel$decideBackIconVisibility$1> aVar) {
        super(2, aVar);
        this.f31493b = mainContainerViewModel;
        this.f31494c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$decideBackIconVisibility$1(this.f31493b, this.f31494c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        List q11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31492a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f31493b.f31454e1;
            q11 = r.q(kotlin.coroutines.jvm.internal.a.d(r0.P5), kotlin.coroutines.jvm.internal.a.d(r0.G8), kotlin.coroutines.jvm.internal.a.d(r0.f70057r6));
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(!q11.contains(kotlin.coroutines.jvm.internal.a.d(this.f31494c)));
            this.f31492a = 1;
            if (mutableStateFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$decideBackIconVisibility$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

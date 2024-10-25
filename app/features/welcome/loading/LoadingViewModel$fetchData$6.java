package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$6", f = "LoadingViewModel.kt", l = {249}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$fetchData$6 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37251a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37252b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$fetchData$6(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$fetchData$6> aVar) {
        super(2, aVar);
        this.f37252b = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$fetchData$6(this.f37252b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object value;
        jf.c cVar;
        Object value2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37251a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableStateFlow mutableStateFlow = this.f37252b.N;
            do {
                value = mutableStateFlow.getValue();
                LoadingViewModel.b bVar = (LoadingViewModel.b) value;
            } while (!mutableStateFlow.compareAndSet(value, LoadingViewModel.b.d.f37235b));
            cVar = this.f37252b.f37214j;
            this.f37251a = 1;
            if (cVar.a(this) == f11) {
                return f11;
            }
        }
        MutableStateFlow mutableStateFlow2 = this.f37252b.N;
        do {
            value2 = mutableStateFlow2.getValue();
            LoadingViewModel.b bVar2 = (LoadingViewModel.b) value2;
        } while (!mutableStateFlow2.compareAndSet(value2, LoadingViewModel.b.e.f37236b));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$fetchData$6) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

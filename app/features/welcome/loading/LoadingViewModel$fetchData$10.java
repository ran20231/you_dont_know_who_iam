package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$fetchData$10", f = "LoadingViewModel.kt", l = {271}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$fetchData$10 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37249a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37250b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$fetchData$10(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$fetchData$10> aVar) {
        super(2, aVar);
        this.f37250b = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$fetchData$10(this.f37250b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object value;
        Object N;
        Object value2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37249a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableStateFlow mutableStateFlow = this.f37250b.M;
            do {
                value = mutableStateFlow.getValue();
                LoadingViewModel.b bVar = (LoadingViewModel.b) value;
            } while (!mutableStateFlow.compareAndSet(value, LoadingViewModel.b.d.f37235b));
            LoadingViewModel loadingViewModel = this.f37250b;
            this.f37249a = 1;
            N = loadingViewModel.N(this);
            if (N == f11) {
                return f11;
            }
        }
        MutableStateFlow mutableStateFlow2 = this.f37250b.M;
        do {
            value2 = mutableStateFlow2.getValue();
            LoadingViewModel.b bVar2 = (LoadingViewModel.b) value2;
        } while (!mutableStateFlow2.compareAndSet(value2, LoadingViewModel.b.e.f37236b));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$fetchData$10) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

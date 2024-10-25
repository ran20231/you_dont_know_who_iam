package com.forsale.app.features.welcome.loading;

import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$saveDeviceId$1", f = "LoadingViewModel.kt", l = {318}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$saveDeviceId$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37296a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37297b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f37298c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$saveDeviceId$1(LoadingViewModel loadingViewModel, String str, zz.a<? super LoadingViewModel$saveDeviceId$1> aVar) {
        super(2, aVar);
        this.f37297b = loadingViewModel;
        this.f37298c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$saveDeviceId$1(this.f37297b, this.f37298c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object value;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37296a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            jf.b bVar = this.f37297b.f37208d;
            String str = this.f37298c;
            this.f37296a = 1;
            if (bVar.b(str, this) == f11) {
                return f11;
            }
        }
        MutableStateFlow mutableStateFlow = this.f37297b.O;
        do {
            value = mutableStateFlow.getValue();
            LoadingViewModel.a aVar = (LoadingViewModel.a) value;
        } while (!mutableStateFlow.compareAndSet(value, LoadingViewModel.a.C0424a.f37223a));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$saveDeviceId$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$onAllDataFetched$2", f = "LoadingViewModel.kt", l = {209}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$onAllDataFetched$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f37266a;

    /* renamed from: b  reason: collision with root package name */
    Object f37267b;

    /* renamed from: c  reason: collision with root package name */
    int f37268c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37269d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$onAllDataFetched$2(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$onAllDataFetched$2> aVar) {
        super(2, aVar);
        this.f37269d = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$onAllDataFetched$2(this.f37269d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        LoadingViewModel loadingViewModel;
        Object Q;
        SessionEntity sessionEntity;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37268c;
        if (i11 != 0) {
            if (i11 == 1) {
                sessionEntity = (SessionEntity) this.f37267b;
                loadingViewModel = (LoadingViewModel) this.f37266a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f37269d.I;
            SessionEntity sessionEntity2 = (SessionEntity) mutableStateFlow.getValue();
            if (sessionEntity2 != null) {
                loadingViewModel = this.f37269d;
                this.f37266a = loadingViewModel;
                this.f37267b = sessionEntity2;
                this.f37268c = 1;
                Q = loadingViewModel.Q(this);
                if (Q == f11) {
                    return f11;
                }
                sessionEntity = sessionEntity2;
            }
            return wz.p.f75480a;
        }
        loadingViewModel.T(new LoadingViewModel$onAllDataFetched$2$1$1(loadingViewModel, sessionEntity, null), new LoadingViewModel$onAllDataFetched$2$1$2(loadingViewModel, null));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$onAllDataFetched$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

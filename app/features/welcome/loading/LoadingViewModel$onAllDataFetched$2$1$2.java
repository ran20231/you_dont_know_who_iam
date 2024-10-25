package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import com.forsale.app.features.welcome.loading.LoadingViewModel;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$onAllDataFetched$2$1$2", f = "LoadingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoadingViewModel$onAllDataFetched$2$1$2 extends SuspendLambda implements p<SessionEntity.AppStatus, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37273a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37274b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$onAllDataFetched$2$1$2(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$onAllDataFetched$2$1$2> aVar) {
        super(2, aVar);
        this.f37275c = loadingViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(SessionEntity.AppStatus appStatus, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$onAllDataFetched$2$1$2) create(appStatus, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        LoadingViewModel$onAllDataFetched$2$1$2 loadingViewModel$onAllDataFetched$2$1$2 = new LoadingViewModel$onAllDataFetched$2$1$2(this.f37275c, aVar);
        loadingViewModel$onAllDataFetched$2$1$2.f37274b = obj;
        return loadingViewModel$onAllDataFetched$2$1$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        Object value;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f37273a == 0) {
            kotlin.f.b(obj);
            SessionEntity.AppStatus appStatus = (SessionEntity.AppStatus) this.f37274b;
            if (appStatus != null) {
                LoadingViewModel loadingViewModel = this.f37275c;
                mutableStateFlow = loadingViewModel.J;
                do {
                    value = mutableStateFlow.getValue();
                    LoadingViewModel.c cVar = (LoadingViewModel.c) value;
                } while (!mutableStateFlow.compareAndSet(value, new h(appStatus)));
                loadingViewModel.c0(appStatus);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

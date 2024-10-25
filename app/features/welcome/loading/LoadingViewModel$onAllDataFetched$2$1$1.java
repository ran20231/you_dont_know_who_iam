package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import wz.p;
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$onAllDataFetched$2$1$1", f = "LoadingViewModel.kt", l = {211}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LoadingViewModel$onAllDataFetched$2$1$1 extends SuspendLambda implements g00.l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37270a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37271b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SessionEntity f37272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$onAllDataFetched$2$1$1(LoadingViewModel loadingViewModel, SessionEntity sessionEntity, zz.a<? super LoadingViewModel$onAllDataFetched$2$1$1> aVar) {
        super(1, aVar);
        this.f37271b = loadingViewModel;
        this.f37272c = sessionEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new LoadingViewModel$onAllDataFetched$2$1$1(this.f37271b, this.f37272c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37270a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f37271b.J;
            g gVar = new g(this.f37272c);
            this.f37270a = 1;
            if (mutableStateFlow.emit(gVar, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((LoadingViewModel$onAllDataFetched$2$1$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}

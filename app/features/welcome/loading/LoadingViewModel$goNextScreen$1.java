package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.network.entities.SessionEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$goNextScreen$1", f = "LoadingViewModel.kt", l = {381, 382}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$goNextScreen$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37262a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37263b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.l<zz.a<? super wz.p>, Object> f37264c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p<SessionEntity.AppStatus, zz.a<? super wz.p>, Object> f37265d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LoadingViewModel$goNextScreen$1(LoadingViewModel loadingViewModel, g00.l<? super zz.a<? super wz.p>, ? extends Object> lVar, p<? super SessionEntity.AppStatus, ? super zz.a<? super wz.p>, ? extends Object> pVar, zz.a<? super LoadingViewModel$goNextScreen$1> aVar) {
        super(2, aVar);
        this.f37263b = loadingViewModel;
        this.f37264c = lVar;
        this.f37265d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$goNextScreen$1(this.f37263b, this.f37264c, this.f37265d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37262a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            SessionEntity.AppStatus value = this.f37263b.J().getValue();
            LoadingViewModel loadingViewModel = this.f37263b;
            g00.l<zz.a<? super wz.p>, Object> lVar = this.f37264c;
            p<SessionEntity.AppStatus, zz.a<? super wz.p>, Object> pVar = this.f37265d;
            SessionEntity.AppStatus appStatus = value;
            x10.a.b("loading:: checkAppStatus " + appStatus, new Object[0]);
            if (appStatus == null) {
                loadingViewModel.g0();
                this.f37262a = 1;
                if (lVar.invoke(this) == f11) {
                    return f11;
                }
            } else {
                this.f37262a = 2;
                if (pVar.invoke(appStatus, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$goNextScreen$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

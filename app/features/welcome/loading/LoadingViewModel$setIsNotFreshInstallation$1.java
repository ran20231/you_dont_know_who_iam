package com.forsale.app.features.welcome.loading;

import com.forsale.app.datalayer.repositories.InAppRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel$setIsNotFreshInstallation$1", f = "LoadingViewModel.kt", l = {396}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LoadingViewModel$setIsNotFreshInstallation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37299a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37300b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$setIsNotFreshInstallation$1(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$setIsNotFreshInstallation$1> aVar) {
        super(2, aVar);
        this.f37300b = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LoadingViewModel$setIsNotFreshInstallation$1(this.f37300b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        InAppRepository inAppRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f37299a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            inAppRepository = this.f37300b.f37211g;
            this.f37299a = 1;
            if (inAppRepository.setIsNotFreshInstallation(this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LoadingViewModel$setIsNotFreshInstallation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

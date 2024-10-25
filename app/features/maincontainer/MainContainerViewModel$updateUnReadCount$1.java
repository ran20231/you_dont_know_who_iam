package com.forsale.app.features.maincontainer;

import com.forsale.app.utils.facades.user.UserProfileInteractor;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$updateUnReadCount$1", f = "MainContainerViewModel.kt", l = {205, 206}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$updateUnReadCount$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f31537a;

    /* renamed from: b  reason: collision with root package name */
    int f31538b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31539c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$updateUnReadCount$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$updateUnReadCount$1> aVar) {
        super(2, aVar);
        this.f31539c = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$updateUnReadCount$1(this.f31539c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserProfileInteractor userProfileInteractor;
        MutableStateFlow mutableStateFlow;
        MainContainerViewModel mainContainerViewModel;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31538b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    mainContainerViewModel = (MainContainerViewModel) this.f31537a;
                    kotlin.f.b(obj);
                    mainContainerViewModel.Q1();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            userProfileInteractor = this.f31539c.f31464o0;
            this.f31538b = 1;
            obj = userProfileInteractor.m(this);
            if (obj == f11) {
                return f11;
            }
        }
        int intValue = ((Number) obj).intValue();
        MainContainerViewModel mainContainerViewModel2 = this.f31539c;
        mutableStateFlow = mainContainerViewModel2.C0;
        Integer d11 = kotlin.coroutines.jvm.internal.a.d(intValue);
        this.f31537a = mainContainerViewModel2;
        this.f31538b = 2;
        if (mutableStateFlow.emit(d11, this) == f11) {
            return f11;
        }
        mainContainerViewModel = mainContainerViewModel2;
        mainContainerViewModel.Q1();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$updateUnReadCount$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.maincontainer;

import com.forsale.app.datalayer.database.UserEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$updateUser$2", f = "MainContainerViewModel.kt", l = {169, 170}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$updateUser$2 extends SuspendLambda implements p<UserEntity, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31540a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f31541b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31542c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$updateUser$2(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$updateUser$2> aVar) {
        super(2, aVar);
        this.f31542c = mainContainerViewModel;
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(UserEntity userEntity, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$updateUser$2) create(userEntity, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        MainContainerViewModel$updateUser$2 mainContainerViewModel$updateUser$2 = new MainContainerViewModel$updateUser$2(this.f31542c, aVar);
        mainContainerViewModel$updateUser$2.f31541b = obj;
        return mainContainerViewModel$updateUser$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        UserEntity userEntity;
        MutableStateFlow mutableStateFlow;
        Object U1;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31540a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    this.f31542c.S1();
                    this.f31542c.Q1();
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userEntity = (UserEntity) this.f31541b;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            userEntity = (UserEntity) this.f31541b;
            mutableStateFlow = this.f31542c.A0;
            this.f31541b = userEntity;
            this.f31540a = 1;
            if (mutableStateFlow.emit(userEntity, this) == f11) {
                return f11;
            }
        }
        MainContainerViewModel mainContainerViewModel = this.f31542c;
        this.f31541b = null;
        this.f31540a = 2;
        U1 = mainContainerViewModel.U1(userEntity, this);
        if (U1 == f11) {
            return f11;
        }
        this.f31542c.S1();
        this.f31542c.Q1();
        return wz.p.f75480a;
    }
}

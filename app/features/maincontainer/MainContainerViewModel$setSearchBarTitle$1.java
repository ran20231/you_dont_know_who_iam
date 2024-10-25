package com.forsale.app.features.maincontainer;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$setSearchBarTitle$1", f = "MainContainerViewModel.kt", l = {468}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$setSearchBarTitle$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31525a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31526b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f31527c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$setSearchBarTitle$1(MainContainerViewModel mainContainerViewModel, String str, zz.a<? super MainContainerViewModel$setSearchBarTitle$1> aVar) {
        super(2, aVar);
        this.f31526b = mainContainerViewModel;
        this.f31527c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$setSearchBarTitle$1(this.f31526b, this.f31527c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31525a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f31526b.Y0;
            String str = this.f31527c;
            this.f31525a = 1;
            if (mutableSharedFlow.emit(str, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$setSearchBarTitle$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

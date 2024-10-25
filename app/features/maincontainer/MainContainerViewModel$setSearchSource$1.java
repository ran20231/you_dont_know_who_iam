package com.forsale.app.features.maincontainer;

import com.forsale.app.utils.analytics.SearchSource;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel$setSearchSource$1", f = "MainContainerViewModel.kt", l = {474}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$setSearchSource$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31528a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31529b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SearchSource f31530c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$setSearchSource$1(MainContainerViewModel mainContainerViewModel, SearchSource searchSource, zz.a<? super MainContainerViewModel$setSearchSource$1> aVar) {
        super(2, aVar);
        this.f31529b = mainContainerViewModel;
        this.f31530c = searchSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MainContainerViewModel$setSearchSource$1(this.f31529b, this.f31530c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31528a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableStateFlow = this.f31529b.f31452c1;
            SearchSource searchSource = this.f31530c;
            this.f31528a = 1;
            if (mutableStateFlow.emit(searchSource, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MainContainerViewModel$setSearchSource$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

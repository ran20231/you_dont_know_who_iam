package com.forsale.app.features.welcome.loading;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel", f = "LoadingViewModel.kt", l = {297}, m = "requireAppRestart")
/* loaded from: classes2.dex */
public final class LoadingViewModel$requireAppRestart$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37292a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f37293b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37294c;

    /* renamed from: d  reason: collision with root package name */
    int f37295d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$requireAppRestart$1(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$requireAppRestart$1> aVar) {
        super(aVar);
        this.f37294c = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e02;
        this.f37293b = obj;
        this.f37295d |= Integer.MIN_VALUE;
        e02 = this.f37294c.e0(null, this);
        return e02;
    }
}

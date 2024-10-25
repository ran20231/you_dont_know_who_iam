package com.forsale.app.features.maincontainer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel", f = "MainContainerViewModel.kt", l = {104}, m = "isUserLogin")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$isUserLogin$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f31511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31512b;

    /* renamed from: c  reason: collision with root package name */
    int f31513c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$isUserLogin$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$isUserLogin$1> aVar) {
        super(aVar);
        this.f31512b = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31511a = obj;
        this.f31513c |= Integer.MIN_VALUE;
        return this.f31512b.z1(this);
    }
}

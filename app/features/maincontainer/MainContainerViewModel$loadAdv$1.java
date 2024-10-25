package com.forsale.app.features.maincontainer;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MainContainerViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.maincontainer.MainContainerViewModel", f = "MainContainerViewModel.kt", l = {433, 441, 445}, m = "loadAdv")
/* loaded from: classes2.dex */
public final class MainContainerViewModel$loadAdv$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f31514a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f31515b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MainContainerViewModel f31516c;

    /* renamed from: d  reason: collision with root package name */
    int f31517d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainContainerViewModel$loadAdv$1(MainContainerViewModel mainContainerViewModel, zz.a<? super MainContainerViewModel$loadAdv$1> aVar) {
        super(aVar);
        this.f31516c = mainContainerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f31515b = obj;
        this.f31517d |= Integer.MIN_VALUE;
        return this.f31516c.A1(0, this);
    }
}

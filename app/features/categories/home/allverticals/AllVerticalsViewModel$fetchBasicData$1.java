package com.forsale.app.features.categories.home.allverticals;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AllVerticalsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.allverticals.AllVerticalsViewModel", f = "AllVerticalsViewModel.kt", l = {187}, m = "fetchBasicData")
/* loaded from: classes2.dex */
public final class AllVerticalsViewModel$fetchBasicData$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23431a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f23432b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AllVerticalsViewModel f23433c;

    /* renamed from: d  reason: collision with root package name */
    int f23434d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllVerticalsViewModel$fetchBasicData$1(AllVerticalsViewModel allVerticalsViewModel, zz.a<? super AllVerticalsViewModel$fetchBasicData$1> aVar) {
        super(aVar);
        this.f23433c = allVerticalsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f23432b = obj;
        this.f23434d |= Integer.MIN_VALUE;
        return this.f23433c.A(this);
    }
}

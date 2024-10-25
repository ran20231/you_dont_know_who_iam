package com.forsale.app.features.welcome.loading;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoadingViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.welcome.loading.LoadingViewModel", f = "LoadingViewModel.kt", l = {280, 281, 286, 286}, m = "getSession")
/* loaded from: classes2.dex */
public final class LoadingViewModel$getSession$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f37256a;

    /* renamed from: b  reason: collision with root package name */
    Object f37257b;

    /* renamed from: c  reason: collision with root package name */
    Object f37258c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f37259d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LoadingViewModel f37260e;

    /* renamed from: f  reason: collision with root package name */
    int f37261f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingViewModel$getSession$1(LoadingViewModel loadingViewModel, zz.a<? super LoadingViewModel$getSession$1> aVar) {
        super(aVar);
        this.f37260e = loadingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object N;
        this.f37259d = obj;
        this.f37261f |= Integer.MIN_VALUE;
        N = this.f37260e.N(this);
        return N;
    }
}

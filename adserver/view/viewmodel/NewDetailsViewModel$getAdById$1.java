package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel", f = "NewDetailsViewModel.kt", l = {127, 129}, m = "getAdById")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$getAdById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f21759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21760b;

    /* renamed from: c  reason: collision with root package name */
    int f21761c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$getAdById$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$getAdById$1> aVar) {
        super(aVar);
        this.f21760b = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object K;
        this.f21759a = obj;
        this.f21761c |= Integer.MIN_VALUE;
        K = this.f21760b.K(0, false, this);
        return K;
    }
}

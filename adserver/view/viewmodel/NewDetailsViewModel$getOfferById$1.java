package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel", f = "NewDetailsViewModel.kt", l = {137}, m = "getOfferById")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$getOfferById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f21765a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21766b;

    /* renamed from: c  reason: collision with root package name */
    int f21767c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$getOfferById$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$getOfferById$1> aVar) {
        super(aVar);
        this.f21766b = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object Z;
        this.f21765a = obj;
        this.f21767c |= Integer.MIN_VALUE;
        Z = this.f21766b.Z(0, this);
        return Z;
    }
}

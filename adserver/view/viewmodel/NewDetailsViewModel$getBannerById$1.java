package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel", f = "NewDetailsViewModel.kt", l = {145}, m = "getBannerById")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$getBannerById$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f21762a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21763b;

    /* renamed from: c  reason: collision with root package name */
    int f21764c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$getBannerById$1(NewDetailsViewModel newDetailsViewModel, a<? super NewDetailsViewModel$getBannerById$1> aVar) {
        super(aVar);
        this.f21763b = newDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object O;
        this.f21762a = obj;
        this.f21764c |= Integer.MIN_VALUE;
        O = this.f21763b.O(0, this);
        return O;
    }
}

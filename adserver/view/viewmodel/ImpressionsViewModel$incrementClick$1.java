package com.forsale.adserver.view.viewmodel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ImpressionsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.ImpressionsViewModel", f = "ImpressionsViewModel.kt", l = {36, 38}, m = "incrementClick")
/* loaded from: classes2.dex */
public final class ImpressionsViewModel$incrementClick$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Object f21719a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ImpressionsViewModel f21720b;

    /* renamed from: c  reason: collision with root package name */
    int f21721c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImpressionsViewModel$incrementClick$1(ImpressionsViewModel impressionsViewModel, a<? super ImpressionsViewModel$incrementClick$1> aVar) {
        super(aVar);
        this.f21720b = impressionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f21719a = obj;
        this.f21721c |= Integer.MIN_VALUE;
        return this.f21720b.q(false, 0, null, this);
    }
}

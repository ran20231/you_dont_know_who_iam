package com.forsale.app.features.more.mytransactions;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyTransactionsViewModel.kt */
@d(c = "com.forsale.app.features.more.mytransactions.MyTransactionsViewModel", f = "MyTransactionsViewModel.kt", l = {72}, m = "getTransactions")
/* loaded from: classes2.dex */
public final class MyTransactionsViewModel$getTransactions$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f32051a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32052b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MyTransactionsViewModel f32053c;

    /* renamed from: d  reason: collision with root package name */
    int f32054d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyTransactionsViewModel$getTransactions$1(MyTransactionsViewModel myTransactionsViewModel, zz.a<? super MyTransactionsViewModel$getTransactions$1> aVar) {
        super(aVar);
        this.f32053c = myTransactionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32052b = obj;
        this.f32054d |= Integer.MIN_VALUE;
        return this.f32053c.H0(this);
    }
}

package com.forsale.app.base.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel", f = "BaseViewModel.kt", l = {191, 193}, m = "consumePromotedPost")
/* loaded from: classes2.dex */
public final class BaseViewModel$consumePromotedPost$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22261a;

    /* renamed from: b  reason: collision with root package name */
    Object f22262b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f22263c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22264d;

    /* renamed from: e  reason: collision with root package name */
    int f22265e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$consumePromotedPost$1(BaseViewModel baseViewModel, a<? super BaseViewModel$consumePromotedPost$1> aVar) {
        super(aVar);
        this.f22264d = baseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22263c = obj;
        this.f22265e |= Integer.MIN_VALUE;
        return this.f22264d.m(null, null, this);
    }
}

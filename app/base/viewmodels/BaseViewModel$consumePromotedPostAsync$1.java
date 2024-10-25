package com.forsale.app.base.viewmodels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BaseViewModel.kt */
@d(c = "com.forsale.app.base.viewmodels.BaseViewModel", f = "BaseViewModel.kt", l = {179}, m = "consumePromotedPostAsync")
/* loaded from: classes2.dex */
public final class BaseViewModel$consumePromotedPostAsync$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22269a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f22270b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ BaseViewModel f22271c;

    /* renamed from: d  reason: collision with root package name */
    int f22272d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$consumePromotedPostAsync$1(BaseViewModel baseViewModel, a<? super BaseViewModel$consumePromotedPostAsync$1> aVar) {
        super(aVar);
        this.f22271c = baseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22270b = obj;
        this.f22272d |= Integer.MIN_VALUE;
        return this.f22271c.o(null, this);
    }
}

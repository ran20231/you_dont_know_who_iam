package com.forsale.app.features.auth.forgotpassword;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResetPasswordViewModel.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ResetPasswordViewModel", f = "ResetPasswordViewModel.kt", l = {98}, m = "onResetPasswordSuccess")
/* loaded from: classes2.dex */
public final class ResetPasswordViewModel$onResetPasswordSuccess$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22715a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f22716b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ResetPasswordViewModel f22717c;

    /* renamed from: d  reason: collision with root package name */
    int f22718d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordViewModel$onResetPasswordSuccess$1(ResetPasswordViewModel resetPasswordViewModel, a<? super ResetPasswordViewModel$onResetPasswordSuccess$1> aVar) {
        super(aVar);
        this.f22717c = resetPasswordViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object w11;
        this.f22716b = obj;
        this.f22718d |= Integer.MIN_VALUE;
        w11 = this.f22717c.w(null, this);
        return w11;
    }
}

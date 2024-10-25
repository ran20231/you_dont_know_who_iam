package com.forsale.app.features.auth.verification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel", f = "VerificationScreenViewModel.kt", l = {210, 211, 216, 218}, m = "resentOTPVerifyRegister")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$resentOTPVerifyRegister$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23089a;

    /* renamed from: b  reason: collision with root package name */
    Object f23090b;

    /* renamed from: c  reason: collision with root package name */
    Object f23091c;

    /* renamed from: d  reason: collision with root package name */
    Object f23092d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f23093e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23094f;

    /* renamed from: g  reason: collision with root package name */
    int f23095g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$resentOTPVerifyRegister$1(VerificationScreenViewModel verificationScreenViewModel, a<? super VerificationScreenViewModel$resentOTPVerifyRegister$1> aVar) {
        super(aVar);
        this.f23094f = verificationScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object V;
        this.f23093e = obj;
        this.f23095g |= Integer.MIN_VALUE;
        V = this.f23094f.V(null, null, null, this);
        return V;
    }
}

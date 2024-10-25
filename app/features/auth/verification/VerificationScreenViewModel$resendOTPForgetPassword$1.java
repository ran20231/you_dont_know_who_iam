package com.forsale.app.features.auth.verification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel", f = "VerificationScreenViewModel.kt", l = {188, 189, 195, 197}, m = "resendOTPForgetPassword")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$resendOTPForgetPassword$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23081a;

    /* renamed from: b  reason: collision with root package name */
    Object f23082b;

    /* renamed from: c  reason: collision with root package name */
    Object f23083c;

    /* renamed from: d  reason: collision with root package name */
    Object f23084d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f23085e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23086f;

    /* renamed from: g  reason: collision with root package name */
    int f23087g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$resendOTPForgetPassword$1(VerificationScreenViewModel verificationScreenViewModel, a<? super VerificationScreenViewModel$resendOTPForgetPassword$1> aVar) {
        super(aVar);
        this.f23086f = verificationScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object T;
        this.f23085e = obj;
        this.f23087g |= Integer.MIN_VALUE;
        T = this.f23086f.T(null, null, null, this);
        return T;
    }
}

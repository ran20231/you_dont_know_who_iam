package com.forsale.app.features.auth.verification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel", f = "VerificationScreenViewModel.kt", l = {142, 143, 144, 145, 146, 153}, m = "callForgetPasswordApi")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$callForgetPasswordApi$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23050a;

    /* renamed from: b  reason: collision with root package name */
    Object f23051b;

    /* renamed from: c  reason: collision with root package name */
    Object f23052c;

    /* renamed from: d  reason: collision with root package name */
    Object f23053d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f23054e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23055f;

    /* renamed from: g  reason: collision with root package name */
    int f23056g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$callForgetPasswordApi$1(VerificationScreenViewModel verificationScreenViewModel, a<? super VerificationScreenViewModel$callForgetPasswordApi$1> aVar) {
        super(aVar);
        this.f23055f = verificationScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object q11;
        this.f23054e = obj;
        this.f23056g |= Integer.MIN_VALUE;
        q11 = this.f23055f.q(null, null, null, this);
        return q11;
    }
}

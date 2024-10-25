package com.forsale.app.features.auth.verification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel", f = "VerificationScreenViewModel.kt", l = {121, 122, 123, 124, 125, 133}, m = "callSignUpApi")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$callSignUpApi$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f23058a;

    /* renamed from: b  reason: collision with root package name */
    Object f23059b;

    /* renamed from: c  reason: collision with root package name */
    Object f23060c;

    /* renamed from: d  reason: collision with root package name */
    Object f23061d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Object f23062e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23063f;

    /* renamed from: g  reason: collision with root package name */
    int f23064g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$callSignUpApi$1(VerificationScreenViewModel verificationScreenViewModel, a<? super VerificationScreenViewModel$callSignUpApi$1> aVar) {
        super(aVar);
        this.f23063f = verificationScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object r11;
        this.f23062e = obj;
        this.f23064g |= Integer.MIN_VALUE;
        r11 = this.f23063f.r(null, null, null, this);
        return r11;
    }
}

package com.forsale.app.features.auth.verification;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationInteractor.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationInteractor", f = "VerificationInteractor.kt", l = {35, 43, 45}, m = "register")
/* loaded from: classes2.dex */
public final class VerificationInteractor$register$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f22935a;

    /* renamed from: b  reason: collision with root package name */
    Object f22936b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f22937c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ VerificationInteractor f22938d;

    /* renamed from: e  reason: collision with root package name */
    int f22939e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationInteractor$register$1(VerificationInteractor verificationInteractor, a<? super VerificationInteractor$register$1> aVar) {
        super(aVar);
        this.f22938d = verificationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22937c = obj;
        this.f22939e |= Integer.MIN_VALUE;
        return this.f22938d.a(null, null, 0, this);
    }
}

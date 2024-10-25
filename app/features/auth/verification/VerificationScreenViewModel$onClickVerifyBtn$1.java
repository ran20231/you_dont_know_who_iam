package com.forsale.app.features.auth.verification;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$onClickVerifyBtn$1", f = "VerificationScreenViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$onClickVerifyBtn$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23066a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f23067b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23068c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f23069d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ja.a f23070e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$onClickVerifyBtn$1(String str, VerificationScreenViewModel verificationScreenViewModel, String str2, ja.a aVar, a<? super VerificationScreenViewModel$onClickVerifyBtn$1> aVar2) {
        super(2, aVar2);
        this.f23067b = str;
        this.f23068c = verificationScreenViewModel;
        this.f23069d = str2;
        this.f23070e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenViewModel$onClickVerifyBtn$1(this.f23067b, this.f23068c, this.f23069d, this.f23070e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object r11;
        f11 = b.f();
        int i11 = this.f23066a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            String str = this.f23067b;
            if (str != null) {
                VerificationScreenViewModel verificationScreenViewModel = this.f23068c;
                String str2 = this.f23069d;
                ja.a aVar = this.f23070e;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(Integer.parseInt(str));
                this.f23066a = 1;
                r11 = verificationScreenViewModel.r(str2, aVar, d11, this);
                if (r11 == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenViewModel$onClickVerifyBtn$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

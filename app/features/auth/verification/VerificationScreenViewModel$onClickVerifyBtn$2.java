package com.forsale.app.features.auth.verification;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$onClickVerifyBtn$2", f = "VerificationScreenViewModel.kt", l = {FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$onClickVerifyBtn$2 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23071a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f23072b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23073c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f23074d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ja.a f23075e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$onClickVerifyBtn$2(String str, VerificationScreenViewModel verificationScreenViewModel, String str2, ja.a aVar, a<? super VerificationScreenViewModel$onClickVerifyBtn$2> aVar2) {
        super(2, aVar2);
        this.f23072b = str;
        this.f23073c = verificationScreenViewModel;
        this.f23074d = str2;
        this.f23075e = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenViewModel$onClickVerifyBtn$2(this.f23072b, this.f23073c, this.f23074d, this.f23075e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object q11;
        f11 = b.f();
        int i11 = this.f23071a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            String str = this.f23072b;
            if (str != null) {
                VerificationScreenViewModel verificationScreenViewModel = this.f23073c;
                String str2 = this.f23074d;
                String f12 = this.f23075e.f();
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(Integer.parseInt(str));
                this.f23071a = 1;
                q11 = verificationScreenViewModel.q(str2, f12, d11, this);
                if (q11 == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenViewModel$onClickVerifyBtn$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

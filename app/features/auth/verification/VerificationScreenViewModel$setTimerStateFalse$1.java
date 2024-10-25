package com.forsale.app.features.auth.verification;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerificationScreenViewModel.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenViewModel$setTimerStateFalse$1", f = "VerificationScreenViewModel.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class VerificationScreenViewModel$setTimerStateFalse$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f23100a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f23101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenViewModel$setTimerStateFalse$1(VerificationScreenViewModel verificationScreenViewModel, a<? super VerificationScreenViewModel$setTimerStateFalse$1> aVar) {
        super(2, aVar);
        this.f23101b = verificationScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new VerificationScreenViewModel$setTimerStateFalse$1(this.f23101b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f23100a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f23101b.f23045x;
            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
            this.f23100a = 1;
            if (mutableSharedFlow.emit(a11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((VerificationScreenViewModel$setTimerStateFalse$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

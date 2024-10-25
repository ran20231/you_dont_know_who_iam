package com.forsale.app.features.auth.verification;

import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rj.a;
/* compiled from: VerificationScreen.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenKt$RegisterObserver$1", f = "VerificationScreen.kt", l = {388}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerificationScreenKt$RegisterObserver$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22949a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f22950b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f22951c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f22952a;

        a(TextFieldState textFieldState) {
            this.f22952a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f22952a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$RegisterObserver$1(VerificationScreenViewModel verificationScreenViewModel, TextFieldState textFieldState, zz.a<? super VerificationScreenKt$RegisterObserver$1> aVar) {
        super(2, aVar);
        this.f22950b = verificationScreenViewModel;
        this.f22951c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerificationScreenKt$RegisterObserver$1(this.f22950b, this.f22951c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22949a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> A = this.f22950b.A();
            a aVar = new a(this.f22951c);
            this.f22949a = 1;
            if (A.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerificationScreenKt$RegisterObserver$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

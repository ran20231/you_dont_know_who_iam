package com.forsale.app.features.auth.verification;

import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import g00.l;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: VerificationScreen.kt */
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenKt$RegisterObserver$2", f = "VerificationScreen.kt", l = {393}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerificationScreenKt$RegisterObserver$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22953a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f22954b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l<String, wz.p> f22955c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ TextFieldState f22956d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l<String, wz.p> f22957a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ TextFieldState f22958b;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super String, wz.p> lVar, TextFieldState textFieldState) {
            this.f22957a = lVar;
            this.f22958b = textFieldState;
        }

        public final Object a(boolean z11, zz.a<? super wz.p> aVar) {
            if (z11) {
                this.f22957a.invoke(this.f22958b.e().toString());
            }
            return wz.p.f75480a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, zz.a aVar) {
            return a(bool.booleanValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public VerificationScreenKt$RegisterObserver$2(VerificationScreenViewModel verificationScreenViewModel, l<? super String, wz.p> lVar, TextFieldState textFieldState, zz.a<? super VerificationScreenKt$RegisterObserver$2> aVar) {
        super(2, aVar);
        this.f22954b = verificationScreenViewModel;
        this.f22955c = lVar;
        this.f22956d = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerificationScreenKt$RegisterObserver$2(this.f22954b, this.f22955c, this.f22956d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22953a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<Boolean> x11 = this.f22954b.x();
            a aVar = new a(this.f22955c, this.f22956d);
            this.f22953a = 1;
            if (x11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerificationScreenKt$RegisterObserver$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

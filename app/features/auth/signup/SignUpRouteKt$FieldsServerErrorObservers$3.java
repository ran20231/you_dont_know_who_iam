package com.forsale.app.features.auth.signup;

import com.forsale.app.features.auth.views.textfieldstates.TextFieldState;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import rj.a;
/* compiled from: SignUpRoute.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpRouteKt$FieldsServerErrorObservers$3", f = "SignUpRoute.kt", l = {236}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignUpRouteKt$FieldsServerErrorObservers$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22826a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22827b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f22828c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignUpRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f22829a;

        a(TextFieldState textFieldState) {
            this.f22829a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f22829a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRouteKt$FieldsServerErrorObservers$3(SignUpViewModel signUpViewModel, TextFieldState textFieldState, zz.a<? super SignUpRouteKt$FieldsServerErrorObservers$3> aVar) {
        super(2, aVar);
        this.f22827b = signUpViewModel;
        this.f22828c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpRouteKt$FieldsServerErrorObservers$3(this.f22827b, this.f22828c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22826a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> A = this.f22827b.A();
            a aVar = new a(this.f22828c);
            this.f22826a = 1;
            if (A.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpRouteKt$FieldsServerErrorObservers$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

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
@d(c = "com.forsale.app.features.auth.signup.SignUpRouteKt$FieldsServerErrorObservers$2", f = "SignUpRoute.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignUpRouteKt$FieldsServerErrorObservers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22823b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f22824c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignUpRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f22825a;

        a(TextFieldState textFieldState) {
            this.f22825a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f22825a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRouteKt$FieldsServerErrorObservers$2(SignUpViewModel signUpViewModel, TextFieldState textFieldState, zz.a<? super SignUpRouteKt$FieldsServerErrorObservers$2> aVar) {
        super(2, aVar);
        this.f22823b = signUpViewModel;
        this.f22824c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpRouteKt$FieldsServerErrorObservers$2(this.f22823b, this.f22824c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22822a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> E = this.f22823b.E();
            a aVar = new a(this.f22824c);
            this.f22822a = 1;
            if (E.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpRouteKt$FieldsServerErrorObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

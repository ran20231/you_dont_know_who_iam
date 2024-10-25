package com.forsale.app.features.auth.signup;

import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: SignUpRoute.kt */
@d(c = "com.forsale.app.features.auth.signup.SignUpRouteKt$ViewStateObservers$1", f = "SignUpRoute.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignUpRouteKt$ViewStateObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22873a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignUpViewModel f22874b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f22875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignUpRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f22876a;

        a(g00.a<wz.p> aVar) {
            this.f22876a = aVar;
        }

        public final Object a(boolean z11, zz.a<? super wz.p> aVar) {
            this.f22876a.invoke();
            return wz.p.f75480a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, zz.a aVar) {
            return a(bool.booleanValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpRouteKt$ViewStateObservers$1(SignUpViewModel signUpViewModel, g00.a<wz.p> aVar, zz.a<? super SignUpRouteKt$ViewStateObservers$1> aVar2) {
        super(2, aVar2);
        this.f22874b = signUpViewModel;
        this.f22875c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignUpRouteKt$ViewStateObservers$1(this.f22874b, this.f22875c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22873a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<Boolean> G = this.f22874b.G();
            a aVar = new a(this.f22875c);
            this.f22873a = 1;
            if (G.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignUpRouteKt$ViewStateObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

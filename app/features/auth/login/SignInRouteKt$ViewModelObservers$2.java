package com.forsale.app.features.auth.login;

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
/* compiled from: SignInRoute.kt */
@d(c = "com.forsale.app.features.auth.login.SignInRouteKt$ViewModelObservers$2", f = "SignInRoute.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SignInRouteKt$ViewModelObservers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22765a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SignInViewModel f22766b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TextFieldState f22767c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SignInRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<rj.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TextFieldState f22768a;

        a(TextFieldState textFieldState) {
            this.f22768a = textFieldState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(rj.a aVar, zz.a<? super wz.p> aVar2) {
            this.f22768a.l(aVar instanceof a.C0804a);
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignInRouteKt$ViewModelObservers$2(SignInViewModel signInViewModel, TextFieldState textFieldState, zz.a<? super SignInRouteKt$ViewModelObservers$2> aVar) {
        super(2, aVar);
        this.f22766b = signInViewModel;
        this.f22767c = textFieldState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SignInRouteKt$ViewModelObservers$2(this.f22766b, this.f22767c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22765a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            StateFlow<rj.a> D = this.f22766b.D();
            a aVar = new a(this.f22767c);
            this.f22765a = 1;
            if (D.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SignInRouteKt$ViewModelObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.auth.forgotpassword;

import com.forsale.app.features.auth.AuthViewModel;
import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: ResetPasswordRoute.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ResetPasswordRouteKt$ViewModelObservers$1", f = "ResetPasswordRoute.kt", l = {140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ResetPasswordRouteKt$ViewModelObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ResetPasswordViewModel f22692b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthViewModel f22693c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f22694d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResetPasswordRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthViewModel f22695a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f22696b;

        a(AuthViewModel authViewModel, g00.a<wz.p> aVar) {
            this.f22695a = authViewModel;
            this.f22696b = aVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            this.f22695a.q(str);
            this.f22696b.invoke();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResetPasswordRouteKt$ViewModelObservers$1(ResetPasswordViewModel resetPasswordViewModel, AuthViewModel authViewModel, g00.a<wz.p> aVar, zz.a<? super ResetPasswordRouteKt$ViewModelObservers$1> aVar2) {
        super(2, aVar2);
        this.f22692b = resetPasswordViewModel;
        this.f22693c = authViewModel;
        this.f22694d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ResetPasswordRouteKt$ViewModelObservers$1(this.f22692b, this.f22693c, this.f22694d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22691a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<String> q11 = this.f22692b.q();
            a aVar = new a(this.f22693c, this.f22694d);
            this.f22691a = 1;
            if (q11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ResetPasswordRouteKt$ViewModelObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

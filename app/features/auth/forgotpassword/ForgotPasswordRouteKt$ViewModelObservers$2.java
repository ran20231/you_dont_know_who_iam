package com.forsale.app.features.auth.forgotpassword;

import g00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: ForgotPasswordRoute.kt */
@d(c = "com.forsale.app.features.auth.forgotpassword.ForgotPasswordRouteKt$ViewModelObservers$2", f = "ForgotPasswordRoute.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ForgotPasswordRouteKt$ViewModelObservers$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22648a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ForgotPasswordViewModel f22649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f22650c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForgotPasswordRoute.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g00.a<wz.p> f22651a;

        a(g00.a<wz.p> aVar) {
            this.f22651a = aVar;
        }

        public final Object a(boolean z11, zz.a<? super wz.p> aVar) {
            this.f22651a.invoke();
            return wz.p.f75480a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Boolean bool, zz.a aVar) {
            return a(bool.booleanValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgotPasswordRouteKt$ViewModelObservers$2(ForgotPasswordViewModel forgotPasswordViewModel, g00.a<wz.p> aVar, zz.a<? super ForgotPasswordRouteKt$ViewModelObservers$2> aVar2) {
        super(2, aVar2);
        this.f22649b = forgotPasswordViewModel;
        this.f22650c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ForgotPasswordRouteKt$ViewModelObservers$2(this.f22649b, this.f22650c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22648a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<Boolean> v11 = this.f22649b.v();
            a aVar = new a(this.f22650c);
            this.f22648a = 1;
            if (v11.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ForgotPasswordRouteKt$ViewModelObservers$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

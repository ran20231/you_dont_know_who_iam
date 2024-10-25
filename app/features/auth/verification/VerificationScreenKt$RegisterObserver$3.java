package com.forsale.app.features.auth.verification;

import android.content.Intent;
import com.forsale.app.features.auth.AuthActivity;
import com.leanplum.internal.Constants;
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
@d(c = "com.forsale.app.features.auth.verification.VerificationScreenKt$RegisterObserver$3", f = "VerificationScreen.kt", l = {399}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class VerificationScreenKt$RegisterObserver$3 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22959a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VerificationScreenViewModel f22960b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AuthActivity f22961c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VerificationScreen.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthActivity f22962a;

        a(AuthActivity authActivity) {
            this.f22962a = authActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super wz.p> aVar) {
            AuthActivity authActivity = this.f22962a;
            Intent intent = new Intent();
            intent.putExtra(Constants.Params.MESSAGE, str);
            wz.p pVar = wz.p.f75480a;
            authActivity.setResult(-1, intent);
            this.f22962a.finish();
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerificationScreenKt$RegisterObserver$3(VerificationScreenViewModel verificationScreenViewModel, AuthActivity authActivity, zz.a<? super VerificationScreenKt$RegisterObserver$3> aVar) {
        super(2, aVar);
        this.f22960b = verificationScreenViewModel;
        this.f22961c = authActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new VerificationScreenKt$RegisterObserver$3(this.f22960b, this.f22961c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f22959a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            SharedFlow<String> B = this.f22960b.B();
            a aVar = new a(this.f22961c);
            this.f22959a = 1;
            if (B.collect(aVar, this) == f11) {
                return f11;
            }
        }
        throw new KotlinNothingValueException();
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((VerificationScreenKt$RegisterObserver$3) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

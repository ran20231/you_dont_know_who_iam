package com.forsale.app.features.auth;

import com.forsale.app.feedback.a;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import rj.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.auth.AuthViewModel$onPasswordChangedSuccessfully$1", f = "AuthViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AuthViewModel$onPasswordChangedSuccessfully$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f22596a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthViewModel f22597b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f22598c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthViewModel$onPasswordChangedSuccessfully$1(AuthViewModel authViewModel, String str, zz.a<? super AuthViewModel$onPasswordChangedSuccessfully$1> aVar) {
        super(2, aVar);
        this.f22597b = authViewModel;
        this.f22598c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AuthViewModel$onPasswordChangedSuccessfully$1(this.f22597b, this.f22598c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f22596a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f22597b.f22588j;
            lf.a aVar = new lf.a(new a.C0430a(gk.b.f56934a), new a.C0804a(this.f22598c));
            this.f22596a = 1;
            if (mutableSharedFlow.emit(aVar, this) == f11) {
                return f11;
            }
        }
        this.f22597b.f();
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AuthViewModel$onPasswordChangedSuccessfully$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

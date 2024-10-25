package com.forsale.app.datalayer.network.interceptors;

import g00.p;
import jj.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: AuthorizationInterceptor.kt */
@d(c = "com.forsale.app.datalayer.network.interceptors.AuthorizationInterceptor$intercept$deviceId$1", f = "AuthorizationInterceptor.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizationInterceptor$intercept$deviceId$1 extends SuspendLambda implements p<CoroutineScope, a<? super String>, Object> {
    int label;
    final /* synthetic */ AuthorizationInterceptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationInterceptor$intercept$deviceId$1(AuthorizationInterceptor authorizationInterceptor, a<? super AuthorizationInterceptor$intercept$deviceId$1> aVar) {
        super(2, aVar);
        this.this$0 = authorizationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AuthorizationInterceptor$intercept$deviceId$1(this.this$0, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        b bVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            bVar = this.this$0.prefs;
            kj.b c11 = bVar.c();
            this.label = 1;
            obj = c11.a(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super String> aVar) {
        return ((AuthorizationInterceptor$intercept$deviceId$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

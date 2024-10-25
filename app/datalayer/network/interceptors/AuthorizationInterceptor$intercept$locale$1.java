package com.forsale.app.datalayer.network.interceptors;

import com.forsale.app.utils.prefUtils.preferences.LocalizationSharedPrefs;
import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import jj.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: AuthorizationInterceptor.kt */
@d(c = "com.forsale.app.datalayer.network.interceptors.AuthorizationInterceptor$intercept$locale$1", f = "AuthorizationInterceptor.kt", l = {PinConfig.BITMAP_WIDTH_DP}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizationInterceptor$intercept$locale$1 extends SuspendLambda implements p<CoroutineScope, a<? super String>, Object> {
    int label;
    final /* synthetic */ AuthorizationInterceptor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationInterceptor$intercept$locale$1(AuthorizationInterceptor authorizationInterceptor, a<? super AuthorizationInterceptor$intercept$locale$1> aVar) {
        super(2, aVar);
        this.this$0 = authorizationInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AuthorizationInterceptor$intercept$locale$1(this.this$0, aVar);
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
            LocalizationSharedPrefs g11 = bVar.g();
            this.label = 1;
            obj = g11.b(this);
            if (obj == f11) {
                return f11;
            }
        }
        return obj;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super String> aVar) {
        return ((AuthorizationInterceptor$intercept$locale$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

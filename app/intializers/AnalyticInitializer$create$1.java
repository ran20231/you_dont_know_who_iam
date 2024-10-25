package com.forsale.app.intializers;

import android.app.Application;
import android.content.Context;
import com.forsale.app.utils.analytics.FacebookEventsLogger;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnalyticInitializer.kt */
@d(c = "com.forsale.app.intializers.AnalyticInitializer$create$1", f = "AnalyticInitializer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AnalyticInitializer$create$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37516a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f37517b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticInitializer$create$1(Context context, zz.a<? super AnalyticInitializer$create$1> aVar) {
        super(2, aVar);
        this.f37517b = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AnalyticInitializer$create$1(this.f37517b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f37516a == 0) {
            f.b(obj);
            FacebookEventsLogger.a aVar = FacebookEventsLogger.f39974g;
            Context context = this.f37517b;
            o.g(context, "null cannot be cast to non-null type android.app.Application");
            aVar.b((Application) context);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AnalyticInitializer$create$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app;

import com.forsale.app.intializers.AnalyticInitializer;
import com.forsale.app.intializers.ProcessObserversInitializer;
import com.forsale.app.intializers.UtilsInitializer;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.text.s;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: App.kt */
@d(c = "com.forsale.app.App$onCreate$1", f = "App.kt", l = {72}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class App$onCreate$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ App f21946b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public App$onCreate$1(App app, a<? super App$onCreate$1> aVar) {
        super(2, aVar);
        this.f21946b = app;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new App$onCreate$1(this.f21946b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        boolean v11;
        f11 = b.f();
        int i11 = this.f21945a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            kj.b c11 = this.f21946b.f().c();
            this.f21945a = 1;
            obj = c11.a(this);
            if (obj == f11) {
                return f11;
            }
        }
        v11 = s.v((String) obj);
        if (v11) {
            obj = null;
        }
        if (((String) obj) == null) {
            return null;
        }
        androidx.startup.a e11 = androidx.startup.a.e(this.f21946b);
        e11.f(AnalyticInitializer.class);
        e11.f(ProcessObserversInitializer.class);
        e11.f(UtilsInitializer.class);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((App$onCreate$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

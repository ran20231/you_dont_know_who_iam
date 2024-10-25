package com.forsale.app;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: App.kt */
@d(c = "com.forsale.app.App$onCreate$4", f = "App.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class App$onCreate$4 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21947a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f21948b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ App f21949c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public App$onCreate$4(App app, a<? super App$onCreate$4> aVar) {
        super(2, aVar);
        this.f21949c = app;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        App$onCreate$4 app$onCreate$4 = new App$onCreate$4(this.f21949c, aVar);
        app$onCreate$4.f21948b = obj;
        return app$onCreate$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21947a == 0) {
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f21948b;
            androidx.startup.a e11 = androidx.startup.a.e(this.f21949c);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new App$onCreate$4$1$1(e11, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new App$onCreate$4$1$2(e11, null), 3, null);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((App$onCreate$4) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

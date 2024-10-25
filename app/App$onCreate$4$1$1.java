package com.forsale.app;

import com.forsale.app.intializers.ZendeskSupportInitializer;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: App.kt */
@d(c = "com.forsale.app.App$onCreate$4$1$1", f = "App.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class App$onCreate$4$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.startup.a f21951b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public App$onCreate$4$1$1(androidx.startup.a aVar, a<? super App$onCreate$4$1$1> aVar2) {
        super(2, aVar2);
        this.f21951b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new App$onCreate$4$1$1(this.f21951b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21950a == 0) {
            f.b(obj);
            this.f21951b.f(ZendeskSupportInitializer.class);
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((App$onCreate$4$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

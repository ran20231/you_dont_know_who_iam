package com.forsale.app.utils.analytics;

import androidx.lifecycle.h0;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.annotations.Parser;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LeanPlumLogger.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.utils.analytics.LeanPlumLogger$initialize$1", f = "LeanPlumLogger.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LeanPlumLogger$initialize$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40005a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LeanPlumLogger f40006b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LeanPlumLogger$initialize$1(LeanPlumLogger leanPlumLogger, zz.a<? super LeanPlumLogger$initialize$1> aVar) {
        super(2, aVar);
        this.f40006b = leanPlumLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LeanPlumLogger$initialize$1(this.f40006b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        jj.b bVar;
        sf.a aVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f40005a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            if (!this.f40006b.isEnabled()) {
                return wz.p.f75480a;
            }
            Leanplum.setApplicationContext(this.f40006b.l());
            Leanplum.setLogLevel(3);
            Parser.parseVariablesForClasses(LeanPlumLogger.class);
            LeanplumActivityHelper.enableLifecycleCallbacks(this.f40006b.l());
            this.f40006b.w();
            this.f40006b.y();
            bVar = this.f40006b.f40001b;
            kj.b c11 = bVar.c();
            this.f40005a = 1;
            obj = c11.a(this);
            if (obj == f11) {
                return f11;
            }
        }
        Leanplum.setDeviceId((String) obj);
        aVar = this.f40006b.f40002c;
        aVar.a(this.f40006b.l(), h0.f12830i.a());
        Leanplum.start(this.f40006b.l());
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LeanPlumLogger$initialize$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

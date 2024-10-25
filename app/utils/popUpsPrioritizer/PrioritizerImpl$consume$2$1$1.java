package com.forsale.app.utils.popUpsPrioritizer;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
/* compiled from: Prioritizer.kt */
@d(c = "com.forsale.app.utils.popUpsPrioritizer.PrioritizerImpl$consume$2$1$1", f = "Prioritizer.kt", l = {l8.a.f62267d}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PrioritizerImpl$consume$2$1$1 extends SuspendLambda implements p<wz.p, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40399a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PrioritizerImpl$consume$2$1$1(zz.a<? super PrioritizerImpl$consume$2$1$1> aVar) {
        super(2, aVar);
    }

    @Override // g00.p
    /* renamed from: b */
    public final Object invoke(wz.p pVar, zz.a<? super wz.p> aVar) {
        return ((PrioritizerImpl$consume$2$1$1) create(pVar, aVar)).invokeSuspend(wz.p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PrioritizerImpl$consume$2$1$1(aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object h11;
        f11 = b.f();
        int i11 = this.f40399a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            PrioritizerImpl prioritizerImpl = PrioritizerImpl.f40390b;
            this.f40399a = 1;
            h11 = prioritizerImpl.h(this);
            if (h11 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }
}

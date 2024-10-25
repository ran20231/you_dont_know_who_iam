package com.forsale.adserver.view.screens.offersScreen;

import g00.q;
import java.util.List;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$offersList$3", f = "OffersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OffersViewModel$offersList$3 extends SuspendLambda implements q<FlowCollector<? super List<? extends g9.d>>, Throwable, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21468a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f21469b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$offersList$3(a<? super OffersViewModel$offersList$3> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super List<g9.d>> flowCollector, Throwable th2, a<? super p> aVar) {
        OffersViewModel$offersList$3 offersViewModel$offersList$3 = new OffersViewModel$offersList$3(aVar);
        offersViewModel$offersList$3.f21469b = th2;
        return offersViewModel$offersList$3.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21468a == 0) {
            f.b(obj);
            x10.a.c((Throwable) this.f21469b);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

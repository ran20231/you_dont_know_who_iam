package com.forsale.adserver.view.screens.offersScreen;

import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$_showFeaturedCategory$2", f = "OffersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OffersViewModel$_showFeaturedCategory$2 extends SuspendLambda implements q<FlowCollector<? super Boolean>, Throwable, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21437a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f21438b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$_showFeaturedCategory$2(a<? super OffersViewModel$_showFeaturedCategory$2> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super Boolean> flowCollector, Throwable th2, a<? super p> aVar) {
        OffersViewModel$_showFeaturedCategory$2 offersViewModel$_showFeaturedCategory$2 = new OffersViewModel$_showFeaturedCategory$2(aVar);
        offersViewModel$_showFeaturedCategory$2.f21438b = th2;
        return offersViewModel$_showFeaturedCategory$2.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21437a == 0) {
            f.b(obj);
            x10.a.c((Throwable) this.f21438b);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

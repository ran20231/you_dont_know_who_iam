package com.forsale.adserver.view.screens.offersScreen;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$gamRequest$3", f = "OffersViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class OffersViewModel$gamRequest$3 extends SuspendLambda implements q<FlowCollector<? super AdManagerAdRequest>, Throwable, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21446a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f21447b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$gamRequest$3(a<? super OffersViewModel$gamRequest$3> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super AdManagerAdRequest> flowCollector, Throwable th2, a<? super p> aVar) {
        OffersViewModel$gamRequest$3 offersViewModel$gamRequest$3 = new OffersViewModel$gamRequest$3(aVar);
        offersViewModel$gamRequest$3.f21447b = th2;
        return offersViewModel$gamRequest$3.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f21446a == 0) {
            f.b(obj);
            x10.a.c((Throwable) this.f21447b);
            return p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

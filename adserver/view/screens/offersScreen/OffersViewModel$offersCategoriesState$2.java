package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import wz.p;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$offersCategoriesState$2", f = "OffersViewModel.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$offersCategoriesState$2 extends SuspendLambda implements q<FlowCollector<? super OffersViewModel.a>, Throwable, a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21463a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f21464b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f21465c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$offersCategoriesState$2(a<? super OffersViewModel$offersCategoriesState$2> aVar) {
        super(3, aVar);
    }

    @Override // g00.q
    /* renamed from: b */
    public final Object invoke(FlowCollector<? super OffersViewModel.a> flowCollector, Throwable th2, a<? super p> aVar) {
        OffersViewModel$offersCategoriesState$2 offersViewModel$offersCategoriesState$2 = new OffersViewModel$offersCategoriesState$2(aVar);
        offersViewModel$offersCategoriesState$2.f21464b = flowCollector;
        offersViewModel$offersCategoriesState$2.f21465c = th2;
        return offersViewModel$offersCategoriesState$2.invokeSuspend(p.f75480a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f21463a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OffersViewModel.a.C0242a c0242a = new OffersViewModel.a.C0242a((Throwable) this.f21465c);
            this.f21464b = null;
            this.f21463a = 1;
            if (((FlowCollector) this.f21464b).emit(c0242a, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }
}

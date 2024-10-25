package com.forsale.adserver.view.screens.offersScreen;

import com.forsale.adserver.view.screens.offersScreen.OffersViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowCollector;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OffersViewModel.kt */
@d(c = "com.forsale.adserver.view.screens.offersScreen.OffersViewModel$offersCategoriesState$3", f = "OffersViewModel.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OffersViewModel$offersCategoriesState$3 extends SuspendLambda implements p<FlowCollector<? super OffersViewModel.a>, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21466a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f21467b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OffersViewModel$offersCategoriesState$3(a<? super OffersViewModel$offersCategoriesState$3> aVar) {
        super(2, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        OffersViewModel$offersCategoriesState$3 offersViewModel$offersCategoriesState$3 = new OffersViewModel$offersCategoriesState$3(aVar);
        offersViewModel$offersCategoriesState$3.f21467b = obj;
        return offersViewModel$offersCategoriesState$3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f21466a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            OffersViewModel.a.b bVar = OffersViewModel.a.b.f21440a;
            this.f21466a = 1;
            if (((FlowCollector) this.f21467b).emit(bVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(FlowCollector<? super OffersViewModel.a> flowCollector, a<? super wz.p> aVar) {
        return ((OffersViewModel$offersCategoriesState$3) create(flowCollector, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

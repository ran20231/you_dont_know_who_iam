package com.forsale.app.ui.bottomsheets.listingdetailsmoreactions;

import com.forsale.app.datalayer.network.requestsbodies.IncrementCallClicksBody;
import com.forsale.app.datalayer.network.services.AnalyticsService;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ActionUserItemViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.ActionUserItemViewModel$incrementCallClicks$1", f = "ActionUserItemViewModel.kt", l = {163}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ActionUserItemViewModel$incrementCallClicks$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38333a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ActionUserItemViewModel f38334b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ IncrementCallClicksBody f38335c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionUserItemViewModel$incrementCallClicks$1(ActionUserItemViewModel actionUserItemViewModel, IncrementCallClicksBody incrementCallClicksBody, zz.a<? super ActionUserItemViewModel$incrementCallClicks$1> aVar) {
        super(2, aVar);
        this.f38334b = actionUserItemViewModel;
        this.f38335c = incrementCallClicksBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ActionUserItemViewModel$incrementCallClicks$1(this.f38334b, this.f38335c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AnalyticsService analyticsService;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f38333a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            analyticsService = this.f38334b.f38311i;
            IncrementCallClicksBody incrementCallClicksBody = new IncrementCallClicksBody(this.f38335c.getUser_adv_id(), this.f38335c.getTarget());
            this.f38333a = 1;
            if (analyticsService.incrementCallClicks(incrementCallClicksBody, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ActionUserItemViewModel$incrementCallClicks$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

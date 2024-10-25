package com.forsale.adserver.view.viewmodel;

import com.forsale.adserver.view.models.AdsModel;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewDetailsViewModel.kt */
@d(c = "com.forsale.adserver.view.viewmodel.NewDetailsViewModel$reportAnalyticsActionOpened$1", f = "NewDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewDetailsViewModel$reportAnalyticsActionOpened$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f21803a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AdsModel f21804b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewDetailsViewModel f21805c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ CommercialItemDetailsSource f21806d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewDetailsViewModel$reportAnalyticsActionOpened$1(AdsModel adsModel, NewDetailsViewModel newDetailsViewModel, CommercialItemDetailsSource commercialItemDetailsSource, a<? super NewDetailsViewModel$reportAnalyticsActionOpened$1> aVar) {
        super(2, aVar);
        this.f21804b = adsModel;
        this.f21805c = newDetailsViewModel;
        this.f21806d = commercialItemDetailsSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new NewDetailsViewModel$reportAnalyticsActionOpened$1(this.f21804b, this.f21805c, this.f21806d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DetailsAnalyticsLogger T;
        b.f();
        if (this.f21803a == 0) {
            f.b(obj);
            AdsModel adsModel = this.f21804b;
            if (adsModel != null) {
                NewDetailsViewModel newDetailsViewModel = this.f21805c;
                CommercialItemDetailsSource commercialItemDetailsSource = this.f21806d;
                T = newDetailsViewModel.T();
                T.o(adsModel, commercialItemDetailsSource);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((NewDetailsViewModel$reportAnalyticsActionOpened$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

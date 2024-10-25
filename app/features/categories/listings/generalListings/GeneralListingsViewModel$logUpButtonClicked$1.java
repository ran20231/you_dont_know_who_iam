package com.forsale.app.features.categories.listings.generalListings;

import com.forsale.app.features.categories.listings.ListingsTypes;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GeneralListingsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.generalListings.GeneralListingsViewModel$logUpButtonClicked$1", f = "GeneralListingsViewModel.kt", l = {317}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GeneralListingsViewModel$logUpButtonClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f30496a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ GeneralListingsViewModel f30497b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralListingsViewModel$logUpButtonClicked$1(GeneralListingsViewModel generalListingsViewModel, zz.a<? super GeneralListingsViewModel$logUpButtonClicked$1> aVar) {
        super(2, aVar);
        this.f30497b = generalListingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new GeneralListingsViewModel$logUpButtonClicked$1(this.f30497b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f30496a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            aggregatedAllAnalyticsLogger = this.f30497b.f30475f;
            ListingsTypes f12 = this.f30497b.E().f();
            this.f30496a = 1;
            if (AggregatedAllAnalyticsLoggerKt.l0(aggregatedAllAnalyticsLogger, f12, null, null, this, 6, null) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((GeneralListingsViewModel$logUpButtonClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

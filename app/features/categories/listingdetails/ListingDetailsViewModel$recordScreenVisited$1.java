package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$recordScreenVisited$1", f = "ListingDetailsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$recordScreenVisited$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25418a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25419b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$recordScreenVisited$1(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super ListingDetailsViewModel$recordScreenVisited$1> aVar) {
        super(2, aVar);
        this.f25419b = listingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$recordScreenVisited$1(this.f25419b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        kotlin.coroutines.intrinsics.b.f();
        if (this.f25418a == 0) {
            kotlin.f.b(obj);
            if (this.f25419b.T0().getValue().booleanValue()) {
                ListingDetailsViewModel.N1(this.f25419b, AggregatedAllAnalyticsLogger.AdvActionEvents.MY_LISTING_PREVIEWED, false, false, false, null, null, null, null, null, 510, null);
            } else if (this.f25419b.B1()) {
                ListingDetailsViewModel listingDetailsViewModel = this.f25419b;
                AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = AggregatedAllAnalyticsLogger.AdvActionEvents.MY_LISTING_DETAILS_VISITED;
                String Z0 = listingDetailsViewModel.Z0();
                str = this.f25419b.f25343q0;
                ListingDetailsViewModel.N1(listingDetailsViewModel, advActionEvents, false, false, false, null, null, Z0, str, null, 318, null);
            } else {
                ListingDetailsViewModel.N1(this.f25419b, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_VISITED, false, false, true, null, null, this.f25419b.Z0(), null, this.f25419b.X0(), 182, null);
            }
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$recordScreenVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

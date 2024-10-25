package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.VirtualTourPosition;
import g00.p;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import wz.i;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$logVirtualTourAnalytics$1", f = "ListingDetailsViewModel.kt", l = {319, 322}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$logVirtualTourAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25412a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ VirtualTourPosition f25413b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25414c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Long f25415d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$logVirtualTourAnalytics$1(VirtualTourPosition virtualTourPosition, ListingDetailsViewModel listingDetailsViewModel, Long l11, zz.a<? super ListingDetailsViewModel$logVirtualTourAnalytics$1> aVar) {
        super(2, aVar);
        this.f25413b = virtualTourPosition;
        this.f25414c = listingDetailsViewModel;
        this.f25415d = l11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$logVirtualTourAnalytics$1(this.f25413b, this.f25414c, this.f25415d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25412a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            if (this.f25413b != null) {
                ListingDetailsRepository j12 = this.f25414c.j1();
                AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents = AggregatedAllAnalyticsLogger.AdvActionEvents.VIRTUAL_TOUR_EXPLORE_CLICKED;
                int W0 = this.f25414c.W0();
                String Z0 = this.f25414c.Z0();
                ListingDetailsAnalyticSource X0 = this.f25414c.X0();
                Pair<String, String>[] pairArr = {i.a(AggregatedAllAnalyticsLogger.CustomParameterName.VIRTUAL_TOUR_POSITION.getValue(), this.f25413b.getValue())};
                this.f25412a = 1;
                if (j12.a0(advActionEvents, W0, Z0, X0, pairArr, this) == f11) {
                    return f11;
                }
            }
        }
        Long l11 = this.f25415d;
        if (l11 != null && (l11 == null || l11.longValue() != 0)) {
            ListingDetailsRepository j13 = this.f25414c.j1();
            AggregatedAllAnalyticsLogger.AdvActionEvents advActionEvents2 = AggregatedAllAnalyticsLogger.AdvActionEvents.VIRTUAL_TOUR_CLOSE_CLICKED;
            int W02 = this.f25414c.W0();
            String Z02 = this.f25414c.Z0();
            ListingDetailsAnalyticSource X02 = this.f25414c.X0();
            Pair<String, String>[] pairArr2 = {i.a(AggregatedAllAnalyticsLogger.CustomParameterName.VIRTUAL_TOUR_DURATION.getValue(), this.f25415d.toString())};
            this.f25412a = 2;
            if (j13.a0(advActionEvents2, W02, Z02, X02, pairArr2, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$logVirtualTourAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

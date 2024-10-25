package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.draftItem;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DraftCardViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.draftItem.DraftCardViewModel$onEditClicked$1", f = "DraftCardViewModel.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DraftCardViewModel$onEditClicked$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27757a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DraftCardViewModel f27758b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DraftCardViewModel$onEditClicked$1(DraftCardViewModel draftCardViewModel, a<? super DraftCardViewModel$onEditClicked$1> aVar) {
        super(2, aVar);
        this.f27758b = draftCardViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new DraftCardViewModel$onEditClicked$1(this.f27758b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingItemDetails listingItemDetails;
        String str;
        f11 = b.f();
        int i11 = this.f27757a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            DraftCardViewModel draftCardViewModel = this.f27758b;
            AggregatedAllAnalyticsLogger.MyListingActionEvents myListingActionEvents = AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_EDIT_CLICKED;
            AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = AggregatedAllAnalyticsLogger.AnalyticsPosition.MID_SCREEN;
            this.f27757a = 1;
            if (DraftCardViewModel.f(draftCardViewModel, myListingActionEvents, true, true, analyticsPosition, null, this, 16, null) == f11) {
                return f11;
            }
        }
        listingItemDetails = this.f27758b.f27751b;
        if (listingItemDetails != null) {
            DraftCardViewModel draftCardViewModel2 = this.f27758b;
            OneShotEventHandler<ListingDetailsEntity> c11 = draftCardViewModel2.c();
            ListingDetailsEntity.Companion companion = ListingDetailsEntity.Companion;
            str = draftCardViewModel2.f27754e;
            c11.i(companion.from(listingItemDetails, str));
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((DraftCardViewModel$onEditClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

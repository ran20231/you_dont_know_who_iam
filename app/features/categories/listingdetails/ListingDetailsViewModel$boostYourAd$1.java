package com.forsale.app.features.categories.listingdetails;

import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$boostYourAd$1", f = "ListingDetailsViewModel.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$boostYourAd$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25353a;

    /* renamed from: b  reason: collision with root package name */
    Object f25354b;

    /* renamed from: c  reason: collision with root package name */
    Object f25355c;

    /* renamed from: d  reason: collision with root package name */
    int f25356d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25357e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ AggregatedAllAnalyticsLogger.AnalyticsPosition f25358f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ l<ListingDetailsEntity, wz.p> f25359g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ListingDetailsViewModel$boostYourAd$1(ListingDetailsViewModel listingDetailsViewModel, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, l<? super ListingDetailsEntity, wz.p> lVar, zz.a<? super ListingDetailsViewModel$boostYourAd$1> aVar) {
        super(2, aVar);
        this.f25357e = listingDetailsViewModel;
        this.f25358f = analyticsPosition;
        this.f25359g = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$boostYourAd$1(this.f25357e, this.f25358f, this.f25359g, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        ListingItemDetails listingItemDetails;
        ListingDetailsEntity.Companion companion;
        l<ListingDetailsEntity, wz.p> lVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25356d;
        if (i11 != 0) {
            if (i11 == 1) {
                lVar = (l) this.f25355c;
                companion = (ListingDetailsEntity.Companion) this.f25354b;
                listingItemDetails = (ListingItemDetails) this.f25353a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            ListingItemDetails value = this.f25357e.Y0().getValue();
            if (value != null) {
                ListingDetailsViewModel listingDetailsViewModel = this.f25357e;
                AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition = this.f25358f;
                l<ListingDetailsEntity, wz.p> lVar2 = this.f25359g;
                ListingDetailsViewModel.P1(listingDetailsViewModel, AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_BOOST_CLICKED, false, false, analyticsPosition, null, 22, null);
                ListingDetailsEntity.Companion companion2 = ListingDetailsEntity.Companion;
                ListingDetailsRepository j12 = listingDetailsViewModel.j1();
                this.f25353a = value;
                this.f25354b = companion2;
                this.f25355c = lVar2;
                this.f25356d = 1;
                Object q11 = j12.q(this);
                if (q11 == f11) {
                    return f11;
                }
                listingItemDetails = value;
                obj = q11;
                companion = companion2;
                lVar = lVar2;
            }
            return wz.p.f75480a;
        }
        lVar.invoke(companion.from(listingItemDetails, (String) obj));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$boostYourAd$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

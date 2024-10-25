package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsVisitedEvent;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {812}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f25792a;

    /* renamed from: b  reason: collision with root package name */
    int f25793b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DetailsModel f25794c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25795d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1(DetailsModel detailsModel, BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1> aVar) {
        super(2, aVar);
        this.f25794c = detailsModel;
        this.f25795d = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1(this.f25794c, this.f25795d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DetailsAnalyticsInteractor detailsAnalyticsInteractor;
        ItemArgs g02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25793b;
        if (i11 != 0) {
            if (i11 == 1) {
                DetailsModel detailsModel = (DetailsModel) this.f25792a;
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            DetailsModel detailsModel2 = this.f25794c;
            BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25795d;
            detailsAnalyticsInteractor = buyerListingDetailsScreenViewModel.f25650j;
            g02 = buyerListingDetailsScreenViewModel.g0();
            ListingDetailsVisitedEvent listingDetailsVisitedEvent = new ListingDetailsVisitedEvent(detailsModel2, g02);
            this.f25792a = detailsModel2;
            this.f25793b = 1;
            if (detailsAnalyticsInteractor.h(listingDetailsVisitedEvent, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$recordListingDetailsVisited$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

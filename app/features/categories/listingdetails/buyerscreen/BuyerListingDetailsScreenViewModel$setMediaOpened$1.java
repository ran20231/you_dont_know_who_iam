package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsMediaOpenedEvent;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$setMediaOpened$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {885}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$setMediaOpened$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25811a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25812b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MediaTypes f25813c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$setMediaOpened$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, MediaTypes mediaTypes, zz.a<? super BuyerListingDetailsScreenViewModel$setMediaOpened$1> aVar) {
        super(2, aVar);
        this.f25812b = buyerListingDetailsScreenViewModel;
        this.f25813c = mediaTypes;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$setMediaOpened$1(this.f25812b, this.f25813c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DetailsAnalyticsInteractor detailsAnalyticsInteractor;
        ItemArgs g02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25811a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            DetailsModel c11 = this.f25812b.f25632a.c(this.f25812b.k0().getValue());
            if (c11 != null) {
                BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25812b;
                MediaTypes mediaTypes = this.f25813c;
                detailsAnalyticsInteractor = buyerListingDetailsScreenViewModel.f25650j;
                g02 = buyerListingDetailsScreenViewModel.g0();
                ListingDetailsMediaOpenedEvent listingDetailsMediaOpenedEvent = new ListingDetailsMediaOpenedEvent(c11, g02, com.forsale.app.features.categories.listingdetails.buyerscreen.models.a.a(mediaTypes));
                this.f25811a = 1;
                if (detailsAnalyticsInteractor.j(listingDetailsMediaOpenedEvent, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$setMediaOpened$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsDescriptionSeeLessClickedEvent;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {861}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25784a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, zz.a<? super BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1> aVar) {
        super(2, aVar);
        this.f25785b = buyerListingDetailsScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1(this.f25785b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        DetailsAnalyticsInteractor detailsAnalyticsInteractor;
        ItemArgs g02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25784a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            DetailsModel c11 = this.f25785b.f25632a.c(this.f25785b.k0().getValue());
            if (c11 != null) {
                BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25785b;
                detailsAnalyticsInteractor = buyerListingDetailsScreenViewModel.f25650j;
                g02 = buyerListingDetailsScreenViewModel.g0();
                ListingDetailsDescriptionSeeLessClickedEvent listingDetailsDescriptionSeeLessClickedEvent = new ListingDetailsDescriptionSeeLessClickedEvent(c11, g02);
                this.f25784a = 1;
                if (detailsAnalyticsInteractor.c(listingDetailsDescriptionSeeLessClickedEvent, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$recordDescriptionShowLessClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

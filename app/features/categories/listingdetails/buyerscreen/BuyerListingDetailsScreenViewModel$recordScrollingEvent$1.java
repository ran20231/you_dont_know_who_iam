package com.forsale.app.features.categories.listingdetails.buyerscreen;

import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.DetailsAnalyticsInteractor;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.events.ListingDetailsScrollingEvent;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyerListingDetailsScreenViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.BuyerListingDetailsScreenViewModel$recordScrollingEvent$1", f = "BuyerListingDetailsScreenViewModel.kt", l = {905}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class BuyerListingDetailsScreenViewModel$recordScrollingEvent$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25800a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BuyerListingDetailsScreenViewModel f25801b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f25802c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyerListingDetailsScreenViewModel$recordScrollingEvent$1(BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel, boolean z11, zz.a<? super BuyerListingDetailsScreenViewModel$recordScrollingEvent$1> aVar) {
        super(2, aVar);
        this.f25801b = buyerListingDetailsScreenViewModel;
        this.f25802c = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new BuyerListingDetailsScreenViewModel$recordScrollingEvent$1(this.f25801b, this.f25802c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        bb.a aVar;
        List<eb.s> list;
        DetailsAnalyticsInteractor detailsAnalyticsInteractor;
        ItemArgs g02;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25800a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            DetailsModel a11 = this.f25801b.x0().a();
            if (a11 != null) {
                BuyerListingDetailsScreenViewModel buyerListingDetailsScreenViewModel = this.f25801b;
                boolean z11 = this.f25802c;
                aVar = buyerListingDetailsScreenViewModel.C;
                list = buyerListingDetailsScreenViewModel.f25654m0;
                eb.s a12 = aVar.a(list, a11.d().c(), z11);
                if (a12 != null) {
                    detailsAnalyticsInteractor = buyerListingDetailsScreenViewModel.f25650j;
                    g02 = buyerListingDetailsScreenViewModel.g0();
                    ListingDetailsScrollingEvent listingDetailsScrollingEvent = new ListingDetailsScrollingEvent(a11, g02, a12);
                    this.f25800a = 1;
                    if (detailsAnalyticsInteractor.l(listingDetailsScrollingEvent, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((BuyerListingDetailsScreenViewModel$recordScrollingEvent$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

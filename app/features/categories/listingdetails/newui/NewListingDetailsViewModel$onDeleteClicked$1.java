package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onDeleteClicked$1", f = "NewListingDetailsViewModel.kt", l = {450}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onDeleteClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27294a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27295b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onDeleteClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$onDeleteClicked$1> aVar) {
        super(2, aVar);
        this.f27295b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onDeleteClicked$1(this.f27295b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27294a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            ListingItemDetails value = this.f27295b.Q1().getValue();
            if (value != null) {
                int id2 = value.getId();
                NewListingDetailsViewModel newListingDetailsViewModel = this.f27295b;
                ListingDetailsViewModel.P1(newListingDetailsViewModel.R1(), AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_DELETE_CLICKED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.TOP_SCREEN, null, 16, null);
                mutableSharedFlow = newListingDetailsViewModel.f27176m1;
                Integer d11 = kotlin.coroutines.jvm.internal.a.d(id2);
                this.f27294a = 1;
                if (mutableSharedFlow.emit(d11, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onDeleteClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

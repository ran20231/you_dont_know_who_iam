package com.forsale.app.features.categories.listingdetails.newui;

import androidx.lifecycle.LiveData;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import falcon.chat.entities.ChannelEntity;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsViewModel.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$handleChat$1", f = "NewListingDetailsViewModel.kt", l = {834, 836, 856}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$handleChat$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f27266a;

    /* renamed from: b  reason: collision with root package name */
    int f27267b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27268c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$handleChat$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$handleChat$1> aVar) {
        super(2, aVar);
        this.f27268c = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$handleChat$1(this.f27268c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object H0;
        boolean z11;
        ListingItemDetails value;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27267b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return wz.p.f75480a;
            }
            f.b(obj);
            H0 = obj;
        } else {
            f.b(obj);
            ListingDetailsViewModel R1 = this.f27268c.R1();
            this.f27267b = 1;
            H0 = R1.H0(this);
            if (H0 == f11) {
                return f11;
            }
        }
        NewListingDetailsViewModel newListingDetailsViewModel = this.f27268c;
        if (((ChannelEntity) H0) == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            mutableSharedFlow2 = newListingDetailsViewModel.H0;
            com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar = new com.forsale.app.ui.bottomsheets.listingdetailschat.b(newListingDetailsViewModel.R1().W0(), newListingDetailsViewModel.Q1().getValue(), newListingDetailsViewModel.O1(), null, newListingDetailsViewModel.R1().x1(), newListingDetailsViewModel.R1().t1().getValue(), newListingDetailsViewModel.R1().z1(), newListingDetailsViewModel.R1().u1(), newListingDetailsViewModel.R1().X0(), newListingDetailsViewModel.R1().Z0(), newListingDetailsViewModel.R1().q1(), newListingDetailsViewModel.R1().R0(), newListingDetailsViewModel.R1().k1());
            this.f27266a = H0;
            this.f27267b = 2;
            if (mutableSharedFlow2.emit(bVar, this) == f11) {
                return f11;
            }
        } else if (!z11) {
            NewListingDetailsViewModel.J2(newListingDetailsViewModel, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_CHAT_STARTED, newListingDetailsViewModel.R1().Z0(), false, false, false, null, null, 124, null);
            LiveData<ListingItemDetails> Q1 = newListingDetailsViewModel.Q1();
            if (Q1 != null && (value = Q1.getValue()) != null) {
                mutableSharedFlow = newListingDetailsViewModel.J0;
                this.f27266a = H0;
                this.f27267b = 3;
                if (mutableSharedFlow.emit(value, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$handleChat$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

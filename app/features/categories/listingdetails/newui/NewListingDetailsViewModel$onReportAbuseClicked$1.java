package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.auth.login.SignInIntention;
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
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onReportAbuseClicked$1", f = "NewListingDetailsViewModel.kt", l = {538, 539}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsViewModel$onReportAbuseClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27304a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsViewModel f27305b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsViewModel$onReportAbuseClicked$1(NewListingDetailsViewModel newListingDetailsViewModel, zz.a<? super NewListingDetailsViewModel$onReportAbuseClicked$1> aVar) {
        super(2, aVar);
        this.f27305b = newListingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewListingDetailsViewModel$onReportAbuseClicked$1(this.f27305b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27304a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            ListingDetailsViewModel R1 = this.f27305b.R1();
            this.f27304a = 1;
            obj = R1.C1(this);
            if (obj == f11) {
                return f11;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            MutableSharedFlow<SignInIntention> g12 = this.f27305b.R1().g1();
            SignInIntention signInIntention = SignInIntention.REPORT;
            this.f27304a = 2;
            if (g12.emit(signInIntention, this) == f11) {
                return f11;
            }
        } else {
            ListingDetailsViewModel R12 = this.f27305b.R1();
            final NewListingDetailsViewModel newListingDetailsViewModel = this.f27305b;
            R12.I0(new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel$onReportAbuseClicked$1.1
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ wz.p invoke() {
                    invoke2();
                    return wz.p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ListingItemDetails value = NewListingDetailsViewModel.this.Q1().getValue();
                    if (value != null) {
                        NewListingDetailsViewModel newListingDetailsViewModel2 = NewListingDetailsViewModel.this;
                        NewListingDetailsViewModel.J2(newListingDetailsViewModel2, AggregatedAllAnalyticsLogger.AdvActionEvents.LISTING_DETAILS_REPORT_ABUSE_CLICKED, null, true, true, false, null, null, 114, null);
                        newListingDetailsViewModel2.b2().k(value);
                    }
                }
            });
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewListingDetailsViewModel$onReportAbuseClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

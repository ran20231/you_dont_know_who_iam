package com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic;

import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SellerAnalyticsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.listingdetailsselleranalytic.SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1", f = "SellerAnalyticsViewModel.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38805a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SellerAnalyticsViewModel f38806b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingItemDetails f38807c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1(SellerAnalyticsViewModel sellerAnalyticsViewModel, ListingItemDetails listingItemDetails, zz.a<? super SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1> aVar) {
        super(2, aVar);
        this.f38806b = sellerAnalyticsViewModel;
        this.f38807c = listingItemDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1(this.f38806b, this.f38807c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f38805a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f38806b.f38799l0;
            AnalyticModel analyticModel = new AnalyticModel(this.f38807c.getId(), TypeExtensionsKt.h0(this.f38807c.isAnon()), TypeExtensionsKt.h0(this.f38807c.isVoip()), TypeExtensionsKt.h0(this.f38807c.getWasPromoted()));
            this.f38805a = 1;
            if (mutableSharedFlow.emit(analyticModel, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((SellerAnalyticsViewModel$onAllAnalyticsClicked$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

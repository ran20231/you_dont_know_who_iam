package com.forsale.app.features.more.mylistings;

import com.forsale.app.base.ViewStates;
import com.forsale.app.datalayer.network.responses.ListingAnalyticsResponse;
import com.forsale.app.utils.OneShotEventHandler;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyListingAnalyticsDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.mylistings.MyListingAnalyticsDetailsViewModel$loadAnalytics$1", f = "MyListingAnalyticsDetailsViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MyListingAnalyticsDetailsViewModel$loadAnalytics$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31936a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MyListingAnalyticsDetailsViewModel f31937b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyListingAnalyticsDetailsViewModel$loadAnalytics$1(MyListingAnalyticsDetailsViewModel myListingAnalyticsDetailsViewModel, zz.a<? super MyListingAnalyticsDetailsViewModel$loadAnalytics$1> aVar) {
        super(2, aVar);
        this.f31937b = myListingAnalyticsDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new MyListingAnalyticsDetailsViewModel$loadAnalytics$1(this.f31937b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        OneShotEventHandler oneShotEventHandler;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f31936a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            this.f31937b.v0().postValue(ViewStates.LOADING);
            this.f31937b.z0().k(false);
            MyListingAnalyticsDetailsViewModel myListingAnalyticsDetailsViewModel = this.f31937b;
            this.f31936a = 1;
            obj = myListingAnalyticsDetailsViewModel.B0(this);
            if (obj == f11) {
                return f11;
            }
        }
        MyListingAnalyticsDetailsViewModel myListingAnalyticsDetailsViewModel2 = this.f31937b;
        ListingAnalyticsResponse listingAnalyticsResponse = (ListingAnalyticsResponse) obj;
        oneShotEventHandler = myListingAnalyticsDetailsViewModel2.f31928p0;
        oneShotEventHandler.i(listingAnalyticsResponse);
        for (ListingAnalyticsResponse.Analytics analytics : listingAnalyticsResponse.getAnalytics()) {
            analytics.getAllDayValues();
        }
        myListingAnalyticsDetailsViewModel2.v0().postValue(ViewStates.CONTENT);
        myListingAnalyticsDetailsViewModel2.z0().k(true);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((MyListingAnalyticsDetailsViewModel$loadAnalytics$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

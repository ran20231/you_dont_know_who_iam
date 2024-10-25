package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.analyticitem;

import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.features.more.mylistings.AnalyticModel;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.p;
/* compiled from: AnalyticCardViewModel.kt */
/* loaded from: classes2.dex */
public final class AnalyticCardViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final int f27683a;

    /* renamed from: b  reason: collision with root package name */
    private final int f27684b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27685c;

    /* renamed from: d  reason: collision with root package name */
    private final AnalyticModel f27686d;

    /* renamed from: e  reason: collision with root package name */
    private final ListingDetailsViewModel f27687e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<AnalyticModel> f27688f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<AnalyticModel> f27689g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableSharedFlow<Integer> f27690h;

    /* renamed from: i  reason: collision with root package name */
    private final SharedFlow<Integer> f27691i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f27692j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<p> f27693k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<p> f27694l;

    public AnalyticCardViewModel(int i11, int i12, int i13, AnalyticModel analyticModel, ListingDetailsViewModel listingDetailsViewModel) {
        o.i(analyticModel, "analyticModel");
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        this.f27683a = i11;
        this.f27684b = i12;
        this.f27685c = i13;
        this.f27686d = analyticModel;
        this.f27687e = listingDetailsViewModel;
        MutableSharedFlow<AnalyticModel> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27688f = MutableSharedFlow$default;
        this.f27689g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        MutableSharedFlow<Integer> MutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27690h = MutableSharedFlow$default2;
        this.f27691i = FlowKt.asSharedFlow(MutableSharedFlow$default2);
        this.f27692j = !listingDetailsViewModel.y1();
        MutableSharedFlow<p> MutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27693k = MutableSharedFlow$default3;
        this.f27694l = FlowKt.asSharedFlow(MutableSharedFlow$default3);
    }

    public final boolean f() {
        return this.f27692j;
    }

    public final int g() {
        return this.f27684b;
    }

    public final SharedFlow<AnalyticModel> h() {
        return this.f27689g;
    }

    public final SharedFlow<p> i() {
        return this.f27694l;
    }

    public final SharedFlow<Integer> j() {
        return this.f27691i;
    }

    public final int k() {
        return this.f27685c;
    }

    public final void l() {
        ListingDetailsViewModel.P1(this.f27687e, AggregatedAllAnalyticsLogger.MyListingActionEvents.MY_LISTING_DETAILS_ALL_ANALYTICS_CLICKED, true, true, AggregatedAllAnalyticsLogger.AnalyticsPosition.MID_SCREEN, null, 16, null);
        BuildersKt__Builders_commonKt.launch$default(this.f27687e, null, null, new AnalyticCardViewModel$onAllAnalyticsClicked$1(this, null), 3, null);
    }

    public final void m() {
        BuildersKt__Builders_commonKt.launch$default(this.f27687e, null, null, new AnalyticCardViewModel$onChatsClicked$1(this, null), 3, null);
    }
}

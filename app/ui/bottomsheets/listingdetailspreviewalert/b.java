package com.forsale.app.ui.bottomsheets.listingdetailspreviewalert;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: PreviewAlertViewModel.kt */
/* loaded from: classes3.dex */
public final class b extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final ListingDetailsViewModel f38486k0;

    /* renamed from: l0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38487l0;

    /* renamed from: m0  reason: collision with root package name */
    private final OneShotEventHandler<p> f38488m0;

    /* compiled from: PreviewAlertViewModel.kt */
    /* loaded from: classes3.dex */
    public interface a {
        b a(ListingDetailsViewModel listingDetailsViewModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ListingDetailsViewModel listingDetailsViewModel, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(baseRepository, "baseRepository");
        this.f38486k0 = listingDetailsViewModel;
        this.f38487l0 = new OneShotEventHandler<>(null, 0, 3, null);
        this.f38488m0 = new OneShotEventHandler<>(null, 0, 3, null);
    }

    public final OneShotEventHandler<p> v0() {
        return this.f38488m0;
    }

    public final OneShotEventHandler<p> w0() {
        return this.f38487l0;
    }

    public final void x0() {
        OneShotEventHandler.d(this.f38487l0, null, 1, null);
    }

    public final void y0() {
        ListingDetailsViewModel.N1(this.f38486k0, AggregatedAllAnalyticsLogger.AdvActionEvents.MY_LISTING_PREVIEW_EDIT_CLICKED, true, true, false, null, null, null, null, null, 504, null);
        OneShotEventHandler.d(this.f38488m0, null, 1, null);
    }
}

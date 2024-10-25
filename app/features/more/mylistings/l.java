package com.forsale.app.features.more.mylistings;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.MyListingAnalyticsType;
import kotlin.jvm.internal.o;
/* compiled from: MyListingAnalyticsViewModel.kt */
/* loaded from: classes2.dex */
public final class l extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final AnalyticModel f31956k0;

    /* compiled from: MyListingAnalyticsViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {
        l a(AnalyticModel analyticModel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AnalyticModel analyticModel, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(analyticModel, "analyticModel");
        o.i(baseRepository, "baseRepository");
        this.f31956k0 = analyticModel;
    }

    private final void v0() {
        AggregatedAllAnalyticsLoggerKt.n0(r(), MyListingAnalyticsType.MAIN_SCREEN, this.f31956k0.a());
    }

    public final void w0() {
        v0();
    }

    public final boolean x0() {
        return !this.f31956k0.c();
    }

    public final boolean y0() {
        return this.f31956k0.b();
    }
}

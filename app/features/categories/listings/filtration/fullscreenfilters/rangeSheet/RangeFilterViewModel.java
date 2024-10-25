package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.utils.analytics.listingfiltration.ListingsFiltrationAnalytics;
import com.forsale.app.utils.analytics.listingfiltration.a;
import com.google.android.gms.common.api.Api;
import fc.c;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: RangeFilterViewModel.kt */
/* loaded from: classes2.dex */
public final class RangeFilterViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final a.c f29923k0;

    /* renamed from: l0  reason: collision with root package name */
    private final ListingsFiltrationAnalytics f29924l0;

    /* renamed from: m0  reason: collision with root package name */
    private final hc.b f29925m0;

    /* renamed from: n0  reason: collision with root package name */
    private final MutableStateFlow<GetListingsBody.FiltrationData.Range> f29926n0;

    /* renamed from: o0  reason: collision with root package name */
    private final MutableStateFlow<Integer> f29927o0;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableStateFlow<Integer> f29928p0;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<a> f29929q0;

    /* renamed from: r0  reason: collision with root package name */
    private final Flow<Boolean> f29930r0;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableStateFlow<Integer> f29931s0;

    /* renamed from: t0  reason: collision with root package name */
    private final MutableStateFlow<Integer> f29932t0;

    /* renamed from: u0  reason: collision with root package name */
    private final MutableStateFlow<ExtraAttributeEntity.LocalUnit> f29933u0;

    /* compiled from: RangeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: RangeFilterViewModel.kt */
        /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0333a implements a {

            /* renamed from: a  reason: collision with root package name */
            private final c f29934a;

            public C0333a(c filterResult) {
                o.i(filterResult, "filterResult");
                this.f29934a = filterResult;
            }

            public final c a() {
                return this.f29934a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0333a) && o.d(this.f29934a, ((C0333a) obj).f29934a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f29934a.hashCode();
            }

            public String toString() {
                c cVar = this.f29934a;
                return "ApplyFilter(filterResult=" + cVar + ")";
            }
        }

        /* compiled from: RangeFilterViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b implements a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f29935a = new b();

            private b() {
            }
        }
    }

    /* compiled from: RangeFilterViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        RangeFilterViewModel a(a.c cVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RangeFilterViewModel(a.c filtrationClickCapsule, ListingsFiltrationAnalytics filtrationAnalytics, BaseRepository baseRepository) {
        super(baseRepository);
        Integer num;
        Integer num2;
        int i11;
        o.i(filtrationClickCapsule, "filtrationClickCapsule");
        o.i(filtrationAnalytics, "filtrationAnalytics");
        o.i(baseRepository, "baseRepository");
        this.f29923k0 = filtrationClickCapsule;
        this.f29924l0 = filtrationAnalytics;
        this.f29925m0 = new hc.b();
        this.f29926n0 = StateFlowKt.MutableStateFlow(filtrationClickCapsule.c());
        GetListingsBody.FiltrationData.Range b11 = filtrationClickCapsule.b();
        if (b11 != null) {
            num = b11.getFrom();
        } else {
            num = null;
        }
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(num);
        this.f29927o0 = MutableStateFlow;
        GetListingsBody.FiltrationData.Range b12 = filtrationClickCapsule.b();
        if (b12 != null) {
            num2 = b12.getTo();
        } else {
            num2 = null;
        }
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(num2);
        this.f29928p0 = MutableStateFlow2;
        this.f29929q0 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f29930r0 = FlowKt.flowCombine(MutableStateFlow, MutableStateFlow2, new RangeFilterViewModel$resetEnabled$1(null));
        Integer from = filtrationClickCapsule.c().getFrom();
        this.f29931s0 = StateFlowKt.MutableStateFlow(Integer.valueOf(from != null ? from.intValue() : 0));
        Integer to2 = filtrationClickCapsule.c().getTo();
        if (to2 != null) {
            i11 = to2.intValue();
        } else {
            i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        this.f29932t0 = StateFlowKt.MutableStateFlow(Integer.valueOf(i11));
        this.f29933u0 = StateFlowKt.MutableStateFlow(filtrationClickCapsule.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a.c H0(GetListingsBody.FiltrationData.Range range) {
        String c11 = this.f29923k0.a().c();
        a.c cVar = new a.c(c11, range);
        this.f29924l0.m(new vi.a(null, c11, cVar, false, this.f29923k0.a().b(), this.f29923k0.a().d().c()));
        return cVar;
    }

    public final MutableStateFlow<Integer> A0() {
        return this.f29932t0;
    }

    public final MutableStateFlow<Integer> B0() {
        return this.f29927o0;
    }

    public final MutableStateFlow<Integer> C0() {
        return this.f29931s0;
    }

    public final hc.b D0() {
        return this.f29925m0;
    }

    public final Flow<Boolean> E0() {
        return this.f29930r0;
    }

    public final MutableStateFlow<ExtraAttributeEntity.LocalUnit> G0() {
        return this.f29933u0;
    }

    public final void I0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new RangeFilterViewModel$resetFilters$1(this, null), 3, null);
    }

    public final void w0() {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new RangeFilterViewModel$applyFilters$1(this, null), 3, null);
    }

    public final MutableSharedFlow<a> x0() {
        return this.f29929q0;
    }

    public final a.c y0() {
        return this.f29923k0;
    }

    public final MutableStateFlow<Integer> z0() {
        return this.f29928p0;
    }
}

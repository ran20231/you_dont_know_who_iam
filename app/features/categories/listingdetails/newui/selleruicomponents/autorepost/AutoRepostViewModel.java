package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost;

import androidx.lifecycle.b0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.a;
import com.forsale.app.features.categories.listingdetails.newui.SwitchStates;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import dj.i;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import wz.h;
/* compiled from: AutoRepostViewModel.kt */
/* loaded from: classes2.dex */
public class AutoRepostViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f27716a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f27717b;

    /* renamed from: c  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger.AnalyticsPosition f27718c;

    /* renamed from: d  reason: collision with root package name */
    private final RegionsRepository f27719d;

    /* renamed from: e  reason: collision with root package name */
    private final ApplicationResourcesRepository f27720e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f27721f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> f27722g;

    /* renamed from: h  reason: collision with root package name */
    private final b0<String> f27723h;

    /* renamed from: i  reason: collision with root package name */
    private final b0<a> f27724i;

    /* renamed from: j  reason: collision with root package name */
    private final z<SwitchStates> f27725j;

    /* renamed from: k  reason: collision with root package name */
    private final h f27726k;

    public AutoRepostViewModel(CoroutineScope coroutineScope, ListingItemDetails listingDetails, AggregatedAllAnalyticsLogger.AnalyticsPosition analyticsPosition, RegionsRepository regionsRepository, ApplicationResourcesRepository appRepo) {
        h a11;
        SwitchStates switchStates;
        o.i(coroutineScope, "coroutineScope");
        o.i(listingDetails, "listingDetails");
        o.i(analyticsPosition, "analyticsPosition");
        o.i(regionsRepository, "regionsRepository");
        o.i(appRepo, "appRepo");
        this.f27716a = coroutineScope;
        this.f27717b = listingDetails;
        this.f27718c = analyticsPosition;
        this.f27719d = regionsRepository;
        this.f27720e = appRepo;
        MutableSharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f27721f = MutableSharedFlow$default;
        this.f27722g = FlowKt.asSharedFlow(MutableSharedFlow$default);
        this.f27723h = new b0<>();
        this.f27724i = new b0<>();
        z<SwitchStates> zVar = new z<>();
        zVar.setValue(SwitchStates.INTIAL);
        this.f27725j = zVar;
        a11 = d.a(new g00.a<i>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.autorepost.AutoRepostViewModel$reporter$2
            @Override // g00.a
            /* renamed from: b */
            public final i invoke() {
                return i.f54287a.invoke();
            }
        });
        this.f27726k = a11;
        j();
        if (TypeExtensionsKt.h0(listingDetails.isAutoRepost())) {
            switchStates = SwitchStates.ENABLED;
        } else {
            switchStates = SwitchStates.DISABLED;
        }
        zVar.setValue(switchStates);
    }

    private final void j() {
        BuildersKt__Builders_commonKt.launch$default(this.f27716a, null, null, new AutoRepostViewModel$loadRepostDate$1$1(this, this.f27717b, null), 3, null);
    }

    public final SharedFlow<AggregatedAllAnalyticsLogger.AnalyticsPosition> e() {
        return this.f27722g;
    }

    public final z<SwitchStates> f() {
        return this.f27725j;
    }

    public final ListingItemDetails g() {
        return this.f27717b;
    }

    public final b0<a> h() {
        return this.f27724i;
    }

    public final b0<String> i() {
        return this.f27723h;
    }

    public final void k() {
        BuildersKt__Builders_commonKt.launch$default(this.f27716a, null, null, new AutoRepostViewModel$onAutoRepostChanged$1(this, null), 3, null);
    }
}

package com.forsale.app.domainlayer.interactors.listingsInteractors;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingsResponse;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt;
import com.forsale.app.features.categories.home.allverticals.AllVerticalsSectionType;
import com.forsale.app.features.categories.home.allverticals.f;
import com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor;
import ea.a;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import wz.p;
/* compiled from: GetFeaturedCarouselSectionInteractor.kt */
/* loaded from: classes2.dex */
public final class GetFeaturedCarouselSectionInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final a f22459a;

    /* renamed from: b  reason: collision with root package name */
    private final nc.a f22460b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f22461c;

    /* renamed from: d  reason: collision with root package name */
    private final MiscInterActor f22462d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<RegionEntity> f22463e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<MasterDataMiscModel> f22464f;

    /* renamed from: g  reason: collision with root package name */
    private final MutableStateFlow<f> f22465g;

    /* renamed from: h  reason: collision with root package name */
    private final StateFlow<f> f22466h;

    public GetFeaturedCarouselSectionInteractor(a getFeaturedCarouselListings, nc.a getSwipeableListInteractor, ApplicationResourcesRepository applicationResourcesRepository, MiscInterActor miscInterActor) {
        o.i(getFeaturedCarouselListings, "getFeaturedCarouselListings");
        o.i(getSwipeableListInteractor, "getSwipeableListInteractor");
        o.i(applicationResourcesRepository, "applicationResourcesRepository");
        o.i(miscInterActor, "miscInterActor");
        this.f22459a = getFeaturedCarouselListings;
        this.f22460b = getSwipeableListInteractor;
        this.f22461c = applicationResourcesRepository;
        this.f22462d = miscInterActor;
        this.f22463e = new b0<>(RegionEntity.Companion.createDefaultRegion());
        this.f22464f = new b0<>(MasterDataMiscModel.Companion.createDefaultMasterDataMisc());
        MutableStateFlow<f> MutableStateFlow = StateFlowKt.MutableStateFlow(f.f23805c.a(AllVerticalsSectionType.AUTO_FEATURED_ADS));
        this.f22465g = MutableStateFlow;
        this.f22466h = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ListingItemBrief> i(ListingsResponse.Listings listings) {
        List f11;
        List f12;
        List Q0;
        List<ListingItemBrief> E0;
        f11 = q.f(listings.getPinnedItems());
        f12 = q.f(listings.getNormalItems());
        Q0 = CollectionsKt___CollectionsKt.Q0(f12, 10);
        E0 = CollectionsKt___CollectionsKt.E0(f11, Q0);
        return E0;
    }

    public final Object g(int i11, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = AllVerticalsExtentionsKt.a(this.f22465g, new GetFeaturedCarouselSectionInteractor$fetchAutoFeaturedListings$2(this, i11, null), aVar);
        f11 = b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public final StateFlow<f> h() {
        return this.f22466h;
    }
}

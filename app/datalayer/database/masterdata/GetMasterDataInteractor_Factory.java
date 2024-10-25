package com.forsale.app.datalayer.database.masterdata;

import com.forsale.app.datalayer.repositories.AnalyticsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor;
import dagger.internal.b;
import vz.a;
/* loaded from: classes2.dex */
public final class GetMasterDataInteractor_Factory implements b<GetMasterDataInteractor> {
    private final a<AnalyticsRepository> analyticsRepositoryProvider;
    private final a<MasterDataNewRepository> masterDataNewRepositoryProvider;
    private final a<MasterDataRepository> masterDataOldHandlerProvider;
    private final a<RegionsRepository> regionsRepositoryProvider;
    private final a<SwipingOverlayInteractor> swipingOverlayInteractorProvider;

    public GetMasterDataInteractor_Factory(a<MasterDataNewRepository> aVar, a<MasterDataRepository> aVar2, a<AnalyticsRepository> aVar3, a<RegionsRepository> aVar4, a<SwipingOverlayInteractor> aVar5) {
        this.masterDataNewRepositoryProvider = aVar;
        this.masterDataOldHandlerProvider = aVar2;
        this.analyticsRepositoryProvider = aVar3;
        this.regionsRepositoryProvider = aVar4;
        this.swipingOverlayInteractorProvider = aVar5;
    }

    public static GetMasterDataInteractor_Factory create(a<MasterDataNewRepository> aVar, a<MasterDataRepository> aVar2, a<AnalyticsRepository> aVar3, a<RegionsRepository> aVar4, a<SwipingOverlayInteractor> aVar5) {
        return new GetMasterDataInteractor_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static GetMasterDataInteractor newInstance(MasterDataNewRepository masterDataNewRepository, MasterDataRepository masterDataRepository, AnalyticsRepository analyticsRepository, RegionsRepository regionsRepository, SwipingOverlayInteractor swipingOverlayInteractor) {
        return new GetMasterDataInteractor(masterDataNewRepository, masterDataRepository, analyticsRepository, regionsRepository, swipingOverlayInteractor);
    }

    @Override // vz.a
    public GetMasterDataInteractor get() {
        return newInstance(this.masterDataNewRepositoryProvider.get(), this.masterDataOldHandlerProvider.get(), this.analyticsRepositoryProvider.get(), this.regionsRepositoryProvider.get(), this.swipingOverlayInteractorProvider.get());
    }
}

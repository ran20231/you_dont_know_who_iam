package com.forsale.app.datalayer.database.masterdata;

import com.forsale.app.datalayer.repositories.AnalyticsRepository;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.buyerscreen.interactors.SwipingOverlayInteractor;
import kotlin.jvm.internal.o;
/* compiled from: GetMasterDataInteractor.kt */
/* loaded from: classes2.dex */
public final class GetMasterDataInteractor {
    public static final int $stable = 8;
    private final AnalyticsRepository analyticsRepository;
    private final MasterDataNewRepository masterDataNewRepository;
    private final MasterDataRepository masterDataOldHandler;
    private final RegionsRepository regionsRepository;
    private final SwipingOverlayInteractor swipingOverlayInteractor;

    public GetMasterDataInteractor(MasterDataNewRepository masterDataNewRepository, MasterDataRepository masterDataOldHandler, AnalyticsRepository analyticsRepository, RegionsRepository regionsRepository, SwipingOverlayInteractor swipingOverlayInteractor) {
        o.i(masterDataNewRepository, "masterDataNewRepository");
        o.i(masterDataOldHandler, "masterDataOldHandler");
        o.i(analyticsRepository, "analyticsRepository");
        o.i(regionsRepository, "regionsRepository");
        o.i(swipingOverlayInteractor, "swipingOverlayInteractor");
        this.masterDataNewRepository = masterDataNewRepository;
        this.masterDataOldHandler = masterDataOldHandler;
        this.analyticsRepository = analyticsRepository;
        this.regionsRepository = regionsRepository;
        this.swipingOverlayInteractor = swipingOverlayInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(zz.a<? super wz.p> r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.database.masterdata.GetMasterDataInteractor.invoke(zz.a):java.lang.Object");
    }
}

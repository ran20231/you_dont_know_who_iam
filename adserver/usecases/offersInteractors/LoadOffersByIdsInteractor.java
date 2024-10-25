package com.forsale.adserver.usecases.offersInteractors;

import a9.e;
import com.forsale.adserver.datalayer.bannerdata.REGIONS;
import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.forsale.adserver.utils.SuspendedFunctionExtensionKt;
import com.forsale.adserver.view.models.AdGeneralModel;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: LoadOffersByIdsInteractor.kt */
/* loaded from: classes2.dex */
public final class LoadOffersByIdsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final REGIONS f20788a;

    /* renamed from: b  reason: collision with root package name */
    private final OffersFactory f20789b;

    /* renamed from: c  reason: collision with root package name */
    private final e f20790c;

    public LoadOffersByIdsInteractor(REGIONS region, OffersFactory offersFactory, e offerMapper) {
        o.i(region, "region");
        o.i(offersFactory, "offersFactory");
        o.i(offerMapper, "offerMapper");
        this.f20788a = region;
        this.f20789b = offersFactory;
        this.f20790c = offerMapper;
    }

    public final Object d(List<Integer> list, a<? super List<AdGeneralModel>> aVar) {
        return SuspendedFunctionExtensionKt.b(3, 0L, 0L, Utils.DOUBLE_EPSILON, new LoadOffersByIdsInteractor$invoke$2(this, list, null), aVar, 14, null);
    }
}

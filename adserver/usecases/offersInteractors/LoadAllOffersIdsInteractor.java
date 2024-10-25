package com.forsale.adserver.usecases.offersInteractors;

import com.forsale.adserver.datalayer.offersdata.OffersFactory;
import com.forsale.adserver.utils.SuspendedFunctionExtensionKt;
import com.github.mikephil.charting.utils.Utils;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: LoadAllOffersIdsInteractor.kt */
/* loaded from: classes2.dex */
public final class LoadAllOffersIdsInteractor {

    /* renamed from: a  reason: collision with root package name */
    private final OffersFactory f20766a;

    public LoadAllOffersIdsInteractor(OffersFactory offersFactory) {
        o.i(offersFactory, "offersFactory");
        this.f20766a = offersFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object c(LoadAllOffersIdsInteractor loadAllOffersIdsInteractor, List list, boolean z11, a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = r.n();
        }
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return loadAllOffersIdsInteractor.b(list, z11, aVar);
    }

    public final Object b(List<Integer> list, boolean z11, a<? super List<Integer>> aVar) {
        return SuspendedFunctionExtensionKt.b(3, 0L, 0L, Utils.DOUBLE_EPSILON, new LoadAllOffersIdsInteractor$invoke$2(this, list, z11, null), aVar, 14, null);
    }
}

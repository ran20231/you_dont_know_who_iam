package com.forsale.app.ui.bottomsheets.agents;

import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.repositories.BaseRepository;
import com.forsale.app.datalayer.repositories.LocationDao;
import kotlin.jvm.internal.o;
/* compiled from: AgentLocationsViewModel.kt */
/* loaded from: classes3.dex */
public final class AgentLocationsViewModel extends BaseViewModel {

    /* renamed from: k0  reason: collision with root package name */
    private final LocationDao f37918k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentLocationsViewModel(LocationDao locationDao, BaseRepository baseRepository) {
        super(baseRepository);
        o.i(locationDao, "locationDao");
        o.i(baseRepository, "baseRepository");
        this.f37918k0 = locationDao;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v0(zz.a<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.forsale.app.datalayer.database.LocationEntity>>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel$getAllLocations$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel$getAllLocations$1 r0 = (com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel$getAllLocations$1) r0
            int r1 = r0.f37922d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37922d = r1
            goto L18
        L13:
            com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel$getAllLocations$1 r0 = new com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel$getAllLocations$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f37920b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37922d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f37919a
            com.forsale.app.datalayer.repositories.LocationDao r0 = (com.forsale.app.datalayer.repositories.LocationDao) r0
            kotlin.f.b(r6)
            goto L4c
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.repositories.LocationDao r6 = r5.f37918k0
            com.forsale.app.datalayer.repositories.RegionsRepository r2 = r5.I()
            r0.f37919a = r6
            r0.f37922d = r3
            java.lang.Object r0 = r2.getCurrentRegionId(r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r4 = r0
            r0 = r6
            r6 = r4
        L4c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            kotlinx.coroutines.flow.Flow r6 = r0.getAllLocations(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.agents.AgentLocationsViewModel.v0(zz.a):java.lang.Object");
    }
}

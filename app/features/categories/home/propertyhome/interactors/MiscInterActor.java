package com.forsale.app.features.categories.home.propertyhome.interactors;

import com.forsale.app.datalayer.database.MasterDataMiscModel;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.repositories.MasterDataRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import zz.a;
/* compiled from: MiscInterActor.kt */
/* loaded from: classes2.dex */
public final class MiscInterActor {

    /* renamed from: a  reason: collision with root package name */
    private final RegionsRepository f25019a;

    /* renamed from: b  reason: collision with root package name */
    private final MasterDataRepository f25020b;

    public MiscInterActor(RegionsRepository regionsRepository, MasterDataRepository masterDataRepository) {
        o.i(regionsRepository, "regionsRepository");
        o.i(masterDataRepository, "masterDataRepository");
        this.f25019a = regionsRepository;
        this.f25020b = masterDataRepository;
    }

    private final Object c(a<? super RegionEntity> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MiscInterActor$getCurrentRegion$2(this, null), aVar);
    }

    private final Object e(a<? super MasterDataMiscModel> aVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MiscInterActor$getMiscDataModel$2(this, null), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(zz.a<? super xa.b> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getMiscData$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getMiscData$1 r0 = (com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getMiscData$1) r0
            int r1 = r0.f25026d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25026d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getMiscData$1 r0 = new com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor$getMiscData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f25024b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f25026d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.f25023a
            com.forsale.app.datalayer.database.RegionEntity r0 = (com.forsale.app.datalayer.database.RegionEntity) r0
            kotlin.f.b(r7)
            goto L5f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L38:
            java.lang.Object r2 = r0.f25023a
            com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor r2 = (com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor) r2
            kotlin.f.b(r7)
            goto L4f
        L40:
            kotlin.f.b(r7)
            r0.f25023a = r6
            r0.f25026d = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r2 = r6
        L4f:
            com.forsale.app.datalayer.database.RegionEntity r7 = (com.forsale.app.datalayer.database.RegionEntity) r7
            r0.f25023a = r7
            r0.f25026d = r3
            java.lang.Object r0 = r2.e(r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            com.forsale.app.datalayer.database.MasterDataMiscModel r7 = (com.forsale.app.datalayer.database.MasterDataMiscModel) r7
            xa.b r1 = new xa.b
            r1.<init>(r0, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.propertyhome.interactors.MiscInterActor.d(zz.a):java.lang.Object");
    }
}

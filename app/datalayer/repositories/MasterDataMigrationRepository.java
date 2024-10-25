package com.forsale.app.datalayer.repositories;

import android.content.Context;
import com.forsale.app.datalayer.database.MasterDataDatabase;
import java.io.File;
import kotlin.jvm.internal.o;
/* compiled from: MasterDataMigrationRepository.kt */
/* loaded from: classes2.dex */
public final class MasterDataMigrationRepository {
    public static final int $stable = 8;
    private final Context context;
    private final MasterDataDatabase realMasterDataDatabase;

    public MasterDataMigrationRepository(MasterDataDatabase realMasterDataDatabase, Context context) {
        o.i(realMasterDataDatabase, "realMasterDataDatabase");
        o.i(context, "context");
        this.realMasterDataDatabase = realMasterDataDatabase;
        this.context = context;
    }

    private final void deleteOldDBFile() {
        File file = new File(this.context.getDatabasePath("4sale_new_release_14_x_x.sqlite").getAbsolutePath());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e11) {
                x10.a.c(e11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryRealDatabase(zz.a<? super java.lang.Boolean> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.MasterDataMigrationRepository$queryRealDatabase$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.MasterDataMigrationRepository$queryRealDatabase$1 r0 = (com.forsale.app.datalayer.repositories.MasterDataMigrationRepository$queryRealDatabase$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.MasterDataMigrationRepository$queryRealDatabase$1 r0 = new com.forsale.app.datalayer.repositories.MasterDataMigrationRepository$queryRealDatabase$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.L$0
            com.forsale.app.datalayer.repositories.MasterDataMigrationRepository r0 = (com.forsale.app.datalayer.repositories.MasterDataMigrationRepository) r0
            kotlin.f.b(r6)
            goto L4a
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            kotlin.f.b(r6)
            com.forsale.app.datalayer.database.MasterDataDatabase r6 = r5.realMasterDataDatabase
            com.forsale.app.datalayer.repositories.RegionDao r6 = r6.regionDao()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.getAllRegionsSuspend(r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            java.util.List r6 = (java.util.List) r6
            r1 = r6
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r3
            r2 = 0
            if (r1 == 0) goto L81
            java.lang.Object r1 = r6.get(r2)
            if (r1 == 0) goto L81
            java.lang.Object r6 = r6.get(r2)
            com.forsale.app.datalayer.database.RegionEntity r6 = (com.forsale.app.datalayer.database.RegionEntity) r6
            java.lang.String r6 = r6.getNameEn()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "MasterReal "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            x10.a.b(r6, r1)
            r0.deleteOldDBFile()
            goto L8c
        L81:
            java.lang.String r6 = "MasterReal is not Loaded Successfully"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            x10.a.b(r6, r1)
            r0.deleteOldDBFile()
            r3 = r2
        L8c:
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.a.a(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.MasterDataMigrationRepository.queryRealDatabase(zz.a):java.lang.Object");
    }
}

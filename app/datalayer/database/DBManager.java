package com.forsale.app.datalayer.database;

import android.content.Context;
import com.forsale.app.datalayer.repositories.MasterDataMigrationRepository;
import java.io.ByteArrayInputStream;
import java.io.File;
import kotlin.jvm.internal.o;
import zz.a;
/* compiled from: DBManager.kt */
/* loaded from: classes2.dex */
public final class DBManager {
    public static final int $stable = 8;
    private final Context appContext;
    private final MasterDataMigrationRepository masterDataMigrationRepository;

    public DBManager(Context appContext, MasterDataMigrationRepository masterDataMigrationRepository) {
        o.i(appContext, "appContext");
        o.i(masterDataMigrationRepository, "masterDataMigrationRepository");
        this.appContext = appContext;
        this.masterDataMigrationRepository = masterDataMigrationRepository;
    }

    public final Object saveTempFile(byte[] bArr, a<? super Boolean> aVar) {
        String absolutePath = this.appContext.getDatabasePath("4sale_new_release_14_x_x.sqlite").getAbsolutePath();
        x10.a.b("****************************** sqlite path: " + absolutePath, new Object[0]);
        com.forsale.app.utils.o.a(new File(this.appContext.getDatabasePath("4sale_new_release_14_x_x.sqlite").getAbsolutePath()), new ByteArrayInputStream(bArr));
        return this.masterDataMigrationRepository.queryRealDatabase(aVar);
    }
}

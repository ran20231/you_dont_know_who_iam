package com.forsale.app.datalayer.database.masterdata;

import android.content.Context;
import com.forsale.app.datalayer.database.MasterDataDatabase;
import com.forsale.app.datalayer.repositories.DownloadFileService;
import dagger.internal.b;
import kotlinx.coroutines.CoroutineDispatcher;
import vz.a;
/* loaded from: classes2.dex */
public final class MasterDataFileManager_Factory implements b<MasterDataFileManager> {
    private final a<Context> appContextProvider;
    private final a<DownloadFileService> downloadFileServiceProvider;
    private final a<CoroutineDispatcher> ioDispatcherProvider;
    private final a<MasterDataDatabase> masterDataDBProvider;

    public MasterDataFileManager_Factory(a<DownloadFileService> aVar, a<CoroutineDispatcher> aVar2, a<Context> aVar3, a<MasterDataDatabase> aVar4) {
        this.downloadFileServiceProvider = aVar;
        this.ioDispatcherProvider = aVar2;
        this.appContextProvider = aVar3;
        this.masterDataDBProvider = aVar4;
    }

    public static MasterDataFileManager_Factory create(a<DownloadFileService> aVar, a<CoroutineDispatcher> aVar2, a<Context> aVar3, a<MasterDataDatabase> aVar4) {
        return new MasterDataFileManager_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static MasterDataFileManager newInstance(DownloadFileService downloadFileService, CoroutineDispatcher coroutineDispatcher, Context context, MasterDataDatabase masterDataDatabase) {
        return new MasterDataFileManager(downloadFileService, coroutineDispatcher, context, masterDataDatabase);
    }

    @Override // vz.a
    public MasterDataFileManager get() {
        return newInstance(this.downloadFileServiceProvider.get(), this.ioDispatcherProvider.get(), this.appContextProvider.get(), this.masterDataDBProvider.get());
    }
}

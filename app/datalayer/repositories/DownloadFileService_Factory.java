package com.forsale.app.datalayer.repositories;

import okhttp3.OkHttpClient;
/* loaded from: classes2.dex */
public final class DownloadFileService_Factory implements dagger.internal.b<DownloadFileService> {
    private final vz.a<h10.a> gsonConverterFactoryProvider;
    private final vz.a<OkHttpClient> okHttpClientProvider;

    public DownloadFileService_Factory(vz.a<OkHttpClient> aVar, vz.a<h10.a> aVar2) {
        this.okHttpClientProvider = aVar;
        this.gsonConverterFactoryProvider = aVar2;
    }

    public static DownloadFileService_Factory create(vz.a<OkHttpClient> aVar, vz.a<h10.a> aVar2) {
        return new DownloadFileService_Factory(aVar, aVar2);
    }

    public static DownloadFileService newInstance(OkHttpClient okHttpClient, h10.a aVar) {
        return new DownloadFileService(okHttpClient, aVar);
    }

    @Override // vz.a
    public DownloadFileService get() {
        return newInstance(this.okHttpClientProvider.get(), this.gsonConverterFactoryProvider.get());
    }
}

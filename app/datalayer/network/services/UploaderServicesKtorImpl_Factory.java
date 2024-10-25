package com.forsale.app.datalayer.network.services;

import dagger.internal.b;
import io.ktor.client.HttpClient;
import vz.a;
/* loaded from: classes2.dex */
public final class UploaderServicesKtorImpl_Factory implements b<UploaderServicesKtorImpl> {
    private final a<String> baseUrlProvider;
    private final a<HttpClient> clientProvider;

    public UploaderServicesKtorImpl_Factory(a<HttpClient> aVar, a<String> aVar2) {
        this.clientProvider = aVar;
        this.baseUrlProvider = aVar2;
    }

    public static UploaderServicesKtorImpl_Factory create(a<HttpClient> aVar, a<String> aVar2) {
        return new UploaderServicesKtorImpl_Factory(aVar, aVar2);
    }

    public static UploaderServicesKtorImpl newInstance(HttpClient httpClient, String str) {
        return new UploaderServicesKtorImpl(httpClient, str);
    }

    @Override // vz.a
    public UploaderServicesKtorImpl get() {
        return newInstance(this.clientProvider.get(), this.baseUrlProvider.get());
    }
}

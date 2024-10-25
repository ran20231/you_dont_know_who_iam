package com.forsale.app.datalayer.repositories;

import com.forsale.app.utils.f0;
import java.net.URL;
import kotlin.jvm.internal.o;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.w;
import retrofit2.x;
/* compiled from: DownloadFileService.kt */
/* loaded from: classes2.dex */
public final class DownloadFileService {
    public static final int $stable = 8;
    private final h10.a gsonConverterFactory;
    private final OkHttpClient okHttpClient;

    public DownloadFileService(OkHttpClient okHttpClient, h10.a gsonConverterFactory) {
        o.i(okHttpClient, "okHttpClient");
        o.i(gsonConverterFactory, "gsonConverterFactory");
        this.okHttpClient = okHttpClient;
        this.gsonConverterFactory = gsonConverterFactory;
    }

    public final Object download(String str, zz.a<? super w<ResponseBody>> aVar) {
        return ((com.forsale.app.datalayer.network.services.DownloadFileService) new x.b().c(f0.a(new URL(str))).b(this.gsonConverterFactory).g(this.okHttpClient).e().b(com.forsale.app.datalayer.network.services.DownloadFileService.class)).downloadFile(str, aVar);
    }
}

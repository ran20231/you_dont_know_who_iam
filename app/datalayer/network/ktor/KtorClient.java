package com.forsale.app.datalayer.network.ktor;

import cy.a;
import g00.l;
import io.ktor.client.HttpClient;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.HttpClientKt;
import io.ktor.client.engine.android.AndroidEngineConfig;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: KtorClient.kt */
/* loaded from: classes2.dex */
public final class KtorClient {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: KtorClient.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final HttpClient create() {
            return HttpClientKt.a(a.f53582a, new l<HttpClientConfig<AndroidEngineConfig>, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorClient$Companion$create$1
                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(HttpClientConfig<AndroidEngineConfig> httpClientConfig) {
                    invoke2(httpClientConfig);
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(HttpClientConfig<AndroidEngineConfig> HttpClient) {
                    o.i(HttpClient, "$this$HttpClient");
                    HttpClient.b(new l<AndroidEngineConfig, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorClient$Companion$create$1.1
                        /* renamed from: invoke  reason: avoid collision after fix types in other method */
                        public final void invoke2(AndroidEngineConfig engine) {
                            o.i(engine, "$this$engine");
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(AndroidEngineConfig androidEngineConfig) {
                            invoke2(androidEngineConfig);
                            return p.f75480a;
                        }
                    });
                    KtorConfigKt.installTimeOutFeature(HttpClient);
                    KtorConfigKt.installLoggingFeature(HttpClient);
                    KtorConfigKt.installJsonFeature(HttpClient);
                    KtorConfigKt.setResponseValidator(HttpClient);
                }
            });
        }
    }
}

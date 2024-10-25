package com.forsale.app.datalayer.network.ktor;

import dy.b;
import g00.l;
import io.ktor.client.HttpClientConfig;
import io.ktor.client.features.HttpCallValidator;
import io.ktor.client.features.HttpTimeout;
import io.ktor.client.features.json.JsonFeature;
import io.ktor.client.features.json.serializer.KotlinxSerializer;
import io.ktor.client.features.logging.LogLevel;
import io.ktor.client.features.logging.Logging;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import ky.c;
import wz.p;
import zz.a;
/* compiled from: KtorConfig.kt */
/* loaded from: classes2.dex */
public final class KtorConfigKt {
    public static final void installJsonFeature(HttpClientConfig<?> httpClientConfig) {
        o.i(httpClientConfig, "<this>");
        httpClientConfig.h(JsonFeature.f58763d, new l<JsonFeature.a, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorConfigKt$installJsonFeature$1
            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(JsonFeature.a aVar) {
                invoke2(aVar);
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(JsonFeature.a install) {
                o.i(install, "$this$install");
                install.d(new KotlinxSerializer(JsonKt.Json$default(null, new l<JsonBuilder, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorConfigKt$installJsonFeature$1.1
                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(JsonBuilder jsonBuilder) {
                        invoke2(jsonBuilder);
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2(JsonBuilder Json) {
                        o.i(Json, "$this$Json");
                        Json.setExplicitNulls(false);
                        Json.setLenient(true);
                        Json.setIgnoreUnknownKeys(true);
                        Json.setEncodeDefaults(true);
                    }
                }, 1, null)));
            }
        });
    }

    public static final void installLoggingFeature(HttpClientConfig<?> httpClientConfig) {
        o.i(httpClientConfig, "<this>");
        httpClientConfig.h(Logging.f58787e, new l<Logging.a, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorConfigKt$installLoggingFeature$1
            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Logging.a aVar) {
                invoke2(aVar);
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Logging.a install) {
                o.i(install, "$this$install");
                install.d(LogLevel.NONE);
            }
        });
    }

    public static final void installTimeOutFeature(HttpClientConfig<?> httpClientConfig) {
        o.i(httpClientConfig, "<this>");
        httpClientConfig.h(HttpTimeout.f58733d, new l<HttpTimeout.a, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorConfigKt$installTimeOutFeature$1
            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(HttpTimeout.a aVar) {
                invoke2(aVar);
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(HttpTimeout.a install) {
                o.i(install, "$this$install");
                install.i(10000L);
                install.j(20000L);
                install.k(30000L);
            }
        });
    }

    public static final void setResponseValidator(HttpClientConfig<?> httpClientConfig) {
        o.i(httpClientConfig, "<this>");
        b.a(httpClientConfig, new l<HttpCallValidator.a, p>() { // from class: com.forsale.app.datalayer.network.ktor.KtorConfigKt$setResponseValidator$1

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KtorConfig.kt */
            @d(c = "com.forsale.app.datalayer.network.ktor.KtorConfigKt$setResponseValidator$1$1", f = "KtorConfig.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.datalayer.network.ktor.KtorConfigKt$setResponseValidator$1$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Throwable, a<? super p>, Object> {
                /* synthetic */ Object L$0;
                int label;

                AnonymousClass1(a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final a<p> create(Object obj, a<?> aVar) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(aVar);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.f();
                    if (this.label == 0) {
                        f.b(obj);
                        x10.a.b("UPLOAD_MEDIA::13 Response:: " + ((Throwable) this.L$0), new Object[0]);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // g00.p
                public final Object invoke(Throwable th2, a<? super p> aVar) {
                    return ((AnonymousClass1) create(th2, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: KtorConfig.kt */
            @d(c = "com.forsale.app.datalayer.network.ktor.KtorConfigKt$setResponseValidator$1$2", f = "KtorConfig.kt", l = {}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.datalayer.network.ktor.KtorConfigKt$setResponseValidator$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass2 extends SuspendLambda implements g00.p<c, a<? super p>, Object> {
                /* synthetic */ Object L$0;
                int label;

                AnonymousClass2(a<? super AnonymousClass2> aVar) {
                    super(2, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final a<p> create(Object obj, a<?> aVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(aVar);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    kotlin.coroutines.intrinsics.b.f();
                    if (this.label == 0) {
                        f.b(obj);
                        x10.a.b("UPLOAD_MEDIA::14 Response:: " + ((c) this.L$0), new Object[0]);
                        return p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // g00.p
                public final Object invoke(c cVar, a<? super p> aVar) {
                    return ((AnonymousClass2) create(cVar, aVar)).invokeSuspend(p.f75480a);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(HttpCallValidator.a aVar) {
                invoke2(aVar);
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(HttpCallValidator.a HttpResponseValidator) {
                o.i(HttpResponseValidator, "$this$HttpResponseValidator");
                HttpResponseValidator.d(new AnonymousClass1(null));
                HttpResponseValidator.f(new AnonymousClass2(null));
            }
        });
    }
}

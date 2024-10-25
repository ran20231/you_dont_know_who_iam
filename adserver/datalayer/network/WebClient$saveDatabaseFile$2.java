package com.forsale.adserver.datalayer.network;

import android.content.Context;
import com.forsale.adserver.datalayer.network.WebClient;
import com.forsale.adserver.datalayer.network.interceptors.ConnectivityInterceptor;
import g00.p;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WebClient.kt */
@d(c = "com.forsale.adserver.datalayer.network.WebClient$saveDatabaseFile$2", f = "WebClient.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class WebClient$saveDatabaseFile$2 extends SuspendLambda implements p<CoroutineScope, a<? super Long>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f20739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ WebClient f20740b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ byte[] f20741c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebClient$saveDatabaseFile$2(WebClient webClient, byte[] bArr, a<? super WebClient$saveDatabaseFile$2> aVar) {
        super(2, aVar);
        this.f20740b = webClient;
        this.f20741c = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new WebClient$saveDatabaseFile$2(this.f20740b, this.f20741c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Context context;
        b.f();
        if (this.f20739a == 0) {
            f.b(obj);
            try {
                context = this.f20740b.f20707f;
                File file = new File(context.getDatabasePath("adserver_file.sqlite").getAbsolutePath());
                if (file.exists()) {
                    file.delete();
                }
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.f20741c);
                long b11 = e00.a.b(byteArrayInputStream, bufferedOutputStream, 0, 2, null);
                e00.b.a(byteArrayInputStream, null);
                e00.b.a(bufferedOutputStream, null);
                return kotlin.coroutines.jvm.internal.a.e(b11);
            } catch (Exception e11) {
                if (e11 instanceof ConnectivityInterceptor.ConnectivityException) {
                    throw e11;
                }
                throw new WebClient.AdServerDBException("error while saving new ad server file ", e11);
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super Long> aVar) {
        return ((WebClient$saveDatabaseFile$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

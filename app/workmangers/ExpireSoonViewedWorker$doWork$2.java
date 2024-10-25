package com.forsale.app.workmangers;

import android.app.Application;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.forsale.app.datalayer.network.interceptors.ConnectivityInterceptor;
import com.forsale.app.datalayer.repositories.ExpireSoonRepository;
import com.google.android.gms.maps.model.PinConfig;
import g00.p;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExpireSoonViewedWorker.kt */
@d(c = "com.forsale.app.workmangers.ExpireSoonViewedWorker$doWork$2", f = "ExpireSoonViewedWorker.kt", l = {PinConfig.BITMAP_WIDTH_DP}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ExpireSoonViewedWorker$doWork$2 extends SuspendLambda implements p<CoroutineScope, a<? super ListenableWorker.a>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40588a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ExpireSoonViewedWorker f40589b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpireSoonViewedWorker$doWork$2(ExpireSoonViewedWorker expireSoonViewedWorker, a<? super ExpireSoonViewedWorker$doWork$2> aVar) {
        super(2, aVar);
        this.f40589b = expireSoonViewedWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new ExpireSoonViewedWorker$doWork$2(this.f40589b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        WorkerParameters workerParameters;
        Context context;
        ExpireSoonRepository expireSoonRepository;
        List<Integer> s02;
        f11 = b.f();
        int i11 = this.f40588a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                f.b(obj);
                workerParameters = this.f40589b.f40583e;
                int[] k11 = workerParameters.d().k("viewed_expire_ids_key");
                o.f(k11);
                context = this.f40589b.f40582d;
                if (context instanceof Application) {
                    expireSoonRepository = this.f40589b.f40584f;
                    s02 = ArraysKt___ArraysKt.s0(k11);
                    this.f40588a = 1;
                    if (expireSoonRepository.recordViewedATEListings(s02, this) == f11) {
                        return f11;
                    }
                } else {
                    return ListenableWorker.a.a();
                }
            }
            return ListenableWorker.a.d();
        } catch (Throwable th2) {
            if (th2 instanceof ConnectivityInterceptor.ConnectivityException) {
                return ListenableWorker.a.c();
            }
            return ListenableWorker.a.a();
        }
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super ListenableWorker.a> aVar) {
        return ((ExpireSoonViewedWorker$doWork$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}

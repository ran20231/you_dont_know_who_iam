package com.forsale.app.intializers;

import android.content.Context;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import jj.b;
import kotlin.collections.q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import t9.n;
import wz.p;
/* compiled from: AdServerInitializer.kt */
/* loaded from: classes2.dex */
public final class AdServerInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public b f37495a;

    /* renamed from: b  reason: collision with root package name */
    public CoroutineScope f37496b;

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public a(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
        }
    }

    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> e11;
        e11 = q.e(LanguageInitializer.class);
        return e11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        c(context);
        return p.f75480a;
    }

    public void c(Context context) {
        String str;
        Trace e11 = e.e("appStart_initializer_adServer");
        o.i(context, "context");
        com.forsale.app.intializers.a.f37573b.a(context).g(this);
        Boolean AD_NETWORK_IS_LIVE = n.f69322a;
        o.h(AD_NETWORK_IS_LIVE, "AD_NETWORK_IS_LIVE");
        if (AD_NETWORK_IS_LIVE.booleanValue()) {
            str = "https://appadserver.q8car.com/q8ads/index.php/V4/";
        } else {
            str = "https://staging-appadserver.q8car.com/q8ads_staging/index.php/V4/";
        }
        BuildersKt__Builders_commonKt.launch$default(d(), new a(CoroutineExceptionHandler.Key), null, new AdServerInitializer$create$2(context, this, str, null), 2, null);
        e11.stop();
    }

    public final CoroutineScope d() {
        CoroutineScope coroutineScope = this.f37496b;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o.w("coroutineScope");
        return null;
    }

    public final b e() {
        b bVar = this.f37495a;
        if (bVar != null) {
            return bVar;
        }
        o.w("prefs");
        return null;
    }
}

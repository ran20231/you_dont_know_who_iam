package com.forsale.app.intializers;

import android.content.Context;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: MobileAdsInitializer.kt */
/* loaded from: classes2.dex */
public final class MobileAdsInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public CoroutineScope f37561a;

    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> e11;
        e11 = q.e(DependencyGraphInitializer.class);
        return e11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        c(context);
        return p.f75480a;
    }

    public void c(Context context) {
        List<String> e11;
        Trace e12 = e.e("appStart_initializer_mobileAds");
        o.i(context, "context");
        a.f37573b.a(context).h(this);
        RequestConfiguration.Builder builder = new RequestConfiguration.Builder();
        e11 = q.e("a4c27fae49665999");
        RequestConfiguration build = builder.setTestDeviceIds(e11).build();
        o.h(build, "build(...)");
        MobileAds.setRequestConfiguration(build);
        BuildersKt__Builders_commonKt.launch$default(d(), null, null, new MobileAdsInitializer$create$1(context, null), 3, null);
        e12.stop();
    }

    public final CoroutineScope d() {
        CoroutineScope coroutineScope = this.f37561a;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o.w("defaultCoroutineScope");
        return null;
    }
}

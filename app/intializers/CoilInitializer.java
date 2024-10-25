package com.forsale.app.intializers;

import android.content.Context;
import coil.ImageLoader;
import coil.memory.MemoryCache;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import e00.j;
import j5.a;
import java.io.File;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: CoilInitializer.kt */
/* loaded from: classes2.dex */
public final class CoilInitializer implements o4.a<p> {
    @Override // o4.a
    public List<Class<? extends o4.a<?>>> a() {
        List<Class<? extends o4.a<?>>> n11;
        n11 = r.n();
        return n11;
    }

    @Override // o4.a
    public /* bridge */ /* synthetic */ p b(Context context) {
        c(context);
        return p.f75480a;
    }

    public void c(final Context context) {
        Trace e11 = e.e("appStart_initializer_coil");
        o.i(context, "context");
        Context applicationContext = context.getApplicationContext();
        o.h(applicationContext, "getApplicationContext(...)");
        new ImageLoader.Builder(applicationContext).d(new g00.a<MemoryCache>() { // from class: com.forsale.app.intializers.CoilInitializer$create$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final MemoryCache invoke() {
                Context applicationContext2 = context.getApplicationContext();
                o.h(applicationContext2, "getApplicationContext(...)");
                return new MemoryCache.a(applicationContext2).a();
            }
        }).c(new g00.a<j5.a>() { // from class: com.forsale.app.intializers.CoilInitializer$create$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final j5.a invoke() {
                File i11;
                a.C0684a c0684a = new a.C0684a();
                File cacheDir = context.getApplicationContext().getCacheDir();
                o.h(cacheDir, "getCacheDir(...)");
                i11 = j.i(cacheDir, "image_cache");
                return c0684a.b(i11).a();
            }
        }).b();
        e11.stop();
    }
}

package com.forsale.app.intializers;

import android.content.Context;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: DependencyGraphInitializer.kt */
/* loaded from: classes2.dex */
public final class DependencyGraphInitializer implements o4.a<p> {
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

    public void c(Context context) {
        Trace e11 = e.e("appStart_initializer_dependencyGraph");
        o.i(context, "context");
        a.f37573b.a(context);
        e11.stop();
    }
}

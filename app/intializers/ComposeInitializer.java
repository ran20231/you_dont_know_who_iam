package com.forsale.app.intializers;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ComposeInitializer.kt */
/* loaded from: classes2.dex */
public final class ComposeInitializer implements o4.a<p> {
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
        Trace e11 = e.e("appStart_initializer_compose");
        o.i(context, "context");
        new ComposeView(context, null, 0, 6, null);
        e11.stop();
    }
}

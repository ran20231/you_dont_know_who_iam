package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import g00.l;
import j9.c;
import java.util.List;
import kotlin.collections.r;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: UtilsInitializer.kt */
/* loaded from: classes2.dex */
public final class UtilsInitializer implements o4.a<p> {
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
        Trace e11 = e.e("appStart_initializer_utils");
        o.i(context, "context");
        c.f60468a.b(new l<c.b, p>() { // from class: com.forsale.app.intializers.UtilsInitializer$create$1
            public final void b(c.b it2) {
                boolean z11;
                Context a11;
                o.i(it2, "it");
                if (it2.c().length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && (a11 = it2.a()) != null) {
                    MainContainerActivity.a.e(MainContainerActivity.O, a11, it2.b(), it2.c(), null, 4, null);
                }
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(c.b bVar) {
                b(bVar);
                return p.f75480a;
            }
        });
        e11.stop();
    }
}

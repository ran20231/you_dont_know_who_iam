package com.forsale.app.intializers;

import android.content.Context;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LocaleManager;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import java.util.List;
import jj.b;
import kotlin.collections.q;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import wz.p;
/* compiled from: LanguageInitializer.kt */
/* loaded from: classes2.dex */
public final class LanguageInitializer implements o4.a<p> {

    /* renamed from: a  reason: collision with root package name */
    public b f37557a;

    /* renamed from: b  reason: collision with root package name */
    public CoroutineScope f37558b;

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
        Trace e11 = e.e("appStart_initializer_language");
        o.i(context, "context");
        a.f37573b.a(context).o(this);
        LocaleManager localeManager = LocaleManager.f39597a;
        localeManager.A(d());
        localeManager.y(ContextExtensionsKt.m(context));
        e11.stop();
    }

    public final b d() {
        b bVar = this.f37557a;
        if (bVar != null) {
            return bVar;
        }
        o.w("prefs");
        return null;
    }
}

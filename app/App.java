package com.forsale.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import androidx.work.a;
import com.forsale.app.intializers.MoEngageInitializer;
import com.forsale.app.notifications.NotificationChannels;
import com.google.firebase.perf.metrics.Trace;
import cp.e;
import jj.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import t9.f0;
import t9.g0;
import t9.y0;
/* compiled from: App.kt */
/* loaded from: classes2.dex */
public final class App extends g0 implements a.c {

    /* renamed from: c  reason: collision with root package name */
    public b f21943c;

    /* renamed from: d  reason: collision with root package name */
    public CoroutineScope f21944d;

    private final NotificationChannel d() {
        t9.b.a();
        NotificationChannel a11 = t9.a.a(NotificationChannels.DEFAULT.getId(), getString(y0.T), 3);
        a11.setLockscreenVisibility(1);
        return a11;
    }

    @Override // androidx.work.a.c
    public a a() {
        a a11 = new a.b().b(((f0) dx.a.a(this, f0.class)).j()).a();
        o.h(a11, "build(...)");
        return a11;
    }

    public final CoroutineScope e() {
        CoroutineScope coroutineScope = this.f21944d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        o.w("defaultCoroutineScope");
        return null;
    }

    public final b f() {
        b bVar = this.f21943c;
        if (bVar != null) {
            return bVar;
        }
        o.w("prefs");
        return null;
    }

    @Override // t9.g0, android.app.Application
    public void onCreate() {
        NotificationManager notificationManager;
        Trace e11 = e.e("appStart_onCreate_app");
        super.onCreate();
        androidx.startup.a.e(this).f(MoEngageInitializer.class);
        BuildersKt__BuildersKt.runBlocking$default(null, new App$onCreate$1(this, null), 1, null);
        if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) androidx.core.content.b.getSystemService(this, NotificationManager.class)) != null) {
            notificationManager.createNotificationChannel(d());
        }
        BuildersKt__Builders_commonKt.launch$default(e(), null, null, new App$onCreate$4(this, null), 3, null);
        e11.stop();
    }
}

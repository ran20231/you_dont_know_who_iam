package com.forsale.app.analytics.base;

import com.forsale.app.analytics.base.b;
import com.forsale.app.analytics.base.g;
import com.forsale.app.features.auth.UserStatus;
import com.forsale.app.utils.analytics.UserProperties;
import g00.l;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: UpdateConfigDataInteractor.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final c f22001a;

    public f(c analyticsPropertiesInteractor) {
        o.i(analyticsPropertiesInteractor, "analyticsPropertiesInteractor");
        this.f22001a = analyticsPropertiesInteractor;
    }

    public final void a(u9.a analyticsConfig, l<? super List<? extends Pair<? extends UserProperties, ? extends Object>>, p> defineAppSettings, g00.a<p> loggedInCallBack, g00.a<p> logOutCallBack) {
        o.i(analyticsConfig, "analyticsConfig");
        o.i(defineAppSettings, "defineAppSettings");
        o.i(loggedInCallBack, "loggedInCallBack");
        o.i(logOutCallBack, "logOutCallBack");
        defineAppSettings.invoke(this.f22001a.e(new b.a(analyticsConfig.a())));
        if (analyticsConfig.b().c() == UserStatus.NotLoggedIn) {
            logOutCallBack.invoke();
            return;
        }
        g.b b11 = analyticsConfig.b().b();
        if (b11 != null && b11.e() != null) {
            loggedInCallBack.invoke();
        }
    }
}

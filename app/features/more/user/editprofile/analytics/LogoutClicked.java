package com.forsale.app.features.more.user.editprofile.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import ee.g;
import g00.l;
import kotlin.jvm.internal.o;
import u9.b;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: LogoutClicked.kt */
/* loaded from: classes2.dex */
public final class LogoutClicked implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f33124a = g.f54811a;

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.more.user.editprofile.analytics.LogoutClicked$createParams$2
            public final void b(AnalyticsParameters invoke) {
                o.i(invoke, "$this$invoke");
                AnalyticsParameters.d(invoke, null, null, 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    public b getKey() {
        return this.f33124a;
    }
}

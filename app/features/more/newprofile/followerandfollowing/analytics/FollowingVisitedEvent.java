package com.forsale.app.features.more.newprofile.followerandfollowing.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wd.d;
import wz.p;
import zz.a;
/* compiled from: FollowingVisitedEvent.kt */
/* loaded from: classes2.dex */
public final class FollowingVisitedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f32265a = d.f75205a;

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.analytics.FollowingVisitedEvent$createParams$2
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
    /* renamed from: b */
    public d getKey() {
        return this.f32265a;
    }
}

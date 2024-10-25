package com.forsale.app.features.welcome.loading.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import u9.b;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: AppStatusVisitedEvent.kt */
/* loaded from: classes2.dex */
public final class AppStatusVisitedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final SessionEntity.AppStatus f37373a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Pair<String, String>> f37374b;

    /* renamed from: c  reason: collision with root package name */
    private final b f37375c;

    public AppStatusVisitedEvent(SessionEntity.AppStatus appStatus, List<Pair<String, String>> regionParameters) {
        b bVar;
        o.i(appStatus, "appStatus");
        o.i(regionParameters, "regionParameters");
        this.f37373a = appStatus;
        this.f37374b = regionParameters;
        if (appStatus == SessionEntity.AppStatus.IN_MAINTENANCE) {
            bVar = p001if.c.f58206a;
        } else {
            bVar = p001if.b.f58205a;
        }
        this.f37375c = bVar;
    }

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.welcome.loading.analytics.AppStatusVisitedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                List list;
                int y11;
                o.i(invoke, "$this$invoke");
                list = AppStatusVisitedEvent.this.f37374b;
                List<Pair> list2 = list;
                y11 = s.y(list2, 10);
                ArrayList arrayList = new ArrayList(y11);
                for (Pair pair : list2) {
                    invoke.c((String) pair.c(), pair.d());
                    arrayList.add(p.f75480a);
                }
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
        return this.f37375c;
    }
}

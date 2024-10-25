package com.forsale.app.features.more.user.editprofile.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import g00.l;
import kotlin.jvm.internal.o;
import u9.c;
import wz.p;
import zz.a;
/* compiled from: EditProfileClicked.kt */
/* loaded from: classes2.dex */
public final class EditProfileClickedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final ee.c f33117a = ee.c.f54804a;

    @Override // u9.c
    public Object a(a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.more.user.editprofile.analytics.EditProfileClickedEvent$createParams$2
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
    public ee.c getKey() {
        return this.f33117a;
    }
}

package com.forsale.app.features.more.newprofile.followerandfollowing.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import g00.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.o;
import u9.c;
import wd.a;
import wz.p;
/* compiled from: AllowFollowToggledEvent.kt */
/* loaded from: classes2.dex */
public final class AllowFollowToggledEventEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f32260a = a.f75202a;

    /* renamed from: b  reason: collision with root package name */
    private final String f32261b;

    public AllowFollowToggledEventEvent(boolean z11) {
        String str;
        if (z11) {
            str = "On";
        } else if (!z11) {
            str = "Off";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.f32261b = str;
    }

    @Override // u9.c
    public Object a(zz.a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.more.newprofile.followerandfollowing.analytics.AllowFollowToggledEventEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                String str;
                o.i(invoke, "$this$invoke");
                str = AllowFollowToggledEventEvent.this.f32261b;
                invoke.c("value", str);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(AnalyticsParameters analyticsParameters) {
                b(analyticsParameters);
                return p.f75480a;
            }
        });
    }

    @Override // u9.c
    /* renamed from: c */
    public a getKey() {
        return this.f32260a;
    }
}

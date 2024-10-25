package com.forsale.app.analytics.base.kits;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.analytics.base.b;
import com.forsale.app.analytics.base.c;
import com.forsale.app.analytics.base.d;
import com.forsale.app.analytics.base.f;
import com.forsale.app.analytics.base.g;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.analytics.LeanPlumLogger;
import com.forsale.app.utils.analytics.UserProperties;
import com.forsale.app.utils.analytics.k;
import g00.l;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import u9.a;
import wz.p;
/* compiled from: LeanPlumKit.kt */
/* loaded from: classes2.dex */
public final class LeanPlumKit {

    /* renamed from: a  reason: collision with root package name */
    private final LeanPlumLogger f22031a;

    /* renamed from: b  reason: collision with root package name */
    private final c f22032b;

    /* renamed from: c  reason: collision with root package name */
    private final f f22033c;

    /* renamed from: d  reason: collision with root package name */
    private final AnalyticKitTypes f22034d;

    public LeanPlumKit(LeanPlumLogger leanPlumLogger, c analyticsPropertiesInteractor, f updateConfigDataInteractor) {
        o.i(leanPlumLogger, "leanPlumLogger");
        o.i(analyticsPropertiesInteractor, "analyticsPropertiesInteractor");
        o.i(updateConfigDataInteractor, "updateConfigDataInteractor");
        this.f22031a = leanPlumLogger;
        this.f22032b = analyticsPropertiesInteractor;
        this.f22033c = updateConfigDataInteractor;
        this.f22034d = AnalyticKitTypes.LEANPLUM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List<? extends Pair<? extends UserProperties, ? extends Object>> list) {
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            this.f22031a.j(list);
        }
    }

    public void b(a analyticsConfig) {
        Languages languages;
        o.i(analyticsConfig, "analyticsConfig");
        c(this.f22032b.e(new b.d(analyticsConfig.b().b())));
        c(this.f22032b.e(new b.C0247b(analyticsConfig.b().a())));
        c(this.f22032b.e(new b.f(analyticsConfig.b().c())));
        c cVar = this.f22032b;
        g.b b11 = analyticsConfig.b().b();
        if (b11 != null) {
            languages = b11.c();
        } else {
            languages = null;
        }
        c(cVar.e(new b.c(languages)));
    }

    public AnalyticKitTypes d() {
        return this.f22034d;
    }

    public void e(u9.b event, AnalyticsParameters paramsBuilder) {
        o.i(event, "event");
        o.i(paramsBuilder, "paramsBuilder");
        LeanPlumLogger.h(this.f22031a, event.getName(), k.f40026a.c(paramsBuilder.b(d())), null, 4, null);
    }

    public void f() {
        this.f22031a.p();
    }

    public void g(Integer num) {
        if (num != null) {
            num.intValue();
            this.f22031a.r(num.toString());
            this.f22031a.k();
        }
    }

    public void h(final a analyticsConfig) {
        o.i(analyticsConfig, "analyticsConfig");
        this.f22033c.a(analyticsConfig, new l<List<? extends Pair<? extends UserProperties, ? extends Object>>, p>() { // from class: com.forsale.app.analytics.base.kits.LeanPlumKit$updateConfigData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<? extends Pair<? extends UserProperties, ? extends Object>> appSettingsKeys) {
                o.i(appSettingsKeys, "appSettingsKeys");
                LeanPlumKit.this.c(appSettingsKeys);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends Pair<? extends UserProperties, ? extends Object>> list) {
                b(list);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.analytics.base.kits.LeanPlumKit$updateConfigData$2
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LeanPlumKit leanPlumKit = LeanPlumKit.this;
                g.b b11 = analyticsConfig.b().b();
                leanPlumKit.g(b11 != null ? b11.e() : null);
                LeanPlumKit.this.b(analyticsConfig);
            }
        }, new g00.a<p>() { // from class: com.forsale.app.analytics.base.kits.LeanPlumKit$updateConfigData$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            public /* bridge */ /* synthetic */ p invoke() {
                invoke2();
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                LeanPlumKit.this.f();
            }
        });
    }

    public void i(d.c regionInfo) {
        o.i(regionInfo, "regionInfo");
        c(this.f22032b.e(new b.e(regionInfo)));
    }

    public void j(Languages language) {
        o.i(language, "language");
        c(this.f22032b.e(new b.c(language)));
    }
}

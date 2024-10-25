package com.forsale.app.features.more.user.profile;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLogger;
import com.forsale.app.utils.analytics.AggregatedAllAnalyticsLoggerKt;
import com.forsale.app.utils.analytics.LanguageAWS;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.collections.j0;
/* compiled from: ProfileAnalyticsInteractor.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final AggregatedAllAnalyticsLogger f33695a;

    public f(AggregatedAllAnalyticsLogger analyticsLogger) {
        kotlin.jvm.internal.o.i(analyticsLogger, "analyticsLogger");
        this.f33695a = analyticsLogger;
    }

    private final Map<String, String> a() {
        Map<String, String> f11;
        f11 = i0.f(wz.i.a("Source", "Profile"));
        return f11;
    }

    public final void b() {
        Map h11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f33695a;
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, "Agents Clicked", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final void c() {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, a());
        AggregatedAllAnalyticsLogger.h(this.f33695a, "Authentication clicked", o11, null, null, null, true, true, false, false, 412, null);
    }

    public final void d() {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, a());
        AggregatedAllAnalyticsLogger.h(this.f33695a, "Buy More Tokens Clicked", o11, null, null, null, true, true, false, false, 412, null);
    }

    public final void e(yi.a changeLanguageClickedEvent) {
        Map h11;
        Map n11;
        Map f11;
        Map o11;
        Map f12;
        Map o12;
        kotlin.jvm.internal.o.i(changeLanguageClickedEvent, "changeLanguageClickedEvent");
        h11 = j0.h();
        n11 = j0.n(h11, this.f33695a.Z());
        LanguageAWS.a aVar = LanguageAWS.Companion;
        f11 = i0.f(wz.i.a("OldLanguage", aVar.a(changeLanguageClickedEvent.b()).getValue()));
        o11 = j0.o(n11, f11);
        f12 = i0.f(wz.i.a("NewLanguage", aVar.a(changeLanguageClickedEvent.a()).getValue()));
        o12 = j0.o(o11, f12);
        AggregatedAllAnalyticsLogger.h(this.f33695a, "Change Language Clicked", o12, null, null, null, true, true, false, false, 412, null);
    }

    public final void f() {
        Map h11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f33695a;
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, "My Payments Visited", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final void g() {
        Map h11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f33695a;
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, "Profile Visited", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final void h() {
        Map h11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f33695a;
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, "QR Code Clicked", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final void i(yi.b socialLinkClickedEvent) {
        Map h11;
        Map f11;
        Map o11;
        kotlin.jvm.internal.o.i(socialLinkClickedEvent, "socialLinkClickedEvent");
        h11 = j0.h();
        f11 = i0.f(wz.i.a("LinkType", socialLinkClickedEvent.a().getValue()));
        o11 = j0.o(h11, f11);
        AggregatedAllAnalyticsLogger.h(this.f33695a, "SocialLinkClicked", o11, null, null, null, true, true, false, false, 412, null);
    }

    public final void j() {
        Map h11;
        Map n11;
        Map o11;
        h11 = j0.h();
        n11 = j0.n(h11, this.f33695a.Z());
        o11 = j0.o(n11, a());
        AggregatedAllAnalyticsLogger.h(this.f33695a, "Support Visited", o11, null, null, null, true, true, false, false, 412, null);
    }

    public final void k() {
        Map h11;
        AggregatedAllAnalyticsLogger aggregatedAllAnalyticsLogger = this.f33695a;
        h11 = j0.h();
        AggregatedAllAnalyticsLogger.h(aggregatedAllAnalyticsLogger, "Wanted Items Visited", h11, null, null, null, true, true, false, false, 412, null);
    }

    public final Object l(Languages languages, Languages languages2, zz.a<? super wz.p> aVar) {
        Object f11;
        Object Z = AggregatedAllAnalyticsLoggerKt.Z(this.f33695a, languages, languages2, true, true, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (Z == f11) {
            return Z;
        }
        return wz.p.f75480a;
    }
}

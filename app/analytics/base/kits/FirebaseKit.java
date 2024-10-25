package com.forsale.app.analytics.base.kits;

import android.os.Bundle;
import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.analytics.base.b;
import com.forsale.app.analytics.base.c;
import com.forsale.app.analytics.base.d;
import com.forsale.app.analytics.base.f;
import com.forsale.app.analytics.base.g;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.analytics.FirebaseEventsLogger;
import com.forsale.app.utils.analytics.UserProperties;
import g00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
import kotlin.text.u;
import u9.a;
import wz.p;
/* compiled from: FirebaseKit.kt */
/* loaded from: classes2.dex */
public final class FirebaseKit {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseEventsLogger f22022a;

    /* renamed from: b  reason: collision with root package name */
    private final f f22023b;

    /* renamed from: c  reason: collision with root package name */
    private final c f22024c;

    /* renamed from: d  reason: collision with root package name */
    private final AnalyticKitTypes f22025d;

    public FirebaseKit(FirebaseEventsLogger firebaseEventsLogger, f updateConfigDataInteractor, c analyticsPropertiesInteractor) {
        o.i(firebaseEventsLogger, "firebaseEventsLogger");
        o.i(updateConfigDataInteractor, "updateConfigDataInteractor");
        o.i(analyticsPropertiesInteractor, "analyticsPropertiesInteractor");
        this.f22022a = firebaseEventsLogger;
        this.f22023b = updateConfigDataInteractor;
        this.f22024c = analyticsPropertiesInteractor;
        this.f22025d = AnalyticKitTypes.FIREBASE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(List<? extends Pair<? extends UserProperties, ? extends Object>> list) {
        List<? extends Pair<? extends UserProperties, ? extends Object>> list2;
        int y11;
        if (!list.isEmpty()) {
            list2 = list;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            List<? extends Pair<? extends UserProperties, ? extends Object>> list3 = list;
            y11 = s.y(list3, 10);
            ArrayList arrayList = new ArrayList(y11);
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                arrayList.add(new Pair(((UserProperties) pair.c()).getValue(), pair.d().toString()));
            }
            this.f22022a.x(arrayList);
        }
    }

    private final Bundle d(Map<String, ? extends Object> map) {
        String t02;
        String j12;
        String j13;
        Bundle bundle = new Bundle();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Integer) {
                bundle.putInt(key, ((Number) value).intValue());
            } else if (value instanceof Long) {
                bundle.putLong(key, ((Number) value).longValue());
            } else if (value instanceof Double) {
                bundle.putDouble(key, ((Number) value).doubleValue());
            } else if (value instanceof List) {
                t02 = CollectionsKt___CollectionsKt.t0((Iterable) value, ",", null, null, 0, null, new l<Object, CharSequence>() { // from class: com.forsale.app.analytics.base.kits.FirebaseKit$formatEventParameterToMatchFirebaseRules$1
                    @Override // g00.l
                    /* renamed from: b */
                    public final CharSequence invoke(Object obj) {
                        return String.valueOf(obj);
                    }
                }, 30, null);
                j12 = u.j1(wi.f.a(t02), 100);
                bundle.putString(key, j12);
            } else {
                j13 = u.j1(wi.f.a(value.toString()), 100);
                bundle.putString(key, j13);
            }
        }
        return bundle;
    }

    public void b(a analyticsConfig) {
        Languages languages;
        o.i(analyticsConfig, "analyticsConfig");
        c(this.f22024c.e(new b.d(analyticsConfig.b().b())));
        c(this.f22024c.e(new b.C0247b(analyticsConfig.b().a())));
        c(this.f22024c.e(new b.f(analyticsConfig.b().c())));
        c cVar = this.f22024c;
        g.b b11 = analyticsConfig.b().b();
        if (b11 != null) {
            languages = b11.c();
        } else {
            languages = null;
        }
        c(cVar.e(new b.c(languages)));
    }

    public AnalyticKitTypes e() {
        return this.f22025d;
    }

    public void f(u9.b event, AnalyticsParameters paramsBuilder) {
        o.i(event, "event");
        o.i(paramsBuilder, "paramsBuilder");
        this.f22022a.k(wi.f.a(event.getName()), d(paramsBuilder.b(e())));
    }

    public void g() {
        this.f22022a.w("");
    }

    public void h(Integer num) {
        if (num != null) {
            num.intValue();
            this.f22022a.w(num.toString());
        }
    }

    public void i(final a analyticsConfig) {
        o.i(analyticsConfig, "analyticsConfig");
        this.f22023b.a(analyticsConfig, new l<List<? extends Pair<? extends UserProperties, ? extends Object>>, p>() { // from class: com.forsale.app.analytics.base.kits.FirebaseKit$updateConfigData$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(List<? extends Pair<? extends UserProperties, ? extends Object>> appSettingsKeys) {
                o.i(appSettingsKeys, "appSettingsKeys");
                FirebaseKit.this.c(appSettingsKeys);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends Pair<? extends UserProperties, ? extends Object>> list) {
                b(list);
                return p.f75480a;
            }
        }, new g00.a<p>() { // from class: com.forsale.app.analytics.base.kits.FirebaseKit$updateConfigData$1$2
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
                FirebaseKit firebaseKit = FirebaseKit.this;
                g.b b11 = analyticsConfig.b().b();
                firebaseKit.h(b11 != null ? b11.e() : null);
                FirebaseKit.this.b(analyticsConfig);
            }
        }, new g00.a<p>() { // from class: com.forsale.app.analytics.base.kits.FirebaseKit$updateConfigData$1$3
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
                FirebaseKit.this.g();
            }
        });
    }

    public void j(d.c regionInfo) {
        o.i(regionInfo, "regionInfo");
        c(this.f22024c.e(new b.e(regionInfo)));
    }

    public void k(Languages language) {
        o.i(language, "language");
        c(this.f22024c.e(new b.c(language)));
    }
}

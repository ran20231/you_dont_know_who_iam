package com.forsale.app.features.categories.home.analytics;

import com.forsale.app.analytics.base.AnalyticsParameters;
import com.forsale.app.utils.analytics.i;
import com.forsale.app.utils.analytics.j;
import g00.l;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import qa.a;
import u9.c;
import wz.p;
/* compiled from: CategoryVisitedEvent.kt */
/* loaded from: classes2.dex */
public final class CategoryVisitedEvent implements c {

    /* renamed from: a  reason: collision with root package name */
    private final i f23820a;

    /* renamed from: b  reason: collision with root package name */
    private final String f23821b;

    /* renamed from: c  reason: collision with root package name */
    private final String f23822c;

    /* renamed from: d  reason: collision with root package name */
    private final a f23823d;

    public CategoryVisitedEvent(i commonListingModel, String source, String str) {
        o.i(commonListingModel, "commonListingModel");
        o.i(source, "source");
        this.f23820a = commonListingModel;
        this.f23821b = source;
        this.f23822c = str;
        this.f23823d = a.f66425a;
    }

    @Override // u9.c
    public Object a(zz.a<? super AnalyticsParameters> aVar) {
        return AnalyticsParameters.f21956b.invoke(new l<AnalyticsParameters, p>() { // from class: com.forsale.app.features.categories.home.analytics.CategoryVisitedEvent$createParams$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(AnalyticsParameters invoke) {
                i iVar;
                i iVar2;
                i iVar3;
                String str;
                boolean z11;
                String str2;
                String str3;
                String str4;
                o.i(invoke, "$this$invoke");
                iVar = CategoryVisitedEvent.this.f23820a;
                j.b(invoke, iVar);
                iVar2 = CategoryVisitedEvent.this.f23820a;
                for (Pair pair : j.e(invoke, iVar2.a(), null, null, 6, null)) {
                    invoke.c((String) pair.c(), pair.d());
                }
                iVar3 = CategoryVisitedEvent.this.f23820a;
                Iterator<T> it2 = j.f(invoke, iVar3.d(), "DistrictsLevel").iterator();
                while (it2.hasNext()) {
                    Pair pair2 = (Pair) it2.next();
                    invoke.c((String) pair2.c(), pair2.d());
                }
                str = CategoryVisitedEvent.this.f23821b;
                if (str.length() > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    str4 = CategoryVisitedEvent.this.f23821b;
                    invoke.c("Source", str4);
                }
                str2 = CategoryVisitedEvent.this.f23822c;
                if (str2 != null) {
                    str3 = CategoryVisitedEvent.this.f23822c;
                    invoke.c("SourceSectionName", str3);
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
    /* renamed from: e */
    public a getKey() {
        return this.f23823d;
    }
}

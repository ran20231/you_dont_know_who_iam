package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.TrendEntity;
import com.forsale.app.datalayer.repositories.TrendsRepository;
import java.util.List;
import kotlinx.coroutines.flow.Flow;
/* compiled from: TrendingInterActor.kt */
/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final TrendsRepository f37007a;

    public h0(TrendsRepository trendsRepository) {
        kotlin.jvm.internal.o.i(trendsRepository, "trendsRepository");
        this.f37007a = trendsRepository;
    }

    public final Object a(zz.a<? super wz.p> aVar) {
        Object f11;
        Object trends = this.f37007a.getTrends(aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (trends == f11) {
            return trends;
        }
        return wz.p.f75480a;
    }

    public final Flow<List<TrendEntity>> b() {
        return this.f37007a.getTrendsSectionWithTitle();
    }
}

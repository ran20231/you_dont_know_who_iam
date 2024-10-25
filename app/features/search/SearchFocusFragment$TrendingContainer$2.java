package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.TrendEntity;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: SearchFocusFragment.kt */
/* loaded from: classes2.dex */
/* synthetic */ class SearchFocusFragment$TrendingContainer$2 extends FunctionReferenceImpl implements g00.l<TrendEntity, wz.p> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchFocusFragment$TrendingContainer$2(Object obj) {
        super(1, obj, SearchFocusViewModel.class, "onTrendsItemClickedEvent", "onTrendsItemClickedEvent(Lcom/forsale/app/datalayer/database/TrendEntity;)V", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ wz.p invoke(TrendEntity trendEntity) {
        m(trendEntity);
        return wz.p.f75480a;
    }

    public final void m(TrendEntity p02) {
        kotlin.jvm.internal.o.i(p02, "p0");
        ((SearchFocusViewModel) this.receiver).w1(p02);
    }
}

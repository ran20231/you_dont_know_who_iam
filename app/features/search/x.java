package com.forsale.app.features.search;

import com.forsale.app.datalayer.database.TrendEntity;
/* compiled from: SearchEvent.kt */
/* loaded from: classes2.dex */
public final class x implements y {

    /* renamed from: a  reason: collision with root package name */
    private final TrendEntity f37025a;

    public x(TrendEntity item) {
        kotlin.jvm.internal.o.i(item, "item");
        this.f37025a = item;
    }

    public final TrendEntity a() {
        return this.f37025a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x) && kotlin.jvm.internal.o.d(this.f37025a, ((x) obj).f37025a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37025a.hashCode();
    }

    public String toString() {
        TrendEntity trendEntity = this.f37025a;
        return "OnTrendsItemClicked(item=" + trendEntity + ")";
    }
}

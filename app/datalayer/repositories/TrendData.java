package com.forsale.app.datalayer.repositories;

import com.forsale.app.datalayer.network.responses.TrendsResponseBody;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TrendData.kt */
/* loaded from: classes2.dex */
public final class TrendData {
    public static final int $stable = 8;
    private TrendStatus status;
    private final TrendsResponseBody trendsResponseBody;

    public TrendData() {
        this(null, null, 3, null);
    }

    public final TrendStatus getStatus() {
        return this.status;
    }

    public final TrendsResponseBody getTrendsResponseBody() {
        return this.trendsResponseBody;
    }

    public final void setStatus(TrendStatus trendStatus) {
        this.status = trendStatus;
    }

    public TrendData(TrendsResponseBody trendsResponseBody, TrendStatus trendStatus) {
        this.trendsResponseBody = trendsResponseBody;
        this.status = trendStatus;
    }

    public /* synthetic */ TrendData(TrendsResponseBody trendsResponseBody, TrendStatus trendStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : trendsResponseBody, (i11 & 2) != 0 ? TrendStatus.ALL_DATA_EMPTY : trendStatus);
    }
}

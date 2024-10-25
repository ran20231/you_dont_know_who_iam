package com.forsale.app.datalayer.network.entities;

import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: Range.kt */
/* loaded from: classes2.dex */
public final class Range {
    public static final int $stable = 0;
    private final Integer from;

    /* renamed from: to  reason: collision with root package name */
    private final Integer f22334to;

    public Range() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Range copy$default(Range range, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = range.from;
        }
        if ((i11 & 2) != 0) {
            num2 = range.f22334to;
        }
        return range.copy(num, num2);
    }

    public final Integer component1() {
        return this.from;
    }

    public final Integer component2() {
        return this.f22334to;
    }

    public final Range copy(Integer num, Integer num2) {
        return new Range(num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (o.d(this.from, range.from) && o.d(this.f22334to, range.f22334to)) {
            return true;
        }
        return false;
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final Integer getTo() {
        return this.f22334to;
    }

    public int hashCode() {
        int hashCode;
        Integer num = this.from;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        Integer num2 = this.f22334to;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isEmpty() {
        if (this.from == null && this.f22334to == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        Integer num = this.from;
        Integer num2 = this.f22334to;
        return "Range(from=" + num + ", to=" + num2 + ")";
    }

    public Range(Integer num, Integer num2) {
        this.from = num;
        this.f22334to = num2;
    }

    public /* synthetic */ Range(Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : num, (i11 & 2) != 0 ? Integer.valueOf((int) Api.BaseClientBuilder.API_PRIORITY_OTHER) : num2);
    }
}

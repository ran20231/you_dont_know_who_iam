package com.forsale.app.datalayer.network.requestsbodies;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AdDurationBody.kt */
/* loaded from: classes2.dex */
public final class AdDurationBody {
    public static final int $stable = 8;
    @c("category_id")
    private final int categoryId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c("plan_id")
    private final int planId;

    public AdDurationBody(int i11, List<Integer> list, int i12) {
        this.categoryId = i11;
        this.districtsIds = list;
        this.planId = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdDurationBody copy$default(AdDurationBody adDurationBody, int i11, List list, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = adDurationBody.categoryId;
        }
        if ((i13 & 2) != 0) {
            list = adDurationBody.districtsIds;
        }
        if ((i13 & 4) != 0) {
            i12 = adDurationBody.planId;
        }
        return adDurationBody.copy(i11, list, i12);
    }

    public final int component1() {
        return this.categoryId;
    }

    public final List<Integer> component2() {
        return this.districtsIds;
    }

    public final int component3() {
        return this.planId;
    }

    public final AdDurationBody copy(int i11, List<Integer> list, int i12) {
        return new AdDurationBody(i11, list, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdDurationBody)) {
            return false;
        }
        AdDurationBody adDurationBody = (AdDurationBody) obj;
        if (this.categoryId == adDurationBody.categoryId && o.d(this.districtsIds, adDurationBody.districtsIds) && this.planId == adDurationBody.planId) {
            return true;
        }
        return false;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final int getPlanId() {
        return this.planId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.categoryId) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + Integer.hashCode(this.planId);
    }

    public String toString() {
        int i11 = this.categoryId;
        List<Integer> list = this.districtsIds;
        int i12 = this.planId;
        return "AdDurationBody(categoryId=" + i11 + ", districtsIds=" + list + ", planId=" + i12 + ")";
    }

    public /* synthetic */ AdDurationBody(int i11, List list, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? null : list, (i13 & 4) != 0 ? 0 : i12);
    }
}

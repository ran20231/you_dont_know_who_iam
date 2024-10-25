package com.forsale.app.datalayer.network.requestsbodies;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: CheckFreeAdsAllowanceRequestBody.kt */
/* loaded from: classes2.dex */
public final class CheckFreeAdsAllowanceRequestBody {
    public static final int $stable = 8;
    @c("category_id")
    private final int categoryId;
    @c("districts_ids")
    private final List<Integer> districtsIds;

    public CheckFreeAdsAllowanceRequestBody(int i11, List<Integer> list) {
        this.categoryId = i11;
        this.districtsIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheckFreeAdsAllowanceRequestBody copy$default(CheckFreeAdsAllowanceRequestBody checkFreeAdsAllowanceRequestBody, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = checkFreeAdsAllowanceRequestBody.categoryId;
        }
        if ((i12 & 2) != 0) {
            list = checkFreeAdsAllowanceRequestBody.districtsIds;
        }
        return checkFreeAdsAllowanceRequestBody.copy(i11, list);
    }

    public final int component1() {
        return this.categoryId;
    }

    public final List<Integer> component2() {
        return this.districtsIds;
    }

    public final CheckFreeAdsAllowanceRequestBody copy(int i11, List<Integer> list) {
        return new CheckFreeAdsAllowanceRequestBody(i11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckFreeAdsAllowanceRequestBody)) {
            return false;
        }
        CheckFreeAdsAllowanceRequestBody checkFreeAdsAllowanceRequestBody = (CheckFreeAdsAllowanceRequestBody) obj;
        if (this.categoryId == checkFreeAdsAllowanceRequestBody.categoryId && o.d(this.districtsIds, checkFreeAdsAllowanceRequestBody.districtsIds)) {
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

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.categoryId) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        int i11 = this.categoryId;
        List<Integer> list = this.districtsIds;
        return "CheckFreeAdsAllowanceRequestBody(categoryId=" + i11 + ", districtsIds=" + list + ")";
    }

    public /* synthetic */ CheckFreeAdsAllowanceRequestBody(int i11, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : list);
    }
}

package com.forsale.app.datalayer.network.requestsbodies;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddItemSubscriptionBody.kt */
/* loaded from: classes2.dex */
public final class AddItemSubscriptionBody {
    public static final int $stable = 8;
    @c("category_id")
    private final Integer categoryId;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("districts_ids")
    private final List<Integer> districtsIds;
    @c("subscription_txt")
    private final String subscriptionTxt;

    public AddItemSubscriptionBody(String deviceId, Integer num, List<Integer> list, String str) {
        o.i(deviceId, "deviceId");
        this.deviceId = deviceId;
        this.categoryId = num;
        this.districtsIds = list;
        this.subscriptionTxt = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddItemSubscriptionBody copy$default(AddItemSubscriptionBody addItemSubscriptionBody, String str, Integer num, List list, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addItemSubscriptionBody.deviceId;
        }
        if ((i11 & 2) != 0) {
            num = addItemSubscriptionBody.categoryId;
        }
        if ((i11 & 4) != 0) {
            list = addItemSubscriptionBody.districtsIds;
        }
        if ((i11 & 8) != 0) {
            str2 = addItemSubscriptionBody.subscriptionTxt;
        }
        return addItemSubscriptionBody.copy(str, num, list, str2);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final Integer component2() {
        return this.categoryId;
    }

    public final List<Integer> component3() {
        return this.districtsIds;
    }

    public final String component4() {
        return this.subscriptionTxt;
    }

    public final AddItemSubscriptionBody copy(String deviceId, Integer num, List<Integer> list, String str) {
        o.i(deviceId, "deviceId");
        return new AddItemSubscriptionBody(deviceId, num, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddItemSubscriptionBody)) {
            return false;
        }
        AddItemSubscriptionBody addItemSubscriptionBody = (AddItemSubscriptionBody) obj;
        if (o.d(this.deviceId, addItemSubscriptionBody.deviceId) && o.d(this.categoryId, addItemSubscriptionBody.categoryId) && o.d(this.districtsIds, addItemSubscriptionBody.districtsIds) && o.d(this.subscriptionTxt, addItemSubscriptionBody.subscriptionTxt)) {
            return true;
        }
        return false;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final List<Integer> getDistrictsIds() {
        return this.districtsIds;
    }

    public final String getSubscriptionTxt() {
        return this.subscriptionTxt;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.deviceId.hashCode() * 31;
        Integer num = this.categoryId;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (hashCode3 + hashCode) * 31;
        List<Integer> list = this.districtsIds;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.subscriptionTxt;
        if (str != null) {
            i11 = str.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        String str = this.deviceId;
        Integer num = this.categoryId;
        List<Integer> list = this.districtsIds;
        String str2 = this.subscriptionTxt;
        return "AddItemSubscriptionBody(deviceId=" + str + ", categoryId=" + num + ", districtsIds=" + list + ", subscriptionTxt=" + str2 + ")";
    }

    public /* synthetic */ AddItemSubscriptionBody(String str, Integer num, List list, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, num, (i11 & 4) != 0 ? null : list, str2);
    }
}

package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddAdditionalContactsBody.kt */
/* loaded from: classes2.dex */
public final class AddAdditionalContactsBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("contact_no")
    private final String contactNo;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("region_id")
    private final int regionId;

    public AddAdditionalContactsBody(int i11, String deviceId, int i12, String contactNo) {
        o.i(deviceId, "deviceId");
        o.i(contactNo, "contactNo");
        this.advId = i11;
        this.deviceId = deviceId;
        this.regionId = i12;
        this.contactNo = contactNo;
    }

    public static /* synthetic */ AddAdditionalContactsBody copy$default(AddAdditionalContactsBody addAdditionalContactsBody, int i11, String str, int i12, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = addAdditionalContactsBody.advId;
        }
        if ((i13 & 2) != 0) {
            str = addAdditionalContactsBody.deviceId;
        }
        if ((i13 & 4) != 0) {
            i12 = addAdditionalContactsBody.regionId;
        }
        if ((i13 & 8) != 0) {
            str2 = addAdditionalContactsBody.contactNo;
        }
        return addAdditionalContactsBody.copy(i11, str, i12, str2);
    }

    public final int component1() {
        return this.advId;
    }

    public final String component2() {
        return this.deviceId;
    }

    public final int component3() {
        return this.regionId;
    }

    public final String component4() {
        return this.contactNo;
    }

    public final AddAdditionalContactsBody copy(int i11, String deviceId, int i12, String contactNo) {
        o.i(deviceId, "deviceId");
        o.i(contactNo, "contactNo");
        return new AddAdditionalContactsBody(i11, deviceId, i12, contactNo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddAdditionalContactsBody)) {
            return false;
        }
        AddAdditionalContactsBody addAdditionalContactsBody = (AddAdditionalContactsBody) obj;
        if (this.advId == addAdditionalContactsBody.advId && o.d(this.deviceId, addAdditionalContactsBody.deviceId) && this.regionId == addAdditionalContactsBody.regionId && o.d(this.contactNo, addAdditionalContactsBody.contactNo)) {
            return true;
        }
        return false;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getContactNo() {
        return this.contactNo;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.advId) * 31) + this.deviceId.hashCode()) * 31) + Integer.hashCode(this.regionId)) * 31) + this.contactNo.hashCode();
    }

    public String toString() {
        int i11 = this.advId;
        String str = this.deviceId;
        int i12 = this.regionId;
        String str2 = this.contactNo;
        return "AddAdditionalContactsBody(advId=" + i11 + ", deviceId=" + str + ", regionId=" + i12 + ", contactNo=" + str2 + ")";
    }
}

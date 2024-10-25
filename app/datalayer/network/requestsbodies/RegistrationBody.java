package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: RegistrationBody.kt */
/* loaded from: classes2.dex */
public final class RegistrationBody {
    public static final int $stable = 0;
    @c("front_end_verification")
    private final Integer frontEndVerification;
    @c("phone")
    private final String phone;
    @c("region_id")
    private final int regionId;

    public RegistrationBody(String phone, int i11, Integer num) {
        o.i(phone, "phone");
        this.phone = phone;
        this.regionId = i11;
        this.frontEndVerification = num;
    }

    public final Integer getFrontEndVerification() {
        return this.frontEndVerification;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getRegionId() {
        return this.regionId;
    }

    public /* synthetic */ RegistrationBody(String str, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 4) != 0 ? null : num);
    }
}

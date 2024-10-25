package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: GetUserAutoRepostsBody.kt */
/* loaded from: classes2.dex */
public final class GetUserAutoRepostsBody {
    public static final int $stable = 0;
    @c("phone")
    private final String phone;

    public GetUserAutoRepostsBody(String phone) {
        o.i(phone, "phone");
        this.phone = phone;
    }

    public final String getPhone() {
        return this.phone;
    }
}

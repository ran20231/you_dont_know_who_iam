package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MyTransactionBody.kt */
/* loaded from: classes2.dex */
public final class MyTransactionBody {
    public static final int $stable = 0;
    @c(AdvancedSearchBody.PAGE)
    private final int page;
    @c("page_size")
    private final int page_size;
    @c("phone")
    private final String phone;

    public MyTransactionBody(String phone, int i11, int i12) {
        o.i(phone, "phone");
        this.phone = phone;
        this.page = i11;
        this.page_size = i12;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public final String getPhone() {
        return this.phone;
    }
}

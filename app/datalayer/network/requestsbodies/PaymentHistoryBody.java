package com.forsale.app.datalayer.network.requestsbodies;

import com.forsale.app.utils.Languages;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PaymentHistoryBody.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryBody {
    public static final int $stable = 0;
    @c(GetListingsBaseBody.DEVICE_ID)
    private final String deviceId;
    @c("lang")
    private final Languages lang;
    @c(AdvancedSearchBody.PAGE)
    private final int page;
    @c("page_size")
    private final int page_size;

    public PaymentHistoryBody(String deviceId, int i11, int i12, Languages lang) {
        o.i(deviceId, "deviceId");
        o.i(lang, "lang");
        this.deviceId = deviceId;
        this.page = i11;
        this.page_size = i12;
        this.lang = lang;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final Languages getLang() {
        return this.lang;
    }

    public final int getPage() {
        return this.page;
    }

    public final int getPage_size() {
        return this.page_size;
    }

    public /* synthetic */ PaymentHistoryBody(String str, int i11, int i12, Languages languages, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, i12, (i13 & 8) != 0 ? Languages.Companion.b() : languages);
    }
}

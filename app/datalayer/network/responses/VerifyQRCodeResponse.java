package com.forsale.app.datalayer.network.responses;

import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: VerifyQRCodeResponse.kt */
/* loaded from: classes2.dex */
public final class VerifyQRCodeResponse {
    public static final int $stable = 0;
    @c("msg_ar")
    private final String messageAr;
    @c("msg_en")
    private final String messageEn;

    public VerifyQRCodeResponse(String messageAr, String messageEn) {
        o.i(messageAr, "messageAr");
        o.i(messageEn, "messageEn");
        this.messageAr = messageAr;
        this.messageEn = messageEn;
    }

    public static /* synthetic */ VerifyQRCodeResponse copy$default(VerifyQRCodeResponse verifyQRCodeResponse, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = verifyQRCodeResponse.messageAr;
        }
        if ((i11 & 2) != 0) {
            str2 = verifyQRCodeResponse.messageEn;
        }
        return verifyQRCodeResponse.copy(str, str2);
    }

    public final String component1() {
        return this.messageAr;
    }

    public final String component2() {
        return this.messageEn;
    }

    public final VerifyQRCodeResponse copy(String messageAr, String messageEn) {
        o.i(messageAr, "messageAr");
        o.i(messageEn, "messageEn");
        return new VerifyQRCodeResponse(messageAr, messageEn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyQRCodeResponse)) {
            return false;
        }
        VerifyQRCodeResponse verifyQRCodeResponse = (VerifyQRCodeResponse) obj;
        if (o.d(this.messageAr, verifyQRCodeResponse.messageAr) && o.d(this.messageEn, verifyQRCodeResponse.messageEn)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        if (LocaleManager.f39597a.r()) {
            return this.messageAr;
        }
        return this.messageEn;
    }

    public final String getMessageAr() {
        return this.messageAr;
    }

    public final String getMessageEn() {
        return this.messageEn;
    }

    public int hashCode() {
        return (this.messageAr.hashCode() * 31) + this.messageEn.hashCode();
    }

    public String toString() {
        String str = this.messageAr;
        String str2 = this.messageEn;
        return "VerifyQRCodeResponse(messageAr=" + str + ", messageEn=" + str2 + ")";
    }
}

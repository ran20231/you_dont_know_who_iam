package com.forsale.app.datalayer.network.entities;

import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: ReportAbuseUserEntity.kt */
/* loaded from: classes2.dex */
public final class ReportAbuseUserEntity {
    public static final int $stable = 0;
    @c("msg_ar")
    private final String messageAr;
    @c("msg_en")
    private final String messageEn;

    public ReportAbuseUserEntity(String messageAr, String messageEn) {
        o.i(messageAr, "messageAr");
        o.i(messageEn, "messageEn");
        this.messageAr = messageAr;
        this.messageEn = messageEn;
    }

    public static /* synthetic */ ReportAbuseUserEntity copy$default(ReportAbuseUserEntity reportAbuseUserEntity, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = reportAbuseUserEntity.messageAr;
        }
        if ((i11 & 2) != 0) {
            str2 = reportAbuseUserEntity.messageEn;
        }
        return reportAbuseUserEntity.copy(str, str2);
    }

    public final String component1() {
        return this.messageAr;
    }

    public final String component2() {
        return this.messageEn;
    }

    public final ReportAbuseUserEntity copy(String messageAr, String messageEn) {
        o.i(messageAr, "messageAr");
        o.i(messageEn, "messageEn");
        return new ReportAbuseUserEntity(messageAr, messageEn);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReportAbuseUserEntity)) {
            return false;
        }
        ReportAbuseUserEntity reportAbuseUserEntity = (ReportAbuseUserEntity) obj;
        if (o.d(this.messageAr, reportAbuseUserEntity.messageAr) && o.d(this.messageEn, reportAbuseUserEntity.messageEn)) {
            return true;
        }
        return false;
    }

    public final String getMessage() {
        if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
            return this.messageEn;
        }
        return this.messageAr;
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
        return "ReportAbuseUserEntity(messageAr=" + str + ", messageEn=" + str2 + ")";
    }
}

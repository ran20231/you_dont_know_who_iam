package com.forsale.app.datalayer.database;

import a00.a;
import com.leanplum.messagetemplates.MessageTemplateConstants;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppNotificationType.kt */
/* loaded from: classes2.dex */
public final class InAppNotificationType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InAppNotificationType[] $VALUES;
    @c("text")
    public static final InAppNotificationType TEXT = new InAppNotificationType("TEXT", 0, "text");
    @c("banner")
    public static final InAppNotificationType BANNER = new InAppNotificationType("BANNER", 1, "banner");
    @c("offers")
    public static final InAppNotificationType OFFER = new InAppNotificationType("OFFER", 2, "offers");
    @c("user_adv")
    public static final InAppNotificationType USER_ADV = new InAppNotificationType("USER_ADV", 3, "user_adv");
    @c("admin_adv")
    public static final InAppNotificationType ADMIN_ADV = new InAppNotificationType("ADMIN_ADV", 4, "admin_adv");
    @c("payments")
    public static final InAppNotificationType PAYMENTS = new InAppNotificationType("PAYMENTS", 5, "payments");
    @c("url")
    public static final InAppNotificationType URL = new InAppNotificationType(MessageTemplateConstants.Args.URL, 6, "url");

    private static final /* synthetic */ InAppNotificationType[] $values() {
        return new InAppNotificationType[]{TEXT, BANNER, OFFER, USER_ADV, ADMIN_ADV, PAYMENTS, URL};
    }

    static {
        InAppNotificationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private InAppNotificationType(String str, int i11, String str2) {
    }

    public static a<InAppNotificationType> getEntries() {
        return $ENTRIES;
    }

    public static InAppNotificationType valueOf(String str) {
        return (InAppNotificationType) Enum.valueOf(InAppNotificationType.class, str);
    }

    public static InAppNotificationType[] values() {
        return (InAppNotificationType[]) $VALUES.clone();
    }
}

package com.forsale.app.utils.analytics;

import com.leanplum.messagetemplates.MessageTemplateConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class NotificationTypesAWS {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ NotificationTypesAWS[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final NotificationTypesAWS OFFER = new NotificationTypesAWS("OFFER", 0, "Offer");
    public static final NotificationTypesAWS BANNER = new NotificationTypesAWS("BANNER", 1, "Banner");
    public static final NotificationTypesAWS ADMIN_ADV = new NotificationTypesAWS("ADMIN_ADV", 2, "AdminAdv");
    public static final NotificationTypesAWS USER_ADV = new NotificationTypesAWS("USER_ADV", 3, "UserAdv");
    public static final NotificationTypesAWS PAYMENT = new NotificationTypesAWS("PAYMENT", 4, "Payment");
    public static final NotificationTypesAWS OTHER = new NotificationTypesAWS("OTHER", 5, "Other");
    public static final NotificationTypesAWS URL = new NotificationTypesAWS(MessageTemplateConstants.Args.URL, 6, MessageTemplateConstants.Args.URL);

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ NotificationTypesAWS[] $values() {
        return new NotificationTypesAWS[]{OFFER, BANNER, ADMIN_ADV, USER_ADV, PAYMENT, OTHER, URL};
    }

    static {
        NotificationTypesAWS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private NotificationTypesAWS(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<NotificationTypesAWS> getEntries() {
        return $ENTRIES;
    }

    public static NotificationTypesAWS valueOf(String str) {
        return (NotificationTypesAWS) Enum.valueOf(NotificationTypesAWS.class, str);
    }

    public static NotificationTypesAWS[] values() {
        return (NotificationTypesAWS[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

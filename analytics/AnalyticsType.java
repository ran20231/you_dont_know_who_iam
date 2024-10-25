package com.forsale.analytics;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsType.kt */
/* loaded from: classes2.dex */
public final class AnalyticsType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnalyticsType[] $VALUES;
    private final String value;
    @c("views")
    public static final AnalyticsType VIEWS = new AnalyticsType("VIEWS", 0, "views");
    @c("CallIcon")
    public static final AnalyticsType CALL_ATTEMPTS = new AnalyticsType("CALL_ATTEMPTS", 1, "CallIcon");
    @c("PhoneCall")
    public static final AnalyticsType PHONE_CALLS = new AnalyticsType("PHONE_CALLS", 2, "PhoneCall");
    @c("VoipCall")
    public static final AnalyticsType VOIP_CALLS = new AnalyticsType("VOIP_CALLS", 3, "VoipCall");
    @c("VideoCall")
    public static final AnalyticsType VIDEO_CALLS = new AnalyticsType("VIDEO_CALLS", 4, "VideoCall");
    @c("PromotionImpressions")
    public static final AnalyticsType PROMOTION_VIEWS = new AnalyticsType("PROMOTION_VIEWS", 5, "PromotionImpressions");
    @c("PromotionViews")
    public static final AnalyticsType PROMOTION_CLICKS = new AnalyticsType("PROMOTION_CLICKS", 6, "PromotionViews");
    @c("whatsapp")
    public static final AnalyticsType WHATSAPP = new AnalyticsType("WHATSAPP", 7, "whatsapp");
    @c("WhatsAppIcon")
    public static final AnalyticsType WHATSAPP_APP_ICON = new AnalyticsType("WHATSAPP_APP_ICON", 8, "WhatsAppIcon");
    @c("CHAT")
    public static final AnalyticsType CHAT = new AnalyticsType("CHAT", 9, "CHAT");

    private static final /* synthetic */ AnalyticsType[] $values() {
        return new AnalyticsType[]{VIEWS, CALL_ATTEMPTS, PHONE_CALLS, VOIP_CALLS, VIDEO_CALLS, PROMOTION_VIEWS, PROMOTION_CLICKS, WHATSAPP, WHATSAPP_APP_ICON, CHAT};
    }

    static {
        AnalyticsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AnalyticsType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<AnalyticsType> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsType valueOf(String str) {
        return (AnalyticsType) Enum.valueOf(AnalyticsType.class, str);
    }

    public static AnalyticsType[] values() {
        return (AnalyticsType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

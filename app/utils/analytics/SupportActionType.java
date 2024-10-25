package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class SupportActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SupportActionType[] $VALUES;
    private final String value;
    public static final SupportActionType SUPPORT_FAQ_CLICKED = new SupportActionType("SUPPORT_FAQ_CLICKED", 0, "Support FAQ Clicked");
    public static final SupportActionType SUPPORT_MY_TICKETS_CLICKED = new SupportActionType("SUPPORT_MY_TICKETS_CLICKED", 1, "Support My Tickets Clicked");
    public static final SupportActionType SUPPORT_CREATE_TICKET_CLICKED = new SupportActionType("SUPPORT_CREATE_TICKET_CLICKED", 2, "Support Create Ticket Clicked");
    public static final SupportActionType SUPPORT_LIVE_CHAT_CLICKED = new SupportActionType("SUPPORT_LIVE_CHAT_CLICKED", 3, "Support Live Chat Clicked");
    public static final SupportActionType SUPPORT_CALL_US_CLICKED = new SupportActionType("SUPPORT_CALL_US_CLICKED", 4, "Support Call Us Clicked");
    public static final SupportActionType SUPPORT_PHONE_NUMBER_CLICKED = new SupportActionType("SUPPORT_PHONE_NUMBER_CLICKED", 5, "Support Phone Number Clicked");

    private static final /* synthetic */ SupportActionType[] $values() {
        return new SupportActionType[]{SUPPORT_FAQ_CLICKED, SUPPORT_MY_TICKETS_CLICKED, SUPPORT_CREATE_TICKET_CLICKED, SUPPORT_LIVE_CHAT_CLICKED, SUPPORT_CALL_US_CLICKED, SUPPORT_PHONE_NUMBER_CLICKED};
    }

    static {
        SupportActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SupportActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<SupportActionType> getEntries() {
        return $ENTRIES;
    }

    public static SupportActionType valueOf(String str) {
        return (SupportActionType) Enum.valueOf(SupportActionType.class, str);
    }

    public static SupportActionType[] values() {
        return (SupportActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

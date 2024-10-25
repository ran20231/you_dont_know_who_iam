package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class AgentActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AgentActionType[] $VALUES;
    public static final AgentActionType CALL_CLICKED = new AgentActionType("CALL_CLICKED", 0, "CallClicked");
    public static final AgentActionType SMS_CLICKED = new AgentActionType("SMS_CLICKED", 1, "SmsClicked");
    private final String value;

    private static final /* synthetic */ AgentActionType[] $values() {
        return new AgentActionType[]{CALL_CLICKED, SMS_CLICKED};
    }

    static {
        AgentActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AgentActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AgentActionType> getEntries() {
        return $ENTRIES;
    }

    public static AgentActionType valueOf(String str) {
        return (AgentActionType) Enum.valueOf(AgentActionType.class, str);
    }

    public static AgentActionType[] values() {
        return (AgentActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

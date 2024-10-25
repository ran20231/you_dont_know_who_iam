package com.forsale.app.features.more.agents.list;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AgentContactType.kt */
/* loaded from: classes2.dex */
public final class AgentContactType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AgentContactType[] $VALUES;
    public static final AgentContactType CALL = new AgentContactType("CALL", 0);
    public static final AgentContactType SMS = new AgentContactType("SMS", 1);

    private static final /* synthetic */ AgentContactType[] $values() {
        return new AgentContactType[]{CALL, SMS};
    }

    static {
        AgentContactType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AgentContactType(String str, int i11) {
    }

    public static a00.a<AgentContactType> getEntries() {
        return $ENTRIES;
    }

    public static AgentContactType valueOf(String str) {
        return (AgentContactType) Enum.valueOf(AgentContactType.class, str);
    }

    public static AgentContactType[] values() {
        return (AgentContactType[]) $VALUES.clone();
    }
}

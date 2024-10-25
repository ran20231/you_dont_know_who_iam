package com.forsale.app.utils.popUpsPrioritizer;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopUpType.kt */
/* loaded from: classes3.dex */
public final class PopUpType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PopUpType[] $VALUES;
    private final int priority;
    public static final PopUpType BOTTOM_BAR_TOOL_TIP = new PopUpType("BOTTOM_BAR_TOOL_TIP", 0, 0);
    public static final PopUpType IS_HOME_LOADING = new PopUpType("IS_HOME_LOADING", 1, 1);
    public static final PopUpType HOME_OVERLAY = new PopUpType("HOME_OVERLAY", 2, 1);
    public static final PopUpType HOME_UPPER_TOOL_TIP = new PopUpType("HOME_UPPER_TOOL_TIP", 3, 2);
    public static final PopUpType IN_APP_MESSAGING = new PopUpType("IN_APP_MESSAGING", 4, 3);
    public static final PopUpType INTERSTITIALS = new PopUpType("INTERSTITIALS", 5, 4);
    public static final PopUpType EXPIRE_SOON = new PopUpType("EXPIRE_SOON", 6, 5);

    private static final /* synthetic */ PopUpType[] $values() {
        return new PopUpType[]{BOTTOM_BAR_TOOL_TIP, IS_HOME_LOADING, HOME_OVERLAY, HOME_UPPER_TOOL_TIP, IN_APP_MESSAGING, INTERSTITIALS, EXPIRE_SOON};
    }

    static {
        PopUpType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PopUpType(String str, int i11, int i12) {
        this.priority = i12;
    }

    public static a00.a<PopUpType> getEntries() {
        return $ENTRIES;
    }

    public static PopUpType valueOf(String str) {
        return (PopUpType) Enum.valueOf(PopUpType.class, str);
    }

    public static PopUpType[] values() {
        return (PopUpType[]) $VALUES.clone();
    }

    public final int getPriority() {
        return this.priority;
    }
}

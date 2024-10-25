package com.forsale.app.features.categories.listingdetails.newui;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwitchStates.kt */
/* loaded from: classes2.dex */
public final class SwitchStates {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ SwitchStates[] $VALUES;
    public static final SwitchStates INTIAL = new SwitchStates("INTIAL", 0);
    public static final SwitchStates ENABLED = new SwitchStates("ENABLED", 1);
    public static final SwitchStates DISABLED = new SwitchStates("DISABLED", 2);
    public static final SwitchStates PENDING = new SwitchStates("PENDING", 3);

    private static final /* synthetic */ SwitchStates[] $values() {
        return new SwitchStates[]{INTIAL, ENABLED, DISABLED, PENDING};
    }

    static {
        SwitchStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SwitchStates(String str, int i11) {
    }

    public static a00.a<SwitchStates> getEntries() {
        return $ENTRIES;
    }

    public static SwitchStates valueOf(String str) {
        return (SwitchStates) Enum.valueOf(SwitchStates.class, str);
    }

    public static SwitchStates[] values() {
        return (SwitchStates[]) $VALUES.clone();
    }
}

package com.forsale.designSystem.tabs;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TabSlots.kt */
/* loaded from: classes3.dex */
public final class TabSlots {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TabSlots[] $VALUES;
    public static final TabSlots Tabs = new TabSlots("Tabs", 0);
    public static final TabSlots Divider = new TabSlots("Divider", 1);
    public static final TabSlots Indicator = new TabSlots("Indicator", 2);

    private static final /* synthetic */ TabSlots[] $values() {
        return new TabSlots[]{Tabs, Divider, Indicator};
    }

    static {
        TabSlots[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TabSlots(String str, int i11) {
    }

    public static a<TabSlots> getEntries() {
        return $ENTRIES;
    }

    public static TabSlots valueOf(String str) {
        return (TabSlots) Enum.valueOf(TabSlots.class, str);
    }

    public static TabSlots[] values() {
        return (TabSlots[]) $VALUES.clone();
    }
}

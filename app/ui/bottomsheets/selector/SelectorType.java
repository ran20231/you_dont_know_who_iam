package com.forsale.app.ui.bottomsheets.selector;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectorType.kt */
/* loaded from: classes3.dex */
public final class SelectorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SelectorType[] $VALUES;
    public static final SelectorType LIST = new SelectorType("LIST", 0);
    public static final SelectorType GRID = new SelectorType("GRID", 1);

    private static final /* synthetic */ SelectorType[] $values() {
        return new SelectorType[]{LIST, GRID};
    }

    static {
        SelectorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SelectorType(String str, int i11) {
    }

    public static a<SelectorType> getEntries() {
        return $ENTRIES;
    }

    public static SelectorType valueOf(String str) {
        return (SelectorType) Enum.valueOf(SelectorType.class, str);
    }

    public static SelectorType[] values() {
        return (SelectorType[]) $VALUES.clone();
    }
}

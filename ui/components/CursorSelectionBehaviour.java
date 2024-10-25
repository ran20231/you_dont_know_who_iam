package com.forsale.ui.components;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SearchToolbar.kt */
/* loaded from: classes3.dex */
public final class CursorSelectionBehaviour {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CursorSelectionBehaviour[] $VALUES;
    public static final CursorSelectionBehaviour IDLE = new CursorSelectionBehaviour("IDLE", 0);
    public static final CursorSelectionBehaviour END = new CursorSelectionBehaviour("END", 1);

    private static final /* synthetic */ CursorSelectionBehaviour[] $values() {
        return new CursorSelectionBehaviour[]{IDLE, END};
    }

    static {
        CursorSelectionBehaviour[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CursorSelectionBehaviour(String str, int i11) {
    }

    public static a<CursorSelectionBehaviour> getEntries() {
        return $ENTRIES;
    }

    public static CursorSelectionBehaviour valueOf(String str) {
        return (CursorSelectionBehaviour) Enum.valueOf(CursorSelectionBehaviour.class, str);
    }

    public static CursorSelectionBehaviour[] values() {
        return (CursorSelectionBehaviour[]) $VALUES.clone();
    }
}

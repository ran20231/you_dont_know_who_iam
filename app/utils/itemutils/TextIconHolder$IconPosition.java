package com.forsale.app.utils.itemutils;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextIconHolder.kt */
/* loaded from: classes3.dex */
public final class TextIconHolder$IconPosition {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TextIconHolder$IconPosition[] $VALUES;
    public static final TextIconHolder$IconPosition START = new TextIconHolder$IconPosition("START", 0);
    public static final TextIconHolder$IconPosition END = new TextIconHolder$IconPosition("END", 1);
    public static final TextIconHolder$IconPosition TOP = new TextIconHolder$IconPosition("TOP", 2);
    public static final TextIconHolder$IconPosition BOTTOM = new TextIconHolder$IconPosition("BOTTOM", 3);

    private static final /* synthetic */ TextIconHolder$IconPosition[] $values() {
        return new TextIconHolder$IconPosition[]{START, END, TOP, BOTTOM};
    }

    static {
        TextIconHolder$IconPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TextIconHolder$IconPosition(String str, int i11) {
    }

    public static a<TextIconHolder$IconPosition> getEntries() {
        return $ENTRIES;
    }

    public static TextIconHolder$IconPosition valueOf(String str) {
        return (TextIconHolder$IconPosition) Enum.valueOf(TextIconHolder$IconPosition.class, str);
    }

    public static TextIconHolder$IconPosition[] values() {
        return (TextIconHolder$IconPosition[]) $VALUES.clone();
    }
}

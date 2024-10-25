package com.forsale.designSystem.notificationsystem.tooltip;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipData.kt */
/* loaded from: classes3.dex */
public final class ArrowAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ArrowAlignment[] $VALUES;
    public static final ArrowAlignment Start = new ArrowAlignment("Start", 0);
    public static final ArrowAlignment Center = new ArrowAlignment("Center", 1);
    public static final ArrowAlignment End = new ArrowAlignment("End", 2);

    private static final /* synthetic */ ArrowAlignment[] $values() {
        return new ArrowAlignment[]{Start, Center, End};
    }

    static {
        ArrowAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ArrowAlignment(String str, int i11) {
    }

    public static a<ArrowAlignment> getEntries() {
        return $ENTRIES;
    }

    public static ArrowAlignment valueOf(String str) {
        return (ArrowAlignment) Enum.valueOf(ArrowAlignment.class, str);
    }

    public static ArrowAlignment[] values() {
        return (ArrowAlignment[]) $VALUES.clone();
    }
}

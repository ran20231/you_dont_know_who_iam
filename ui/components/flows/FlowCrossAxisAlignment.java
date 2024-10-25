package com.forsale.ui.components.flows;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class FlowCrossAxisAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlowCrossAxisAlignment[] $VALUES;
    public static final FlowCrossAxisAlignment Center = new FlowCrossAxisAlignment("Center", 0);
    public static final FlowCrossAxisAlignment Start = new FlowCrossAxisAlignment("Start", 1);
    public static final FlowCrossAxisAlignment End = new FlowCrossAxisAlignment("End", 2);

    private static final /* synthetic */ FlowCrossAxisAlignment[] $values() {
        return new FlowCrossAxisAlignment[]{Center, Start, End};
    }

    static {
        FlowCrossAxisAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FlowCrossAxisAlignment(String str, int i11) {
    }

    public static a<FlowCrossAxisAlignment> getEntries() {
        return $ENTRIES;
    }

    public static FlowCrossAxisAlignment valueOf(String str) {
        return (FlowCrossAxisAlignment) Enum.valueOf(FlowCrossAxisAlignment.class, str);
    }

    public static FlowCrossAxisAlignment[] values() {
        return (FlowCrossAxisAlignment[]) $VALUES.clone();
    }
}

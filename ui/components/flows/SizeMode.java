package com.forsale.ui.components.flows;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class SizeMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ SizeMode[] $VALUES;
    public static final SizeMode Wrap = new SizeMode("Wrap", 0);
    public static final SizeMode Expand = new SizeMode("Expand", 1);

    private static final /* synthetic */ SizeMode[] $values() {
        return new SizeMode[]{Wrap, Expand};
    }

    static {
        SizeMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SizeMode(String str, int i11) {
    }

    public static a<SizeMode> getEntries() {
        return $ENTRIES;
    }

    public static SizeMode valueOf(String str) {
        return (SizeMode) Enum.valueOf(SizeMode.class, str);
    }

    public static SizeMode[] values() {
        return (SizeMode[]) $VALUES.clone();
    }
}

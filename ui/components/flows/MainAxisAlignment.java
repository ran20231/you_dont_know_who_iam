package com.forsale.ui.components.flows;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Flow.kt */
/* loaded from: classes3.dex */
public final class MainAxisAlignment {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MainAxisAlignment[] $VALUES;
    public static final MainAxisAlignment Center = new MainAxisAlignment("Center", 0);
    public static final MainAxisAlignment Start = new MainAxisAlignment("Start", 1);
    public static final MainAxisAlignment End = new MainAxisAlignment("End", 2);
    public static final MainAxisAlignment SpaceEvenly = new MainAxisAlignment("SpaceEvenly", 3);
    public static final MainAxisAlignment SpaceBetween = new MainAxisAlignment("SpaceBetween", 4);
    public static final MainAxisAlignment SpaceAround = new MainAxisAlignment("SpaceAround", 5);

    private static final /* synthetic */ MainAxisAlignment[] $values() {
        return new MainAxisAlignment[]{Center, Start, End, SpaceEvenly, SpaceBetween, SpaceAround};
    }

    static {
        MainAxisAlignment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MainAxisAlignment(String str, int i11) {
    }

    public static a<MainAxisAlignment> getEntries() {
        return $ENTRIES;
    }

    public static MainAxisAlignment valueOf(String str) {
        return (MainAxisAlignment) Enum.valueOf(MainAxisAlignment.class, str);
    }

    public static MainAxisAlignment[] values() {
        return (MainAxisAlignment[]) $VALUES.clone();
    }
}

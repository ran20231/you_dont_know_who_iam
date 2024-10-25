package com.forsale.adserver.view.models;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailsIntention.kt */
/* loaded from: classes2.dex */
public final class DetailsIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DetailsIntention[] $VALUES;
    public static final DetailsIntention ALL_SCREEN = new DetailsIntention("ALL_SCREEN", 0, "all_screen");
    public static final DetailsIntention DETAILS_ONLY = new DetailsIntention("DETAILS_ONLY", 1, "details_only");
    private final String value;

    private static final /* synthetic */ DetailsIntention[] $values() {
        return new DetailsIntention[]{ALL_SCREEN, DETAILS_ONLY};
    }

    static {
        DetailsIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DetailsIntention(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<DetailsIntention> getEntries() {
        return $ENTRIES;
    }

    public static DetailsIntention valueOf(String str) {
        return (DetailsIntention) Enum.valueOf(DetailsIntention.class, str);
    }

    public static DetailsIntention[] values() {
        return (DetailsIntention[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

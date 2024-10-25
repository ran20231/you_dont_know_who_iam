package com.forsale.app.features.categories.listings.items.dfp;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamStates.kt */
/* loaded from: classes2.dex */
public final class GamStates {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GamStates[] $VALUES;
    public static final GamStates IS_LOADING = new GamStates("IS_LOADING", 0);
    public static final GamStates SUCCESS = new GamStates("SUCCESS", 1);
    public static final GamStates FAILED = new GamStates("FAILED", 2);

    private static final /* synthetic */ GamStates[] $values() {
        return new GamStates[]{IS_LOADING, SUCCESS, FAILED};
    }

    static {
        GamStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GamStates(String str, int i11) {
    }

    public static a<GamStates> getEntries() {
        return $ENTRIES;
    }

    public static GamStates valueOf(String str) {
        return (GamStates) Enum.valueOf(GamStates.class, str);
    }

    public static GamStates[] values() {
        return (GamStates[]) $VALUES.clone();
    }
}

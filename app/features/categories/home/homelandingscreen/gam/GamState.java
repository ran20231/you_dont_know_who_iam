package com.forsale.app.features.categories.home.homelandingscreen.gam;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: GamState.kt */
/* loaded from: classes2.dex */
public final class GamState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ GamState[] $VALUES;
    public static final GamState INTIAL = new GamState("INTIAL", 0);
    public static final GamState LOADING = new GamState("LOADING", 1);
    public static final GamState FAILED = new GamState("FAILED", 2);
    public static final GamState SUCCESS = new GamState("SUCCESS", 3);
    public static final GamState INTIAL_LOADING = new GamState("INTIAL_LOADING", 4);

    private static final /* synthetic */ GamState[] $values() {
        return new GamState[]{INTIAL, LOADING, FAILED, SUCCESS, INTIAL_LOADING};
    }

    static {
        GamState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private GamState(String str, int i11) {
    }

    public static a<GamState> getEntries() {
        return $ENTRIES;
    }

    public static GamState valueOf(String str) {
        return (GamState) Enum.valueOf(GamState.class, str);
    }

    public static GamState[] values() {
        return (GamState[]) $VALUES.clone();
    }
}

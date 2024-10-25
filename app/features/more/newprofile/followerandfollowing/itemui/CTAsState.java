package com.forsale.app.features.more.newprofile.followerandfollowing.itemui;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CTAsState.kt */
/* loaded from: classes2.dex */
public final class CTAsState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CTAsState[] $VALUES;
    public static final CTAsState FOLLOW = new CTAsState("FOLLOW", 0);
    public static final CTAsState FOLLOWING = new CTAsState("FOLLOWING", 1);

    private static final /* synthetic */ CTAsState[] $values() {
        return new CTAsState[]{FOLLOW, FOLLOWING};
    }

    static {
        CTAsState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CTAsState(String str, int i11) {
    }

    public static a<CTAsState> getEntries() {
        return $ENTRIES;
    }

    public static CTAsState valueOf(String str) {
        return (CTAsState) Enum.valueOf(CTAsState.class, str);
    }

    public static CTAsState[] values() {
        return (CTAsState[]) $VALUES.clone();
    }
}

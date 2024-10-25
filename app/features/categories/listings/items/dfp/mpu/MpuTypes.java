package com.forsale.app.features.categories.listings.items.dfp.mpu;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MpuTypes.kt */
/* loaded from: classes2.dex */
public final class MpuTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MpuTypes[] $VALUES;
    public static final MpuTypes LISTINGS = new MpuTypes("LISTINGS", 0);
    public static final MpuTypes SEARCH = new MpuTypes("SEARCH", 1);

    private static final /* synthetic */ MpuTypes[] $values() {
        return new MpuTypes[]{LISTINGS, SEARCH};
    }

    static {
        MpuTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MpuTypes(String str, int i11) {
    }

    public static a<MpuTypes> getEntries() {
        return $ENTRIES;
    }

    public static MpuTypes valueOf(String str) {
        return (MpuTypes) Enum.valueOf(MpuTypes.class, str);
    }

    public static MpuTypes[] values() {
        return (MpuTypes[]) $VALUES.clone();
    }
}

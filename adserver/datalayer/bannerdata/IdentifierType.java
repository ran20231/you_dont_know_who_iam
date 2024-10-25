package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class IdentifierType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ IdentifierType[] $VALUES;
    public static final IdentifierType CATEGORY = new IdentifierType("CATEGORY", 0, "category");
    private final String type;

    private static final /* synthetic */ IdentifierType[] $values() {
        return new IdentifierType[]{CATEGORY};
    }

    static {
        IdentifierType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private IdentifierType(String str, int i11, String str2) {
        this.type = str2;
    }

    public static a00.a<IdentifierType> getEntries() {
        return $ENTRIES;
    }

    public static IdentifierType valueOf(String str) {
        return (IdentifierType) Enum.valueOf(IdentifierType.class, str);
    }

    public static IdentifierType[] values() {
        return (IdentifierType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}

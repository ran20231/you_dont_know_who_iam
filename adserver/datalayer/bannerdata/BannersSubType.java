package com.forsale.adserver.datalayer.bannerdata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class BannersSubType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ BannersSubType[] $VALUES;
    public static final BannersSubType IMAGE = new BannersSubType("IMAGE", 0);
    public static final BannersSubType VIDEO = new BannersSubType("VIDEO", 1);
    public static final BannersSubType HTML = new BannersSubType("HTML", 2);

    private static final /* synthetic */ BannersSubType[] $values() {
        return new BannersSubType[]{IMAGE, VIDEO, HTML};
    }

    static {
        BannersSubType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BannersSubType(String str, int i11) {
    }

    public static a00.a<BannersSubType> getEntries() {
        return $ENTRIES;
    }

    public static BannersSubType valueOf(String str) {
        return (BannersSubType) Enum.valueOf(BannersSubType.class, str);
    }

    public static BannersSubType[] values() {
        return (BannersSubType[]) $VALUES.clone();
    }
}

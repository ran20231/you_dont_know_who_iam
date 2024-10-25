package com.forsale.app.features.banners;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BannerType.kt */
/* loaded from: classes2.dex */
public final class BannerType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BannerType[] $VALUES;
    public static final BannerType TopHomeView = new BannerType("TopHomeView", 0);
    public static final BannerType HorizontalSlider = new BannerType("HorizontalSlider", 1);
    public static final BannerType CategorySlider = new BannerType("CategorySlider", 2);
    public static final BannerType SlidingBig = new BannerType("SlidingBig", 3);
    public static final BannerType SlidingSmall = new BannerType("SlidingSmall", 4);
    public static final BannerType FixedFooter = new BannerType("FixedFooter", 5);

    private static final /* synthetic */ BannerType[] $values() {
        return new BannerType[]{TopHomeView, HorizontalSlider, CategorySlider, SlidingBig, SlidingSmall, FixedFooter};
    }

    static {
        BannerType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BannerType(String str, int i11) {
    }

    public static a<BannerType> getEntries() {
        return $ENTRIES;
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) $VALUES.clone();
    }
}

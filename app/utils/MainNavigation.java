package com.forsale.app.utils;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MainNavigation.kt */
/* loaded from: classes3.dex */
public final class MainNavigation {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MainNavigation[] $VALUES;
    private final int value;
    public static final MainNavigation LISTING = new MainNavigation("LISTING", 0, 0);
    public static final MainNavigation OFFERS = new MainNavigation("OFFERS", 1, 1);
    public static final MainNavigation POST_AD = new MainNavigation("POST_AD", 2, 2);
    public static final MainNavigation MESSAGES = new MainNavigation("MESSAGES", 3, 3);
    public static final MainNavigation MORE = new MainNavigation("MORE", 4, 4);

    private static final /* synthetic */ MainNavigation[] $values() {
        return new MainNavigation[]{LISTING, OFFERS, POST_AD, MESSAGES, MORE};
    }

    static {
        MainNavigation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MainNavigation(String str, int i11, int i12) {
        this.value = i12;
    }

    public static a00.a<MainNavigation> getEntries() {
        return $ENTRIES;
    }

    public static MainNavigation valueOf(String str) {
        return (MainNavigation) Enum.valueOf(MainNavigation.class, str);
    }

    public static MainNavigation[] values() {
        return (MainNavigation[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

package com.forsale.designSystem.buttons;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonSize {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ IconButtonSize[] $VALUES;
    public static final IconButtonSize Small = new IconButtonSize("Small", 0);
    public static final IconButtonSize Medium = new IconButtonSize("Medium", 1);
    public static final IconButtonSize Large = new IconButtonSize("Large", 2);

    private static final /* synthetic */ IconButtonSize[] $values() {
        return new IconButtonSize[]{Small, Medium, Large};
    }

    static {
        IconButtonSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private IconButtonSize(String str, int i11) {
    }

    public static a00.a<IconButtonSize> getEntries() {
        return $ENTRIES;
    }

    public static IconButtonSize valueOf(String str) {
        return (IconButtonSize) Enum.valueOf(IconButtonSize.class, str);
    }

    public static IconButtonSize[] values() {
        return (IconButtonSize[]) $VALUES.clone();
    }
}

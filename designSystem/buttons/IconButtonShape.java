package com.forsale.designSystem.buttons;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IconButton.kt */
/* loaded from: classes3.dex */
public final class IconButtonShape {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ IconButtonShape[] $VALUES;
    public static final IconButtonShape Square = new IconButtonShape("Square", 0);
    public static final IconButtonShape Circle = new IconButtonShape("Circle", 1);
    public static final IconButtonShape Rectangle = new IconButtonShape("Rectangle", 2);

    private static final /* synthetic */ IconButtonShape[] $values() {
        return new IconButtonShape[]{Square, Circle, Rectangle};
    }

    static {
        IconButtonShape[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private IconButtonShape(String str, int i11) {
    }

    public static a00.a<IconButtonShape> getEntries() {
        return $ENTRIES;
    }

    public static IconButtonShape valueOf(String str) {
        return (IconButtonShape) Enum.valueOf(IconButtonShape.class, str);
    }

    public static IconButtonShape[] values() {
        return (IconButtonShape[]) $VALUES.clone();
    }
}

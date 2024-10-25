package com.forsale.app.utils.passwordstrength;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PasswordStrength.kt */
/* loaded from: classes3.dex */
public final class StrengthLevels {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ StrengthLevels[] $VALUES;
    private final int threshold;
    public static final StrengthLevels VERY_WEAK = new StrengthLevels("VERY_WEAK", 0, 25);
    public static final StrengthLevels WEAK = new StrengthLevels("WEAK", 1, 50);
    public static final StrengthLevels STRONG = new StrengthLevels("STRONG", 2, 75);
    public static final StrengthLevels VERY_STRONG = new StrengthLevels("VERY_STRONG", 3, 100);

    private static final /* synthetic */ StrengthLevels[] $values() {
        return new StrengthLevels[]{VERY_WEAK, WEAK, STRONG, VERY_STRONG};
    }

    static {
        StrengthLevels[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private StrengthLevels(String str, int i11, int i12) {
        this.threshold = i12;
    }

    public static a<StrengthLevels> getEntries() {
        return $ENTRIES;
    }

    public static StrengthLevels valueOf(String str) {
        return (StrengthLevels) Enum.valueOf(StrengthLevels.class, str);
    }

    public static StrengthLevels[] values() {
        return (StrengthLevels[]) $VALUES.clone();
    }

    public final int getThreshold() {
        return this.threshold;
    }
}

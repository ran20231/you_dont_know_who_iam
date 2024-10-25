package com.forsale.designSystem.avatars;

import a00.a;
import e2.h;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
public final class AvatarSize {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AvatarSize[] $VALUES;
    private final float value;
    public static final AvatarSize SIZE_88 = new AvatarSize("SIZE_88", 0, h.l(88));
    public static final AvatarSize SIZE_72 = new AvatarSize("SIZE_72", 1, h.l(72));
    public static final AvatarSize SIZE_48 = new AvatarSize("SIZE_48", 2, h.l(48));
    public static final AvatarSize SIZE_32 = new AvatarSize("SIZE_32", 3, h.l(32));
    public static final AvatarSize SIZE_24 = new AvatarSize("SIZE_24", 4, h.l(24));

    private static final /* synthetic */ AvatarSize[] $values() {
        return new AvatarSize[]{SIZE_88, SIZE_72, SIZE_48, SIZE_32, SIZE_24};
    }

    static {
        AvatarSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AvatarSize(String str, int i11, float f11) {
        this.value = f11;
    }

    public static a<AvatarSize> getEntries() {
        return $ENTRIES;
    }

    public static AvatarSize valueOf(String str) {
        return (AvatarSize) Enum.valueOf(AvatarSize.class, str);
    }

    public static AvatarSize[] values() {
        return (AvatarSize[]) $VALUES.clone();
    }

    /* renamed from: getValue-D9Ej5fM  reason: not valid java name */
    public final float m9getValueD9Ej5fM() {
        return this.value;
    }
}

package com.forsale.app.features.categories.home;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CardDisplayTypes.kt */
/* loaded from: classes2.dex */
public final class CardDisplayTypes {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CardDisplayTypes[] $VALUES;
    public static final CardDisplayTypes STACKED = new CardDisplayTypes("STACKED", 0);
    public static final CardDisplayTypes HORIZONTAL = new CardDisplayTypes("HORIZONTAL", 1);

    private static final /* synthetic */ CardDisplayTypes[] $values() {
        return new CardDisplayTypes[]{STACKED, HORIZONTAL};
    }

    static {
        CardDisplayTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private CardDisplayTypes(String str, int i11) {
    }

    public static a<CardDisplayTypes> getEntries() {
        return $ENTRIES;
    }

    public static CardDisplayTypes valueOf(String str) {
        return (CardDisplayTypes) Enum.valueOf(CardDisplayTypes.class, str);
    }

    public static CardDisplayTypes[] values() {
        return (CardDisplayTypes[]) $VALUES.clone();
    }
}

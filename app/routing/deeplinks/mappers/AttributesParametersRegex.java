package com.forsale.app.routing.deeplinks.mappers;

import kotlin.text.Regex;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CategoryListingDeepLinkMapper.kt */
/* loaded from: classes2.dex */
final class AttributesParametersRegex {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AttributesParametersRegex[] $VALUES;
    private final Regex[] regex;
    public static final AttributesParametersRegex RANGE = new AttributesParametersRegex("RANGE", 0, new Regex("^at\\d+$"), new Regex("^af\\d+$"));
    public static final AttributesParametersRegex NUMBER = new AttributesParametersRegex("NUMBER", 1, new Regex("^n_a\\d+$"));
    public static final AttributesParametersRegex DROP_DOWN = new AttributesParametersRegex("DROP_DOWN", 2, new Regex("^a\\d+$"));
    public static final AttributesParametersRegex BOOLEAN = new AttributesParametersRegex("BOOLEAN", 3, new Regex("^b_a"));

    private static final /* synthetic */ AttributesParametersRegex[] $values() {
        return new AttributesParametersRegex[]{RANGE, NUMBER, DROP_DOWN, BOOLEAN};
    }

    static {
        AttributesParametersRegex[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AttributesParametersRegex(String str, int i11, Regex... regexArr) {
        this.regex = regexArr;
    }

    public static a00.a<AttributesParametersRegex> getEntries() {
        return $ENTRIES;
    }

    public static AttributesParametersRegex valueOf(String str) {
        return (AttributesParametersRegex) Enum.valueOf(AttributesParametersRegex.class, str);
    }

    public static AttributesParametersRegex[] values() {
        return (AttributesParametersRegex[]) $VALUES.clone();
    }

    public final Regex[] getRegex() {
        return this.regex;
    }
}

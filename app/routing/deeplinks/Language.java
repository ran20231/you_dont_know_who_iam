package com.forsale.app.routing.deeplinks;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Language.kt */
/* loaded from: classes2.dex */
public final class Language {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Language[] $VALUES;
    public static final Language AR = new Language("AR", 0);
    public static final Language EN = new Language("EN", 1);

    private static final /* synthetic */ Language[] $values() {
        return new Language[]{AR, EN};
    }

    static {
        Language[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Language(String str, int i11) {
    }

    public static a<Language> getEntries() {
        return $ENTRIES;
    }

    public static Language valueOf(String str) {
        return (Language) Enum.valueOf(Language.class, str);
    }

    public static Language[] values() {
        return (Language[]) $VALUES.clone();
    }
}

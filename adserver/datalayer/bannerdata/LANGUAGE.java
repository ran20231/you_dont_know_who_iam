package com.forsale.adserver.datalayer.bannerdata;

import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class LANGUAGE {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ LANGUAGE[] $VALUES;
    public static final LANGUAGE AR = new LANGUAGE("AR", 0, SearchPlaceholderKeywordEntity.AR);
    public static final LANGUAGE EN = new LANGUAGE("EN", 1, SearchPlaceholderKeywordEntity.EN);

    private static final /* synthetic */ LANGUAGE[] $values() {
        return new LANGUAGE[]{AR, EN};
    }

    static {
        LANGUAGE[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LANGUAGE(String str, int i11, String str2) {
    }

    public static a00.a<LANGUAGE> getEntries() {
        return $ENTRIES;
    }

    public static LANGUAGE valueOf(String str) {
        return (LANGUAGE) Enum.valueOf(LANGUAGE.class, str);
    }

    public static LANGUAGE[] values() {
        return (LANGUAGE[]) $VALUES.clone();
    }
}

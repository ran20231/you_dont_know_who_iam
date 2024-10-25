package com.forsale.app.utils;

import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Languages.kt */
/* loaded from: classes3.dex */
public final class Languages {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ Languages[] $VALUES;
    public static final a Companion;
    private static final Languages DEFAULT;
    private static final Map<String, Languages> map;
    private final String value;
    @up.c(SearchPlaceholderKeywordEntity.AR)
    public static final Languages ARABIC = new Languages("ARABIC", 0, SearchPlaceholderKeywordEntity.AR);
    @up.c(SearchPlaceholderKeywordEntity.EN)
    public static final Languages ENGLISH = new Languages("ENGLISH", 1, SearchPlaceholderKeywordEntity.EN);

    /* compiled from: Languages.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Languages a(String language) {
            kotlin.jvm.internal.o.i(language, "language");
            Languages languages = (Languages) Languages.map.get(language);
            if (languages == null) {
                return c();
            }
            return languages;
        }

        public final Languages b() {
            return LocaleManager.f39597a.g();
        }

        public final Languages c() {
            return Languages.DEFAULT;
        }
    }

    private static final /* synthetic */ Languages[] $values() {
        return new Languages[]{ARABIC, ENGLISH};
    }

    static {
        int e11;
        int d11;
        Languages[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        Languages[] values = values();
        e11 = kotlin.collections.i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (Languages languages : values) {
            linkedHashMap.put(languages.value, languages);
        }
        map = linkedHashMap;
        DEFAULT = ENGLISH;
    }

    private Languages(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<Languages> getEntries() {
        return $ENTRIES;
    }

    public static Languages valueOf(String str) {
        return (Languages) Enum.valueOf(Languages.class, str);
    }

    public static Languages[] values() {
        return (Languages[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

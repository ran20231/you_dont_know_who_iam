package com.forsale.app.utils.analytics;

import com.forsale.app.utils.Languages;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class LanguageAWS {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ LanguageAWS[] $VALUES;
    public static final a Companion;
    private static final Map<String, LanguageAWS> map;
    private final String value;
    public static final LanguageAWS ENGLISH = new LanguageAWS("ENGLISH", 0, "English");
    public static final LanguageAWS ARABIC = new LanguageAWS("ARABIC", 1, "Arabic");

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LanguageAWS a(Languages type) {
            o.i(type, "type");
            Object obj = LanguageAWS.map.get(type.name());
            o.f(obj);
            return (LanguageAWS) obj;
        }
    }

    private static final /* synthetic */ LanguageAWS[] $values() {
        return new LanguageAWS[]{ENGLISH, ARABIC};
    }

    static {
        int e11;
        int d11;
        LanguageAWS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        LanguageAWS[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (LanguageAWS languageAWS : values) {
            linkedHashMap.put(languageAWS.name(), languageAWS);
        }
        map = linkedHashMap;
    }

    private LanguageAWS(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<LanguageAWS> getEntries() {
        return $ENTRIES;
    }

    public static LanguageAWS valueOf(String str) {
        return (LanguageAWS) Enum.valueOf(LanguageAWS.class, str);
    }

    public static LanguageAWS[] values() {
        return (LanguageAWS[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

package com.forsale.app.utils.analytics;

import com.forsale.app.datalayer.repositories.TranslationRepository;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class TranslationAWS {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ TranslationAWS[] $VALUES;
    public static final a Companion;
    private static final Map<String, TranslationAWS> map;
    private final String value;
    public static final TranslationAWS ORIGINAL = new TranslationAWS("ORIGINAL", 0, "Original");
    public static final TranslationAWS ENGLISH = new TranslationAWS("ENGLISH", 1, "English");
    public static final TranslationAWS ARABIC = new TranslationAWS("ARABIC", 2, "Arabic");

    /* compiled from: Models.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TranslationAWS a(TranslationRepository.Translation type) {
            o.i(type, "type");
            Object obj = TranslationAWS.map.get(type.name());
            o.f(obj);
            return (TranslationAWS) obj;
        }
    }

    private static final /* synthetic */ TranslationAWS[] $values() {
        return new TranslationAWS[]{ORIGINAL, ENGLISH, ARABIC};
    }

    static {
        int e11;
        int d11;
        TranslationAWS[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        TranslationAWS[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (TranslationAWS translationAWS : values) {
            linkedHashMap.put(translationAWS.name(), translationAWS);
        }
        map = linkedHashMap;
    }

    private TranslationAWS(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<TranslationAWS> getEntries() {
        return $ENTRIES;
    }

    public static TranslationAWS valueOf(String str) {
        return (TranslationAWS) Enum.valueOf(TranslationAWS.class, str);
    }

    public static TranslationAWS[] values() {
        return (TranslationAWS[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

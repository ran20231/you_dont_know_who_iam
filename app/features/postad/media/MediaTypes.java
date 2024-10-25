package com.forsale.app.features.postad.media;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaTypes.kt */
/* loaded from: classes2.dex */
public final class MediaTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MediaTypes[] $VALUES;
    public static final a Companion;
    private static final Map<String, MediaTypes> map;
    public static final MediaTypes IMAGES = new MediaTypes("IMAGES", 0, "IMAGES");
    public static final MediaTypes VIDEO = new MediaTypes("VIDEO", 1, "VIDEO");
    public static final MediaTypes NON = new MediaTypes("NON", 2, "NON");

    /* compiled from: MediaTypes.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MediaTypes a(String value) {
            o.i(value, "value");
            Object obj = MediaTypes.map.get(value);
            o.f(obj);
            return (MediaTypes) obj;
        }
    }

    private static final /* synthetic */ MediaTypes[] $values() {
        return new MediaTypes[]{IMAGES, VIDEO, NON};
    }

    static {
        int e11;
        int d11;
        MediaTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        MediaTypes[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (MediaTypes mediaTypes : values) {
            linkedHashMap.put(mediaTypes.name(), mediaTypes);
        }
        map = linkedHashMap;
    }

    private MediaTypes(String str, int i11, String str2) {
    }

    public static a00.a<MediaTypes> getEntries() {
        return $ENTRIES;
    }

    public static MediaTypes valueOf(String str) {
        return (MediaTypes) Enum.valueOf(MediaTypes.class, str);
    }

    public static MediaTypes[] values() {
        return (MediaTypes[]) $VALUES.clone();
    }
}

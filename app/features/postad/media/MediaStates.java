package com.forsale.app.features.postad.media;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaStates.kt */
/* loaded from: classes2.dex */
public final class MediaStates {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MediaStates[] $VALUES;
    public static final MediaStates LOADING = new MediaStates("LOADING", 0);
    public static final MediaStates SUCCESS = new MediaStates("SUCCESS", 1);
    public static final MediaStates FAILED = new MediaStates("FAILED", 2);
    public static final MediaStates INITIAL = new MediaStates("INITIAL", 3);
    public static final MediaStates RETRY = new MediaStates("RETRY", 4);

    private static final /* synthetic */ MediaStates[] $values() {
        return new MediaStates[]{LOADING, SUCCESS, FAILED, INITIAL, RETRY};
    }

    static {
        MediaStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MediaStates(String str, int i11) {
    }

    public static a<MediaStates> getEntries() {
        return $ENTRIES;
    }

    public static MediaStates valueOf(String str) {
        return (MediaStates) Enum.valueOf(MediaStates.class, str);
    }

    public static MediaStates[] values() {
        return (MediaStates[]) $VALUES.clone();
    }
}

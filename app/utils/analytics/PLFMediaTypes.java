package com.forsale.app.utils.analytics;

import com.leanplum.internal.Constants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class PLFMediaTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PLFMediaTypes[] $VALUES;
    public static final PLFMediaTypes IMAGE = new PLFMediaTypes("IMAGE", 0, Constants.Keys.INBOX_IMAGE);
    public static final PLFMediaTypes VIDEO = new PLFMediaTypes("VIDEO", 1, "Video");
    private final String value;

    private static final /* synthetic */ PLFMediaTypes[] $values() {
        return new PLFMediaTypes[]{IMAGE, VIDEO};
    }

    static {
        PLFMediaTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PLFMediaTypes(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PLFMediaTypes> getEntries() {
        return $ENTRIES;
    }

    public static PLFMediaTypes valueOf(String str) {
        return (PLFMediaTypes) Enum.valueOf(PLFMediaTypes.class, str);
    }

    public static PLFMediaTypes[] values() {
        return (PLFMediaTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

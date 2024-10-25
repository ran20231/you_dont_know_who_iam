package com.forsale.app.base;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ViewStates.kt */
/* loaded from: classes2.dex */
public final class ViewStates {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ViewStates[] $VALUES;
    public static final ViewStates CONTENT = new ViewStates("CONTENT", 0);
    public static final ViewStates LOADING = new ViewStates("LOADING", 1);
    public static final ViewStates ERROR = new ViewStates("ERROR", 2);
    public static final ViewStates Empty = new ViewStates("Empty", 3);
    public static final ViewStates CONNECTION_ERROR = new ViewStates("CONNECTION_ERROR", 4);
    public static final ViewStates RETRY_ERROR = new ViewStates("RETRY_ERROR", 5);
    public static final ViewStates RETRY_CONNECTION_ERROR = new ViewStates("RETRY_CONNECTION_ERROR", 6);
    public static final ViewStates INITIAL = new ViewStates("INITIAL", 7);

    private static final /* synthetic */ ViewStates[] $values() {
        return new ViewStates[]{CONTENT, LOADING, ERROR, Empty, CONNECTION_ERROR, RETRY_ERROR, RETRY_CONNECTION_ERROR, INITIAL};
    }

    static {
        ViewStates[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ViewStates(String str, int i11) {
    }

    public static a<ViewStates> getEntries() {
        return $ENTRIES;
    }

    public static ViewStates valueOf(String str) {
        return (ViewStates) Enum.valueOf(ViewStates.class, str);
    }

    public static ViewStates[] values() {
        return (ViewStates[]) $VALUES.clone();
    }
}

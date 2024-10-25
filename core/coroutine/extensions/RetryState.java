package com.forsale.core.coroutine.extensions;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetryMechanism.kt */
/* loaded from: classes3.dex */
public final class RetryState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ RetryState[] $VALUES;
    public static final RetryState RETRY = new RetryState("RETRY", 0);
    public static final RetryState CONTINUE_SILENT = new RetryState("CONTINUE_SILENT", 1);
    public static final RetryState DONE = new RetryState("DONE", 2);

    private static final /* synthetic */ RetryState[] $values() {
        return new RetryState[]{RETRY, CONTINUE_SILENT, DONE};
    }

    static {
        RetryState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RetryState(String str, int i11) {
    }

    public static a<RetryState> getEntries() {
        return $ENTRIES;
    }

    public static RetryState valueOf(String str) {
        return (RetryState) Enum.valueOf(RetryState.class, str);
    }

    public static RetryState[] values() {
        return (RetryState[]) $VALUES.clone();
    }
}

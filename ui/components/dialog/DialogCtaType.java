package com.forsale.ui.components.dialog;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Dialog.kt */
/* loaded from: classes3.dex */
public final class DialogCtaType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DialogCtaType[] $VALUES;
    public static final DialogCtaType None = new DialogCtaType("None", 0);
    public static final DialogCtaType OneAction = new DialogCtaType("OneAction", 1);
    public static final DialogCtaType Vertical = new DialogCtaType("Vertical", 2);
    public static final DialogCtaType Horizontal = new DialogCtaType("Horizontal", 3);

    private static final /* synthetic */ DialogCtaType[] $values() {
        return new DialogCtaType[]{None, OneAction, Vertical, Horizontal};
    }

    static {
        DialogCtaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DialogCtaType(String str, int i11) {
    }

    public static a<DialogCtaType> getEntries() {
        return $ENTRIES;
    }

    public static DialogCtaType valueOf(String str) {
        return (DialogCtaType) Enum.valueOf(DialogCtaType.class, str);
    }

    public static DialogCtaType[] values() {
        return (DialogCtaType[]) $VALUES.clone();
    }
}

package com.forsale.designSystem.notificationsystem.tooltip;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TooltipData.kt */
/* loaded from: classes3.dex */
public final class PopupState {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PopupState[] $VALUES;
    public static final PopupState Visible = new PopupState("Visible", 0);
    public static final PopupState Hidden = new PopupState("Hidden", 1);

    private static final /* synthetic */ PopupState[] $values() {
        return new PopupState[]{Visible, Hidden};
    }

    static {
        PopupState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PopupState(String str, int i11) {
    }

    public static a<PopupState> getEntries() {
        return $ENTRIES;
    }

    public static PopupState valueOf(String str) {
        return (PopupState) Enum.valueOf(PopupState.class, str);
    }

    public static PopupState[] values() {
        return (PopupState[]) $VALUES.clone();
    }

    public final PopupState toggleState() {
        PopupState popupState = Visible;
        if (this == popupState) {
            return Hidden;
        }
        return popupState;
    }
}

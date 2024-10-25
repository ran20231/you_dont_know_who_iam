package com.forsale.app.base;

import a00.a;
import t9.r0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ActionViewsMode.kt */
/* loaded from: classes2.dex */
public final class ActionViewsMode {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ActionViewsMode[] $VALUES;
    private final int viewId;
    public static final ActionViewsMode ERROR_RELOAD = new ActionViewsMode("ERROR_RELOAD", 0, r0.X2);
    public static final ActionViewsMode ERROR_REFRESH = new ActionViewsMode("ERROR_REFRESH", 1, r0.W2);
    public static final ActionViewsMode BTN_RELOAD = new ActionViewsMode("BTN_RELOAD", 2, r0.D1);
    public static final ActionViewsMode MAINTENANCE_RELOAD = new ActionViewsMode("MAINTENANCE_RELOAD", 3, r0.Q5);
    public static final ActionViewsMode BTN_GO_TO_LOGIN_SCREEN = new ActionViewsMode("BTN_GO_TO_LOGIN_SCREEN", 4, r0.f70130x1);
    public static final ActionViewsMode MESSAGE_ERROR = new ActionViewsMode("MESSAGE_ERROR", 5, r0.U2);

    private static final /* synthetic */ ActionViewsMode[] $values() {
        return new ActionViewsMode[]{ERROR_RELOAD, ERROR_REFRESH, BTN_RELOAD, MAINTENANCE_RELOAD, BTN_GO_TO_LOGIN_SCREEN, MESSAGE_ERROR};
    }

    static {
        ActionViewsMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ActionViewsMode(String str, int i11, int i12) {
        this.viewId = i12;
    }

    public static a<ActionViewsMode> getEntries() {
        return $ENTRIES;
    }

    public static ActionViewsMode valueOf(String str) {
        return (ActionViewsMode) Enum.valueOf(ActionViewsMode.class, str);
    }

    public static ActionViewsMode[] values() {
        return (ActionViewsMode[]) $VALUES.clone();
    }

    public final int getViewId() {
        return this.viewId;
    }
}

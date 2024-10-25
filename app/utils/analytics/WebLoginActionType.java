package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class WebLoginActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ WebLoginActionType[] $VALUES;
    private final String value;
    public static final WebLoginActionType STARTED = new WebLoginActionType("STARTED", 0, "Started");
    public static final WebLoginActionType LOG_OUT = new WebLoginActionType("LOG_OUT", 1, "Logout");
    public static final WebLoginActionType LOGOUT_ALL = new WebLoginActionType("LOGOUT_ALL", 2, "LogoutAll");

    private static final /* synthetic */ WebLoginActionType[] $values() {
        return new WebLoginActionType[]{STARTED, LOG_OUT, LOGOUT_ALL};
    }

    static {
        WebLoginActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private WebLoginActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<WebLoginActionType> getEntries() {
        return $ENTRIES;
    }

    public static WebLoginActionType valueOf(String str) {
        return (WebLoginActionType) Enum.valueOf(WebLoginActionType.class, str);
    }

    public static WebLoginActionType[] values() {
        return (WebLoginActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

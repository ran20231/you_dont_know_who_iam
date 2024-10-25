package com.forsale.app.utils.analytics.auth.logout;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogoutAnalyticsEvents.kt */
/* loaded from: classes3.dex */
public final class LogoutAnalyticsEvents {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ LogoutAnalyticsEvents[] $VALUES;
    private final String eventName;
    public static final LogoutAnalyticsEvents ACCOUNT_DETAILS_LOGOUT_CLICKED = new LogoutAnalyticsEvents("ACCOUNT_DETAILS_LOGOUT_CLICKED", 0, "Account Details Logout Clicked");
    public static final LogoutAnalyticsEvents LOGOUT_CLICKED = new LogoutAnalyticsEvents("LOGOUT_CLICKED", 1, "Logout Clicked");
    public static final LogoutAnalyticsEvents LOGOUT_SAVE_AND_LOGOUT_CLICKED = new LogoutAnalyticsEvents("LOGOUT_SAVE_AND_LOGOUT_CLICKED", 2, "Logout Save And Logout Clicked");
    public static final LogoutAnalyticsEvents LOGOUT_DISCARD_AND_LOGOUT_CLICKED = new LogoutAnalyticsEvents("LOGOUT_DISCARD_AND_LOGOUT_CLICKED", 3, "Logout Discard And Logout Clicked");
    public static final LogoutAnalyticsEvents LOGOUT_CANCEL_CLICKED = new LogoutAnalyticsEvents("LOGOUT_CANCEL_CLICKED", 4, "Logout Cancel Clicked");
    public static final LogoutAnalyticsEvents LOGOUT_CONFIRM_CLICKED = new LogoutAnalyticsEvents("LOGOUT_CONFIRM_CLICKED", 5, "Logout Confirm Clicked");

    private static final /* synthetic */ LogoutAnalyticsEvents[] $values() {
        return new LogoutAnalyticsEvents[]{ACCOUNT_DETAILS_LOGOUT_CLICKED, LOGOUT_CLICKED, LOGOUT_SAVE_AND_LOGOUT_CLICKED, LOGOUT_DISCARD_AND_LOGOUT_CLICKED, LOGOUT_CANCEL_CLICKED, LOGOUT_CONFIRM_CLICKED};
    }

    static {
        LogoutAnalyticsEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LogoutAnalyticsEvents(String str, int i11, String str2) {
        this.eventName = str2;
    }

    public static a<LogoutAnalyticsEvents> getEntries() {
        return $ENTRIES;
    }

    public static LogoutAnalyticsEvents valueOf(String str) {
        return (LogoutAnalyticsEvents) Enum.valueOf(LogoutAnalyticsEvents.class, str);
    }

    public static LogoutAnalyticsEvents[] values() {
        return (LogoutAnalyticsEvents[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}

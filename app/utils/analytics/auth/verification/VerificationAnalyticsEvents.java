package com.forsale.app.utils.analytics.auth.verification;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationAnalyticsEvents.kt */
/* loaded from: classes3.dex */
public final class VerificationAnalyticsEvents {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ VerificationAnalyticsEvents[] $VALUES;
    private final String eventName;
    public static final VerificationAnalyticsEvents SIGNUP_VERIFY_VISITED_EVENT = new VerificationAnalyticsEvents("SIGNUP_VERIFY_VISITED_EVENT", 0, "Signup Verify Visited");
    public static final VerificationAnalyticsEvents SIGNUP_SUCCEEDED_EVENT = new VerificationAnalyticsEvents("SIGNUP_SUCCEEDED_EVENT", 1, "Signup Succeeded");
    public static final VerificationAnalyticsEvents RESEND_VERIFICATION_CODE_CLICKED_EVENT = new VerificationAnalyticsEvents("RESEND_VERIFICATION_CODE_CLICKED_EVENT", 2, "Resend Verification Code Clicked");
    public static final VerificationAnalyticsEvents NEED_HELP_CLICKED_EVENT = new VerificationAnalyticsEvents("NEED_HELP_CLICKED_EVENT", 3, "Need Help Clicked");
    public static final VerificationAnalyticsEvents FORGET_PASSWORD_CODE_VISITED_EVENT = new VerificationAnalyticsEvents("FORGET_PASSWORD_CODE_VISITED_EVENT", 4, "Forget Password Code Visited");

    private static final /* synthetic */ VerificationAnalyticsEvents[] $values() {
        return new VerificationAnalyticsEvents[]{SIGNUP_VERIFY_VISITED_EVENT, SIGNUP_SUCCEEDED_EVENT, RESEND_VERIFICATION_CODE_CLICKED_EVENT, NEED_HELP_CLICKED_EVENT, FORGET_PASSWORD_CODE_VISITED_EVENT};
    }

    static {
        VerificationAnalyticsEvents[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private VerificationAnalyticsEvents(String str, int i11, String str2) {
        this.eventName = str2;
    }

    public static a<VerificationAnalyticsEvents> getEntries() {
        return $ENTRIES;
    }

    public static VerificationAnalyticsEvents valueOf(String str) {
        return (VerificationAnalyticsEvents) Enum.valueOf(VerificationAnalyticsEvents.class, str);
    }

    public static VerificationAnalyticsEvents[] values() {
        return (VerificationAnalyticsEvents[]) $VALUES.clone();
    }

    public final String getEventName() {
        return this.eventName;
    }
}

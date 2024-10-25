package com.forsale.app.features.auth.utils;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ComponentsTags.kt */
/* loaded from: classes2.dex */
public final class ComponentsTags {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ComponentsTags[] $VALUES;
    private final String tag;
    public static final ComponentsTags PHONE_FILED = new ComponentsTags("PHONE_FILED", 0, "phoneNumberField");
    public static final ComponentsTags PASSWORD_FIELD = new ComponentsTags("PASSWORD_FIELD", 1, "passwordField");
    public static final ComponentsTags PASSWORD_CONFIRMATION_FIELD = new ComponentsTags("PASSWORD_CONFIRMATION_FIELD", 2, "passwordConfirmationField");
    public static final ComponentsTags NAME_FILED = new ComponentsTags("NAME_FILED", 3, "nameField");
    public static final ComponentsTags EMAIL_FILED = new ComponentsTags("EMAIL_FILED", 4, "emailField");
    public static final ComponentsTags OTP_FILED = new ComponentsTags("OTP_FILED", 5, "otpField");
    public static final ComponentsTags PHONE_NUMBER_VALIDATION_MESSAGE = new ComponentsTags("PHONE_NUMBER_VALIDATION_MESSAGE", 6, "phoneNumberValidationMessage");
    public static final ComponentsTags PASSWORD_VALIDATION_MESSAGE = new ComponentsTags("PASSWORD_VALIDATION_MESSAGE", 7, "passwordValidationMessage");
    public static final ComponentsTags NAME_VALIDATION_MESSAGE = new ComponentsTags("NAME_VALIDATION_MESSAGE", 8, "nameValidationMessage");
    public static final ComponentsTags EMAIL_VALIDATION_MESSAGE = new ComponentsTags("EMAIL_VALIDATION_MESSAGE", 9, "emailValidationMessage");
    public static final ComponentsTags FEED_BACK_SNACK_BAR = new ComponentsTags("FEED_BACK_SNACK_BAR", 10, "feedback");
    public static final ComponentsTags FORGOT_PASSWORD_BUTTON = new ComponentsTags("FORGOT_PASSWORD_BUTTON", 11, "forgetPasswordBtn");
    public static final ComponentsTags RESET_PASSWORD_BUTTON = new ComponentsTags("RESET_PASSWORD_BUTTON", 12, "resetPasswordButton");
    public static final ComponentsTags SIGN_UP_BUTTON = new ComponentsTags("SIGN_UP_BUTTON", 13, "signupBtn");
    public static final ComponentsTags LOGIN_BUTTON = new ComponentsTags("LOGIN_BUTTON", 14, "loginBtn");
    public static final ComponentsTags TERMS_AND_CONDITIONS_BUTTON = new ComponentsTags("TERMS_AND_CONDITIONS_BUTTON", 15, "temsAndConditionsBtn");
    public static final ComponentsTags CHANGE_PHONE_NUMBER_BUTTON = new ComponentsTags("CHANGE_PHONE_NUMBER_BUTTON", 16, "changePhoneNumberButton");
    public static final ComponentsTags VERIFY_OTP_BUTTON = new ComponentsTags("VERIFY_OTP_BUTTON", 17, "verifyOtpButton");
    public static final ComponentsTags WHATS_APP_BUTTON = new ComponentsTags("WHATS_APP_BUTTON", 18, "whatsAppButton");
    public static final ComponentsTags SMS_BUTTON = new ComponentsTags("SMS_BUTTON", 19, "smsButton");
    public static final ComponentsTags PHONE_CALL_BUTTON = new ComponentsTags("PHONE_CALL_BUTTON", 20, "phoneCallButton");
    public static final ComponentsTags NEED_HELP_BUTTON = new ComponentsTags("NEED_HELP_BUTTON", 21, "needHelpButton");

    private static final /* synthetic */ ComponentsTags[] $values() {
        return new ComponentsTags[]{PHONE_FILED, PASSWORD_FIELD, PASSWORD_CONFIRMATION_FIELD, NAME_FILED, EMAIL_FILED, OTP_FILED, PHONE_NUMBER_VALIDATION_MESSAGE, PASSWORD_VALIDATION_MESSAGE, NAME_VALIDATION_MESSAGE, EMAIL_VALIDATION_MESSAGE, FEED_BACK_SNACK_BAR, FORGOT_PASSWORD_BUTTON, RESET_PASSWORD_BUTTON, SIGN_UP_BUTTON, LOGIN_BUTTON, TERMS_AND_CONDITIONS_BUTTON, CHANGE_PHONE_NUMBER_BUTTON, VERIFY_OTP_BUTTON, WHATS_APP_BUTTON, SMS_BUTTON, PHONE_CALL_BUTTON, NEED_HELP_BUTTON};
    }

    static {
        ComponentsTags[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ComponentsTags(String str, int i11, String str2) {
        this.tag = str2;
    }

    public static a<ComponentsTags> getEntries() {
        return $ENTRIES;
    }

    public static ComponentsTags valueOf(String str) {
        return (ComponentsTags) Enum.valueOf(ComponentsTags.class, str);
    }

    public static ComponentsTags[] values() {
        return (ComponentsTags[]) $VALUES.clone();
    }

    public final String getTag() {
        return this.tag;
    }
}

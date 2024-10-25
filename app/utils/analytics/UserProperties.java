package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserProperties.kt */
/* loaded from: classes3.dex */
public final class UserProperties {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ UserProperties[] $VALUES;
    private final String value;
    public static final UserProperties PHONE_NUMBER = new UserProperties("PHONE_NUMBER", 0, "Phone Number");
    public static final UserProperties FREE_CREDITS = new UserProperties("FREE_CREDITS", 1, "Free Credits");
    public static final UserProperties PREMIUM_CREDITS = new UserProperties("PREMIUM_CREDITS", 2, "Premium Credits");
    public static final UserProperties FIRST_NAME = new UserProperties("FIRST_NAME", 3, "First Name");
    public static final UserProperties LAST_NAME = new UserProperties("LAST_NAME", 4, "Last Name");
    public static final UserProperties EMAIL = new UserProperties("EMAIL", 5, "Email");
    public static final UserProperties GENDER = new UserProperties("GENDER", 6, "Gender");
    public static final UserProperties REGISTRATION_STATUS = new UserProperties("REGISTRATION_STATUS", 7, "Registration Status");
    public static final UserProperties SELECTED_COUNTRY = new UserProperties("SELECTED_COUNTRY", 8, "Selected Country");
    public static final UserProperties SELECTED_COUNTRY_ID = new UserProperties("SELECTED_COUNTRY_ID", 9, "Selected Country ID");
    public static final UserProperties SELECTED_APP_LANGUAGE = new UserProperties("SELECTED_APP_LANGUAGE", 10, "Selected App Language");
    public static final UserProperties DEVICE_SIZE = new UserProperties("DEVICE_SIZE", 11, "DeviceSize");
    public static final UserProperties IsEnablePushNotification = new UserProperties("IsEnablePushNotification", 12, "IsEnablePushNotification");
    public static final UserProperties IS_DARK_MODE_ENABLED = new UserProperties("IS_DARK_MODE_ENABLED", 13, "IsDarkModeEnabled");

    private static final /* synthetic */ UserProperties[] $values() {
        return new UserProperties[]{PHONE_NUMBER, FREE_CREDITS, PREMIUM_CREDITS, FIRST_NAME, LAST_NAME, EMAIL, GENDER, REGISTRATION_STATUS, SELECTED_COUNTRY, SELECTED_COUNTRY_ID, SELECTED_APP_LANGUAGE, DEVICE_SIZE, IsEnablePushNotification, IS_DARK_MODE_ENABLED};
    }

    static {
        UserProperties[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private UserProperties(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<UserProperties> getEntries() {
        return $ENTRIES;
    }

    public static UserProperties valueOf(String str) {
        return (UserProperties) Enum.valueOf(UserProperties.class, str);
    }

    public static UserProperties[] values() {
        return (UserProperties[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

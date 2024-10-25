package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class ProfileActionType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ProfileActionType[] $VALUES;
    private final String value;
    public static final ProfileActionType EDIT_STARTED = new ProfileActionType("EDIT_STARTED", 0, "EditStarted");
    public static final ProfileActionType EDIT_SAVED = new ProfileActionType("EDIT_SAVED", 1, "EditSaved");
    public static final ProfileActionType EMAIL_VERIFY_CLICKED = new ProfileActionType("EMAIL_VERIFY_CLICKED", 2, "EmailVerifyClicked");
    public static final ProfileActionType IMAGE_EDITED = new ProfileActionType("IMAGE_EDITED", 3, "ImageEdited");

    private static final /* synthetic */ ProfileActionType[] $values() {
        return new ProfileActionType[]{EDIT_STARTED, EDIT_SAVED, EMAIL_VERIFY_CLICKED, IMAGE_EDITED};
    }

    static {
        ProfileActionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ProfileActionType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<ProfileActionType> getEntries() {
        return $ENTRIES;
    }

    public static ProfileActionType valueOf(String str) {
        return (ProfileActionType) Enum.valueOf(ProfileActionType.class, str);
    }

    public static ProfileActionType[] values() {
        return (ProfileActionType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

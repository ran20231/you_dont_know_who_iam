package com.forsale.app.features.auth.interactors.validationinteractors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import t9.y0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValidationMessages.kt */
/* loaded from: classes2.dex */
public final class ValidationMessages {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ValidationMessages[] $VALUES;
    private final Integer errorMessageRes;
    public static final ValidationMessages InvalidPhoneNumber = new ValidationMessages("InvalidPhoneNumber", 0, Integer.valueOf(y0.f70776z0));
    public static final ValidationMessages EmptyPhoneNumberField = new ValidationMessages("EmptyPhoneNumberField", 1, Integer.valueOf(y0.f70696u0));
    public static final ValidationMessages InvalidPassword = new ValidationMessages("InvalidPassword", 2, Integer.valueOf(y0.f70760y0));
    public static final ValidationMessages InvalidConfirmPassword = new ValidationMessages("InvalidConfirmPassword", 3, Integer.valueOf(y0.f70712v0));
    public static final ValidationMessages EmptyPasswordField = new ValidationMessages("EmptyPasswordField", 4, Integer.valueOf(y0.f70680t0));
    public static final ValidationMessages EmptyOldPasswordField = new ValidationMessages("EmptyOldPasswordField", 5, Integer.valueOf(y0.L1));
    public static final ValidationMessages EmptyNewPasswordField = new ValidationMessages("EmptyNewPasswordField", 6, Integer.valueOf(y0.K1));
    public static final ValidationMessages EmptyConfirmPasswordField = new ValidationMessages("EmptyConfirmPasswordField", 7, Integer.valueOf(y0.J1));
    public static final ValidationMessages InvalidName = new ValidationMessages("InvalidName", 8, Integer.valueOf(y0.f70744x0));
    public static final ValidationMessages EmptyNameField = new ValidationMessages("EmptyNameField", 9, Integer.valueOf(y0.f70664s0));
    public static final ValidationMessages InvalidEmail = new ValidationMessages("InvalidEmail", 10, Integer.valueOf(y0.f70728w0));
    public static final ValidationMessages EmptyEmailField = new ValidationMessages("EmptyEmailField", 11, Integer.valueOf(y0.f70648r0));
    public static final ValidationMessages EmptyVerificationField = new ValidationMessages("EmptyVerificationField", 12, Integer.valueOf(y0.We));

    private static final /* synthetic */ ValidationMessages[] $values() {
        return new ValidationMessages[]{InvalidPhoneNumber, EmptyPhoneNumberField, InvalidPassword, InvalidConfirmPassword, EmptyPasswordField, EmptyOldPasswordField, EmptyNewPasswordField, EmptyConfirmPasswordField, InvalidName, EmptyNameField, InvalidEmail, EmptyEmailField, EmptyVerificationField};
    }

    static {
        ValidationMessages[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ValidationMessages(String str, int i11, Integer num) {
        this.errorMessageRes = num;
    }

    public static a00.a<ValidationMessages> getEntries() {
        return $ENTRIES;
    }

    public static ValidationMessages valueOf(String str) {
        return (ValidationMessages) Enum.valueOf(ValidationMessages.class, str);
    }

    public static ValidationMessages[] values() {
        return (ValidationMessages[]) $VALUES.clone();
    }

    public final Integer getErrorMessageRes() {
        return this.errorMessageRes;
    }

    /* synthetic */ ValidationMessages(String str, int i11, Integer num, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i11, (i12 & 1) != 0 ? null : num);
    }
}

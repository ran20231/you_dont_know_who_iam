package com.forsale.app.datalayer.network.requestsbodies;

import a00.a;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.google.gson.d;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SetPasswordBody.kt */
/* loaded from: classes2.dex */
public final class PasswordType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PasswordType[] $VALUES;
    @c("forget_password")
    public static final PasswordType FORGET_PASSWORD = new PasswordType("FORGET_PASSWORD", 0);
    @c("change_password")
    public static final PasswordType CHANGE_PASSWORD = new PasswordType("CHANGE_PASSWORD", 1);

    /* compiled from: SetPasswordBody.kt */
    /* loaded from: classes2.dex */
    public static final class SessionStatusTypeConverter {
        public static final int $stable = 0;

        public final PasswordType toSessionStatus(String str) {
            boolean z11;
            Object k11;
            if (str != null && str.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                k11 = null;
            } else {
                k11 = new d().k(str, PasswordType.class);
            }
            return (PasswordType) k11;
        }

        public final String toString(PasswordType passwordType) {
            return TopLevelUtilityFunctionsKt.f(passwordType);
        }
    }

    private static final /* synthetic */ PasswordType[] $values() {
        return new PasswordType[]{FORGET_PASSWORD, CHANGE_PASSWORD};
    }

    static {
        PasswordType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PasswordType(String str, int i11) {
    }

    public static a<PasswordType> getEntries() {
        return $ENTRIES;
    }

    public static PasswordType valueOf(String str) {
        return (PasswordType) Enum.valueOf(PasswordType.class, str);
    }

    public static PasswordType[] values() {
        return (PasswordType[]) $VALUES.clone();
    }
}

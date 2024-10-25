package com.forsale.app.datalayer.network.requestsbodies;

import a00.a;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.google.gson.d;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Gender.kt */
/* loaded from: classes2.dex */
public final class Gender {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ Gender[] $VALUES;
    @c("male")
    public static final Gender MALE = new Gender("MALE", 0);
    @c("female")
    public static final Gender FEMALE = new Gender("FEMALE", 1);
    public static final Gender NONE = new Gender("NONE", 2);

    /* compiled from: Gender.kt */
    /* loaded from: classes2.dex */
    public static final class GenderConverter {
        public static final int $stable = 0;

        public final Gender toGender(String str) {
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
                k11 = new d().k(str, Gender.class);
            }
            return (Gender) k11;
        }

        public final String toString(Gender gender) {
            return TopLevelUtilityFunctionsKt.f(gender);
        }
    }

    private static final /* synthetic */ Gender[] $values() {
        return new Gender[]{MALE, FEMALE, NONE};
    }

    static {
        Gender[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Gender(String str, int i11) {
    }

    public static a<Gender> getEntries() {
        return $ENTRIES;
    }

    public static Gender valueOf(String str) {
        return (Gender) Enum.valueOf(Gender.class, str);
    }

    public static Gender[] values() {
        return (Gender[]) $VALUES.clone();
    }
}

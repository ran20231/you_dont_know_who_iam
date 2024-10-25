package com.forsale.app.datalayer.network.entities;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: KnetPaymentStatus.kt */
/* loaded from: classes2.dex */
public final class KnetPaymentStatus {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ KnetPaymentStatus[] $VALUES;
    private final String value;
    @c("Success")
    public static final KnetPaymentStatus SUCCESS = new KnetPaymentStatus("SUCCESS", 0, "Success");
    @c("Fail")
    public static final KnetPaymentStatus FAIL = new KnetPaymentStatus("FAIL", 1, "Fail");
    @c("Incomplete")
    public static final KnetPaymentStatus INCOMPLETE = new KnetPaymentStatus("INCOMPLETE", 2, "Incomplete");

    private static final /* synthetic */ KnetPaymentStatus[] $values() {
        return new KnetPaymentStatus[]{SUCCESS, FAIL, INCOMPLETE};
    }

    static {
        KnetPaymentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private KnetPaymentStatus(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<KnetPaymentStatus> getEntries() {
        return $ENTRIES;
    }

    public static KnetPaymentStatus valueOf(String str) {
        return (KnetPaymentStatus) Enum.valueOf(KnetPaymentStatus.class, str);
    }

    public static KnetPaymentStatus[] values() {
        return (KnetPaymentStatus[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

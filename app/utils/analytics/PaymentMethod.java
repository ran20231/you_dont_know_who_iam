package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class PaymentMethod {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PaymentMethod[] $VALUES;
    private final String value;
    public static final PaymentMethod FREE = new PaymentMethod("FREE", 0, "Free");
    public static final PaymentMethod CREDIT = new PaymentMethod("CREDIT", 1, "Credit");
    public static final PaymentMethod KNET = new PaymentMethod("KNET", 2, "Knet");
    public static final PaymentMethod CREDIT_KNET = new PaymentMethod("CREDIT_KNET", 3, "Credit&Knet");

    private static final /* synthetic */ PaymentMethod[] $values() {
        return new PaymentMethod[]{FREE, CREDIT, KNET, CREDIT_KNET};
    }

    static {
        PaymentMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PaymentMethod(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PaymentMethod> getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethod valueOf(String str) {
        return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
    }

    public static PaymentMethod[] values() {
        return (PaymentMethod[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}

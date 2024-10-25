package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class LeadContentType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ LeadContentType[] $VALUES;
    public static final LeadContentType DRAFT = new LeadContentType("DRAFT", 0, "Draft");
    public static final LeadContentType PACKAGE = new LeadContentType("PACKAGE", 1, "Package");
    private final String value;

    private static final /* synthetic */ LeadContentType[] $values() {
        return new LeadContentType[]{DRAFT, PACKAGE};
    }

    static {
        LeadContentType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LeadContentType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<LeadContentType> getEntries() {
        return $ENTRIES;
    }

    public static LeadContentType valueOf(String str) {
        return (LeadContentType) Enum.valueOf(LeadContentType.class, str);
    }

    public static LeadContentType[] values() {
        return (LeadContentType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}

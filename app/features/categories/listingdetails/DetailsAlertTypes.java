package com.forsale.app.features.categories.listingdetails;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DetailsAlertTypes.kt */
/* loaded from: classes2.dex */
public final class DetailsAlertTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ DetailsAlertTypes[] $VALUES;
    public static final DetailsAlertTypes MEDIA_FAILED_ERROR = new DetailsAlertTypes("MEDIA_FAILED_ERROR", 0);
    public static final DetailsAlertTypes ATTEMPT_ABUSE_ERROR = new DetailsAlertTypes("ATTEMPT_ABUSE_ERROR", 1);
    public static final DetailsAlertTypes NON = new DetailsAlertTypes("NON", 2);

    private static final /* synthetic */ DetailsAlertTypes[] $values() {
        return new DetailsAlertTypes[]{MEDIA_FAILED_ERROR, ATTEMPT_ABUSE_ERROR, NON};
    }

    static {
        DetailsAlertTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DetailsAlertTypes(String str, int i11) {
    }

    public static a00.a<DetailsAlertTypes> getEntries() {
        return $ENTRIES;
    }

    public static DetailsAlertTypes valueOf(String str) {
        return (DetailsAlertTypes) Enum.valueOf(DetailsAlertTypes.class, str);
    }

    public static DetailsAlertTypes[] values() {
        return (DetailsAlertTypes[]) $VALUES.clone();
    }
}

package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class PLFScreenTypes {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PLFScreenTypes[] $VALUES;
    private final String value;
    public static final PLFScreenTypes MAIN_INFORMATION = new PLFScreenTypes("MAIN_INFORMATION", 0, "Main information");
    public static final PLFScreenTypes MEDIA = new PLFScreenTypes("MEDIA", 1, "Media");
    public static final PLFScreenTypes EXTRA_ATTRIBUTES = new PLFScreenTypes("EXTRA_ATTRIBUTES", 2, "Extra Attributes");
    public static final PLFScreenTypes SETTINGS = new PLFScreenTypes("SETTINGS", 3, "Settings");
    public static final PLFScreenTypes PLANS = new PLFScreenTypes("PLANS", 4, "Plans");
    public static final PLFScreenTypes ADDONS = new PLFScreenTypes("ADDONS", 5, "Addons");
    public static final PLFScreenTypes BUNDLES = new PLFScreenTypes("BUNDLES", 6, "Bundles");

    private static final /* synthetic */ PLFScreenTypes[] $values() {
        return new PLFScreenTypes[]{MAIN_INFORMATION, MEDIA, EXTRA_ATTRIBUTES, SETTINGS, PLANS, ADDONS, BUNDLES};
    }

    static {
        PLFScreenTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PLFScreenTypes(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PLFScreenTypes> getEntries() {
        return $ENTRIES;
    }

    public static PLFScreenTypes valueOf(String str) {
        return (PLFScreenTypes) Enum.valueOf(PLFScreenTypes.class, str);
    }

    public static PLFScreenTypes[] values() {
        return (PLFScreenTypes[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PromotedPostSource.kt */
/* loaded from: classes3.dex */
public final class PromotedPostSource {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ PromotedPostSource[] $VALUES;
    private final String value;
    public static final PromotedPostSource SUB_CATEGORY = new PromotedPostSource("SUB_CATEGORY", 0, "SubCategory");
    public static final PromotedPostSource LISTINGS = new PromotedPostSource("LISTINGS", 1, "Listings");

    private static final /* synthetic */ PromotedPostSource[] $values() {
        return new PromotedPostSource[]{SUB_CATEGORY, LISTINGS};
    }

    static {
        PromotedPostSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PromotedPostSource(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<PromotedPostSource> getEntries() {
        return $ENTRIES;
    }

    public static PromotedPostSource valueOf(String str) {
        return (PromotedPostSource) Enum.valueOf(PromotedPostSource.class, str);
    }

    public static PromotedPostSource[] values() {
        return (PromotedPostSource[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.value;
    }
}

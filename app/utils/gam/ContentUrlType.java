package com.forsale.app.utils.gam;

import a00.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContentUrlType.kt */
/* loaded from: classes3.dex */
public final class ContentUrlType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ContentUrlType[] $VALUES;
    public static final ContentUrlType HOME = new ContentUrlType("HOME", 0);
    public static final ContentUrlType CATEGORY = new ContentUrlType("CATEGORY", 1);
    public static final ContentUrlType LISTINGS = new ContentUrlType("LISTINGS", 2);
    public static final ContentUrlType LISTING_DETAILS = new ContentUrlType("LISTING_DETAILS", 3);

    private static final /* synthetic */ ContentUrlType[] $values() {
        return new ContentUrlType[]{HOME, CATEGORY, LISTINGS, LISTING_DETAILS};
    }

    static {
        ContentUrlType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ContentUrlType(String str, int i11) {
    }

    public static a<ContentUrlType> getEntries() {
        return $ENTRIES;
    }

    public static ContentUrlType valueOf(String str) {
        return (ContentUrlType) Enum.valueOf(ContentUrlType.class, str);
    }

    public static ContentUrlType[] values() {
        return (ContentUrlType[]) $VALUES.clone();
    }
}

package com.forsale.app.utils.analytics;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Models.kt */
/* loaded from: classes3.dex */
public final class LinkType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ LinkType[] $VALUES;
    public static final LinkType FACEBOOK = new LinkType("FACEBOOK", 0, "Facebook");
    public static final LinkType INSTAGRAM = new LinkType("INSTAGRAM", 1, "Instagram");
    public static final LinkType TWITTER = new LinkType("TWITTER", 2, "Twitter");
    public static final LinkType YOUTUBE = new LinkType("YOUTUBE", 3, "Youtube");
    private final String value;

    private static final /* synthetic */ LinkType[] $values() {
        return new LinkType[]{FACEBOOK, INSTAGRAM, TWITTER, YOUTUBE};
    }

    static {
        LinkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private LinkType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<LinkType> getEntries() {
        return $ENTRIES;
    }

    public static LinkType valueOf(String str) {
        return (LinkType) Enum.valueOf(LinkType.class, str);
    }

    public static LinkType[] values() {
        return (LinkType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

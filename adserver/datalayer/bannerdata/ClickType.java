package com.forsale.adserver.datalayer.bannerdata;

import com.leanplum.messagetemplates.MessageTemplateConstants;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: createBanner.kt */
/* loaded from: classes2.dex */
public final class ClickType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ ClickType[] $VALUES;
    private final String typeName;
    public static final ClickType VIEW = new ClickType("VIEW", 0, "view");
    public static final ClickType PHONE = new ClickType("PHONE", 1, "phone");
    public static final ClickType URL = new ClickType(MessageTemplateConstants.Args.URL, 2, "url");
    public static final ClickType LIKE = new ClickType("LIKE", 3, "like");
    public static final ClickType WHATSAPP = new ClickType("WHATSAPP", 4, "whatsapp");

    private static final /* synthetic */ ClickType[] $values() {
        return new ClickType[]{VIEW, PHONE, URL, LIKE, WHATSAPP};
    }

    static {
        ClickType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ClickType(String str, int i11, String str2) {
        this.typeName = str2;
    }

    public static a00.a<ClickType> getEntries() {
        return $ENTRIES;
    }

    public static ClickType valueOf(String str) {
        return (ClickType) Enum.valueOf(ClickType.class, str);
    }

    public static ClickType[] values() {
        return (ClickType[]) $VALUES.clone();
    }

    public final String getTypeName() {
        return this.typeName;
    }
}

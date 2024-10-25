package com.forsale.app.datalayer.database;

import a00.a;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: InAppType.kt */
/* loaded from: classes2.dex */
public final class InAppType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ InAppType[] $VALUES;
    @c("in-app")
    public static final InAppType IN_APP = new InAppType("IN_APP", 0, "in-app");
    @c("promoted-post")
    public static final InAppType PROMOTED_POST = new InAppType("PROMOTED_POST", 1, "promoted-post");
    private final String value;

    private static final /* synthetic */ InAppType[] $values() {
        return new InAppType[]{IN_APP, PROMOTED_POST};
    }

    static {
        InAppType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private InAppType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<InAppType> getEntries() {
        return $ENTRIES;
    }

    public static InAppType valueOf(String str) {
        return (InAppType) Enum.valueOf(InAppType.class, str);
    }

    public static InAppType[] values() {
        return (InAppType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

package com.forsale.app.features.postad.extraattributes.enums;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttributeSubtype.kt */
/* loaded from: classes2.dex */
public final class AttributeSubtype {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AttributeSubtype[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final AttributeSubtype VERTICAL = new AttributeSubtype("VERTICAL", 0, "vertical");
    public static final AttributeSubtype HORIZONTAL_FIXED = new AttributeSubtype("HORIZONTAL_FIXED", 1, "horizontal_fixed");
    public static final AttributeSubtype HORIZONTAL_VARIABLE = new AttributeSubtype("HORIZONTAL_VARIABLE", 2, "horizontal_variable");

    /* compiled from: AttributeSubtype.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ AttributeSubtype[] $values() {
        return new AttributeSubtype[]{VERTICAL, HORIZONTAL_FIXED, HORIZONTAL_VARIABLE};
    }

    static {
        AttributeSubtype[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AttributeSubtype(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AttributeSubtype> getEntries() {
        return $ENTRIES;
    }

    public static AttributeSubtype valueOf(String str) {
        return (AttributeSubtype) Enum.valueOf(AttributeSubtype.class, str);
    }

    public static AttributeSubtype[] values() {
        return (AttributeSubtype[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

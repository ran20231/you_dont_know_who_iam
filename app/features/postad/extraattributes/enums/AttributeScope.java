package com.forsale.app.features.postad.extraattributes.enums;

import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttributeScope.kt */
/* loaded from: classes2.dex */
public final class AttributeScope {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AttributeScope[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final AttributeScope LISTING = new AttributeScope("LISTING", 0, "listing");
    public static final AttributeScope CATEGORY = new AttributeScope("CATEGORY", 1, "category");

    /* compiled from: AttributeScope.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ AttributeScope[] $values() {
        return new AttributeScope[]{LISTING, CATEGORY};
    }

    static {
        AttributeScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AttributeScope(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AttributeScope> getEntries() {
        return $ENTRIES;
    }

    public static AttributeScope valueOf(String str) {
        return (AttributeScope) Enum.valueOf(AttributeScope.class, str);
    }

    public static AttributeScope[] values() {
        return (AttributeScope[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

package com.forsale.app.features.postad.extraattributes.enums;

import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AttributeType.kt */
/* loaded from: classes2.dex */
public final class AttributeType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AttributeType[] $VALUES;
    public static final a Companion;
    private final String value;
    public static final AttributeType NUMBER = new AttributeType("NUMBER", 0, "number");
    public static final AttributeType TEXT = new AttributeType("TEXT", 1, "text");
    public static final AttributeType DROP_DOWN = new AttributeType("DROP_DOWN", 2, "drop_down");
    public static final AttributeType BOOL = new AttributeType("BOOL", 3, "boolean");
    public static final AttributeType FILE = new AttributeType("FILE", 4, "file");

    /* compiled from: AttributeType.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AttributeType a(String type) {
            CharSequence Z0;
            CharSequence Z02;
            CharSequence Z03;
            CharSequence Z04;
            CharSequence Z05;
            CharSequence Z06;
            CharSequence Z07;
            CharSequence Z08;
            CharSequence Z09;
            CharSequence Z010;
            o.i(type, "type");
            Z0 = StringsKt__StringsKt.Z0(type);
            String obj = Z0.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj.toLowerCase(locale);
            o.h(lowerCase, "toLowerCase(...)");
            AttributeType attributeType = AttributeType.NUMBER;
            Z02 = StringsKt__StringsKt.Z0(attributeType.getValue());
            String lowerCase2 = Z02.toString().toLowerCase(locale);
            o.h(lowerCase2, "toLowerCase(...)");
            if (!o.d(lowerCase, lowerCase2)) {
                Z03 = StringsKt__StringsKt.Z0(type);
                String lowerCase3 = Z03.toString().toLowerCase(locale);
                o.h(lowerCase3, "toLowerCase(...)");
                AttributeType attributeType2 = AttributeType.TEXT;
                Z04 = StringsKt__StringsKt.Z0(attributeType2.getValue());
                String lowerCase4 = Z04.toString().toLowerCase(locale);
                o.h(lowerCase4, "toLowerCase(...)");
                if (!o.d(lowerCase3, lowerCase4)) {
                    Z05 = StringsKt__StringsKt.Z0(type);
                    String lowerCase5 = Z05.toString().toLowerCase(locale);
                    o.h(lowerCase5, "toLowerCase(...)");
                    attributeType2 = AttributeType.DROP_DOWN;
                    Z06 = StringsKt__StringsKt.Z0(attributeType2.getValue());
                    String lowerCase6 = Z06.toString().toLowerCase(locale);
                    o.h(lowerCase6, "toLowerCase(...)");
                    if (!o.d(lowerCase5, lowerCase6)) {
                        Z07 = StringsKt__StringsKt.Z0(type);
                        String lowerCase7 = Z07.toString().toLowerCase(locale);
                        o.h(lowerCase7, "toLowerCase(...)");
                        attributeType2 = AttributeType.BOOL;
                        Z08 = StringsKt__StringsKt.Z0(attributeType2.getValue());
                        String lowerCase8 = Z08.toString().toLowerCase(locale);
                        o.h(lowerCase8, "toLowerCase(...)");
                        if (!o.d(lowerCase7, lowerCase8)) {
                            Z09 = StringsKt__StringsKt.Z0(type);
                            String lowerCase9 = Z09.toString().toLowerCase(locale);
                            o.h(lowerCase9, "toLowerCase(...)");
                            AttributeType attributeType3 = AttributeType.FILE;
                            Z010 = StringsKt__StringsKt.Z0(attributeType3.getValue());
                            String lowerCase10 = Z010.toString().toLowerCase(locale);
                            o.h(lowerCase10, "toLowerCase(...)");
                            if (o.d(lowerCase9, lowerCase10)) {
                                return attributeType3;
                            }
                            return attributeType;
                        }
                    }
                }
                return attributeType2;
            }
            return attributeType;
        }
    }

    private static final /* synthetic */ AttributeType[] $values() {
        return new AttributeType[]{NUMBER, TEXT, DROP_DOWN, BOOL, FILE};
    }

    static {
        AttributeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
    }

    private AttributeType(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AttributeType> getEntries() {
        return $ENTRIES;
    }

    public static AttributeType valueOf(String str) {
        return (AttributeType) Enum.valueOf(AttributeType.class, str);
    }

    public static AttributeType[] values() {
        return (AttributeType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

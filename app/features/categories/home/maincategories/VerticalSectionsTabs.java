package com.forsale.app.features.categories.home.maincategories;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerticalSectionsTabs.kt */
/* loaded from: classes2.dex */
public final class VerticalSectionsTabs {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ VerticalSectionsTabs[] $VALUES;
    public static final a Companion;
    private static final Map<String, VerticalSectionsTabs> map;
    private final String value;
    public static final VerticalSectionsTabs TOP_USER_ADS = new VerticalSectionsTabs("TOP_USER_ADS", 0, "top_user_ads");
    public static final VerticalSectionsTabs TOP_COMMERCIAL_ADS = new VerticalSectionsTabs("TOP_COMMERCIAL_ADS", 1, "top_commerical_ads");

    /* compiled from: VerticalSectionsTabs.kt */
    /* loaded from: classes2.dex */
    public static final class a {

        /* compiled from: VerticalSectionsTabs.kt */
        /* renamed from: com.forsale.app.features.categories.home.maincategories.VerticalSectionsTabs$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0270a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f24403a;

            static {
                int[] iArr = new int[VerticalSectionsTabs.values().length];
                try {
                    iArr[VerticalSectionsTabs.TOP_USER_ADS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[VerticalSectionsTabs.TOP_COMMERCIAL_ADS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f24403a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final VerticalSectionsTabs a(String value) {
            o.i(value, "value");
            return (VerticalSectionsTabs) VerticalSectionsTabs.map.get(value);
        }

        public final String b(VerticalSectionsTabs verticalSectionsTabs) {
            o.i(verticalSectionsTabs, "<this>");
            int i11 = C0270a.f24403a[verticalSectionsTabs.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    return "Top Commercial Ads";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "Top User Ads";
        }
    }

    private static final /* synthetic */ VerticalSectionsTabs[] $values() {
        return new VerticalSectionsTabs[]{TOP_USER_ADS, TOP_COMMERCIAL_ADS};
    }

    static {
        int e11;
        int d11;
        VerticalSectionsTabs[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        VerticalSectionsTabs[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (VerticalSectionsTabs verticalSectionsTabs : values) {
            linkedHashMap.put(verticalSectionsTabs.value, verticalSectionsTabs);
        }
        map = linkedHashMap;
    }

    private VerticalSectionsTabs(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<VerticalSectionsTabs> getEntries() {
        return $ENTRIES;
    }

    public static VerticalSectionsTabs valueOf(String str) {
        return (VerticalSectionsTabs) Enum.valueOf(VerticalSectionsTabs.class, str);
    }

    public static VerticalSectionsTabs[] values() {
        return (VerticalSectionsTabs[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

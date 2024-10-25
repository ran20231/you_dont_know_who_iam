package com.forsale.app.utils.analytics;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m00.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnalyticsSourceAdPlatform.kt */
/* loaded from: classes3.dex */
public final class AnalyticsSourceAdPlatform {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AnalyticsSourceAdPlatform[] $VALUES;
    public static final a Companion;
    private static final Map<String, AnalyticsSourceAdPlatform> map;
    private final String value;
    public static final AnalyticsSourceAdPlatform FACEBOOK = new AnalyticsSourceAdPlatform("FACEBOOK", 0, "Facebook");
    public static final AnalyticsSourceAdPlatform YOUTUBE = new AnalyticsSourceAdPlatform("YOUTUBE", 1, "Youtube");
    public static final AnalyticsSourceAdPlatform GOOGLE = new AnalyticsSourceAdPlatform("GOOGLE", 2, "Google");
    public static final AnalyticsSourceAdPlatform GOOGLE_ADS = new AnalyticsSourceAdPlatform("GOOGLE_ADS", 3, "Google_Ads");
    public static final AnalyticsSourceAdPlatform LINKEDIN = new AnalyticsSourceAdPlatform("LINKEDIN", 4, "Linkedin");
    public static final AnalyticsSourceAdPlatform SNAPCHAT = new AnalyticsSourceAdPlatform("SNAPCHAT", 5, "Snapchat");
    public static final AnalyticsSourceAdPlatform INSTAGRAM = new AnalyticsSourceAdPlatform("INSTAGRAM", 6, "Instagram");

    /* compiled from: AnalyticsSourceAdPlatform.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static final /* synthetic */ AnalyticsSourceAdPlatform[] $values() {
        return new AnalyticsSourceAdPlatform[]{FACEBOOK, YOUTUBE, GOOGLE, GOOGLE_ADS, LINKEDIN, SNAPCHAT, INSTAGRAM};
    }

    static {
        int e11;
        int d11;
        AnalyticsSourceAdPlatform[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new a(null);
        AnalyticsSourceAdPlatform[] values = values();
        e11 = i0.e(values.length);
        d11 = o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (AnalyticsSourceAdPlatform analyticsSourceAdPlatform : values) {
            linkedHashMap.put(analyticsSourceAdPlatform.value, analyticsSourceAdPlatform);
        }
        map = linkedHashMap;
    }

    private AnalyticsSourceAdPlatform(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a00.a<AnalyticsSourceAdPlatform> getEntries() {
        return $ENTRIES;
    }

    public static AnalyticsSourceAdPlatform valueOf(String str) {
        return (AnalyticsSourceAdPlatform) Enum.valueOf(AnalyticsSourceAdPlatform.class, str);
    }

    public static AnalyticsSourceAdPlatform[] values() {
        return (AnalyticsSourceAdPlatform[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

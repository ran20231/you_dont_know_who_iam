package com.forsale.app.datalayer.network.entities.qrsessions;

import a00.a;
import com.leanplum.core.BuildConfig;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: QRRequestModels.kt */
/* loaded from: classes2.dex */
public final class BrowserType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ BrowserType[] $VALUES;
    private final int value;
    @c(BuildConfig.BUILD_NUMBER)
    public static final BrowserType CHROME = new BrowserType("CHROME", 0, 0);
    @c("1")
    public static final BrowserType SAFARI = new BrowserType("SAFARI", 1, 1);
    @c("2")
    public static final BrowserType FIREFOX = new BrowserType("FIREFOX", 2, 2);
    @c("3")
    public static final BrowserType OPERA = new BrowserType("OPERA", 3, 3);
    @c("4")
    public static final BrowserType IE = new BrowserType("IE", 4, 4);
    @c("5")
    public static final BrowserType OTHER = new BrowserType("OTHER", 5, 5);

    private static final /* synthetic */ BrowserType[] $values() {
        return new BrowserType[]{CHROME, SAFARI, FIREFOX, OPERA, IE, OTHER};
    }

    static {
        BrowserType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private BrowserType(String str, int i11, int i12) {
        this.value = i12;
    }

    public static a<BrowserType> getEntries() {
        return $ENTRIES;
    }

    public static BrowserType valueOf(String str) {
        return (BrowserType) Enum.valueOf(BrowserType.class, str);
    }

    public static BrowserType[] values() {
        return (BrowserType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}

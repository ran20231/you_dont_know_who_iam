package com.forsale.adserver.view.models;

import com.forsale.analytics.commercial.CommercialType;
import kotlin.NoWhenBranchMatchedException;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdType.kt */
/* loaded from: classes2.dex */
public final class AdType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    public static final AdType OFFER = new AdType("OFFER", 0);
    public static final AdType BANNER = new AdType("BANNER", 1);
    public static final AdType SPLASH = new AdType("SPLASH", 2);
    public static final AdType PIN = new AdType("PIN", 3);
    public static final AdType BUSINESS_COMMERCIAL = new AdType("BUSINESS_COMMERCIAL", 4);

    /* compiled from: AdType.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21049a;

        static {
            int[] iArr = new int[AdType.values().length];
            try {
                iArr[AdType.OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdType.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdType.SPLASH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AdType.PIN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AdType.BUSINESS_COMMERCIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f21049a = iArr;
        }
    }

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{OFFER, BANNER, SPLASH, PIN, BUSINESS_COMMERCIAL};
    }

    static {
        AdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private AdType(String str, int i11) {
    }

    public static a00.a<AdType> getEntries() {
        return $ENTRIES;
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) $VALUES.clone();
    }

    public final CommercialType toCommercialType() {
        int i11 = a.f21049a[ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return CommercialType.BUSINESS_COMMERCIAL;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return CommercialType.PIN;
                }
                return CommercialType.OFFER;
            }
            return CommercialType.BANNER;
        }
        return CommercialType.OFFER;
    }
}

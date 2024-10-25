package com.forsale.app.utils;
/* compiled from: DigitUtils.kt */
/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f40329a = new l();

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f40330b = {1632, 1633, 1634, 1635, 1636, 1637, 1638, 1639, 1640, 1641};

    /* renamed from: c  reason: collision with root package name */
    public static final int f40331c = 8;

    private l() {
    }

    public static final String a(String str) {
        boolean z11;
        if (str != null) {
            if (str.length() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                int length = str.length();
                char[] cArr = new char[length];
                for (int i11 = 0; i11 < length; i11++) {
                    cArr[i11] = c(str.charAt(i11));
                }
                return new String(cArr);
            }
            return "";
        }
        return "";
    }

    private static final char c(char c11) {
        int numericValue = Character.getNumericValue((int) c11);
        boolean z11 = false;
        if (numericValue >= 0 && numericValue < 10) {
            z11 = true;
        }
        if (z11) {
            return f40330b[numericValue];
        }
        return c11;
    }

    public final String b(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        return String.valueOf((int) Double.parseDouble(str));
    }
}

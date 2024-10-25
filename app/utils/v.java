package com.forsale.app.utils;

import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
/* compiled from: PhoneNumberParsing.kt */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final String f40544a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40545b;

    /* renamed from: c  reason: collision with root package name */
    public PhoneNumberUtil f40546c;

    /* compiled from: PhoneNumberParsing.kt */
    /* loaded from: classes3.dex */
    public interface a {
        v a(String str, String str2);
    }

    public v(String str, String str2) {
        this.f40544a = str;
        this.f40545b = str2;
    }

    public final PhoneNumberUtil a() {
        PhoneNumberUtil phoneNumberUtil = this.f40546c;
        if (phoneNumberUtil != null) {
            return phoneNumberUtil;
        }
        kotlin.jvm.internal.o.w("phoneNumberUtil");
        return null;
    }

    public final boolean b(String phoneNumber) {
        kotlin.jvm.internal.o.i(phoneNumber, "phoneNumber");
        if (this.f40545b != null) {
            return a().H(phoneNumber, this.f40545b);
        }
        return false;
    }

    public final String c(String phoneNumber) {
        String l11;
        kotlin.jvm.internal.o.i(phoneNumber, "phoneNumber");
        String str = this.f40544a;
        if (str != null && (l11 = TypeExtensionsKt.l(phoneNumber, str)) != null) {
            phoneNumber = l11;
        }
        try {
            return a().l(a().X(phoneNumber, this.f40545b), PhoneNumberUtil.PhoneNumberFormat.INTERNATIONAL);
        } catch (Exception unused) {
            return null;
        }
    }
}

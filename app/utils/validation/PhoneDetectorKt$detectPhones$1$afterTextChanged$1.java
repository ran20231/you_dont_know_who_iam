package com.forsale.app.utils.validation;

import g00.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
/* compiled from: PhoneDetector.kt */
/* loaded from: classes3.dex */
final class PhoneDetectorKt$detectPhones$1$afterTextChanged$1 extends Lambda implements l<String, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final PhoneDetectorKt$detectPhones$1$afterTextChanged$1 f40548a = new PhoneDetectorKt$detectPhones$1$afterTextChanged$1();

    PhoneDetectorKt$detectPhones$1$afterTextChanged$1() {
        super(1);
    }

    @Override // g00.l
    /* renamed from: b */
    public final Boolean invoke(String it2) {
        o.i(it2, "it");
        return Boolean.valueOf(PhoneDetectorKt.g(it2));
    }
}

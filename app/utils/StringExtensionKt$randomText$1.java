package com.forsale.app.utils;

import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: StringExtension.kt */
/* loaded from: classes3.dex */
/* synthetic */ class StringExtensionKt$randomText$1 extends FunctionReferenceImpl implements g00.l<Integer, Character> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public StringExtensionKt$randomText$1(Object obj) {
        super(1, obj, String.class, "get", "charAt(I)C", 0);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ Character invoke(Integer num) {
        return m(num.intValue());
    }

    public final Character m(int i11) {
        return Character.valueOf(((String) this.receiver).charAt(i11));
    }
}

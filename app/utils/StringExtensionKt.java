package com.forsale.app.utils;

import java.lang.Character;
import java.util.Random;
import java.util.stream.IntStream;
import kotlin.sequences.SequencesKt___SequencesKt;
/* compiled from: StringExtension.kt */
/* loaded from: classes3.dex */
public final class StringExtensionKt {
    public static final boolean a(String str) {
        kotlin.jvm.internal.o.i(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.o.h(charArray, "toCharArray(...)");
        for (char c11 : charArray) {
            if (Character.UnicodeBlock.of(c11) == Character.UnicodeBlock.ARABIC) {
                return true;
            }
        }
        return false;
    }

    public static final String b(int i11) {
        o00.f u11;
        String s11;
        IntStream ints = new Random().ints(i11, 0, 26);
        kotlin.jvm.internal.o.h(ints, "ints(...)");
        u11 = SequencesKt___SequencesKt.u(p00.a.a(ints), new StringExtensionKt$randomText$1("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
        s11 = SequencesKt___SequencesKt.s(u11, "", null, null, 0, null, null, 62, null);
        return s11;
    }
}

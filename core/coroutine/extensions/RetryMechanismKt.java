package com.forsale.core.coroutine.extensions;

import com.github.mikephil.charting.utils.Utils;
import g00.l;
import g00.p;
import pj.b;
/* compiled from: RetryMechanism.kt */
/* loaded from: classes3.dex */
public final class RetryMechanismKt {

    /* compiled from: RetryMechanism.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40602a;

        static {
            int[] iArr = new int[RetryState.values().length];
            try {
                iArr[RetryState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RetryState.RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RetryState.CONTINUE_SILENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40602a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0194 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:129:0x022b -> B:130:0x0235). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0239 -> B:138:0x0108). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(int r22, long r23, long r25, int r27, pj.a r28, g00.p<? super kotlin.Result<? extends T>, ? super zz.a<? super wz.p>, ? extends java.lang.Object> r29, g00.p<? super kotlin.Result<? extends T>, ? super zz.a<? super com.forsale.core.coroutine.extensions.RetryState>, ? extends java.lang.Object> r30, g00.l<? super zz.a<? super T>, ? extends java.lang.Object> r31, zz.a<? super T> r32) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.core.coroutine.extensions.RetryMechanismKt.a(int, long, long, int, pj.a, g00.p, g00.p, g00.l, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object b(int i11, long j11, long j12, int i12, pj.a aVar, p pVar, p pVar2, l lVar, zz.a aVar2, int i13, Object obj) {
        int i14;
        long j13;
        long j14;
        int i15;
        pj.a aVar3;
        p pVar3;
        if ((i13 & 1) != 0) {
            i14 = 3;
        } else {
            i14 = i11;
        }
        if ((i13 & 2) != 0) {
            j13 = 100;
        } else {
            j13 = j11;
        }
        if ((i13 & 4) != 0) {
            j14 = 1000;
        } else {
            j14 = j12;
        }
        if ((i13 & 8) != 0) {
            i15 = 10;
        } else {
            i15 = i12;
        }
        if ((i13 & 16) != 0) {
            aVar3 = new b(Utils.DOUBLE_EPSILON, 1, null);
        } else {
            aVar3 = aVar;
        }
        if ((i13 & 32) != 0) {
            pVar3 = new RetryMechanismKt$conditionalRetry$2(null);
        } else {
            pVar3 = pVar;
        }
        return a(i14, j13, j14, i15, aVar3, pVar3, pVar2, lVar, aVar2);
    }
}

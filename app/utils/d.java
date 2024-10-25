package com.forsale.app.utils;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBody;
/* compiled from: ComparingUtils.kt */
/* loaded from: classes3.dex */
public final class d {
    public static final boolean a(GetListingsBody.FiltrationData.Range range, GetListingsBody.FiltrationData.Range range2) {
        Integer num;
        Integer num2;
        Integer num3;
        if (!kotlin.jvm.internal.o.d(range, range2)) {
            Integer num4 = null;
            if (range != null) {
                num = range.getFrom();
            } else {
                num = null;
            }
            if (range2 != null) {
                num2 = range2.getFrom();
            } else {
                num2 = null;
            }
            if (kotlin.jvm.internal.o.d(num, num2)) {
                if (range != null) {
                    num3 = range.getTo();
                } else {
                    num3 = null;
                }
                if (range2 != null) {
                    num4 = range2.getTo();
                }
                if (kotlin.jvm.internal.o.d(num3, num4)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> boolean b(java.util.List<? extends T> r3, java.util.List<? extends T> r4) {
        /*
            boolean r0 = kotlin.jvm.internal.o.d(r3, r4)
            r1 = 1
            if (r0 != 0) goto L43
            r0 = 0
            if (r3 == 0) goto L16
            r2 = r3
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L17
        L16:
            r2 = r0
        L17:
            if (r4 == 0) goto L24
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            int r0 = r0.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L24:
            boolean r0 = kotlin.jvm.internal.o.d(r2, r0)
            r2 = 0
            if (r0 == 0) goto L42
            if (r3 == 0) goto L3e
            if (r4 == 0) goto L30
            goto L34
        L30:
            java.util.List r4 = kotlin.collections.p.n()
        L34:
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r3 = r3.containsAll(r4)
            if (r3 != r1) goto L3e
            r3 = r1
            goto L3f
        L3e:
            r3 = r2
        L3f:
            if (r3 == 0) goto L42
            goto L43
        L42:
            r1 = r2
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.d.b(java.util.List, java.util.List):boolean");
    }
}

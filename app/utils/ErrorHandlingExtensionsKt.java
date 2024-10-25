package com.forsale.app.utils;

import com.forsale.app.datalayer.repositories.MutexIsLockedException;
/* compiled from: ErrorHandlingExtensions.kt */
/* loaded from: classes3.dex */
public final class ErrorHandlingExtensionsKt {
    public static final void a(Throwable th2) {
        kotlin.jvm.internal.o.i(th2, "<this>");
        if (th2 instanceof MutexIsLockedException) {
            x10.a.b("Multiple Calls to GetSession", new Object[0]);
            return;
        }
        throw th2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(boolean r4, g00.l<? super zz.a<? super wz.p>, ? extends java.lang.Object> r5, zz.a<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof com.forsale.app.utils.ErrorHandlingExtensionsKt$neglectErrorOnCondition$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.utils.ErrorHandlingExtensionsKt$neglectErrorOnCondition$1 r0 = (com.forsale.app.utils.ErrorHandlingExtensionsKt$neglectErrorOnCondition$1) r0
            int r1 = r0.f39560c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39560c = r1
            goto L18
        L13:
            com.forsale.app.utils.ErrorHandlingExtensionsKt$neglectErrorOnCondition$1 r0 = new com.forsale.app.utils.ErrorHandlingExtensionsKt$neglectErrorOnCondition$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f39559b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f39560c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            boolean r4 = r0.f39558a
            kotlin.f.b(r6)     // Catch: java.lang.Throwable -> L43
            goto L41
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r6)
            r0.f39558a = r4     // Catch: java.lang.Throwable -> L43
            r0.f39560c = r3     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.lang.Throwable -> L43
            if (r4 != r1) goto L41
            return r1
        L41:
            r4 = 0
            return r4
        L43:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Trends:: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = " "
            r6.append(r0)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            x10.a.b(r6, r0)
            if (r4 == 0) goto L66
            return r5
        L66:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.ErrorHandlingExtensionsKt.b(boolean, g00.l, zz.a):java.lang.Object");
    }
}

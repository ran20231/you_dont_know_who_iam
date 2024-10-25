package com.forsale.app.features.categories.home.allverticals;
/* compiled from: AllVerticalsExtentions.kt */
/* loaded from: classes2.dex */
public final class AllVerticalsExtentionsKt {
    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(3:(1:(1:13)(2:17|18))(2:19|20)|14|15)(6:21|22|23|(1:25)|14|15))(1:26))(2:30|(1:32))|27|(1:29)|23|(0)|14|15))|37|6|7|(0)(0)|27|(0)|23|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        r9 = com.forsale.app.features.categories.home.allverticals.f.b(r8.getValue(), null, new com.forsale.app.features.categories.home.allverticals.g.b(r9), 1, null);
        r0.f23348a = null;
        r0.f23349b = null;
        r0.f23351d = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r8.emit(r9, r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(kotlinx.coroutines.flow.MutableStateFlow<com.forsale.app.features.categories.home.allverticals.f> r8, g00.l<? super zz.a<? super T>, ? extends java.lang.Object> r9, zz.a<? super wz.p> r10) {
        /*
            boolean r0 = r10 instanceof com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt$loadSectionData$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt$loadSectionData$1 r0 = (com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt$loadSectionData$1) r0
            int r1 = r0.f23351d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23351d = r1
            goto L18
        L13:
            com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt$loadSectionData$1 r0 = new com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt$loadSectionData$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f23350c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f23351d
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L5c
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            kotlin.f.b(r10)
            goto Lbb
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f23348a
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L4d
            goto Lbb
        L45:
            java.lang.Object r8 = r0.f23348a
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            kotlin.f.b(r10)     // Catch: java.lang.Throwable -> L4d
            goto L85
        L4d:
            r9 = move-exception
            goto L9f
        L4f:
            java.lang.Object r8 = r0.f23349b
            r9 = r8
            g00.l r9 = (g00.l) r9
            java.lang.Object r8 = r0.f23348a
            kotlinx.coroutines.flow.MutableStateFlow r8 = (kotlinx.coroutines.flow.MutableStateFlow) r8
            kotlin.f.b(r10)
            goto L78
        L5c:
            kotlin.f.b(r10)
            java.lang.Object r10 = r8.getValue()
            com.forsale.app.features.categories.home.allverticals.f r10 = (com.forsale.app.features.categories.home.allverticals.f) r10
            com.forsale.app.features.categories.home.allverticals.g$c r2 = com.forsale.app.features.categories.home.allverticals.g.c.f23810a
            com.forsale.app.features.categories.home.allverticals.f r10 = com.forsale.app.features.categories.home.allverticals.f.b(r10, r7, r2, r6, r7)
            r0.f23348a = r8
            r0.f23349b = r9
            r0.f23351d = r6
            java.lang.Object r10 = r8.emit(r10, r0)
            if (r10 != r1) goto L78
            return r1
        L78:
            r0.f23348a = r8     // Catch: java.lang.Throwable -> L4d
            r0.f23349b = r7     // Catch: java.lang.Throwable -> L4d
            r0.f23351d = r5     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r10 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L4d
            if (r10 != r1) goto L85
            return r1
        L85:
            java.lang.Object r9 = r8.getValue()     // Catch: java.lang.Throwable -> L4d
            com.forsale.app.features.categories.home.allverticals.f r9 = (com.forsale.app.features.categories.home.allverticals.f) r9     // Catch: java.lang.Throwable -> L4d
            com.forsale.app.features.categories.home.allverticals.g$a r2 = new com.forsale.app.features.categories.home.allverticals.g$a     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r10)     // Catch: java.lang.Throwable -> L4d
            com.forsale.app.features.categories.home.allverticals.f r9 = com.forsale.app.features.categories.home.allverticals.f.b(r9, r7, r2, r6, r7)     // Catch: java.lang.Throwable -> L4d
            r0.f23348a = r8     // Catch: java.lang.Throwable -> L4d
            r0.f23351d = r4     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r8 = r8.emit(r9, r0)     // Catch: java.lang.Throwable -> L4d
            if (r8 != r1) goto Lbb
            return r1
        L9f:
            java.lang.Object r10 = r8.getValue()
            com.forsale.app.features.categories.home.allverticals.f r10 = (com.forsale.app.features.categories.home.allverticals.f) r10
            com.forsale.app.features.categories.home.allverticals.g$b r2 = new com.forsale.app.features.categories.home.allverticals.g$b
            r2.<init>(r9)
            com.forsale.app.features.categories.home.allverticals.f r9 = com.forsale.app.features.categories.home.allverticals.f.b(r10, r7, r2, r6, r7)
            r0.f23348a = r7
            r0.f23349b = r7
            r0.f23351d = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto Lbb
            return r1
        Lbb:
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.home.allverticals.AllVerticalsExtentionsKt.a(kotlinx.coroutines.flow.MutableStateFlow, g00.l, zz.a):java.lang.Object");
    }
}

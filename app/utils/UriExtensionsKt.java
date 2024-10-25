package com.forsale.app.utils;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.FileOutputStream;
/* compiled from: UriExtensions.kt */
/* loaded from: classes3.dex */
public final class UriExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(android.net.Uri r8, android.content.Context r9, zz.a<? super java.io.File> r10) {
        /*
            boolean r0 = r10 instanceof com.forsale.app.utils.UriExtensionsKt$asCompressedFile$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.utils.UriExtensionsKt$asCompressedFile$1 r0 = (com.forsale.app.utils.UriExtensionsKt$asCompressedFile$1) r0
            int r1 = r0.f39683d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39683d = r1
            goto L18
        L13:
            com.forsale.app.utils.UriExtensionsKt$asCompressedFile$1 r0 = new com.forsale.app.utils.UriExtensionsKt$asCompressedFile$1
            r0.<init>(r10)
        L18:
            r5 = r0
            java.lang.Object r10 = r5.f39682c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r5.f39683d
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            java.lang.Object r8 = r5.f39681b
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r5.f39680a
            android.content.Context r9 = (android.content.Context) r9
            kotlin.f.b(r10)
            goto L7d
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.f.b(r10)
            long r3 = java.lang.System.currentTimeMillis()
            java.io.File r10 = androidx.core.net.b.a(r8)
            java.lang.String r10 = e00.f.g(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = "."
            r1.append(r3)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.content.ContentResolver r1 = r9.getContentResolver()
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Media.getBitmap(r1, r8)
            java.lang.String r8 = "getBitmap(...)"
            kotlin.jvm.internal.o.h(r1, r8)
            r4 = 0
            r6 = 4
            r7 = 0
            r5.f39680a = r9
            r5.f39681b = r10
            r5.f39683d = r2
            r2 = r9
            r3 = r10
            java.lang.Object r8 = c(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L7c
            return r0
        L7c:
            r8 = r10
        L7d:
            java.io.File r8 = r9.getFileStreamPath(r8)
            java.lang.String r9 = "getFileStreamPath(...)"
            kotlin.jvm.internal.o.h(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.UriExtensionsKt.a(android.net.Uri, android.content.Context, zz.a):java.lang.Object");
    }

    private static final Object b(Bitmap bitmap, Context context, String str, int i11, zz.a<? super wz.p> aVar) {
        while (true) {
            int i12 = 0;
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            if (i11 > 100) {
                i12 = 100;
            } else if (i11 >= 0) {
                i12 = i11;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, i12, openFileOutput);
                e00.b.a(openFileOutput, null);
                if (context.getFileStreamPath(str).length() > 1000000) {
                    i11 -= 20;
                } else {
                    return wz.p.f75480a;
                }
            } finally {
            }
        }
    }

    static /* synthetic */ Object c(Bitmap bitmap, Context context, String str, int i11, zz.a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 100;
        }
        return b(bitmap, context, str, i11, aVar);
    }
}

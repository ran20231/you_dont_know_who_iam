package com.forsale.app.utils.prefUtils;

import androidx.datastore.preferences.core.PreferencesKt;
import d3.c;
import h3.a;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import wz.p;
/* compiled from: DataStoreExtensions.kt */
/* loaded from: classes3.dex */
public final class DataStoreExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(d3.c<h3.a> r4, h3.a.C0641a<T> r5, T r6, zz.a<? super T> r7) {
        /*
            boolean r0 = r7 instanceof com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$1 r0 = (com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$1) r0
            int r1 = r0.f40423c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40423c = r1
            goto L18
        L13:
            com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$1 r0 = new com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f40422b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f40423c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r6 = r0.f40421a
            kotlin.f.b(r7)
            goto L54
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r7)
            kotlinx.coroutines.flow.Flow r4 = r4.getData()
            com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$2 r7 = new com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$2
            r2 = 0
            r7.<init>(r2)
            kotlinx.coroutines.flow.Flow r4 = kotlinx.coroutines.flow.FlowKt.m40catch(r4, r7)
            com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$$inlined$map$1 r7 = new com.forsale.app.utils.prefUtils.DataStoreExtensionsKt$getValue$$inlined$map$1
            r7.<init>(r4, r5, r6)
            r0.f40421a = r6
            r0.f40423c = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r7, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            if (r7 != 0) goto L57
            goto L58
        L57:
            r6 = r7
        L58:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.utils.prefUtils.DataStoreExtensionsKt.a(d3.c, h3.a$a, java.lang.Object, zz.a):java.lang.Object");
    }

    public static final <T> Flow<T> b(c<a> cVar, a.C0641a<T> key, T t11) {
        o.i(cVar, "<this>");
        o.i(key, "key");
        return new DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1(FlowKt.m40catch(cVar.getData(), new DataStoreExtensionsKt$getValueAsFlow$1(null)), key, t11);
    }

    public static final <T> Object c(c<a> cVar, a.C0641a<T> c0641a, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = PreferencesKt.a(cVar, new DataStoreExtensionsKt$remove$2(c0641a, null), aVar);
        f11 = b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    public static final <T> Object d(c<a> cVar, a.C0641a<T> c0641a, T t11, zz.a<? super p> aVar) {
        Object f11;
        Object a11 = PreferencesKt.a(cVar, new DataStoreExtensionsKt$setValue$2(c0641a, t11, null), aVar);
        f11 = b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }
}

package com.forsale.app.utils;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: CoroutinesExtensions.kt */
/* loaded from: classes3.dex */
public final class CoroutinesExtensionsKt {
    public static final <T, R> Object a(T t11, g00.p<? super T, ? super zz.a<? super R>, ? extends Object> pVar, zz.a<? super R> aVar) {
        return BuildersKt.withContext(Dispatchers.getMain(), new CoroutinesExtensionsKt$alsoOnMain$2(pVar, t11, null), aVar);
    }
}

package com.forsale.app.features.more;

import android.content.Context;
import android.webkit.CookieManager;
import kotlin.Result;
import kotlin.f;
/* compiled from: WebActivity.kt */
/* loaded from: classes2.dex */
public final class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Context context) {
        Object b11;
        try {
            Result.a aVar = Result.f61613b;
            b11 = Result.b(CookieManager.getInstance());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f61613b;
            b11 = Result.b(f.a(th2));
        }
        return Result.h(b11);
    }
}

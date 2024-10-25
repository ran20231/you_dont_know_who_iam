package com.forsale.core.util;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import g00.l;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ContextExtension.kt */
/* loaded from: classes3.dex */
public final class ContextExtensionKt {
    public static final void a(Context context, String phoneNumber, l<? super Exception, p> onFailure) {
        o.i(context, "<this>");
        o.i(phoneNumber, "phoneNumber");
        o.i(onFailure, "onFailure");
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + phoneNumber));
            context.startActivity(intent);
        } catch (Exception e11) {
            onFailure.invoke(e11);
        }
    }

    public static /* synthetic */ void b(Context context, String str, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = ContextExtensionKt$makeCall$1.f40629a;
        }
        a(context, str, lVar);
    }
}

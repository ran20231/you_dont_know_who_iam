package com.forsale.adserver.utils.extensions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import androidx.core.content.b;
import g00.l;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ContextExtensions.kt */
/* loaded from: classes2.dex */
public final class ContextExtensionsKt {
    public static final boolean a(Context context) {
        o.i(context, "<this>");
        if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            return true;
        }
        return false;
    }

    public static final boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        o.i(context, "<this>");
        ConnectivityManager connectivityManager = (ConnectivityManager) b.getSystemService(context, ConnectivityManager.class);
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            return activeNetworkInfo.isConnected();
        }
        return false;
    }

    public static final void c(Context context, String phoneNumber, l<? super Exception, p> onFailure) {
        o.i(context, "<this>");
        o.i(phoneNumber, "phoneNumber");
        o.i(onFailure, "onFailure");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=" + phoneNumber));
            context.startActivity(intent);
        } catch (Exception e11) {
            onFailure.invoke(e11);
        }
    }

    public static /* synthetic */ void d(Context context, String str, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l<Exception, p>() { // from class: com.forsale.adserver.utils.extensions.ContextExtensionsKt$sendWhatsApp$1
                public final void b(Exception it2) {
                    o.i(it2, "it");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Exception exc) {
                    b(exc);
                    return p.f75480a;
                }
            };
        }
        c(context, str, lVar);
    }
}

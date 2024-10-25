package com.forsale.app.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import t9.y0;
/* compiled from: MediaUtils.kt */
/* loaded from: classes3.dex */
public final class r {
    public static final void a(Context context, String path) {
        kotlin.jvm.internal.o.i(context, "<this>");
        kotlin.jvm.internal.o.i(path, "path");
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setFlags(1);
            intent.setDataAndType(Uri.parse(path), "video/mp4");
            context.startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(context, context.getString(y0.T3), 0).show();
        }
    }
}

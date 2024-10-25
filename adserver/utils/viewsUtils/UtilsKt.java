package com.forsale.adserver.utils.viewsUtils;

import android.app.DownloadManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.os.Environment;
import android.webkit.URLUtil;
import androidx.appcompat.app.d;
import androidx.lifecycle.b0;
import falcon.chat.entities.Message;
import g00.l;
import java.io.File;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.o;
import l8.h;
import wz.p;
/* compiled from: Utils.kt */
/* loaded from: classes2.dex */
public final class UtilsKt {

    /* renamed from: a  reason: collision with root package name */
    private static final b0<Boolean> f20873a = new b0<>();

    public static final Object a(Context context, zz.a<? super p> aVar) {
        Object f11;
        Object h11 = a.f20882a.a(context).k().h(aVar);
        f11 = b.f();
        if (h11 == f11) {
            return h11;
        }
        return p.f75480a;
    }

    public static final void b(Context context, String imageUrl) {
        o.i(context, "<this>");
        o.i(imageUrl, "imageUrl");
        String string = context.getString(h.f62338g);
        o.h(string, "getString(...)");
        String guessFileName = URLUtil.guessFileName(imageUrl, null, null);
        String absolutePath = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath();
        File file = new File(absolutePath + "/" + string + "/");
        if (!file.exists()) {
            file.mkdir();
        }
        Object systemService = context.getSystemService("download");
        o.g(systemService, "null cannot be cast to non-null type android.app.DownloadManager");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(imageUrl));
        DownloadManager.Request notificationVisibility = request.setAllowedNetworkTypes(3).setAllowedOverRoaming(false).setTitle(guessFileName).setMimeType(Message.IMG).setNotificationVisibility(1);
        String str = Environment.DIRECTORY_PICTURES;
        String str2 = File.separator;
        notificationVisibility.setDestinationInExternalPublicDir(str, str2 + string + str2 + guessFileName);
        ((DownloadManager) systemService).enqueue(request);
    }

    public static final d c(Context context) {
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        if (context instanceof d) {
            return (d) context;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext == null) {
            return null;
        }
        return c(baseContext);
    }

    public static final b0<Boolean> d() {
        return f20873a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00df -> B:17:0x004e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object e(int r20, long r21, long r23, double r25, g00.l<? super zz.a<? super T>, ? extends java.lang.Object> r27, zz.a<? super T> r28) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.utils.viewsUtils.UtilsKt.e(int, long, long, double, g00.l, zz.a):java.lang.Object");
    }

    public static /* synthetic */ Object f(int i11, long j11, long j12, double d11, l lVar, zz.a aVar, int i12, Object obj) {
        int i13;
        long j13;
        long j14;
        double d12;
        if ((i12 & 1) != 0) {
            i13 = 5;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            j13 = 300;
        } else {
            j13 = j11;
        }
        if ((i12 & 4) != 0) {
            j14 = 1000;
        } else {
            j14 = j12;
        }
        if ((i12 & 8) != 0) {
            d12 = 2.0d;
        } else {
            d12 = d11;
        }
        return e(i13, j13, j14, d12, lVar, aVar);
    }
}

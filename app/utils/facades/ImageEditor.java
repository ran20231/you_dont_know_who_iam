package com.forsale.app.utils.facades;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import com.forsale.app.utils.TypeExtensionsKt;
import dj.c;
import java.io.File;
import java.util.Arrays;
import k10.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.w;
import kotlin.text.StringsKt__StringsKt;
/* compiled from: ImageEditor.kt */
/* loaded from: classes3.dex */
public final class ImageEditor implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f40111a = new a(null);

    /* compiled from: ImageEditor.kt */
    /* loaded from: classes3.dex */
    public static final class a implements g00.a<c> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // g00.a
        /* renamed from: b */
        public c invoke() {
            return new ImageEditor(null);
        }
    }

    private ImageEditor() {
    }

    public /* synthetic */ ImageEditor(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final Uri b(Context context, String str) {
        String x02;
        w wVar = w.f61809a;
        String format = String.format("IMG_EDITED_%s", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        o.h(format, "format(...)");
        String str2 = format + "." + TypeExtensionsKt.j(str);
        if (!URLUtil.isNetworkUrl(str)) {
            x02 = StringsKt__StringsKt.x0(str, "/", str2, null, 4, null);
        } else {
            x02 = context.getFilesDir().getPath() + "/" + str2;
        }
        return Uri.fromFile(new File(x02));
    }

    @Override // dj.c
    public Intent a(Context context, String source) {
        o.i(context, "context");
        o.i(source, "source");
        Uri b11 = b(context, source);
        if (b11 != null) {
            return q.a(context, source, b11.getPath(), ImageEditor$createEditImageIntent$1$1.f40112a);
        }
        return null;
    }
}

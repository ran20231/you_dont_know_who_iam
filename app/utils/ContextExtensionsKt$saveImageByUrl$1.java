package com.forsale.app.utils;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import androidx.appcompat.app.c;
import kotlin.jvm.internal.Lambda;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContextExtensions.kt */
/* loaded from: classes3.dex */
public final class ContextExtensionsKt$saveImageByUrl$1 extends Lambda implements g00.l<Bitmap, wz.p> {

    /* renamed from: a */
    final /* synthetic */ Activity f39543a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextExtensionsKt$saveImageByUrl$1(Activity activity) {
        super(1);
        this.f39543a = activity;
    }

    public static final void c(Activity this_saveImageByUrl, Bitmap it2) {
        kotlin.jvm.internal.o.i(this_saveImageByUrl, "$this_saveImageByUrl");
        kotlin.jvm.internal.o.i(it2, "$it");
        if (ContextExtensionsKt.H(this_saveImageByUrl, it2)) {
            String string = this_saveImageByUrl.getString(bv.o.f16601b);
            kotlin.jvm.internal.o.h(string, "getString(...)");
            if (ContextExtensionsKt.f(this_saveImageByUrl)) {
                c.a aVar = new c.a(this_saveImageByUrl);
                aVar.o(y0.R4);
                aVar.h(string);
                aVar.m(this_saveImageByUrl.getString(y0.Z4), new a());
                aVar.d(false);
                aVar.q();
                return;
            }
            return;
        }
        String string2 = this_saveImageByUrl.getString(bv.o.f16602c);
        kotlin.jvm.internal.o.h(string2, "getString(...)");
        if (ContextExtensionsKt.f(this_saveImageByUrl)) {
            c.a aVar2 = new c.a(this_saveImageByUrl);
            aVar2.o(y0.M4);
            aVar2.h(string2);
            aVar2.m(this_saveImageByUrl.getString(y0.Z4), new b());
            aVar2.d(false);
            aVar2.q();
        }
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ wz.p invoke(Bitmap bitmap) {
        invoke2(bitmap);
        return wz.p.f75480a;
    }

    /* renamed from: invoke */
    public final void invoke2(Bitmap bitmap) {
        if (bitmap != null) {
            Activity activity = this.f39543a;
            activity.runOnUiThread(new k(activity, bitmap));
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class a implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }

    /* compiled from: ViewsExtensions.kt */
    /* loaded from: classes3.dex */
    public static final class b implements DialogInterface.OnClickListener {
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i11) {
        }
    }
}

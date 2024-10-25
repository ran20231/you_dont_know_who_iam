package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: InAppBrowserLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37800b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37801c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37802a;

    /* compiled from: InAppBrowserLinkProcessor.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String deeplink, Context context) {
            o.i(deeplink, "deeplink");
            o.i(context, "context");
            String string = context.getString(y0.V2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public e(Context context) {
        o.i(context, "context");
        this.f37802a = context;
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        String string;
        String string2 = this.f37802a.getString(y0.U2);
        o.h(string2, "getString(...)");
        Bundle a11 = wf.a.a(string2, str);
        if (a11 != null && (string = a11.getString("url")) != null) {
            bVar.D(string);
        }
        return p.f75480a;
    }
}

package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: OffersLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37803b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37804c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37805a;

    /* compiled from: OffersLinkProcessor.kt */
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
            String string = context.getString(y0.J2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public f(Context context) {
        o.i(context, "context");
        this.f37805a = context;
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        String string;
        String string2 = this.f37805a.getString(y0.D5);
        o.h(string2, "getString(...)");
        Bundle a11 = wf.a.a(string2, str);
        if (a11 != null && (string = a11.getString("offers_args")) != null) {
            bVar.S(string);
        }
        return p.f75480a;
    }
}

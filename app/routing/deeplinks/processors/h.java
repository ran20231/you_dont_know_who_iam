package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: RealtyLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37807a = new a(null);

    /* compiled from: RealtyLinkProcessor.kt */
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
            String string = context.getString(y0.f70616p2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        bVar.x();
        return p.f75480a;
    }
}

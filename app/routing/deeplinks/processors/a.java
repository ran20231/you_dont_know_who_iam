package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import android.net.UrlQuerySanitizer;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: AdUnitLinksProcessor.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0432a f37774a = new C0432a(null);

    /* compiled from: AdUnitLinksProcessor.kt */
    /* renamed from: com.forsale.app.routing.deeplinks.processors.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0432a {
        private C0432a() {
        }

        public /* synthetic */ C0432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String deeplink, Context context) {
            o.i(deeplink, "deeplink");
            o.i(context, "context");
            String string = context.getString(y0.f70514j2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        String value = new UrlQuerySanitizer(str).getValue(OutOfContextTestingActivity.AD_UNIT_KEY);
        if (value != null) {
            bVar.K(value);
        }
        return p.f75480a;
    }
}

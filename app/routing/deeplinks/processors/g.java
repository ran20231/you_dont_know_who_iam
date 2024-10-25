package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import uf.b;
import wz.p;
/* compiled from: PostListingLinksProcessors.kt */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37806a = new a(null);

    /* compiled from: PostListingLinksProcessors.kt */
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
            String string = context.getString(y0.N2);
            o.h(string, "getString(...)");
            if (!wf.a.b(deeplink, new Regex(string)) && !o.d(deeplink, context.getString(y0.F5))) {
                return false;
            }
            return true;
        }
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        b.a.a(bVar, null, 1, null);
        return p.f75480a;
    }
}

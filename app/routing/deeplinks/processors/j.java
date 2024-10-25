package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: VirtualTourLinksProcessor.kt */
/* loaded from: classes2.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37809b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37810c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f37811a;

    /* compiled from: VirtualTourLinksProcessor.kt */
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
            String string = context.getString(y0.X2);
            o.h(string, "getString(...)");
            return new Regex(string).a(deeplink);
        }
    }

    public j(Context context) {
        o.i(context, "context");
        this.f37811a = context;
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        String string;
        String string2 = this.f37811a.getString(y0.W2);
        o.h(string2, "getString(...)");
        Bundle a11 = wf.a.a(string2, str);
        if (a11 != null && (string = a11.getString("url")) != null) {
            bVar.c0(string);
        }
        return p.f75480a;
    }
}

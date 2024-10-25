package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
import wz.p;
/* compiled from: GeneralLinksProcessor.kt */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f37799a = new a(null);

    /* compiled from: GeneralLinksProcessor.kt */
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
            String string = context.getString(y0.f70565m2);
            o.h(string, "getString(...)");
            if (!wf.a.b(deeplink, new Regex(string))) {
                String string2 = context.getString(y0.f70548l2);
                o.h(string2, "getString(...)");
                if (!wf.a.b(deeplink, new Regex(string2))) {
                    String string3 = context.getString(y0.O2);
                    o.h(string3, "getString(...)");
                    if (!wf.a.b(deeplink, new Regex(string3))) {
                        String string4 = context.getString(y0.P2);
                        o.h(string4, "getString(...)");
                        if (!wf.a.b(deeplink, new Regex(string4))) {
                            String string5 = context.getString(y0.B5);
                            o.h(string5, "getString(...)");
                            if (!wf.a.b(deeplink, new Regex(string5))) {
                                String string6 = context.getString(y0.L2);
                                o.h(string6, "getString(...)");
                                if (!wf.a.b(deeplink, new Regex(string6))) {
                                    String string7 = context.getString(y0.K2);
                                    o.h(string7, "getString(...)");
                                    if (!wf.a.b(deeplink, new Regex(string7))) {
                                        String string8 = context.getString(y0.Y2);
                                        o.h(string8, "getString(...)");
                                        if (!wf.a.b(deeplink, new Regex(string8))) {
                                            String string9 = context.getString(y0.T2);
                                            o.h(string9, "getString(...)");
                                            if (!wf.a.b(deeplink, new Regex(string9))) {
                                                String string10 = context.getString(y0.f70582n2);
                                                o.h(string10, "getString(...)");
                                                if (!wf.a.b(deeplink, new Regex(string10))) {
                                                    String string11 = context.getString(y0.G5);
                                                    o.h(string11, "getString(...)");
                                                    if (!wf.a.b(deeplink, new Regex(string11))) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    public Object a(Intent intent, String str, uf.c cVar, uf.b bVar, zz.a<? super p> aVar) {
        bVar.E(intent);
        return p.f75480a;
    }
}

package com.forsale.adserver.utils.viewsUtils;

import android.content.Context;
import com.forsale.adserver.datalayer.network.WebClient;
import kotlin.jvm.internal.o;
/* compiled from: Utils.kt */
/* loaded from: classes2.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0231a f20882a = C0231a.f20883a;

    /* compiled from: Utils.kt */
    /* renamed from: com.forsale.adserver.utils.viewsUtils.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0231a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C0231a f20883a = new C0231a();

        private C0231a() {
        }

        public final a a(Context context) {
            o.i(context, "context");
            Object a11 = dx.a.a(context.getApplicationContext(), a.class);
            o.h(a11, "get(...)");
            return (a) a11;
        }
    }

    WebClient k();
}

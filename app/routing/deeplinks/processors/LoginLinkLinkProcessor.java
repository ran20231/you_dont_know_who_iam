package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
/* compiled from: LoginLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class LoginLinkLinkProcessor {

    /* renamed from: b  reason: collision with root package name */
    public static final a f37717b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37718c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final jj.b f37719a;

    /* compiled from: LoginLinkProcessor.kt */
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
            String string = context.getString(y0.f70379b2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public LoginLinkLinkProcessor(jj.b prefs) {
        o.i(prefs, "prefs");
        this.f37719a = prefs;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Intent r2, java.lang.String r3, uf.c r4, uf.b r5, zz.a<? super wz.p> r6) {
        /*
            r1 = this;
            boolean r2 = r6 instanceof com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor$execute$1
            if (r2 == 0) goto L13
            r2 = r6
            com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor$execute$1 r2 = (com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor$execute$1) r2
            int r3 = r2.f37723d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r4
            if (r0 == 0) goto L13
            int r3 = r3 - r4
            r2.f37723d = r3
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor$execute$1 r2 = new com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor$execute$1
            r2.<init>(r1, r6)
        L18:
            java.lang.Object r3 = r2.f37721b
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.f()
            int r6 = r2.f37723d
            r0 = 1
            if (r6 == 0) goto L36
            if (r6 != r0) goto L2e
            java.lang.Object r2 = r2.f37720a
            r5 = r2
            uf.b r5 = (uf.b) r5
            kotlin.f.b(r3)
            goto L4a
        L2e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L36:
            kotlin.f.b(r3)
            jj.b r3 = r1.f37719a
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r3 = r3.l()
            r2.f37720a = r5
            r2.f37723d = r0
            java.lang.Object r3 = r3.c(r2)
            if (r3 != r4) goto L4a
            return r4
        L4a:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r2 = r3.length()
            if (r2 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            if (r0 == 0) goto L5c
            com.forsale.app.features.auth.models.AuthIntention r2 = com.forsale.app.features.auth.models.AuthIntention.SignIn
            r5.H(r2)
            goto L5f
        L5c:
            r5.g()
        L5f:
            wz.p r2 = wz.p.f75480a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.LoginLinkLinkProcessor.a(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}

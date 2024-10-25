package com.forsale.app.routing.deeplinks.processors;

import android.content.Context;
import com.forsale.app.utils.facades.user.UserProfileInteractor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import t9.y0;
/* compiled from: FollowersLinkProcessor.kt */
/* loaded from: classes2.dex */
public final class FollowersLinkProcessor {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37694c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f37695d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final UserProfileInteractor f37696a;

    /* renamed from: b  reason: collision with root package name */
    private final jj.b f37697b;

    /* compiled from: FollowersLinkProcessor.kt */
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
            String string = context.getString(y0.f70498i2);
            o.h(string, "getString(...)");
            return wf.a.b(deeplink, new Regex(string));
        }
    }

    public FollowersLinkProcessor(UserProfileInteractor userProfileInteractor, jj.b prefs) {
        o.i(userProfileInteractor, "userProfileInteractor");
        o.i(prefs, "prefs");
        this.f37696a = userProfileInteractor;
        this.f37697b = prefs;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.content.Intent r3, java.lang.String r4, uf.c r5, uf.b r6, zz.a<? super wz.p> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$1
            if (r3 == 0) goto L13
            r3 = r7
            com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$1 r3 = (com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$1) r3
            int r4 = r3.f37702e
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r5
            if (r0 == 0) goto L13
            int r4 = r4 - r5
            r3.f37702e = r4
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$1 r3 = new com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f37700c
            java.lang.Object r5 = kotlin.coroutines.intrinsics.a.f()
            int r7 = r3.f37702e
            r0 = 2
            r1 = 1
            if (r7 == 0) goto L48
            if (r7 == r1) goto L3c
            if (r7 != r0) goto L34
            java.lang.Object r5 = r3.f37699b
            com.forsale.app.datalayer.database.UserEntity r5 = (com.forsale.app.datalayer.database.UserEntity) r5
            java.lang.Object r3 = r3.f37698a
            uf.b r3 = (uf.b) r3
            kotlin.f.b(r4)
            goto L73
        L34:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L3c:
            java.lang.Object r6 = r3.f37699b
            uf.b r6 = (uf.b) r6
            java.lang.Object r7 = r3.f37698a
            com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor r7 = (com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor) r7
            kotlin.f.b(r4)
            goto L5b
        L48:
            kotlin.f.b(r4)
            com.forsale.app.utils.facades.user.UserProfileInteractor r4 = r2.f37696a
            r3.f37698a = r2
            r3.f37699b = r6
            r3.f37702e = r1
            java.lang.Object r4 = r4.i(r3)
            if (r4 != r5) goto L5a
            return r5
        L5a:
            r7 = r2
        L5b:
            com.forsale.app.datalayer.database.UserEntity r4 = (com.forsale.app.datalayer.database.UserEntity) r4
            jj.b r7 = r7.f37697b
            com.forsale.app.utils.prefUtils.preferences.UserSharedPref r7 = r7.l()
            r3.f37698a = r6
            r3.f37699b = r4
            r3.f37702e = r0
            java.lang.Object r3 = r7.c(r3)
            if (r3 != r5) goto L70
            return r5
        L70:
            r5 = r4
            r4 = r3
            r3 = r6
        L73:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L7c
            goto L7d
        L7c:
            r1 = 0
        L7d:
            if (r1 == 0) goto L8c
            com.forsale.app.utils.analytics.auth.AuthenticationSourcePage r4 = com.forsale.app.utils.analytics.auth.AuthenticationSourcePage.DEEP_LINK
            com.forsale.app.features.auth.login.SignInIntention r6 = com.forsale.app.features.auth.login.SignInIntention.DEFAULT
            com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$2 r7 = new com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor$execute$2
            r7.<init>()
            r3.o(r4, r6, r7)
            goto L99
        L8c:
            if (r5 == 0) goto L94
            java.lang.String r4 = r5.getPhone()
            if (r4 != 0) goto L96
        L94:
            java.lang.String r4 = ""
        L96:
            r3.B(r4)
        L99:
            wz.p r3 = wz.p.f75480a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.processors.FollowersLinkProcessor.a(android.content.Intent, java.lang.String, uf.c, uf.b, zz.a):java.lang.Object");
    }
}

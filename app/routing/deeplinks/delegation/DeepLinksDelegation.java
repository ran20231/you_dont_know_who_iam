package com.forsale.app.routing.deeplinks.delegation;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper;
import cx.a;
import g00.l;
import io.d;
import java.util.Locale;
import kotlin.jvm.internal.o;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import t9.y0;
import uf.b;
import vf.c;
import wz.p;
/* compiled from: DeepLinksDelegation.kt */
/* loaded from: classes2.dex */
public final class DeepLinksDelegation implements c {

    /* renamed from: a */
    private final Context f37639a;

    /* renamed from: b */
    private final a<DeepLinksCampaignParamsMapper> f37640b;

    /* renamed from: c */
    private final com.forsale.app.routing.deeplinks.processors.c f37641c;

    /* renamed from: d */
    private final d f37642d;

    public DeepLinksDelegation(Context context, a<DeepLinksCampaignParamsMapper> deepLinksCampaignParamsMapper, com.forsale.app.routing.deeplinks.processors.c processorsWrapper, d firebaseDynamicLinks) {
        o.i(context, "context");
        o.i(deepLinksCampaignParamsMapper, "deepLinksCampaignParamsMapper");
        o.i(processorsWrapper, "processorsWrapper");
        o.i(firebaseDynamicLinks, "firebaseDynamicLinks");
        this.f37639a = context;
        this.f37640b = deepLinksCampaignParamsMapper;
        this.f37641c = processorsWrapper;
        this.f37642d = firebaseDynamicLinks;
    }

    private final boolean f(Uri uri) {
        boolean N;
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        String string = this.f37639a.getString(y0.f70431e3);
        o.h(string, "getString(...)");
        N = StringsKt__StringsKt.N(host, string, false, 2, null);
        return N;
    }

    private final Uri g(Uri uri) {
        boolean N;
        String C;
        String uri2 = uri.toString();
        o.h(uri2, "toString(...)");
        String string = this.f37639a.getString(y0.Q2);
        o.h(string, "getString(...)");
        if (wf.a.b(uri2, new Regex(string))) {
            String string2 = this.f37639a.getString(y0.G5);
            o.h(string2, "getString(...)");
            return Uri.parse(string2);
        }
        String uri3 = uri.toString();
        o.h(uri3, "toString(...)");
        String lowerCase = uri3.toLowerCase(Locale.ROOT);
        o.h(lowerCase, "toLowerCase(...)");
        N = StringsKt__StringsKt.N(lowerCase, "q84sale://applink", false, 2, null);
        if (N) {
            String uri4 = uri.toString();
            o.h(uri4, "toString(...)");
            C = s.C(uri4, "q84sale://applink", "https://www.q84sale.com", false, 4, null);
            return Uri.parse(C);
        }
        return uri;
    }

    public static final void h(l tmp0, Object obj) {
        o.i(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    public static final void i(uf.d viewActions, Exception it2) {
        o.i(viewActions, "$viewActions");
        o.i(it2, "it");
        viewActions.d(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.net.Uri r6, zz.a<? super android.net.Uri> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$processCampaignParamsIfExist$1
            if (r0 == 0) goto L13
            r0 = r7
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$processCampaignParamsIfExist$1 r0 = (com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$processCampaignParamsIfExist$1) r0
            int r1 = r0.f37658d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37658d = r1
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$processCampaignParamsIfExist$1 r0 = new com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$processCampaignParamsIfExist$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f37656b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37658d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f37655a
            android.net.Uri r6 = (android.net.Uri) r6
            kotlin.f.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.f.b(r7)
            kotlin.Pair r7 = vf.d.a(r6)
            java.lang.Object r2 = r7.c()
            if (r2 != 0) goto L4b
            java.lang.Object r2 = r7.d()
            if (r2 == 0) goto L49
            goto L4b
        L49:
            r2 = 0
            goto L4c
        L4b:
            r2 = r3
        L4c:
            if (r2 == 0) goto L4f
            goto L50
        L4f:
            r7 = 0
        L50:
            if (r7 == 0) goto L76
            cx.a<com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper> r2 = r5.f37640b
            java.lang.Object r2 = r2.get()
            com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper r2 = (com.forsale.app.routing.deeplinks.mappers.DeepLinksCampaignParamsMapper) r2
            java.lang.Object r4 = r7.c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r7 = r7.d()
            java.lang.String r7 = (java.lang.String) r7
            r0.f37655a = r6
            r0.f37658d = r3
            java.lang.Object r7 = r2.b(r6, r4, r7, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            android.net.Uri r7 = (android.net.Uri) r7
            if (r7 == 0) goto L76
            goto L77
        L76:
            r7 = r6
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation.j(android.net.Uri, zz.a):java.lang.Object");
    }

    @Override // vf.c
    public Object a(String str, Intent intent, b bVar, zz.a<? super p> aVar) {
        uf.c d11;
        Object f11;
        com.forsale.app.routing.deeplinks.processors.c cVar = this.f37641c;
        d11 = vf.d.d(intent);
        Object a11 = cVar.a(str, d11, bVar, intent, aVar);
        f11 = kotlin.coroutines.intrinsics.b.f();
        if (a11 == f11) {
            return a11;
        }
        return p.f75480a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0075, code lost:
        if (r0.f(r10) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ac  */
    @Override // vf.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(final android.content.Intent r6, final boolean r7, final uf.b r8, final uf.d r9, zz.a<? super wz.p> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$1
            if (r0 == 0) goto L13
            r0 = r10
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$1 r0 = (com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$1) r0
            int r1 = r0.f37650h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37650h = r1
            goto L18
        L13:
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$1 r0 = new com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$1
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f37648f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37650h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L46
            if (r2 != r3) goto L3e
            boolean r7 = r0.f37647e
            java.lang.Object r6 = r0.f37646d
            r9 = r6
            uf.d r9 = (uf.d) r9
            java.lang.Object r6 = r0.f37645c
            r8 = r6
            uf.b r8 = (uf.b) r8
            java.lang.Object r6 = r0.f37644b
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.Object r0 = r0.f37643a
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation r0 = (com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation) r0
            kotlin.f.b(r10)
            goto L67
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            kotlin.f.b(r10)
            if (r6 == 0) goto L50
            android.net.Uri r10 = r6.getData()
            goto L51
        L50:
            r10 = r4
        L51:
            if (r10 == 0) goto L78
            r0.f37643a = r5
            r0.f37644b = r6
            r0.f37645c = r8
            r0.f37646d = r9
            r0.f37647e = r7
            r0.f37650h = r3
            java.lang.Object r10 = r5.j(r10, r0)
            if (r10 != r1) goto L66
            return r1
        L66:
            r0 = r5
        L67:
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto L79
            android.net.Uri r10 = r0.g(r10)
            if (r10 == 0) goto L79
            boolean r1 = r0.f(r10)
            if (r1 != 0) goto L79
            goto L7a
        L78:
            r0 = r5
        L79:
            r10 = r4
        L7a:
            if (r6 == 0) goto L80
            android.net.Uri r4 = r6.getData()
        L80:
            if (r4 == 0) goto La1
            if (r10 != 0) goto La1
            io.d r10 = r0.f37642d
            com.google.android.gms.tasks.Task r10 = r10.b(r6)
            com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$2$2$1 r0 = new com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation$process$2$2$1
            r0.<init>()
            vf.a r6 = new vf.a
            r6.<init>(r0)
            com.google.android.gms.tasks.Task r6 = r10.addOnSuccessListener(r6)
            vf.b r7 = new vf.b
            r7.<init>(r9)
            r6.addOnFailureListener(r7)
            goto Lb8
        La1:
            if (r7 == 0) goto Lac
            if (r6 == 0) goto Lb8
            r6.setData(r10)
            r8.y(r6)
            goto Lb8
        Lac:
            if (r10 == 0) goto Lb1
            r9.A()
        Lb1:
            java.lang.String r6 = java.lang.String.valueOf(r10)
            r9.d(r6)
        Lb8:
            wz.p r6 = wz.p.f75480a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.deeplinks.delegation.DeepLinksDelegation.b(android.content.Intent, boolean, uf.b, uf.d, zz.a):java.lang.Object");
    }
}

package com.forsale.app.routing.plfRouting.shared.operator;

import ag.a;
import jj.b;
import kotlin.jvm.internal.o;
/* compiled from: PLFRouterOperator.kt */
/* loaded from: classes2.dex */
public final class PLFRouterOperator implements a {

    /* renamed from: a  reason: collision with root package name */
    private final b f37818a;

    /* renamed from: b  reason: collision with root package name */
    private final cx.a<yf.b> f37819b;

    /* renamed from: c  reason: collision with root package name */
    private final cx.a<xf.b> f37820c;

    public PLFRouterOperator(b prefs, cx.a<yf.b> plfWebViewRouter, cx.a<xf.b> oldPLFRouter) {
        o.i(prefs, "prefs");
        o.i(plfWebViewRouter, "plfWebViewRouter");
        o.i(oldPLFRouter, "oldPLFRouter");
        this.f37818a = prefs;
        this.f37819b = plfWebViewRouter;
        this.f37820c = oldPLFRouter;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    @Override // ag.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(zz.a<? super zf.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator$plfRouter$1
            if (r0 == 0) goto L13
            r0 = r5
            com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator$plfRouter$1 r0 = (com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator$plfRouter$1) r0
            int r1 = r0.f37824d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37824d = r1
            goto L18
        L13:
            com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator$plfRouter$1 r0 = new com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator$plfRouter$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f37822b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f37824d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f37821a
            com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator r0 = (com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator) r0
            kotlin.f.b(r5)
            goto L4a
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.f.b(r5)
            jj.b r5 = r4.f37818a
            com.forsale.app.utils.prefUtils.preferences.FeatureFlagPrefs r5 = r5.d()
            r0.f37821a = r4
            r0.f37824d = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5e
            cx.a<yf.b> r5 = r0.f37819b
            java.lang.Object r5 = r5.get()
            kotlin.jvm.internal.o.f(r5)
            zf.b r5 = (zf.b) r5
            goto L69
        L5e:
            cx.a<xf.b> r5 = r0.f37820c
            java.lang.Object r5 = r5.get()
            kotlin.jvm.internal.o.f(r5)
            zf.b r5 = (zf.b) r5
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.routing.plfRouting.shared.operator.PLFRouterOperator.a(zz.a):java.lang.Object");
    }
}

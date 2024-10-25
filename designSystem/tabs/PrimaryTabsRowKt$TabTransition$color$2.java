package com.forsale.designSystem.tabs;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import b1.t1;
import falcon.chat.entities.Constants;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import r.d1;
import r.g;
import r.h0;
import r.i0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PrimaryTabsRow.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabsRowKt$TabTransition$color$2 extends Lambda implements q<Transition.b<Boolean>, a, Integer, i0<t1>> {

    /* renamed from: a  reason: collision with root package name */
    public static final PrimaryTabsRowKt$TabTransition$color$2 f42131a = new PrimaryTabsRowKt$TabTransition$color$2();

    PrimaryTabsRowKt$TabTransition$color$2() {
        super(3);
    }

    public final i0<t1> b(Transition.b<Boolean> animateColor, a aVar, int i11) {
        d1 k11;
        o.i(animateColor, "$this$animateColor");
        aVar.C(1757847995);
        if (c.I()) {
            c.U(1757847995, i11, -1, "com.forsale.designSystem.tabs.TabTransition.<anonymous> (PrimaryTabsRow.kt:216)");
        }
        if (animateColor.c(Boolean.FALSE, Boolean.TRUE)) {
            k11 = g.j(Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, 50, h0.d());
        } else {
            k11 = g.k(Constants.PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION, 0, h0.d(), 2, null);
        }
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return k11;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ i0<t1> invoke(Transition.b<Boolean> bVar, a aVar, Integer num) {
        return b(bVar, aVar, num.intValue());
    }
}

package com.forsale.ui.components.ads;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.designSystem.layouts.NavBarsKt;
import g00.a;
import g00.q;
import j0.d;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import kotlin.jvm.internal.o;
import v0.b;
import w.u;
import wz.p;
/* compiled from: AdsGeneralDetails.kt */
/* loaded from: classes3.dex */
public final class AdsGeneralDetailsKt {
    public static final void a(String title, a<p> onCloseClicked, a<p> onShareClicked, a<p> onDownloadImageClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        o.i(title, "title");
        o.i(onCloseClicked, "onCloseClicked");
        o.i(onShareClicked, "onShareClicked");
        o.i(onDownloadImageClicked, "onDownloadImageClicked");
        androidx.compose.runtime.a h11 = aVar.h(1130452644);
        if ((i11 & 14) == 0) {
            if (h11.T(title)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (h11.F(onCloseClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 896) == 0) {
            if (h11.F(onShareClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (h11.F(onDownloadImageClicked)) {
                i13 = RecyclerView.l.FLAG_MOVED;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && h11.i()) {
            h11.L();
        } else {
            if (c.I()) {
                c.U(1130452644, i12, -1, "com.forsale.ui.components.ads.AdNavBarHeader (AdsGeneralDetails.kt:136)");
            }
            androidx.compose.ui.c h12 = SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null);
            h11.C(693286680);
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), b.f74009a.l(), h11, 0);
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(h12);
            if (!(h11.k() instanceof d)) {
                e.c();
            }
            h11.I();
            if (h11.f()) {
                h11.y(a13);
            } else {
                h11.t();
            }
            androidx.compose.runtime.a a14 = Updater.a(h11);
            Updater.c(a14, a11, companion.e());
            Updater.c(a14, s11, companion.g());
            g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
            if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.p(Integer.valueOf(a12), b11);
            }
            c11.invoke(e1.a(e1.b(h11)), h11, 0);
            h11.C(2058660585);
            u uVar = u.f74924a;
            NavBarsKt.a(null, r0.b.b(h11, 745207622, true, new AdsGeneralDetailsKt$AdNavBarHeader$1$1(onCloseClicked, i12)), r0.b.b(h11, -1406275513, true, new AdsGeneralDetailsKt$AdNavBarHeader$1$2(title, i12)), r0.b.b(h11, -1620603664, true, new AdsGeneralDetailsKt$AdNavBarHeader$1$3(onDownloadImageClicked, i12, onShareClicked)), false, h11, 28080, 1);
            h11.S();
            h11.w();
            h11.S();
            h11.S();
            if (c.I()) {
                c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new AdsGeneralDetailsKt$AdNavBarHeader$2(title, onCloseClicked, onShareClicked, onDownloadImageClicked, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.lang.String r18, java.lang.String r19, java.lang.String r20, g00.a<wz.p> r21, g00.a<wz.p> r22, java.lang.String r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.ads.AdsGeneralDetailsKt.b(java.lang.String, java.lang.String, java.lang.String, g00.a, g00.a, java.lang.String, androidx.compose.runtime.a, int, int):void");
    }
}

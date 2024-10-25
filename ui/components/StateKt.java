package com.forsale.ui.components;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import g00.a;
import j0.d1;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
/* compiled from: State.kt */
/* loaded from: classes3.dex */
public final class StateKt {
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00d2, code lost:
        if ((r23 & 8) != 0) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.lang.Integer r16, int r17, int r18, int r19, g00.a<wz.p> r20, androidx.compose.runtime.a r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.StateKt.a(java.lang.Integer, int, int, int, g00.a, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.c r18, java.lang.Integer r19, int r20, int r21, int r22, g00.a<wz.p> r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.StateKt.b(androidx.compose.ui.c, java.lang.Integer, int, int, int, g00.a, androidx.compose.runtime.a, int, int):void");
    }

    public static final void c(c cVar, Painter icon, String str, String desc, String str2, a<p> aVar, androidx.compose.runtime.a aVar2, int i11, int i12) {
        c cVar2;
        String str3;
        String str4;
        a<p> aVar3;
        o.i(icon, "icon");
        o.i(desc, "desc");
        androidx.compose.runtime.a h11 = aVar2.h(381663100);
        if ((i12 & 1) != 0) {
            cVar2 = c.f7566a;
        } else {
            cVar2 = cVar;
        }
        r0.a aVar4 = null;
        if ((i12 & 4) != 0) {
            str3 = null;
        } else {
            str3 = str;
        }
        if ((i12 & 16) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i12 & 32) != 0) {
            aVar3 = null;
        } else {
            aVar3 = aVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(381663100, i11, -1, "com.forsale.ui.components.State (State.kt:22)");
        }
        if (str3 != null) {
            aVar4 = b.b(h11, -1016769461, true, new StateKt$State$1(str3, i11));
        }
        a<p> aVar5 = aVar3;
        String str5 = str4;
        com.forsale.designSystem.layouts.StateKt.a(b.b(h11, -1179313834, true, new StateKt$State$2(icon)), b.b(h11, -1820399977, true, new StateKt$State$3(desc, i11)), cVar2, aVar4, b.b(h11, 551308890, true, new StateKt$State$4(str4, aVar3, i11)), h11, ((i11 << 6) & 896) | 24630, 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new StateKt$State$5(cVar2, icon, str3, desc, str5, aVar5, i11, i12));
        }
    }
}

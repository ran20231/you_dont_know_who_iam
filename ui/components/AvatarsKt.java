package com.forsale.ui.components;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.avatars.AvatarSize;
import g00.a;
import j0.d1;
import kotlin.jvm.internal.o;
import r0.b;
import tj.a;
import v.j;
import v.k;
import wz.p;
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
public final class AvatarsKt {
    public static final void a(c cVar, Painter painter, a<p> onClick, boolean z11, k kVar, AvatarSize avatarSize, androidx.compose.runtime.a aVar, int i11, int i12) {
        c cVar2;
        boolean z12;
        k kVar2;
        o.i(painter, "painter");
        o.i(onClick, "onClick");
        o.i(avatarSize, "avatarSize");
        androidx.compose.runtime.a h11 = aVar.h(-1576095281);
        if ((i12 & 1) != 0) {
            cVar2 = c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if ((i12 & 8) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 16) != 0) {
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                h11.u(D);
            }
            h11.S();
            kVar2 = (k) D;
        } else {
            kVar2 = kVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1576095281, i11, -1, "com.forsale.ui.components.Avatar (Avatars.kt:82)");
        }
        com.forsale.designSystem.avatars.AvatarsKt.a(cVar2, b.b(h11, 1691553736, true, new AvatarsKt$Avatar$7(painter)), onClick, z12, kVar2, new a.c(avatarSize), h11, (i11 & 14) | 48 | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (a.c.f71070c << 15), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new AvatarsKt$Avatar$8(cVar2, painter, onClick, z12, kVar2, avatarSize, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.c r17, g00.a<wz.p> r18, boolean r19, v.k r20, com.forsale.designSystem.avatars.AvatarSize r21, androidx.compose.runtime.a r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.AvatarsKt.b(androidx.compose.ui.c, g00.a, boolean, v.k, com.forsale.designSystem.avatars.AvatarSize, androidx.compose.runtime.a, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(androidx.compose.ui.c r18, java.lang.String r19, g00.a<wz.p> r20, boolean r21, v.k r22, com.forsale.designSystem.avatars.AvatarSize r23, androidx.compose.runtime.a r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.ui.components.AvatarsKt.c(androidx.compose.ui.c, java.lang.String, g00.a, boolean, v.k, com.forsale.designSystem.avatars.AvatarSize, androidx.compose.runtime.a, int, int):void");
    }
}

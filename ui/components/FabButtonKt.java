package com.forsale.ui.components;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.buttons.ButtonFABData;
import com.forsale.designSystem.buttons.ButtonFABKt;
import e2.h;
import g00.a;
import j0.d1;
import kotlin.jvm.internal.o;
import r0.b;
import s.n;
import v.j;
import v.k;
import wz.p;
import yj.d;
/* compiled from: FabButton.kt */
/* loaded from: classes3.dex */
public final class FabButtonKt {
    public static final void a(c cVar, a<p> onClick, ButtonFABData buttonFABData, Painter icon, long j11, long j12, float f11, k kVar, n nVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        c cVar2;
        ButtonFABData buttonFABData2;
        int i13;
        long j13;
        long j14;
        float f12;
        k kVar2;
        n nVar2;
        o.i(onClick, "onClick");
        o.i(icon, "icon");
        androidx.compose.runtime.a h11 = aVar.h(-577638123);
        if ((i12 & 1) != 0) {
            cVar2 = c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if ((i12 & 4) != 0) {
            buttonFABData2 = ButtonFABData.f41024a.a();
            i13 = i11 & (-897);
        } else {
            buttonFABData2 = buttonFABData;
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            j13 = dk.a.f54291a.a(h11, dk.a.f54292b).f().m(h11, d.f76453b);
            i13 &= -57345;
        } else {
            j13 = j11;
        }
        if ((i12 & 32) != 0) {
            j14 = dk.a.f54291a.a(h11, dk.a.f54292b).g().c(h11, d.f76453b);
            i13 &= -458753;
        } else {
            j14 = j12;
        }
        if ((i12 & 64) != 0) {
            f12 = h.l(5);
        } else {
            f12 = f11;
        }
        if ((i12 & 128) != 0) {
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
        if ((i12 & 256) != 0) {
            nVar2 = null;
        } else {
            nVar2 = nVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-577638123, i13, -1, "com.forsale.ui.components.FABButton (FabButton.kt:27)");
        }
        int i14 = i13 >> 3;
        ButtonFABKt.a(cVar2, onClick, buttonFABData2, b.b(h11, -1309161174, true, new FabButtonKt$FABButton$2(icon, j13, i13)), j14, f12, kVar2, nVar2, h11, (i13 & 14) | 3072 | (i13 & 112) | (ButtonFABData.f41025b << 6) | (i13 & 896) | (57344 & i14) | (458752 & i14) | (3670016 & i14) | (i14 & 29360128), 0);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new FabButtonKt$FABButton$3(cVar2, onClick, buttonFABData2, icon, j13, j14, f12, kVar2, nVar2, i11, i12));
        }
    }
}

package com.forsale.designSystem.layouts;

import androidx.compose.ui.c;
import androidx.compose.ui.graphics.painter.Painter;
import b1.t1;
import c0.g;
import com.forsale.designSystem.SurfaceKt;
import e2.h;
import j0.d1;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
public final class CardSubKt {
    public static final void a(g00.a<p> onClick, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> title, Painter painter, boolean z11, androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.c cVar2;
        o.i(onClick, "onClick");
        o.i(title, "title");
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(994031225);
        if ((i12 & 16) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(994031225, i11, -1, "com.forsale.designSystem.layouts.CardSubCircle (CardSub.kt:121)");
        }
        SurfaceKt.a(onClick, cVar2, null, t1.f15974b.e(), 0L, null, 0.0f, null, null, false, null, null, r0.b.b(h11, 1588487376, true, new CardSubKt$CardSubCircle$1(title, i11, painter, z11)), h11, (i11 & 14) | 100666368 | ((i11 >> 9) & 112), 384, 3828);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardSubKt$CardSubCircle$2(onClick, title, painter, z11, cVar2, i11, i12));
        }
    }

    public static final void b(g00.a<p> onClick, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> title, Painter painter, androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        c.a aVar2;
        o.i(onClick, "onClick");
        o.i(title, "title");
        o.i(painter, "painter");
        androidx.compose.runtime.a h11 = aVar.h(-863963366);
        if ((i12 & 8) != 0) {
            aVar2 = androidx.compose.ui.c.f7566a;
        } else {
            aVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-863963366, i11, -1, "com.forsale.designSystem.layouts.CardSubRectangle (CardSub.kt:29)");
        }
        SurfaceKt.a(onClick, aVar2, g.c(h.l(8)), dk.a.f54291a.a(h11, 6).e().h(h11, 0), 0L, null, 0.0f, null, null, false, null, null, r0.b.b(h11, -948539805, true, new CardSubKt$CardSubRectangle$1(painter, title, i11)), h11, (i11 & 14) | 100663296 | ((i11 >> 6) & 112), 384, 3824);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardSubKt$CardSubRectangle$2(onClick, title, painter, aVar2, i11, i12));
        }
    }

    public static final void c(g00.a<p> onClick, Painter painter, g00.p<? super androidx.compose.runtime.a, ? super Integer, p> title, boolean z11, androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        androidx.compose.ui.c cVar2;
        o.i(onClick, "onClick");
        o.i(painter, "painter");
        o.i(title, "title");
        androidx.compose.runtime.a h11 = aVar.h(-1778990004);
        if ((i12 & 16) != 0) {
            cVar2 = androidx.compose.ui.c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1778990004, i11, -1, "com.forsale.designSystem.layouts.CardSubSquare (CardSub.kt:72)");
        }
        SurfaceKt.a(onClick, cVar2, g.c(h.l(8)), t1.f15974b.e(), 0L, null, 0.0f, null, null, false, null, null, r0.b.b(h11, -1184533853, true, new CardSubKt$CardSubSquare$1(title, i11, z11, painter)), h11, (i11 & 14) | 3072 | ((i11 >> 9) & 112), 384, 4080);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new CardSubKt$CardSubSquare$2(onClick, painter, title, z11, cVar2, i11, i12));
        }
    }
}

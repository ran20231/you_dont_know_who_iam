package com.forsale.app.features.auth.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import e2.h;
import g00.a;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.v0;
import kotlin.jvm.internal.o;
import p1.g;
import r0.b;
import v0.b;
import w.t;
import w.u;
import wz.p;
import yj.d;
/* compiled from: ClickableText.kt */
/* loaded from: classes2.dex */
public final class ClickableTextKt {
    public static final void a(c cVar, final int i11, final a<p> onClicked, androidx.compose.runtime.a aVar, final int i12, final int i13) {
        Object obj;
        final int i14;
        int i15;
        int i16;
        int i17;
        c.a aVar2;
        o.i(onClicked, "onClicked");
        androidx.compose.runtime.a h11 = aVar.h(798772435);
        int i18 = i13 & 1;
        if (i18 != 0) {
            i14 = i12 | 6;
            obj = cVar;
        } else if ((i12 & 14) == 0) {
            obj = cVar;
            if (h11.T(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i12;
        } else {
            obj = cVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (h11.d(i11)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (h11.F(onClicked)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i14 & 731) == 146 && h11.i()) {
            h11.L();
            aVar2 = obj;
        } else {
            if (i18 != 0) {
                aVar2 = c.f7566a;
            } else {
                aVar2 = obj;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(798772435, i14, -1, "com.forsale.app.features.auth.views.AuthClickableText (ClickableText.kt:20)");
            }
            ButtonsKt.k(onClicked, aVar2, ButtonData.f40994a.e(), false, true, null, b.b(h11, 1146750925, true, new q<t, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.ClickableTextKt$AuthClickableText$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(t TextButton, androidx.compose.runtime.a aVar3, int i19) {
                    o.i(TextButton, "$this$TextButton");
                    if ((i19 & 81) == 16 && aVar3.i()) {
                        aVar3.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1146750925, i19, -1, "com.forsale.app.features.auth.views.AuthClickableText.<anonymous> (ClickableText.kt:27)");
                    }
                    String b11 = g.b(i11, aVar3, (i14 >> 3) & 14);
                    dk.a aVar4 = dk.a.f54291a;
                    int i21 = dk.a.f54292b;
                    TextKt.a(b11, null, 0, 0, false, 0, 0, null, aVar4.c(aVar3, i21).f(), aVar4.a(aVar3, i21).f().i(aVar3, d.f76453b), 0, aVar3, 0, 0, 1278);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(t tVar, androidx.compose.runtime.a aVar3, Integer num) {
                    b(tVar, aVar3, num.intValue());
                    return p.f75480a;
                }
            }), h11, ((i14 >> 6) & 14) | 1597440 | ((i14 << 3) & 112) | (ButtonData.f40995b << 6), 40);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            final c cVar2 = aVar2;
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.ClickableTextKt$AuthClickableText$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar3, int i19) {
                    ClickableTextKt.a(c.this, i11, onClicked, aVar3, v0.a(i12 | 1), i13);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar3, Integer num) {
                    b(aVar3, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    public static final void b(c cVar, final String title, final int i11, final a<p> onClicked, androidx.compose.runtime.a aVar, final int i12, final int i13) {
        Object obj;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        c.a aVar2;
        androidx.compose.runtime.a aVar3;
        final c cVar2;
        o.i(title, "title");
        o.i(onClicked, "onClicked");
        androidx.compose.runtime.a h11 = aVar.h(-817325662);
        int i19 = i13 & 1;
        if (i19 != 0) {
            i14 = i12 | 6;
            obj = cVar;
        } else if ((i12 & 14) == 0) {
            obj = cVar;
            if (h11.T(obj)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i14 = i15 | i12;
        } else {
            obj = cVar;
            i14 = i12;
        }
        if ((i13 & 2) != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            if (h11.T(title)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i13 & 4) != 0) {
            i14 |= 384;
        } else if ((i12 & 896) == 0) {
            if (h11.d(i11)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i14 |= i17;
        }
        if ((i13 & 8) != 0) {
            i14 |= 3072;
        } else if ((i12 & 7168) == 0) {
            if (h11.F(onClicked)) {
                i18 = RecyclerView.l.FLAG_MOVED;
            } else {
                i18 = 1024;
            }
            i14 |= i18;
        }
        if ((i14 & 5851) == 1170 && h11.i()) {
            h11.L();
            cVar2 = obj;
            aVar3 = h11;
        } else {
            if (i19 != 0) {
                aVar2 = c.f7566a;
            } else {
                aVar2 = obj;
            }
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(-817325662, i14, -1, "com.forsale.app.features.auth.views.AuthClickableTextWithTitle (ClickableText.kt:41)");
            }
            b.c i21 = v0.b.f74009a.i();
            int i22 = (i14 & 14) | 384;
            h11.C(693286680);
            int i23 = i22 >> 3;
            a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), i21, h11, (i23 & 112) | (i23 & 14));
            h11.C(-1323940314);
            int a12 = e.a(h11, 0);
            k s11 = h11.s();
            ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
            a<ComposeUiNode> a13 = companion.a();
            q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(aVar2);
            int i24 = ((((i22 << 3) & 112) << 9) & 7168) | 6;
            if (!(h11.k() instanceof j0.d)) {
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
            c11.invoke(e1.a(e1.b(h11)), h11, Integer.valueOf((i24 >> 3) & 112));
            h11.C(2058660585);
            u uVar = u.f74924a;
            int i25 = i14 >> 3;
            aVar3 = h11;
            TextKt.a(title, PaddingKt.m(c.f7566a, 0.0f, 0.0f, h.l(4), 0.0f, 11, null), 0, 0, false, 0, 0, null, dk.a.f54291a.c(h11, dk.a.f54292b).c(), 0L, 0, h11, (i25 & 14) | 48, 0, 1788);
            a(null, i11, onClicked, aVar3, (i25 & 112) | (i25 & 896), 1);
            aVar3.S();
            aVar3.w();
            aVar3.S();
            aVar3.S();
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            cVar2 = aVar2;
        }
        d1 l11 = aVar3.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.auth.views.ClickableTextKt$AuthClickableTextWithTitle$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar4, int i26) {
                    ClickableTextKt.b(c.this, title, i11, onClicked, aVar4, v0.a(i12 | 1), i13);
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                    b(aVar4, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }
}

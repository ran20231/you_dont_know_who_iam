package com.forsale.designSystem.tabs;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.c;
import ck.a;
import e2.h;
import g00.l;
import j0.d1;
import java.util.List;
import kotlin.jvm.internal.o;
import r0.b;
import wz.p;
/* compiled from: PrimaryTab.kt */
/* loaded from: classes3.dex */
public final class PrimaryTabKt {
    public static final void a(c cVar, List<a> primaryTabItems, int i11, l<? super Integer, p> onTabIndexChange, androidx.compose.runtime.a aVar, int i12, int i13) {
        c cVar2;
        o.i(primaryTabItems, "primaryTabItems");
        o.i(onTabIndexChange, "onTabIndexChange");
        androidx.compose.runtime.a h11 = aVar.h(997442878);
        if ((i13 & 1) != 0) {
            cVar2 = c.f7566a;
        } else {
            cVar2 = cVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(997442878, i12, -1, "com.forsale.designSystem.tabs.PrimaryTabs (PrimaryTab.kt:30)");
        }
        PrimaryTabsRowKt.b(i11, SizeKt.i(cVar2, h.l(48)), 0L, 0L, b.b(h11, 693246633, true, new PrimaryTabKt$PrimaryTabs$1(primaryTabItems, i11, onTabIndexChange, i12)), h11, ((i12 >> 6) & 14) | 24576, 12);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new PrimaryTabKt$PrimaryTabs$2(cVar2, primaryTabItems, i11, onTabIndexChange, i12, i13));
        }
    }
}

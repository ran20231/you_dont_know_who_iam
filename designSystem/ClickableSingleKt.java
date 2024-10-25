package com.forsale.designSystem;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import com.forsale.designSystem.a;
import g00.l;
import kotlin.jvm.internal.o;
import q1.i;
import s.n;
import v.j;
import v.k;
import wz.p;
/* compiled from: ClickableSingle.kt */
/* loaded from: classes3.dex */
public final class ClickableSingleKt {
    public static final c a(c clickableSingle, boolean z11, String str, i iVar, n nVar, k kVar, g00.a<p> onClick, androidx.compose.runtime.a aVar, int i11, int i12) {
        boolean z12;
        String str2;
        i iVar2;
        n nVar2;
        k kVar2;
        l a11;
        o.i(clickableSingle, "$this$clickableSingle");
        o.i(onClick, "onClick");
        aVar.C(855083444);
        if ((i12 & 1) != 0) {
            z12 = true;
        } else {
            z12 = z11;
        }
        if ((i12 & 2) != 0) {
            str2 = null;
        } else {
            str2 = str;
        }
        if ((i12 & 4) != 0) {
            iVar2 = null;
        } else {
            iVar2 = iVar;
        }
        if ((i12 & 8) != 0) {
            nVar2 = (n) aVar.q(IndicationKt.a());
        } else {
            nVar2 = nVar;
        }
        if ((i12 & 16) != 0) {
            aVar.C(-492369756);
            Object D = aVar.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                aVar.u(D);
            }
            aVar.S();
            kVar2 = (k) D;
        } else {
            kVar2 = kVar;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(855083444, i11, -1, "com.forsale.designSystem.clickableSingle (ClickableSingle.kt:49)");
        }
        if (InspectableValueKt.c()) {
            a11 = new ClickableSingleKt$clickableSinglehoGz1lA$$inlined$debugInspectorInfo$1(z12, str2, iVar2, onClick, nVar2, kVar2);
        } else {
            a11 = InspectableValueKt.a();
        }
        c a12 = ComposedModifierKt.a(clickableSingle, a11, new ClickableSingleKt$clickableSingle$3(kVar2, nVar2, z12, str2, iVar2, onClick));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return a12;
    }

    public static final a b(a.C0463a c0463a) {
        o.i(c0463a, "<this>");
        return new b();
    }
}

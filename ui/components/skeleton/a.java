package com.forsale.ui.components.skeleton;

import androidx.compose.ui.c;
import b1.n4;
import b1.s4;
import com.google.accompanist.placeholder.PlaceholderKt;
import kotlin.jvm.internal.o;
import yj.d;
/* compiled from: skeleton.kt */
/* loaded from: classes3.dex */
public final class a {
    public static final c a(c placeholder, boolean z11, s4 s4Var, long j11, long j12, androidx.compose.runtime.a aVar, int i11, int i12) {
        s4 s4Var2;
        long j13;
        long j14;
        o.i(placeholder, "$this$placeholder");
        aVar.C(-1811560235);
        if ((i12 & 2) != 0) {
            s4Var2 = n4.a();
        } else {
            s4Var2 = s4Var;
        }
        if ((i12 & 4) != 0) {
            j13 = dk.a.f54291a.a(aVar, dk.a.f54292b).e().h(aVar, d.f76453b);
        } else {
            j13 = j11;
        }
        if ((i12 & 8) != 0) {
            j14 = dk.a.f54291a.a(aVar, dk.a.f54292b).e().d(aVar, d.f76453b);
        } else {
            j14 = j12;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1811560235, i11, -1, "com.forsale.ui.components.skeleton.placeholder (skeleton.kt:65)");
        }
        c d11 = PlaceholderKt.d(placeholder, z11, j13, s4Var2, new VerticalLinearShimmer(j14, 0.0f, 2, null), null, null, 48, null);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return d11;
    }
}

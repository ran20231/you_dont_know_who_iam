package com.forsale.designSystem.iconography;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import g00.q;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import y0.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Icon.kt */
/* loaded from: classes3.dex */
public final class IconKt$mirror$1 extends Lambda implements q<c, a, Integer, c> {

    /* renamed from: a  reason: collision with root package name */
    public static final IconKt$mirror$1 f41353a = new IconKt$mirror$1();

    IconKt$mirror$1() {
        super(3);
    }

    public final c b(c composed, a aVar, int i11) {
        o.i(composed, "$this$composed");
        aVar.C(-1220316679);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(-1220316679, i11, -1, "com.forsale.designSystem.iconography.mirror.<anonymous> (Icon.kt:118)");
        }
        if (aVar.q(CompositionLocalsKt.j()) == LayoutDirection.Rtl) {
            composed = k.a(composed, -1.0f, 1.0f);
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        aVar.S();
        return composed;
    }

    @Override // g00.q
    public /* bridge */ /* synthetic */ c invoke(c cVar, a aVar, Integer num) {
        return b(cVar, aVar, num.intValue());
    }
}

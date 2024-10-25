package com.forsale.designSystem;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.c;
import kotlin.jvm.internal.o;
import wz.p;
/* compiled from: ForSaleSelectable.kt */
/* loaded from: classes3.dex */
public final class ForSaleSelectableKt {
    public static final c a(c cVar, boolean z11, g00.a<p> onClick) {
        o.i(cVar, "<this>");
        o.i(onClick, "onClick");
        return ComposedModifierKt.b(cVar, null, new ForSaleSelectableKt$selectable$1(z11, onClick), 1, null);
    }
}

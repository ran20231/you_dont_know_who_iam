package com.forsale.designSystem.tabs;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.c;
import androidx.compose.ui.platform.InspectableValueKt;
import ck.b;
import g00.l;
import kotlin.jvm.internal.o;
/* compiled from: TabIndicatorOffset.kt */
/* loaded from: classes3.dex */
public final class TabIndicatorOffsetKt {
    public static final c a(c cVar, b currentTabPosition) {
        l a11;
        o.i(cVar, "<this>");
        o.i(currentTabPosition, "currentTabPosition");
        if (InspectableValueKt.c()) {
            a11 = new TabIndicatorOffsetKt$tabIndicatorOffset$$inlined$debugInspectorInfo$1(currentTabPosition);
        } else {
            a11 = InspectableValueKt.a();
        }
        return ComposedModifierKt.a(cVar, a11, new TabIndicatorOffsetKt$tabIndicatorOffset$2(currentTabPosition));
    }
}

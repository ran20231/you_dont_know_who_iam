package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
import p1.e;
import sj.d;
/* compiled from: SearchToolbar.kt */
/* renamed from: com.forsale.ui.components.ComposableSingletons$SearchToolbarKt$lambda-3$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$SearchToolbarKt$lambda3$1 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$SearchToolbarKt$lambda3$1 f42294a = new ComposableSingletons$SearchToolbarKt$lambda3$1();

    ComposableSingletons$SearchToolbarKt$lambda3$1() {
        super(2);
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-695335840, i11, -1, "com.forsale.ui.components.ComposableSingletons$SearchToolbarKt.lambda-3.<anonymous> (SearchToolbar.kt:173)");
        }
        IconKt.b(e.d(d.f68672i, aVar, 0), null, null, 0L, false, 0.0f, true, aVar, 1573256, 58);
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

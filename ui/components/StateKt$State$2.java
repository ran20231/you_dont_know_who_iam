package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: State.kt */
/* loaded from: classes3.dex */
final class StateKt$State$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f42406a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateKt$State$2(Painter painter) {
        super(2);
        this.f42406a = painter;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1179313834, i11, -1, "com.forsale.ui.components.State.<anonymous> (State.kt:25)");
        }
        IconKt.a(this.f42406a, null, null, 0L, false, 0.0f, aVar, 8, 62);
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

package com.forsale.ui.components;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Avatars.kt */
/* loaded from: classes3.dex */
final class AvatarsKt$Avatar$7 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f42241a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvatarsKt$Avatar$7(Painter painter) {
        super(2);
        this.f42241a = painter;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1691553736, i11, -1, "com.forsale.ui.components.Avatar.<anonymous> (Avatars.kt:85)");
        }
        androidx.compose.ui.layout.c a11 = androidx.compose.ui.layout.c.f8188a.a();
        ImageKt.a(this.f42241a, null, AspectRatioKt.b(androidx.compose.ui.c.f7566a, 1.0f, false, 2, null), null, a11, 0.0f, null, aVar, 25016, 104);
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

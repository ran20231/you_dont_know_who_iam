package com.forsale.ui.components;

import androidx.compose.runtime.a;
import androidx.compose.runtime.c;
import androidx.compose.ui.graphics.painter.Painter;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FabButton.kt */
/* loaded from: classes3.dex */
public final class FabButtonKt$FABButton$2 extends Lambda implements p<a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Painter f42295a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f42296b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f42297c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FabButtonKt$FABButton$2(Painter painter, long j11, int i11) {
        super(2);
        this.f42295a = painter;
        this.f42296b = j11;
        this.f42297c = i11;
    }

    public final void b(a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1309161174, i11, -1, "com.forsale.ui.components.FABButton.<anonymous> (FabButton.kt:32)");
        }
        IconKt.a(this.f42295a, null, null, this.f42296b, false, 0.0f, aVar, ((this.f42297c >> 3) & 7168) | 8, 54);
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

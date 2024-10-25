package com.forsale.designSystem.checkboxes;

import androidx.compose.runtime.c;
import com.forsale.designSystem.iconography.IconKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
import p1.e;
import sj.d;
/* compiled from: Checkboxes.kt */
/* loaded from: classes3.dex */
final class CheckboxesKt$DrawCheckbox$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f41230a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f41231b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41232c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxesKt$DrawCheckbox$2(boolean z11, long j11, int i11) {
        super(2);
        this.f41230a = z11;
        this.f41231b = j11;
        this.f41232c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1899936168, i11, -1, "com.forsale.designSystem.checkboxes.DrawCheckbox.<anonymous> (Checkboxes.kt:94)");
        }
        if (this.f41230a) {
            IconKt.b(e.d(d.f68680q, aVar, 0), null, "", this.f41231b, false, 0.0f, true, aVar, ((this.f41232c >> 6) & 7168) | 1573256, 50);
        }
        if (c.I()) {
            c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

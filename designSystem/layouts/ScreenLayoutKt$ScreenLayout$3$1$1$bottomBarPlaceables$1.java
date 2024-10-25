package com.forsale.designSystem.layouts;

import androidx.compose.runtime.CompositionLocalKt;
import g00.p;
import j0.t0;
import kotlin.jvm.internal.Lambda;
/* compiled from: ScreenLayout.kt */
/* loaded from: classes3.dex */
final class ScreenLayoutKt$ScreenLayout$3$1$1$bottomBarPlaceables$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f41856a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41857b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41858c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScreenLayoutKt$ScreenLayout$3$1$1$bottomBarPlaceables$1(d dVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41856a = dVar;
        this.f41857b = pVar;
        this.f41858c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(2006261019, i11, -1, "com.forsale.designSystem.layouts.ScreenLayout.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenLayout.kt:118)");
        }
        CompositionLocalKt.a(ScreenLayoutKt.f().c(this.f41856a), this.f41857b, aVar, t0.f59917d | 0 | ((this.f41858c >> 15) & 112));
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

package com.forsale.designSystem.layouts;

import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: ScreenLayout.kt */
/* renamed from: com.forsale.designSystem.layouts.ComposableSingletons$ScreenLayoutKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$ScreenLayoutKt$lambda1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$ScreenLayoutKt$lambda1$1 f41747a = new ComposableSingletons$ScreenLayoutKt$lambda1$1();

    ComposableSingletons$ScreenLayoutKt$lambda1$1() {
        super(2);
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1480428529, i11, -1, "com.forsale.designSystem.layouts.ComposableSingletons$ScreenLayoutKt.lambda-1.<anonymous> (ScreenLayout.kt:31)");
        }
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

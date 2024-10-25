package com.forsale.designSystem.layouts;

import com.forsale.designSystem.TextKt;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* compiled from: Cards.kt */
/* renamed from: com.forsale.designSystem.layouts.ComposableSingletons$CardsKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$CardsKt$lambda1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    public static final ComposableSingletons$CardsKt$lambda1$1 f41741a = new ComposableSingletons$CardsKt$lambda1$1();

    ComposableSingletons$CardsKt$lambda1$1() {
        super(2);
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1250899066, i11, -1, "com.forsale.designSystem.layouts.ComposableSingletons$CardsKt.lambda-1.<anonymous> (Cards.kt:144)");
        }
        TextKt.a("", null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 6, 0, 2046);
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

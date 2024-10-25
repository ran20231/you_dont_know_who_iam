package com.forsale.designSystem.layouts;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.ui.text.a0;
import b1.t1;
import com.forsale.designSystem.typography.ValuesKt;
import g00.p;
import j0.s0;
import j0.t0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
final class CardsKt$TrailingMolecule$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41731a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41732b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41733c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$TrailingMolecule$1$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, int i11) {
        super(2);
        this.f41731a = pVar;
        this.f41732b = pVar2;
        this.f41733c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(546629044, i11, -1, "com.forsale.designSystem.layouts.TrailingMolecule.<anonymous>.<anonymous> (Cards.kt:149)");
        }
        s0<a0> c11 = ValuesKt.c();
        dk.a aVar2 = dk.a.f54291a;
        CompositionLocalKt.b(new t0[]{c11.c(aVar2.c(aVar, 6).q()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar2.a(aVar, 6).f().i(aVar, 0)))}, this.f41731a, aVar, 8);
        if (this.f41732b != null) {
            CompositionLocalKt.b(new t0[]{ValuesKt.c().c(aVar2.c(aVar, 6).c()), com.forsale.designSystem.colors.ValuesKt.d().c(t1.g(aVar2.a(aVar, 6).f().i(aVar, 0)))}, this.f41732b, aVar, (this.f41733c & 112) | 8);
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

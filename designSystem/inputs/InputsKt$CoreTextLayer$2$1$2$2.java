package com.forsale.designSystem.inputs;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.c;
import b1.t1;
import com.forsale.designSystem.colors.ValuesKt;
import g00.p;
import j0.t0;
import kotlin.jvm.internal.Lambda;
import zj.g;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$CoreTextLayer$2$1$2$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41378a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f41379b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41380c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$CoreTextLayer$2$1$2$2(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, g gVar, int i11) {
        super(2);
        this.f41378a = pVar;
        this.f41379b = gVar;
        this.f41380c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(1655764863, i11, -1, "com.forsale.designSystem.inputs.CoreTextLayer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Inputs.kt:474)");
        }
        if (this.f41378a != null) {
            CompositionLocalKt.b(new t0[]{ValuesKt.d().c(t1.g(this.f41379b.j())), com.forsale.designSystem.typography.ValuesKt.c().c(dk.a.f54291a.c(aVar, 6).b())}, this.f41378a, aVar, ((this.f41380c >> 24) & 112) | 8);
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

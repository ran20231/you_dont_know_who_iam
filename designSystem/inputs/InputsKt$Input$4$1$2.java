package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import com.forsale.designSystem.TextKt;
import g00.p;
import j0.k0;
import kotlin.jvm.internal.Lambda;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$Input$4$1$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<String> f41446a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsKt$Input$4$1$2(k0<String> k0Var) {
        super(2);
        this.f41446a = k0Var;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(702877242, i11, -1, "com.forsale.designSystem.inputs.Input.<anonymous>.<anonymous>.<anonymous> (Inputs.kt:157)");
        }
        TextKt.a(this.f41446a.getValue(), null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar, 0, 0, 2046);
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

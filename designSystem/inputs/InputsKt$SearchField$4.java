package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import b1.t1;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$SearchField$4 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41512a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41513b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputsKt$SearchField$4(int i11, int i12) {
        super(2);
        this.f41512a = i11;
        this.f41513b = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(455638406, i11, -1, "com.forsale.designSystem.inputs.SearchField.<anonymous> (Inputs.kt:838)");
        }
        InputsKt.f(this.f41512a, 0.0f, false, t1.g(dk.a.f54291a.a(aVar, 6).e().g(aVar, 0)), null, aVar, (this.f41513b >> 15) & 14, 22);
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

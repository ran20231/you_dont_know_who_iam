package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import g00.p;
import kotlin.jvm.internal.Lambda;
import zj.g;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$CoreTextLayer$2$1$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41371a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41372b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f41373c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g f41374d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$CoreTextLayer$2$1$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11, a aVar, g gVar) {
        super(2);
        this.f41371a = pVar;
        this.f41372b = i11;
        this.f41373c = aVar;
        this.f41374d = gVar;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-1524650519, i11, -1, "com.forsale.designSystem.inputs.CoreTextLayer.<anonymous>.<anonymous>.<anonymous> (Inputs.kt:449)");
        }
        this.f41371a.invoke(aVar, Integer.valueOf((this.f41372b >> 18) & 14));
        if (this.f41373c.a()) {
            InputsKt.m(null, this.f41374d.e(), 0.0f, 0.0f, aVar, 0, 13);
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

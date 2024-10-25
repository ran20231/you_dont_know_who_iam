package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import g00.p;
import kotlin.jvm.internal.Lambda;
import zj.g;
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
final class InputsKt$CoreTextLayer$2$1$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f41382a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g f41383b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41384c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41385d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$CoreTextLayer$2$1$3(a aVar, g gVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41382a = aVar;
        this.f41383b = gVar;
        this.f41384c = pVar;
        this.f41385d = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-382188576, i11, -1, "com.forsale.designSystem.inputs.CoreTextLayer.<anonymous>.<anonymous>.<anonymous> (Inputs.kt:497)");
        }
        aVar.C(1868148811);
        if (this.f41382a.c()) {
            InputsKt.m(null, this.f41383b.e(), 0.0f, 0.0f, aVar, 0, 13);
        }
        aVar.S();
        this.f41384c.invoke(aVar, Integer.valueOf((this.f41385d >> 21) & 14));
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

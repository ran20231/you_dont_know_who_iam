package com.forsale.designSystem.inputs;

import androidx.compose.runtime.c;
import g00.l;
import g00.p;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Inputs.kt */
/* loaded from: classes3.dex */
public final class InputsKt$SearchField$3 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f41506a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l<String, wz.p> f41507b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41508c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41509d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public InputsKt$SearchField$3(int i11, l<? super String, wz.p> lVar, g00.a<wz.p> aVar, int i12) {
        super(2);
        this.f41506a = i11;
        this.f41507b = lVar;
        this.f41508c = aVar;
        this.f41509d = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.compose.runtime.a] */
    public final void b(androidx.compose.runtime.a aVar, int i11) {
        if ((i11 & 11) == 2 && aVar.i()) {
            aVar.L();
            return;
        }
        if (c.I()) {
            c.U(-665053110, i11, -1, "com.forsale.designSystem.inputs.SearchField.<anonymous> (Inputs.kt:841)");
        }
        InputsKt.m(null, 0L, 0.0f, 0.0f, aVar, 0, 15);
        int i12 = this.f41506a;
        l<String, wz.p> lVar = this.f41507b;
        g00.a<wz.p> aVar2 = this.f41508c;
        aVar.C(511388516);
        boolean T = aVar.T(lVar) | aVar.T(aVar2);
        Object D = aVar.D();
        if (T || D == androidx.compose.runtime.a.f7182a.a()) {
            D = new InputsKt$SearchField$3$1$1(lVar, aVar2);
            aVar.u(D);
        }
        aVar.S();
        InputsKt.f(i12, 0.0f, false, null, D, aVar, (this.f41509d >> 18) & 14, 14);
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

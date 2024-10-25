package com.forsale.designSystem.layouts;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$TrailingMolecule$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41734a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41735b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f41736c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$TrailingMolecule$2(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, int i11) {
        super(2);
        this.f41734a = pVar;
        this.f41735b = pVar2;
        this.f41736c = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardsKt.k(this.f41734a, this.f41735b, aVar, v0.a(this.f41736c | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

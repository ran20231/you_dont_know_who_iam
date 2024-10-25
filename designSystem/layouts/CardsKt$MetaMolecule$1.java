package com.forsale.designSystem.layouts;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$MetaMolecule$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41720a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f41721b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$MetaMolecule$1(p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11) {
        super(2);
        this.f41720a = pVar;
        this.f41721b = i11;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardsKt.h(this.f41720a, aVar, v0.a(this.f41721b | 1));
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

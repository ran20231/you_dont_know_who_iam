package com.forsale.designSystem.layouts;

import b1.s4;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$Card$1 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41608a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s4 f41609b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f41610c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f41611d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41612e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41613f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41614g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f41615h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$Card$1(androidx.compose.ui.c cVar, s4 s4Var, long j11, float f11, g00.a<wz.p> aVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, int i11, int i12) {
        super(2);
        this.f41608a = cVar;
        this.f41609b = s4Var;
        this.f41610c = j11;
        this.f41611d = f11;
        this.f41612e = aVar;
        this.f41613f = pVar;
        this.f41614g = i11;
        this.f41615h = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardsKt.a(this.f41608a, this.f41609b, this.f41610c, this.f41611d, this.f41612e, this.f41613f, aVar, v0.a(this.f41614g | 1), this.f41615h);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

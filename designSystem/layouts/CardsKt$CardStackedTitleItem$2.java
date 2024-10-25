package com.forsale.designSystem.layouts;

import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
import w.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$CardStackedTitleItem$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ t f41702a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41703b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41704c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41705d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f41706e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardsKt$CardStackedTitleItem$2(t tVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar2, int i11, int i12) {
        super(2);
        this.f41702a = tVar;
        this.f41703b = pVar;
        this.f41704c = pVar2;
        this.f41705d = i11;
        this.f41706e = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardsKt.f(this.f41702a, this.f41703b, this.f41704c, aVar, v0.a(this.f41705d | 1), this.f41706e);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

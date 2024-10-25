package com.forsale.ui.components.cards;

import coil.compose.AsyncImagePainter;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.o;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cards.kt */
/* loaded from: classes3.dex */
public final class CardsKt$CardHorizontal$29$1 extends Lambda implements l<AsyncImagePainter.b.d, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f42499a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardHorizontal$29$1(k0<Boolean> k0Var) {
        super(1);
        this.f42499a = k0Var;
    }

    public final void b(AsyncImagePainter.b.d it2) {
        o.i(it2, "it");
        CardsKt.f(this.f42499a, false);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.d dVar) {
        b(dVar);
        return p.f75480a;
    }
}

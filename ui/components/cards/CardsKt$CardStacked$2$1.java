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
public final class CardsKt$CardStacked$2$1 extends Lambda implements l<AsyncImagePainter.b.c, p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0<Boolean> f42583a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardsKt$CardStacked$2$1(k0<Boolean> k0Var) {
        super(1);
        this.f42583a = k0Var;
    }

    public final void b(AsyncImagePainter.b.c it2) {
        o.i(it2, "it");
        CardsKt.k(this.f42583a, true);
    }

    @Override // g00.l
    public /* bridge */ /* synthetic */ p invoke(AsyncImagePainter.b.c cVar) {
        b(cVar);
        return p.f75480a;
    }
}

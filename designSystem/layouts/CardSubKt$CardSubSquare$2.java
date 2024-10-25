package com.forsale.designSystem.layouts;

import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
public final class CardSubKt$CardSubSquare$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41601a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Painter f41602b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41603c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41604d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41605e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41606f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41607g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardSubKt$CardSubSquare$2(g00.a<wz.p> aVar, Painter painter, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, boolean z11, androidx.compose.ui.c cVar, int i11, int i12) {
        super(2);
        this.f41601a = aVar;
        this.f41602b = painter;
        this.f41603c = pVar;
        this.f41604d = z11;
        this.f41605e = cVar;
        this.f41606f = i11;
        this.f41607g = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardSubKt.c(this.f41601a, this.f41602b, this.f41603c, this.f41604d, this.f41605e, aVar, v0.a(this.f41606f | 1), this.f41607g);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}

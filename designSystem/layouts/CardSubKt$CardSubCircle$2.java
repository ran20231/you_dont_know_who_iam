package com.forsale.designSystem.layouts;

import androidx.compose.ui.graphics.painter.Painter;
import g00.p;
import j0.v0;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CardSub.kt */
/* loaded from: classes3.dex */
public final class CardSubKt$CardSubCircle$2 extends Lambda implements p<androidx.compose.runtime.a, Integer, wz.p> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g00.a<wz.p> f41577a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p<androidx.compose.runtime.a, Integer, wz.p> f41578b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Painter f41579c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f41580d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.c f41581e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f41582f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f41583g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardSubKt$CardSubCircle$2(g00.a<wz.p> aVar, p<? super androidx.compose.runtime.a, ? super Integer, wz.p> pVar, Painter painter, boolean z11, androidx.compose.ui.c cVar, int i11, int i12) {
        super(2);
        this.f41577a = aVar;
        this.f41578b = pVar;
        this.f41579c = painter;
        this.f41580d = z11;
        this.f41581e = cVar;
        this.f41582f = i11;
        this.f41583g = i12;
    }

    public final void b(androidx.compose.runtime.a aVar, int i11) {
        CardSubKt.a(this.f41577a, this.f41578b, this.f41579c, this.f41580d, this.f41581e, aVar, v0.a(this.f41582f | 1), this.f41583g);
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
        b(aVar, num.intValue());
        return wz.p.f75480a;
    }
}
